package com.vladsch.flexmark.util.sequence;

import java.util.function.Predicate;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Predicate {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IRichSequenceBase f11373b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f11374c;

    public /* synthetic */ a(IRichSequenceBase iRichSequenceBase, boolean z5, int i6) {
        this.a = i6;
        this.f11373b = iRichSequenceBase;
        this.f11374c = z5;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return IRichSequenceBase.c(this.f11373b, this.f11374c, (CharSequence) obj);
            case 1:
                return IRichSequenceBase.b(this.f11373b, this.f11374c, (CharSequence) obj);
            case 2:
                return IRichSequenceBase.e(this.f11373b, this.f11374c, (CharSequence) obj);
            default:
                return IRichSequenceBase.g(this.f11373b, this.f11374c, (CharSequence) obj);
        }
    }
}
