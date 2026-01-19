package z;

import F0.k0;
import h0.C1032i;
import java.util.List;
import u.AbstractC1734b;

/* renamed from: z.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2009g {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final List f16106b;

    /* renamed from: c, reason: collision with root package name */
    public final long f16107c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f16108d;

    /* renamed from: e, reason: collision with root package name */
    public final C1032i f16109e;

    /* renamed from: f, reason: collision with root package name */
    public final e1.m f16110f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f16111g = false;

    /* renamed from: h, reason: collision with root package name */
    public final int f16112h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f16113i;

    /* renamed from: j, reason: collision with root package name */
    public int f16114j;

    /* renamed from: k, reason: collision with root package name */
    public int f16115k;

    public C2009g(int i6, int i7, List list, long j3, Object obj, C1032i c1032i, e1.m mVar) {
        this.a = i6;
        this.f16106b = list;
        this.f16107c = j3;
        this.f16108d = obj;
        this.f16109e = c1032i;
        this.f16110f = mVar;
        int size = list.size();
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            k0 k0Var = (k0) list.get(i9);
            i8 = Math.max(i8, !this.f16111g ? k0Var.f1486e : k0Var.f1485c);
        }
        this.f16112h = i8;
        this.f16113i = new int[this.f16106b.size() * 2];
        this.f16115k = Integer.MIN_VALUE;
    }

    public final void a(int i6) {
        this.f16114j += i6;
        int[] iArr = this.f16113i;
        int length = iArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            boolean z5 = this.f16111g;
            if ((z5 && i7 % 2 == 1) || (!z5 && i7 % 2 == 0)) {
                iArr[i7] = iArr[i7] + i6;
            }
        }
    }

    public final void b(int i6, int i7, int i8) {
        int i9;
        this.f16114j = i6;
        boolean z5 = this.f16111g;
        this.f16115k = z5 ? i8 : i7;
        List list = this.f16106b;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            k0 k0Var = (k0) list.get(i10);
            int i11 = i10 * 2;
            int[] iArr = this.f16113i;
            if (z5) {
                float f6 = (i7 - k0Var.f1485c) / 2.0f;
                e1.m mVar = e1.m.f11576c;
                e1.m mVar2 = this.f16110f;
                float f7 = S.l.f7374V;
                if (mVar2 != mVar) {
                    f7 = S.l.f7374V * (-1);
                }
                iArr[i11] = Math.round((1 + f7) * f6);
                iArr[i11 + 1] = i6;
                i9 = k0Var.f1486e;
            } else {
                iArr[i11] = i6;
                int i12 = i11 + 1;
                C1032i c1032i = this.f16109e;
                if (c1032i == null) {
                    AbstractC1734b.b("null verticalAlignment");
                    throw new RuntimeException();
                }
                iArr[i12] = c1032i.a(k0Var.f1486e, i8);
                i9 = k0Var.f1485c;
            }
            i6 += i9;
        }
    }
}
