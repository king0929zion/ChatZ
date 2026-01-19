package I0;

import T.InterfaceC0604f;
import c0.C0920c;
import k.AbstractC1168o;
import k.C1147A;

/* loaded from: classes.dex */
public final class I0 extends androidx.lifecycle.U {

    /* renamed from: b, reason: collision with root package name */
    public final C1147A f2183b;

    public I0() {
        C1147A c1147a = AbstractC1168o.a;
        this.f2183b = new C1147A();
    }

    @Override // androidx.lifecycle.U
    public final void d() {
        C1147A c1147a = this.f2183b;
        int[] iArr = c1147a.f12558b;
        Object[] objArr = c1147a.f12559c;
        long[] jArr = c1147a.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i6 = 0;
        while (true) {
            long j3 = jArr[i6];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i7 = 8;
                int i8 = 8 - ((~(i6 - length)) >>> 31);
                int i9 = 0;
                while (i9 < i8) {
                    if ((255 & j3) < 128) {
                        int i10 = (i6 << 3) + i9;
                        int i11 = iArr[i10];
                        k.I i12 = (k.I) objArr[i10];
                        Object[] objArr2 = i12.a;
                        int i13 = i12.f12466b;
                        int i14 = 0;
                        while (i14 < i13) {
                            H0 h02 = (H0) objArr2[i14];
                            int i15 = i7;
                            InterfaceC0604f interfaceC0604f = h02.f2182d;
                            if (interfaceC0604f != null) {
                                interfaceC0604f.cancel();
                            }
                            h02.f2182d = null;
                            C0920c c0920c = (C0920c) h02.a.f119e;
                            c0920c.f11100e = true;
                            c0920c.f11099c = false;
                            c0920c.a();
                            i14++;
                            i7 = i15;
                        }
                    }
                    int i16 = i7;
                    j3 >>= i16;
                    i9++;
                    i7 = i16;
                }
                if (i8 != i7) {
                    return;
                }
            }
            if (i6 == length) {
                return;
            } else {
                i6++;
            }
        }
    }
}
