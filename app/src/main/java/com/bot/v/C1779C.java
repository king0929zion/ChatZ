package v;

import e1.C0959a;
import k.C1165l;

/* renamed from: v.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1779C {
    public final C1782F a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15201b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15202c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15203d;

    public C1779C(C1782F c1782f, long j3, int i6, int i7) {
        this.a = c1782f;
        this.f15201b = j3;
        this.f15202c = i6;
        this.f15203d = i7;
    }

    public final AbstractC1787b a(C1778B c1778b, boolean z5, int i6, int i7, int i8, int i9) {
        if (!c1778b.f15198b) {
            return null;
        }
        this.a.getClass();
        return null;
    }

    public final C1778B b(boolean z5, int i6, long j3, C1165l c1165l, int i7, int i8, int i9, boolean z6, boolean z7) {
        int i10 = i8 + i9;
        if (c1165l == null) {
            return new C1778B(true, true);
        }
        long j4 = c1165l.a;
        this.a.getClass();
        if (i7 >= Integer.MAX_VALUE || ((int) (j3 & 4294967295L)) - ((int) (j4 & 4294967295L)) < 0) {
            return new C1778B(true, true);
        }
        if (i6 != 0 && (i6 >= Integer.MAX_VALUE || ((int) (j3 >> 32)) - ((int) (j4 >> 32)) < 0)) {
            return z6 ? new C1778B(true, true) : new C1778B(true, b(z5, 0, C1165l.a(C0959a.h(this.f15201b), (((int) (j3 & 4294967295L)) - this.f15203d) - i9), new C1165l(C1165l.a(((int) (j4 >> 32)) - this.f15202c, (int) (j4 & 4294967295L))), i7 + 1, i10, 0, true, false).f15198b);
        }
        Math.max(i9, (int) (j4 & 4294967295L));
        return new C1778B(false, false);
    }
}
