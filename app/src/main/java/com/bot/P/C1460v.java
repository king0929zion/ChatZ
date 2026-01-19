package p;

import android.content.Context;
import e1.InterfaceC0961c;
import j1.AbstractC1135a;
import m4.AbstractC1276k;
import v.InterfaceC1802i0;

/* renamed from: p.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1460v {
    public final Context a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0961c f13809b;

    /* renamed from: c, reason: collision with root package name */
    public final long f13810c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1802i0 f13811d;

    public C1460v(Context context, InterfaceC0961c interfaceC0961c, long j3, InterfaceC1802i0 interfaceC1802i0) {
        this.a = context;
        this.f13809b = interfaceC0961c;
        this.f13810c = j3;
        this.f13811d = interfaceC1802i0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C1460v.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC1276k.d(obj, "null cannot be cast to non-null type androidx.compose.foundation.AndroidEdgeEffectOverscrollFactory");
        C1460v c1460v = (C1460v) obj;
        return AbstractC1276k.b(this.a, c1460v.a) && AbstractC1276k.b(this.f13809b, c1460v.f13809b) && o0.s.d(this.f13810c, c1460v.f13810c) && AbstractC1276k.b(this.f13811d, c1460v.f13811d);
    }

    public final int hashCode() {
        int hashCode = (this.f13809b.hashCode() + (this.a.hashCode() * 31)) * 31;
        int i6 = o0.s.f13482i;
        return this.f13811d.hashCode() + AbstractC1135a.c(hashCode, 31, this.f13810c);
    }
}
