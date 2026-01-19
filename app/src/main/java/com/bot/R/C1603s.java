package r;

import T.C0599c0;
import T.C0607g0;
import m4.AbstractC1276k;

/* renamed from: r.s */
/* loaded from: classes.dex */
public final class C1603s {
    public Object a;

    /* renamed from: b */
    public Object f14459b;

    /* renamed from: c */
    public float f14460c = Float.NaN;

    /* renamed from: d */
    public final /* synthetic */ C1606t f14461d;

    public C1603s(C1606t c1606t) {
        this.f14461d = c1606t;
    }

    public static /* synthetic */ void b(C1603s c1603s, float f6) {
        c1603s.a(f6, S.l.f7374V);
    }

    public final void a(float f6, float f7) {
        C1606t c1606t = this.f14461d;
        C0599c0 c0599c0 = c1606t.f14472f;
        float g3 = c0599c0.g();
        c0599c0.h(f6);
        c1606t.f14473g.h(f7);
        if (Float.isNaN(g3)) {
            return;
        }
        boolean z5 = f6 >= g3;
        C1517E b5 = c1606t.b();
        C0607g0 c0607g0 = c1606t.f14469c;
        if (c0599c0.g() == b5.c(c0607g0.getValue())) {
            Object b6 = c1606t.b().b(c0599c0.g() + (z5 ? 1.0f : -1.0f), z5);
            if (b6 == null) {
                b6 = c0607g0.getValue();
            }
            if (z5) {
                this.a = c0607g0.getValue();
                this.f14459b = b6;
            } else {
                this.a = b6;
                this.f14459b = c0607g0.getValue();
            }
        } else {
            Object b7 = c1606t.b().b(c0599c0.g(), false);
            if (b7 == null) {
                b7 = c0607g0.getValue();
            }
            Object b8 = c1606t.b().b(c0599c0.g(), true);
            if (b8 == null) {
                b8 = c0607g0.getValue();
            }
            this.a = b7;
            this.f14459b = b8;
        }
        C1517E b9 = c1606t.b();
        Object obj = this.a;
        AbstractC1276k.c(obj);
        float c6 = b9.c(obj);
        C1517E b10 = c1606t.b();
        Object obj2 = this.f14459b;
        AbstractC1276k.c(obj2);
        this.f14460c = Math.abs(c6 - b10.c(obj2));
        if (Math.abs(c0599c0.g() - c1606t.b().c(c0607g0.getValue())) >= this.f14460c / 2.0f) {
            Object obj3 = z5 ? this.f14459b : this.a;
            if (obj3 == null) {
                obj3 = c0607g0.getValue();
            }
            c1606t.e(obj3);
        }
    }
}
