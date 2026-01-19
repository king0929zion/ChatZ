package x4;

import m4.AbstractC1276k;

/* renamed from: x4.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1935r {
    public final Object a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1926i f15722b;

    /* renamed from: c, reason: collision with root package name */
    public final l4.f f15723c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f15724d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f15725e;

    public C1935r(Object obj, InterfaceC1926i interfaceC1926i, l4.f fVar, Object obj2, Throwable th) {
        this.a = obj;
        this.f15722b = interfaceC1926i;
        this.f15723c = fVar;
        this.f15724d = obj2;
        this.f15725e = th;
    }

    public static C1935r a(C1935r c1935r, InterfaceC1926i interfaceC1926i, Throwable th, int i6) {
        Object obj = c1935r.a;
        if ((i6 & 2) != 0) {
            interfaceC1926i = c1935r.f15722b;
        }
        InterfaceC1926i interfaceC1926i2 = interfaceC1926i;
        l4.f fVar = c1935r.f15723c;
        Object obj2 = c1935r.f15724d;
        if ((i6 & 16) != 0) {
            th = c1935r.f15725e;
        }
        c1935r.getClass();
        return new C1935r(obj, interfaceC1926i2, fVar, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1935r)) {
            return false;
        }
        C1935r c1935r = (C1935r) obj;
        return AbstractC1276k.b(this.a, c1935r.a) && AbstractC1276k.b(this.f15722b, c1935r.f15722b) && AbstractC1276k.b(this.f15723c, c1935r.f15723c) && AbstractC1276k.b(this.f15724d, c1935r.f15724d) && AbstractC1276k.b(this.f15725e, c1935r.f15725e);
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        InterfaceC1926i interfaceC1926i = this.f15722b;
        int hashCode2 = (hashCode + (interfaceC1926i == null ? 0 : interfaceC1926i.hashCode())) * 31;
        l4.f fVar = this.f15723c;
        int hashCode3 = (hashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        Object obj2 = this.f15724d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f15725e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.f15722b + ", onCancellation=" + this.f15723c + ", idempotentResume=" + this.f15724d + ", cancelCause=" + this.f15725e + ')';
    }

    public /* synthetic */ C1935r(Object obj, InterfaceC1926i interfaceC1926i, l4.f fVar, Throwable th, int i6) {
        this(obj, (i6 & 2) != 0 ? null : interfaceC1926i, (i6 & 4) != 0 ? null : fVar, (Object) null, (i6 & 16) != 0 ? null : th);
    }
}
