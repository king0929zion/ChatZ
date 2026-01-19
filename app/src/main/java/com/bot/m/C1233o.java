package m;

import F0.j0;
import F0.k0;
import h0.InterfaceC1028e;
import m4.AbstractC1277l;

/* renamed from: m.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1233o extends AbstractC1277l implements l4.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1235q f12819e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k0 f12820f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f12821g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1233o(C1235q c1235q, k0 k0Var, long j3) {
        super(1);
        this.f12819e = c1235q;
        this.f12820f = k0Var;
        this.f12821g = j3;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        InterfaceC1028e interfaceC1028e = this.f12819e.f12827u.f12831b;
        j0.k((j0) obj, this.f12820f, interfaceC1028e.a((r0.f1486e & 4294967295L) | (r0.f1485c << 32), this.f12821g, e1.m.f11576c));
        return X3.y.a;
    }
}
