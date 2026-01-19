package Q;

import i1.EnumC1080D;
import j1.AbstractC1135a;

/* renamed from: Q.q1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0456q1 {
    public final EnumC1080D a = EnumC1080D.f11959c;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6052b = true;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6053c = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0456q1)) {
            return false;
        }
        C0456q1 c0456q1 = (C0456q1) obj;
        return this.a == c0456q1.a && this.f6053c == c0456q1.f6053c && this.f6052b == c0456q1.f6052b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f6053c) + AbstractC1135a.d(this.a.hashCode() * 31, 29791, this.f6052b);
    }
}
