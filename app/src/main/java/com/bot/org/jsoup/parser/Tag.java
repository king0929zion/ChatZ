package org.jsoup.parser;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.util.html.Attribute;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import v.AbstractC1787b;

/* loaded from: classes.dex */
public class Tag implements Cloneable {
    private static final Map<String, Tag> Tags = new HashMap();
    private static final String[] blockTags;
    private static final String[] emptyTags;
    private static final String[] formListedTags;
    private static final String[] formSubmitTags;
    private static final String[] formatAsInlineTags;
    private static final String[] inlineTags;
    private static final Map<String, String[]> namespaces;
    private static final String[] preserveWhitespaceTags;
    private String namespace;
    private final String normalName;
    private String tagName;
    private boolean isBlock = true;
    private boolean formatAsBlock = true;
    private boolean empty = false;
    private boolean selfClosing = false;
    private boolean preserveWhitespace = false;
    private boolean formList = false;
    private boolean formSubmit = false;

    static {
        String[] strArr = {"html", "head", "body", "frameset", "script", "noscript", Attribute.STYLE_ATTR, "meta", "link", Attribute.TITLE_ATTR, "frame", "noframes", "section", "nav", FlexmarkHtmlConverter.ASIDE_NODE, "hgroup", "header", "footer", FlexmarkHtmlConverter.P_NODE, FlexmarkHtmlConverter.H1_NODE, FlexmarkHtmlConverter.H2_NODE, FlexmarkHtmlConverter.H3_NODE, FlexmarkHtmlConverter.H4_NODE, FlexmarkHtmlConverter.H5_NODE, FlexmarkHtmlConverter.H6_NODE, FlexmarkHtmlConverter.UL_NODE, FlexmarkHtmlConverter.OL_NODE, FlexmarkHtmlConverter.PRE_NODE, FlexmarkHtmlConverter.DIV_NODE, FlexmarkHtmlConverter.BLOCKQUOTE_NODE, FlexmarkHtmlConverter.HR_NODE, "address", "figure", "figcaption", "form", "fieldset", FlexmarkHtmlConverter.INS_NODE, FlexmarkHtmlConverter.DEL_NODE, FlexmarkHtmlConverter.DL_NODE, FlexmarkHtmlConverter.DT_NODE, FlexmarkHtmlConverter.DD_NODE, FlexmarkHtmlConverter.LI_NODE, FlexmarkHtmlConverter.TABLE_NODE, FlexmarkHtmlConverter.CAPTION_NODE, FlexmarkHtmlConverter.THEAD_NODE, "tfoot", FlexmarkHtmlConverter.TBODY_NODE, "colgroup", "col", FlexmarkHtmlConverter.TR_NODE, FlexmarkHtmlConverter.TH_NODE, FlexmarkHtmlConverter.TD_NODE, "video", "audio", "canvas", "details", "menu", "plaintext", "template", "article", "main", FlexmarkHtmlConverter.SVG_NODE, FlexmarkHtmlConverter.MATH_NODE, "center", "template", "dir", "applet", "marquee", "listing"};
        blockTags = strArr;
        String[] strArr2 = {"object", "base", "font", "tt", FlexmarkHtmlConverter.I_NODE, FlexmarkHtmlConverter.B_NODE, FlexmarkHtmlConverter.U_NODE, "big", "small", FlexmarkHtmlConverter.EM_NODE, FlexmarkHtmlConverter.STRONG_NODE, "dfn", FlexmarkHtmlConverter.CODE_NODE, "samp", "kbd", "var", "cite", FlexmarkHtmlConverter.ABBR_NODE, "time", "acronym", "mark", "ruby", "rt", "rp", "rtc", FlexmarkHtmlConverter.A_NODE, FlexmarkHtmlConverter.IMG_NODE, FlexmarkHtmlConverter.BR_NODE, "wbr", "map", "q", FlexmarkHtmlConverter.SUB_NODE, FlexmarkHtmlConverter.SUP_NODE, "bdo", "iframe", "embed", FlexmarkHtmlConverter.SPAN_NODE, FlexmarkHtmlConverter.INPUT_NODE, "select", "textarea", "label", "button", "optgroup", "option", "legend", "datalist", "keygen", "output", "progress", "meter", "area", "param", "source", "track", "summary", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track", "data", "bdi", "s", FlexmarkHtmlConverter.STRIKE_NODE, "nobr", "rb", "text", "mi", "mo", "msup", "mn", "mtext"};
        inlineTags = strArr2;
        String[] strArr3 = {"meta", "link", "base", "frame", FlexmarkHtmlConverter.IMG_NODE, FlexmarkHtmlConverter.BR_NODE, "wbr", "embed", FlexmarkHtmlConverter.HR_NODE, FlexmarkHtmlConverter.INPUT_NODE, "keygen", "col", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track"};
        emptyTags = strArr3;
        String[] strArr4 = {Attribute.TITLE_ATTR, FlexmarkHtmlConverter.A_NODE, FlexmarkHtmlConverter.P_NODE, FlexmarkHtmlConverter.H1_NODE, FlexmarkHtmlConverter.H2_NODE, FlexmarkHtmlConverter.H3_NODE, FlexmarkHtmlConverter.H4_NODE, FlexmarkHtmlConverter.H5_NODE, FlexmarkHtmlConverter.H6_NODE, FlexmarkHtmlConverter.PRE_NODE, "address", FlexmarkHtmlConverter.LI_NODE, FlexmarkHtmlConverter.TH_NODE, FlexmarkHtmlConverter.TD_NODE, "script", Attribute.STYLE_ATTR, FlexmarkHtmlConverter.INS_NODE, FlexmarkHtmlConverter.DEL_NODE, "s"};
        formatAsInlineTags = strArr4;
        String[] strArr5 = {FlexmarkHtmlConverter.PRE_NODE, "plaintext", Attribute.TITLE_ATTR, "textarea"};
        preserveWhitespaceTags = strArr5;
        String[] strArr6 = {"button", "fieldset", FlexmarkHtmlConverter.INPUT_NODE, "keygen", "object", "output", "select", "textarea"};
        formListedTags = strArr6;
        String[] strArr7 = {FlexmarkHtmlConverter.INPUT_NODE, "keygen", "object", "select", "textarea"};
        formSubmitTags = strArr7;
        HashMap hashMap = new HashMap();
        namespaces = hashMap;
        hashMap.put(Parser.NamespaceMathml, new String[]{FlexmarkHtmlConverter.MATH_NODE, "mi", "mo", "msup", "mn", "mtext"});
        hashMap.put(Parser.NamespaceSvg, new String[]{FlexmarkHtmlConverter.SVG_NODE, "text"});
        final int i6 = 0;
        setupTags(strArr, new Consumer() { // from class: org.jsoup.parser.a
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Tag tag = (Tag) obj;
                switch (i6) {
                    case 0:
                        Tag.lambda$static$0(tag);
                        return;
                    case 1:
                        Tag.lambda$static$1(tag);
                        return;
                    case 2:
                        tag.empty = true;
                        return;
                    case 3:
                        tag.formatAsBlock = false;
                        return;
                    case 4:
                        tag.preserveWhitespace = true;
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        tag.formList = true;
                        return;
                    default:
                        tag.formSubmit = true;
                        return;
                }
            }
        });
        final int i7 = 1;
        setupTags(strArr2, new Consumer() { // from class: org.jsoup.parser.a
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Tag tag = (Tag) obj;
                switch (i7) {
                    case 0:
                        Tag.lambda$static$0(tag);
                        return;
                    case 1:
                        Tag.lambda$static$1(tag);
                        return;
                    case 2:
                        tag.empty = true;
                        return;
                    case 3:
                        tag.formatAsBlock = false;
                        return;
                    case 4:
                        tag.preserveWhitespace = true;
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        tag.formList = true;
                        return;
                    default:
                        tag.formSubmit = true;
                        return;
                }
            }
        });
        final int i8 = 2;
        setupTags(strArr3, new Consumer() { // from class: org.jsoup.parser.a
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Tag tag = (Tag) obj;
                switch (i8) {
                    case 0:
                        Tag.lambda$static$0(tag);
                        return;
                    case 1:
                        Tag.lambda$static$1(tag);
                        return;
                    case 2:
                        tag.empty = true;
                        return;
                    case 3:
                        tag.formatAsBlock = false;
                        return;
                    case 4:
                        tag.preserveWhitespace = true;
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        tag.formList = true;
                        return;
                    default:
                        tag.formSubmit = true;
                        return;
                }
            }
        });
        final int i9 = 3;
        setupTags(strArr4, new Consumer() { // from class: org.jsoup.parser.a
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Tag tag = (Tag) obj;
                switch (i9) {
                    case 0:
                        Tag.lambda$static$0(tag);
                        return;
                    case 1:
                        Tag.lambda$static$1(tag);
                        return;
                    case 2:
                        tag.empty = true;
                        return;
                    case 3:
                        tag.formatAsBlock = false;
                        return;
                    case 4:
                        tag.preserveWhitespace = true;
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        tag.formList = true;
                        return;
                    default:
                        tag.formSubmit = true;
                        return;
                }
            }
        });
        final int i10 = 4;
        setupTags(strArr5, new Consumer() { // from class: org.jsoup.parser.a
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Tag tag = (Tag) obj;
                switch (i10) {
                    case 0:
                        Tag.lambda$static$0(tag);
                        return;
                    case 1:
                        Tag.lambda$static$1(tag);
                        return;
                    case 2:
                        tag.empty = true;
                        return;
                    case 3:
                        tag.formatAsBlock = false;
                        return;
                    case 4:
                        tag.preserveWhitespace = true;
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        tag.formList = true;
                        return;
                    default:
                        tag.formSubmit = true;
                        return;
                }
            }
        });
        final int i11 = 5;
        setupTags(strArr6, new Consumer() { // from class: org.jsoup.parser.a
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Tag tag = (Tag) obj;
                switch (i11) {
                    case 0:
                        Tag.lambda$static$0(tag);
                        return;
                    case 1:
                        Tag.lambda$static$1(tag);
                        return;
                    case 2:
                        tag.empty = true;
                        return;
                    case 3:
                        tag.formatAsBlock = false;
                        return;
                    case 4:
                        tag.preserveWhitespace = true;
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        tag.formList = true;
                        return;
                    default:
                        tag.formSubmit = true;
                        return;
                }
            }
        });
        final int i12 = 6;
        setupTags(strArr7, new Consumer() { // from class: org.jsoup.parser.a
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Tag tag = (Tag) obj;
                switch (i12) {
                    case 0:
                        Tag.lambda$static$0(tag);
                        return;
                    case 1:
                        Tag.lambda$static$1(tag);
                        return;
                    case 2:
                        tag.empty = true;
                        return;
                    case 3:
                        tag.formatAsBlock = false;
                        return;
                    case 4:
                        tag.preserveWhitespace = true;
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        tag.formList = true;
                        return;
                    default:
                        tag.formSubmit = true;
                        return;
                }
            }
        });
        for (Map.Entry entry : hashMap.entrySet()) {
            setupTags((String[]) entry.getValue(), new org.jsoup.nodes.a(entry, 1));
        }
    }

    private Tag(String str, String str2) {
        this.tagName = str;
        this.normalName = Normalizer.lowerCase(str);
        this.namespace = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$0(Tag tag) {
        tag.isBlock = true;
        tag.formatAsBlock = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$1(Tag tag) {
        tag.isBlock = false;
        tag.formatAsBlock = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$7(Map.Entry entry, Tag tag) {
        tag.namespace = (String) entry.getKey();
    }

    private static void setupTags(String[] strArr, Consumer<Tag> consumer) {
        for (String str : strArr) {
            Map<String, Tag> map = Tags;
            Tag tag = map.get(str);
            if (tag == null) {
                tag = new Tag(str, Parser.NamespaceHtml);
                map.put(tag.tagName, tag);
            }
            consumer.accept(tag);
        }
    }

    public static Tag valueOf(String str, String str2, ParseSettings parseSettings) {
        Validate.notEmpty(str);
        Validate.notNull(str2);
        Map<String, Tag> map = Tags;
        Tag tag = map.get(str);
        if (tag != null && tag.namespace.equals(str2)) {
            return tag;
        }
        String normalizeTag = parseSettings.normalizeTag(str);
        Validate.notEmpty(normalizeTag);
        String lowerCase = Normalizer.lowerCase(normalizeTag);
        Tag tag2 = map.get(lowerCase);
        if (tag2 != null && tag2.namespace.equals(str2)) {
            if (!parseSettings.preserveTagCase() || normalizeTag.equals(lowerCase)) {
                return tag2;
            }
            Tag clone = tag2.clone();
            clone.tagName = normalizeTag;
            return clone;
        }
        Tag tag3 = new Tag(normalizeTag, str2);
        tag3.isBlock = false;
        return tag3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Tag)) {
            return false;
        }
        Tag tag = (Tag) obj;
        return this.tagName.equals(tag.tagName) && this.empty == tag.empty && this.formatAsBlock == tag.formatAsBlock && this.isBlock == tag.isBlock && this.preserveWhitespace == tag.preserveWhitespace && this.selfClosing == tag.selfClosing && this.formList == tag.formList && this.formSubmit == tag.formSubmit;
    }

    public boolean formatAsBlock() {
        return this.formatAsBlock;
    }

    public String getName() {
        return this.tagName;
    }

    public int hashCode() {
        return (((((((((((((this.tagName.hashCode() * 31) + (this.isBlock ? 1 : 0)) * 31) + (this.formatAsBlock ? 1 : 0)) * 31) + (this.empty ? 1 : 0)) * 31) + (this.selfClosing ? 1 : 0)) * 31) + (this.preserveWhitespace ? 1 : 0)) * 31) + (this.formList ? 1 : 0)) * 31) + (this.formSubmit ? 1 : 0);
    }

    public boolean isBlock() {
        return this.isBlock;
    }

    public boolean isEmpty() {
        return this.empty;
    }

    public boolean isFormListed() {
        return this.formList;
    }

    public boolean isFormSubmittable() {
        return this.formSubmit;
    }

    public boolean isInline() {
        return !this.isBlock;
    }

    public boolean isKnownTag() {
        return Tags.containsKey(this.tagName);
    }

    public boolean isSelfClosing() {
        return this.empty || this.selfClosing;
    }

    public String namespace() {
        return this.namespace;
    }

    public String normalName() {
        return this.normalName;
    }

    public boolean preserveWhitespace() {
        return this.preserveWhitespace;
    }

    public Tag setSelfClosing() {
        this.selfClosing = true;
        return this;
    }

    public String toString() {
        return this.tagName;
    }

    public static boolean isKnownTag(String str) {
        return Tags.containsKey(str);
    }

    public Tag clone() {
        try {
            return (Tag) super.clone();
        } catch (CloneNotSupportedException e6) {
            throw new RuntimeException(e6);
        }
    }

    public static Tag valueOf(String str) {
        return valueOf(str, Parser.NamespaceHtml, ParseSettings.preserveCase);
    }

    public static Tag valueOf(String str, ParseSettings parseSettings) {
        return valueOf(str, Parser.NamespaceHtml, parseSettings);
    }
}
