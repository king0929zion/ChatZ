package com.vladsch.flexmark.html2md.converter.internal;

import I.h;
import N1.y;
import com.vladsch.flexmark.ast.Reference;
import com.vladsch.flexmark.ast.util.ReferenceRepository;
import com.vladsch.flexmark.ext.emoji.internal.EmojiReference;
import com.vladsch.flexmark.ext.emoji.internal.EmojiShortcuts;
import com.vladsch.flexmark.formatter.j;
import com.vladsch.flexmark.html.renderer.LinkType;
import com.vladsch.flexmark.html2md.converter.CustomHtmlNodeRenderer;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.html2md.converter.HtmlConverterOptions;
import com.vladsch.flexmark.html2md.converter.HtmlConverterPhase;
import com.vladsch.flexmark.html2md.converter.HtmlMarkdownWriter;
import com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext;
import com.vladsch.flexmark.html2md.converter.HtmlNodeRendererHandler;
import com.vladsch.flexmark.html2md.converter.LinkConversion;
import com.vladsch.flexmark.html2md.converter.ListState;
import com.vladsch.flexmark.html2md.converter.PhasedHtmlNodeRenderer;
import com.vladsch.flexmark.parser.Parser;
import com.vladsch.flexmark.parser.PegdownExtensions;
import com.vladsch.flexmark.parser.core.BlockQuoteParser;
import com.vladsch.flexmark.util.data.DataHolder;
import com.vladsch.flexmark.util.format.MarkdownTable;
import com.vladsch.flexmark.util.format.RomanNumeral;
import com.vladsch.flexmark.util.format.TableCell;
import com.vladsch.flexmark.util.html.Attribute;
import com.vladsch.flexmark.util.html.CellAlignment;
import com.vladsch.flexmark.util.misc.CharPredicate;
import com.vladsch.flexmark.util.misc.Utils;
import com.vladsch.flexmark.util.sequence.BasedSequence;
import com.vladsch.flexmark.util.sequence.LineAppendable;
import com.vladsch.flexmark.util.sequence.RepeatedSequence;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import v.AbstractC1787b;

/* loaded from: classes.dex */
public class HtmlConverterCoreNodeRenderer implements PhasedHtmlNodeRenderer {
    public static final String EMOJI_ALT_PREFIX = "emoji ";
    private final HtmlConverterOptions myHtmlConverterOptions;
    private MarkdownTable myTable;
    public static final Pattern NUMERIC_DOT_LIST_PAT = Pattern.compile("^(\\d+)\\.\\s*$");
    public static final Pattern NUMERIC_PAREN_LIST_PAT = Pattern.compile("^(\\d+)\\)\\s*$");
    public static final Pattern NON_NUMERIC_DOT_LIST_PAT = Pattern.compile("^((?:(?:" + RomanNumeral.ROMAN_NUMERAL.pattern() + ")|(?:" + RomanNumeral.LOWERCASE_ROMAN_NUMERAL.pattern() + ")|[a-z]+|[A-Z]+))\\.\\s*$");
    public static final Pattern NON_NUMERIC_PAREN_LIST_PAT = Pattern.compile("^((?:[a-z]+|[A-Z]+))\\)\\s*$");
    public static final Pattern BULLET_LIST_PAT = Pattern.compile("^([·])\\s*$");
    public static final Pattern ALPHA_NUMERAL_PAT = Pattern.compile("^[a-z]+|[A-Z]+$");
    public static HashSet<String> explicitLinkTextTags = new HashSet<>(Arrays.asList(FlexmarkHtmlConverter.EXPLICIT_LINK_TEXT_TAGS));
    private boolean myTableSuppressColumns = false;
    private final HashMap<String, String> myAbbreviations = new HashMap<>();
    private final HashMap<String, String> myMacrosMap = new HashMap<>();

    /* renamed from: com.vladsch.flexmark.html2md.converter.internal.HtmlConverterCoreNodeRenderer$1 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$vladsch$flexmark$html2md$converter$HtmlConverterPhase;

        static {
            int[] iArr = new int[HtmlConverterPhase.values().length];
            $SwitchMap$com$vladsch$flexmark$html2md$converter$HtmlConverterPhase = iArr;
            try {
                iArr[HtmlConverterPhase.COLLECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$vladsch$flexmark$html2md$converter$HtmlConverterPhase[HtmlConverterPhase.DOCUMENT_BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public HtmlConverterCoreNodeRenderer(DataHolder dataHolder) {
        this.myHtmlConverterOptions = new HtmlConverterOptions(dataHolder);
    }

    private String convertNumeric(String str) {
        String trim = str.trim();
        if (RomanNumeral.LIMITED_ROMAN_NUMERAL.matcher(trim).matches() || RomanNumeral.LIMITED_LOWERCASE_ROMAN_NUMERAL.matcher(trim).matches()) {
            return String.valueOf(new RomanNumeral(trim).toInt());
        }
        if (!ALPHA_NUMERAL_PAT.matcher(trim).matches()) {
            return "1";
        }
        int i6 = 0;
        for (int i7 = 0; i7 < trim.toUpperCase().length(); i7++) {
            i6 = (i6 * 26) + (r5.charAt(i7) - '@');
        }
        return String.valueOf(i6);
    }

    public static int getMaxRepeatedChars(CharSequence charSequence, char c6, int i6) {
        int indexOf;
        BasedSequence of = BasedSequence.of(charSequence);
        int i7 = 0;
        while (i7 < of.length() && (indexOf = of.indexOf(c6, i7)) >= 0) {
            int countLeading = of.countLeading(new d(c6, 0), indexOf);
            if (i6 <= countLeading) {
                i6 = countLeading + 1;
            }
            i7 = indexOf + countLeading;
        }
        return i6;
    }

    private void handleDefinition(Element element, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
        boolean z5;
        htmlNodeConverterContext.pushState(element);
        int options = htmlMarkdownWriter.getOptions();
        Elements children = element.children();
        if (children.isEmpty() || !children.get(0).tagName().equalsIgnoreCase(FlexmarkHtmlConverter.P_NODE)) {
            z5 = false;
        } else {
            htmlMarkdownWriter.blankLine();
            z5 = true;
        }
        HtmlConverterOptions htmlConverterOptions = this.myHtmlConverterOptions;
        CharSequence repeatOf = RepeatedSequence.repeatOf(SequenceUtils.SPACE, htmlConverterOptions.listContentIndent ? htmlConverterOptions.definitionMarkerSpaces + 1 : 4);
        htmlMarkdownWriter.line().setOptions((~LineAppendable.F_COLLAPSE_WHITESPACE) & options);
        htmlMarkdownWriter.append(':').append(SequenceUtils.SPC, this.myHtmlConverterOptions.definitionMarkerSpaces);
        htmlMarkdownWriter.pushPrefix();
        htmlMarkdownWriter.addPrefix(repeatOf, true);
        htmlMarkdownWriter.setOptions(options);
        if (z5) {
            htmlNodeConverterContext.renderChildren(element, true, null);
        } else {
            htmlNodeConverterContext.processTextNodes(element, false);
        }
        htmlMarkdownWriter.line();
        htmlMarkdownWriter.popPrefix();
        htmlNodeConverterContext.popState(htmlMarkdownWriter);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [org.jsoup.nodes.Element] */
    /* JADX WARN: Type inference failed for: r5v1, types: [org.jsoup.nodes.Node] */
    /* JADX WARN: Type inference failed for: r5v7, types: [org.jsoup.nodes.Node] */
    private void handleDivTable(Element element, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
        MarkdownTable markdownTable = this.myTable;
        this.myTable = new MarkdownTable(FlexmarkHtmlConverter.DEFAULT_NODE, this.myHtmlConverterOptions.tableOptions);
        this.myTableSuppressColumns = false;
        do {
            if (element.nodeName().toLowerCase().equals(FlexmarkHtmlConverter.DIV_NODE)) {
                Element element2 = (Element) element;
                if (!element2.classNames().contains("wt-data-grid__row")) {
                    break;
                }
                handleDivTableRow(element2, htmlNodeConverterContext, htmlMarkdownWriter);
                element = htmlNodeConverterContext.next();
            } else {
                if (element instanceof Element) {
                    break;
                }
                element = htmlNodeConverterContext.next();
            }
        } while (element != 0);
        this.myTable.finalizeTable();
        if (this.myTable.getMaxColumns() > 0) {
            htmlMarkdownWriter.blankLine();
            this.myTable.appendTable(htmlMarkdownWriter);
            htmlMarkdownWriter.tailBlankLine();
        }
        this.myTable = markdownTable;
    }

    private void handleDivTableCell(Element element, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
        String replaceAll = htmlNodeConverterContext.processTextNodes(element).trim().replaceAll("\\s*\n\\s*", SequenceUtils.SPACE);
        CellAlignment cellAlignment = CellAlignment.NONE;
        if (this.myTableSuppressColumns) {
            return;
        }
        MarkdownTable markdownTable = this.myTable;
        BasedSequence basedSequence = BasedSequence.NULL;
        markdownTable.addCell(new TableCell(null, basedSequence, replaceAll.replace(SequenceUtils.EOL, SequenceUtils.SPACE), basedSequence, 1, 1, cellAlignment));
    }

