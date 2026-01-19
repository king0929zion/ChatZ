package n;

import java.util.Arrays;
import k.C1147A;
import k.C1178z;
import l.AbstractC1180a;
import m4.AbstractC1276k;

/* renamed from: n.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1303L implements InterfaceC1348w {
    public final C1302K a;

    public C1303L(C1302K c1302k) {
        this.a = c1302k;
    }

    @Override // n.InterfaceC1348w, n.InterfaceC1334l
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final L0 a(E0 e02) {
        int[] iArr;
        Object[] objArr;
        int[] iArr2;
        Object[] objArr2;
        int i6;
        C1302K c1302k = this.a;
        C1147A c1147a = c1302k.f13013b;
        C1178z c1178z = new C1178z(c1147a.f12561e + 2);
        C1147A c1147a2 = new C1147A(c1147a.f12561e);
        int[] iArr3 = c1147a.f12558b;
        Object[] objArr3 = c1147a.f12559c;
        long[] jArr = c1147a.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j3 = jArr[i7];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8;
                    int i9 = 8 - ((~(i7 - length)) >>> 31);
                    int i10 = 0;
                    while (i10 < i9) {
                        if ((j3 & 255) < 128) {
                            int i11 = (i7 << 3) + i10;
                            int i12 = iArr3[i11];
                            i6 = i8;
                            C1301J c1301j = (C1301J) objArr3[i11];
                            c1178z.a(i12);
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            c1147a2.i(i12, new K0((AbstractC1343r) e02.a.f(c1301j.a), c1301j.f13008b));
                        } else {
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            i6 = i8;
                        }
                        j3 >>= i6;
                        i10++;
                        iArr3 = iArr2;
                        i8 = i6;
                        objArr3 = objArr2;
                    }
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i9 != i8) {
                        break;
                    }
                } else {
                    iArr = iArr3;
                    objArr = objArr3;
                }
                if (i7 == length) {
                    break;
                }
                i7++;
                iArr3 = iArr;
                objArr3 = objArr;
            }
        }
        if (!c1147a.a(0)) {
            int i13 = c1178z.f12592b;
            if (i13 < 0) {
                AbstractC1180a.d("Index must be between 0 and size");
                throw null;
            }
            c1178z.b(i13 + 1);
            int[] iArr4 = c1178z.a;
            int i14 = c1178z.f12592b;
            if (i14 != 0) {
                Y3.k.h0(iArr4, iArr4, 1, 0, i14);
            }
            iArr4[0] = 0;
            c1178z.f12592b++;
        }
        if (!c1147a.a(c1302k.a)) {
            c1178z.a(c1302k.a);
        }
        int i15 = c1178z.f12592b;
        if (i15 != 0) {
            int[] iArr5 = c1178z.a;
            AbstractC1276k.f(iArr5, "<this>");
            Arrays.sort(iArr5, 0, i15);
        }
        return new L0(c1178z, c1147a2, c1302k.a, AbstractC1350y.f13277c);
    }
}
