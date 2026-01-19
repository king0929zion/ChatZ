package m4;

import j1.AbstractC1135a;
import s4.InterfaceC1671a;

/* renamed from: m4.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1274i extends AbstractC1268c implements InterfaceC1273h, InterfaceC1671a, X3.e {

    /* renamed from: j, reason: collision with root package name */
    public final int f12964j;

    /* renamed from: k, reason: collision with root package name */
    public final int f12965k;

    public C1274i(int i6, Class cls, String str, String str2, int i7) {
        this(i6, C1267b.f12956c, cls, str, str2, i7, 0);
    }

    @Override // m4.AbstractC1268c
    public final InterfaceC1671a a() {
        AbstractC1289x.a.getClass();
        return this;
    }

    @Override // m4.InterfaceC1273h
    public final int c() {
        return this.f12964j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1274i) {
            C1274i c1274i = (C1274i) obj;
            return this.f12960g.equals(c1274i.f12960g) && this.f12961h.equals(c1274i.f12961h) && this.f12965k == c1274i.f12965k && this.f12964j == c1274i.f12964j && AbstractC1276k.b(this.f12958e, c1274i.f12958e) && e().equals(c1274i.e());
        }
        if (!(obj instanceof C1274i)) {
            return false;
        }
        InterfaceC1671a interfaceC1671a = this.f12957c;
        if (interfaceC1671a == null) {
            a();
            this.f12957c = this;
            interfaceC1671a = this;
        }
        return obj.equals(interfaceC1671a);
    }

    public final int hashCode() {
        e();
        return this.f12961h.hashCode() + B3.e.e(e().hashCode() * 31, 31, this.f12960g);
    }

    public final String toString() {
        InterfaceC1671a interfaceC1671a = this.f12957c;
        if (interfaceC1671a == null) {
            a();
            this.f12957c = this;
            interfaceC1671a = this;
        }
        if (interfaceC1671a != this) {
            return interfaceC1671a.toString();
        }
        String str = this.f12960g;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : AbstractC1135a.s("function ", str, " (Kotlin reflection is not available)");
    }

    public C1274i(int i6, Object obj, Class cls, String str, String str2, int i7, int i8) {
        super(obj, cls, str, str2, (i7 & 1) == 1);
        this.f12964j = i6;
        this.f12965k = 0;
    }
}
