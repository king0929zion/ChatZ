package com.vladsch.flexmark.parser.internal;

import com.vladsch.flexmark.ast.Paragraph;
import com.vladsch.flexmark.ast.util.ClassifyingBlockTracker;
import com.vladsch.flexmark.ast.util.Parsing;
import com.vladsch.flexmark.parser.InlineParser;
import com.vladsch.flexmark.parser.InlineParserFactory;
import com.vladsch.flexmark.parser.Parser;
import com.vladsch.flexmark.parser.block.BlockContinue;
import com.vladsch.flexmark.parser.block.BlockParser;
import com.vladsch.flexmark.parser.block.BlockParserFactory;
import com.vladsch.flexmark.parser.block.BlockPreProcessor;
import com.vladsch.flexmark.parser.block.BlockPreProcessorFactory;
import com.vladsch.flexmark.parser.block.BlockStart;
import com.vladsch.flexmark.parser.block.CustomBlockParserFactory;
import com.vladsch.flexmark.parser.block.ParagraphPreProcessor;
import com.vladsch.flexmark.parser.block.ParagraphPreProcessorFactory;
import com.vladsch.flexmark.parser.block.ParserPhase;
import com.vladsch.flexmark.parser.block.ParserState;
import com.vladsch.flexmark.parser.core.BlockQuoteParser;
import com.vladsch.flexmark.parser.core.DocumentBlockParser;
import com.vladsch.flexmark.parser.core.FencedCodeBlockParser;
import com.vladsch.flexmark.parser.core.HeadingParser;
import com.vladsch.flexmark.parser.core.HtmlBlockParser;
import com.vladsch.flexmark.parser.core.IndentedCodeBlockParser;
import com.vladsch.flexmark.parser.core.ListBlockParser;
import com.vladsch.flexmark.parser.core.ParagraphParser;
import com.vladsch.flexmark.parser.core.ReferencePreProcessorFactory;
import com.vladsch.flexmark.parser.core.ThematicBreakParser;
import com.vladsch.flexmark.util.ast.BlankLine;
import com.vladsch.flexmark.util.ast.BlankLineContainer;
import com.vladsch.flexmark.util.ast.Block;
import com.vladsch.flexmark.util.ast.Document;
import com.vladsch.flexmark.util.ast.KeepTrailingBlankLineContainer;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.collection.ItemFactoryMap;
import com.vladsch.flexmark.util.collection.iteration.ReversibleIndexedIterator;
import com.vladsch.flexmark.util.collection.iteration.ReversibleIterator;
import com.vladsch.flexmark.util.data.DataHolder;
import com.vladsch.flexmark.util.data.DataKey;
import com.vladsch.flexmark.util.data.MutableDataHolder;
import com.vladsch.flexmark.util.dependency.DependencyResolver;
import com.vladsch.flexmark.util.misc.CharPredicate;
import com.vladsch.flexmark.util.sequence.BasedSequence;
import com.vladsch.flexmark.util.sequence.PrefixedSubSequence;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import java.io.BufferedReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class DocumentParser implements ParserState {
    private static final HashMap<CustomBlockParserFactory, DataKey<Boolean>> CORE_FACTORIES_DATA_KEYS;
    private static final HashMap<DataKey<Boolean>, ParagraphPreProcessorFactory> CORE_PARAGRAPH_PRE_PROCESSORS;
    public static final InlineParserFactory INLINE_PARSER_FACTORY = new Object();
    private boolean blank;
    private final boolean blankLinesInAst;
    private final List<BlockParserFactory> blockParserFactories;
    private final List<List<BlockPreProcessorFactory>> blockPreProcessorDependencies;
    private boolean columnIsInTab;
    private ParserPhase currentPhase;
    private final DocumentBlockParser documentBlockParser;
    private final InlineParser inlineParser;
    private boolean isBlankLine;
    private BasedSequence line;
    private BasedSequence lineWithEOL;
    private final Parsing myParsing;
    private final DataHolder options;
    private final List<List<ParagraphPreProcessorFactory>> paragraphPreProcessorDependencies;
    private final boolean trackDocumentLines;
    private int lineNumber = 0;
    private int lineStart = 0;
    private int lineEOLIndex = 0;
    private int lineEndIndex = 0;
    private int index = 0;
    private int column = 0;
    private int nextNonSpace = 0;
    private int nextNonSpaceColumn = 0;
    private int indent = 0;
    private final List<BasedSequence> lineSegments = new ArrayList();
    private final List<BlockParser> activeBlockParsers = new ArrayList();
    private final ClassifyingBlockTracker blockTracker = new ClassifyingBlockTracker();
    private final Map<Node, Boolean> lastLineBlank = new HashMap();

    /* loaded from: classes.dex */
    public static class ParagraphPreProcessorCache extends ItemFactoryMap<ParagraphPreProcessor, ParserState> {
        public ParagraphPreProcessorCache(ParserState parserState) {
            super(parserState);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.vladsch.flexmark.parser.InlineParserFactory] */
    static {
        HashMap<CustomBlockParserFactory, DataKey<Boolean>> hashMap = new HashMap<>();
        CORE_FACTORIES_DATA_KEYS = hashMap;
        hashMap.put(new BlockQuoteParser.Factory(), Parser.BLOCK_QUOTE_PARSER);
        hashMap.put(new HeadingParser.Factory(), Parser.HEADING_PARSER);
        hashMap.put(new FencedCodeBlockParser.Factory(), Parser.FENCED_CODE_BLOCK_PARSER);
        hashMap.put(new HtmlBlockParser.Factory(), Parser.HTML_BLOCK_PARSER);
        hashMap.put(new ThematicBreakParser.Factory(), Parser.THEMATIC_BREAK_PARSER);
        hashMap.put(new ListBlockParser.Factory(), Parser.LIST_BLOCK_PARSER);
        hashMap.put(new IndentedCodeBlockParser.Factory(), Parser.INDENTED_CODE_BLOCK_PARSER);
        HashMap<DataKey<Boolean>, ParagraphPreProcessorFactory> hashMap2 = new HashMap<>();
        CORE_PARAGRAPH_PRE_PROCESSORS = hashMap2;
        hashMap2.put(Parser.REFERENCE_PARAGRAPH_PRE_PROCESSOR, new ReferencePreProcessorFactory());
    }

    public DocumentParser(DataHolder dataHolder, List<CustomBlockParserFactory> list, List<List<ParagraphPreProcessorFactory>> list2, List<List<BlockPreProcessorFactory>> list3, InlineParser inlineParser) {
        this.options = dataHolder;
        this.myParsing = inlineParser.getParsing();
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<CustomBlockParserFactory> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().apply(dataHolder));
        }
        this.blockParserFactories = arrayList;
        this.paragraphPreProcessorDependencies = list2;
        this.blockPreProcessorDependencies = list3;
        this.inlineParser = inlineParser;
        DocumentBlockParser documentBlockParser = new DocumentBlockParser();
        this.documentBlockParser = documentBlockParser;
        activateBlockParser(documentBlockParser);
        this.currentPhase = ParserPhase.STARTING;
        this.blankLinesInAst = Parser.BLANK_LINES_IN_AST.get(dataHolder).booleanValue();
        this.trackDocumentLines = Parser.TRACK_DOCUMENT_LINES.get(dataHolder).booleanValue();
    }

    private void activateBlockParser(BlockParser blockParser) {
        this.activeBlockParsers.add(blockParser);
        if (this.blockTracker.containsKey(blockParser)) {
            return;
        }
        blockParserAdded(blockParser);
    }

    private <T extends BlockParser> T addChild(T t5) {
        while (!getActiveBlockParser().canContain(this, t5, t5.getBlock())) {
            finalize(getActiveBlockParser());
        }
        getActiveBlockParser().getBlock().appendChild(t5.getBlock());
        activateBlockParser(t5);
        return t5;
    }

    private void addLine() {
        BasedSequence subSequence = this.lineWithEOL.subSequence(this.index);
        if (this.columnIsInTab) {
            BasedSequence subSequence2 = subSequence.subSequence(1);
            int columnsToNextTabStop = Parsing.columnsToNextTabStop(this.column);
            StringBuilder sb = new StringBuilder(subSequence2.length() + columnsToNextTabStop);
            for (int i6 = 0; i6 < columnsToNextTabStop; i6++) {
                sb.append(SequenceUtils.SPC);
            }
            subSequence = PrefixedSubSequence.prefixOf(sb.toString(), subSequence2);
        }
        getActiveBlockParser().addLine(this, subSequence);
    }

    private void advance() {
        if (this.line.charAt(this.index) != '\t') {
            this.index++;
            this.column++;
        } else {
            this.index++;
            int i6 = this.column;
            this.column = Parsing.columnsToNextTabStop(i6) + i6;
        }
    }

    private void breakOutOfLists(List<BlockParser> list) {
        int i6 = -1;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).breakOutOnDoubleBlankLine()) {
                i6 = size;
            }
        }
        if (i6 != -1) {
            finalizeBlocks(list.subList(i6, list.size()));
        }
    }

    public static List<CustomBlockParserFactory> calculateBlockParserFactories(DataHolder dataHolder, List<CustomBlockParserFactory> list) {
        ArrayList arrayList = new ArrayList(list);
        for (Map.Entry<CustomBlockParserFactory, DataKey<Boolean>> entry : CORE_FACTORIES_DATA_KEYS.entrySet()) {
            if (entry.getValue().get(dataHolder).booleanValue()) {
                arrayList.add(entry.getKey());
            }
        }
        return DependencyResolver.resolveFlatDependencies(arrayList, null, null);
    }

    public static List<List<BlockPreProcessorFactory>> calculateBlockPreProcessors(DataHolder dataHolder, List<BlockPreProcessorFactory> list) {
        return DependencyResolver.resolveDependencies(list, null, null);
    }

    public static List<List<ParagraphPreProcessorFactory>> calculateParagraphPreProcessors(DataHolder dataHolder, List<ParagraphPreProcessorFactory> list, InlineParserFactory inlineParserFactory) {
        ArrayList arrayList = new ArrayList(list);
        if (inlineParserFactory == INLINE_PARSER_FACTORY) {
            for (DataKey<Boolean> dataKey : CORE_PARAGRAPH_PRE_PROCESSORS.keySet()) {
                if (dataKey.get(dataHolder).booleanValue()) {
                    arrayList.add(CORE_PARAGRAPH_PRE_PROCESSORS.get(dataKey));
                }
            }
        }
        return DependencyResolver.resolveDependencies(arrayList, null, null);
    }

    private void deactivateBlockParser() {
        this.activeBlockParsers.remove(r0.size() - 1);
    }

    private void finalize(BlockParser blockParser) {
        if (getActiveBlockParser() == blockParser) {
            deactivateBlockParser();
        }
        Block block = blockParser.getBlock();
        if (block.getParent() != null) {
            Node lastChild = block.getLastChild();
            if ((lastChild instanceof BlankLine) && ((BlankLine) lastChild).getClaimedBlankLine() != block) {
                block.insertChainAfter(lastChild.getFirstInChain());
                block.setCharsFromContentOnly();
            }
        }
        blockParser.closeBlock(this);
        blockParser.finalizeClosedBlock();
        while (true) {
            Node next = block.getNext();
            if (!(next instanceof BlankLine) || next.getEndOffset() > block.getEndOffset()) {
                return;
            } else {
                next.unlink();
            }
        }
    }

    private Document finalizeAndProcess() {
        finalizeBlocks(this.activeBlockParsers);
        this.currentPhase = ParserPhase.PRE_PROCESS_PARAGRAPHS;
        preProcessParagraphs();
        this.currentPhase = ParserPhase.PRE_PROCESS_BLOCKS;
        preProcessBlocks();
        this.currentPhase = ParserPhase.PARSE_INLINES;
        processInlines();
        this.currentPhase = ParserPhase.DONE;
        Document block = this.documentBlockParser.getBlock();
        this.inlineParser.finalizeDocument(block);
        return block;
    }

    private boolean finalizeBlocks(List<BlockParser> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            finalize(list.get(size));
        }
        return true;
    }

    private BlockStartImpl findBlockStart(BlockParser blockParser) {
        MatchedBlockParserImpl matchedBlockParserImpl = new MatchedBlockParserImpl(blockParser);
        for (BlockParserFactory blockParserFactory : this.blockParserFactories) {
            if (blockParser.canInterruptBy(blockParserFactory)) {
                BlockStart tryStart = blockParserFactory.tryStart(this, matchedBlockParserImpl);
                if (tryStart instanceof BlockStartImpl) {
                    return (BlockStartImpl) tryStart;
                }
            }
        }
        return null;
    }

    private void findNextNonSpace() {
        int i6 = this.index;
        int i7 = this.column;
        this.blank = true;
        while (true) {
            if (i6 >= this.line.length()) {
                break;
            }
            char charAt = this.line.charAt(i6);
            if (charAt == '\t') {
                i6++;
                i7 += 4 - (i7 % 4);
            } else if (charAt != ' ') {
                this.blank = false;
                break;
            } else {
                i6++;
                i7++;
            }
        }
        this.nextNonSpace = i6;
        this.nextNonSpaceColumn = i7;
        this.indent = i7 - this.column;
    }

    private void incorporateLine(BasedSequence basedSequence) {
        BlankLine blankLine;
        this.line = basedSequence;
        this.index = 0;
        this.column = 0;
        this.columnIsInTab = false;
        if (this.trackDocumentLines) {
            this.lineSegments.add(this.lineWithEOL);
        }
        findNextNonSpace();
        BlockParser blockParser = null;
        if (this.blank && this.blankLinesInAst) {
            blankLine = new BlankLine(this.lineWithEOL);
            this.documentBlockParser.getBlock().appendChild(blankLine);
        } else {
            blankLine = null;
        }
        List<BlockParser> list = this.activeBlockParsers;
        int i6 = 1;
        for (BlockParser blockParser2 : list.subList(1, list.size())) {
            boolean z5 = this.blank;
            findNextNonSpace();
            if (this.blank && this.blankLinesInAst) {
                if (blankLine == null) {
                    blankLine = new BlankLine(this.lineWithEOL);
                    this.documentBlockParser.getBlock().appendChild(blankLine);
                }
                if (!z5 && (blockParser2.getBlock() instanceof BlankLineContainer)) {
                    blankLine.setClaimedBlankLine(blockParser2.getBlock());
                }
            }
            this.isBlankLine = z5;
            BlockContinue tryContinue = blockParser2.tryContinue(this);
            if (!(tryContinue instanceof BlockContinueImpl)) {
                break;
            }
            BlockContinueImpl blockContinueImpl = (BlockContinueImpl) tryContinue;
            if (blockContinueImpl.isFinalize()) {
                finalize(blockParser2);
                return;
            }
            if (blockContinueImpl.getNewIndex() != -1) {
                setNewIndex(blockContinueImpl.getNewIndex());
                if (!this.blank && (blockParser2.getBlock() instanceof BlankLineContainer)) {
                    findNextNonSpace();
                    if (this.blank) {
                        blankLine = new BlankLine(this.lineWithEOL, blockParser2.getBlock());
                        blockParser2.getBlock().appendChild(blankLine);
                    }
                }
            } else if (blockContinueImpl.getNewColumn() != -1) {
                setNewColumn(blockContinueImpl.getNewColumn());
                if (!this.blank && (blockParser2.getBlock() instanceof BlankLineContainer)) {
                    findNextNonSpace();
                    if (this.blank) {
                        blankLine = new BlankLine(this.lineWithEOL, blockParser2.getBlock());
                        blockParser2.getBlock().appendChild(blankLine);
                    }
                }
            }
            i6++;
            if (blankLine != null && (this.blankLinesInAst || blankLine.getClaimedBlankLine() == blockParser2.getBlock())) {
                if (blockParser2.getBlock() instanceof BlankLineContainer) {
                    blockParser2.getBlock().appendChild(blankLine);
                }
            }
        }
        List<BlockParser> list2 = this.activeBlockParsers;
        ArrayList arrayList = new ArrayList(list2.subList(i6, list2.size()));
        BlockParser blockParser3 = this.activeBlockParsers.get(i6 - 1);
        boolean isEmpty = arrayList.isEmpty();
        if (this.blank && isLastLineBlank(blockParser3.getBlock())) {
            breakOutOfLists(new ArrayList<>(this.activeBlockParsers.subList(0, i6)));
        }
        boolean z6 = blockParser3.isInterruptible() || blockParser3.isContainer();
        BlockParser blockParser4 = blockParser3;
        while (true) {
            if (!z6) {
                break;
            }
            boolean z7 = this.blank;
            findNextNonSpace();
            boolean z8 = this.blank;
            if (z8 && !z7) {
                blockParser = blockParser4;
            }
            if (z8 || (this.indent < this.myParsing.CODE_BLOCK_INDENT && Parsing.isLetter(this.line, this.nextNonSpace))) {
                break;
            }
            BlockStartImpl findBlockStart = findBlockStart(blockParser4);
            if (findBlockStart != null) {
                if (!isEmpty) {
                    finalizeBlocks(arrayList);
                    isEmpty = true;
                }
                if (findBlockStart.getNewIndex() != -1) {
                    setNewIndex(findBlockStart.getNewIndex());
                } else if (findBlockStart.getNewColumn() != -1) {
                    setNewColumn(findBlockStart.getNewColumn());
                }
                if (findBlockStart.isReplaceActiveBlockParser()) {
                    removeActiveBlockParser();
                }
                for (BlockParser blockParser5 : findBlockStart.getBlockParsers()) {
                    blockParser4 = addChild(blockParser5);
                    z6 = blockParser5.isContainer();
                }
            } else if (!blockParser4.isRawText() || !blockParser4.isInterruptible()) {
                setNewIndex(this.nextNonSpace);
            }
        }
        setNewIndex(this.nextNonSpace);
        if (!isEmpty && !this.blank && getActiveBlockParser().isParagraphParser()) {
            addLine();
            return;
        }
        if (!isEmpty) {
            finalizeBlocks(arrayList);
        }
        propagateLastLineBlank(blockParser4, blockParser3);
        if (this.blank && (blockParser4.getBlock() instanceof KeepTrailingBlankLineContainer)) {
            if (blankLine != null) {
                blockParser4.getBlock().appendChild(blankLine);
            } else if (blockParser4.isContainer() && blockParser == blockParser4) {
                blockParser4.getBlock().appendChild(new BlankLine(this.lineWithEOL, blockParser4.getBlock()));
            }
        }
        if (!blockParser4.isContainer()) {
            addLine();
        } else {
            if (this.blank) {
                return;
            }
            addChild(new ParagraphParser());
            addLine();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void preProcessBlocks() {
        HashSet hashSet = new HashSet();
        Iterator<List<BlockPreProcessorFactory>> it = this.blockPreProcessorDependencies.iterator();
        while (it.hasNext()) {
            Iterator<BlockPreProcessorFactory> it2 = it.next().iterator();
            while (it2.hasNext()) {
                hashSet.addAll(it2.next().getBlockTypes());
            }
        }
        if (this.blockTracker.getNodeClassifier().categoriesBitSet(hashSet).isEmpty()) {
            return;
        }
        Iterator<List<BlockPreProcessorFactory>> it3 = this.blockPreProcessorDependencies.iterator();
        while (it3.hasNext()) {
            for (BlockPreProcessorFactory blockPreProcessorFactory : it3.next()) {
                Iterable categoryItems = this.blockTracker.getNodeClassifier().getCategoryItems(Block.class, blockPreProcessorFactory.getBlockTypes());
                BlockPreProcessor apply = blockPreProcessorFactory.apply((ParserState) this);
                ReversibleIterator it4 = categoryItems.iterator();
                while (it4.hasNext()) {
                    apply.preProcess(this, (Block) it4.next());
                }
            }
        }
    }

    private void preProcessParagraph(Paragraph paragraph, List<ParagraphPreProcessorFactory> list, ParagraphPreProcessorCache paragraphPreProcessorCache) {
        do {
            Iterator<ParagraphPreProcessorFactory> it = list.iterator();
            boolean z5 = false;
            while (it.hasNext()) {
                int preProcessBlock = paragraphPreProcessorCache.getItem(it.next()).preProcessBlock(paragraph, this);
                if (preProcessBlock > 0) {
                    BasedSequence chars = paragraph.getChars();
                    BasedSequence subSequence = chars.subSequence(chars.countLeading(CharPredicate.WHITESPACE, preProcessBlock, chars.length()) + preProcessBlock);
                    if (subSequence.isBlank()) {
                        paragraph.unlink();
                        blockRemoved(paragraph);
                        return;
                    }
                    int lineCount = paragraph.getLineCount();
                    int i6 = 0;
                    while (i6 < lineCount && paragraph.getLineChars(i6).getEndOffset() <= subSequence.getStartOffset()) {
                        i6++;
                    }
                    if (i6 >= lineCount) {
                        paragraph.unlink();
                        blockRemoved(paragraph);
                        return;
                    }
                    if (paragraph.getLineChars(i6).getEndOffset() == subSequence.getStartOffset()) {
                        paragraph.setContent(paragraph, i6, lineCount);
                    } else {
                        int i7 = lineCount - i6;
                        ArrayList arrayList = new ArrayList(i7);
                        arrayList.addAll(paragraph.getContentLines().subList(i6, lineCount));
                        int startOffset = subSequence.getStartOffset() - ((BasedSequence) arrayList.get(0)).getStartOffset();
                        if (startOffset > 0 && startOffset < ((BasedSequence) arrayList.get(0)).length()) {
                            arrayList.set(0, ((BasedSequence) arrayList.get(0)).subSequence(startOffset));
                        }
                        int[] iArr = new int[i7];
                        System.arraycopy(paragraph.getLineIndents(), i6, iArr, 0, i7);
                        paragraph.setContentLines(arrayList);
                        paragraph.setLineIndents(iArr);
                        paragraph.setChars(subSequence);
                    }
                    z5 = true;
                }
            }
            if (!z5) {
                return;
            }
        } while (list.size() >= 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void preProcessParagraphs() {
        if (this.blockTracker.getNodeClassifier().containsCategory(Paragraph.class)) {
            ParagraphPreProcessorCache paragraphPreProcessorCache = new ParagraphPreProcessorCache(this);
            for (List<ParagraphPreProcessorFactory> list : this.paragraphPreProcessorDependencies) {
                ReversibleIterator it = this.blockTracker.getNodeClassifier().getCategoryItems(Paragraph.class, Paragraph.class).iterator();
                while (it.hasNext()) {
                    preProcessParagraph((Paragraph) it.next(), list, paragraphPreProcessorCache);
                }
            }
        }
    }

    private void processInlines() {
        ReversibleIndexedIterator<BlockParser> it = this.blockTracker.allBlockParsers().iterator();
        while (it.hasNext()) {
            it.next().parseInlines(this.inlineParser);
        }
    }

    private void propagateLastLineBlank(BlockParser blockParser, BlockParser blockParser2) {
        Node lastChild;
        if (this.blank && (lastChild = blockParser.getBlock().getLastChild()) != null) {
            setLastLineBlank(lastChild, true);
        }
        boolean z5 = this.blank && blockParser.isPropagatingLastBlankLine(blockParser2);
        for (Node block = blockParser.getBlock(); block != null; block = block.getParent()) {
            setLastLineBlank(block, z5);
        }
    }

    private void removeActiveBlockParser() {
        BlockParser activeBlockParser = getActiveBlockParser();
        deactivateBlockParser();
        blockParserRemoved(activeBlockParser);
        activeBlockParser.getBlock().unlink();
    }

    private void setLastLineBlank(Node node, boolean z5) {
        this.lastLineBlank.put(node, Boolean.valueOf(z5));
    }

    private void setNewColumn(int i6) {
        int i7 = this.nextNonSpaceColumn;
        if (i6 >= i7) {
            this.index = this.nextNonSpace;
            this.column = i7;
        }
        while (this.column < i6 && this.index != this.line.length()) {
            advance();
        }
        if (this.column <= i6) {
            this.columnIsInTab = false;
            return;
        }
        this.index--;
        this.column = i6;
        this.columnIsInTab = true;
    }

    private void setNewIndex(int i6) {
        int i7 = this.nextNonSpace;
        if (i6 >= i7) {
            this.index = i7;
            this.column = this.nextNonSpaceColumn;
        }
        while (true) {
            int i8 = this.index;
            if (i8 >= i6 || i8 == this.line.length()) {
                break;
            } else {
                advance();
            }
        }
        this.columnIsInTab = false;
    }

    @Override // com.vladsch.flexmark.util.ast.BlockTracker
    public void blockAdded(Block block) {
        this.blockTracker.blockAdded(block);
    }

    @Override // com.vladsch.flexmark.util.ast.BlockTracker
    public void blockAddedWithChildren(Block block) {
        this.blockTracker.blockAddedWithChildren(block);
    }

    @Override // com.vladsch.flexmark.util.ast.BlockTracker
    public void blockAddedWithDescendants(Block block) {
        this.blockTracker.blockAddedWithDescendants(block);
    }

    @Override // com.vladsch.flexmark.parser.block.BlockParserTracker
    public void blockParserAdded(BlockParser blockParser) {
        this.blockTracker.blockParserAdded(blockParser);
    }

    @Override // com.vladsch.flexmark.parser.block.BlockParserTracker
    public void blockParserRemoved(BlockParser blockParser) {
        this.blockTracker.blockParserRemoved(blockParser);
    }

    @Override // com.vladsch.flexmark.util.ast.BlockTracker
    public void blockRemoved(Block block) {
        this.blockTracker.blockRemoved(block);
    }

    @Override // com.vladsch.flexmark.util.ast.BlockTracker
    public void blockRemovedWithChildren(Block block) {
        this.blockTracker.blockRemovedWithChildren(block);
    }

    @Override // com.vladsch.flexmark.util.ast.BlockTracker
    public void blockRemovedWithDescendants(Block block) {
        this.blockTracker.blockRemovedWithDescendants(block);
    }

    @Override // com.vladsch.flexmark.parser.block.ParserState
    public boolean endsWithBlankLine(Node node) {
        while (node != null) {
            if (isLastLineBlank(node)) {
                return true;
            }
            node = node.getLastBlankLineChild();
        }
        return false;
    }

    @Override // com.vladsch.flexmark.parser.block.ParserState
    public BlockParser getActiveBlockParser() {
        return this.activeBlockParsers.get(r0.size() - 1);
    }

    @Override // com.vladsch.flexmark.parser.block.ParserState
    public List<BlockParser> getActiveBlockParsers() {
        return this.activeBlockParsers;
    }

    @Override // com.vladsch.flexmark.parser.block.ParserState
    public int getColumn() {
        return this.column;
    }

    @Override // com.vladsch.flexmark.parser.block.ParserState
    public int getIndent() {
        return this.indent;
    }

    @Override // com.vladsch.flexmark.parser.block.ParserState
    public int getIndex() {
        return this.index;
    }

    @Override // com.vladsch.flexmark.parser.block.ParserState
    public InlineParser getInlineParser() {
        return this.inlineParser;
    }

    @Override // com.vladsch.flexmark.parser.block.ParserState
    public BasedSequence getLine() {
        return this.line;
    }

    @Override // com.vladsch.flexmark.parser.block.ParserState
    public int getLineEndIndex() {
        return this.lineEndIndex;
    }

    @Override // com.vladsch.flexmark.parser.block.ParserState
    public int getLineEolLength() {
        return this.lineEndIndex - this.lineEOLIndex;
    }

    @Override // com.vladsch.flexmark.parser.block.ParserState
    public int getLineNumber() {
        return this.lineNumber;
    }

    @Override // com.vladsch.flexmark.parser.block.ParserState
    public List<BasedSequence> getLineSegments() {
        return this.lineSegments;
    }

    @Override // com.vladsch.flexmark.parser.block.ParserState
    public int getLineStart() {
        return this.lineStart;
    }

    @Override // com.vladsch.flexmark.parser.block.ParserState
    public BasedSequence getLineWithEOL() {
        return this.lineWithEOL;
    }

    @Override // com.vladsch.flexmark.parser.block.ParserState
    public int getNextNonSpaceIndex() {
        return this.nextNonSpace;
    }

    @Override // com.vladsch.flexmark.parser.block.ParserState
    public ParserPhase getParserPhase() {
        return this.currentPhase;
    }

    @Override // com.vladsch.flexmark.parser.block.ParserState
    public Parsing getParsing() {
        return this.myParsing;
    }

    @Override // com.vladsch.flexmark.parser.block.ParserState
    public MutableDataHolder getProperties() {
        return this.documentBlockParser.getBlock();
    }

    @Override // com.vladsch.flexmark.parser.block.ParserState
    public boolean isBlank() {
        return this.blank;
    }

    @Override // com.vladsch.flexmark.parser.block.ParserState
    public boolean isBlankLine() {
        return this.isBlankLine;
    }

    @Override // com.vladsch.flexmark.parser.block.ParserState
    public boolean isLastLineBlank(Node node) {
        Boolean bool = this.lastLineBlank.get(node);
        return bool != null && bool.booleanValue();
    }

    public Document parse(CharSequence charSequence) {
        BasedSequence of = BasedSequence.of(charSequence);
        int i6 = 0;
        this.lineNumber = 0;
        this.documentBlockParser.initializeDocument(this.options, of);
        this.inlineParser.initializeDocument(this.documentBlockParser.getBlock());
        this.currentPhase = ParserPhase.PARSE_BLOCKS;
        while (true) {
            int findLineBreak = Parsing.findLineBreak(of, i6);
            if (findLineBreak == -1) {
                break;
            }
            BasedSequence subSequence = of.subSequence(i6, findLineBreak);
            int i7 = findLineBreak + 1;
            if (i7 < of.length() && of.charAt(findLineBreak) == '\r' && of.charAt(i7) == '\n') {
                i7 = findLineBreak + 2;
            }
            this.lineWithEOL = of.subSequence(i6, i7);
            this.lineStart = i6;
            this.lineEOLIndex = findLineBreak;
            this.lineEndIndex = i7;
            incorporateLine(subSequence);
            this.lineNumber++;
            i6 = i7;
        }
        if (of.length() > 0 && (i6 == 0 || i6 < of.length())) {
            this.lineWithEOL = of.subSequence(i6, of.length());
            this.lineStart = i6;
            int length = of.length();
            this.lineEOLIndex = length;
            this.lineEndIndex = length;
            incorporateLine(this.lineWithEOL);
            this.lineNumber++;
        }
        return finalizeAndProcess();
    }

    @Override // com.vladsch.flexmark.parser.block.ParserState
    public BlockParser getActiveBlockParser(Block block) {
        BlockParser key = this.blockTracker.getKey(block);
        if (key == null || key.isClosed()) {
            return null;
        }
        return key;
    }

    public Document parse(Reader reader) {
        BufferedReader bufferedReader;
        if (reader instanceof BufferedReader) {
            bufferedReader = (BufferedReader) reader;
        } else {
            bufferedReader = new BufferedReader(reader);
        }
        StringBuilder sb = new StringBuilder();
        char[] cArr = new char[16384];
        while (true) {
            int read = bufferedReader.read(cArr);
            if (read < 0) {
                return parse(BasedSequence.of(sb.toString()));
            }
            sb.append(cArr, 0, read);
        }
    }
}
