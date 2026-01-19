package Q;

import F0.AbstractC0137z;
import R.AbstractC0507l;
import com.vladsch.flexmark.util.format.TableCell;
import e1.AbstractC0960b;
import e1.C0959a;
import g1.AbstractC1016a;
import h0.C1031h;
import java.util.List;
import m4.AbstractC1276k;
import m4.C1288w;
import n0.C1356e;
import o4.AbstractC1410a;
import v.AbstractC1787b;
import v.InterfaceC1802i0;

/* loaded from: classes.dex */
public final class F1 implements F0.V {
    public final l4.c a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5234b;

    /* renamed from: c, reason: collision with root package name */
    public final d3 f5235c;

    /* renamed from: d, reason: collision with root package name */
    public final R.k0 f5236d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC1802i0 f5237e;

    /* renamed from: f, reason: collision with root package name */
    public final float f5238f;

    public F1(l4.c cVar, boolean z5, d3 d3Var, R.k0 k0Var, InterfaceC1802i0 interfaceC1802i0, float f6) {
        this.a = cVar;
        this.f5234b = z5;
        this.f5235c = d3Var;
        this.f5236d = k0Var;
        this.f5237e = interfaceC1802i0;
        this.f5238f = f6;
    }

    public static final int i(int i6, F1 f12, int i7, int i8, F0.k0 k0Var, F0.k0 k0Var2) {
        if (f12.f5234b) {
            i8 = Math.round((1 + S.l.f7374V) * ((i7 - k0Var2.f1486e) / 2.0f));
        }
        return Math.max(i6 + i8, (k0Var != null ? k0Var.f1486e : 0) / 2);
    }

    @Override // F0.V
    public final int a(F0.r rVar, List list, int i6) {
        return f(rVar, list, i6, new B4.z(12));
    }

    public final int b(F0.r rVar, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, long j3, float f6) {
        int[] iArr = {i12, i8, i9, Y3.C.C(f6, i11, 0)};
        for (int i14 = 0; i14 < 4; i14++) {
            i10 = Math.max(i10, iArr[i14]);
        }
        InterfaceC1802i0 interfaceC1802i0 = this.f5237e;
        float e02 = rVar.e0(interfaceC1802i0.c());
        return AbstractC0960b.f(j3, Math.max(i6, Math.max(i7, AbstractC1410a.K(Y3.C.B(e02, Math.max(e02, i11 / 2.0f), f6) + i10 + rVar.e0(interfaceC1802i0.a())))) + i13);
    }

    public final int c(F0.r rVar, int i6, int i7, int i8, int i9, int i10, int i11, int i12, long j3, float f6) {
        int i13 = i8 + i9;
        int max = Math.max(i10 + i13, Math.max(i12 + i13, Y3.C.C(f6, i11, 0))) + i6 + i7;
        InterfaceC1802i0 interfaceC1802i0 = this.f5237e;
        e1.m mVar = e1.m.f11576c;
        return AbstractC0960b.g(j3, Math.max(max, AbstractC1410a.K((i11 + rVar.e0(interfaceC1802i0.d(mVar) + interfaceC1802i0.b(mVar))) * f6)));
    }

    @Override // F0.V
    public final int d(F0.r rVar, List list, int i6) {
        return f(rVar, list, i6, new B4.z(10));
    }

