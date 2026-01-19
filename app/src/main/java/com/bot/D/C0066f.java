package D;

import O.AbstractC0305e0;
import O.AbstractC0336u0;
import O.C0303d0;
import O.EnumC0301c0;
import T.C0600d;
import m4.AbstractC1276k;
import o0.C1400k;
import q0.InterfaceC1498d;
import x4.C1928k;

/* renamed from: D.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0066f implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1014c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f1015e;

    public /* synthetic */ C0066f(long j3, int i6) {
        this.f1014c = i6;
        this.f1015e = j3;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        C1928k c1928k;
        Object b5;
        switch (this.f1014c) {
            case 0:
                l0.d dVar = (l0.d) obj;
                float intBitsToFloat = Float.intBitsToFloat((int) (dVar.f12643c.c() >> 32)) / 2.0f;
                return dVar.b(new C0068g(intBitsToFloat, AbstractC0336u0.q(dVar, intBitsToFloat), new C1400k(this.f1015e, 5), 0));
            case 1:
                ((P0.x) obj).a(AbstractC0305e0.f4106c, new C0303d0(EnumC0073i0.f1034c, this.f1015e, EnumC0301c0.f4087e, true));
                return X3.y.a;
            case 2:
                InterfaceC1498d interfaceC1498d = (InterfaceC1498d) obj;
                AbstractC1276k.f(interfaceC1498d, "$this$Canvas");
                InterfaceC1498d.c0(interfaceC1498d, this.f1015e, S.l.f7374V, 0L, null, 126);
                return X3.y.a;
            default:
                long j3 = this.f1015e;
                C0600d c0600d = (C0600d) obj;
                l4.c cVar = c0600d.f8076b;
                if (cVar != null && (c1928k = c0600d.a) != null) {
                    try {
                        b5 = cVar.f(Long.valueOf(j3));
                    } catch (Throwable th) {
                        b5 = X3.a.b(th);
                    }
                    c1928k.k(b5);
                }
                return X3.y.a;
        }
    }
}
