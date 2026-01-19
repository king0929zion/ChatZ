package com.vladsch.flexmark.util.format;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.util.data.DataHolder;
import com.vladsch.flexmark.util.misc.CharPredicate;
import com.vladsch.flexmark.util.sequence.BasedSequence;
import com.vladsch.flexmark.util.sequence.Range;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import com.vladsch.flexmark.util.sequence.builder.SequenceBuilder;
import com.vladsch.flexmark.util.sequence.builder.tree.BasedOffsetTracker;
import com.vladsch.flexmark.util.sequence.mappers.SpecialLeadInHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public class MarkdownParagraph {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final List<SpecialLeadInHandler> EMPTY_LEAD_IN_HANDLERS;
    public static final List<TrackedOffset> EMPTY_OFFSET_LIST;
    private static final char MARKDOWN_START_LINE_CHAR = 8232;
    final BasedSequence altSeq;
    final BasedSequence baseSeq;
    final CharWidthProvider charWidthProvider;
    boolean escapeSpecialLeadInChars;
    private BasedSequence firstIndent;
    private int firstWidthOffset;
    private BasedSequence indent;
    boolean keepHardLineBreaks;
    boolean keepSoftLineBreaks;
    List<? extends SpecialLeadInHandler> leadInHandlers;
    DataHolder options;
    boolean restoreTrackedSpaces;
    private List<TrackedOffset> trackedOffsets;
    private boolean trackedOffsetsSorted;
    boolean unEscapeSpecialLeadInChars;
    int width;

    /* renamed from: com.vladsch.flexmark.util.format.MarkdownParagraph$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$vladsch$flexmark$util$format$MarkdownParagraph$TextType;

        static {
            int[] iArr = new int[TextType.values().length];
            $SwitchMap$com$vladsch$flexmark$util$format$MarkdownParagraph$TextType = iArr;
            try {
                iArr[TextType.SPACE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$vladsch$flexmark$util$format$MarkdownParagraph$TextType[TextType.WORD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$vladsch$flexmark$util$format$MarkdownParagraph$TextType[TextType.MARKDOWN_START_LINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$vladsch$flexmark$util$format$MarkdownParagraph$TextType[TextType.MARKDOWN_BREAK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$vladsch$flexmark$util$format$MarkdownParagraph$TextType[TextType.BREAK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class TextTokenizer {
        private final CharSequence chars;
        private final int maxIndex;
        private int index = 0;
        private int lastPos = 0;
        private boolean isInWord = false;
        private boolean isFirstNonBlank = true;
        private int lastConsecutiveSpaces = 0;
        private Token token = null;

        public TextTokenizer(CharSequence charSequence) {
            this.chars = charSequence;
            this.maxIndex = charSequence.length();
            reset();
        }

        public List<Token> asList() {
            ArrayList arrayList = new ArrayList();
            reset();
            while (true) {
                Token token = this.token;
                if (token == null) {
                    return arrayList;
                }
                arrayList.add(token);
                next();
            }
        }

        public Token getToken() {
            return this.token;
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x006c, code lost:
        
            r0 = r8.lastConsecutiveSpaces;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x006f, code lost:
        
            if (r0 < 2) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
        
            r1 = com.vladsch.flexmark.util.format.MarkdownParagraph.TextType.MARKDOWN_BREAK;
            r3 = r8.index;
            r8.token = com.vladsch.flexmark.util.format.MarkdownParagraph.Token.of(r1, r3 - r0, r3 + 1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x008b, code lost:
        
            r0 = r8.index;
            r8.lastPos = r0 + 1;
            r8.lastConsecutiveSpaces = 0;
            r8.isFirstNonBlank = true;
            r8.index = r0 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x007f, code lost:
        
            r0 = com.vladsch.flexmark.util.format.MarkdownParagraph.TextType.BREAK;
            r1 = r8.index;
            r8.token = com.vladsch.flexmark.util.format.MarkdownParagraph.Token.of(r0, r1, r1 + 1);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void next() {
            /*
                Method dump skipped, instructions count: 232
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.vladsch.flexmark.util.format.MarkdownParagraph.TextTokenizer.next():void");
        }

        public void reset() {
            this.index = 0;
            this.lastPos = 0;
            this.isInWord = false;
            this.token = null;
            this.lastConsecutiveSpaces = 0;
            this.isFirstNonBlank = true;
            next();
        }
    }

    /* loaded from: classes.dex */
    public enum TextType {
        WORD,
        SPACE,
        BREAK,
        MARKDOWN_BREAK,
        MARKDOWN_START_LINE
    }

    /* loaded from: classes.dex */
    public static class Token {
        public final boolean isFirstWord;
        public final Range range;
        public final TextType type;

        private Token(TextType textType, Range range, boolean z5) {
            this.type = textType;
            this.range = range;
            this.isFirstWord = z5;
        }

        public static Token of(TextType textType, Range range) {
            return new Token(textType, range, false);
        }

        public BasedSequence subSequence(BasedSequence basedSequence) {
            return this.range.basedSubSequence(basedSequence);
        }

        public String toString() {
            return "token: " + this.type + SequenceUtils.SPACE + this.range + (this.isFirstWord ? " isFirst" : FlexmarkHtmlConverter.DEFAULT_NODE);
        }

        public static Token of(TextType textType, int i6, int i7) {
            return new Token(textType, Range.of(i6, i7), false);
        }

        public CharSequence subSequence(CharSequence charSequence) {
            return this.range.charSubSequence(charSequence);
        }

        public static Token of(TextType textType, Range range, boolean z5) {
            return new Token(textType, range, z5);
        }

        public static Token of(TextType textType, int i6, int i7, boolean z5) {
            return new Token(textType, Range.of(i6, i7), z5);
        }
    }

    static {
        List list = Collections.EMPTY_LIST;
        EMPTY_LEAD_IN_HANDLERS = list;
        EMPTY_OFFSET_LIST = list;
    }

    public MarkdownParagraph(CharSequence charSequence) {
        this(BasedSequence.of(charSequence));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$addTrackedOffset$0(TrackedOffset trackedOffset, TrackedOffset trackedOffset2) {
        return trackedOffset2.getOffset() == trackedOffset.getOffset();
    }

    private List<TrackedOffset> sortedTrackedOffsets() {
        if (!this.trackedOffsetsSorted) {
            this.trackedOffsets.sort(Comparator.comparing(new com.vladsch.flexmark.ast.util.g(9)));
            this.trackedOffsetsSorted = true;
        }
        return this.trackedOffsets;
    }

    public void addTrackedOffset(final TrackedOffset trackedOffset) {
        if (this.trackedOffsets == EMPTY_OFFSET_LIST) {
            this.trackedOffsets = new ArrayList();
        }
        this.trackedOffsets.removeIf(new Predicate() { // from class: com.vladsch.flexmark.util.format.a
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean lambda$addTrackedOffset$0;
                lambda$addTrackedOffset$0 = MarkdownParagraph.lambda$addTrackedOffset$0(TrackedOffset.this, (TrackedOffset) obj);
                return lambda$addTrackedOffset$0;
            }
        });
        this.trackedOffsets.add(trackedOffset);
        this.trackedOffsetsSorted = false;
    }

    public CharWidthProvider getCharWidthProvider() {
        return this.charWidthProvider;
    }

    public BasedSequence getChars() {
        return this.baseSeq;
    }

    public Range getContinuationStartSplice(int i6, boolean z5, boolean z6) {
        BasedSequence baseSequence = this.altSeq.getBaseSequence();
        if (z5 && z6) {
            BasedOffsetTracker create = BasedOffsetTracker.create(this.altSeq);
            int startOfLine = baseSequence.startOfLine(i6);
            if (startOfLine > this.altSeq.getStartOffset() && !baseSequence.isCharAt(i6, CharPredicate.SPACE_TAB_NBSP_LINE_SEP)) {
                CharPredicate charPredicate = CharPredicate.SPACE_TAB_NBSP_EOL;
                if (baseSequence.lastIndexOfAnyNot(charPredicate, i6 - 1) < startOfLine) {
                    int i7 = create.getOffsetInfo(i6, true).endIndex;
                    return Range.of(this.altSeq.lastIndexOfAnyNot(charPredicate, i7 - 1) + 1, i7);
                }
            }
        }
        return Range.NULL;
    }

    public CharSequence getFirstIndent() {
        return this.firstIndent;
    }

    public int getFirstWidth() {
        int i6 = this.width;
        if (i6 == 0) {
            return 0;
        }
        return Math.max(0, i6 + this.firstWidthOffset);
    }

    public int getFirstWidthOffset() {
        return this.firstWidthOffset;
    }

    public CharSequence getIndent() {
        return this.indent;
    }

    public boolean getKeepHardBreaks() {
        return this.keepHardLineBreaks;
    }

    public boolean getKeepSoftBreaks() {
        return this.keepSoftLineBreaks;
    }

    public List<? extends SpecialLeadInHandler> getLeadInHandlers() {
        return this.leadInHandlers;
    }

    public DataHolder getOptions() {
        return this.options;
    }

    public TrackedOffset getTrackedOffset(int i6) {
        sortedTrackedOffsets();
        for (TrackedOffset trackedOffset : this.trackedOffsets) {
            if (trackedOffset.getOffset() == i6) {
                return trackedOffset;
            }
            if (trackedOffset.getOffset() > i6) {
                return null;
            }
        }
        return null;
    }

    public List<TrackedOffset> getTrackedOffsets() {
        return sortedTrackedOffsets();
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isEscapeSpecialLeadIn() {
        return this.escapeSpecialLeadInChars;
    }

    public boolean isRestoreTrackedSpaces() {
        return this.restoreTrackedSpaces;
    }

    public boolean isUnEscapeSpecialLeadIn() {
        return this.unEscapeSpecialLeadInChars;
    }

    public BasedSequence resolveTrackedOffsets(BasedSequence basedSequence, BasedSequence basedSequence2) {
        BasedOffsetTracker create = BasedOffsetTracker.create(basedSequence2);
        int size = this.trackedOffsets.size();
        while (true) {
            int i6 = size - 1;
            if (size <= 0) {
                return basedSequence2;
            }
            TrackedOffset trackedOffset = this.trackedOffsets.get(i6);
            int offset = trackedOffset.getOffset();
            CharPredicate charPredicate = CharPredicate.WHITESPACE_NBSP;
            boolean isBaseCharAt = basedSequence.isBaseCharAt(offset, charPredicate);
            if (isBaseCharAt) {
                int i7 = offset - 1;
                if (!basedSequence.isBaseCharAt(i7, charPredicate)) {
                    trackedOffset.setIndex(create.getOffsetInfo(i7, false).endIndex);
                    size = i6;
                }
            }
            if (isBaseCharAt || !basedSequence.isBaseCharAt(offset + 1, charPredicate)) {
                trackedOffset.setIndex(create.getOffsetInfo(offset, true).endIndex);
            } else {
                trackedOffset.setIndex(create.getOffsetInfo(offset, false).startIndex);
            }
            size = i6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0333 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x043d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.vladsch.flexmark.util.sequence.BasedSequence resolveTrackedOffsetsEdit(com.vladsch.flexmark.util.sequence.BasedSequence r29, com.vladsch.flexmark.util.sequence.BasedSequence r30, com.vladsch.flexmark.util.sequence.BasedSequence r31) {
        /*
            Method dump skipped, instructions count: 1129
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vladsch.flexmark.util.format.MarkdownParagraph.resolveTrackedOffsetsEdit(com.vladsch.flexmark.util.sequence.BasedSequence, com.vladsch.flexmark.util.sequence.BasedSequence, com.vladsch.flexmark.util.sequence.BasedSequence):com.vladsch.flexmark.util.sequence.BasedSequence");
    }

    public void setEscapeSpecialLeadIn(boolean z5) {
        this.escapeSpecialLeadInChars = z5;
    }

    public void setFirstIndent(CharSequence charSequence) {
        this.firstIndent = BasedSequence.of(charSequence);
    }

    public void setFirstWidthOffset(int i6) {
        this.firstWidthOffset = i6;
    }

    public void setIndent(CharSequence charSequence) {
        this.indent = BasedSequence.of(charSequence);
        if (this.firstIndent.isNull()) {
            this.firstIndent = this.indent;
        }
    }

    public void setKeepHardBreaks(boolean z5) {
        this.keepHardLineBreaks = z5;
    }

    public void setKeepSoftBreaks(boolean z5) {
        this.keepSoftLineBreaks = z5;
    }

    public void setLeadInHandlers(List<? extends SpecialLeadInHandler> list) {
        this.leadInHandlers = list;
    }

    public void setOptions(DataHolder dataHolder) {
        this.options = dataHolder;
    }

    public void setRestoreTrackedSpaces(boolean z5) {
        this.restoreTrackedSpaces = z5;
    }

    public void setUnEscapeSpecialLeadIn(boolean z5) {
        this.unEscapeSpecialLeadInChars = z5;
    }

    public void setWidth(int i6) {
        this.width = Math.max(0, i6);
    }

    public BasedSequence wrapText() {
        if (getFirstWidth() <= 0) {
            return this.baseSeq;
        }
        if (this.trackedOffsets.isEmpty()) {
            return wrapTextNotTracked();
        }
        sortedTrackedOffsets();
        BasedSequence basedSequence = this.baseSeq;
        BasedSequence basedSequence2 = this.altSeq;
        Range range = Range.NULL;
        int size = this.trackedOffsets.size();
        while (true) {
            int i6 = size - 1;
            if (size <= 0) {
                break;
            }
            TrackedOffset trackedOffset = this.trackedOffsets.get(i6);
            if (range.isEmpty() || !range.contains(trackedOffset.getOffset())) {
                range = getContinuationStartSplice(trackedOffset.getOffset(), trackedOffset.isAfterSpaceEdit(), trackedOffset.isAfterDelete());
                if (range.isNotEmpty()) {
                    trackedOffset.setSpliced(true);
                    basedSequence = basedSequence.delete(range.getStart(), range.getEnd());
                    basedSequence2 = basedSequence2.delete(range.getStart(), range.getEnd());
                }
            }
            size = i6;
        }
        BasedSequence wrapText = new LeftAlignedWrapping(basedSequence).wrapText();
        if (!this.restoreTrackedSpaces) {
            return resolveTrackedOffsets(this.baseSeq, wrapText);
        }
        if (this.indent.isNotEmpty() || this.firstIndent.isNotEmpty()) {
            throw new IllegalStateException("restoreTrackedSpaces is not supported with indentation applied by MarkdownParagraph");
        }
        return resolveTrackedOffsetsEdit(basedSequence, basedSequence2, wrapText);
    }

    public BasedSequence wrapTextNotTracked() {
        return getFirstWidth() <= 0 ? this.baseSeq : new LeftAlignedWrapping(this.baseSeq).wrapText();
    }

    /* loaded from: classes.dex */
    public class LeftAlignedWrapping {
        final BasedSequence baseSeq;
        boolean escapeSpecialLeadInChars;
        BasedSequence lastSpace;
        List<? extends SpecialLeadInHandler> leadInHandlers;
        CharSequence lineIndent;
        int lineWidth;
        final CharSequence nextIndent;
        final int nextWidth;
        final SequenceBuilder result;
        final int spaceWidth;
        final TextTokenizer tokenizer;
        boolean unEscapeSpecialLeadInChars;
        int wordsOnLine;
        int col = 0;
        int lineCount = 0;

        public LeftAlignedWrapping(BasedSequence basedSequence) {
            int spaceWidth = MarkdownParagraph.this.charWidthProvider.getSpaceWidth();
            this.spaceWidth = spaceWidth;
            this.lineIndent = MarkdownParagraph.this.getFirstIndent();
            this.nextIndent = MarkdownParagraph.this.getIndent();
            this.lineWidth = MarkdownParagraph.this.getFirstWidth() * spaceWidth;
            int i6 = MarkdownParagraph.this.width;
            this.nextWidth = i6 <= 0 ? TableCell.NOT_TRACKED : spaceWidth * i6;
            this.wordsOnLine = 0;
            this.lastSpace = null;
            this.leadInHandlers = MarkdownParagraph.this.leadInHandlers;
            this.unEscapeSpecialLeadInChars = MarkdownParagraph.this.unEscapeSpecialLeadInChars;
            this.escapeSpecialLeadInChars = MarkdownParagraph.this.escapeSpecialLeadInChars;
            this.baseSeq = basedSequence;
            this.result = SequenceBuilder.emptyBuilder(basedSequence);
            this.tokenizer = new TextTokenizer(basedSequence);
        }

        public void addChars(CharSequence charSequence) {
            this.result.append(charSequence);
            this.col = MarkdownParagraph.this.charWidthProvider.getStringWidth(charSequence) + this.col;
        }

        public void addSpaces(int i6) {
            this.result.append(SequenceUtils.SPC, i6);
            this.col = (MarkdownParagraph.this.charWidthProvider.getSpaceWidth() * i6) + this.col;
        }

        public void addToken(Token token) {
            addChars(this.baseSeq.subSequence(token.range.getStart(), token.range.getEnd()));
        }

        public void advance() {
            this.tokenizer.next();
        }

        public void afterLineBreak() {
            this.col = 0;
            this.wordsOnLine = 0;
            this.lineCount++;
            this.lineIndent = this.nextIndent;
            this.lineWidth = this.nextWidth;
            this.lastSpace = null;
        }

        public void processLeadInEscape(List<? extends SpecialLeadInHandler> list, BasedSequence basedSequence) {
            if (basedSequence.isNotEmpty() && this.escapeSpecialLeadInChars) {
                Iterator<? extends SpecialLeadInHandler> it = list.iterator();
                while (it.hasNext()) {
                    if (it.next().escape(basedSequence, MarkdownParagraph.this.options, new b(this))) {
                        return;
                    }
                }
            }
            addChars(basedSequence);
        }

        public void processLeadInUnEscape(List<? extends SpecialLeadInHandler> list, BasedSequence basedSequence) {
            if (basedSequence.isNotEmpty() && this.unEscapeSpecialLeadInChars) {
                Iterator<? extends SpecialLeadInHandler> it = list.iterator();
                while (it.hasNext()) {
                    if (it.next().unEscape(basedSequence, MarkdownParagraph.this.options, new b(this))) {
                        return;
                    }
                }
            }
            addChars(basedSequence);
        }

        public BasedSequence wrapText() {
            while (true) {
                Token token = this.tokenizer.getToken();
                if (token == null) {
                    return this.result.toSequence();
                }
                int i6 = AnonymousClass1.$SwitchMap$com$vladsch$flexmark$util$format$MarkdownParagraph$TextType[token.type.ordinal()];
                if (i6 == 1) {
                    if (this.col != 0) {
                        this.lastSpace = this.baseSeq.subSequence(token.range);
                    }
                    advance();
                } else if (i6 == 2) {
                    int i7 = this.col;
                    if (i7 == 0 || MarkdownParagraph.this.charWidthProvider.getStringWidth(token.subSequence(this.baseSeq)) + i7 + this.spaceWidth <= this.lineWidth) {
                        int i8 = this.col;
                        boolean z5 = i8 == 0;
                        if (i8 > 0) {
                            this.lastSpace = addSpaces(this.lastSpace, 1);
                        } else if (!SequenceUtils.isEmpty(this.lineIndent)) {
                            addChars(this.lineIndent);
                        }
                        if (z5 && !token.isFirstWord) {
                            processLeadInEscape(this.leadInHandlers, this.baseSeq.subSequence(token.range));
                        } else if (z5 || !token.isFirstWord) {
                            addToken(token);
                        } else {
                            processLeadInUnEscape(this.leadInHandlers, this.baseSeq.subSequence(token.range));
                        }
                        advance();
                        this.wordsOnLine++;
                    } else {
                        addChars(SequenceUtils.EOL);
                        afterLineBreak();
                    }
                } else if (i6 == 3) {
                    if (this.col > 0) {
                        addChars(SequenceUtils.EOL);
                        afterLineBreak();
                    }
                    advance();
                } else if (i6 == 4) {
                    if (!MarkdownParagraph.this.keepHardLineBreaks) {
                        this.lastSpace = this.baseSeq.subSequence(token.range);
                    } else if (this.col > 0) {
                        addToken(token);
                        afterLineBreak();
                    }
                    advance();
                } else if (i6 == 5) {
                    if (this.col > 0 && MarkdownParagraph.this.keepSoftLineBreaks) {
                        addToken(token);
                        afterLineBreak();
                    }
                    advance();
                }
            }
        }

        public BasedSequence addSpaces(BasedSequence basedSequence, int i6) {
            if (i6 <= 0) {
                return basedSequence;
            }
            if (basedSequence != null) {
                addChars(basedSequence.subSequence(0, Math.min(basedSequence.length(), i6)));
                r0 = basedSequence.length() > i6 ? basedSequence.subSequence(i6) : null;
                i6 = Math.max(0, i6 - basedSequence.length());
            }
            if (i6 > 0) {
                addSpaces(i6);
            }
            return r0;
        }
    }

    public MarkdownParagraph(BasedSequence basedSequence) {
        this(basedSequence, basedSequence, CharWidthProvider.NULL);
    }

    public MarkdownParagraph(BasedSequence basedSequence, CharWidthProvider charWidthProvider) {
        this(basedSequence, basedSequence, charWidthProvider);
    }

    public MarkdownParagraph(BasedSequence basedSequence, BasedSequence basedSequence2, CharWidthProvider charWidthProvider) {
        BasedSequence basedSequence3 = BasedSequence.NULL;
        this.firstIndent = basedSequence3;
        this.indent = basedSequence3;
        this.firstWidthOffset = 0;
        this.width = 0;
        this.keepHardLineBreaks = true;
        this.keepSoftLineBreaks = false;
        this.unEscapeSpecialLeadInChars = true;
        this.escapeSpecialLeadInChars = true;
        this.restoreTrackedSpaces = false;
        this.options = null;
        this.leadInHandlers = EMPTY_LEAD_IN_HANDLERS;
        this.trackedOffsets = EMPTY_OFFSET_LIST;
        this.trackedOffsetsSorted = true;
        this.baseSeq = basedSequence;
        this.altSeq = basedSequence2;
        this.charWidthProvider = charWidthProvider;
    }
}
