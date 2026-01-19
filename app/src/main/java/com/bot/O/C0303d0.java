package O;

import D.EnumC0073i0;
import j1.AbstractC1135a;
import n0.C1353b;

/* renamed from: O.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0303d0 {
    public final EnumC0073i0 a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4098b;

    /* renamed from: c, reason: collision with root package name */
    public final EnumC0301c0 f4099c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4100d;

    public C0303d0(EnumC0073i0 enumC0073i0, long j3, EnumC0301c0 enumC0301c0, boolean z5) {
        this.a = enumC0073i0;
        this.f4098b = j3;
        this.f4099c = enumC0301c0;
        this.f4100d = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0303d0)) {
            return false;
        }
        C0303d0 c0303d0 = (C0303d0) obj;
        return this.a == c0303d0.a && C1353b.c(this.f4098b, c0303d0.f4098b) && this.f4099c == c0303d0.f4099c && this.f4100d == c0303d0.f4100d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f4100d) + ((this.f4099c.hashCode() + AbstractC1135a.c(this.a.hashCode() * 31, 31, this.f4098b)) * 31);
    }

    public final String toString() {
        return "SelectionHandleInfo(handle=" + this.a + ", position=" + ((Object) C1353b.h(this.f4098b)) + ", anchor=" + this.f4099c + ", visible=" + this.f4100d + ')';
    }
}
