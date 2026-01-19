package j2;

import F0.InterfaceC0121i;
import h0.InterfaceC1028e;
import j1.AbstractC1135a;
import m4.AbstractC1276k;
import v.InterfaceC1809o;

/* loaded from: classes.dex */
public final class w implements InterfaceC1809o {
    public final InterfaceC1809o a;

    /* renamed from: b, reason: collision with root package name */
    public final l f12416b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12417c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1028e f12418d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0121i f12419e;

    public w(InterfaceC1809o interfaceC1809o, l lVar, String str, InterfaceC1028e interfaceC1028e, InterfaceC0121i interfaceC0121i) {
        this.a = interfaceC1809o;
        this.f12416b = lVar;
        this.f12417c = str;
        this.f12418d = interfaceC1028e;
        this.f12419e = interfaceC0121i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return AbstractC1276k.b(this.a, wVar.a) && this.f12416b.equals(wVar.f12416b) && AbstractC1276k.b(this.f12417c, wVar.f12417c) && AbstractC1276k.b(this.f12418d, wVar.f12418d) && AbstractC1276k.b(this.f12419e, wVar.f12419e) && Float.compare(1.0f, 1.0f) == 0;
    }

    public final int hashCode() {
        int hashCode = (this.f12416b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.f12417c;
        return Boolean.hashCode(true) + AbstractC1135a.a(1.0f, (this.f12419e.hashCode() + ((this.f12418d.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 961);
    }

    public final String toString() {
        return "RealSubcomposeAsyncImageScope(parentScope=" + this.a + ", painter=" + this.f12416b + ", contentDescription=" + this.f12417c + ", alignment=" + this.f12418d + ", contentScale=" + this.f12419e + ", alpha=1.0, colorFilter=null, clipToBounds=true)";
    }
}
