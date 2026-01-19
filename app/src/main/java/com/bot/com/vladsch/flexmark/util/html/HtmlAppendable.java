package com.vladsch.flexmark.util.html;

import com.vladsch.flexmark.util.sequence.LineAppendable;
import java.util.List;
import java.util.Stack;

/* loaded from: classes.dex */
public interface HtmlAppendable extends LineAppendable {
    HtmlAppendable attr(Attributes attributes);

    HtmlAppendable attr(CharSequence charSequence, CharSequence charSequence2);

    HtmlAppendable attr(Attribute... attributeArr);

    HtmlAppendable closePre();

    HtmlAppendable closeTag(CharSequence charSequence);

    Attributes getAttributes();

    Stack<String> getOpenTags();

    List<String> getOpenTagsAfterLast(CharSequence charSequence);

    boolean inPre();

    HtmlAppendable openPre();

    HtmlAppendable raw(CharSequence charSequence);

    HtmlAppendable raw(CharSequence charSequence, int i6);

    HtmlAppendable rawIndentedPre(CharSequence charSequence);

    HtmlAppendable rawPre(CharSequence charSequence);

    HtmlAppendable setAttributes(Attributes attributes);

    HtmlAppendable tag(CharSequence charSequence);

    HtmlAppendable tag(CharSequence charSequence, Runnable runnable);

    HtmlAppendable tag(CharSequence charSequence, boolean z5);

    HtmlAppendable tag(CharSequence charSequence, boolean z5, boolean z6, Runnable runnable);

    HtmlAppendable tagIndent(CharSequence charSequence, Runnable runnable);

    HtmlAppendable tagLine(CharSequence charSequence);

    HtmlAppendable tagLine(CharSequence charSequence, Runnable runnable);

    HtmlAppendable tagLine(CharSequence charSequence, boolean z5);

    HtmlAppendable tagLineIndent(CharSequence charSequence, Runnable runnable);

    HtmlAppendable tagVoid(CharSequence charSequence);

    HtmlAppendable tagVoidLine(CharSequence charSequence);

    HtmlAppendable text(CharSequence charSequence);

    HtmlAppendable withAttr();

    HtmlAppendable withCondIndent();

    HtmlAppendable withCondLineOnChildText();
}
