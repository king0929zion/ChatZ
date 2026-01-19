package m;

import F0.j0;
import F0.k0;
import m4.AbstractC1277l;

/* renamed from: m.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1206M extends AbstractC1277l implements l4.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k0 f12739e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f12740f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f12741g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c.f f12742h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1206M(k0 k0Var, long j3, long j4, c.f fVar) {
        super(1);
        this.f12739e = k0Var;
        this.f12740f = j3;
        this.f12741g = j4;
        this.f12742h = fVar;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        j0 j0Var = (j0) obj;
        long j3 = this.f12740f;
        long j4 = this.f12741g;
        j0Var.getClass();
        k0 k0Var = this.f12739e;
        j0.b(j0Var, k0Var);
        k0Var.m0(e1.j.e(((((int) (j3 >> 32)) + ((int) (j4 >> 32))) << 32) | ((((int) (j3 & 4294967295L)) + ((int) (j4 & 4294967295L))) & 4294967295L), k0Var.f1489h), S.l.f7374V, this.f12742h);
        return X3.y.a;
    }
}
