package C;

import S.l;
import e1.InterfaceC0961c;
import e1.m;
import i4.AbstractC1117a;
import m4.AbstractC1276k;
import n0.C1354c;
import n0.C1355d;
import n0.C1356e;
import o0.C1384F;
import o0.C1385G;
import o0.L;
import o0.y;
import u.AbstractC1734b;

/* loaded from: classes.dex */
public final class d implements L {
    public final a a;

    /* renamed from: b, reason: collision with root package name */
    public final a f642b;

    /* renamed from: c, reason: collision with root package name */
    public final a f643c;

    /* renamed from: d, reason: collision with root package name */
    public final a f644d;

    public d(a aVar, a aVar2, a aVar3, a aVar4) {
        this.a = aVar;
        this.f642b = aVar2;
        this.f643c = aVar3;
        this.f644d = aVar4;
    }

    public static d b(d dVar, a aVar, a aVar2, a aVar3, a aVar4, int i6) {
        if ((i6 & 1) != 0) {
            aVar = dVar.a;
        }
        if ((i6 & 2) != 0) {
            aVar2 = dVar.f642b;
        }
        if ((i6 & 4) != 0) {
            aVar3 = dVar.f643c;
        }
        if ((i6 & 8) != 0) {
            aVar4 = dVar.f644d;
        }
        dVar.getClass();
        return new d(aVar, aVar2, aVar3, aVar4);
    }

    @Override // o0.L
    public final y a(long j3, m mVar, InterfaceC0961c interfaceC0961c) {
        float a = this.a.a(j3, interfaceC0961c);
        float a6 = this.f642b.a(j3, interfaceC0961c);
        float a7 = this.f643c.a(j3, interfaceC0961c);
        float a8 = this.f644d.a(j3, interfaceC0961c);
        float c6 = C1356e.c(j3);
        float f6 = a + a8;
        if (f6 > c6) {
            float f7 = c6 / f6;
            a *= f7;
            a8 *= f7;
        }
        float f8 = a6 + a7;
        if (f8 > c6) {
            float f9 = c6 / f8;
            a6 *= f9;
            a7 *= f9;
        }
        if (a < l.f7374V || a6 < l.f7374V || a7 < l.f7374V || a8 < l.f7374V) {
            AbstractC1734b.a("Corner size in Px can't be negative(topStart = " + a + ", topEnd = " + a6 + ", bottomEnd = " + a7 + ", bottomStart = " + a8 + ")!");
        }
        if (a + a6 + a7 + a8 == l.f7374V) {
            return new C1384F(AbstractC1117a.a(0L, j3));
        }
        C1354c a9 = AbstractC1117a.a(0L, j3);
        m mVar2 = m.f11576c;
        float f10 = mVar == mVar2 ? a : a6;
        long floatToRawIntBits = (Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L);
        if (mVar == mVar2) {
            a = a6;
        }
        long floatToRawIntBits2 = (Float.floatToRawIntBits(a) << 32) | (Float.floatToRawIntBits(a) & 4294967295L);
        float f11 = mVar == mVar2 ? a7 : a8;
        long floatToRawIntBits3 = (Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L);
        if (mVar != mVar2) {
            a8 = a7;
        }
        return new C1385G(new C1355d(a9.a, a9.f13295b, a9.f13296c, a9.f13297d, floatToRawIntBits, floatToRawIntBits2, floatToRawIntBits3, (Float.floatToRawIntBits(a8) << 32) | (Float.floatToRawIntBits(a8) & 4294967295L)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return AbstractC1276k.b(this.a, dVar.a) && AbstractC1276k.b(this.f642b, dVar.f642b) && AbstractC1276k.b(this.f643c, dVar.f643c) && AbstractC1276k.b(this.f644d, dVar.f644d);
    }

    public final int hashCode() {
        return this.f644d.hashCode() + ((this.f643c.hashCode() + ((this.f642b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.a + ", topEnd = " + this.f642b + ", bottomEnd = " + this.f643c + ", bottomStart = " + this.f644d + ')';
    }
}
