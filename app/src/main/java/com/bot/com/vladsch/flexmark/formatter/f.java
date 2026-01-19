package com.vladsch.flexmark.formatter;

import com.vladsch.flexmark.formatter.Formatter;
import com.vladsch.flexmark.html.renderer.LinkType;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Function {
    public final /* synthetic */ int a;

    public /* synthetic */ f(int i6) {
        this.a = i6;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return Formatter.MainNodeFormatter.a((Class) obj);
            case 1:
                return Formatter.MainNodeFormatter.b((LinkType) obj);
            default:
                return FormatterUtils.c((CharSequence) obj);
        }
    }
}