    /* JADX WARN: Type inference failed for: r7v9, types: [m4.w, java.lang.Object] */
    @Override // F0.V
    public final F0.W e(final F0.X x5, List list, long j3) {
        Object obj;
        Object obj2;
        F0.k0 k0Var;
        int i6;
        F0.k0 k0Var2;
        Object obj3;
        F0.k0 k0Var3;
        int i7;
        F0.k0 k0Var4;
        Object obj4;
        F0.k0 k0Var5;
        int i8;
        F0.k0 k0Var6;
        Object obj5;
        long j4;
        Object obj6;
        Object obj7;
        F0.k0 k0Var7;
        int i9;
        C1288w c1288w;
        int i10;
        C1288w c1288w2;
        F0.k0 k0Var8;
        int i11;
        long j5;
        int i12;
        F0.k0 k0Var9;
        F0.k0 k0Var10;
        int i13;
        F0.k0 k0Var11;
        F0.U u5;
        F1 f12;
        F0.X x6;
        F0.k0 k0Var12;
        int i14;
        F0.k0 k0Var13;
        F0.k0 k0Var14;
        int i15;
        int i16;
        int i17;
        C1288w c1288w3;
        int i18;
        F1 f13;
        F0.k0 k0Var15;
        F0.k0 k0Var16;
        int i19;
        F0.k0 k0Var17;
        int i20;
        F0.X x7;
        float f6;
        List list2 = list;
        float a = this.f5236d.a();
        InterfaceC1802i0 interfaceC1802i0 = this.f5237e;
        int l02 = x5.l0(interfaceC1802i0.a());
        long a6 = C0959a.a(j3, 0, 0, 0, 0, 10);
        int size = list2.size();
        int i21 = 0;
        while (true) {
            if (i21 >= size) {
                obj = null;
                break;
            }
            obj = list2.get(i21);
            if (AbstractC1276k.b(AbstractC0137z.i((F0.U) obj), "Leading")) {
                break;
            }
            i21++;
        }
        F0.U u6 = (F0.U) obj;
        F0.k0 w5 = u6 != null ? u6.w(a6) : null;
        int i22 = w5 != null ? w5.f1485c : 0;
        int max = Math.max(0, w5 != null ? w5.f1486e : 0);
        int size2 = list2.size();
        int i23 = 0;
        while (true) {
            if (i23 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list2.get(i23);
            if (AbstractC1276k.b(AbstractC0137z.i((F0.U) obj2), "Trailing")) {
                break;
            }
            i23++;
        }
        F0.U u7 = (F0.U) obj2;
        if (u7 != null) {
            k0Var = w5;
            i6 = i22;
            k0Var2 = u7.w(AbstractC0960b.j(-i22, 0, 2, a6));
        } else {
            k0Var = w5;
            i6 = i22;
            k0Var2 = null;
        }
        int i24 = i6 + (k0Var2 != null ? k0Var2.f1485c : 0);
        int max2 = Math.max(max, k0Var2 != null ? k0Var2.f1486e : 0);
        int size3 = list2.size();
        int i25 = 0;
        while (true) {
            if (i25 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list2.get(i25);
            int i26 = size3;
            if (AbstractC1276k.b(AbstractC0137z.i((F0.U) obj3), "Prefix")) {
                break;
            }
            i25++;
            size3 = i26;
        }
        F0.U u8 = (F0.U) obj3;
        if (u8 != null) {
            k0Var3 = k0Var2;
            i7 = i24;
            k0Var4 = u8.w(AbstractC0960b.j(-i24, 0, 2, a6));
        } else {
            k0Var3 = k0Var2;
            i7 = i24;
            k0Var4 = null;
        }
        int i27 = i7 + (k0Var4 != null ? k0Var4.f1485c : 0);
        int max3 = Math.max(max2, k0Var4 != null ? k0Var4.f1486e : 0);
        int size4 = list2.size();
        int i28 = 0;
        while (true) {
            if (i28 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list2.get(i28);
            int i29 = size4;
            if (AbstractC1276k.b(AbstractC0137z.i((F0.U) obj4), "Suffix")) {
                break;
            }
            i28++;
            size4 = i29;
        }
        F0.U u9 = (F0.U) obj4;
        if (u9 != null) {
            k0Var5 = k0Var4;
            i8 = i27;
            k0Var6 = u9.w(AbstractC0960b.j(-i27, 0, 2, a6));
        } else {
            k0Var5 = k0Var4;
            i8 = i27;
            k0Var6 = null;
        }
        int i30 = i8 + (k0Var6 != null ? k0Var6.f1485c : 0);
        int max4 = Math.max(max3, k0Var6 != null ? k0Var6.f1486e : 0);
        int size5 = list2.size();
        int i31 = 0;
        while (true) {
            if (i31 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list2.get(i31);
            int i32 = size5;
            if (AbstractC1276k.b(AbstractC0137z.i((F0.U) obj5), "Label")) {
                break;
            }
            i31++;
            size5 = i32;
        }
        F0.U u10 = (F0.U) obj5;
        Object obj8 = new Object();
        int l03 = x5.l0(interfaceC1802i0.d(x5.getLayoutDirection())) + x5.l0(interfaceC1802i0.b(x5.getLayoutDirection()));
        int i33 = -Y3.C.C(a, i30 + l03, l03);
        int i34 = -l02;
        F0.k0 w6 = u10 != null ? u10.w(AbstractC0960b.i(i33, i34, a6)) : null;
        obj8.f12973c = w6;
        if (w6 != null) {
            j4 = (Float.floatToRawIntBits(w6.f1486e) & 4294967295L) | (Float.floatToRawIntBits(w6.f1485c) << 32);
        } else {
            j4 = 0;
        }
        this.a.f(new C1356e(j4));
        int size6 = list2.size();
        int i35 = 0;
        while (true) {
            if (i35 >= size6) {
                obj6 = null;
                break;
            }
            obj6 = list2.get(i35);
            if (AbstractC1276k.b(AbstractC0137z.i((F0.U) obj6), "Supporting")) {
                break;
            }
            i35++;
        }
        F0.U u11 = (F0.U) obj6;
        int a02 = u11 != null ? u11.a0(C0959a.j(j3)) : 0;
        F0.k0 k0Var18 = (F0.k0) obj8.f12973c;
        int max5 = Math.max((k0Var18 != null ? k0Var18.f1486e : 0) / 2, x5.l0(interfaceC1802i0.c()));
        long j6 = j3;
        long i36 = AbstractC0960b.i(-i30, (i34 - max5) - a02, j6);
        F0.U u12 = u11;
        long a7 = C0959a.a(i36, 0, 0, 0, 0, 11);
        int size7 = list2.size();
        int i37 = 0;
        while (i37 < size7) {
            F0.U u13 = u12;
            F0.U u14 = (F0.U) list2.get(i37);
            int i38 = max5;
            int i39 = size7;
            if (AbstractC1276k.b(AbstractC0137z.i(u14), "TextField")) {
                F0.k0 w7 = u14.w(a7);
                long a8 = C0959a.a(a7, 0, 0, 0, 0, 14);
                int size8 = list2.size();
                int i40 = 0;
                while (true) {
                    if (i40 >= size8) {
                        obj7 = null;
                        break;
                    }
                    Object obj9 = list2.get(i40);
                    int i41 = size8;
                    if (AbstractC1276k.b(AbstractC0137z.i((F0.U) obj9), "Hint")) {
                        obj7 = obj9;
                        break;
                    }
                    i40++;
                    size8 = i41;
                }
                F0.U u15 = (F0.U) obj7;
                F0.k0 w8 = u15 != null ? u15.w(a8) : null;
                int max6 = Math.max(max4, Math.max(w7.f1486e, w8 != null ? w8.f1486e : 0) + i38 + l02);
                int i42 = k0Var != null ? k0Var.f1485c : 0;
                F0.k0 k0Var19 = k0Var3;
                int i43 = k0Var3 != null ? k0Var19.f1485c : 0;
                F0.k0 k0Var20 = k0Var5;
                int i44 = k0Var5 != null ? k0Var20.f1485c : 0;
                if (k0Var6 != null) {
                    i9 = k0Var6.f1485c;
                    k0Var7 = k0Var19;
                } else {
                    k0Var7 = k0Var19;
                    i9 = 0;
                }
                int i45 = w7.f1485c;
                F0.k0 k0Var21 = k0Var7;
                F0.k0 k0Var22 = (F0.k0) obj8.f12973c;
                if (k0Var22 != null) {
                    i10 = k0Var22.f1485c;
                    c1288w = obj8;
                } else {
                    c1288w = obj8;
                    i10 = 0;
                }
                if (w8 != null) {
                    k0Var8 = w7;
                    i11 = i42;
                    c1288w2 = c1288w;
                    j5 = j6;
                    i12 = w8.f1485c;
                    k0Var9 = w8;
                    k0Var10 = k0Var6;
                    i13 = i44;
                    k0Var11 = k0Var20;
                    u5 = u13;
                    f12 = this;
                    k0Var12 = k0Var;
                    i14 = max6;
                    k0Var13 = k0Var21;
                    x6 = x5;
                } else {
                    c1288w2 = c1288w;
                    k0Var8 = w7;
                    i11 = i42;
                    j5 = j6;
                    i12 = 0;
                    k0Var9 = w8;
                    k0Var10 = k0Var6;
                    i13 = i44;
                    k0Var11 = k0Var20;
                    u5 = u13;
                    f12 = this;
                    x6 = x5;
                    k0Var12 = k0Var;
                    i14 = max6;
                    k0Var13 = k0Var21;
                }
                final int c6 = f12.c(x6, i11, i43, i13, i9, i45, i10, i12, j5, a);
                final F0.k0 w9 = u5 != null ? u5.w(C0959a.a(AbstractC0960b.j(0, -i14, 1, a6), 0, c6, 0, 0, 9)) : null;
                int i46 = w9 != null ? w9.f1486e : 0;
                F0.k0 k0Var23 = k0Var12;
                int i47 = k0Var12 != null ? k0Var23.f1486e : 0;
                final F0.k0 k0Var24 = k0Var13;
                int i48 = k0Var13 != null ? k0Var24.f1486e : 0;
                F0.k0 k0Var25 = k0Var11;
                int i49 = k0Var25 != null ? k0Var25.f1486e : 0;
                F0.k0 k0Var26 = k0Var10;
                int i50 = k0Var26 != null ? k0Var26.f1486e : 0;
                F0.k0 k0Var27 = k0Var8;
                int i51 = k0Var27.f1486e;
                C1288w c1288w4 = c1288w2;
                F0.k0 k0Var28 = (F0.k0) c1288w4.f12973c;
                int i52 = k0Var28 != null ? k0Var28.f1486e : 0;
                int i53 = i46;
                final F0.k0 k0Var29 = k0Var9;
                if (k0Var29 != null) {
                    k0Var14 = k0Var26;
                    i15 = i50;
                    i16 = i51;
                    i17 = k0Var29.f1486e;
                } else {
                    k0Var14 = k0Var26;
                    i15 = i50;
                    i16 = i51;
                    i17 = 0;
                }
                if (w9 != null) {
                    c1288w3 = c1288w4;
                    i18 = w9.f1486e;
                    k0Var15 = k0Var25;
                    k0Var16 = k0Var27;
                    i19 = i52;
                    k0Var17 = k0Var23;
                    i20 = 0;
                    x7 = x5;
                    f6 = a;
                    f13 = this;
                } else {
                    c1288w3 = c1288w4;
                    i18 = 0;
                    f13 = this;
                    k0Var15 = k0Var25;
                    k0Var16 = k0Var27;
                    i19 = i52;
                    k0Var17 = k0Var23;
                    i20 = 0;
                    x7 = x5;
                    f6 = a;
                }
                final int b5 = f13.b(x7, i47, i48, i49, i15, i16, i19, i17, i18, j3, f6);
                final float f7 = f6;
                int i54 = b5 - i53;
                int size9 = list.size();
                int i55 = i20;
                while (i55 < size9) {
                    F0.U u16 = (F0.U) list.get(i55);
                    if (AbstractC1276k.b(AbstractC0137z.i(u16), "Container")) {
                        final F0.k0 w10 = u16.w(AbstractC0960b.a(c6 != Integer.MAX_VALUE ? c6 : i20, c6, i54 != Integer.MAX_VALUE ? i54 : i20, i54));
                        final F0.k0 k0Var30 = k0Var17;
                        final F0.k0 k0Var31 = k0Var15;
                        final F0.k0 k0Var32 = k0Var14;
                        final C1288w c1288w5 = c1288w3;
                        final F0.k0 k0Var33 = k0Var16;
                        return x5.D(c6, b5, Y3.w.f9813c, new l4.c() { // from class: Q.E1
                            @Override // l4.c
                            public final Object f(Object obj10) {
                                F0.k0 k0Var34;
                                F1 f14;
                                float f8;
                                float f9;
                                int i56;
                                int i57;
                                F0.k0 k0Var35;
                                F1 f15;
                                int i58;
                                float f10;
                                int i59;
                                float f11;
                                float f16;
                                float f17;
                                F0.j0 j0Var = (F0.j0) obj10;
                                F0.k0 k0Var36 = (F0.k0) c1288w5.f12973c;
                                F0.X x8 = x5;
                                float a9 = x8.a();
                                e1.m layoutDirection = x8.getLayoutDirection();
                                F1 f18 = F1.this;
                                float e02 = x8.e0(f18.f5238f);
                                d3 d3Var = f18.f5235c;
                                InterfaceC1802i0 interfaceC1802i02 = f18.f5237e;
                                j0Var.h(w10, 0, 0, S.l.f7374V);
                                F0.k0 k0Var37 = w9;
                                int i60 = b5 - (k0Var37 != null ? k0Var37.f1486e : 0);
                                int K2 = AbstractC1410a.K(interfaceC1802i02.c() * a9);
                                F0.k0 k0Var38 = k0Var30;
                                if (k0Var38 != null) {
                                    F0.j0.l(j0Var, k0Var38, 0, Math.round((1 + S.l.f7374V) * ((i60 - k0Var38.f1486e) / 2.0f)));
                                }
                                int i61 = c6;
                                F0.k0 k0Var39 = k0Var24;
                                if (k0Var36 != null) {
                                    if (f18.f5234b) {
                                        f10 = e02;
                                        f14 = f18;
                                        i59 = Math.round((1 + S.l.f7374V) * ((i60 - k0Var36.f1486e) / 2.0f));
                                    } else {
                                        f10 = e02;
                                        f14 = f18;
                                        i59 = K2;
                                    }
                                    int i62 = -(k0Var36.f1486e / 2);
                                    float f19 = f7;
                                    int C5 = Y3.C.C(f19, i59, i62);
                                    float l3 = AbstractC1787b.l(interfaceC1802i02, layoutDirection) * a9;
                                    float k3 = AbstractC1787b.k(interfaceC1802i02, layoutDirection) * a9;
                                    if (k0Var38 == null) {
                                        f11 = l3;
                                    } else {
                                        float f20 = k0Var38.f1485c;
                                        float f21 = l3 - f10;
                                        if (f21 < S.l.f7374V) {
                                            f21 = 0.0f;
                                        }
                                        f11 = f20 + f21;
                                    }
                                    if (k0Var39 == null) {
                                        f16 = l3;
                                        f17 = k3;
                                    } else {
                                        f16 = l3;
                                        float f22 = k0Var39.f1485c;
                                        float f23 = k3 - f10;
                                        if (f23 < S.l.f7374V) {
                                            f23 = 0.0f;
                                        }
                                        f17 = f22 + f23;
                                    }
                                    k0Var34 = k0Var39;
                                    e1.m mVar = e1.m.f11576c;
                                    float f24 = layoutDirection == mVar ? f16 : k3;
                                    float f25 = layoutDirection == mVar ? f11 : f17;
                                    float f26 = R.l0.a;
                                    int K5 = AbstractC1410a.K(Y3.C.B(d3Var.f5770b.a(k0Var36.f1485c, i61 - AbstractC1410a.K(f11 + f17), layoutDirection) + f25, ((C1031h) R.l0.d(d3Var)).a(k0Var36.f1485c, i61 - AbstractC1410a.K(f16 + k3), layoutDirection) + f24, f19));
                                    f8 = 0.0f;
                                    j0Var.h(k0Var36, K5, C5, S.l.f7374V);
                                } else {
                                    k0Var34 = k0Var39;
                                    f14 = f18;
                                    f8 = 0.0f;
                                }
                                F0.k0 k0Var40 = k0Var31;
                                if (k0Var40 != null) {
                                    f9 = f8;
                                    i56 = K2;
                                    i57 = i60;
                                    k0Var35 = k0Var34;
                                    f15 = f14;
                                    i58 = 0;
                                    F0.j0.l(j0Var, k0Var40, k0Var38 != null ? k0Var38.f1485c : 0, F1.i(0, f15, i57, i56, k0Var36, k0Var40));
                                } else {
                                    f9 = f8;
                                    i56 = K2;
                                    i57 = i60;
                                    k0Var35 = k0Var34;
                                    f15 = f14;
                                    i58 = 0;
                                }
                                int i63 = (k0Var38 != null ? k0Var38.f1485c : 0) + (k0Var40 != null ? k0Var40.f1485c : 0);
                                F0.k0 k0Var41 = k0Var33;
                                F0.j0.l(j0Var, k0Var41, i63, F1.i(i58, f15, i57, i56, k0Var36, k0Var41));
                                F0.k0 k0Var42 = k0Var29;
                                if (k0Var42 != null) {
                                    F0.j0.l(j0Var, k0Var42, i63, F1.i(i58, f15, i57, i56, k0Var36, k0Var42));
                                }
                                F0.k0 k0Var43 = k0Var32;
                                if (k0Var43 != null) {
                                    F0.j0.l(j0Var, k0Var43, (i61 - (k0Var35 != null ? k0Var35.f1485c : 0)) - k0Var43.f1485c, F1.i(i58, f15, i57, i56, k0Var36, k0Var43));
                                }
                                if (k0Var35 != null) {
                                    F0.j0.l(j0Var, k0Var35, i61 - k0Var35.f1485c, Math.round((1 + f9) * ((i57 - k0Var35.f1486e) / 2.0f)));
                                }
                                if (k0Var37 != null) {
                                    F0.j0.l(j0Var, k0Var37, 0, i57);
                                }
                                return X3.y.a;
                            }
                        });
                    }
                    i55++;
                    b5 = b5;
                }
                AbstractC1016a.b("Collection contains no element matching the predicate.");
                throw new RuntimeException();
            }
            i37++;
            j6 = j3;
            u12 = u13;
            size7 = i39;
            k0Var5 = k0Var5;
            list2 = list2;
            max5 = i38;
        }
        AbstractC1016a.b("Collection contains no element matching the predicate.");
        throw new RuntimeException();
    }

    public final int f(F0.r rVar, List list, int i6, l4.e eVar) {
        Object obj;
        int i7;
        int i8;
        Object obj2;
        int i9;
        Object obj3;
        Object obj4;
        int i10;
        Object obj5;
        int i11;
        Object obj6;
        Object obj7;
        F1 f12 = this;
        float a = f12.f5236d.a();
        int size = list.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i12);
            if (AbstractC1276k.b(AbstractC0507l.i((F0.U) obj), "Leading")) {
                break;
            }
            i12++;
        }
        F0.U u5 = (F0.U) obj;
        if (u5 != null) {
            i7 = AbstractC0507l.l(i6, u5.q(TableCell.NOT_TRACKED));
            i8 = ((Number) eVar.m(u5, Integer.valueOf(i6))).intValue();
        } else {
            i7 = i6;
            i8 = 0;
        }
        int size2 = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i13);
            if (AbstractC1276k.b(AbstractC0507l.i((F0.U) obj2), "Trailing")) {
                break;
            }
            i13++;
        }
        F0.U u6 = (F0.U) obj2;
        if (u6 != null) {
            i7 = AbstractC0507l.l(i7, u6.q(TableCell.NOT_TRACKED));
            i9 = ((Number) eVar.m(u6, Integer.valueOf(i6))).intValue();
        } else {
            i9 = 0;
        }
        int size3 = list.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i14);
            if (AbstractC1276k.b(AbstractC0507l.i((F0.U) obj3), "Label")) {
                break;
            }
            i14++;
        }
        Object obj8 = (F0.U) obj3;
        int intValue = obj8 != null ? ((Number) eVar.m(obj8, Integer.valueOf(Y3.C.C(a, i7, i6)))).intValue() : 0;
        int size4 = list.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i15);
            if (AbstractC1276k.b(AbstractC0507l.i((F0.U) obj4), "Prefix")) {
                break;
            }
            i15++;
        }
        F0.U u7 = (F0.U) obj4;
        if (u7 != null) {
            i10 = ((Number) eVar.m(u7, Integer.valueOf(i7))).intValue();
            i7 = AbstractC0507l.l(i7, u7.q(TableCell.NOT_TRACKED));
        } else {
            i10 = 0;
        }
        int size5 = list.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i16);
            if (AbstractC1276k.b(AbstractC0507l.i((F0.U) obj5), "Suffix")) {
                break;
            }
            i16++;
        }
        F0.U u8 = (F0.U) obj5;
        if (u8 != null) {
            i11 = ((Number) eVar.m(u8, Integer.valueOf(i7))).intValue();
            i7 = AbstractC0507l.l(i7, u8.q(TableCell.NOT_TRACKED));
        } else {
            i11 = 0;
        }
        int size6 = list.size();
        int i17 = 0;
        while (i17 < size6) {
            Object obj9 = list.get(i17);
            if (AbstractC1276k.b(AbstractC0507l.i((F0.U) obj9), "TextField")) {
                int intValue2 = ((Number) eVar.m(obj9, Integer.valueOf(i7))).intValue();
                int size7 = list.size();
                int i18 = 0;
                while (true) {
                    if (i18 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i18);
                    if (AbstractC1276k.b(AbstractC0507l.i((F0.U) obj6), "Hint")) {
                        break;
                    }
                    i18++;
                }
                Object obj10 = (F0.U) obj6;
                int intValue3 = obj10 != null ? ((Number) eVar.m(obj10, Integer.valueOf(i7))).intValue() : 0;
                int size8 = list.size();
                int i19 = 0;
                while (true) {
                    if (i19 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i19);
                    if (AbstractC1276k.b(AbstractC0507l.i((F0.U) obj7), "Supporting")) {
                        break;
                    }
                    i19++;
                }
                Object obj11 = (F0.U) obj7;
                return f12.b(rVar, i8, i9, i10, i11, intValue2, intValue, intValue3, obj11 != null ? ((Number) eVar.m(obj11, Integer.valueOf(i6))).intValue() : 0, AbstractC0960b.b(0, 0, 15), a);
            }
            i17++;
            i11 = i11;
            f12 = this;
            i10 = i10;
        }
        AbstractC1016a.b("Collection contains no element matching the predicate.");
        throw new RuntimeException();
    }

    public final int g(F0.r rVar, List list, int i6, l4.e eVar) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            Object obj7 = list.get(i7);
            if (AbstractC1276k.b(AbstractC0507l.i((F0.U) obj7), "TextField")) {
                int intValue = ((Number) eVar.m(obj7, Integer.valueOf(i6))).intValue();
                int size2 = list.size();
                int i8 = 0;
                while (true) {
                    obj = null;
                    if (i8 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i8);
                    if (AbstractC1276k.b(AbstractC0507l.i((F0.U) obj2), "Label")) {
                        break;
                    }
                    i8++;
                }
                F0.U u5 = (F0.U) obj2;
                int intValue2 = u5 != null ? ((Number) eVar.m(u5, Integer.valueOf(i6))).intValue() : 0;
                int size3 = list.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i9);
                    if (AbstractC1276k.b(AbstractC0507l.i((F0.U) obj3), "Trailing")) {
                        break;
                    }
                    i9++;
                }
                F0.U u6 = (F0.U) obj3;
                int intValue3 = u6 != null ? ((Number) eVar.m(u6, Integer.valueOf(i6))).intValue() : 0;
                int size4 = list.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i10);
                    if (AbstractC1276k.b(AbstractC0507l.i((F0.U) obj4), "Leading")) {
                        break;
                    }
                    i10++;
                }
                F0.U u7 = (F0.U) obj4;
                int intValue4 = u7 != null ? ((Number) eVar.m(u7, Integer.valueOf(i6))).intValue() : 0;
                int size5 = list.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size5) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list.get(i11);
                    if (AbstractC1276k.b(AbstractC0507l.i((F0.U) obj5), "Prefix")) {
                        break;
                    }
                    i11++;
                }
                F0.U u8 = (F0.U) obj5;
                int intValue5 = u8 != null ? ((Number) eVar.m(u8, Integer.valueOf(i6))).intValue() : 0;
                int size6 = list.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size6) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i12);
                    if (AbstractC1276k.b(AbstractC0507l.i((F0.U) obj6), "Suffix")) {
                        break;
                    }
                    i12++;
                }
                F0.U u9 = (F0.U) obj6;
                int intValue6 = u9 != null ? ((Number) eVar.m(u9, Integer.valueOf(i6))).intValue() : 0;
                int size7 = list.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size7) {
                        break;
                    }
                    Object obj8 = list.get(i13);
                    if (AbstractC1276k.b(AbstractC0507l.i((F0.U) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                    i13++;
                }
                F0.U u10 = (F0.U) obj;
                return c(rVar, intValue4, intValue3, intValue5, intValue6, intValue, intValue2, u10 != null ? ((Number) eVar.m(u10, Integer.valueOf(i6))).intValue() : 0, AbstractC0960b.b(0, 0, 15), this.f5236d.a());
            }
        }
        AbstractC1016a.b("Collection contains no element matching the predicate.");
        throw new RuntimeException();
    }

    @Override // F0.V
    public final int h(F0.r rVar, List list, int i6) {
        return g(rVar, list, i6, new B4.z(13));
    }

    @Override // F0.V
    public final int j(F0.r rVar, List list, int i6) {
        return g(rVar, list, i6, new B4.z(11));
    }
}
