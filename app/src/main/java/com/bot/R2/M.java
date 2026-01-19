package R2;

import T.C0599c0;
import T.C0607g0;
import b4.InterfaceC0905c;
import m4.AbstractC1276k;
import p.C0;
import r.C1517E;
import r.C1603s;
import r.C1606t;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class M extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C1606t f6914h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1517E f6915i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(C1606t c1606t, C1517E c1517e, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f6914h = c1606t;
        this.f6915i = c1517e;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        M m3 = (M) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj);
        X3.y yVar = X3.y.a;
        m3.r(yVar);
        return yVar;
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new M(this.f6914h, this.f6915i, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        Object value;
        X3.a.e(obj);
        C1606t c1606t = this.f6914h;
        C0607g0 c0607g0 = c1606t.f14474h;
        T.E e6 = c1606t.f14471e;
        C0599c0 c0599c0 = c1606t.f14472f;
        boolean isNaN = Float.isNaN(c0599c0.g());
        C1517E c1517e = this.f6915i;
        if (isNaN) {
            value = e6.getValue();
        } else {
            value = c1517e.a(c0599c0.g());
            if (value == null) {
                value = e6.getValue();
            }
        }
        if (!AbstractC1276k.b(c1606t.b(), c1517e)) {
            c1606t.f14475i.setValue(c1517e);
            C0 c02 = c1606t.f14468b;
            H4.c cVar = c02.f13564b;
            H4.c cVar2 = c02.f13564b;
            boolean g3 = cVar.g();
            if (g3) {
                try {
                    C1603s c1603s = c1606t.f14476j;
                    float c6 = c1606t.b().c(value);
                    if (!Float.isNaN(c6)) {
                        c1603s.a(c6, S.l.f7374V);
                        c0607g0.setValue(null);
                    }
                    c1606t.e(value);
                    c1606t.f14470d.setValue(value);
                    cVar2.c(null);
                } catch (Throwable th) {
                    cVar2.c(null);
                    throw th;
                }
            }
            if (!g3) {
                c0607g0.setValue(value);
            }
        }
        return X3.y.a;
    }
}
