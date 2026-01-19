package m;

import F0.j0;
import F0.k0;
import m4.AbstractC1277l;

/* renamed from: m.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1228j extends AbstractC1277l implements l4.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k0[] f12813e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1229k f12814f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f12815g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f12816h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1228j(k0[] k0VarArr, C1229k c1229k, int i6, int i7) {
        super(1);
        this.f12813e = k0VarArr;
        this.f12814f = c1229k;
        this.f12815g = i6;
        this.f12816h = i7;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        j0 j0Var = (j0) obj;
        for (k0 k0Var : this.f12813e) {
            if (k0Var != null) {
                long a = this.f12814f.a.f12831b.a((k0Var.f1485c << 32) | (k0Var.f1486e & 4294967295L), (this.f12815g << 32) | (this.f12816h & 4294967295L), e1.m.f11576c);
                j0Var.h(k0Var, (int) (a >> 32), (int) (a & 4294967295L), S.l.f7374V);
            }
        }
        return X3.y.a;
    }
}
