package m;

import F0.k0;
import F0.o0;
import java.util.ArrayList;
import java.util.List;

/* renamed from: m.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1238t implements F0.V {
    public final C1195B a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f12836b;

    public C1238t(C1195B c1195b) {
        this.a = c1195b;
    }

    @Override // F0.V
    public final int a(F0.r rVar, List list, int i6) {
        if (list.isEmpty()) {
            return 0;
        }
        int d6 = ((F0.U) list.get(0)).d(i6);
        int C5 = Y4.l.C(list);
        int i7 = 1;
        if (1 <= C5) {
            while (true) {
                int d7 = ((F0.U) list.get(i7)).d(i6);
                if (d7 > d6) {
                    d6 = d7;
                }
                if (i7 == C5) {
                    break;
                }
                i7++;
            }
        }
        return d6;
    }

    @Override // F0.V
    public final int d(F0.r rVar, List list, int i6) {
        if (list.isEmpty()) {
            return 0;
        }
        int a02 = ((F0.U) list.get(0)).a0(i6);
        int C5 = Y4.l.C(list);
        int i7 = 1;
        if (1 <= C5) {
            while (true) {
                int a03 = ((F0.U) list.get(i7)).a0(i6);
                if (a03 > a02) {
                    a02 = a03;
                }
                if (i7 == C5) {
                    break;
                }
                i7++;
            }
        }
        return a02;
    }

    @Override // F0.V
    public final F0.W e(F0.X x5, List list, long j3) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            k0 w5 = ((F0.U) list.get(i8)).w(j3);
            i6 = Math.max(i6, w5.f1485c);
            i7 = Math.max(i7, w5.f1486e);
            arrayList.add(w5);
        }
        boolean d02 = x5.d0();
        C1195B c1195b = this.a;
        if (d02) {
            this.f12836b = true;
            c1195b.a.setValue(new e1.l((4294967295L & i7) | (i6 << 32)));
        } else if (!this.f12836b) {
            c1195b.a.setValue(new e1.l((4294967295L & i7) | (i6 << 32)));
        }
        return x5.D(i6, i7, Y3.w.f9813c, new o0(3, arrayList));
    }

    @Override // F0.V
    public final int h(F0.r rVar, List list, int i6) {
        if (list.isEmpty()) {
            return 0;
        }
        int o5 = ((F0.U) list.get(0)).o(i6);
        int C5 = Y4.l.C(list);
        int i7 = 1;
        if (1 <= C5) {
            while (true) {
                int o6 = ((F0.U) list.get(i7)).o(i6);
                if (o6 > o5) {
                    o5 = o6;
                }
                if (i7 == C5) {
                    break;
                }
                i7++;
            }
        }
        return o5;
    }

    @Override // F0.V
    public final int j(F0.r rVar, List list, int i6) {
        if (list.isEmpty()) {
            return 0;
        }
        int q3 = ((F0.U) list.get(0)).q(i6);
        int C5 = Y4.l.C(list);
        int i7 = 1;
        if (1 <= C5) {
            while (true) {
                int q5 = ((F0.U) list.get(i7)).q(i6);
                if (q5 > q3) {
                    q3 = q5;
                }
                if (i7 == C5) {
                    break;
                }
                i7++;
            }
        }
        return q3;
    }
}
