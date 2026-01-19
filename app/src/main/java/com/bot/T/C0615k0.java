package T;

import Z2.C0758j;
import java.util.ArrayList;
import k.C1147A;

/* renamed from: T.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0615k0 {
    public final ArrayList a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8123b;

    /* renamed from: c, reason: collision with root package name */
    public int f8124c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f8125d;

    /* renamed from: e, reason: collision with root package name */
    public final C1147A f8126e;

    /* renamed from: f, reason: collision with root package name */
    public final X3.n f8127f;

    public C0615k0(int i6, ArrayList arrayList) {
        this.a = arrayList;
        this.f8123b = i6;
        if (i6 < 0) {
            AbstractC0619m0.a("Invalid start index");
        }
        this.f8125d = new ArrayList();
        C1147A c1147a = new C1147A();
        int size = arrayList.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            Q q3 = (Q) this.a.get(i8);
            int i9 = q3.f8021c;
            int i10 = q3.f8022d;
            c1147a.i(i9, new K(i8, i7, i10));
            i7 += i10;
        }
        this.f8126e = c1147a;
        this.f8127f = X3.a.d(new C0758j(this, 2));
    }

    public final boolean a(int i6, int i7) {
        int i8;
        C1147A c1147a = this.f8126e;
        K k3 = (K) c1147a.b(i6);
        if (k3 == null) {
            return false;
        }
        int i9 = k3.f7977b;
        int i10 = i7 - k3.f7978c;
        k3.f7978c = i7;
        if (i10 == 0) {
            return true;
        }
        Object[] objArr = c1147a.f12559c;
        long[] jArr = c1147a.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i11 = 0;
        while (true) {
            long j3 = jArr[i11];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j3) < 128) {
                        K k5 = (K) objArr[(i11 << 3) + i13];
                        if (k5.f7977b >= i9 && !k5.equals(k3) && (i8 = k5.f7977b + i10) >= 0) {
                            k5.f7977b = i8;
                        }
                    }
                    j3 >>= 8;
                }
                if (i12 != 8) {
                    return true;
                }
            }
            if (i11 == length) {
                return true;
            }
            i11++;
        }
    }
}
