package d1;

import j1.AbstractC1135a;
import m4.AbstractC1276k;
import o0.AbstractC1388J;
import o0.AbstractC1404o;

/* renamed from: d1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0935b implements o {
    public final AbstractC1388J a;

    /* renamed from: b, reason: collision with root package name */
    public final float f11382b;

    public C0935b(AbstractC1388J abstractC1388J, float f6) {
        this.a = abstractC1388J;
        this.f11382b = f6;
    }

    @Override // d1.o
    public final float a() {
        return this.f11382b;
    }

    @Override // d1.o
    public final long b() {
        int i6 = o0.s.f13482i;
        return o0.s.f13481h;
    }

    @Override // d1.o
    public final AbstractC1404o c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0935b)) {
            return false;
        }
        C0935b c0935b = (C0935b) obj;
        return AbstractC1276k.b(this.a, c0935b.a) && Float.compare(this.f11382b, c0935b.f11382b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f11382b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrushStyle(value=");
        sb.append(this.a);
        sb.append(", alpha=");
        return AbstractC1135a.h(sb, this.f11382b, ')');
    }
}
