package x4;

import b4.AbstractC0903a;
import b4.C0906d;
import b4.InterfaceC0907e;
import b4.InterfaceC0908f;
import b4.InterfaceC0909g;
import b4.InterfaceC0910h;
import m4.AbstractC1276k;
import p.O0;

/* renamed from: x4.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1939v implements AbstractC0903a, InterfaceC0907e {

    /* renamed from: e, reason: collision with root package name */
    public static final C1938u f15729e = new C1938u(C0906d.f11056c, new O0(15));

    public AbstractC1939v() {
        super(C0906d.f11056c);
    }

    public abstract void d0(InterfaceC0910h interfaceC0910h, Runnable runnable);

    public void e0(InterfaceC0910h interfaceC0910h, Runnable runnable) {
        d0(interfaceC0910h, runnable);
    }

    public boolean f0(InterfaceC0910h interfaceC0910h) {
        return !(this instanceof A0);
    }

    public AbstractC1939v g0(int i6) {
        C4.a.a(i6);
        return new C4.h(this, i6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (((b4.InterfaceC0908f) r3.f15727c.f(r2)) == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        return b4.C0911i.f11057c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0022, code lost:
    
        if (b4.C0906d.f11056c == r3) goto L15;
     */
    @Override // b4.AbstractC0903a, b4.InterfaceC0910h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final b4.InterfaceC0910h h(b4.InterfaceC0909g r3) {
        /*
            r2 = this;
            java.lang.String r0 = "key"
            m4.AbstractC1276k.f(r3, r0)
            boolean r0 = r3 instanceof x4.C1938u
            if (r0 == 0) goto L20
            x4.u r3 = (x4.C1938u) r3
            b4.g r0 = r2.f11053c
            if (r0 == r3) goto L15
            b4.g r1 = r3.f15728e
            if (r1 != r0) goto L14
            goto L15
        L14:
            return r2
        L15:
            l4.c r3 = r3.f15727c
            java.lang.Object r3 = r3.f(r2)
            b4.f r3 = (b4.InterfaceC0908f) r3
            if (r3 == 0) goto L27
            goto L24
        L20:
            b4.d r0 = b4.C0906d.f11056c
            if (r0 != r3) goto L27
        L24:
            b4.i r3 = b4.C0911i.f11057c
            return r3
        L27:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.AbstractC1939v.h(b4.g):b4.h");
    }

    @Override // b4.AbstractC0903a, b4.InterfaceC0910h
    public final InterfaceC0908f r(InterfaceC0909g interfaceC0909g) {
        InterfaceC0908f interfaceC0908f;
        AbstractC1276k.f(interfaceC0909g, "key");
        if (interfaceC0909g instanceof C1938u) {
            C1938u c1938u = (C1938u) interfaceC0909g;
            InterfaceC0909g interfaceC0909g2 = this.f11053c;
            if ((interfaceC0909g2 == c1938u || c1938u.f15728e == interfaceC0909g2) && (interfaceC0908f = (InterfaceC0908f) c1938u.f15727c.f(this)) != null) {
                return interfaceC0908f;
            }
        } else if (C0906d.f11056c == interfaceC0909g) {
            return this;
        }
        return null;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC1888A.q(this);
    }
}
