package I0;

import N1.C0290l;
import T.C0602e;
import T.C0628r0;
import android.view.Choreographer;
import b4.InterfaceC0908f;
import b4.InterfaceC0909g;
import b4.InterfaceC0910h;

/* loaded from: classes.dex */
public final class Z implements InterfaceC0908f {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2267c;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2268e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f2269f;

    public Z(Choreographer choreographer, X x5) {
        this.f2267c = 0;
        this.f2268e = choreographer;
        this.f2269f = x5;
    }

    @Override // b4.InterfaceC0910h
    public final InterfaceC0910h Y(InterfaceC0910h interfaceC0910h) {
        switch (this.f2267c) {
            case 0:
                return Y4.d.P(this, interfaceC0910h);
            case 1:
                return Y4.d.P(this, interfaceC0910h);
            default:
                return Y4.d.P(this, interfaceC0910h);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007d, code lost:
    
        if (r7 == r1) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, T.d, b0.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(b4.InterfaceC0905c r7, l4.c r8) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.Z.a(b4.c, l4.c):java.lang.Object");
    }

    @Override // b4.InterfaceC0908f
    public InterfaceC0909g getKey() {
        return C0602e.f8079f;
    }

    @Override // b4.InterfaceC0910h
    public final InterfaceC0910h h(InterfaceC0909g interfaceC0909g) {
        switch (this.f2267c) {
            case 0:
                return Y4.d.L(this, interfaceC0909g);
            case 1:
                return Y4.d.L(this, interfaceC0909g);
            default:
                return Y4.d.L(this, interfaceC0909g);
        }
    }

    @Override // b4.InterfaceC0910h
    public final Object q(Object obj, l4.e eVar) {
        switch (this.f2267c) {
            case 0:
                return eVar.m(obj, this);
            case 1:
                return eVar.m(obj, this);
            default:
                return eVar.m(obj, this);
        }
    }

    @Override // b4.InterfaceC0910h
    public final InterfaceC0908f r(InterfaceC0909g interfaceC0909g) {
        switch (this.f2267c) {
            case 0:
                return Y4.d.F(this, interfaceC0909g);
            case 1:
                return Y4.d.F(this, interfaceC0909g);
            default:
                return Y4.d.F(this, interfaceC0909g);
        }
    }

    public Z(Z z5) {
        this.f2267c = 2;
        this.f2268e = z5;
        this.f2269f = new C0290l();
    }

    public Z(C0628r0 c0628r0) {
        this.f2267c = 1;
        this.f2268e = c0628r0;
        this.f2269f = new E1.b(4);
    }
}
