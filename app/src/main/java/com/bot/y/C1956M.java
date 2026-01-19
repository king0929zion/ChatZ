package y;

import b0.C0873f;
import e0.InterfaceC0958c;
import m4.AbstractC1276k;

/* renamed from: y.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1956M {
    public final InterfaceC0958c a;

    /* renamed from: b, reason: collision with root package name */
    public final C1958O f15797b;

    /* renamed from: c, reason: collision with root package name */
    public final k.M f15798c;

    public C1956M(InterfaceC0958c interfaceC0958c, C1958O c1958o) {
        this.a = interfaceC0958c;
        this.f15797b = c1958o;
        long[] jArr = k.V.a;
        this.f15798c = new k.M();
    }

    public final l4.e a(int i6, Object obj, Object obj2) {
        k.M m3 = this.f15798c;
        C1955L c1955l = (C1955L) m3.g(obj);
        if (c1955l != null && c1955l.f15794c == i6 && AbstractC1276k.b(c1955l.f15793b, obj2)) {
            C0873f c0873f = c1955l.f15795d;
            if (c0873f != null) {
                return c0873f;
            }
            C0873f c0873f2 = new C0873f(new I.m(26, c1955l.f15796e, c1955l), true, 818252804);
            c1955l.f15795d = c0873f2;
            return c0873f2;
        }
        C1955L c1955l2 = new C1955L(this, i6, obj, obj2);
        m3.m(obj, c1955l2);
        C0873f c0873f3 = c1955l2.f15795d;
        if (c0873f3 != null) {
            return c0873f3;
        }
        C0873f c0873f4 = new C0873f(new I.m(26, this, c1955l2), true, 818252804);
        c1955l2.f15795d = c0873f4;
        return c0873f4;
    }

    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        C1955L c1955l = (C1955L) this.f15798c.g(obj);
        if (c1955l != null) {
            return c1955l.f15793b;
        }
        InterfaceC1957N interfaceC1957N = (InterfaceC1957N) this.f15797b.b();
        int e6 = interfaceC1957N.e(obj);
        if (e6 != -1) {
            return interfaceC1957N.c(e6);
        }
        return null;
    }
}
