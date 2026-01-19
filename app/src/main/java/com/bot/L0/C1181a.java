package l0;

import m4.AbstractC1277l;
import o0.C1387I;
import o0.C1403n;
import o0.y;

/* renamed from: l0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1181a extends AbstractC1277l implements l4.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f12636e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f12637f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f12638g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f12639h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1181a(float f6, float f7, int i6, boolean z5) {
        super(1);
        this.f12636e = f6;
        this.f12637f = f7;
        this.f12638g = i6;
        this.f12639h = z5;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        C1387I c1387i = (C1387I) obj;
        float a = c1387i.f13429t.a() * this.f12636e;
        float a6 = c1387i.f13429t.a() * this.f12637f;
        c1387i.h((a <= S.l.f7374V || a6 <= S.l.f7374V) ? null : new C1403n(a, a6, this.f12638g));
        c1387i.m(y.f13496b);
        c1387i.g(this.f12639h);
        return X3.y.a;
    }
}
