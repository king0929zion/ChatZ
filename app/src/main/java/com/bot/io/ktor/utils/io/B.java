package io.ktor.utils.io;

import b4.InterfaceC0908f;
import b4.InterfaceC0909g;
import b4.InterfaceC0910h;
import java.util.concurrent.CancellationException;
import m4.AbstractC1276k;
import x4.C1940w;
import x4.InterfaceC1900M;
import x4.InterfaceC1922e0;
import x4.InterfaceC1931n;
import x4.l0;
import x4.s0;

/* loaded from: classes.dex */
public final class B implements InterfaceC1922e0 {

    /* renamed from: c, reason: collision with root package name */
    public final s0 f12087c;

    /* renamed from: e, reason: collision with root package name */
    public final t f12088e;

    public B(s0 s0Var, t tVar) {
        this.f12087c = s0Var;
        this.f12088e = tVar;
    }

    @Override // x4.InterfaceC1922e0
    public final InterfaceC1900M H(boolean z5, boolean z6, l4.c cVar) {
        return this.f12087c.H(z5, z6, cVar);
    }

    @Override // x4.InterfaceC1922e0
    public final Object Q(d4.c cVar) {
        return this.f12087c.Q(cVar);
    }

    @Override // x4.InterfaceC1922e0
    public final InterfaceC1900M S(l4.c cVar) {
        return this.f12087c.S(cVar);
    }

    @Override // b4.InterfaceC0910h
    public final InterfaceC0910h Y(InterfaceC0910h interfaceC0910h) {
        AbstractC1276k.f(interfaceC0910h, "context");
        return Y4.d.P(this.f12087c, interfaceC0910h);
    }

    @Override // x4.InterfaceC1922e0
    public final boolean d() {
        return this.f12087c.d();
    }

    @Override // x4.InterfaceC1922e0
    public final void f(CancellationException cancellationException) {
        this.f12087c.f(cancellationException);
    }

    @Override // b4.InterfaceC0908f
    public final InterfaceC0909g getKey() {
        return C1940w.f15731e;
    }

    @Override // b4.InterfaceC0910h
    public final InterfaceC0910h h(InterfaceC0909g interfaceC0909g) {
        AbstractC1276k.f(interfaceC0909g, "key");
        return Y4.d.L(this.f12087c, interfaceC0909g);
    }

    @Override // b4.InterfaceC0910h
    public final Object q(Object obj, l4.e eVar) {
        return eVar.m(obj, this.f12087c);
    }

    @Override // b4.InterfaceC0910h
    public final InterfaceC0908f r(InterfaceC0909g interfaceC0909g) {
        AbstractC1276k.f(interfaceC0909g, "key");
        return Y4.d.F(this.f12087c, interfaceC0909g);
    }

    @Override // x4.InterfaceC1922e0
    public final InterfaceC1931n s(l0 l0Var) {
        return this.f12087c.s(l0Var);
    }

    @Override // x4.InterfaceC1922e0
    public final boolean start() {
        return this.f12087c.start();
    }

    public final String toString() {
        return "ChannelJob[" + this.f12087c + ']';
    }

    @Override // x4.InterfaceC1922e0
    public final CancellationException y() {
        return this.f12087c.y();
    }
}
