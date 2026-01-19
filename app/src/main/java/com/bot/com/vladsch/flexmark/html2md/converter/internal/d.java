package com.vladsch.flexmark.html2md.converter.internal;

import com.vladsch.flexmark.util.misc.CharPredicate;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements CharPredicate {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ char f11338b;

    public /* synthetic */ d(char c6, int i6) {
        this.a = i6;
        this.f11338b = c6;
    }

    @Override // com.vladsch.flexmark.util.misc.CharPredicate, java.util.function.IntPredicate
    public final boolean test(int i6) {
        switch (this.a) {
            case 0:
                return HtmlConverterCoreNodeRenderer.p(this.f11338b, i6);
            default:
                return CharPredicate.y(this.f11338b, i6);
        }
    }
}