    private void handleDivTableRow(Element element, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
        htmlNodeConverterContext.pushState(element);
        this.myTable.setHeader(hasIntersection(element.classNames(), this.myHtmlConverterOptions.divTableHdrClasses));
        while (true) {
            Node next = htmlNodeConverterContext.next();
            if (next == null) {
                break;
            }
            if (next.nodeName().toLowerCase().equals(FlexmarkHtmlConverter.DIV_NODE)) {
                Element element2 = (Element) next;
                if (!hasIntersection(element2.classNames(), this.myHtmlConverterOptions.divTableCellClasses)) {
                    break;
                } else {
                    handleDivTableCell(element2, htmlNodeConverterContext, htmlMarkdownWriter);
                }
            } else if (next instanceof Element) {
                break;
            }
        }
        this.myTable.nextRow();
        htmlNodeConverterContext.popState(htmlMarkdownWriter);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void handleList(com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext r14, com.vladsch.flexmark.html2md.converter.HtmlMarkdownWriter r15, org.jsoup.nodes.Element r16, boolean r17, boolean r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vladsch.flexmark.html2md.converter.internal.HtmlConverterCoreNodeRenderer.handleList(com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext, com.vladsch.flexmark.html2md.converter.HtmlMarkdownWriter, org.jsoup.nodes.Element, boolean, boolean, boolean):void");
    }

    private void handleListItem(HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter, Element element, ListState listState) {
        htmlNodeConverterContext.pushState(element);
        listState.itemCount++;
        String itemPrefix = listState.getItemPrefix(this.myHtmlConverterOptions);
        HtmlConverterOptions htmlConverterOptions = this.myHtmlConverterOptions;
        CharSequence repeatOf = RepeatedSequence.repeatOf(SequenceUtils.SPACE, htmlConverterOptions.listContentIndent ? itemPrefix.length() : htmlConverterOptions.listItemIndent);
        htmlMarkdownWriter.line().append((CharSequence) itemPrefix);
        htmlMarkdownWriter.pushPrefix();
        htmlMarkdownWriter.addPrefix(repeatOf, true);
        int offsetWithPending = htmlMarkdownWriter.offsetWithPending();
        htmlNodeConverterContext.renderChildren(element, true, null);
        if (offsetWithPending == htmlMarkdownWriter.offsetWithPending()) {
            int options = htmlMarkdownWriter.getOptions();
            htmlMarkdownWriter.setOptions((~(LineAppendable.F_TRIM_TRAILING_WHITESPACE | LineAppendable.F_TRIM_LEADING_WHITESPACE)) & options);
            htmlMarkdownWriter.line();
            htmlMarkdownWriter.setOptions(options);
        } else {
            htmlMarkdownWriter.line();
        }
        htmlMarkdownWriter.popPrefix();
        htmlNodeConverterContext.popState(htmlMarkdownWriter);
    }

    private void handleTableCaption(Element element, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
        this.myTable.setCaption(htmlNodeConverterContext.processTextNodes(element).trim());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x002c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void handleTableCell(org.jsoup.nodes.Element r12, com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext r13, com.vladsch.flexmark.html2md.converter.HtmlMarkdownWriter r14) {
        /*
            r11 = this;
            java.lang.String r13 = r13.processTextNodes(r12)
            java.lang.String r13 = r13.trim()
            java.lang.String r14 = "\\s*\n\\s*"
            java.lang.String r0 = " "
            java.lang.String r13 = r13.replaceAll(r14, r0)
            java.lang.String r14 = "colSpan"
            boolean r1 = r12.hasAttr(r14)
            r2 = 1
            if (r1 == 0) goto L23
            java.lang.String r14 = r12.attr(r14)     // Catch: java.lang.NumberFormatException -> L23
            int r14 = java.lang.Integer.parseInt(r14)     // Catch: java.lang.NumberFormatException -> L23
            r9 = r14
            goto L24
        L23:
            r9 = r2
        L24:
            java.lang.String r14 = "rowSpan"
            boolean r1 = r12.hasAttr(r14)
            if (r1 == 0) goto L34
            java.lang.String r14 = r12.attr(r14)     // Catch: java.lang.NumberFormatException -> L34
            int r2 = java.lang.Integer.parseInt(r14)     // Catch: java.lang.NumberFormatException -> L34
        L34:
            r8 = r2
            java.lang.String r14 = "align"
            boolean r1 = r12.hasAttr(r14)
            if (r1 == 0) goto L47
            java.lang.String r12 = r12.attr(r14)
            com.vladsch.flexmark.util.html.CellAlignment r12 = com.vladsch.flexmark.util.html.CellAlignment.getAlignment(r12)
            r10 = r12
            goto Lb5
        L47:
            java.util.Set r12 = r12.classNames()
            boolean r14 = r12.isEmpty()
            r1 = 0
            if (r14 != 0) goto Lb4
            java.util.Iterator r14 = r12.iterator()
        L56:
            boolean r2 = r14.hasNext()
            if (r2 == 0) goto L6f
            java.lang.Object r2 = r14.next()
            java.lang.String r2 = (java.lang.String) r2
            com.vladsch.flexmark.html2md.converter.HtmlConverterOptions r3 = r11.myHtmlConverterOptions
            java.util.Map<java.lang.Object, com.vladsch.flexmark.util.html.CellAlignment> r3 = r3.tableCellAlignmentMap
            java.lang.Object r2 = r3.get(r2)
            com.vladsch.flexmark.util.html.CellAlignment r2 = (com.vladsch.flexmark.util.html.CellAlignment) r2
            if (r2 == 0) goto L56
            r1 = r2
        L6f:
            if (r1 != 0) goto Lb4
            com.vladsch.flexmark.html2md.converter.HtmlConverterOptions r14 = r11.myHtmlConverterOptions
            java.util.Map<java.lang.Object, com.vladsch.flexmark.util.html.CellAlignment> r14 = r14.tableCellAlignmentMap
            java.util.Set r14 = r14.keySet()
            java.util.Iterator r14 = r14.iterator()
        L7d:
            boolean r2 = r14.hasNext()
            if (r2 == 0) goto Lb4
            java.lang.Object r2 = r14.next()
            boolean r3 = r2 instanceof java.util.regex.Pattern
            if (r3 == 0) goto L7d
            r3 = r2
            java.util.regex.Pattern r3 = (java.util.regex.Pattern) r3
            java.util.Iterator r4 = r12.iterator()
        L92:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lb2
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.util.regex.Matcher r5 = r3.matcher(r5)
            boolean r5 = r5.find()
            if (r5 == 0) goto L92
            com.vladsch.flexmark.html2md.converter.HtmlConverterOptions r1 = r11.myHtmlConverterOptions
            java.util.Map<java.lang.Object, com.vladsch.flexmark.util.html.CellAlignment> r1 = r1.tableCellAlignmentMap
            java.lang.Object r1 = r1.get(r2)
            com.vladsch.flexmark.util.html.CellAlignment r1 = (com.vladsch.flexmark.util.html.CellAlignment) r1
        Lb2:
            if (r1 == 0) goto L7d
        Lb4:
            r10 = r1
        Lb5:
            boolean r12 = r11.myTableSuppressColumns
            if (r12 != 0) goto Lcd
            com.vladsch.flexmark.util.format.MarkdownTable r12 = r11.myTable
            com.vladsch.flexmark.util.format.TableCell r3 = new com.vladsch.flexmark.util.format.TableCell
            com.vladsch.flexmark.util.sequence.BasedSequence r5 = com.vladsch.flexmark.util.sequence.BasedSequence.NULL
            java.lang.String r14 = "\n"
            java.lang.String r6 = r13.replace(r14, r0)
            r4 = 0
            r7 = r5
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r12.addCell(r3)
        Lcd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vladsch.flexmark.html2md.converter.internal.HtmlConverterCoreNodeRenderer.handleTableCell(org.jsoup.nodes.Element, com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext, com.vladsch.flexmark.html2md.converter.HtmlMarkdownWriter):void");
    }

    private void handleTableRow(HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter, Element element) {
        htmlNodeConverterContext.pushState(element);
        while (true) {
            Node next = htmlNodeConverterContext.next();
            if (next == null) {
                this.myTable.nextRow();
                htmlNodeConverterContext.popState(htmlMarkdownWriter);
                return;
            } else {
                String lowerCase = next.nodeName().toLowerCase();
                lowerCase.getClass();
                if (lowerCase.equals(FlexmarkHtmlConverter.TD_NODE) || lowerCase.equals(FlexmarkHtmlConverter.TH_NODE)) {
                    handleTableCell((Element) next, htmlNodeConverterContext, htmlMarkdownWriter);
                }
            }
        }
    }

    private void handleTableSection(HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter, Element element) {
        htmlNodeConverterContext.pushState(element);
        while (true) {
            Node next = htmlNodeConverterContext.next();
            if (next == null) {
                htmlNodeConverterContext.popState(htmlMarkdownWriter);
                return;
            }
            if (next.nodeName().equalsIgnoreCase(FlexmarkHtmlConverter.TR_NODE)) {
                Element element2 = (Element) next;
                Elements children = element2.children();
                boolean header = this.myTable.getHeader();
                if (!children.isEmpty() && children.get(0).tagName().equalsIgnoreCase(FlexmarkHtmlConverter.TH_NODE)) {
                    this.myTable.setHeader(true);
                }
                if (this.myTable.getHeader() && this.myTable.body.rows.size() > 0) {
                    if (this.myHtmlConverterOptions.ignoreTableHeadingAfterRows) {
                        this.myTableSuppressColumns = true;
                    } else {
                        this.myTable.setHeader(false);
                    }
                }
                handleTableRow(htmlNodeConverterContext, htmlMarkdownWriter, element2);
                this.myTableSuppressColumns = false;
                this.myTable.setHeader(header);
            }
        }
    }

    public static boolean hasChildrenOfType(Element element, Set<String> set) {
        Elements children = element.children();
        int size = children.size();
        int i6 = 0;
        while (i6 < size) {
            Element element2 = children.get(i6);
            i6++;
            if (set.contains(element2.nodeName().toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    private boolean hasIntersection(Set<String> set, String[] strArr) {
        for (String str : strArr) {
            if (set.contains(str)) {
                return true;
            }
        }
        return false;
    }

    private boolean hasListItemParent(Element element) {
        for (Element parent = element.parent(); parent != null; parent = parent.parent()) {
            if (parent.tagName().equalsIgnoreCase(FlexmarkHtmlConverter.LI_NODE)) {
                return true;
            }
        }
        return false;
    }

    private boolean haveListItemAncestor(Node node) {
        for (Node parent = node.parent(); parent != null; parent = parent.parent()) {
            if (parent.nodeName().toLowerCase().equals(FlexmarkHtmlConverter.LI_NODE)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isFirstChild(Element element) {
        Iterator<Node> it = element.parent().childNodes().iterator();
        while (it.hasNext()) {
            Node next = it.next();
            if (!(next instanceof Element)) {
                if (next.nodeName().equals(FlexmarkHtmlConverter.TEXT_NODE) && !next.outerHtml().trim().isEmpty()) {
                    break;
                }
            } else {
                return element == next;
            }
        }
        return false;
    }

    private boolean isHeading(Element element) {
        if (element != null) {
            String lowerCase = element.tagName().toLowerCase();
            for (String str : FlexmarkHtmlConverter.HEADING_NODES) {
                if (lowerCase.equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isLastChild(Element element) {
        Elements children = element.parent().children();
        int size = children.size();
        while (true) {
            int i6 = size - 1;
            if (size <= 0) {
                return false;
            }
            Element element2 = children.get(i6);
            if (element2 instanceof Element) {
                return element == element2;
            }
            size = i6;
        }
    }

    public static /* synthetic */ boolean lambda$getMaxRepeatedChars$0(char c6, int i6) {
        return i6 == c6;
    }

    public /* synthetic */ void lambda$processCode$1(HtmlNodeConverterContext htmlNodeConverterContext, Element element, CharSequence charSequence) {
        if (this.myHtmlConverterOptions.extInlineCode.isTextOnly()) {
            charSequence = FlexmarkHtmlConverter.DEFAULT_NODE;
        }
        htmlNodeConverterContext.processTextNodes(element, false, charSequence);
    }

    public /* synthetic */ void lambda$processCode$2(Element element, HtmlNodeConverterContext htmlNodeConverterContext) {
        htmlNodeConverterContext.inlineCode(new j(this, htmlNodeConverterContext, element, RepeatedSequence.repeatOf("`", getMaxRepeatedChars(BasedSequence.of(element.ownText()), '`', 1)), 3));
    }

    public /* synthetic */ void lambda$processDel$3(HtmlMarkdownWriter htmlMarkdownWriter, HtmlNodeConverterContext htmlNodeConverterContext, Element element) {
        boolean z5 = this.myHtmlConverterOptions.preCodePreserveEmphasis;
        String str = FlexmarkHtmlConverter.DEFAULT_NODE;
        if (!z5 && htmlMarkdownWriter.isPreFormatted()) {
            htmlNodeConverterContext.wrapTextNodes(element, FlexmarkHtmlConverter.DEFAULT_NODE, false);
            return;
        }
        if (!this.myHtmlConverterOptions.extInlineDel.isTextOnly()) {
            str = "~~";
        }
        htmlNodeConverterContext.wrapTextNodes(element, str, element.nextElementSibling() != null);
    }

    public /* synthetic */ void lambda$processEmphasis$4(HtmlMarkdownWriter htmlMarkdownWriter, HtmlNodeConverterContext htmlNodeConverterContext, Element element) {
        boolean z5 = this.myHtmlConverterOptions.preCodePreserveEmphasis;
        String str = FlexmarkHtmlConverter.DEFAULT_NODE;
        if (!z5 && htmlMarkdownWriter.isPreFormatted()) {
            htmlNodeConverterContext.wrapTextNodes(element, FlexmarkHtmlConverter.DEFAULT_NODE, false);
            return;
        }
        if (!this.myHtmlConverterOptions.extInlineEmphasis.isTextOnly()) {
            str = "*";
        }
        htmlNodeConverterContext.wrapTextNodes(element, str, element.nextElementSibling() != null);
    }

    public /* synthetic */ void lambda$processIns$5(HtmlMarkdownWriter htmlMarkdownWriter, HtmlNodeConverterContext htmlNodeConverterContext, Element element) {
        boolean z5 = this.myHtmlConverterOptions.preCodePreserveEmphasis;
        String str = FlexmarkHtmlConverter.DEFAULT_NODE;
        if (!z5 && htmlMarkdownWriter.isPreFormatted()) {
            htmlNodeConverterContext.wrapTextNodes(element, FlexmarkHtmlConverter.DEFAULT_NODE, false);
            return;
        }
        if (!this.myHtmlConverterOptions.extInlineIns.isTextOnly()) {
            str = "++";
        }
        htmlNodeConverterContext.wrapTextNodes(element, str, element.nextElementSibling() != null);
    }

    public /* synthetic */ void lambda$processMath$9(HtmlNodeConverterContext htmlNodeConverterContext, Element element) {
        boolean isTextOnly = this.myHtmlConverterOptions.extMath.isTextOnly();
        String str = FlexmarkHtmlConverter.DEFAULT_NODE;
        String str2 = isTextOnly ? FlexmarkHtmlConverter.DEFAULT_NODE : "$`";
        if (!isTextOnly) {
            str = "`$";
        }
        htmlNodeConverterContext.processTextNodes(element, false, str2, str);
    }

    public /* synthetic */ void lambda$processStrong$6(HtmlMarkdownWriter htmlMarkdownWriter, HtmlNodeConverterContext htmlNodeConverterContext, Element element) {
        boolean z5 = this.myHtmlConverterOptions.preCodePreserveEmphasis;
        String str = FlexmarkHtmlConverter.DEFAULT_NODE;
        if (!z5 && htmlMarkdownWriter.isPreFormatted()) {
            htmlNodeConverterContext.wrapTextNodes(element, FlexmarkHtmlConverter.DEFAULT_NODE, false);
            return;
        }
        if (!this.myHtmlConverterOptions.extInlineStrong.isTextOnly()) {
            str = "**";
        }
        htmlNodeConverterContext.wrapTextNodes(element, str, element.nextElementSibling() != null);
    }

    public /* synthetic */ void lambda$processSub$7(HtmlMarkdownWriter htmlMarkdownWriter, HtmlNodeConverterContext htmlNodeConverterContext, Element element) {
        if (this.myHtmlConverterOptions.extInlineSub.isTextOnly() || (!this.myHtmlConverterOptions.preCodePreserveEmphasis && htmlMarkdownWriter.isPreFormatted())) {
            htmlNodeConverterContext.wrapTextNodes(element, FlexmarkHtmlConverter.DEFAULT_NODE, false);
        } else {
            htmlNodeConverterContext.wrapTextNodes(element, "~", false);
        }
    }

    public /* synthetic */ void lambda$processSup$8(HtmlMarkdownWriter htmlMarkdownWriter, HtmlNodeConverterContext htmlNodeConverterContext, Element element) {
        if (this.myHtmlConverterOptions.extInlineSup.isTextOnly() || (!this.myHtmlConverterOptions.preCodePreserveEmphasis && htmlMarkdownWriter.isPreFormatted())) {
            htmlNodeConverterContext.wrapTextNodes(element, FlexmarkHtmlConverter.DEFAULT_NODE, false);
        } else {
            htmlNodeConverterContext.wrapTextNodes(element, "^", false);
        }
    }

    private boolean matchingText(Pattern pattern, String str, String[] strArr) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.matches()) {
            return false;
        }
        if (matcher.groupCount() > 0) {
            strArr[0] = matcher.group(1);
        } else {
            strArr[0] = matcher.group();
        }
        return true;
    }

    public void processA(Element element, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
        Reference orCreateReference;
        int indexOf;
        boolean z5 = false;
        if (!element.hasAttr("href")) {
            if (element.childNodeSize() == 0 && element.parent().tagName().equals("body")) {
                z5 = true;
            }
            htmlNodeConverterContext.processTextNodes(element, z5);
            return;
        }
        LinkConversion linkConversion = this.myHtmlConverterOptions.extInlineLink;
        if (linkConversion.isSuppressed()) {
            return;
        }
        String attr = element.attr("href");
        String url = htmlNodeConverterContext.resolveLink(LinkType.LINK, attr, Boolean.FALSE).getUrl();
        if (htmlMarkdownWriter.isPreFormatted()) {
            int lastIndexOf = url.lastIndexOf(47);
            if (lastIndexOf != -1 && (indexOf = url.indexOf(35, lastIndexOf)) != -1 && lastIndexOf + 1 == indexOf) {
                url = B3.e.n(url.substring(0, lastIndexOf), url.substring(indexOf));
            }
            htmlMarkdownWriter.append((CharSequence) url);
            return;
        }
        if (!linkConversion.isParsed()) {
            if (linkConversion.isSuppressed()) {
                return;
            }
            htmlNodeConverterContext.processWrapped(element, null, true);
            return;
        }
        htmlNodeConverterContext.pushState(element);
        String trim = htmlNodeConverterContext.processTextNodes(element).trim();
        String attr2 = element.hasAttr(Attribute.TITLE_ATTR) ? element.attr(Attribute.TITLE_ATTR) : null;
        if (trim.isEmpty() && url.contains("#") && (isHeading(element.parent()) || url.equals("#") || (htmlNodeConverterContext.getState() != null && htmlNodeConverterContext.getState().getAttributes().get(Attribute.ID_ATTR) != null && !htmlNodeConverterContext.getState().getAttributes().get(Attribute.ID_ATTR).getValue().isEmpty()))) {
            htmlNodeConverterContext.transferIdToParent();
            htmlNodeConverterContext.popState(null);
            return;
        }
        if (this.myHtmlConverterOptions.extractAutoLinks && attr.equals(trim) && (attr2 == null || attr2.isEmpty())) {
            if (this.myHtmlConverterOptions.wrapAutoLinks) {
                htmlMarkdownWriter.append('<');
            }
            htmlMarkdownWriter.append((CharSequence) url);
            if (this.myHtmlConverterOptions.wrapAutoLinks) {
                htmlMarkdownWriter.append(BlockQuoteParser.MARKER_CHAR);
            }
            htmlNodeConverterContext.transferIdToParent();
        } else if (linkConversion.isTextOnly() || url.startsWith("javascript:")) {
            if (attr.equals(trim)) {
                htmlMarkdownWriter.append((CharSequence) url);
            } else {
                htmlMarkdownWriter.append((CharSequence) trim);
            }
        } else if (!linkConversion.isReference() || hasChildrenOfType(element, explicitLinkTextTags) || (orCreateReference = htmlNodeConverterContext.getOrCreateReference(url, trim, attr2)) == null) {
            htmlMarkdownWriter.append('[');
            htmlMarkdownWriter.append((CharSequence) trim);
            htmlMarkdownWriter.append(']');
            ((HtmlMarkdownWriter) htmlMarkdownWriter.append('(')).append((CharSequence) url);
            if (attr2 != null) {
                ((HtmlMarkdownWriter) htmlMarkdownWriter.append(" \"")).append((CharSequence) attr2.replace(SequenceUtils.EOL, this.myHtmlConverterOptions.eolInTitleAttribute).replace("\"", "\\\"")).append('\"');
            }
            htmlMarkdownWriter.append(")");
        } else if (orCreateReference.getReference().equals(trim)) {
            ((HtmlMarkdownWriter) htmlMarkdownWriter.append('[')).append((CharSequence) trim).append((CharSequence) "][]");
        } else {
            ((HtmlMarkdownWriter) htmlMarkdownWriter.append('[')).append((CharSequence) trim).append((CharSequence) "][").append((CharSequence) orCreateReference.getReference()).append(']');
        }
        htmlNodeConverterContext.excludeAttributes("href", Attribute.TITLE_ATTR);
        htmlNodeConverterContext.popState(htmlMarkdownWriter);
    }

    public void processAbbr(Element element, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
        if (element.hasAttr(Attribute.TITLE_ATTR)) {
            this.myAbbreviations.put(htmlNodeConverterContext.processTextNodes(element).trim(), element.attr(Attribute.TITLE_ATTR));
        }
    }

    public void processAside(Element element, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
        if (isFirstChild(element)) {
            htmlMarkdownWriter.line();
        }
        htmlMarkdownWriter.pushPrefix();
        htmlMarkdownWriter.addPrefix("| ");
        htmlNodeConverterContext.renderChildren(element, true, null);
        htmlMarkdownWriter.line();
        htmlMarkdownWriter.popPrefix();
    }

    public void processBlockQuote(Element element, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
        if (isFirstChild(element)) {
            htmlMarkdownWriter.line();
        }
        htmlMarkdownWriter.pushPrefix();
        htmlMarkdownWriter.addPrefix("> ");
        htmlNodeConverterContext.renderChildren(element, true, null);
        htmlMarkdownWriter.line();
        htmlMarkdownWriter.popPrefix();
    }

    public void processBr(Element element, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
        if (htmlMarkdownWriter.isPreFormatted()) {
            htmlMarkdownWriter.append('\n');
            return;
        }
        int options = htmlMarkdownWriter.getOptions();
        htmlMarkdownWriter.setOptions((~(LineAppendable.F_TRIM_TRAILING_WHITESPACE | LineAppendable.F_COLLAPSE_WHITESPACE)) & options);
        if (htmlMarkdownWriter.getPendingEOL() == 0) {
            htmlMarkdownWriter.append(SequenceUtils.SPC, 2).line();
        } else if (htmlMarkdownWriter.getPendingEOL() == 1) {
            if (htmlMarkdownWriter.toString().endsWith("<br />")) {
                if (this.myHtmlConverterOptions.brAsExtraBlankLines) {
                    htmlMarkdownWriter.append("<br />").blankLine();
                }
            } else if (this.myHtmlConverterOptions.brAsParaBreaks) {
                htmlMarkdownWriter.blankLine();
            }
        } else if (this.myHtmlConverterOptions.brAsExtraBlankLines) {
            htmlMarkdownWriter.append("<br />").blankLine();
        }
        htmlMarkdownWriter.setOptions(options);
    }

    public void processCode(Element element, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
        htmlNodeConverterContext.processConditional(this.myHtmlConverterOptions.extInlineCode, element, new c(this, element, htmlNodeConverterContext));
    }

    public void processComment(Comment comment, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
        if (this.myHtmlConverterOptions.renderComments) {
            htmlMarkdownWriter.append("<!--").append((CharSequence) comment.getData()).append((CharSequence) "-->");
        }
    }

    public void processDefault(Node node, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
        htmlNodeConverterContext.renderDefault(node);
    }

    public void processDel(Element element, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
        htmlNodeConverterContext.processConditional(this.myHtmlConverterOptions.extInlineDel, element, new a(this, htmlMarkdownWriter, htmlNodeConverterContext, element, 3));
    }

    public void processDiv(Element element, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
        int lineCountWithPending;
        if (this.myHtmlConverterOptions.divTableProcessing && hasIntersection(element.classNames(), this.myHtmlConverterOptions.divTableRowClasses)) {
            handleDivTable(element, htmlNodeConverterContext, htmlMarkdownWriter);
            return;
        }
        if (!isFirstChild(element)) {
            if (this.myHtmlConverterOptions.divAsParagraph) {
                htmlMarkdownWriter.blankLine();
            } else {
                int pendingEOL = htmlMarkdownWriter.getPendingEOL();
                if (pendingEOL == 0) {
                    htmlMarkdownWriter.lineWithTrailingSpaces(Utils.minLimit(0, 2 - htmlMarkdownWriter.getPendingSpace()));
                } else if (pendingEOL == 1 && (lineCountWithPending = htmlMarkdownWriter.getLineCountWithPending()) > 0) {
                    int i6 = lineCountWithPending - 1;
                    BasedSequence lineContent = htmlMarkdownWriter.getLineContent(i6);
                    int countTrailing = BasedSequence.of(lineContent).countTrailing(CharPredicate.SPACE_TAB);
                    if (countTrailing < 2) {
                        htmlMarkdownWriter.removeLines(i6, lineCountWithPending);
                        htmlMarkdownWriter.append((CharSequence) lineContent);
                        htmlMarkdownWriter.lineWithTrailingSpaces(2 - countTrailing);
                    }
                }
            }
        }
        htmlNodeConverterContext.renderChildren(element, false, null);
        if (isLastChild(element)) {
            return;
        }
        htmlMarkdownWriter.line();
        if (this.myHtmlConverterOptions.divAsParagraph) {
            htmlMarkdownWriter.blankLine();
        }
    }

    public void processDl(Element element, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
        Node next;
        htmlNodeConverterContext.pushState(element);
        boolean z5 = true;
        while (true) {
            boolean z6 = z5;
            while (true) {
                next = htmlNodeConverterContext.next();
                if (next == null) {
                    htmlNodeConverterContext.popState(htmlMarkdownWriter);
                    return;
                }
                String lowerCase = next.nodeName().toLowerCase();
                lowerCase.getClass();
                if (lowerCase.equals(FlexmarkHtmlConverter.DD_NODE)) {
                    handleDefinition((Element) next, htmlNodeConverterContext, htmlMarkdownWriter);
                    z5 = true;
                    z6 = false;
                } else if (!lowerCase.equals(FlexmarkHtmlConverter.DT_NODE)) {
                }
            }
            htmlMarkdownWriter.blankLineIf(z5).lineIf(!z6);
            htmlNodeConverterContext.processTextNodes(next, false);
            htmlMarkdownWriter.line();
            z5 = false;
        }
    }

    public void processEmoji(Element element, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
        EmojiReference.Emoji emojiFromURI;
        if (element.hasAttr("alias")) {
            htmlMarkdownWriter.append(':').append((CharSequence) element.attr("alias")).append(':');
        } else if (!element.hasAttr("fallback-src") || (emojiFromURI = EmojiShortcuts.getEmojiFromURI(element.attr("fallback-src"))) == null) {
            htmlNodeConverterContext.renderDefault(element);
        } else {
            htmlMarkdownWriter.append(':').append((CharSequence) emojiFromURI.shortcut).append(':');
        }
    }

    public void processEmphasis(Element element, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
        htmlNodeConverterContext.processConditional(this.myHtmlConverterOptions.extInlineEmphasis, element, new a(this, htmlMarkdownWriter, htmlNodeConverterContext, element, 2));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void processHeading(Element element, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
        char c6;
        boolean z5;
        String lowerCase = element.nodeName().toLowerCase();
        int i6 = 5;
        switch (lowerCase.hashCode()) {
            case 3273:
                if (lowerCase.equals(FlexmarkHtmlConverter.H1_NODE)) {
                    c6 = 0;
                    break;
                }
                c6 = 65535;
                break;
            case 3274:
                if (lowerCase.equals(FlexmarkHtmlConverter.H2_NODE)) {
                    c6 = 1;
                    break;
                }
                c6 = 65535;
                break;
            case 3275:
                if (lowerCase.equals(FlexmarkHtmlConverter.H3_NODE)) {
                    c6 = 2;
                    break;
                }
                c6 = 65535;
                break;
            case 3276:
                if (lowerCase.equals(FlexmarkHtmlConverter.H4_NODE)) {
                    c6 = 3;
                    break;
                }
                c6 = 65535;
                break;
            case 3277:
                if (lowerCase.equals(FlexmarkHtmlConverter.H5_NODE)) {
                    c6 = 4;
                    break;
                }
                c6 = 65535;
                break;
            case 3278:
                if (lowerCase.equals(FlexmarkHtmlConverter.H6_NODE)) {
                    c6 = 5;
                    break;
                }
                c6 = 65535;
                break;
            default:
                c6 = 65535;
                break;
        }
        if (c6 == 0) {
            z5 = this.myHtmlConverterOptions.skipHeading1;
            i6 = 1;
        } else if (c6 == 1) {
            z5 = this.myHtmlConverterOptions.skipHeading2;
            i6 = 2;
        } else if (c6 == 2) {
            z5 = this.myHtmlConverterOptions.skipHeading3;
            i6 = 3;
        } else if (c6 == 3) {
            z5 = this.myHtmlConverterOptions.skipHeading4;
            i6 = 4;
        } else if (c6 != 4) {
            z5 = this.myHtmlConverterOptions.skipHeading6;
            i6 = 6;
        } else {
            z5 = this.myHtmlConverterOptions.skipHeading5;
        }
        String trim = htmlNodeConverterContext.processTextNodes(element).trim();
        if (trim.isEmpty()) {
            return;
        }
        htmlMarkdownWriter.blankLine();
        if (z5) {
            htmlMarkdownWriter.append((CharSequence) trim);
            return;
        }
        if (!this.myHtmlConverterOptions.setextHeadings || i6 > 2) {
            htmlMarkdownWriter.append('#', i6).append(SequenceUtils.SPC);
            htmlMarkdownWriter.append((CharSequence) trim);
            htmlNodeConverterContext.outputAttributes(htmlMarkdownWriter, SequenceUtils.SPACE);
        } else {
            htmlMarkdownWriter.append((CharSequence) trim);
            htmlMarkdownWriter.line().append(i6 == 1 ? '=' : '-', Utils.minLimit(trim.length() + htmlNodeConverterContext.outputAttributes(htmlMarkdownWriter, SequenceUtils.SPACE), this.myHtmlConverterOptions.minSetextHeadingMarkerLength));
        }
        htmlMarkdownWriter.blankLine();
    }

    public void processHr(Element element, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
        htmlMarkdownWriter.blankLine().append((CharSequence) this.myHtmlConverterOptions.thematicBreak).blankLine();
    }

    public void processImg(Element element, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
        int indexOf;
        if (element.hasAttr("src")) {
            String attr = element.attr("src");
            EmojiReference.Emoji emojiFromURI = EmojiShortcuts.getEmojiFromURI(attr);
            if (emojiFromURI == null && element.hasAttr("alt")) {
                String attr2 = element.attr("alt");
                if (attr2.startsWith(EMOJI_ALT_PREFIX) && (indexOf = attr2.indexOf(":", 6)) > 0) {
                    emojiFromURI = EmojiShortcuts.getEmojiFromShortcut(attr2.substring(indexOf + 1));
                }
            }
            if (emojiFromURI != null && emojiFromURI.shortcut != null) {
                htmlMarkdownWriter.append(':').append((CharSequence) emojiFromURI.shortcut).append(':');
                return;
            }
            LinkConversion linkConversion = this.myHtmlConverterOptions.extInlineImage;
            if (linkConversion.isSuppressed()) {
                return;
            }
            if (!linkConversion.isParsed()) {
                if (linkConversion.isSuppressed()) {
                    return;
                }
                htmlNodeConverterContext.processWrapped(element, null, false);
                return;
            }
            String replace = !element.hasAttr("alt") ? null : element.attr("alt").trim().replace("[", "\\[").replace("]", "\\]");
            if (replace != null && replace.isEmpty()) {
                replace = null;
            }
            String replace2 = !element.hasAttr(Attribute.TITLE_ATTR) ? null : element.attr(Attribute.TITLE_ATTR).replace(SequenceUtils.EOL, this.myHtmlConverterOptions.eolInTitleAttribute).replace("\"", "\\\"");
            String str = (replace2 == null || !replace2.isEmpty()) ? replace2 : null;
            if (linkConversion.isTextOnly()) {
                if (replace != null) {
                    htmlMarkdownWriter.append((CharSequence) replace);
                    return;
                } else {
                    if (str != null) {
                        htmlMarkdownWriter.append((CharSequence) str);
                        return;
                    }
                    return;
                }
            }
            String url = htmlNodeConverterContext.resolveLink(LinkType.IMAGE, attr, Boolean.FALSE).getUrl();
            int indexOf2 = url.indexOf(63);
            boolean z5 = indexOf2 > 0 && (indexOf2 < 0 ? indexOf2 : url.indexOf("%0A", indexOf2)) > 0;
            if (linkConversion.isReference() && !z5) {
                Reference orCreateReference = htmlNodeConverterContext.getOrCreateReference(url, replace == null ? "image" : replace, str);
                if (orCreateReference != null) {
                    if (replace == null || orCreateReference.getReference().equals(replace)) {
                        htmlMarkdownWriter.append("![").append((CharSequence) orCreateReference.getReference()).append((CharSequence) "][]");
                        return;
                    } else {
                        htmlMarkdownWriter.append("![").append((CharSequence) replace).append((CharSequence) "][").append((CharSequence) orCreateReference.getReference()).append((CharSequence) "]");
                        return;
                    }
                }
            }
            htmlMarkdownWriter.append("![");
            if (replace != null) {
                htmlMarkdownWriter.append((CharSequence) replace);
            }
            htmlMarkdownWriter.append(']').append('(');
            if (z5) {
                int i6 = indexOf2 + 1;
                htmlMarkdownWriter.append((CharSequence) url, 0, i6);
                htmlMarkdownWriter.line().append((CharSequence) Utils.urlDecode(url.substring(i6).replace("+", "%2B"), "UTF8"));
            } else {
                htmlMarkdownWriter.append((CharSequence) url);
            }
            if (str != null) {
                htmlMarkdownWriter.append(" \"").append((CharSequence) str).append('\"');
            }
            htmlMarkdownWriter.append(")");
        }
    }

    public void processInput(Element element, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
        Element firstElementSibling = element.firstElementSibling();
        if (!((firstElementSibling == null || element == firstElementSibling) ? element.parent().tagName().equalsIgnoreCase(FlexmarkHtmlConverter.LI_NODE) : false) || !element.hasAttr("type") || !"checkbox".equalsIgnoreCase(element.attr("type"))) {
            htmlNodeConverterContext.renderDefault(element);
        } else if (element.hasAttr("checked")) {
            htmlMarkdownWriter.append("[x] ");
        } else {
            htmlMarkdownWriter.append("[ ] ");
        }
    }

    public void processIns(Element element, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
        htmlNodeConverterContext.processConditional(this.myHtmlConverterOptions.extInlineIns, element, new a(this, htmlMarkdownWriter, htmlNodeConverterContext, element, 1));
    }

    public void processLi(Element element, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
        handleList(htmlNodeConverterContext, htmlMarkdownWriter, element, false, true, false);
    }

    public void processMath(Element element, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
        htmlNodeConverterContext.processConditional(this.myHtmlConverterOptions.extMath, element, new c(this, htmlNodeConverterContext, element));
    }

    public void processOl(Element element, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
        handleList(htmlNodeConverterContext, htmlMarkdownWriter, element, true, false, false);
    }

    public void processP(Element element, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
        boolean equalsIgnoreCase;
        boolean equalsIgnoreCase2;
        Element firstElementSibling = element.firstElementSibling();
        if (firstElementSibling == null || element == firstElementSibling) {
            String tagName = element.parent().tagName();
            equalsIgnoreCase = tagName.equalsIgnoreCase(FlexmarkHtmlConverter.LI_NODE);
            equalsIgnoreCase2 = tagName.equalsIgnoreCase(FlexmarkHtmlConverter.DD_NODE);
        } else {
            equalsIgnoreCase2 = false;
            equalsIgnoreCase = false;
        }
        htmlMarkdownWriter.blankLineIf((equalsIgnoreCase || equalsIgnoreCase2 || isFirstChild(element)) ? false : true);
        if (element.childNodeSize() != 0) {
            htmlNodeConverterContext.processTextNodes(element, false);
        } else if (this.myHtmlConverterOptions.brAsExtraBlankLines) {
            htmlMarkdownWriter.append("<br />").blankLine();
        }
        htmlMarkdownWriter.line();
        if (equalsIgnoreCase || equalsIgnoreCase2) {
            htmlMarkdownWriter.tailBlankLine();
        }
    }

    public void processPre(Element element, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
        CharSequence charSequence;
        htmlNodeConverterContext.pushState(element);
        HtmlNodeConverterContext subContext = htmlNodeConverterContext.getSubContext();
        subContext.getMarkdown().setOptions(htmlMarkdownWriter.getOptions() & (~(LineAppendable.F_COLLAPSE_WHITESPACE | LineAppendable.F_TRIM_TRAILING_WHITESPACE)));
        subContext.getMarkdown().openPreFormatted(false);
        String str = FlexmarkHtmlConverter.DEFAULT_NODE;
        boolean z5 = false;
        while (true) {
            Node next = htmlNodeConverterContext.next();
            charSequence = SequenceUtils.EOL;
            if (next == null) {
                break;
            }
            if (next.nodeName().equalsIgnoreCase(FlexmarkHtmlConverter.CODE_NODE) || next.nodeName().equalsIgnoreCase("tt")) {
                Element element2 = (Element) next;
                subContext.inlineCode(new y(13, subContext, element2));
                if (str.isEmpty()) {
                    str = Utils.removePrefix(element2.className(), "language-");
                }
                z5 = true;
            } else if (next.nodeName().equalsIgnoreCase(FlexmarkHtmlConverter.BR_NODE)) {
                subContext.getMarkdown().append(SequenceUtils.EOL);
            } else if (next.nodeName().equalsIgnoreCase(FlexmarkHtmlConverter.TEXT_NODE)) {
                subContext.getMarkdown().append((CharSequence) ((TextNode) next).getWholeText());
            } else {
                subContext.renderChildren(next, false, null);
            }
        }
        subContext.getMarkdown().closePreFormatted();
        String lineAppendable = subContext.getMarkdown().toString(TableCell.NOT_TRACKED, 2);
        CharSequence repeatOf = RepeatedSequence.repeatOf("`", getMaxRepeatedChars(lineAppendable, '`', 3));
        if (this.myHtmlConverterOptions.skipFencedCode || (str.isEmpty() && !lineAppendable.trim().isEmpty() && z5)) {
            htmlMarkdownWriter.blankLine();
            htmlMarkdownWriter.pushPrefix();
            htmlMarkdownWriter.addPrefix(this.myHtmlConverterOptions.codeIndent);
            htmlMarkdownWriter.openPreFormatted(true);
            if (!lineAppendable.isEmpty()) {
                charSequence = lineAppendable;
            }
            htmlMarkdownWriter.append(charSequence);
            htmlMarkdownWriter.closePreFormatted();
            htmlMarkdownWriter.line();
            htmlMarkdownWriter.tailBlankLine();
            htmlMarkdownWriter.popPrefix();
        } else {
            ((HtmlMarkdownWriter) htmlMarkdownWriter.blankLine()).append(repeatOf);
            if (!str.isEmpty()) {
                htmlMarkdownWriter.append((CharSequence) str);
            }
            htmlMarkdownWriter.line();
            htmlMarkdownWriter.openPreFormatted(true);
            if (!lineAppendable.isEmpty()) {
                charSequence = lineAppendable;
            }
            htmlMarkdownWriter.append(charSequence);
            htmlMarkdownWriter.closePreFormatted();
            ((HtmlMarkdownWriter) htmlMarkdownWriter.line()).append(repeatOf).line();
            htmlMarkdownWriter.tailBlankLine();
        }
        htmlNodeConverterContext.popState(htmlMarkdownWriter);
    }

    public void processSpan(Element element, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
        if (!element.hasAttr(Attribute.STYLE_ATTR) || !element.attr(Attribute.STYLE_ATTR).equals("mso-list:Ignore")) {
            Objects.requireNonNull(htmlNodeConverterContext);
            htmlNodeConverterContext.renderChildren(element, true, new h(htmlNodeConverterContext, 8));
            return;
        }
        String[] strArr = {"1"};
        String processTextNodes = htmlNodeConverterContext.processTextNodes(element);
        if (matchingText(NUMERIC_DOT_LIST_PAT, processTextNodes, strArr)) {
            htmlMarkdownWriter.append((CharSequence) processTextNodes).append(SequenceUtils.SPC);
        } else if (matchingText(NUMERIC_PAREN_LIST_PAT, processTextNodes, strArr)) {
            if (this.myHtmlConverterOptions.dotOnlyNumericLists) {
                htmlMarkdownWriter.append((CharSequence) strArr[0]).append((CharSequence) ". ");
            } else {
                htmlMarkdownWriter.append((CharSequence) strArr[0]).append((CharSequence) ") ");
            }
        } else if (matchingText(NON_NUMERIC_DOT_LIST_PAT, processTextNodes, strArr)) {
            htmlMarkdownWriter.append((CharSequence) convertNumeric(strArr[0])).append((CharSequence) ". ");
            if (this.myHtmlConverterOptions.commentOriginalNonNumericListItem) {
                htmlMarkdownWriter.append(" <!-- ").append((CharSequence) strArr[0]).append((CharSequence) " -->");
            }
        } else if (matchingText(NON_NUMERIC_PAREN_LIST_PAT, processTextNodes, strArr)) {
            if (this.myHtmlConverterOptions.dotOnlyNumericLists) {
                htmlMarkdownWriter.append((CharSequence) convertNumeric(strArr[0])).append((CharSequence) ". ");
                if (this.myHtmlConverterOptions.commentOriginalNonNumericListItem) {
                    htmlMarkdownWriter.append(" <!-- ").append((CharSequence) strArr[0]).append((CharSequence) " -->");
                }
            } else {
                htmlMarkdownWriter.append((CharSequence) convertNumeric(strArr[0])).append((CharSequence) ") ");
                if (this.myHtmlConverterOptions.commentOriginalNonNumericListItem) {
                    htmlMarkdownWriter.append(" <!-- ").append((CharSequence) strArr[0]).append((CharSequence) " -->");
                }
            }
        } else if (BULLET_LIST_PAT.matcher(processTextNodes).matches()) {
            htmlMarkdownWriter.append("* ");
        } else {
            htmlMarkdownWriter.append("* ").append((CharSequence) processTextNodes);
        }
        htmlNodeConverterContext.transferIdToParent();
    }

    public void processStrong(Element element, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
        htmlNodeConverterContext.processConditional(this.myHtmlConverterOptions.extInlineStrong, element, new a(this, htmlMarkdownWriter, htmlNodeConverterContext, element, 5));
    }

    public void processSub(Element element, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
        htmlNodeConverterContext.processConditional(this.myHtmlConverterOptions.extInlineSub, element, new a(this, htmlMarkdownWriter, htmlNodeConverterContext, element, 0));
    }

    public void processSup(Element element, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
        htmlNodeConverterContext.processConditional(this.myHtmlConverterOptions.extInlineSup, element, new a(this, htmlMarkdownWriter, htmlNodeConverterContext, element, 4));
    }

    public void processSvg(Element element, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
        if (element.hasClass("octicon")) {
            return;
        }
        htmlNodeConverterContext.renderDefault(element);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0015 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void processTable(org.jsoup.nodes.Element r7, com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext r8, com.vladsch.flexmark.html2md.converter.HtmlMarkdownWriter r9) {
        /*
            r6 = this;
            com.vladsch.flexmark.util.format.MarkdownTable r0 = r6.myTable
            r8.pushState(r7)
            com.vladsch.flexmark.util.format.MarkdownTable r7 = new com.vladsch.flexmark.util.format.MarkdownTable
            com.vladsch.flexmark.html2md.converter.HtmlConverterOptions r1 = r6.myHtmlConverterOptions
            com.vladsch.flexmark.util.format.TableFormatOptions r1 = r1.tableOptions
            java.lang.String r2 = ""
            r7.<init>(r2, r1)
            r6.myTable = r7
            r7 = 0
            r6.myTableSuppressColumns = r7
        L15:
            org.jsoup.nodes.Node r1 = r8.next()
            if (r1 == 0) goto La5
            java.lang.String r2 = r1.nodeName()
            java.lang.String r2 = r2.toLowerCase()
            r2.getClass()
            int r3 = r2.hashCode()
            r4 = 1
            r5 = -1
            switch(r3) {
                case 3710: goto L51;
                case 110157846: goto L46;
                case 110326868: goto L3b;
                case 552573414: goto L30;
                default: goto L2f;
            }
        L2f:
            goto L5b
        L30:
            java.lang.String r3 = "caption"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L39
            goto L5b
        L39:
            r5 = 3
            goto L5b
        L3b:
            java.lang.String r3 = "thead"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L44
            goto L5b
        L44:
            r5 = 2
            goto L5b
        L46:
            java.lang.String r3 = "tbody"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L4f
            goto L5b
        L4f:
            r5 = r4
            goto L5b
        L51:
            java.lang.String r3 = "tr"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L5a
            goto L5b
        L5a:
            r5 = r7
        L5b:
            switch(r5) {
                case 0: goto L7b;
                case 1: goto L70;
                case 2: goto L65;
                case 3: goto L5f;
                default: goto L5e;
            }
        L5e:
            goto L15
        L5f:
            org.jsoup.nodes.Element r1 = (org.jsoup.nodes.Element) r1
            r6.handleTableCaption(r1, r8, r9)
            goto L15
        L65:
            com.vladsch.flexmark.util.format.MarkdownTable r2 = r6.myTable
            r2.setHeader(r4)
            org.jsoup.nodes.Element r1 = (org.jsoup.nodes.Element) r1
            r6.handleTableSection(r8, r9, r1)
            goto L15
        L70:
            com.vladsch.flexmark.util.format.MarkdownTable r2 = r6.myTable
            r2.setHeader(r7)
            org.jsoup.nodes.Element r1 = (org.jsoup.nodes.Element) r1
            r6.handleTableSection(r8, r9, r1)
            goto L15
        L7b:
            org.jsoup.nodes.Element r1 = (org.jsoup.nodes.Element) r1
            org.jsoup.select.Elements r2 = r1.children()
            com.vladsch.flexmark.util.format.MarkdownTable r3 = r6.myTable
            boolean r5 = r2.isEmpty()
            if (r5 != 0) goto L9c
            java.lang.Object r2 = r2.get(r7)
            org.jsoup.nodes.Element r2 = (org.jsoup.nodes.Element) r2
            java.lang.String r2 = r2.tagName()
            java.lang.String r5 = "th"
            boolean r2 = r2.equalsIgnoreCase(r5)
            if (r2 == 0) goto L9c
            goto L9d
        L9c:
            r4 = r7
        L9d:
            r3.setHeader(r4)
            r6.handleTableRow(r8, r9, r1)
            goto L15
        La5:
            com.vladsch.flexmark.util.format.MarkdownTable r7 = r6.myTable
            r7.finalizeTable()
            com.vladsch.flexmark.util.format.MarkdownTable r7 = r6.myTable
            int r7 = r7.getMaxColumns()
            if (r7 <= 0) goto Lbd
            r9.blankLine()
            com.vladsch.flexmark.util.format.MarkdownTable r7 = r6.myTable
            r7.appendTable(r9)
            r9.tailBlankLine()
        Lbd:
            r6.myTable = r0
            r8.popState(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vladsch.flexmark.html2md.converter.internal.HtmlConverterCoreNodeRenderer.processTable(org.jsoup.nodes.Element, com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext, com.vladsch.flexmark.html2md.converter.HtmlMarkdownWriter):void");
    }

    public void processText(TextNode textNode, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
        if (htmlMarkdownWriter.isPreFormatted()) {
            htmlMarkdownWriter.append((CharSequence) htmlNodeConverterContext.prepareText(textNode.getWholeText(), true));
            return;
        }
        String prepareText = htmlNodeConverterContext.prepareText(textNode.text());
        if (htmlMarkdownWriter.offsetWithPending() == 0 && prepareText.trim().isEmpty()) {
            return;
        }
        htmlMarkdownWriter.append((CharSequence) prepareText);
    }

    public void processUl(Element element, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
        handleList(htmlNodeConverterContext, htmlMarkdownWriter, element, false, false, false);
    }

    public void processUnwrapped(Node node, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
        htmlNodeConverterContext.processUnwrapped(node);
    }

    public void processWrapped(Node node, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
        htmlNodeConverterContext.processWrapped(node, Boolean.FALSE, false);
    }

    @Override // com.vladsch.flexmark.html2md.converter.PhasedHtmlNodeRenderer
    public Set<HtmlConverterPhase> getHtmlConverterPhases() {
        return new HashSet(Arrays.asList(HtmlConverterPhase.COLLECT, HtmlConverterPhase.DOCUMENT_BOTTOM));
    }

    @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeRenderer
    public Set<HtmlNodeRendererHandler<?>> getHtmlNodeRendererHandlers() {
        final int i6 = 29;
        HtmlNodeRendererHandler htmlNodeRendererHandler = new HtmlNodeRendererHandler(FlexmarkHtmlConverter.COMMENT_NODE, Comment.class, new CustomHtmlNodeRenderer(this) { // from class: com.vladsch.flexmark.html2md.converter.internal.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HtmlConverterCoreNodeRenderer f11333b;

            {
                this.f11333b = this;
            }

            @Override // com.vladsch.flexmark.html2md.converter.CustomHtmlNodeRenderer
            public final void render(Node node, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
                switch (i6) {
                    case 0:
                        this.f11333b.processHeading((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 1:
                        this.f11333b.processHr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 2:
                        this.f11333b.processA((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 3:
                        this.f11333b.processImg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 4:
                        this.f11333b.processInput((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11333b.processIns((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 6:
                        this.f11333b.processLi((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 7:
                        this.f11333b.processMath((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 8:
                        this.f11333b.processOl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11333b.processP((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11333b.processPre((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 11:
                        this.f11333b.processSpan((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 12:
                        this.f11333b.processAbbr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 13:
                        this.f11333b.processDel((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 14:
                        this.f11333b.processStrong((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 15:
                        this.f11333b.processSub((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11333b.processSup((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 17:
                        this.f11333b.processSvg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 18:
                        this.f11333b.processTable((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 19:
                        this.f11333b.processUl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 20:
                        this.f11333b.processText((TextNode) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 21:
                        this.f11333b.processDefault(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 22:
                        this.f11333b.processAside((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 23:
                        this.f11333b.processUnwrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 24:
                        this.f11333b.processWrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 25:
                        this.f11333b.processBlockQuote((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 26:
                        this.f11333b.processBr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 27:
                        this.f11333b.processCode((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 28:
                        this.f11333b.processDiv((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    default:
                        this.f11333b.processComment((Comment) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                }
            }
        });
        final int i7 = 2;
        HtmlNodeRendererHandler htmlNodeRendererHandler2 = new HtmlNodeRendererHandler(FlexmarkHtmlConverter.A_NODE, Element.class, new CustomHtmlNodeRenderer(this) { // from class: com.vladsch.flexmark.html2md.converter.internal.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HtmlConverterCoreNodeRenderer f11333b;

            {
                this.f11333b = this;
            }

            @Override // com.vladsch.flexmark.html2md.converter.CustomHtmlNodeRenderer
            public final void render(Node node, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
                switch (i7) {
                    case 0:
                        this.f11333b.processHeading((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 1:
                        this.f11333b.processHr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 2:
                        this.f11333b.processA((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 3:
                        this.f11333b.processImg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 4:
                        this.f11333b.processInput((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11333b.processIns((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 6:
                        this.f11333b.processLi((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 7:
                        this.f11333b.processMath((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 8:
                        this.f11333b.processOl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11333b.processP((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11333b.processPre((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 11:
                        this.f11333b.processSpan((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 12:
                        this.f11333b.processAbbr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 13:
                        this.f11333b.processDel((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 14:
                        this.f11333b.processStrong((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 15:
                        this.f11333b.processSub((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11333b.processSup((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 17:
                        this.f11333b.processSvg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 18:
                        this.f11333b.processTable((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 19:
                        this.f11333b.processUl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 20:
                        this.f11333b.processText((TextNode) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 21:
                        this.f11333b.processDefault(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 22:
                        this.f11333b.processAside((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 23:
                        this.f11333b.processUnwrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 24:
                        this.f11333b.processWrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 25:
                        this.f11333b.processBlockQuote((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 26:
                        this.f11333b.processBr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 27:
                        this.f11333b.processCode((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 28:
                        this.f11333b.processDiv((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    default:
                        this.f11333b.processComment((Comment) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                }
            }
        });
        final int i8 = 12;
        HtmlNodeRendererHandler htmlNodeRendererHandler3 = new HtmlNodeRendererHandler(FlexmarkHtmlConverter.ABBR_NODE, Element.class, new CustomHtmlNodeRenderer(this) { // from class: com.vladsch.flexmark.html2md.converter.internal.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HtmlConverterCoreNodeRenderer f11333b;

            {
                this.f11333b = this;
            }

            @Override // com.vladsch.flexmark.html2md.converter.CustomHtmlNodeRenderer
            public final void render(Node node, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
                switch (i8) {
                    case 0:
                        this.f11333b.processHeading((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 1:
                        this.f11333b.processHr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 2:
                        this.f11333b.processA((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 3:
                        this.f11333b.processImg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 4:
                        this.f11333b.processInput((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11333b.processIns((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 6:
                        this.f11333b.processLi((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 7:
                        this.f11333b.processMath((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 8:
                        this.f11333b.processOl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11333b.processP((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11333b.processPre((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 11:
                        this.f11333b.processSpan((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 12:
                        this.f11333b.processAbbr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 13:
                        this.f11333b.processDel((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 14:
                        this.f11333b.processStrong((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 15:
                        this.f11333b.processSub((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11333b.processSup((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 17:
                        this.f11333b.processSvg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 18:
                        this.f11333b.processTable((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 19:
                        this.f11333b.processUl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 20:
                        this.f11333b.processText((TextNode) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 21:
                        this.f11333b.processDefault(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 22:
                        this.f11333b.processAside((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 23:
                        this.f11333b.processUnwrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 24:
                        this.f11333b.processWrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 25:
                        this.f11333b.processBlockQuote((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 26:
                        this.f11333b.processBr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 27:
                        this.f11333b.processCode((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 28:
                        this.f11333b.processDiv((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    default:
                        this.f11333b.processComment((Comment) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                }
            }
        });
        final int i9 = 22;
        HtmlNodeRendererHandler htmlNodeRendererHandler4 = new HtmlNodeRendererHandler(FlexmarkHtmlConverter.ASIDE_NODE, Element.class, new CustomHtmlNodeRenderer(this) { // from class: com.vladsch.flexmark.html2md.converter.internal.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HtmlConverterCoreNodeRenderer f11333b;

            {
                this.f11333b = this;
            }

            @Override // com.vladsch.flexmark.html2md.converter.CustomHtmlNodeRenderer
            public final void render(Node node, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
                switch (i9) {
                    case 0:
                        this.f11333b.processHeading((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 1:
                        this.f11333b.processHr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 2:
                        this.f11333b.processA((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 3:
                        this.f11333b.processImg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 4:
                        this.f11333b.processInput((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11333b.processIns((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 6:
                        this.f11333b.processLi((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 7:
                        this.f11333b.processMath((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 8:
                        this.f11333b.processOl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11333b.processP((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11333b.processPre((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 11:
                        this.f11333b.processSpan((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 12:
                        this.f11333b.processAbbr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 13:
                        this.f11333b.processDel((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 14:
                        this.f11333b.processStrong((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 15:
                        this.f11333b.processSub((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11333b.processSup((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 17:
                        this.f11333b.processSvg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 18:
                        this.f11333b.processTable((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 19:
                        this.f11333b.processUl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 20:
                        this.f11333b.processText((TextNode) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 21:
                        this.f11333b.processDefault(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 22:
                        this.f11333b.processAside((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 23:
                        this.f11333b.processUnwrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 24:
                        this.f11333b.processWrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 25:
                        this.f11333b.processBlockQuote((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 26:
                        this.f11333b.processBr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 27:
                        this.f11333b.processCode((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 28:
                        this.f11333b.processDiv((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    default:
                        this.f11333b.processComment((Comment) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                }
            }
        });
        final int i10 = 14;
        HtmlNodeRendererHandler htmlNodeRendererHandler5 = new HtmlNodeRendererHandler(FlexmarkHtmlConverter.B_NODE, Element.class, new CustomHtmlNodeRenderer(this) { // from class: com.vladsch.flexmark.html2md.converter.internal.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HtmlConverterCoreNodeRenderer f11333b;

            {
                this.f11333b = this;
            }

            @Override // com.vladsch.flexmark.html2md.converter.CustomHtmlNodeRenderer
            public final void render(Node node, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
                switch (i10) {
                    case 0:
                        this.f11333b.processHeading((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 1:
                        this.f11333b.processHr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 2:
                        this.f11333b.processA((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 3:
                        this.f11333b.processImg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 4:
                        this.f11333b.processInput((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11333b.processIns((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 6:
                        this.f11333b.processLi((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 7:
                        this.f11333b.processMath((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 8:
                        this.f11333b.processOl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11333b.processP((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11333b.processPre((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 11:
                        this.f11333b.processSpan((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 12:
                        this.f11333b.processAbbr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 13:
                        this.f11333b.processDel((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 14:
                        this.f11333b.processStrong((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 15:
                        this.f11333b.processSub((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11333b.processSup((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 17:
                        this.f11333b.processSvg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 18:
                        this.f11333b.processTable((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 19:
                        this.f11333b.processUl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 20:
                        this.f11333b.processText((TextNode) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 21:
                        this.f11333b.processDefault(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 22:
                        this.f11333b.processAside((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 23:
                        this.f11333b.processUnwrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 24:
                        this.f11333b.processWrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 25:
                        this.f11333b.processBlockQuote((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 26:
                        this.f11333b.processBr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 27:
                        this.f11333b.processCode((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 28:
                        this.f11333b.processDiv((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    default:
                        this.f11333b.processComment((Comment) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                }
            }
        });
        final int i11 = 25;
        HtmlNodeRendererHandler htmlNodeRendererHandler6 = new HtmlNodeRendererHandler(FlexmarkHtmlConverter.BLOCKQUOTE_NODE, Element.class, new CustomHtmlNodeRenderer(this) { // from class: com.vladsch.flexmark.html2md.converter.internal.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HtmlConverterCoreNodeRenderer f11333b;

            {
                this.f11333b = this;
            }

            @Override // com.vladsch.flexmark.html2md.converter.CustomHtmlNodeRenderer
            public final void render(Node node, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
                switch (i11) {
                    case 0:
                        this.f11333b.processHeading((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 1:
                        this.f11333b.processHr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 2:
                        this.f11333b.processA((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 3:
                        this.f11333b.processImg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 4:
                        this.f11333b.processInput((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11333b.processIns((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 6:
                        this.f11333b.processLi((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 7:
                        this.f11333b.processMath((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 8:
                        this.f11333b.processOl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11333b.processP((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11333b.processPre((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 11:
                        this.f11333b.processSpan((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 12:
                        this.f11333b.processAbbr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 13:
                        this.f11333b.processDel((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 14:
                        this.f11333b.processStrong((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 15:
                        this.f11333b.processSub((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11333b.processSup((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 17:
                        this.f11333b.processSvg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 18:
                        this.f11333b.processTable((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 19:
                        this.f11333b.processUl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 20:
                        this.f11333b.processText((TextNode) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 21:
                        this.f11333b.processDefault(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 22:
                        this.f11333b.processAside((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 23:
                        this.f11333b.processUnwrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 24:
                        this.f11333b.processWrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 25:
                        this.f11333b.processBlockQuote((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 26:
                        this.f11333b.processBr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 27:
                        this.f11333b.processCode((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 28:
                        this.f11333b.processDiv((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    default:
                        this.f11333b.processComment((Comment) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                }
            }
        });
        final int i12 = 26;
        HtmlNodeRendererHandler htmlNodeRendererHandler7 = new HtmlNodeRendererHandler(FlexmarkHtmlConverter.BR_NODE, Element.class, new CustomHtmlNodeRenderer(this) { // from class: com.vladsch.flexmark.html2md.converter.internal.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HtmlConverterCoreNodeRenderer f11333b;

            {
                this.f11333b = this;
            }

            @Override // com.vladsch.flexmark.html2md.converter.CustomHtmlNodeRenderer
            public final void render(Node node, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
                switch (i12) {
                    case 0:
                        this.f11333b.processHeading((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 1:
                        this.f11333b.processHr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 2:
                        this.f11333b.processA((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 3:
                        this.f11333b.processImg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 4:
                        this.f11333b.processInput((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11333b.processIns((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 6:
                        this.f11333b.processLi((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 7:
                        this.f11333b.processMath((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 8:
                        this.f11333b.processOl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11333b.processP((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11333b.processPre((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 11:
                        this.f11333b.processSpan((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 12:
                        this.f11333b.processAbbr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 13:
                        this.f11333b.processDel((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 14:
                        this.f11333b.processStrong((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 15:
                        this.f11333b.processSub((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11333b.processSup((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 17:
                        this.f11333b.processSvg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 18:
                        this.f11333b.processTable((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 19:
                        this.f11333b.processUl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 20:
                        this.f11333b.processText((TextNode) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 21:
                        this.f11333b.processDefault(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 22:
                        this.f11333b.processAside((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 23:
                        this.f11333b.processUnwrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 24:
                        this.f11333b.processWrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 25:
                        this.f11333b.processBlockQuote((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 26:
                        this.f11333b.processBr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 27:
                        this.f11333b.processCode((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 28:
                        this.f11333b.processDiv((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    default:
                        this.f11333b.processComment((Comment) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                }
            }
        });
        final int i13 = 27;
        HtmlNodeRendererHandler htmlNodeRendererHandler8 = new HtmlNodeRendererHandler(FlexmarkHtmlConverter.CODE_NODE, Element.class, new CustomHtmlNodeRenderer(this) { // from class: com.vladsch.flexmark.html2md.converter.internal.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HtmlConverterCoreNodeRenderer f11333b;

            {
                this.f11333b = this;
            }

            @Override // com.vladsch.flexmark.html2md.converter.CustomHtmlNodeRenderer
            public final void render(Node node, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
                switch (i13) {
                    case 0:
                        this.f11333b.processHeading((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 1:
                        this.f11333b.processHr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 2:
                        this.f11333b.processA((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 3:
                        this.f11333b.processImg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 4:
                        this.f11333b.processInput((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11333b.processIns((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 6:
                        this.f11333b.processLi((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 7:
                        this.f11333b.processMath((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 8:
                        this.f11333b.processOl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11333b.processP((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11333b.processPre((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 11:
                        this.f11333b.processSpan((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 12:
                        this.f11333b.processAbbr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 13:
                        this.f11333b.processDel((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 14:
                        this.f11333b.processStrong((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 15:
                        this.f11333b.processSub((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11333b.processSup((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 17:
                        this.f11333b.processSvg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 18:
                        this.f11333b.processTable((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 19:
                        this.f11333b.processUl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 20:
                        this.f11333b.processText((TextNode) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 21:
                        this.f11333b.processDefault(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 22:
                        this.f11333b.processAside((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 23:
                        this.f11333b.processUnwrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 24:
                        this.f11333b.processWrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 25:
                        this.f11333b.processBlockQuote((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 26:
                        this.f11333b.processBr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 27:
                        this.f11333b.processCode((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 28:
                        this.f11333b.processDiv((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    default:
                        this.f11333b.processComment((Comment) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                }
            }
        });
        final int i14 = 13;
        HtmlNodeRendererHandler htmlNodeRendererHandler9 = new HtmlNodeRendererHandler(FlexmarkHtmlConverter.DEL_NODE, Element.class, new CustomHtmlNodeRenderer(this) { // from class: com.vladsch.flexmark.html2md.converter.internal.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HtmlConverterCoreNodeRenderer f11333b;

            {
                this.f11333b = this;
            }

            @Override // com.vladsch.flexmark.html2md.converter.CustomHtmlNodeRenderer
            public final void render(Node node, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
                switch (i14) {
                    case 0:
                        this.f11333b.processHeading((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 1:
                        this.f11333b.processHr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 2:
                        this.f11333b.processA((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 3:
                        this.f11333b.processImg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 4:
                        this.f11333b.processInput((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11333b.processIns((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 6:
                        this.f11333b.processLi((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 7:
                        this.f11333b.processMath((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 8:
                        this.f11333b.processOl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11333b.processP((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11333b.processPre((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 11:
                        this.f11333b.processSpan((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 12:
                        this.f11333b.processAbbr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 13:
                        this.f11333b.processDel((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 14:
                        this.f11333b.processStrong((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 15:
                        this.f11333b.processSub((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11333b.processSup((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 17:
                        this.f11333b.processSvg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 18:
                        this.f11333b.processTable((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 19:
                        this.f11333b.processUl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 20:
                        this.f11333b.processText((TextNode) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 21:
                        this.f11333b.processDefault(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 22:
                        this.f11333b.processAside((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 23:
                        this.f11333b.processUnwrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 24:
                        this.f11333b.processWrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 25:
                        this.f11333b.processBlockQuote((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 26:
                        this.f11333b.processBr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 27:
                        this.f11333b.processCode((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 28:
                        this.f11333b.processDiv((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    default:
                        this.f11333b.processComment((Comment) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                }
            }
        });
        final int i15 = 28;
        HtmlNodeRendererHandler htmlNodeRendererHandler10 = new HtmlNodeRendererHandler(FlexmarkHtmlConverter.DIV_NODE, Element.class, new CustomHtmlNodeRenderer(this) { // from class: com.vladsch.flexmark.html2md.converter.internal.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HtmlConverterCoreNodeRenderer f11333b;

            {
                this.f11333b = this;
            }

            @Override // com.vladsch.flexmark.html2md.converter.CustomHtmlNodeRenderer
            public final void render(Node node, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
                switch (i15) {
                    case 0:
                        this.f11333b.processHeading((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 1:
                        this.f11333b.processHr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 2:
                        this.f11333b.processA((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 3:
                        this.f11333b.processImg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 4:
                        this.f11333b.processInput((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11333b.processIns((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 6:
                        this.f11333b.processLi((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 7:
                        this.f11333b.processMath((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 8:
                        this.f11333b.processOl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11333b.processP((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11333b.processPre((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 11:
                        this.f11333b.processSpan((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 12:
                        this.f11333b.processAbbr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 13:
                        this.f11333b.processDel((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 14:
                        this.f11333b.processStrong((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 15:
                        this.f11333b.processSub((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11333b.processSup((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 17:
                        this.f11333b.processSvg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 18:
                        this.f11333b.processTable((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 19:
                        this.f11333b.processUl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 20:
                        this.f11333b.processText((TextNode) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 21:
                        this.f11333b.processDefault(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 22:
                        this.f11333b.processAside((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 23:
                        this.f11333b.processUnwrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 24:
                        this.f11333b.processWrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 25:
                        this.f11333b.processBlockQuote((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 26:
                        this.f11333b.processBr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 27:
                        this.f11333b.processCode((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 28:
                        this.f11333b.processDiv((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    default:
                        this.f11333b.processComment((Comment) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                }
            }
        });
        final int i16 = 0;
        HtmlNodeRendererHandler htmlNodeRendererHandler11 = new HtmlNodeRendererHandler(FlexmarkHtmlConverter.DL_NODE, Element.class, new CustomHtmlNodeRenderer(this) { // from class: com.vladsch.flexmark.html2md.converter.internal.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HtmlConverterCoreNodeRenderer f11339b;

            {
                this.f11339b = this;
            }

            @Override // com.vladsch.flexmark.html2md.converter.CustomHtmlNodeRenderer
            public final void render(Node node, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
                switch (i16) {
                    case 0:
                        this.f11339b.processDl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 1:
                        this.f11339b.processEmphasis((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    default:
                        this.f11339b.processEmoji((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                }
            }
        });
        final int i17 = 1;
        HtmlNodeRendererHandler htmlNodeRendererHandler12 = new HtmlNodeRendererHandler(FlexmarkHtmlConverter.EM_NODE, Element.class, new CustomHtmlNodeRenderer(this) { // from class: com.vladsch.flexmark.html2md.converter.internal.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HtmlConverterCoreNodeRenderer f11339b;

            {
                this.f11339b = this;
            }

            @Override // com.vladsch.flexmark.html2md.converter.CustomHtmlNodeRenderer
            public final void render(Node node, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
                switch (i17) {
                    case 0:
                        this.f11339b.processDl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 1:
                        this.f11339b.processEmphasis((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    default:
                        this.f11339b.processEmoji((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                }
            }
        });
        final int i18 = 2;
        HtmlNodeRendererHandler htmlNodeRendererHandler13 = new HtmlNodeRendererHandler(FlexmarkHtmlConverter.EMOJI_NODE, Element.class, new CustomHtmlNodeRenderer(this) { // from class: com.vladsch.flexmark.html2md.converter.internal.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HtmlConverterCoreNodeRenderer f11339b;

            {
                this.f11339b = this;
            }

            @Override // com.vladsch.flexmark.html2md.converter.CustomHtmlNodeRenderer
            public final void render(Node node, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
                switch (i18) {
                    case 0:
                        this.f11339b.processDl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 1:
                        this.f11339b.processEmphasis((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    default:
                        this.f11339b.processEmoji((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                }
            }
        });
        final int i19 = 0;
        HtmlNodeRendererHandler htmlNodeRendererHandler14 = new HtmlNodeRendererHandler(FlexmarkHtmlConverter.H1_NODE, Element.class, new CustomHtmlNodeRenderer(this) { // from class: com.vladsch.flexmark.html2md.converter.internal.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HtmlConverterCoreNodeRenderer f11333b;

            {
                this.f11333b = this;
            }

            @Override // com.vladsch.flexmark.html2md.converter.CustomHtmlNodeRenderer
            public final void render(Node node, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
                switch (i19) {
                    case 0:
                        this.f11333b.processHeading((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 1:
                        this.f11333b.processHr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 2:
                        this.f11333b.processA((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 3:
                        this.f11333b.processImg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 4:
                        this.f11333b.processInput((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11333b.processIns((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 6:
                        this.f11333b.processLi((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 7:
                        this.f11333b.processMath((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 8:
                        this.f11333b.processOl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11333b.processP((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11333b.processPre((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 11:
                        this.f11333b.processSpan((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 12:
                        this.f11333b.processAbbr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 13:
                        this.f11333b.processDel((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 14:
                        this.f11333b.processStrong((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 15:
                        this.f11333b.processSub((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11333b.processSup((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 17:
                        this.f11333b.processSvg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 18:
                        this.f11333b.processTable((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 19:
                        this.f11333b.processUl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 20:
                        this.f11333b.processText((TextNode) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 21:
                        this.f11333b.processDefault(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 22:
                        this.f11333b.processAside((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 23:
                        this.f11333b.processUnwrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 24:
                        this.f11333b.processWrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 25:
                        this.f11333b.processBlockQuote((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 26:
                        this.f11333b.processBr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 27:
                        this.f11333b.processCode((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 28:
                        this.f11333b.processDiv((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    default:
                        this.f11333b.processComment((Comment) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                }
            }
        });
        final int i20 = 0;
        HtmlNodeRendererHandler htmlNodeRendererHandler15 = new HtmlNodeRendererHandler(FlexmarkHtmlConverter.H2_NODE, Element.class, new CustomHtmlNodeRenderer(this) { // from class: com.vladsch.flexmark.html2md.converter.internal.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HtmlConverterCoreNodeRenderer f11333b;

            {
                this.f11333b = this;
            }

            @Override // com.vladsch.flexmark.html2md.converter.CustomHtmlNodeRenderer
            public final void render(Node node, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
                switch (i20) {
                    case 0:
                        this.f11333b.processHeading((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 1:
                        this.f11333b.processHr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 2:
                        this.f11333b.processA((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 3:
                        this.f11333b.processImg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 4:
                        this.f11333b.processInput((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11333b.processIns((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 6:
                        this.f11333b.processLi((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 7:
                        this.f11333b.processMath((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 8:
                        this.f11333b.processOl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11333b.processP((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11333b.processPre((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 11:
                        this.f11333b.processSpan((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 12:
                        this.f11333b.processAbbr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 13:
                        this.f11333b.processDel((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 14:
                        this.f11333b.processStrong((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 15:
                        this.f11333b.processSub((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11333b.processSup((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 17:
                        this.f11333b.processSvg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 18:
                        this.f11333b.processTable((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 19:
                        this.f11333b.processUl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 20:
                        this.f11333b.processText((TextNode) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 21:
                        this.f11333b.processDefault(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 22:
                        this.f11333b.processAside((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 23:
                        this.f11333b.processUnwrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 24:
                        this.f11333b.processWrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 25:
                        this.f11333b.processBlockQuote((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 26:
                        this.f11333b.processBr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 27:
                        this.f11333b.processCode((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 28:
                        this.f11333b.processDiv((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    default:
                        this.f11333b.processComment((Comment) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                }
            }
        });
        final int i21 = 0;
        HtmlNodeRendererHandler htmlNodeRendererHandler16 = new HtmlNodeRendererHandler(FlexmarkHtmlConverter.H3_NODE, Element.class, new CustomHtmlNodeRenderer(this) { // from class: com.vladsch.flexmark.html2md.converter.internal.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HtmlConverterCoreNodeRenderer f11333b;

            {
                this.f11333b = this;
            }

            @Override // com.vladsch.flexmark.html2md.converter.CustomHtmlNodeRenderer
            public final void render(Node node, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
                switch (i21) {
                    case 0:
                        this.f11333b.processHeading((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 1:
                        this.f11333b.processHr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 2:
                        this.f11333b.processA((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 3:
                        this.f11333b.processImg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 4:
                        this.f11333b.processInput((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11333b.processIns((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 6:
                        this.f11333b.processLi((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 7:
                        this.f11333b.processMath((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 8:
                        this.f11333b.processOl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11333b.processP((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11333b.processPre((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 11:
                        this.f11333b.processSpan((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 12:
                        this.f11333b.processAbbr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 13:
                        this.f11333b.processDel((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 14:
                        this.f11333b.processStrong((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 15:
                        this.f11333b.processSub((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11333b.processSup((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 17:
                        this.f11333b.processSvg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 18:
                        this.f11333b.processTable((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 19:
                        this.f11333b.processUl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 20:
                        this.f11333b.processText((TextNode) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 21:
                        this.f11333b.processDefault(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 22:
                        this.f11333b.processAside((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 23:
                        this.f11333b.processUnwrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 24:
                        this.f11333b.processWrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 25:
                        this.f11333b.processBlockQuote((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 26:
                        this.f11333b.processBr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 27:
                        this.f11333b.processCode((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 28:
                        this.f11333b.processDiv((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    default:
                        this.f11333b.processComment((Comment) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                }
            }
        });
        final int i22 = 0;
        HtmlNodeRendererHandler htmlNodeRendererHandler17 = new HtmlNodeRendererHandler(FlexmarkHtmlConverter.H4_NODE, Element.class, new CustomHtmlNodeRenderer(this) { // from class: com.vladsch.flexmark.html2md.converter.internal.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HtmlConverterCoreNodeRenderer f11333b;

            {
                this.f11333b = this;
            }

            @Override // com.vladsch.flexmark.html2md.converter.CustomHtmlNodeRenderer
            public final void render(Node node, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
                switch (i22) {
                    case 0:
                        this.f11333b.processHeading((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 1:
                        this.f11333b.processHr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 2:
                        this.f11333b.processA((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 3:
                        this.f11333b.processImg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 4:
                        this.f11333b.processInput((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11333b.processIns((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 6:
                        this.f11333b.processLi((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 7:
                        this.f11333b.processMath((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 8:
                        this.f11333b.processOl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11333b.processP((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11333b.processPre((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 11:
                        this.f11333b.processSpan((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 12:
                        this.f11333b.processAbbr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 13:
                        this.f11333b.processDel((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 14:
                        this.f11333b.processStrong((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 15:
                        this.f11333b.processSub((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11333b.processSup((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 17:
                        this.f11333b.processSvg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 18:
                        this.f11333b.processTable((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 19:
                        this.f11333b.processUl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 20:
                        this.f11333b.processText((TextNode) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 21:
                        this.f11333b.processDefault(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 22:
                        this.f11333b.processAside((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 23:
                        this.f11333b.processUnwrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 24:
                        this.f11333b.processWrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 25:
                        this.f11333b.processBlockQuote((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 26:
                        this.f11333b.processBr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 27:
                        this.f11333b.processCode((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 28:
                        this.f11333b.processDiv((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    default:
                        this.f11333b.processComment((Comment) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                }
            }
        });
        final int i23 = 0;
        HtmlNodeRendererHandler htmlNodeRendererHandler18 = new HtmlNodeRendererHandler(FlexmarkHtmlConverter.H5_NODE, Element.class, new CustomHtmlNodeRenderer(this) { // from class: com.vladsch.flexmark.html2md.converter.internal.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HtmlConverterCoreNodeRenderer f11333b;

            {
                this.f11333b = this;
            }

            @Override // com.vladsch.flexmark.html2md.converter.CustomHtmlNodeRenderer
            public final void render(Node node, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
                switch (i23) {
                    case 0:
                        this.f11333b.processHeading((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 1:
                        this.f11333b.processHr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 2:
                        this.f11333b.processA((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 3:
                        this.f11333b.processImg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 4:
                        this.f11333b.processInput((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11333b.processIns((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 6:
                        this.f11333b.processLi((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 7:
                        this.f11333b.processMath((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 8:
                        this.f11333b.processOl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11333b.processP((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11333b.processPre((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 11:
                        this.f11333b.processSpan((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 12:
                        this.f11333b.processAbbr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 13:
                        this.f11333b.processDel((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 14:
                        this.f11333b.processStrong((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 15:
                        this.f11333b.processSub((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11333b.processSup((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 17:
                        this.f11333b.processSvg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 18:
                        this.f11333b.processTable((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 19:
                        this.f11333b.processUl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 20:
                        this.f11333b.processText((TextNode) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 21:
                        this.f11333b.processDefault(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 22:
                        this.f11333b.processAside((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 23:
                        this.f11333b.processUnwrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 24:
                        this.f11333b.processWrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 25:
                        this.f11333b.processBlockQuote((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 26:
                        this.f11333b.processBr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 27:
                        this.f11333b.processCode((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 28:
                        this.f11333b.processDiv((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    default:
                        this.f11333b.processComment((Comment) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                }
            }
        });
        final int i24 = 0;
        HtmlNodeRendererHandler htmlNodeRendererHandler19 = new HtmlNodeRendererHandler(FlexmarkHtmlConverter.H6_NODE, Element.class, new CustomHtmlNodeRenderer(this) { // from class: com.vladsch.flexmark.html2md.converter.internal.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HtmlConverterCoreNodeRenderer f11333b;

            {
                this.f11333b = this;
            }

            @Override // com.vladsch.flexmark.html2md.converter.CustomHtmlNodeRenderer
            public final void render(Node node, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
                switch (i24) {
                    case 0:
                        this.f11333b.processHeading((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 1:
                        this.f11333b.processHr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 2:
                        this.f11333b.processA((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 3:
                        this.f11333b.processImg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 4:
                        this.f11333b.processInput((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11333b.processIns((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 6:
                        this.f11333b.processLi((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 7:
                        this.f11333b.processMath((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 8:
                        this.f11333b.processOl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11333b.processP((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11333b.processPre((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 11:
                        this.f11333b.processSpan((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 12:
                        this.f11333b.processAbbr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 13:
                        this.f11333b.processDel((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 14:
                        this.f11333b.processStrong((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 15:
                        this.f11333b.processSub((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11333b.processSup((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 17:
                        this.f11333b.processSvg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 18:
                        this.f11333b.processTable((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 19:
                        this.f11333b.processUl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 20:
                        this.f11333b.processText((TextNode) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 21:
                        this.f11333b.processDefault(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 22:
                        this.f11333b.processAside((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 23:
                        this.f11333b.processUnwrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 24:
                        this.f11333b.processWrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 25:
                        this.f11333b.processBlockQuote((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 26:
                        this.f11333b.processBr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 27:
                        this.f11333b.processCode((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 28:
                        this.f11333b.processDiv((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    default:
                        this.f11333b.processComment((Comment) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                }
            }
        });
        final int i25 = 1;
        HtmlNodeRendererHandler htmlNodeRendererHandler20 = new HtmlNodeRendererHandler(FlexmarkHtmlConverter.HR_NODE, Element.class, new CustomHtmlNodeRenderer(this) { // from class: com.vladsch.flexmark.html2md.converter.internal.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HtmlConverterCoreNodeRenderer f11333b;

            {
                this.f11333b = this;
            }

            @Override // com.vladsch.flexmark.html2md.converter.CustomHtmlNodeRenderer
            public final void render(Node node, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
                switch (i25) {
                    case 0:
                        this.f11333b.processHeading((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 1:
                        this.f11333b.processHr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 2:
                        this.f11333b.processA((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 3:
                        this.f11333b.processImg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 4:
                        this.f11333b.processInput((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11333b.processIns((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 6:
                        this.f11333b.processLi((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 7:
                        this.f11333b.processMath((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 8:
                        this.f11333b.processOl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11333b.processP((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11333b.processPre((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 11:
                        this.f11333b.processSpan((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 12:
                        this.f11333b.processAbbr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 13:
                        this.f11333b.processDel((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 14:
                        this.f11333b.processStrong((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 15:
                        this.f11333b.processSub((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11333b.processSup((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 17:
                        this.f11333b.processSvg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 18:
                        this.f11333b.processTable((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 19:
                        this.f11333b.processUl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 20:
                        this.f11333b.processText((TextNode) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 21:
                        this.f11333b.processDefault(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 22:
                        this.f11333b.processAside((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 23:
                        this.f11333b.processUnwrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 24:
                        this.f11333b.processWrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 25:
                        this.f11333b.processBlockQuote((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 26:
                        this.f11333b.processBr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 27:
                        this.f11333b.processCode((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 28:
                        this.f11333b.processDiv((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    default:
                        this.f11333b.processComment((Comment) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                }
            }
        });
        final int i26 = 1;
        HtmlNodeRendererHandler htmlNodeRendererHandler21 = new HtmlNodeRendererHandler(FlexmarkHtmlConverter.I_NODE, Element.class, new CustomHtmlNodeRenderer(this) { // from class: com.vladsch.flexmark.html2md.converter.internal.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HtmlConverterCoreNodeRenderer f11339b;

            {
                this.f11339b = this;
            }

            @Override // com.vladsch.flexmark.html2md.converter.CustomHtmlNodeRenderer
            public final void render(Node node, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
                switch (i26) {
                    case 0:
                        this.f11339b.processDl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 1:
                        this.f11339b.processEmphasis((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    default:
                        this.f11339b.processEmoji((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                }
            }
        });
        final int i27 = 3;
        HtmlNodeRendererHandler htmlNodeRendererHandler22 = new HtmlNodeRendererHandler(FlexmarkHtmlConverter.IMG_NODE, Element.class, new CustomHtmlNodeRenderer(this) { // from class: com.vladsch.flexmark.html2md.converter.internal.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HtmlConverterCoreNodeRenderer f11333b;

            {
                this.f11333b = this;
            }

            @Override // com.vladsch.flexmark.html2md.converter.CustomHtmlNodeRenderer
            public final void render(Node node, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
                switch (i27) {
                    case 0:
                        this.f11333b.processHeading((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 1:
                        this.f11333b.processHr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 2:
                        this.f11333b.processA((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 3:
                        this.f11333b.processImg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 4:
                        this.f11333b.processInput((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11333b.processIns((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 6:
                        this.f11333b.processLi((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 7:
                        this.f11333b.processMath((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 8:
                        this.f11333b.processOl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11333b.processP((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11333b.processPre((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 11:
                        this.f11333b.processSpan((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 12:
                        this.f11333b.processAbbr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 13:
                        this.f11333b.processDel((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 14:
                        this.f11333b.processStrong((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 15:
                        this.f11333b.processSub((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11333b.processSup((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 17:
                        this.f11333b.processSvg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 18:
                        this.f11333b.processTable((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 19:
                        this.f11333b.processUl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 20:
                        this.f11333b.processText((TextNode) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 21:
                        this.f11333b.processDefault(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 22:
                        this.f11333b.processAside((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 23:
                        this.f11333b.processUnwrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 24:
                        this.f11333b.processWrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 25:
                        this.f11333b.processBlockQuote((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 26:
                        this.f11333b.processBr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 27:
                        this.f11333b.processCode((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 28:
                        this.f11333b.processDiv((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    default:
                        this.f11333b.processComment((Comment) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                }
            }
        });
        final int i28 = 4;
        HtmlNodeRendererHandler htmlNodeRendererHandler23 = new HtmlNodeRendererHandler(FlexmarkHtmlConverter.INPUT_NODE, Element.class, new CustomHtmlNodeRenderer(this) { // from class: com.vladsch.flexmark.html2md.converter.internal.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HtmlConverterCoreNodeRenderer f11333b;

            {
                this.f11333b = this;
            }

            @Override // com.vladsch.flexmark.html2md.converter.CustomHtmlNodeRenderer
            public final void render(Node node, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
                switch (i28) {
                    case 0:
                        this.f11333b.processHeading((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 1:
                        this.f11333b.processHr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 2:
                        this.f11333b.processA((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 3:
                        this.f11333b.processImg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 4:
                        this.f11333b.processInput((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11333b.processIns((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 6:
                        this.f11333b.processLi((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 7:
                        this.f11333b.processMath((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 8:
                        this.f11333b.processOl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11333b.processP((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11333b.processPre((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 11:
                        this.f11333b.processSpan((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 12:
                        this.f11333b.processAbbr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 13:
                        this.f11333b.processDel((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 14:
                        this.f11333b.processStrong((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 15:
                        this.f11333b.processSub((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11333b.processSup((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 17:
                        this.f11333b.processSvg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 18:
                        this.f11333b.processTable((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 19:
                        this.f11333b.processUl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 20:
                        this.f11333b.processText((TextNode) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 21:
                        this.f11333b.processDefault(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 22:
                        this.f11333b.processAside((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 23:
                        this.f11333b.processUnwrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 24:
                        this.f11333b.processWrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 25:
                        this.f11333b.processBlockQuote((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 26:
                        this.f11333b.processBr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 27:
                        this.f11333b.processCode((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 28:
                        this.f11333b.processDiv((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    default:
                        this.f11333b.processComment((Comment) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                }
            }
        });
        final int i29 = 5;
        HtmlNodeRendererHandler htmlNodeRendererHandler24 = new HtmlNodeRendererHandler(FlexmarkHtmlConverter.INS_NODE, Element.class, new CustomHtmlNodeRenderer(this) { // from class: com.vladsch.flexmark.html2md.converter.internal.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HtmlConverterCoreNodeRenderer f11333b;

            {
                this.f11333b = this;
            }

            @Override // com.vladsch.flexmark.html2md.converter.CustomHtmlNodeRenderer
            public final void render(Node node, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
                switch (i29) {
                    case 0:
                        this.f11333b.processHeading((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 1:
                        this.f11333b.processHr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 2:
                        this.f11333b.processA((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 3:
                        this.f11333b.processImg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 4:
                        this.f11333b.processInput((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11333b.processIns((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 6:
                        this.f11333b.processLi((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 7:
                        this.f11333b.processMath((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 8:
                        this.f11333b.processOl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11333b.processP((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11333b.processPre((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 11:
                        this.f11333b.processSpan((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 12:
                        this.f11333b.processAbbr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 13:
                        this.f11333b.processDel((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 14:
                        this.f11333b.processStrong((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 15:
                        this.f11333b.processSub((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11333b.processSup((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 17:
                        this.f11333b.processSvg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 18:
                        this.f11333b.processTable((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 19:
                        this.f11333b.processUl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 20:
                        this.f11333b.processText((TextNode) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 21:
                        this.f11333b.processDefault(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 22:
                        this.f11333b.processAside((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 23:
                        this.f11333b.processUnwrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 24:
                        this.f11333b.processWrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 25:
                        this.f11333b.processBlockQuote((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 26:
                        this.f11333b.processBr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 27:
                        this.f11333b.processCode((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 28:
                        this.f11333b.processDiv((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    default:
                        this.f11333b.processComment((Comment) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                }
            }
        });
        final int i30 = 6;
        HtmlNodeRendererHandler htmlNodeRendererHandler25 = new HtmlNodeRendererHandler(FlexmarkHtmlConverter.LI_NODE, Element.class, new CustomHtmlNodeRenderer(this) { // from class: com.vladsch.flexmark.html2md.converter.internal.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HtmlConverterCoreNodeRenderer f11333b;

            {
                this.f11333b = this;
            }

            @Override // com.vladsch.flexmark.html2md.converter.CustomHtmlNodeRenderer
            public final void render(Node node, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
                switch (i30) {
                    case 0:
                        this.f11333b.processHeading((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 1:
                        this.f11333b.processHr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 2:
                        this.f11333b.processA((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 3:
                        this.f11333b.processImg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 4:
                        this.f11333b.processInput((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11333b.processIns((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 6:
                        this.f11333b.processLi((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 7:
                        this.f11333b.processMath((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 8:
                        this.f11333b.processOl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11333b.processP((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11333b.processPre((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 11:
                        this.f11333b.processSpan((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 12:
                        this.f11333b.processAbbr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 13:
                        this.f11333b.processDel((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 14:
                        this.f11333b.processStrong((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 15:
                        this.f11333b.processSub((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11333b.processSup((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 17:
                        this.f11333b.processSvg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 18:
                        this.f11333b.processTable((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 19:
                        this.f11333b.processUl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 20:
                        this.f11333b.processText((TextNode) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 21:
                        this.f11333b.processDefault(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 22:
                        this.f11333b.processAside((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 23:
                        this.f11333b.processUnwrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 24:
                        this.f11333b.processWrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 25:
                        this.f11333b.processBlockQuote((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 26:
                        this.f11333b.processBr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 27:
                        this.f11333b.processCode((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 28:
                        this.f11333b.processDiv((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    default:
                        this.f11333b.processComment((Comment) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                }
            }
        });
        final int i31 = 7;
        HtmlNodeRendererHandler htmlNodeRendererHandler26 = new HtmlNodeRendererHandler(FlexmarkHtmlConverter.MATH_NODE, Element.class, new CustomHtmlNodeRenderer(this) { // from class: com.vladsch.flexmark.html2md.converter.internal.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HtmlConverterCoreNodeRenderer f11333b;

            {
                this.f11333b = this;
            }

            @Override // com.vladsch.flexmark.html2md.converter.CustomHtmlNodeRenderer
            public final void render(Node node, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
                switch (i31) {
                    case 0:
                        this.f11333b.processHeading((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 1:
                        this.f11333b.processHr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 2:
                        this.f11333b.processA((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 3:
                        this.f11333b.processImg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 4:
                        this.f11333b.processInput((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11333b.processIns((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 6:
                        this.f11333b.processLi((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 7:
                        this.f11333b.processMath((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 8:
                        this.f11333b.processOl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11333b.processP((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11333b.processPre((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 11:
                        this.f11333b.processSpan((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 12:
                        this.f11333b.processAbbr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 13:
                        this.f11333b.processDel((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 14:
                        this.f11333b.processStrong((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 15:
                        this.f11333b.processSub((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11333b.processSup((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 17:
                        this.f11333b.processSvg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 18:
                        this.f11333b.processTable((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 19:
                        this.f11333b.processUl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 20:
                        this.f11333b.processText((TextNode) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 21:
                        this.f11333b.processDefault(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 22:
                        this.f11333b.processAside((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 23:
                        this.f11333b.processUnwrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 24:
                        this.f11333b.processWrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 25:
                        this.f11333b.processBlockQuote((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 26:
                        this.f11333b.processBr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 27:
                        this.f11333b.processCode((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 28:
                        this.f11333b.processDiv((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    default:
                        this.f11333b.processComment((Comment) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                }
            }
        });
        final int i32 = 8;
        HtmlNodeRendererHandler htmlNodeRendererHandler27 = new HtmlNodeRendererHandler(FlexmarkHtmlConverter.OL_NODE, Element.class, new CustomHtmlNodeRenderer(this) { // from class: com.vladsch.flexmark.html2md.converter.internal.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HtmlConverterCoreNodeRenderer f11333b;

            {
                this.f11333b = this;
            }

            @Override // com.vladsch.flexmark.html2md.converter.CustomHtmlNodeRenderer
            public final void render(Node node, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
                switch (i32) {
                    case 0:
                        this.f11333b.processHeading((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 1:
                        this.f11333b.processHr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 2:
                        this.f11333b.processA((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 3:
                        this.f11333b.processImg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 4:
                        this.f11333b.processInput((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11333b.processIns((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 6:
                        this.f11333b.processLi((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 7:
                        this.f11333b.processMath((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 8:
                        this.f11333b.processOl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11333b.processP((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11333b.processPre((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 11:
                        this.f11333b.processSpan((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 12:
                        this.f11333b.processAbbr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 13:
                        this.f11333b.processDel((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 14:
                        this.f11333b.processStrong((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 15:
                        this.f11333b.processSub((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11333b.processSup((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 17:
                        this.f11333b.processSvg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 18:
                        this.f11333b.processTable((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 19:
                        this.f11333b.processUl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 20:
                        this.f11333b.processText((TextNode) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 21:
                        this.f11333b.processDefault(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 22:
                        this.f11333b.processAside((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 23:
                        this.f11333b.processUnwrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 24:
                        this.f11333b.processWrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 25:
                        this.f11333b.processBlockQuote((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 26:
                        this.f11333b.processBr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 27:
                        this.f11333b.processCode((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 28:
                        this.f11333b.processDiv((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    default:
                        this.f11333b.processComment((Comment) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                }
            }
        });
        final int i33 = 9;
        HtmlNodeRendererHandler htmlNodeRendererHandler28 = new HtmlNodeRendererHandler(FlexmarkHtmlConverter.P_NODE, Element.class, new CustomHtmlNodeRenderer(this) { // from class: com.vladsch.flexmark.html2md.converter.internal.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HtmlConverterCoreNodeRenderer f11333b;

            {
                this.f11333b = this;
            }

            @Override // com.vladsch.flexmark.html2md.converter.CustomHtmlNodeRenderer
            public final void render(Node node, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
                switch (i33) {
                    case 0:
                        this.f11333b.processHeading((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 1:
                        this.f11333b.processHr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 2:
                        this.f11333b.processA((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 3:
                        this.f11333b.processImg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 4:
                        this.f11333b.processInput((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11333b.processIns((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 6:
                        this.f11333b.processLi((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 7:
                        this.f11333b.processMath((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 8:
                        this.f11333b.processOl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11333b.processP((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11333b.processPre((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 11:
                        this.f11333b.processSpan((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 12:
                        this.f11333b.processAbbr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 13:
                        this.f11333b.processDel((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 14:
                        this.f11333b.processStrong((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 15:
                        this.f11333b.processSub((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11333b.processSup((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 17:
                        this.f11333b.processSvg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 18:
                        this.f11333b.processTable((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 19:
                        this.f11333b.processUl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 20:
                        this.f11333b.processText((TextNode) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 21:
                        this.f11333b.processDefault(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 22:
                        this.f11333b.processAside((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 23:
                        this.f11333b.processUnwrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 24:
                        this.f11333b.processWrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 25:
                        this.f11333b.processBlockQuote((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 26:
                        this.f11333b.processBr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 27:
                        this.f11333b.processCode((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 28:
                        this.f11333b.processDiv((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    default:
                        this.f11333b.processComment((Comment) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                }
            }
        });
        final int i34 = 10;
        HtmlNodeRendererHandler htmlNodeRendererHandler29 = new HtmlNodeRendererHandler(FlexmarkHtmlConverter.PRE_NODE, Element.class, new CustomHtmlNodeRenderer(this) { // from class: com.vladsch.flexmark.html2md.converter.internal.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HtmlConverterCoreNodeRenderer f11333b;

            {
                this.f11333b = this;
            }

            @Override // com.vladsch.flexmark.html2md.converter.CustomHtmlNodeRenderer
            public final void render(Node node, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
                switch (i34) {
                    case 0:
                        this.f11333b.processHeading((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 1:
                        this.f11333b.processHr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 2:
                        this.f11333b.processA((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 3:
                        this.f11333b.processImg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 4:
                        this.f11333b.processInput((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11333b.processIns((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 6:
                        this.f11333b.processLi((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 7:
                        this.f11333b.processMath((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 8:
                        this.f11333b.processOl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11333b.processP((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11333b.processPre((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 11:
                        this.f11333b.processSpan((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 12:
                        this.f11333b.processAbbr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 13:
                        this.f11333b.processDel((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 14:
                        this.f11333b.processStrong((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 15:
                        this.f11333b.processSub((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11333b.processSup((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 17:
                        this.f11333b.processSvg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 18:
                        this.f11333b.processTable((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 19:
                        this.f11333b.processUl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 20:
                        this.f11333b.processText((TextNode) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 21:
                        this.f11333b.processDefault(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 22:
                        this.f11333b.processAside((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 23:
                        this.f11333b.processUnwrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 24:
                        this.f11333b.processWrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 25:
                        this.f11333b.processBlockQuote((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 26:
                        this.f11333b.processBr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 27:
                        this.f11333b.processCode((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 28:
                        this.f11333b.processDiv((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    default:
                        this.f11333b.processComment((Comment) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                }
            }
        });
        final int i35 = 11;
        HtmlNodeRendererHandler htmlNodeRendererHandler30 = new HtmlNodeRendererHandler(FlexmarkHtmlConverter.SPAN_NODE, Element.class, new CustomHtmlNodeRenderer(this) { // from class: com.vladsch.flexmark.html2md.converter.internal.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HtmlConverterCoreNodeRenderer f11333b;

            {
                this.f11333b = this;
            }

            @Override // com.vladsch.flexmark.html2md.converter.CustomHtmlNodeRenderer
            public final void render(Node node, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
                switch (i35) {
                    case 0:
                        this.f11333b.processHeading((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 1:
                        this.f11333b.processHr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 2:
                        this.f11333b.processA((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 3:
                        this.f11333b.processImg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 4:
                        this.f11333b.processInput((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11333b.processIns((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 6:
                        this.f11333b.processLi((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 7:
                        this.f11333b.processMath((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 8:
                        this.f11333b.processOl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11333b.processP((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11333b.processPre((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 11:
                        this.f11333b.processSpan((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 12:
                        this.f11333b.processAbbr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 13:
                        this.f11333b.processDel((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 14:
                        this.f11333b.processStrong((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 15:
                        this.f11333b.processSub((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11333b.processSup((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 17:
                        this.f11333b.processSvg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 18:
                        this.f11333b.processTable((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 19:
                        this.f11333b.processUl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 20:
                        this.f11333b.processText((TextNode) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 21:
                        this.f11333b.processDefault(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 22:
                        this.f11333b.processAside((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 23:
                        this.f11333b.processUnwrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 24:
                        this.f11333b.processWrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 25:
                        this.f11333b.processBlockQuote((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 26:
                        this.f11333b.processBr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 27:
                        this.f11333b.processCode((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 28:
                        this.f11333b.processDiv((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    default:
                        this.f11333b.processComment((Comment) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                }
            }
        });
        final int i36 = 13;
        HtmlNodeRendererHandler htmlNodeRendererHandler31 = new HtmlNodeRendererHandler(FlexmarkHtmlConverter.STRIKE_NODE, Element.class, new CustomHtmlNodeRenderer(this) { // from class: com.vladsch.flexmark.html2md.converter.internal.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HtmlConverterCoreNodeRenderer f11333b;

            {
                this.f11333b = this;
            }

            @Override // com.vladsch.flexmark.html2md.converter.CustomHtmlNodeRenderer
            public final void render(Node node, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
                switch (i36) {
                    case 0:
                        this.f11333b.processHeading((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 1:
                        this.f11333b.processHr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 2:
                        this.f11333b.processA((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 3:
                        this.f11333b.processImg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 4:
                        this.f11333b.processInput((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11333b.processIns((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 6:
                        this.f11333b.processLi((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 7:
                        this.f11333b.processMath((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 8:
                        this.f11333b.processOl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11333b.processP((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11333b.processPre((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 11:
                        this.f11333b.processSpan((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 12:
                        this.f11333b.processAbbr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 13:
                        this.f11333b.processDel((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 14:
                        this.f11333b.processStrong((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 15:
                        this.f11333b.processSub((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11333b.processSup((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 17:
                        this.f11333b.processSvg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 18:
                        this.f11333b.processTable((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 19:
                        this.f11333b.processUl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 20:
                        this.f11333b.processText((TextNode) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 21:
                        this.f11333b.processDefault(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 22:
                        this.f11333b.processAside((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 23:
                        this.f11333b.processUnwrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 24:
                        this.f11333b.processWrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 25:
                        this.f11333b.processBlockQuote((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 26:
                        this.f11333b.processBr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 27:
                        this.f11333b.processCode((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 28:
                        this.f11333b.processDiv((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    default:
                        this.f11333b.processComment((Comment) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                }
            }
        });
        final int i37 = 14;
        HtmlNodeRendererHandler htmlNodeRendererHandler32 = new HtmlNodeRendererHandler(FlexmarkHtmlConverter.STRONG_NODE, Element.class, new CustomHtmlNodeRenderer(this) { // from class: com.vladsch.flexmark.html2md.converter.internal.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HtmlConverterCoreNodeRenderer f11333b;

            {
                this.f11333b = this;
            }

            @Override // com.vladsch.flexmark.html2md.converter.CustomHtmlNodeRenderer
            public final void render(Node node, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
                switch (i37) {
                    case 0:
                        this.f11333b.processHeading((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 1:
                        this.f11333b.processHr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 2:
                        this.f11333b.processA((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 3:
                        this.f11333b.processImg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 4:
                        this.f11333b.processInput((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11333b.processIns((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 6:
                        this.f11333b.processLi((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 7:
                        this.f11333b.processMath((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 8:
                        this.f11333b.processOl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11333b.processP((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11333b.processPre((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 11:
                        this.f11333b.processSpan((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 12:
                        this.f11333b.processAbbr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 13:
                        this.f11333b.processDel((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 14:
                        this.f11333b.processStrong((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 15:
                        this.f11333b.processSub((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11333b.processSup((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 17:
                        this.f11333b.processSvg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 18:
                        this.f11333b.processTable((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 19:
                        this.f11333b.processUl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 20:
                        this.f11333b.processText((TextNode) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 21:
                        this.f11333b.processDefault(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 22:
                        this.f11333b.processAside((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 23:
                        this.f11333b.processUnwrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 24:
                        this.f11333b.processWrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 25:
                        this.f11333b.processBlockQuote((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 26:
                        this.f11333b.processBr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 27:
                        this.f11333b.processCode((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 28:
                        this.f11333b.processDiv((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    default:
                        this.f11333b.processComment((Comment) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                }
            }
        });
        final int i38 = 15;
        HtmlNodeRendererHandler htmlNodeRendererHandler33 = new HtmlNodeRendererHandler(FlexmarkHtmlConverter.SUB_NODE, Element.class, new CustomHtmlNodeRenderer(this) { // from class: com.vladsch.flexmark.html2md.converter.internal.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HtmlConverterCoreNodeRenderer f11333b;

            {
                this.f11333b = this;
            }

            @Override // com.vladsch.flexmark.html2md.converter.CustomHtmlNodeRenderer
            public final void render(Node node, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
                switch (i38) {
                    case 0:
                        this.f11333b.processHeading((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 1:
                        this.f11333b.processHr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 2:
                        this.f11333b.processA((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 3:
                        this.f11333b.processImg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 4:
                        this.f11333b.processInput((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11333b.processIns((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 6:
                        this.f11333b.processLi((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 7:
                        this.f11333b.processMath((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 8:
                        this.f11333b.processOl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11333b.processP((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11333b.processPre((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 11:
                        this.f11333b.processSpan((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 12:
                        this.f11333b.processAbbr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 13:
                        this.f11333b.processDel((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 14:
                        this.f11333b.processStrong((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 15:
                        this.f11333b.processSub((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11333b.processSup((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 17:
                        this.f11333b.processSvg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 18:
                        this.f11333b.processTable((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 19:
                        this.f11333b.processUl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 20:
                        this.f11333b.processText((TextNode) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 21:
                        this.f11333b.processDefault(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 22:
                        this.f11333b.processAside((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 23:
                        this.f11333b.processUnwrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 24:
                        this.f11333b.processWrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 25:
                        this.f11333b.processBlockQuote((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 26:
                        this.f11333b.processBr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 27:
                        this.f11333b.processCode((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 28:
                        this.f11333b.processDiv((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    default:
                        this.f11333b.processComment((Comment) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                }
            }
        });
        final int i39 = 16;
        HtmlNodeRendererHandler htmlNodeRendererHandler34 = new HtmlNodeRendererHandler(FlexmarkHtmlConverter.SUP_NODE, Element.class, new CustomHtmlNodeRenderer(this) { // from class: com.vladsch.flexmark.html2md.converter.internal.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HtmlConverterCoreNodeRenderer f11333b;

            {
                this.f11333b = this;
            }

            @Override // com.vladsch.flexmark.html2md.converter.CustomHtmlNodeRenderer
            public final void render(Node node, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
                switch (i39) {
                    case 0:
                        this.f11333b.processHeading((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 1:
                        this.f11333b.processHr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 2:
                        this.f11333b.processA((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 3:
                        this.f11333b.processImg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 4:
                        this.f11333b.processInput((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11333b.processIns((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 6:
                        this.f11333b.processLi((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 7:
                        this.f11333b.processMath((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 8:
                        this.f11333b.processOl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11333b.processP((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11333b.processPre((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 11:
                        this.f11333b.processSpan((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 12:
                        this.f11333b.processAbbr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 13:
                        this.f11333b.processDel((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 14:
                        this.f11333b.processStrong((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 15:
                        this.f11333b.processSub((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11333b.processSup((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 17:
                        this.f11333b.processSvg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 18:
                        this.f11333b.processTable((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 19:
                        this.f11333b.processUl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 20:
                        this.f11333b.processText((TextNode) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 21:
                        this.f11333b.processDefault(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 22:
                        this.f11333b.processAside((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 23:
                        this.f11333b.processUnwrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 24:
                        this.f11333b.processWrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 25:
                        this.f11333b.processBlockQuote((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 26:
                        this.f11333b.processBr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 27:
                        this.f11333b.processCode((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 28:
                        this.f11333b.processDiv((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    default:
                        this.f11333b.processComment((Comment) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                }
            }
        });
        final int i40 = 17;
        HtmlNodeRendererHandler htmlNodeRendererHandler35 = new HtmlNodeRendererHandler(FlexmarkHtmlConverter.SVG_NODE, Element.class, new CustomHtmlNodeRenderer(this) { // from class: com.vladsch.flexmark.html2md.converter.internal.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HtmlConverterCoreNodeRenderer f11333b;

            {
                this.f11333b = this;
            }

            @Override // com.vladsch.flexmark.html2md.converter.CustomHtmlNodeRenderer
            public final void render(Node node, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
                switch (i40) {
                    case 0:
                        this.f11333b.processHeading((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 1:
                        this.f11333b.processHr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 2:
                        this.f11333b.processA((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 3:
                        this.f11333b.processImg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 4:
                        this.f11333b.processInput((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11333b.processIns((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 6:
                        this.f11333b.processLi((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 7:
                        this.f11333b.processMath((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 8:
                        this.f11333b.processOl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11333b.processP((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11333b.processPre((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 11:
                        this.f11333b.processSpan((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 12:
                        this.f11333b.processAbbr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 13:
                        this.f11333b.processDel((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 14:
                        this.f11333b.processStrong((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 15:
                        this.f11333b.processSub((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11333b.processSup((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 17:
                        this.f11333b.processSvg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 18:
                        this.f11333b.processTable((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 19:
                        this.f11333b.processUl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 20:
                        this.f11333b.processText((TextNode) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 21:
                        this.f11333b.processDefault(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 22:
                        this.f11333b.processAside((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 23:
                        this.f11333b.processUnwrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 24:
                        this.f11333b.processWrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 25:
                        this.f11333b.processBlockQuote((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 26:
                        this.f11333b.processBr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 27:
                        this.f11333b.processCode((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 28:
                        this.f11333b.processDiv((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    default:
                        this.f11333b.processComment((Comment) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                }
            }
        });
        final int i41 = 18;
        HtmlNodeRendererHandler htmlNodeRendererHandler36 = new HtmlNodeRendererHandler(FlexmarkHtmlConverter.TABLE_NODE, Element.class, new CustomHtmlNodeRenderer(this) { // from class: com.vladsch.flexmark.html2md.converter.internal.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HtmlConverterCoreNodeRenderer f11333b;

            {
                this.f11333b = this;
            }

            @Override // com.vladsch.flexmark.html2md.converter.CustomHtmlNodeRenderer
            public final void render(Node node, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
                switch (i41) {
                    case 0:
                        this.f11333b.processHeading((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 1:
                        this.f11333b.processHr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 2:
                        this.f11333b.processA((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 3:
                        this.f11333b.processImg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 4:
                        this.f11333b.processInput((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11333b.processIns((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 6:
                        this.f11333b.processLi((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 7:
                        this.f11333b.processMath((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 8:
                        this.f11333b.processOl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11333b.processP((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11333b.processPre((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 11:
                        this.f11333b.processSpan((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 12:
                        this.f11333b.processAbbr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 13:
                        this.f11333b.processDel((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 14:
                        this.f11333b.processStrong((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 15:
                        this.f11333b.processSub((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11333b.processSup((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 17:
                        this.f11333b.processSvg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 18:
                        this.f11333b.processTable((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 19:
                        this.f11333b.processUl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 20:
                        this.f11333b.processText((TextNode) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 21:
                        this.f11333b.processDefault(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 22:
                        this.f11333b.processAside((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 23:
                        this.f11333b.processUnwrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 24:
                        this.f11333b.processWrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 25:
                        this.f11333b.processBlockQuote((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 26:
                        this.f11333b.processBr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 27:
                        this.f11333b.processCode((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 28:
                        this.f11333b.processDiv((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    default:
                        this.f11333b.processComment((Comment) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                }
            }
        });
        final int i42 = 5;
        HtmlNodeRendererHandler htmlNodeRendererHandler37 = new HtmlNodeRendererHandler(FlexmarkHtmlConverter.U_NODE, Element.class, new CustomHtmlNodeRenderer(this) { // from class: com.vladsch.flexmark.html2md.converter.internal.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HtmlConverterCoreNodeRenderer f11333b;

            {
                this.f11333b = this;
            }

            @Override // com.vladsch.flexmark.html2md.converter.CustomHtmlNodeRenderer
            public final void render(Node node, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
                switch (i42) {
                    case 0:
                        this.f11333b.processHeading((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 1:
                        this.f11333b.processHr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 2:
                        this.f11333b.processA((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 3:
                        this.f11333b.processImg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 4:
                        this.f11333b.processInput((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11333b.processIns((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 6:
                        this.f11333b.processLi((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 7:
                        this.f11333b.processMath((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 8:
                        this.f11333b.processOl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11333b.processP((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11333b.processPre((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 11:
                        this.f11333b.processSpan((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 12:
                        this.f11333b.processAbbr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 13:
                        this.f11333b.processDel((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 14:
                        this.f11333b.processStrong((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 15:
                        this.f11333b.processSub((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11333b.processSup((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 17:
                        this.f11333b.processSvg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 18:
                        this.f11333b.processTable((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 19:
                        this.f11333b.processUl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 20:
                        this.f11333b.processText((TextNode) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 21:
                        this.f11333b.processDefault(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 22:
                        this.f11333b.processAside((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 23:
                        this.f11333b.processUnwrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 24:
                        this.f11333b.processWrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 25:
                        this.f11333b.processBlockQuote((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 26:
                        this.f11333b.processBr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 27:
                        this.f11333b.processCode((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 28:
                        this.f11333b.processDiv((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    default:
                        this.f11333b.processComment((Comment) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                }
            }
        });
        final int i43 = 19;
        HtmlNodeRendererHandler htmlNodeRendererHandler38 = new HtmlNodeRendererHandler(FlexmarkHtmlConverter.UL_NODE, Element.class, new CustomHtmlNodeRenderer(this) { // from class: com.vladsch.flexmark.html2md.converter.internal.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HtmlConverterCoreNodeRenderer f11333b;

            {
                this.f11333b = this;
            }

            @Override // com.vladsch.flexmark.html2md.converter.CustomHtmlNodeRenderer
            public final void render(Node node, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
                switch (i43) {
                    case 0:
                        this.f11333b.processHeading((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 1:
                        this.f11333b.processHr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 2:
                        this.f11333b.processA((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 3:
                        this.f11333b.processImg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 4:
                        this.f11333b.processInput((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11333b.processIns((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 6:
                        this.f11333b.processLi((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 7:
                        this.f11333b.processMath((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 8:
                        this.f11333b.processOl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11333b.processP((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11333b.processPre((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 11:
                        this.f11333b.processSpan((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 12:
                        this.f11333b.processAbbr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 13:
                        this.f11333b.processDel((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 14:
                        this.f11333b.processStrong((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 15:
                        this.f11333b.processSub((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11333b.processSup((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 17:
                        this.f11333b.processSvg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 18:
                        this.f11333b.processTable((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 19:
                        this.f11333b.processUl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 20:
                        this.f11333b.processText((TextNode) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 21:
                        this.f11333b.processDefault(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 22:
                        this.f11333b.processAside((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 23:
                        this.f11333b.processUnwrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 24:
                        this.f11333b.processWrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 25:
                        this.f11333b.processBlockQuote((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 26:
                        this.f11333b.processBr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 27:
                        this.f11333b.processCode((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 28:
                        this.f11333b.processDiv((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    default:
                        this.f11333b.processComment((Comment) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                }
            }
        });
        final int i44 = 20;
        HtmlNodeRendererHandler htmlNodeRendererHandler39 = new HtmlNodeRendererHandler(FlexmarkHtmlConverter.TEXT_NODE, TextNode.class, new CustomHtmlNodeRenderer(this) { // from class: com.vladsch.flexmark.html2md.converter.internal.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HtmlConverterCoreNodeRenderer f11333b;

            {
                this.f11333b = this;
            }

            @Override // com.vladsch.flexmark.html2md.converter.CustomHtmlNodeRenderer
            public final void render(Node node, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
                switch (i44) {
                    case 0:
                        this.f11333b.processHeading((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 1:
                        this.f11333b.processHr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 2:
                        this.f11333b.processA((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 3:
                        this.f11333b.processImg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 4:
                        this.f11333b.processInput((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11333b.processIns((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 6:
                        this.f11333b.processLi((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 7:
                        this.f11333b.processMath((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 8:
                        this.f11333b.processOl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11333b.processP((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11333b.processPre((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 11:
                        this.f11333b.processSpan((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 12:
                        this.f11333b.processAbbr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 13:
                        this.f11333b.processDel((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 14:
                        this.f11333b.processStrong((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 15:
                        this.f11333b.processSub((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11333b.processSup((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 17:
                        this.f11333b.processSvg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 18:
                        this.f11333b.processTable((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 19:
                        this.f11333b.processUl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 20:
                        this.f11333b.processText((TextNode) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 21:
                        this.f11333b.processDefault(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 22:
                        this.f11333b.processAside((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 23:
                        this.f11333b.processUnwrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 24:
                        this.f11333b.processWrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 25:
                        this.f11333b.processBlockQuote((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 26:
                        this.f11333b.processBr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 27:
                        this.f11333b.processCode((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 28:
                        this.f11333b.processDiv((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    default:
                        this.f11333b.processComment((Comment) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                }
            }
        });
        final int i45 = 21;
        HashSet hashSet = new HashSet(Arrays.asList(htmlNodeRendererHandler, htmlNodeRendererHandler2, htmlNodeRendererHandler3, htmlNodeRendererHandler4, htmlNodeRendererHandler5, htmlNodeRendererHandler6, htmlNodeRendererHandler7, htmlNodeRendererHandler8, htmlNodeRendererHandler9, htmlNodeRendererHandler10, htmlNodeRendererHandler11, htmlNodeRendererHandler12, htmlNodeRendererHandler13, htmlNodeRendererHandler14, htmlNodeRendererHandler15, htmlNodeRendererHandler16, htmlNodeRendererHandler17, htmlNodeRendererHandler18, htmlNodeRendererHandler19, htmlNodeRendererHandler20, htmlNodeRendererHandler21, htmlNodeRendererHandler22, htmlNodeRendererHandler23, htmlNodeRendererHandler24, htmlNodeRendererHandler25, htmlNodeRendererHandler26, htmlNodeRendererHandler27, htmlNodeRendererHandler28, htmlNodeRendererHandler29, htmlNodeRendererHandler30, htmlNodeRendererHandler31, htmlNodeRendererHandler32, htmlNodeRendererHandler33, htmlNodeRendererHandler34, htmlNodeRendererHandler35, htmlNodeRendererHandler36, htmlNodeRendererHandler37, htmlNodeRendererHandler38, htmlNodeRendererHandler39, new HtmlNodeRendererHandler(FlexmarkHtmlConverter.DEFAULT_NODE, Node.class, new CustomHtmlNodeRenderer(this) { // from class: com.vladsch.flexmark.html2md.converter.internal.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HtmlConverterCoreNodeRenderer f11333b;

            {
                this.f11333b = this;
            }

            @Override // com.vladsch.flexmark.html2md.converter.CustomHtmlNodeRenderer
            public final void render(Node node, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
                switch (i45) {
                    case 0:
                        this.f11333b.processHeading((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 1:
                        this.f11333b.processHr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 2:
                        this.f11333b.processA((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 3:
                        this.f11333b.processImg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 4:
                        this.f11333b.processInput((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11333b.processIns((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 6:
                        this.f11333b.processLi((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 7:
                        this.f11333b.processMath((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 8:
                        this.f11333b.processOl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11333b.processP((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11333b.processPre((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 11:
                        this.f11333b.processSpan((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 12:
                        this.f11333b.processAbbr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 13:
                        this.f11333b.processDel((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 14:
                        this.f11333b.processStrong((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 15:
                        this.f11333b.processSub((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11333b.processSup((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 17:
                        this.f11333b.processSvg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 18:
                        this.f11333b.processTable((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 19:
                        this.f11333b.processUl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 20:
                        this.f11333b.processText((TextNode) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 21:
                        this.f11333b.processDefault(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 22:
                        this.f11333b.processAside((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 23:
                        this.f11333b.processUnwrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 24:
                        this.f11333b.processWrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 25:
                        this.f11333b.processBlockQuote((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 26:
                        this.f11333b.processBr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 27:
                        this.f11333b.processCode((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    case 28:
                        this.f11333b.processDiv((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                    default:
                        this.f11333b.processComment((Comment) node, htmlNodeConverterContext, htmlMarkdownWriter);
                        return;
                }
            }
        })));
        String[] strArr = this.myHtmlConverterOptions.unwrappedTags;
        if (strArr.length > 0) {
            for (String str : strArr) {
                final int i46 = 23;
                hashSet.add(new HtmlNodeRendererHandler(str, Node.class, new CustomHtmlNodeRenderer(this) { // from class: com.vladsch.flexmark.html2md.converter.internal.b

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ HtmlConverterCoreNodeRenderer f11333b;

                    {
                        this.f11333b = this;
                    }

                    @Override // com.vladsch.flexmark.html2md.converter.CustomHtmlNodeRenderer
                    public final void render(Node node, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
                        switch (i46) {
                            case 0:
                                this.f11333b.processHeading((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                                return;
                            case 1:
                                this.f11333b.processHr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                                return;
                            case 2:
                                this.f11333b.processA((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                                return;
                            case 3:
                                this.f11333b.processImg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                                return;
                            case 4:
                                this.f11333b.processInput((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                                return;
                            case AbstractC1787b.f15290g /* 5 */:
                                this.f11333b.processIns((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                                return;
                            case 6:
                                this.f11333b.processLi((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                                return;
                            case 7:
                                this.f11333b.processMath((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                                return;
                            case 8:
                                this.f11333b.processOl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                                return;
                            case AbstractC1787b.f15287d /* 9 */:
                                this.f11333b.processP((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                                return;
                            case AbstractC1787b.f15289f /* 10 */:
                                this.f11333b.processPre((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                                return;
                            case 11:
                                this.f11333b.processSpan((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                                return;
                            case 12:
                                this.f11333b.processAbbr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                                return;
                            case 13:
                                this.f11333b.processDel((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                                return;
                            case 14:
                                this.f11333b.processStrong((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                                return;
                            case 15:
                                this.f11333b.processSub((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                                return;
                            case PegdownExtensions.AUTOLINKS /* 16 */:
                                this.f11333b.processSup((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                                return;
                            case 17:
                                this.f11333b.processSvg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                                return;
                            case 18:
                                this.f11333b.processTable((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                                return;
                            case 19:
                                this.f11333b.processUl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                                return;
                            case 20:
                                this.f11333b.processText((TextNode) node, htmlNodeConverterContext, htmlMarkdownWriter);
                                return;
                            case 21:
                                this.f11333b.processDefault(node, htmlNodeConverterContext, htmlMarkdownWriter);
                                return;
                            case 22:
                                this.f11333b.processAside((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                                return;
                            case 23:
                                this.f11333b.processUnwrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                                return;
                            case 24:
                                this.f11333b.processWrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                                return;
                            case 25:
                                this.f11333b.processBlockQuote((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                                return;
                            case 26:
                                this.f11333b.processBr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                                return;
                            case 27:
                                this.f11333b.processCode((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                                return;
                            case 28:
                                this.f11333b.processDiv((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                                return;
                            default:
                                this.f11333b.processComment((Comment) node, htmlNodeConverterContext, htmlMarkdownWriter);
                                return;
                        }
                    }
                }));
            }
        }
        String[] strArr2 = this.myHtmlConverterOptions.wrappedTags;
        if (strArr2.length > 0) {
            for (String str2 : strArr2) {
                final int i47 = 24;
                hashSet.add(new HtmlNodeRendererHandler(str2, Node.class, new CustomHtmlNodeRenderer(this) { // from class: com.vladsch.flexmark.html2md.converter.internal.b

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ HtmlConverterCoreNodeRenderer f11333b;

                    {
                        this.f11333b = this;
                    }

                    @Override // com.vladsch.flexmark.html2md.converter.CustomHtmlNodeRenderer
                    public final void render(Node node, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
                        switch (i47) {
                            case 0:
                                this.f11333b.processHeading((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                                return;
                            case 1:
                                this.f11333b.processHr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                                return;
                            case 2:
                                this.f11333b.processA((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                                return;
                            case 3:
                                this.f11333b.processImg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                                return;
                            case 4:
                                this.f11333b.processInput((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                                return;
                            case AbstractC1787b.f15290g /* 5 */:
                                this.f11333b.processIns((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                                return;
                            case 6:
                                this.f11333b.processLi((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                                return;
                            case 7:
                                this.f11333b.processMath((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                                return;
                            case 8:
                                this.f11333b.processOl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                                return;
                            case AbstractC1787b.f15287d /* 9 */:
                                this.f11333b.processP((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                                return;
                            case AbstractC1787b.f15289f /* 10 */:
                                this.f11333b.processPre((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                                return;
                            case 11:
                                this.f11333b.processSpan((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                                return;
                            case 12:
                                this.f11333b.processAbbr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                                return;
                            case 13:
                                this.f11333b.processDel((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                                return;
                            case 14:
                                this.f11333b.processStrong((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                                return;
                            case 15:
                                this.f11333b.processSub((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                                return;
                            case PegdownExtensions.AUTOLINKS /* 16 */:
                                this.f11333b.processSup((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                                return;
                            case 17:
                                this.f11333b.processSvg((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                                return;
                            case 18:
                                this.f11333b.processTable((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                                return;
                            case 19:
                                this.f11333b.processUl((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                                return;
                            case 20:
                                this.f11333b.processText((TextNode) node, htmlNodeConverterContext, htmlMarkdownWriter);
                                return;
                            case 21:
                                this.f11333b.processDefault(node, htmlNodeConverterContext, htmlMarkdownWriter);
                                return;
                            case 22:
                                this.f11333b.processAside((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                                return;
                            case 23:
                                this.f11333b.processUnwrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                                return;
                            case 24:
                                this.f11333b.processWrapped(node, htmlNodeConverterContext, htmlMarkdownWriter);
                                return;
                            case 25:
                                this.f11333b.processBlockQuote((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                                return;
                            case 26:
                                this.f11333b.processBr((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                                return;
                            case 27:
                                this.f11333b.processCode((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                                return;
                            case 28:
                                this.f11333b.processDiv((Element) node, htmlNodeConverterContext, htmlMarkdownWriter);
                                return;
                            default:
                                this.f11333b.processComment((Comment) node, htmlNodeConverterContext, htmlMarkdownWriter);
                                return;
                        }
                    }
                }));
            }
        }
        return hashSet;
    }

    @Override // com.vladsch.flexmark.html2md.converter.PhasedHtmlNodeRenderer
    public void renderDocument(HtmlNodeConverterContext htmlNodeConverterContext, LineAppendable lineAppendable, Document document, HtmlConverterPhase htmlConverterPhase) {
        ReferenceRepository referenceRepository;
        int i6 = AnonymousClass1.$SwitchMap$com$vladsch$flexmark$html2md$converter$HtmlConverterPhase[htmlConverterPhase.ordinal()];
        boolean z5 = true;
        if (i6 == 1) {
            com.vladsch.flexmark.util.ast.Document forDocument = htmlNodeConverterContext.getForDocument();
            if (forDocument == null || (referenceRepository = Parser.REFERENCES.get(forDocument)) == null) {
                return;
            }
            HashMap<String, Reference> referenceUrlToReferenceMap = htmlNodeConverterContext.getReferenceUrlToReferenceMap();
            HashSet<Reference> externalReferences = htmlNodeConverterContext.getExternalReferences();
            for (Reference reference : referenceRepository.getValues()) {
                referenceUrlToReferenceMap.put(reference.getUrl().toString(), reference);
                referenceUrlToReferenceMap.put(reference.getReference().toString(), reference);
                externalReferences.add(reference);
            }
            return;
        }
        if (i6 != 2) {
            return;
        }
        if (!this.myAbbreviations.isEmpty()) {
            lineAppendable.blankLine();
            for (Map.Entry<String, String> entry : this.myAbbreviations.entrySet()) {
                lineAppendable.line().append("*[").append((CharSequence) entry.getKey()).append("]: ").append((CharSequence) entry.getValue()).line();
            }
            lineAppendable.blankLine();
        }
        HashMap<String, Reference> referenceUrlToReferenceMap2 = htmlNodeConverterContext.getReferenceUrlToReferenceMap();
        if (!referenceUrlToReferenceMap2.isEmpty()) {
            HashSet<Reference> externalReferences2 = htmlNodeConverterContext.getExternalReferences();
            for (Map.Entry<String, Reference> entry2 : referenceUrlToReferenceMap2.entrySet()) {
                if (!externalReferences2.contains(entry2.getValue())) {
                    if (z5) {
                        lineAppendable.blankLine();
                        z5 = false;
                    }
                    lineAppendable.line().append((CharSequence) entry2.getValue().getChars()).line();
                }
            }
            if (!z5) {
                lineAppendable.blankLine();
            }
        }
        if (this.myMacrosMap.isEmpty()) {
            return;
        }
        for (Map.Entry<String, String> entry3 : this.myMacrosMap.entrySet()) {
            lineAppendable.blankLine();
            lineAppendable.append(">>>").append((CharSequence) entry3.getKey()).line();
            lineAppendable.append((CharSequence) BasedSequence.of(entry3.getValue()).trimEnd()).append(SequenceUtils.EOL);
            lineAppendable.append("<<<\n");
            lineAppendable.blankLine();
        }
    }
}
