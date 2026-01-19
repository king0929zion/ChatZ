package m4;

import s4.InterfaceC1671a;

/* renamed from: m4.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1282q extends AbstractC1268c implements s4.e {

    /* renamed from: j, reason: collision with root package name */
    public final boolean f12967j;

    public AbstractC1282q(Object obj, Class cls, String str, String str2, int i6) {
        super(obj, cls, str, str2, (i6 & 1) == 1);
        this.f12967j = false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1282q) {
            AbstractC1282q abstractC1282q = (AbstractC1282q) obj;
            return e().equals(abstractC1282q.e()) && this.f12960g.equals(abstractC1282q.f12960g) && this.f12961h.equals(abstractC1282q.f12961h) && AbstractC1276k.b(this.f12958e, abstractC1282q.f12958e);
        }
        if (obj instanceof s4.e) {
            return obj.equals(g());
        }
        return false;
    }

    public final InterfaceC1671a g() {
        if (this.f12967j) {
            return this;
        }
        InterfaceC1671a interfaceC1671a = this.f12957c;
        if (interfaceC1671a != null) {
            return interfaceC1671a;
        }
        InterfaceC1671a a = a();
        this.f12957c = a;
        return a;
    }

    public final int hashCode() {
        return this.f12961h.hashCode() + B3.e.e(e().hashCode() * 31, 31, this.f12960g);
    }

    public final String toString() {
        InterfaceC1671a g3 = g();
        return g3 != this ? g3.toString() : B3.e.s(new StringBuilder("property "), this.f12960g, " (Kotlin reflection is not available)");
    }
}
