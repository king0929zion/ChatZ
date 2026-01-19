package n;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class J0 {
    public final InterfaceC1293B a;

    /* renamed from: b, reason: collision with root package name */
    public AbstractC1343r f13009b;

    /* renamed from: c, reason: collision with root package name */
    public AbstractC1343r f13010c;

    /* renamed from: d, reason: collision with root package name */
    public AbstractC1343r f13011d;

    /* renamed from: e, reason: collision with root package name */
    public final float f13012e;

    public J0(InterfaceC1293B interfaceC1293B) {
        this.a = interfaceC1293B;
        this.f13012e = interfaceC1293B.d();
    }

    public final AbstractC1343r a(long j3, AbstractC1343r abstractC1343r, AbstractC1343r abstractC1343r2) {
        if (this.f13010c == null) {
            this.f13010c = abstractC1343r.c();
        }
        AbstractC1343r abstractC1343r3 = this.f13010c;
        if (abstractC1343r3 == null) {
            AbstractC1276k.k("velocityVector");
            throw null;
        }
        int b5 = abstractC1343r3.b();
        for (int i6 = 0; i6 < b5; i6++) {
            AbstractC1343r abstractC1343r4 = this.f13010c;
            if (abstractC1343r4 == null) {
                AbstractC1276k.k("velocityVector");
                throw null;
            }
            abstractC1343r.getClass();
            abstractC1343r4.e(this.a.e(abstractC1343r2.a(i6), j3), i6);
        }
        AbstractC1343r abstractC1343r5 = this.f13010c;
        if (abstractC1343r5 != null) {
            return abstractC1343r5;
        }
        AbstractC1276k.k("velocityVector");
        throw null;
    }
}
