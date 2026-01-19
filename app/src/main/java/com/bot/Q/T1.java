package Q;

import H0.InterfaceC0155j;
import j1.AbstractC1135a;
import p.InterfaceC1455r0;
import t.C1682j;

/* loaded from: classes.dex */
public final class T1 implements InterfaceC1455r0 {
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final float f5523b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5524c;

    public T1(boolean z5, float f6, long j3) {
        this.a = z5;
        this.f5523b = f6;
        this.f5524c = j3;
    }

    @Override // p.InterfaceC1455r0
    public final InterfaceC0155j a(C1682j c1682j) {
        return new Z(c1682j, this.a, this.f5523b, new Y(this, 1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T1)) {
            return false;
        }
        T1 t12 = (T1) obj;
        if (this.a == t12.a && e1.f.c(this.f5523b, t12.f5523b)) {
            return o0.s.d(this.f5524c, t12.f5524c);
        }
        return false;
    }

    @Override // p.InterfaceC1455r0
    public final int hashCode() {
        int a = AbstractC1135a.a(this.f5523b, Boolean.hashCode(this.a) * 31, 961);
        int i6 = o0.s.f13482i;
        return Long.hashCode(this.f5524c) + a;
    }
}
