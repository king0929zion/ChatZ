package com.vladsch.flexmark.parser.core;

import com.vladsch.flexmark.ast.BlockQuote;
import com.vladsch.flexmark.ast.ListItem;
import com.vladsch.flexmark.ast.util.Parsing;
import com.vladsch.flexmark.parser.Parser;
import com.vladsch.flexmark.parser.block.AbstractBlockParser;
import com.vladsch.flexmark.parser.block.AbstractBlockParserFactory;
import com.vladsch.flexmark.parser.block.BlockContinue;
import com.vladsch.flexmark.parser.block.BlockParser;
import com.vladsch.flexmark.parser.block.BlockParserFactory;
import com.vladsch.flexmark.parser.block.BlockStart;
import com.vladsch.flexmark.parser.block.CustomBlockParserFactory;
import com.vladsch.flexmark.parser.block.MatchedBlockParser;
import com.vladsch.flexmark.parser.block.ParserState;
import com.vladsch.flexmark.parser.core.FencedCodeBlockParser;
import com.vladsch.flexmark.parser.core.HeadingParser;
import com.vladsch.flexmark.parser.core.HtmlBlockParser;
import com.vladsch.flexmark.parser.core.IndentedCodeBlockParser;
import com.vladsch.flexmark.parser.core.ListBlockParser;
import com.vladsch.flexmark.parser.core.ThematicBreakParser;
import com.vladsch.flexmark.util.ast.Block;
import com.vladsch.flexmark.util.data.DataHolder;
import com.vladsch.flexmark.util.sequence.BasedSequence;
import com.vladsch.flexmark.util.sequence.mappers.SpecialLeadInHandler;
import com.vladsch.flexmark.util.sequence.mappers.SpecialLeadInStartsWithCharsHandler;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class BlockQuoteParser extends AbstractBlockParser {
    public static final char MARKER_CHAR = '>';
    private final boolean allowLeadingSpace;
    private final BlockQuote block;
    private final boolean continueToBlankLine;
    private final boolean ignoreBlankLine;
    private final boolean interruptsItemParagraph;
    private final boolean interruptsParagraph;
    private int lastWasBlankLine;
    private final boolean withLeadSpacesInterruptsItemParagraph;

    /* loaded from: classes.dex */
    public static class BlockFactory extends AbstractBlockParserFactory {
        private final boolean allowLeadingSpace;
        private final boolean interruptsItemParagraph;
        private final boolean interruptsParagraph;
        private final boolean withLeadSpacesInterruptsItemParagraph;

        public BlockFactory(DataHolder dataHolder) {
            super(dataHolder);
            this.allowLeadingSpace = Parser.BLOCK_QUOTE_ALLOW_LEADING_SPACE.get(dataHolder).booleanValue();
            this.interruptsParagraph = Parser.BLOCK_QUOTE_INTERRUPTS_PARAGRAPH.get(dataHolder).booleanValue();
            this.interruptsItemParagraph = Parser.BLOCK_QUOTE_INTERRUPTS_ITEM_PARAGRAPH.get(dataHolder).booleanValue();
            this.withLeadSpacesInterruptsItemParagraph = Parser.BLOCK_QUOTE_WITH_LEAD_SPACES_INTERRUPTS_ITEM_PARAGRAPH.get(dataHolder).booleanValue();
        }

        @Override // com.vladsch.flexmark.parser.block.BlockParserFactory
        public BlockStart tryStart(ParserState parserState, MatchedBlockParser matchedBlockParser) {
            int nextNonSpaceIndex = parserState.getNextNonSpaceIndex();
            BlockParser blockParser = matchedBlockParser.getBlockParser();
            boolean isParagraphParser = blockParser.isParagraphParser();
            if (!BlockQuoteParser.isMarker(parserState, nextNonSpaceIndex, isParagraphParser, isParagraphParser && (blockParser.getBlock().getParent() instanceof ListItem) && blockParser.getBlock() == blockParser.getBlock().getParent().getFirstChild(), this.allowLeadingSpace, this.interruptsParagraph, this.interruptsItemParagraph, this.withLeadSpacesInterruptsItemParagraph)) {
                return BlockStart.none();
            }
            int indent = parserState.getIndent() + parserState.getColumn();
            int i6 = indent + 1;
            int i7 = nextNonSpaceIndex + 1;
            if (Parsing.isSpaceOrTab(parserState.getLine(), i7)) {
                i6 = indent + 2;
            }
            return BlockStart.of(new BlockQuoteParser(parserState.getProperties(), parserState.getLine().subSequence(nextNonSpaceIndex, i7))).atColumn(i6);
        }
    }

    /* loaded from: classes.dex */
    public static class BlockQuoteLeadInHandler {
        static final SpecialLeadInHandler HANDLER = SpecialLeadInStartsWithCharsHandler.create(BlockQuoteParser.MARKER_CHAR);
    }

    /* loaded from: classes.dex */
    public static class Factory implements CustomBlockParserFactory {
        @Override // com.vladsch.flexmark.util.dependency.Dependent
        public boolean affectsGlobalScope() {
            return false;
        }

        @Override // com.vladsch.flexmark.util.dependency.Dependent
        public Set<Class<?>> getAfterDependents() {
            return Collections.EMPTY_SET;
        }

        @Override // com.vladsch.flexmark.util.dependency.Dependent
        public Set<Class<?>> getBeforeDependents() {
            return new HashSet(Arrays.asList(HeadingParser.Factory.class, FencedCodeBlockParser.Factory.class, HtmlBlockParser.Factory.class, ThematicBreakParser.Factory.class, ListBlockParser.Factory.class, IndentedCodeBlockParser.Factory.class));
        }

        @Override // com.vladsch.flexmark.parser.block.CustomBlockParserFactory
        public SpecialLeadInHandler getLeadInHandler(DataHolder dataHolder) {
            return BlockQuoteLeadInHandler.HANDLER;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.vladsch.flexmark.parser.block.CustomBlockParserFactory, java.util.function.Function
        public BlockParserFactory apply(DataHolder dataHolder) {
            return new BlockFactory(dataHolder);
        }
    }

    public BlockQuoteParser(DataHolder dataHolder, BasedSequence basedSequence) {
        BlockQuote blockQuote = new BlockQuote();
        this.block = blockQuote;
        this.lastWasBlankLine = 0;
        blockQuote.setOpeningMarker(basedSequence);
        this.continueToBlankLine = Parser.BLOCK_QUOTE_EXTEND_TO_BLANK_LINE.get(dataHolder).booleanValue();
        this.allowLeadingSpace = Parser.BLOCK_QUOTE_ALLOW_LEADING_SPACE.get(dataHolder).booleanValue();
        this.ignoreBlankLine = Parser.BLOCK_QUOTE_IGNORE_BLANK_LINE.get(dataHolder).booleanValue();
        this.interruptsParagraph = Parser.BLOCK_QUOTE_INTERRUPTS_PARAGRAPH.get(dataHolder).booleanValue();
        this.interruptsItemParagraph = Parser.BLOCK_QUOTE_INTERRUPTS_ITEM_PARAGRAPH.get(dataHolder).booleanValue();
        this.withLeadSpacesInterruptsItemParagraph = Parser.BLOCK_QUOTE_WITH_LEAD_SPACES_INTERRUPTS_ITEM_PARAGRAPH.get(dataHolder).booleanValue();
    }

    public static boolean isMarker(ParserState parserState, int i6, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        BasedSequence line = parserState.getLine();
        if ((!z5 || z8) && i6 < line.length() && line.charAt(i6) == '>' && ((z7 || parserState.getIndent() == 0) && (!z6 || z9))) {
            if (z6 && !z10) {
                return parserState.getIndent() == 0;
            }
            if (parserState.getIndent() < parserState.getParsing().CODE_BLOCK_INDENT) {
                return true;
            }
        }
        return false;
    }

    @Override // com.vladsch.flexmark.parser.block.AbstractBlockParser, com.vladsch.flexmark.parser.block.BlockParser
    public boolean canContain(ParserState parserState, BlockParser blockParser, Block block) {
        return true;
    }

    @Override // com.vladsch.flexmark.parser.block.BlockParser
    public void closeBlock(ParserState parserState) {
        this.block.setCharsFromContent();
        if (Parser.BLANK_LINES_IN_AST.get(parserState.getProperties()).booleanValue()) {
            return;
        }
        removeBlankLines();
    }

    @Override // com.vladsch.flexmark.parser.block.AbstractBlockParser, com.vladsch.flexmark.parser.block.BlockParser
    public boolean isContainer() {
        return true;
    }

    @Override // com.vladsch.flexmark.parser.block.AbstractBlockParser, com.vladsch.flexmark.parser.block.BlockParser
    public boolean isPropagatingLastBlankLine(BlockParser blockParser) {
        return false;
    }

    @Override // com.vladsch.flexmark.parser.block.BlockParser
    public BlockContinue tryContinue(ParserState parserState) {
        ParserState parserState2;
        int nextNonSpaceIndex = parserState.getNextNonSpaceIndex();
        if (parserState.isBlank()) {
            parserState2 = parserState;
        } else {
            parserState2 = parserState;
            boolean isMarker = isMarker(parserState2, nextNonSpaceIndex, false, false, this.allowLeadingSpace, this.interruptsParagraph, this.interruptsItemParagraph, this.withLeadSpacesInterruptsItemParagraph);
            if (isMarker || (this.continueToBlankLine && this.lastWasBlankLine == 0)) {
                int indent = parserState2.getIndent() + parserState2.getColumn();
                this.lastWasBlankLine = 0;
                if (isMarker) {
                    indent = Parsing.isSpaceOrTab(parserState2.getLine(), nextNonSpaceIndex + 1) ? indent + 2 : indent + 1;
                }
                return BlockContinue.atColumn(indent);
            }
        }
        if (!this.ignoreBlankLine || !parserState2.isBlank()) {
            return BlockContinue.none();
        }
        this.lastWasBlankLine++;
        return BlockContinue.atColumn(parserState2.getIndent() + parserState2.getColumn());
    }

    @Override // com.vladsch.flexmark.parser.block.BlockParser
    public BlockQuote getBlock() {
        return this.block;
    }
}
