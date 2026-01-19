package W0;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class k implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    public static final k f8831e;

    /* renamed from: f, reason: collision with root package name */
    public static final k f8832f;

    /* renamed from: g, reason: collision with root package name */
    public static final k f8833g;

    /* renamed from: h, reason: collision with root package name */
    public static final k f8834h;

    /* renamed from: i, reason: collision with root package name */
    public static final k f8835i;

    /* renamed from: j, reason: collision with root package name */
    public static final k f8836j;

    /* renamed from: k, reason: collision with root package name */
    public static final k f8837k;

    /* renamed from: l, reason: collision with root package name */
    public static final k f8838l;

    /* renamed from: m, reason: collision with root package name */
    public static final k f8839m;

    /* renamed from: c, reason: collision with root package name */
    public final int f8840c;

    static {
        k kVar = new k(100);
        k kVar2 = new k(200);
        k kVar3 = new k(300);
        k kVar4 = new k(400);
        k kVar5 = new k(500);
        k kVar6 = new k(600);
        f8831e = kVar6;
        k kVar7 = new k(700);
        k kVar8 = new k(800);
        k kVar9 = new k(900);
        f8832f = kVar;
        f8833g = kVar3;
        f8834h = kVar4;
        f8835i = kVar5;
        f8836j = kVar6;
        f8837k = kVar7;
        f8838l = kVar8;
        f8839m = kVar9;
        Y4.l.I(kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7, kVar8, kVar9);
    }

    public k(int i6) {
        this.f8840c = i6;
        boolean z5 = false;
        if (1 <= i6 && i6 < 1001) {
            z5 = true;
        }
        if (z5) {
            return;
        }
        Y0.a.a("Font weight can be in range [1, 1000]. Current value: " + i6);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return AbstractC1276k.g(this.f8840c, ((k) obj).f8840c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            return this.f8840c == ((k) obj).f8840c;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8840c;
    }

    public final String toString() {
        return B3.e.q(new StringBuilder("FontWeight(weight="), this.f8840c, ')');
    }
}
