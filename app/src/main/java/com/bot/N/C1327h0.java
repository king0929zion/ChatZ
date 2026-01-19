package n;

import f0.C0987j;
import j1.AbstractC1135a;
import m4.AbstractC1276k;

/* renamed from: n.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1327h0 implements InterfaceC1351z {
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final float f13159b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f13160c;

    public C1327h0(float f6, float f7, Object obj) {
        this.a = f6;
        this.f13159b = f7;
        this.f13160c = obj;
    }

    @Override // n.InterfaceC1334l
    public final F0 a(E0 e02) {
        Object obj = this.f13160c;
        return new C0987j(this.a, this.f13159b, obj == null ? null : (AbstractC1343r) e02.a.f(obj));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1327h0) {
            C1327h0 c1327h0 = (C1327h0) obj;
            if (c1327h0.a == this.a && c1327h0.f13159b == this.f13159b && AbstractC1276k.b(c1327h0.f13160c, this.f13160c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f13160c;
        return Float.hashCode(this.f13159b) + AbstractC1135a.a(this.a, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }

    public /* synthetic */ C1327h0(Object obj) {
        this(1.0f, 1500.0f, obj);
    }
}
