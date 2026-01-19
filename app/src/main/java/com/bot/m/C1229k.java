package m;

import F0.k0;
import java.util.List;

/* renamed from: m.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1229k implements F0.V {
    public final C1237s a;

    public C1229k(C1237s c1237s) {
        this.a = c1237s;
    }

    @Override // F0.V
    public final int a(F0.r rVar, List list, int i6) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((F0.U) list.get(0)).d(i6));
            int C5 = Y4.l.C(list);
            int i7 = 1;
            if (1 <= C5) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((F0.U) list.get(i7)).d(i6));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i7 == C5) {
                        break;
                    }
                    i7++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // F0.V
    public final int d(F0.r rVar, List list, int i6) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((F0.U) list.get(0)).a0(i6));
            int C5 = Y4.l.C(list);
            int i7 = 1;
            if (1 <= C5) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((F0.U) list.get(i7)).a0(i6));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i7 == C5) {
                        break;
                    }
                    i7++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // F0.V
    public final F0.W e(F0.X x5, List list, long j3) {
        k0 k0Var;
        int i6;
        k0 k0Var2;
        int i7;
        int i8;
        int size = list.size();
        k0[] k0VarArr = new k0[size];
        int size2 = list.size();
        long j4 = 0;
        int i9 = 0;
        while (true) {
            k0Var = null;
            i6 = 1;
            if (i9 >= size2) {
                break;
            }
            F0.U u5 = (F0.U) list.get(i9);
            Object H3 = u5.H();
            C1231m c1231m = H3 instanceof C1231m ? (C1231m) H3 : null;
            if (c1231m != null && ((Boolean) c1231m.a.getValue()).booleanValue()) {
                k0VarArr[i9] = u5.w(j3);
                j4 = (r7.f1486e & 4294967295L) | (r7.f1485c << 32);
            }
            i9++;
        }
        int size3 = list.size();
        for (int i10 = 0; i10 < size3; i10++) {
            F0.U u6 = (F0.U) list.get(i10);
            if (k0VarArr[i10] == null) {
                k0VarArr[i10] = u6.w(j3);
            }
        }
        if (x5.d0()) {
            i7 = (int) (j4 >> 32);
        } else {
            if (size == 0) {
                k0Var2 = null;
            } else {
                k0Var2 = k0VarArr[0];
                int i11 = size - 1;
                if (i11 != 0) {
                    int i12 = k0Var2 != null ? k0Var2.f1485c : 0;
                    if (1 <= i11) {
                        int i13 = 1;
                        while (true) {
                            k0 k0Var3 = k0VarArr[i13];
                            int i14 = k0Var3 != null ? k0Var3.f1485c : 0;
                            if (i12 < i14) {
                                k0Var2 = k0Var3;
                                i12 = i14;
                            }
                            if (i13 == i11) {
                                break;
                            }
                            i13++;
                        }
                    }
                }
            }
            i7 = k0Var2 != null ? k0Var2.f1485c : 0;
        }
        if (x5.d0()) {
            i8 = (int) (j4 & 4294967295L);
        } else {
            if (size != 0) {
                k0Var = k0VarArr[0];
                int i15 = size - 1;
                if (i15 != 0) {
                    int i16 = k0Var != null ? k0Var.f1486e : 0;
                    if (1 <= i15) {
                        while (true) {
                            k0 k0Var4 = k0VarArr[i6];
                            int i17 = k0Var4 != null ? k0Var4.f1486e : 0;
                            if (i16 < i17) {
                                k0Var = k0Var4;
                                i16 = i17;
                            }
                            if (i6 == i15) {
                                break;
                            }
                            i6++;
                        }
                    }
                }
            }
            i8 = k0Var != null ? k0Var.f1486e : 0;
        }
        if (!x5.d0()) {
            this.a.f12833d.setValue(new e1.l((i7 << 32) | (i8 & 4294967295L)));
        }
        return x5.D(i7, i8, Y3.w.f9813c, new C1228j(k0VarArr, this, i7, i8));
    }

    @Override // F0.V
    public final int h(F0.r rVar, List list, int i6) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((F0.U) list.get(0)).o(i6));
            int C5 = Y4.l.C(list);
            int i7 = 1;
            if (1 <= C5) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((F0.U) list.get(i7)).o(i6));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i7 == C5) {
                        break;
                    }
                    i7++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // F0.V
    public final int j(F0.r rVar, List list, int i6) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((F0.U) list.get(0)).q(i6));
            int C5 = Y4.l.C(list);
            int i7 = 1;
            if (1 <= C5) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((F0.U) list.get(i7)).q(i6));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i7 == C5) {
                        break;
                    }
                    i7++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }
}
