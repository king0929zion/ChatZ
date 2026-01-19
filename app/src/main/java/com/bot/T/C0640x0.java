package T;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: T.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0640x0 extends d4.i implements l4.f {

    /* renamed from: h, reason: collision with root package name */
    public List f8257h;

    /* renamed from: i, reason: collision with root package name */
    public List f8258i;

    /* renamed from: j, reason: collision with root package name */
    public List f8259j;

    /* renamed from: k, reason: collision with root package name */
    public k.N f8260k;

    /* renamed from: l, reason: collision with root package name */
    public k.N f8261l;

    /* renamed from: m, reason: collision with root package name */
    public k.N f8262m;

    /* renamed from: n, reason: collision with root package name */
    public Set f8263n;

    /* renamed from: o, reason: collision with root package name */
    public k.N f8264o;

    /* renamed from: p, reason: collision with root package name */
    public int f8265p;

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ I0.Z f8266q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0642y0 f8267r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0640x0(C0642y0 c0642y0, InterfaceC0905c interfaceC0905c) {
        super(3, interfaceC0905c);
        this.f8267r = c0642y0;
    }

    public static final void t(C0642y0 c0642y0, List list, List list2, List list3, k.N n3, k.N n5, k.N n6, k.N n7) {
        char c6;
        long j3;
        long j4;
        synchronized (c0642y0.f8272c) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i6 = 0; i6 < size; i6++) {
                    C0639x c0639x = (C0639x) list3.get(i6);
                    c0639x.a();
                    c0642y0.L(c0639x);
                }
                list3.clear();
                Object[] objArr = n3.f12490b;
                long[] jArr = n3.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i7 = 0;
                    j3 = 255;
                    while (true) {
                        long j5 = jArr[i7];
                        c6 = 7;
                        j4 = -9187201950435737472L;
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i8 = 8 - ((~(i7 - length)) >>> 31);
                            for (int i9 = 0; i9 < i8; i9++) {
                                if ((j5 & 255) < 128) {
                                    C0639x c0639x2 = (C0639x) objArr[(i7 << 3) + i9];
                                    c0639x2.a();
                                    c0642y0.L(c0639x2);
                                }
                                j5 >>= 8;
                            }
                            if (i8 != 8) {
                                break;
                            }
                        }
                        if (i7 == length) {
                            break;
                        } else {
                            i7++;
                        }
                    }
                } else {
                    c6 = 7;
                    j3 = 255;
                    j4 = -9187201950435737472L;
                }
                n3.b();
                Object[] objArr2 = n5.f12490b;
                long[] jArr2 = n5.a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j6 = jArr2[i10];
                        if ((((~j6) << c6) & j6 & j4) != j4) {
                            int i11 = 8 - ((~(i10 - length2)) >>> 31);
                            for (int i12 = 0; i12 < i11; i12++) {
                                if ((j6 & j3) < 128) {
                                    ((C0639x) objArr2[(i10 << 3) + i12]).g();
                                }
                                j6 >>= 8;
                            }
                            if (i11 != 8) {
                                break;
                            }
                        }
                        if (i10 == length2) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
                n5.b();
                n6.b();
                Object[] objArr3 = n7.f12490b;
                long[] jArr3 = n7.a;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i13 = 0;
                    while (true) {
                        long j7 = jArr3[i13];
                        if ((((~j7) << c6) & j7 & j4) != j4) {
                            int i14 = 8 - ((~(i13 - length3)) >>> 31);
                            for (int i15 = 0; i15 < i14; i15++) {
                                if ((j7 & j3) < 128) {
                                    C0639x c0639x3 = (C0639x) objArr3[(i13 << 3) + i15];
                                    c0639x3.a();
                                    c0642y0.L(c0639x3);
                                }
                                j7 >>= 8;
                            }
                            if (i14 != 8) {
                                break;
                            }
                        }
                        if (i13 == length3) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                }
                n7.b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void u(List list, C0642y0 c0642y0) {
        list.clear();
        synchronized (c0642y0.f8272c) {
            try {
                ArrayList arrayList = c0642y0.f8280k;
                int size = arrayList.size();
                for (int i6 = 0; i6 < size; i6++) {
                    list.add((W) arrayList.get(i6));
                }
                c0642y0.f8280k.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // l4.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        C0640x0 c0640x0 = new C0640x0(this.f8267r, (InterfaceC0905c) obj3);
        c0640x0.f8266q = (I0.Z) obj2;
        c0640x0.r(X3.y.a);
        return EnumC0927a.f11114c;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0099 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0132 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0125 -> B:6:0x012d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x01da -> B:20:0x0094). Please report as a decompilation issue!!! */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T.C0640x0.r(java.lang.Object):java.lang.Object");
    }
}
