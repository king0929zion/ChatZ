package x4;

import b4.AbstractC0903a;
import m4.AbstractC1276k;

/* renamed from: x4.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1941x extends AbstractC0903a {

    /* renamed from: f, reason: collision with root package name */
    public static final C1940w f15735f = new Object();

    /* renamed from: e, reason: collision with root package name */
    public final String f15736e;

    public C1941x(String str) {
        super(f15735f);
        this.f15736e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1941x) && AbstractC1276k.b(this.f15736e, ((C1941x) obj).f15736e);
    }

    public final int hashCode() {
        return this.f15736e.hashCode();
    }

    public final String toString() {
        return B3.e.r(new StringBuilder("CoroutineName("), this.f15736e, ')');
    }
}
