package com.vladsch.flexmark.parser.internal;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class HtmlDeepParser {
    public static final Set<String> BLOCK_TAGS;
    public static final Map<String, Set<String>> OPTIONAL_TAGS;
    private static final HtmlMatch[] PATTERN_MAP;
    public static final Pattern START_PATTERN;
    public static final Set<String> VOID_TAGS;
    private final HashSet<String> myBlockTags;
    private Pattern myClosingPattern;
    private boolean myFirstBlockTag;
    private int myHtmlCount;
    private HtmlMatch myHtmlMatch;
    private final ArrayList<String> myOpenTags;

    /* loaded from: classes.dex */
    public enum HtmlMatch {
        NONE(null, null, false),
        SCRIPT("<(script)(?:\\s|>|$)", "</script>", true),
        STYLE("<(style)(?:\\s|>|$)", "</style>", true),
        OPEN_TAG("<((?:(?:(?:[_A-Za-zÀ-ÖØ-öø-˿Ͱ-ͽͿ-\u1fff\u200c-\u200d⁰-\u218fⰀ-\u2fef、-\ud7ff豈-\ufdcfﷰ-�])(?:[_A-Za-zÀ-ÖØ-öø-˿Ͱ-ͽͿ-\u1fff\u200c-\u200d⁰-\u218fⰀ-\u2fef、-\ud7ff豈-\ufdcfﷰ-�]|[.0-9·̀-ͯ‿-⁀-])*:)?)[A-Za-z][A-Za-z0-9-]*)", "<|/>|\\s/>|>", true),
        CLOSE_TAG("</((?:(?:(?:[_A-Za-zÀ-ÖØ-öø-˿Ͱ-ͽͿ-\u1fff\u200c-\u200d⁰-\u218fⰀ-\u2fef、-\ud7ff豈-\ufdcfﷰ-�])(?:[_A-Za-zÀ-ÖØ-öø-˿Ͱ-ͽͿ-\u1fff\u200c-\u200d⁰-\u218fⰀ-\u2fef、-\ud7ff豈-\ufdcfﷰ-�]|[.0-9·̀-ͯ‿-⁀-])*:)?)[A-Za-z][A-Za-z0-9-]*)>", null, true),
        NON_TAG("<(![A-Z])", ">", false),
        TEMPLATE("<([?])", "\\?>", false),
        COMMENT("<(!--)", "-->", false),
        CDATA("<!\\[(CDATA)\\[", "\\]\\]>", false);

        public final boolean caseInsentive;
        public final Pattern close;
        public final Pattern open;

        HtmlMatch(String str, String str2, boolean z5) {
            Pattern compile;
            Pattern pattern = null;
            if (str == null) {
                compile = null;
            } else {
                compile = Pattern.compile(str, z5 ? 2 : 0);
            }
            this.open = compile;
            if (str2 != null) {
                pattern = Pattern.compile(str2, z5 ? 2 : 0);
            }
            this.close = pattern;
            this.caseInsentive = z5;
        }
    }

    static {
        HashSet hashSet = new HashSet();
        BLOCK_TAGS = hashSet;
        HashSet hashSet2 = new HashSet();
        VOID_TAGS = hashSet2;
        hashSet.addAll(Arrays.asList("address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|meta|nav|noframes|ol|optgroup|option|p|param|pre|section|source|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul".split("\\|")));
        hashSet2.addAll(Arrays.asList("area|base|br|col|embed|hr|img|input|keygen|link|menuitem|meta|param|source|track|wbr".split("\\|")));
        HashMap hashMap = new HashMap();
        OPTIONAL_TAGS = hashMap;
        hashMap.put(FlexmarkHtmlConverter.LI_NODE, new HashSet(Arrays.asList(FlexmarkHtmlConverter.LI_NODE)));
        hashMap.put(FlexmarkHtmlConverter.DT_NODE, new HashSet(Arrays.asList(FlexmarkHtmlConverter.DT_NODE, FlexmarkHtmlConverter.DD_NODE)));
        hashMap.put(FlexmarkHtmlConverter.DD_NODE, new HashSet(Arrays.asList(FlexmarkHtmlConverter.DD_NODE, FlexmarkHtmlConverter.DT_NODE)));
        hashMap.put(FlexmarkHtmlConverter.P_NODE, new HashSet(Arrays.asList("address", "article", FlexmarkHtmlConverter.ASIDE_NODE, FlexmarkHtmlConverter.BLOCKQUOTE_NODE, "details", FlexmarkHtmlConverter.DIV_NODE, FlexmarkHtmlConverter.DL_NODE, "fieldset", "figcaption", "figure", "footer", "form", FlexmarkHtmlConverter.H1_NODE, FlexmarkHtmlConverter.H2_NODE, FlexmarkHtmlConverter.H3_NODE, FlexmarkHtmlConverter.H4_NODE, FlexmarkHtmlConverter.H5_NODE, FlexmarkHtmlConverter.H6_NODE, "header", FlexmarkHtmlConverter.HR_NODE, "main", "menu", "nav", FlexmarkHtmlConverter.OL_NODE, FlexmarkHtmlConverter.P_NODE, FlexmarkHtmlConverter.PRE_NODE, "section", FlexmarkHtmlConverter.TABLE_NODE, FlexmarkHtmlConverter.UL_NODE)));
        hashMap.put("rt", new HashSet(Arrays.asList("rt", "rp")));
        hashMap.put("rp", new HashSet(Arrays.asList("rt", "rp")));
        hashMap.put("optgroup", new HashSet(Arrays.asList("optgroup")));
        hashMap.put("option", new HashSet(Arrays.asList("option", "optgroup")));
        hashMap.put("colgroup", new HashSet(Arrays.asList("colgroup")));
        hashMap.put(FlexmarkHtmlConverter.THEAD_NODE, new HashSet(Arrays.asList(FlexmarkHtmlConverter.TBODY_NODE, "tfoot")));
        hashMap.put(FlexmarkHtmlConverter.TBODY_NODE, new HashSet(Arrays.asList(FlexmarkHtmlConverter.TBODY_NODE, "tfoot")));
        hashMap.put("tfoot", new HashSet(Arrays.asList(FlexmarkHtmlConverter.TBODY_NODE)));
        hashMap.put(FlexmarkHtmlConverter.TR_NODE, new HashSet(Arrays.asList(FlexmarkHtmlConverter.TR_NODE)));
        hashMap.put(FlexmarkHtmlConverter.TD_NODE, new HashSet(Arrays.asList(FlexmarkHtmlConverter.TD_NODE, FlexmarkHtmlConverter.TH_NODE)));
        hashMap.put(FlexmarkHtmlConverter.TH_NODE, new HashSet(Arrays.asList(FlexmarkHtmlConverter.TD_NODE, FlexmarkHtmlConverter.TH_NODE)));
        PATTERN_MAP = new HtmlMatch[HtmlMatch.values().length];
        StringBuilder sb = new StringBuilder();
        int i6 = 0;
        for (HtmlMatch htmlMatch : HtmlMatch.values()) {
            if (htmlMatch != HtmlMatch.NONE) {
                if (sb.length() != 0) {
                    sb.append("|");
                }
                if (htmlMatch.caseInsentive) {
                    sb.append("(?i:");
                    sb.append(htmlMatch.open.pattern());
                    sb.append(")");
                } else {
                    sb.append(htmlMatch.open.pattern());
                }
                PATTERN_MAP[i6] = htmlMatch;
            }
            i6++;
        }
        START_PATTERN = Pattern.compile(sb.toString());
    }

    public HtmlDeepParser() {
        this(Collections.EMPTY_LIST);
    }

    private void openTag(String str) {
        if (!this.myOpenTags.isEmpty()) {
            String str2 = this.myOpenTags.get(r0.size() - 1);
            Map<String, Set<String>> map = OPTIONAL_TAGS;
            if (map.containsKey(str2) && map.get(str2).contains(str)) {
                this.myOpenTags.set(r0.size() - 1, str);
                return;
            }
        }
        this.myOpenTags.add(str);
        this.myFirstBlockTag = this.myBlockTags.contains(str);
    }

    public Pattern getClosingPattern() {
        return this.myClosingPattern;
    }

    public int getHtmlCount() {
        return this.myHtmlCount;
    }

    public HtmlMatch getHtmlMatch() {
        return this.myHtmlMatch;
    }

    public ArrayList<String> getOpenTags() {
        return this.myOpenTags;
    }

    public boolean hadHtml() {
        return this.myHtmlCount > 0 || !isHtmlClosed();
    }

    public boolean haveOpenBlockTag() {
        if (!this.myOpenTags.isEmpty()) {
            ArrayList<String> arrayList = this.myOpenTags;
            int size = arrayList.size();
            int i6 = 0;
            while (i6 < size) {
                String str = arrayList.get(i6);
                i6++;
                if (this.myBlockTags.contains(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean haveOpenRawTag() {
        return (this.myClosingPattern == null || this.myHtmlMatch == HtmlMatch.OPEN_TAG) ? false : true;
    }

    public boolean isBlankLineInterruptible() {
        return (this.myOpenTags.isEmpty() && this.myClosingPattern == null) || (this.myHtmlMatch == HtmlMatch.OPEN_TAG && this.myClosingPattern != null && this.myOpenTags.size() == 1);
    }

    public boolean isFirstBlockTag() {
        return this.myFirstBlockTag;
    }

    public boolean isHtmlClosed() {
        return this.myClosingPattern == null && this.myOpenTags.isEmpty();
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0055, code lost:
    
        if (r3.group().endsWith("/>") == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0057, code lost:
    
        if (r2 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0059, code lost:
    
        r14 = r10.myOpenTags;
        r14.remove(r14.size() - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0063, code lost:
    
        r14 = r10.myHtmlCount;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0065, code lost:
    
        if (r14 != 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0067, code lost:
    
        r10.myHtmlCount = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x007e, code lost:
    
        r11 = r11.subSequence(r3.end(), r11.length());
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x006c, code lost:
    
        if (r2 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0074, code lost:
    
        if (com.vladsch.flexmark.parser.internal.HtmlDeepParser.VOID_TAGS.contains(r2) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0076, code lost:
    
        openTag(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0079, code lost:
    
        r10.myHtmlCount++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x008c, code lost:
    
        r11 = r11.subSequence(r3.end(), r11.length());
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0019, code lost:
    
        r3 = r3.matcher(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0021, code lost:
    
        if (r3.find() != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0029, code lost:
    
        if (r10.myHtmlMatch != com.vladsch.flexmark.parser.internal.HtmlDeepParser.HtmlMatch.OPEN_TAG) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0035, code lost:
    
        if (r3.group().equals("<") == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0037, code lost:
    
        if (r2 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0039, code lost:
    
        r2 = r10.myOpenTags;
        r2.remove(r2.size() - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0044, code lost:
    
        if (r14 == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0046, code lost:
    
        r10.myClosingPattern = null;
        r2 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void parseHtmlChunk(java.lang.CharSequence r11, boolean r12, boolean r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vladsch.flexmark.parser.internal.HtmlDeepParser.parseHtmlChunk(java.lang.CharSequence, boolean, boolean, boolean):void");
    }

    public HtmlDeepParser(List<String> list) {
        this.myOpenTags = new ArrayList<>();
        this.myClosingPattern = null;
        this.myHtmlMatch = null;
        this.myHtmlCount = 0;
        this.myFirstBlockTag = false;
        HashSet<String> hashSet = new HashSet<>(BLOCK_TAGS);
        this.myBlockTags = hashSet;
        hashSet.addAll(list);
    }
}
