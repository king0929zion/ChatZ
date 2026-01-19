package y;

import java.util.List;
import java.util.Map;
import k.AbstractC1168o;
import k.C1147A;

/* loaded from: classes.dex */
public final class U implements F0.X {

    /* renamed from: c, reason: collision with root package name */
    public final C1956M f15813c;

    /* renamed from: e, reason: collision with root package name */
    public final F0.w0 f15814e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC1957N f15815f;

    /* renamed from: g, reason: collision with root package name */
    public final C1147A f15816g;

    public U(C1956M c1956m, F0.w0 w0Var) {
        this.f15813c = c1956m;
        this.f15814e = w0Var;
        this.f15815f = (InterfaceC1957N) c1956m.f15797b.b();
        AbstractC1168o.a();
        this.f15816g = new C1147A();
    }

    @Override // e1.InterfaceC0961c
    public final float A(long j3) {
        return this.f15814e.A(j3);
    }

    @Override // F0.X
    public final F0.W D(int i6, int i7, Map map, l4.c cVar) {
        return this.f15814e.D(i6, i7, map, cVar);
    }

    @Override // F0.X
    public final F0.W E(int i6, int i7, Map map, l4.c cVar, l4.c cVar2) {
        return this.f15814e.E(i6, i7, map, cVar, cVar2);
    }

    @Override // e1.InterfaceC0961c
    public final long O(float f6) {
        return this.f15814e.O(f6);
    }

    @Override // e1.InterfaceC0961c
    public final float T(int i6) {
        return this.f15814e.T(i6);
    }

    @Override // e1.InterfaceC0961c
    public final float V(float f6) {
        return this.f15814e.V(f6);
    }

    @Override // e1.InterfaceC0961c
    public final float a() {
        return this.f15814e.a();
    }

    public final List b(int i6) {
        C1147A c1147a = this.f15816g;
        List list = (List) c1147a.b(i6);
        if (list != null) {
            return list;
        }
        InterfaceC1957N interfaceC1957N = this.f15815f;
        Object b5 = interfaceC1957N.b(i6);
        List J4 = this.f15814e.J(b5, this.f15813c.a(i6, b5, interfaceC1957N.c(i6)));
        c1147a.i(i6, J4);
        return J4;
    }

    @Override // e1.InterfaceC0961c
    public final float b0() {
        return this.f15814e.b0();
    }

    @Override // F0.r
    public final boolean d0() {
        return this.f15814e.d0();
    }

    @Override // e1.InterfaceC0961c
    public final float e0(float f6) {
        return this.f15814e.e0(f6);
    }

    @Override // F0.r
    public final e1.m getLayoutDirection() {
        return this.f15814e.getLayoutDirection();
    }

    @Override // e1.InterfaceC0961c
    public final int l0(float f6) {
        return this.f15814e.l0(f6);
    }

    @Override // e1.InterfaceC0961c
    public final long r0(long j3) {
        return this.f15814e.r0(j3);
    }

    @Override // e1.InterfaceC0961c
    public final long s(float f6) {
        return this.f15814e.s(f6);
    }

    @Override // e1.InterfaceC0961c
    public final long t(long j3) {
        return this.f15814e.t(j3);
    }

    @Override // e1.InterfaceC0961c
    public final float u0(long j3) {
        return this.f15814e.u0(j3);
    }
}
