package D;

import F0.AbstractC0137z;
import Q.AbstractC0492z2;
import Q.C2;
import Q.EnumC0417g2;
import e1.AbstractC0960b;
import e1.C0959a;
import g1.AbstractC1016a;
import java.util.List;
import m4.AbstractC1276k;
import o4.AbstractC1410a;

/* renamed from: D.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0102x0 implements F0.V {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1233b;

    public /* synthetic */ C0102x0(Object obj, int i6) {
        this.a = i6;
        this.f1233b = obj;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, m4.u] */
    @Override // F0.V
    public final F0.W e(F0.X x5, List list, long j3) {
        int i6;
        int max;
        int i7;
        int i8;
        int K2;
        switch (this.a) {
            case 0:
                return x5.D(C0959a.h(j3), C0959a.g(j3), Y3.w.f9813c, new C0086p(2, list, this));
            default:
                C2 c22 = (C2) this.f1233b;
                int i9 = c22.f5179c;
                float[] fArr = c22.f5185j;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    F0.U u5 = (F0.U) list.get(i10);
                    if (AbstractC0137z.i(u5) == EnumC0417g2.f5819c) {
                        final F0.k0 w5 = u5.w(j3);
                        int size2 = list.size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            F0.U u6 = (F0.U) list.get(i11);
                            if (AbstractC0137z.i(u6) == EnumC0417g2.f5820e) {
                                r.X0 x02 = c22.f5191p;
                                boolean z5 = true;
                                r.X0 x03 = r.X0.f14183c;
                                F0.k0 w6 = x02 == x03 ? u6.w(C0959a.a(AbstractC0960b.j(0, -w5.f1486e, 1, j3), 0, 0, 0, 0, 14)) : u6.w(C0959a.a(AbstractC0960b.j(-w5.f1485c, 0, 2, j3), 0, 0, 0, 0, 11));
                                final Object obj = new Object();
                                float b5 = c22.b();
                                if (!AbstractC1276k.a(b5, Y3.k.s0(fArr)) && !AbstractC1276k.a(b5, Y3.k.x0(fArr))) {
                                    z5 = false;
                                }
                                int f02 = w6.f0(AbstractC0492z2.f6312f);
                                int i12 = f02 != Integer.MIN_VALUE ? f02 : 0;
                                if (c22.f5191p == x03) {
                                    i6 = Math.max(w6.f1485c, w5.f1485c);
                                    int i13 = w5.f1486e;
                                    int i14 = w6.f1486e;
                                    max = i13 + i14;
                                    i7 = (i6 - w6.f1485c) / 2;
                                    i8 = i13 / 2;
                                    K2 = (i6 - w5.f1485c) / 2;
                                    obj.f12971c = (i9 <= 0 || z5) ? AbstractC1410a.K(i14 * b5) : AbstractC1410a.K((i14 - (i12 * 2)) * b5) + i12;
                                } else {
                                    i6 = w5.f1485c + w6.f1485c;
                                    max = Math.max(w6.f1486e, w5.f1486e);
                                    i7 = w5.f1485c / 2;
                                    i8 = (max - w6.f1486e) / 2;
                                    K2 = (i9 <= 0 || z5) ? AbstractC1410a.K(w6.f1485c * b5) : AbstractC1410a.K((w6.f1485c - (i12 * 2)) * b5) + i12;
                                    obj.f12971c = (max - w5.f1486e) / 2;
                                }
                                final int i15 = K2;
                                final int i16 = i8;
                                final int i17 = i7;
                                c22.f5186k.h(i6);
                                c22.f5187l.h(max);
                                final F0.k0 k0Var = w6;
                                return x5.D(i6, max, Y3.w.f9813c, new l4.c() { // from class: Q.v2
                                    @Override // l4.c
                                    public final Object f(Object obj2) {
                                        F0.j0 j0Var = (F0.j0) obj2;
                                        F0.j0.l(j0Var, F0.k0.this, i17, i16);
                                        F0.j0.l(j0Var, w5, i15, obj.f12971c);
                                        return X3.y.a;
                                    }
                                });
                            }
                        }
                        AbstractC1016a.b("Collection contains no element matching the predicate.");
                        throw new RuntimeException();
                    }
                }
                AbstractC1016a.b("Collection contains no element matching the predicate.");
                throw new RuntimeException();
        }
    }
}
