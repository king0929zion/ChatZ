package com.vladsch.flexmark.util.html.ui;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.util.html.Attribute;
import com.vladsch.flexmark.util.html.AttributeImpl;
import com.vladsch.flexmark.util.html.Attributes;
import com.vladsch.flexmark.util.html.HtmlAppendableBase;
import com.vladsch.flexmark.util.sequence.LineAppendable;
import j1.AbstractC1135a;
import java.awt.Font;
import java.util.HashMap;
import java.util.Iterator;
import javax.swing.plaf.FontUIResource;

/* loaded from: classes.dex */
public class HtmlBuilder extends HtmlAppendableBase<HtmlBuilder> {
    public static final HashMap<Class, HtmlStyler> stylerMap;

    static {
        HashMap<Class, HtmlStyler> hashMap = new HashMap<>();
        stylerMap = hashMap;
        ColorStyler colorStyler = new ColorStyler();
        hashMap.put(BackgroundColor.class, colorStyler);
        hashMap.put(Color.class, colorStyler);
        hashMap.put(java.awt.Color.class, colorStyler);
        FontStyler fontStyler = new FontStyler();
        hashMap.put(Font.class, fontStyler);
        hashMap.put(FontUIResource.class, fontStyler);
        hashMap.put(FontStyle.class, new FontStyleStyler());
    }

    public HtmlBuilder() {
        super(0, LineAppendable.F_PASS_THROUGH);
    }

    public static void addColorStylerClass(Class cls) {
        HashMap<Class, HtmlStyler> hashMap = stylerMap;
        hashMap.put(cls, hashMap.get(Color.class));
    }

    public static Attribute getAttribute(Object obj) {
        String style;
        HtmlStyler htmlStyler = getHtmlStyler(obj);
        if (htmlStyler == null || (style = htmlStyler.getStyle(htmlStyler.getStyleable(obj))) == null || style.isEmpty()) {
            return null;
        }
        return AttributeImpl.of(Attribute.STYLE_ATTR, style);
    }

