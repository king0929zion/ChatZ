package i1;

import j1.AbstractC1135a;

/* renamed from: i1.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1079C {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11955b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11956c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11957d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f11958e;

    public C1079C(int i6, boolean z5) {
        this.a = i6;
        this.f11955b = z5;
        this.f11956c = true;
        this.f11957d = true;
        this.f11958e = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1079C)) {
            return false;
        }
        C1079C c1079c = (C1079C) obj;
        return this.a == c1079c.a && this.f11955b == c1079c.f11955b && this.f11956c == c1079c.f11956c && this.f11957d == c1079c.f11957d && this.f11958e == c1079c.f11958e;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + AbstractC1135a.d(AbstractC1135a.d(AbstractC1135a.d(AbstractC1135a.d(this.a * 31, 31, this.f11955b), 31, this.f11956c), 31, this.f11957d), 31, this.f11958e);
    }

    public C1079C(boolean z5, int i6) {
        this((i6 & 1) != 0 ? false : z5, EnumC1080D.f11959c, true);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1079C(boolean r2, i1.EnumC1080D r3, boolean r4) {
        /*
            r1 = this;
            T.B r0 = i1.AbstractC1094n.a
            if (r2 != 0) goto L8
            r2 = 262152(0x40008, float:3.67353E-40)
            goto La
        L8:
            r2 = 262144(0x40000, float:3.67342E-40)
        La:
            i1.D r0 = i1.EnumC1080D.f11960e
            if (r3 != r0) goto L10
            r2 = r2 | 8192(0x2000, float:1.14794E-41)
        L10:
            if (r4 != 0) goto L14
            r2 = r2 | 512(0x200, float:7.175E-43)
        L14:
            i1.D r4 = i1.EnumC1080D.f11959c
            if (r3 != r4) goto L1a
            r3 = 1
            goto L1b
        L1a:
            r3 = 0
        L1b:
            r1.<init>(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.C1079C.<init>(boolean, i1.D, boolean):void");
    }
}
