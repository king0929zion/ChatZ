package com.vladsch.flexmark.formatter;

import c.C0914b;
import com.vladsch.flexmark.ast.HtmlCommentBlock;
import com.vladsch.flexmark.ast.HtmlInlineComment;
import com.vladsch.flexmark.ast.HtmlInnerBlockComment;
import com.vladsch.flexmark.ast.ListBlock;
import com.vladsch.flexmark.ast.ListItem;
import com.vladsch.flexmark.ast.OrderedList;
import com.vladsch.flexmark.ast.Paragraph;
import com.vladsch.flexmark.ast.ParagraphContainer;
import com.vladsch.flexmark.ast.SoftLineBreak;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.parser.ListOptions;
import com.vladsch.flexmark.parser.Parser;
import com.vladsch.flexmark.util.ast.BlankLine;
import com.vladsch.flexmark.util.ast.Block;
import com.vladsch.flexmark.util.ast.BlockQuoteLike;
import com.vladsch.flexmark.util.ast.Document;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.data.DataKey;
import com.vladsch.flexmark.util.data.DataKeyBase;
import com.vladsch.flexmark.util.data.MutableDataHolder;
import com.vladsch.flexmark.util.data.NullableDataKey;
import com.vladsch.flexmark.util.format.MarkdownParagraph;
import com.vladsch.flexmark.util.format.TableCell;
import com.vladsch.flexmark.util.format.TrackedOffset;
import com.vladsch.flexmark.util.format.TrackedOffsetList;
import com.vladsch.flexmark.util.format.options.BlockQuoteMarker;
import com.vladsch.flexmark.util.format.options.ListBulletMarker;
import com.vladsch.flexmark.util.format.options.ListNumberedMarker;
import com.vladsch.flexmark.util.format.options.ListSpacing;
import com.vladsch.flexmark.util.misc.CharPredicate;
import com.vladsch.flexmark.util.misc.Pair;
import com.vladsch.flexmark.util.misc.Utils;
import com.vladsch.flexmark.util.sequence.BasedSequence;
import com.vladsch.flexmark.util.sequence.LineAppendable;
import com.vladsch.flexmark.util.sequence.LineInfo;
import com.vladsch.flexmark.util.sequence.RepeatedSequence;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import com.vladsch.flexmark.util.sequence.builder.SequenceBuilder;
import com.vladsch.flexmark.util.sequence.mappers.SpaceMapper;
import j1.AbstractC1135a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class FormatterUtils {
    public static final DataKey<Function<CharSequence, Pair<Integer, Integer>>> LIST_ALIGN_NUMERIC;
    public static final NullableDataKey<ListSpacing> LIST_ITEM_SPACING;
    public static final Function<CharSequence, Pair<Integer, Integer>> NULL_PADDING;
    public static final DataKey<Integer> LIST_ITEM_NUMBER = new DataKey<>("LIST_ITEM_NUMBER", 0);
    public static final DataKey<Boolean> FIRST_LIST_ITEM_CHILD = new DataKey<>("FIRST_LIST_ITEM_CHILD", Boolean.FALSE);

    /* renamed from: com.vladsch.flexmark.formatter.FormatterUtils$1 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$vladsch$flexmark$util$format$options$BlockQuoteMarker;
        static final /* synthetic */ int[] $SwitchMap$com$vladsch$flexmark$util$format$options$ListBulletMarker;
        static final /* synthetic */ int[] $SwitchMap$com$vladsch$flexmark$util$format$options$ListNumberedMarker;
        static final /* synthetic */ int[] $SwitchMap$com$vladsch$flexmark$util$format$options$ListSpacing;

        static {
            int[] iArr = new int[ListBulletMarker.values().length];
            $SwitchMap$com$vladsch$flexmark$util$format$options$ListBulletMarker = iArr;
            try {
                iArr[ListBulletMarker.ANY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$vladsch$flexmark$util$format$options$ListBulletMarker[ListBulletMarker.DASH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$vladsch$flexmark$util$format$options$ListBulletMarker[ListBulletMarker.ASTERISK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$vladsch$flexmark$util$format$options$ListBulletMarker[ListBulletMarker.PLUS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ListNumberedMarker.values().length];
            $SwitchMap$com$vladsch$flexmark$util$format$options$ListNumberedMarker = iArr2;
            try {
                iArr2[ListNumberedMarker.ANY.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$vladsch$flexmark$util$format$options$ListNumberedMarker[ListNumberedMarker.DOT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$vladsch$flexmark$util$format$options$ListNumberedMarker[ListNumberedMarker.PAREN.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[ListSpacing.values().length];
            $SwitchMap$com$vladsch$flexmark$util$format$options$ListSpacing = iArr3;
            try {
                iArr3[ListSpacing.AS_IS.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$vladsch$flexmark$util$format$options$ListSpacing[ListSpacing.LOOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$vladsch$flexmark$util$format$options$ListSpacing[ListSpacing.TIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$vladsch$flexmark$util$format$options$ListSpacing[ListSpacing.LOOSEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$vladsch$flexmark$util$format$options$ListSpacing[ListSpacing.TIGHTEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            int[] iArr4 = new int[BlockQuoteMarker.values().length];
            $SwitchMap$com$vladsch$flexmark$util$format$options$BlockQuoteMarker = iArr4;
            try {
                iArr4[BlockQuoteMarker.AS_IS.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$vladsch$flexmark$util$format$options$BlockQuoteMarker[BlockQuoteMarker.ADD_COMPACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$vladsch$flexmark$util$format$options$BlockQuoteMarker[BlockQuoteMarker.ADD_COMPACT_WITH_SPACE.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$vladsch$flexmark$util$format$options$BlockQuoteMarker[BlockQuoteMarker.ADD_SPACED.ordinal()] = 4;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    static {
        f fVar = new f(2);
        NULL_PADDING = fVar;
        LIST_ALIGN_NUMERIC = new DataKey<>("LIST_ITEM_NUMBER", fVar);
        LIST_ITEM_SPACING = new NullableDataKey<>("LIST_ITEM_SPACING");
    }

    public static void appendWhiteSpaceBetween(MarkdownWriter markdownWriter, Node node, Node node2, boolean z5, boolean z6, boolean z7) {
        if (node2 == null || node == null) {
            return;
        }
        if (z5 || z6) {
            appendWhiteSpaceBetween(markdownWriter, node.getChars(), node2.getChars(), z5, z6, z7);
        }
    }

    public static String getActualAdditionalPrefix(BasedSequence basedSequence, MarkdownWriter markdownWriter) {
        return RepeatedSequence.repeatOf(SequenceUtils.SPACE, Utils.minLimit(0, basedSequence.baseColumnAtStart() - markdownWriter.getPrefix().length())).toString();
    }

    public static String getAdditionalPrefix(BasedSequence basedSequence, BasedSequence basedSequence2) {
        return RepeatedSequence.repeatOf(SequenceUtils.SPACE, Utils.minLimit(0, basedSequence2.getStartOffset() - basedSequence.getStartOffset())).toString();
    }

    public static String getBlockLikePrefix(BlockQuoteLike blockQuoteLike, NodeFormatterContext nodeFormatterContext, BlockQuoteMarker blockQuoteMarker, BasedSequence basedSequence) {
        boolean z5;
        String obj = blockQuoteLike.getOpeningMarker().toString();
        int i6 = AnonymousClass1.$SwitchMap$com$vladsch$flexmark$util$format$options$BlockQuoteMarker[blockQuoteMarker.ordinal()];
        if (i6 != 1) {
            if (i6 == 2) {
                obj = obj.trim();
            } else {
                if (i6 == 3) {
                    obj = B3.e.n(obj.trim(), SequenceUtils.SPACE);
                    z5 = true;
                    CharPredicate blockQuoteLikePrefixPredicate = nodeFormatterContext.getBlockQuoteLikePrefixPredicate();
                    String obj2 = basedSequence.toString();
                    return (z5 || !obj2.endsWith(SequenceUtils.SPACE) || obj2.length() < 2 || !blockQuoteLikePrefixPredicate.test(obj2.charAt(obj2.length() - 2))) ? B3.e.n(obj2, obj) : B3.e.n(obj2.substring(0, obj2.length() - 1), obj);
                }
                if (i6 != 4) {
                    throw new IllegalStateException("Unexpected value: " + blockQuoteMarker);
                }
                obj = B3.e.n(obj.trim(), SequenceUtils.SPACE);
            }
        } else if (blockQuoteLike.getFirstChild() != null) {
            obj = blockQuoteLike.getChars().baseSubSequence(blockQuoteLike.getOpeningMarker().getStartOffset(), blockQuoteLike.getFirstChild().getStartOffset()).toString();
        }
        z5 = false;
        CharPredicate blockQuoteLikePrefixPredicate2 = nodeFormatterContext.getBlockQuoteLikePrefixPredicate();
        String obj22 = basedSequence.toString();
        if (z5) {
        }
    }

    public static BasedSequence getSoftLineBreakSpan(Node node) {
        if (node == null) {
            return BasedSequence.NULL;
        }
        Node node2 = node;
        for (Node next = node.getNext(); next != null && !(next instanceof SoftLineBreak); next = next.getNext()) {
            node2 = next;
        }
        return Node.spanningChars(node.getChars(), node2.getChars());
    }

    public static boolean hasLooseItems(Iterable<Node> iterable) {
        for (Node node : iterable) {
            if ((node instanceof ListItem) && !((ListItem) node).isOwnTight() && node.getNext() != null) {
                return true;
            }
        }
        return false;
    }

    public static boolean isFollowedByBlankLine(Node node) {
        while (node != null) {
            if (node.getNextAnyNot(HtmlCommentBlock.class, HtmlInnerBlockComment.class, HtmlInlineComment.class) instanceof BlankLine) {
                return true;
            }
            if (node.getNextAnyNot(BlankLine.class, HtmlCommentBlock.class, HtmlInnerBlockComment.class, HtmlInlineComment.class) != null) {
                return false;
            }
            node = node.getParent();
        }
        return false;
    }

    public static boolean isLastOfItem(Node node) {
        return node != null && node.getNextAnyNot(BlankLine.class, HtmlCommentBlock.class, HtmlInnerBlockComment.class, HtmlInlineComment.class) == null;
    }

    public static boolean isNotLastItem(Node node) {
        while (node != null && !(node instanceof Document)) {
            if (node.getNextAnyNot(BlankLine.class, HtmlCommentBlock.class, HtmlInnerBlockComment.class, HtmlInlineComment.class) != null) {
                return true;
            }
            node = node.getParent();
        }
        return false;
    }

    public static /* synthetic */ Pair lambda$renderList$1(int i6, CharSequence charSequence) {
        return Pair.of(0, Integer.valueOf(Math.min(4, Math.max(0, i6 - charSequence.length()))));
    }

    public static /* synthetic */ Pair lambda$renderList$2(int i6, CharSequence charSequence) {
        return Pair.of(Integer.valueOf(Math.min(4, Math.max(0, i6 - charSequence.length()))), 0);
    }

    public static /* synthetic */ Pair lambda$static$0(CharSequence charSequence) {
        return Pair.of(0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void renderBlockQuoteLike(BlockQuoteLike blockQuoteLike, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
        FormatterOptions formatterOptions = nodeFormatterContext.getFormatterOptions();
        String blockLikePrefix = getBlockLikePrefix(blockQuoteLike, nodeFormatterContext, formatterOptions.blockQuoteMarkers, markdownWriter.getPrefix());
        markdownWriter.pushPrefix();
        DataKey<Boolean> dataKey = FIRST_LIST_ITEM_CHILD;
        if (dataKey.get(nodeFormatterContext.getDocument()).booleanValue()) {
            markdownWriter.pushOptions().removeOptions(LineAppendable.F_WHITESPACE_REMOVAL).append((CharSequence) getBlockLikePrefix(blockQuoteLike, nodeFormatterContext, formatterOptions.blockQuoteMarkers, BasedSequence.NULL)).popOptions();
            markdownWriter.setPrefix((CharSequence) blockLikePrefix, true);
        } else {
            if (formatterOptions.blockQuoteBlankLines) {
                markdownWriter.blankLine();
            }
            markdownWriter.setPrefix((CharSequence) blockLikePrefix, false);
        }
        int lineCountWithPending = markdownWriter.getLineCountWithPending();
        nodeFormatterContext.renderChildren((Node) blockQuoteLike);
        markdownWriter.popPrefix();
        if (!formatterOptions.blockQuoteBlankLines || lineCountWithPending >= markdownWriter.getLineCountWithPending() || dataKey.get(nodeFormatterContext.getDocument()).booleanValue()) {
            return;
        }
        markdownWriter.tailBlankLine();
    }

    public static void renderList(ListBlock listBlock, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
        if (nodeFormatterContext.isTransformingText()) {
            nodeFormatterContext.renderChildren(listBlock);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Node firstChild = listBlock.getFirstChild(); firstChild != null; firstChild = firstChild.getNext()) {
            arrayList.add(firstChild);
        }
        renderList(listBlock, nodeFormatterContext, markdownWriter, arrayList);
    }

    public static void renderListItem(ListItem listItem, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter, ListOptions listOptions, BasedSequence basedSequence, boolean z5) {
        int i6;
        char c6;
        CharSequence charSequence;
        String format;
        String str;
        FormatterOptions formatterOptions = nodeFormatterContext.getFormatterOptions();
        DataKey<Boolean> dataKey = FIRST_LIST_ITEM_CHILD;
        Boolean bool = dataKey.get(nodeFormatterContext.getDocument());
        boolean booleanValue = bool.booleanValue();
        boolean isTransformingText = nodeFormatterContext.isTransformingText();
        CharSequence charSequence2 = SequenceUtils.SPACE;
        if (isTransformingText) {
            BasedSequence openingMarker = listItem.getOpeningMarker();
            String actualAdditionalPrefix = getActualAdditionalPrefix(openingMarker, markdownWriter);
            if (listItem.getFirstChild() == null) {
                str = B3.e.n(actualAdditionalPrefix, RepeatedSequence.repeatOf(SequenceUtils.SPC, openingMarker.length() + (listOptions.isItemContentAfterSuffix() ? basedSequence.length() : 0) + 1).toString());
            } else {
                BasedSequence chars = listItem.getFirstChild().getChars();
                String n3 = B3.e.n(actualAdditionalPrefix, getAdditionalPrefix(basedSequence.isEmpty() ? openingMarker : basedSequence, chars));
                charSequence2 = getAdditionalPrefix(basedSequence.isEmpty() ? openingMarker.getEmptySuffix() : basedSequence.getEmptySuffix(), chars);
                str = n3;
            }
            ((MarkdownWriter) markdownWriter.pushPrefix()).addPrefix((CharSequence) str, true);
            ((MarkdownWriter) markdownWriter.append((CharSequence) actualAdditionalPrefix)).append((CharSequence) openingMarker);
            if (!basedSequence.isEmpty()) {
                ((MarkdownWriter) markdownWriter.append(getAdditionalPrefix(openingMarker.getEmptySuffix(), basedSequence))).append((CharSequence) basedSequence);
            }
            markdownWriter.append(charSequence2);
            if (!(listItem.getFirstChild() instanceof Paragraph)) {
                if (listItem.getFirstChild() == null) {
                    if (!booleanValue) {
                        markdownWriter.append(SequenceUtils.EOL);
                    }
                } else if (listItem.endOfLine(openingMarker.getEndOffset()) < listItem.getFirstChild().getStartOffset()) {
                    markdownWriter.append(SequenceUtils.EOL);
                }
            }
            nodeFormatterContext.renderChildren(listItem);
            markdownWriter.popPrefix();
        } else {
            if (formatterOptions.listRemoveEmptyItems && (!listItem.hasChildren() || listItem.getFirstChildAnyNot(BlankLine.class) == null)) {
                return;
            }
            CharSequence openingMarker2 = listItem.getOpeningMarker();
            if (listItem.isOrderedItem()) {
                char charAt = openingMarker2.charAt(openingMarker2.length() - 1);
                CharSequence subSequence = openingMarker2.subSequence(0, openingMarker2.length() - 1);
                int i7 = AnonymousClass1.$SwitchMap$com$vladsch$flexmark$util$format$options$ListNumberedMarker[formatterOptions.listNumberedMarker.ordinal()];
                if (i7 != 1) {
                    if (i7 == 2) {
                        charAt = '.';
                    } else {
                        if (i7 != 3) {
                            throw new IllegalStateException(AbstractC1135a.f("Missing case for ListNumberedMarker ", formatterOptions.listNumberedMarker.name()));
                        }
                        charAt = ')';
                    }
                }
                Document document = nodeFormatterContext.getDocument();
                if (formatterOptions.listRenumberItems) {
                    DataKey<Integer> dataKey2 = LIST_ITEM_NUMBER;
                    Integer num = dataKey2.get(document);
                    Locale locale = Locale.US;
                    Integer valueOf = Integer.valueOf(num.intValue() + 1);
                    format = String.format(locale, "%d%c", num, Character.valueOf(charAt));
                    document.set((DataKey<DataKey<Integer>>) dataKey2, (DataKey<Integer>) valueOf);
                } else {
                    format = String.format("%s%c", subSequence, Character.valueOf(charAt));
                }
                Pair<Integer, Integer> apply = LIST_ALIGN_NUMERIC.get(document).apply(format);
                if (apply.getFirst().intValue() > 0) {
                    format = B3.e.n(RepeatedSequence.ofSpaces(apply.getFirst().intValue()).toString(), format.toString());
                }
                openingMarker2 = apply.getSecond().intValue() > 0 ? B3.e.n(format.toString(), RepeatedSequence.ofSpaces(apply.getSecond().intValue()).toString()) : format;
            } else if (listItem.canChangeMarker() && (i6 = AnonymousClass1.$SwitchMap$com$vladsch$flexmark$util$format$options$ListBulletMarker[formatterOptions.listBulletMarker.ordinal()]) != 1) {
                if (i6 == 2) {
                    openingMarker2 = "-";
                } else if (i6 == 3) {
                    openingMarker2 = "*";
                } else {
                    if (i6 != 4) {
                        throw new IllegalStateException(AbstractC1135a.f("Missing case for ListBulletMarker ", formatterOptions.listBulletMarker.name()));
                    }
                    openingMarker2 = "+";
                }
            }
            int length = (listOptions.isItemContentAfterSuffix() || formatterOptions.listsItemContentAfterSuffix) ? basedSequence.length() : 0;
            int length2 = openingMarker2.length() + (listOptions.isItemContentAfterSuffix() ? basedSequence.length() : 0) + 1;
            if (formatterOptions.itemContentIndent) {
                c6 = SequenceUtils.SPC;
                charSequence = RepeatedSequence.repeatOf(SequenceUtils.SPC, length);
            } else {
                c6 = SequenceUtils.SPC;
                charSequence = FlexmarkHtmlConverter.DEFAULT_NODE;
            }
            CharSequence repeatOf = formatterOptions.itemContentIndent ? RepeatedSequence.repeatOf(c6, length2) : RepeatedSequence.repeatOf(SequenceUtils.SPACE, listOptions.getItemIndent()).toString();
            BasedSequence openingMarker3 = listItem.getOpeningMarker();
            ((MarkdownWriter) markdownWriter.pushOptions()).preserveSpaces().append((CharSequence) openingMarker3.getBuilder().append((CharSequence) openingMarker3.getEmptyPrefix()).append(openingMarker2).append((CharSequence) openingMarker3.getEmptySuffix()).toSequence()).append(SequenceUtils.SPC).append((CharSequence) basedSequence).popOptions();
            ((MarkdownWriter) markdownWriter.pushPrefix()).addPrefix(repeatOf, true);
            Node firstChild = listItem.getFirstChild();
            if (firstChild != null && listItem.getFirstChildAnyNot(BlankLine.class) != null) {
                ((MarkdownWriter) markdownWriter.pushPrefix()).addPrefix(charSequence, true);
                dataKey.set(nodeFormatterContext.getDocument(), Boolean.TRUE);
                nodeFormatterContext.render(firstChild);
                dataKey.set(nodeFormatterContext.getDocument(), Boolean.FALSE);
                markdownWriter.popPrefix();
                while (true) {
                    firstChild = firstChild.getNext();
                    if (firstChild == null) {
                        break;
                    } else {
                        nodeFormatterContext.render(firstChild);
                    }
                }
                if (z5 && ((listItem.isLoose() && nodeFormatterContext.getFormatterOptions().listSpacing == ListSpacing.LOOSEN) || nodeFormatterContext.getFormatterOptions().listSpacing == ListSpacing.LOOSE)) {
                    markdownWriter.tailBlankLine();
                }
            } else if (listItem.isLoose()) {
                markdownWriter.tailBlankLine();
            } else if (!booleanValue) {
                markdownWriter.line();
            }
            markdownWriter.popPrefix();
        }
        FIRST_LIST_ITEM_CHILD.set(nodeFormatterContext.getDocument(), bool);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void renderLooseItemParagraph(Paragraph paragraph, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
        renderTextBlockParagraphLines(paragraph, nodeFormatterContext, markdownWriter);
        Block parent = paragraph.getParent();
        if (!(parent instanceof ListItem)) {
            markdownWriter.tailBlankLine();
            return;
        }
        if (!nodeFormatterContext.getFormatterOptions().blankLinesInAst) {
            if (nodeFormatterContext.getFormatterOptions().listSpacing == ListSpacing.TIGHTEN && parent.getNext() == null) {
                return;
            }
            markdownWriter.tailBlankLine();
            return;
        }
        boolean isParagraphEndWrappingDisabled = ((ParagraphContainer) parent).isParagraphEndWrappingDisabled(paragraph);
        ListItem listItem = (ListItem) parent;
        int i6 = AnonymousClass1.$SwitchMap$com$vladsch$flexmark$util$format$options$ListSpacing[nodeFormatterContext.getFormatterOptions().listSpacing.ordinal()];
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 4) {
                    if (i6 != 5 || isParagraphEndWrappingDisabled) {
                        return;
                    }
                    if (listItem.isItemParagraph(paragraph)) {
                        if (!isFollowedByBlankLine(paragraph) || !isNotLastItem(paragraph)) {
                            return;
                        }
                    } else if (!isNotLastItem(paragraph)) {
                        return;
                    }
                } else {
                    if (!(parent.getParent() instanceof ListBlock) || !((ListBlock) parent.getParent()).isLoose() || !hasLooseItems(parent.getParent().getChildren())) {
                        return;
                    }
                    if ((!isFollowedByBlankLine(paragraph) || !isNotLastItem(parent)) && listItem.isOwnTight() && (!listItem.isItemParagraph(paragraph) || parent.getFirstChild() == null || parent.getFirstChild().getNext() == null)) {
                        return;
                    }
                }
            }
        } else if (!isFollowedByBlankLine(paragraph) || !isNotLastItem(parent)) {
            return;
        }
        markdownWriter.tailBlankLine();
    }

    public static void renderLooseParagraph(Paragraph paragraph, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
        markdownWriter.blankLine();
        renderLooseItemParagraph(paragraph, nodeFormatterContext, markdownWriter);
    }

    public static void renderTextBlockParagraphLines(Node node, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
        int startOffset;
        int endOffset;
        if (nodeFormatterContext.isTransformingText()) {
            nodeFormatterContext.translatingSpan(new C0914b(node, 1));
            markdownWriter.line();
            return;
        }
        FormatterOptions formatterOptions = nodeFormatterContext.getFormatterOptions();
        if (formatterOptions.rightMargin <= 0) {
            nodeFormatterContext.renderChildren(node);
            markdownWriter.line();
            return;
        }
        MutableDataHolder mutable = nodeFormatterContext.getOptions().toMutable();
        DataKey<Boolean> dataKey = Formatter.KEEP_SOFT_LINE_BREAKS;
        Boolean bool = Boolean.TRUE;
        MutableDataHolder mutableDataHolder = mutable.set((DataKey<DataKey<Boolean>>) dataKey, (DataKey<Boolean>) bool).set((DataKey<DataKey<Boolean>>) Formatter.KEEP_HARD_LINE_BREAKS, (DataKey<Boolean>) bool);
        SequenceBuilder builder = nodeFormatterContext.getDocument().getChars().getBuilder();
        NodeFormatterContext subContext = nodeFormatterContext.getSubContext(mutableDataHolder, builder.getBuilder());
        MarkdownWriter markdown = subContext.getMarkdown();
        markdown.removeOptions(LineAppendable.F_TRIM_TRAILING_WHITESPACE);
        subContext.renderChildren(node);
        BasedSequence trimEOL = node.getChars().trimEOL();
        BasedSequence trimmedEnd = node.getChars().trimmedEnd();
        if (trimmedEnd.isNotEmpty() && !markdown.endsWithEOL()) {
            markdown.append((CharSequence) trimmedEnd);
        }
        markdown.line();
        markdown.appendToSilently(builder, 0, -1);
        BasedSequence sequence = builder.toSequence();
        BasedSequence sequence2 = builder.toSequence(nodeFormatterContext.getTrackedSequence());
        boolean z5 = sequence != sequence2;
        TrackedOffsetList trackedOffsets = nodeFormatterContext.getTrackedOffsets();
        if (z5) {
            BasedSequence trimEnd = sequence2.trimEnd();
            startOffset = trimEnd.getStartOffset();
            endOffset = trimEnd.getEndOffset() + (trimEOL.countTrailingWhitespace() - trimEnd.countTrailingWhitespace()) + 1;
        } else {
            startOffset = trimEOL.getStartOffset();
            endOffset = trimEOL.getEndOffset();
        }
        TrackedOffsetList trackedOffsets2 = trackedOffsets.getTrackedOffsets(startOffset, endOffset);
        MarkdownParagraph markdownParagraph = new MarkdownParagraph(sequence, sequence2, formatterOptions.charWidthProvider);
        markdownParagraph.setOptions(nodeFormatterContext.getOptions());
        markdownParagraph.setWidth(formatterOptions.rightMargin - markdownWriter.getPrefix().length());
        markdownParagraph.setKeepSoftBreaks(false);
        markdownParagraph.setKeepHardBreaks(formatterOptions.keepHardLineBreaks);
        markdownParagraph.setRestoreTrackedSpaces(nodeFormatterContext.isRestoreTrackedSpaces());
        BasedSequence basedSequence = BasedSequence.NULL;
        markdownParagraph.setFirstIndent(basedSequence);
        markdownParagraph.setIndent(basedSequence);
        markdownParagraph.setFirstWidthOffset(markdownWriter.getAfterEolPrefixDelta() + (-markdownWriter.column()));
        if (formatterOptions.applySpecialLeadInHandlers) {
            markdownParagraph.setLeadInHandlers(Parser.SPECIAL_LEAD_IN_HANDLERS.get(nodeFormatterContext.getDocument()));
        }
        Iterator<TrackedOffset> it = trackedOffsets2.iterator();
        while (it.hasNext()) {
            markdownParagraph.addTrackedOffset(it.next());
        }
        BasedSequence mapped = markdownParagraph.wrapText().toMapped(SpaceMapper.fromNonBreakSpace);
        int lineCount = markdownWriter.getLineCount();
        int column = markdownWriter.column();
        markdownWriter.pushOptions().preserveSpaces().append((CharSequence) mapped).line().popOptions();
        if (trackedOffsets2.isEmpty()) {
            return;
        }
        LineInfo lineInfo = markdownWriter.getLineInfo(lineCount);
        Iterator<TrackedOffset> it2 = trackedOffsets2.iterator();
        while (it2.hasNext()) {
            TrackedOffset next = it2.next();
            if (next.isResolved()) {
                int index = next.getIndex();
                next.setIndex((lineInfo.sumLength - lineInfo.length) + column + (markdownWriter.getLineInfo(mapped.lineColumnAtIndex(index).getFirst().intValue() + lineCount).sumPrefixLength - lineInfo.sumPrefixLength) + lineInfo.prefixLength + index);
            }
        }
    }

    public static CharSequence stripSoftLineBreak(CharSequence charSequence, CharSequence charSequence2) {
        Matcher matcher = Pattern.compile("\\s*(?:\r\n|\r|\n)\\s*").matcher(charSequence);
        StringBuffer stringBuffer = null;
        while (matcher.find()) {
            if (stringBuffer == null) {
                stringBuffer = new StringBuffer();
            }
            matcher.appendReplacement(stringBuffer, charSequence2.toString());
        }
        if (stringBuffer == null) {
            return charSequence;
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer;
    }

    public static void appendWhiteSpaceBetween(MarkdownWriter markdownWriter, BasedSequence basedSequence, BasedSequence basedSequence2, boolean z5, boolean z6, boolean z7) {
        if (basedSequence2 == null || basedSequence == null) {
            return;
        }
        if ((z5 || z6) && basedSequence.getEndOffset() <= basedSequence2.getStartOffset()) {
            BasedSequence baseSubSequence = basedSequence.baseSubSequence(basedSequence.getEndOffset(), basedSequence2.getStartOffset());
            if (baseSubSequence.isEmpty() || !baseSubSequence.isBlank()) {
                return;
            }
            if (!z5) {
                if (z7 && baseSubSequence.indexOfAny(CharPredicate.ANY_EOL) != -1) {
                    markdownWriter.append('\n');
                    return;
                } else {
                    markdownWriter.append(SequenceUtils.SPC);
                    return;
                }
            }
            int options = markdownWriter.getOptions();
            markdownWriter.setOptions((~LineAppendable.F_TRIM_LEADING_WHITESPACE) & options);
            markdownWriter.append((CharSequence) baseSubSequence);
            markdownWriter.setOptions(options);
        }
    }

    public static void renderList(ListBlock listBlock, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter, List<Node> list) {
        ListSpacing listSpacing;
        Function function;
        FormatterOptions formatterOptions = nodeFormatterContext.getFormatterOptions();
        if (formatterOptions.listAddBlankLineBefore && !listBlock.isOrDescendantOfType(ListItem.class)) {
            markdownWriter.blankLine();
        }
        Document document = nodeFormatterContext.getDocument();
        ListSpacing listSpacing2 = LIST_ITEM_SPACING.get(document);
        DataKey<Integer> dataKey = LIST_ITEM_NUMBER;
        Integer num = dataKey.get(document);
        num.getClass();
        boolean z5 = listBlock instanceof OrderedList;
        int startNumber = (!z5 || (formatterOptions.listRenumberItems && formatterOptions.listResetFirstItemNumber)) ? 1 : ((OrderedList) listBlock).getStartNumber();
        DataKey<Function<CharSequence, Pair<Integer, Integer>>> dataKey2 = LIST_ALIGN_NUMERIC;
        Function<CharSequence, Pair<Integer, Integer>> function2 = dataKey2.get(document);
        document.set((DataKey<DataKey<Integer>>) dataKey, (DataKey<Integer>) Integer.valueOf(startNumber));
        int i6 = AnonymousClass1.$SwitchMap$com$vladsch$flexmark$util$format$options$ListSpacing[formatterOptions.listSpacing.ordinal()];
        if (i6 == 2) {
            listSpacing = ListSpacing.LOOSE;
        } else if (i6 == 3) {
            listSpacing = ListSpacing.TIGHT;
        } else if (i6 == 4) {
            listSpacing = hasLooseItems(list) ? ListSpacing.LOOSE : ListSpacing.TIGHT;
        } else if (i6 != 5) {
            listSpacing = null;
        } else {
            listSpacing = hasLooseItems(list) ? ListSpacing.AS_IS : ListSpacing.TIGHT;
        }
        document.remove((DataKeyBase<?>) dataKey2);
        if (!formatterOptions.listAlignNumeric.isNoChange() && z5) {
            final int i7 = Integer.MIN_VALUE;
            int i8 = TableCell.NOT_TRACKED;
            for (Node node : list) {
                if (!formatterOptions.listRemoveEmptyItems || (node.hasChildren() && node.getFirstChildAnyNot(BlankLine.class) != null)) {
                    int length = formatterOptions.listRenumberItems ? Integer.toString(startNumber).length() + 1 : ((ListItem) node).getOpeningMarker().length();
                    i7 = Math.max(i7, length);
                    i8 = Math.min(i8, length);
                    startNumber++;
                }
            }
            if (i7 != i8) {
                DataKey<Function<CharSequence, Pair<Integer, Integer>>> dataKey3 = LIST_ALIGN_NUMERIC;
                if (formatterOptions.listAlignNumeric.isLeft()) {
                    final int i9 = 0;
                    function = new Function() { // from class: com.vladsch.flexmark.formatter.g
                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            Pair lambda$renderList$1;
                            Pair lambda$renderList$2;
                            switch (i9) {
                                case 0:
                                    lambda$renderList$1 = FormatterUtils.lambda$renderList$1(i7, (CharSequence) obj);
                                    return lambda$renderList$1;
                                default:
                                    lambda$renderList$2 = FormatterUtils.lambda$renderList$2(i7, (CharSequence) obj);
                                    return lambda$renderList$2;
                            }
                        }
                    };
                } else {
                    final int i10 = 1;
                    function = new Function() { // from class: com.vladsch.flexmark.formatter.g
                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            Pair lambda$renderList$1;
                            Pair lambda$renderList$2;
                            switch (i10) {
                                case 0:
                                    lambda$renderList$1 = FormatterUtils.lambda$renderList$1(i7, (CharSequence) obj);
                                    return lambda$renderList$1;
                                default:
                                    lambda$renderList$2 = FormatterUtils.lambda$renderList$2(i7, (CharSequence) obj);
                                    return lambda$renderList$2;
                            }
                        }
                    };
                }
                document.set((DataKey<DataKey<Function<CharSequence, Pair<Integer, Integer>>>>) dataKey3, (DataKey<Function<CharSequence, Pair<Integer, Integer>>>) function);
            }
        }
        NullableDataKey<ListSpacing> nullableDataKey = LIST_ITEM_SPACING;
        ListSpacing listSpacing3 = ListSpacing.LOOSE;
        if (listSpacing != listSpacing3 || (listSpacing2 != null && listSpacing2 != listSpacing3)) {
            listSpacing3 = listSpacing;
        }
        document.set((NullableDataKey<NullableDataKey<ListSpacing>>) nullableDataKey, (NullableDataKey<ListSpacing>) listSpacing3);
        for (Node node2 : list) {
            ListSpacing listSpacing4 = ListSpacing.LOOSE;
            if (listSpacing == listSpacing4 && (listSpacing2 == null || listSpacing2 == listSpacing4)) {
                markdownWriter.blankLine();
            }
            nodeFormatterContext.render(node2);
        }
        document.set((NullableDataKey<NullableDataKey<ListSpacing>>) LIST_ITEM_SPACING, (NullableDataKey<ListSpacing>) listSpacing2);
        document.set((DataKey<DataKey<Integer>>) LIST_ITEM_NUMBER, (DataKey<Integer>) num);
        document.set((DataKey<DataKey<Function<CharSequence, Pair<Integer, Integer>>>>) LIST_ALIGN_NUMERIC, (DataKey<Function<CharSequence, Pair<Integer, Integer>>>) function2);
        if (listBlock.isOrDescendantOfType(ListItem.class)) {
            return;
        }
        markdownWriter.tailBlankLine();
    }
}