    public static HtmlStyler getHtmlStyler(Object obj) {
        HashMap<Class, HtmlStyler> hashMap = stylerMap;
        HtmlStyler htmlStyler = hashMap.get(obj.getClass());
        if (htmlStyler != null) {
            return htmlStyler;
        }
        Iterator<Class> it = hashMap.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Class next = it.next();
            if (next.isAssignableFrom(obj.getClass())) {
                htmlStyler = stylerMap.get(next);
                break;
            }
        }
        if (htmlStyler != null) {
            stylerMap.put(obj.getClass(), htmlStyler);
        }
        return htmlStyler;
    }

    public HtmlBuilder closeAllTags() {
        while (!getOpenTags().isEmpty()) {
            closeTag((CharSequence) getOpenTags().peek());
        }
        return this;
    }

    public HtmlBuilder closeSpan() {
        return closeTag(FlexmarkHtmlConverter.SPAN_NODE);
    }

    public HtmlBuilder span() {
        return tag(FlexmarkHtmlConverter.SPAN_NODE, false);
    }

    public HtmlBuilder spanLine(Runnable runnable) {
        return span(true, runnable);
    }

    public HtmlBuilder style(CharSequence charSequence) {
        super.withAttr();
        return (HtmlBuilder) super.attr(Attribute.STYLE_ATTR, charSequence);
    }

    public String toFinalizedString() {
        closeAllTags();
        return toString(0, 0);
    }

    public HtmlBuilder(int i6, int i7) {
        super(i6, i7);
    }

    public HtmlBuilder span(CharSequence charSequence) {
        tag(FlexmarkHtmlConverter.SPAN_NODE, false);
        text(charSequence);
        return closeSpan();
    }

    public HtmlBuilder span(boolean z5, Runnable runnable) {
        return tag(FlexmarkHtmlConverter.SPAN_NODE, false, z5, runnable);
    }

    public HtmlBuilder span(Runnable runnable) {
        return span(false, runnable);
    }

    public HtmlBuilder attr(Object... objArr) {
        for (Object obj : objArr) {
            if (obj instanceof Attribute) {
                super.attr((Attribute) obj);
                super.withAttr();
            } else {
                HtmlStyler htmlStyler = getHtmlStyler(obj);
                if (htmlStyler != null) {
                    String style = htmlStyler.getStyle(htmlStyler.getStyleable(obj));
                    if (style != null && !style.isEmpty()) {
                        super.attr(AttributeImpl.of(Attribute.STYLE_ATTR, style));
                        super.withAttr();
                    }
                } else {
                    throw new IllegalStateException(AbstractC1135a.f("Don't know how to style ", obj.getClass().getName().substring(getClass().getPackage().getName().length() + 1)));
                }
            }
        }
        return this;
    }

    public HtmlBuilder append(Object obj) {
        return (HtmlBuilder) super.append((CharSequence) String.valueOf(obj));
    }

    public HtmlBuilder append(String str) {
        return (HtmlBuilder) super.append((CharSequence) str);
    }

    public HtmlBuilder append(StringBuffer stringBuffer) {
        return (HtmlBuilder) super.append((CharSequence) stringBuffer.toString());
    }

    @Override // com.vladsch.flexmark.util.html.HtmlAppendableBase, com.vladsch.flexmark.util.sequence.LineAppendable, java.lang.Appendable
    public HtmlBuilder append(CharSequence charSequence) {
        return (HtmlBuilder) super.append(charSequence);
    }

    @Override // com.vladsch.flexmark.util.html.HtmlAppendableBase, com.vladsch.flexmark.util.sequence.LineAppendable, java.lang.Appendable
    public HtmlBuilder append(CharSequence charSequence, int i6, int i7) {
        return (HtmlBuilder) super.append(charSequence, i6, i7);
    }

    public HtmlBuilder append(char[] cArr) {
        return (HtmlBuilder) super.append((CharSequence) String.valueOf(cArr));
    }

    public HtmlBuilder append(char[] cArr, int i6, int i7) {
        return (HtmlBuilder) super.append((CharSequence) String.valueOf(cArr, i6, i7));
    }

    public HtmlBuilder append(boolean z5) {
        return (HtmlBuilder) super.append((CharSequence) (z5 ? "true" : "false"));
    }

    @Override // com.vladsch.flexmark.util.html.HtmlAppendableBase, com.vladsch.flexmark.util.sequence.LineAppendable, java.lang.Appendable
    public HtmlBuilder append(char c6) {
        return (HtmlBuilder) super.append(c6);
    }

    public HtmlBuilder append(int i6) {
        return (HtmlBuilder) super.append((CharSequence) String.valueOf(i6));
    }

    public HtmlBuilder append(long j3) {
        return (HtmlBuilder) super.append((CharSequence) String.valueOf(j3));
    }

    public HtmlBuilder append(float f6) {
        return (HtmlBuilder) super.append((CharSequence) String.valueOf(f6));
    }

    public HtmlBuilder append(double d6) {
        return (HtmlBuilder) super.append((CharSequence) String.valueOf(d6));
    }

    @Override // com.vladsch.flexmark.util.html.HtmlAppendableBase, com.vladsch.flexmark.util.html.HtmlAppendable
    public HtmlBuilder attr(CharSequence charSequence, CharSequence charSequence2) {
        super.withAttr();
        return (HtmlBuilder) super.attr(charSequence, charSequence2);
    }

    @Override // com.vladsch.flexmark.util.html.HtmlAppendableBase, com.vladsch.flexmark.util.html.HtmlAppendable
    public HtmlBuilder attr(Attribute... attributeArr) {
        super.withAttr();
        return (HtmlBuilder) super.attr(attributeArr);
    }

    @Override // com.vladsch.flexmark.util.html.HtmlAppendableBase, com.vladsch.flexmark.util.html.HtmlAppendable
    public HtmlBuilder attr(Attributes attributes) {
        super.withAttr();
        return (HtmlBuilder) super.attr(attributes);
    }
}
