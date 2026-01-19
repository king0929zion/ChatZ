package Z2;

import com.vladsch.flexmark.util.html.Attribute;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class f1 {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10204b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10205c;

    /* renamed from: d, reason: collision with root package name */
    public final o0.s f10206d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC1193a f10207e;

    public f1(int i6, String str, String str2, o0.s sVar, InterfaceC1193a interfaceC1193a) {
        AbstractC1276k.f(str, Attribute.TITLE_ATTR);
        this.a = i6;
        this.f10204b = str;
        this.f10205c = str2;
        this.f10206d = sVar;
        this.f10207e = interfaceC1193a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        return this.a == f1Var.a && AbstractC1276k.b(this.f10204b, f1Var.f10204b) && AbstractC1276k.b(this.f10205c, f1Var.f10205c) && AbstractC1276k.b(this.f10206d, f1Var.f10206d) && AbstractC1276k.b(this.f10207e, f1Var.f10207e);
    }

    public final int hashCode() {
        int e6 = B3.e.e(Integer.hashCode(this.a) * 31, 31, this.f10204b);
        String str = this.f10205c;
        int hashCode = (e6 + (str == null ? 0 : str.hashCode())) * 31;
        o0.s sVar = this.f10206d;
        int hashCode2 = (hashCode + (sVar == null ? 0 : Long.hashCode(sVar.a))) * 31;
        InterfaceC1193a interfaceC1193a = this.f10207e;
        return hashCode2 + (interfaceC1193a != null ? interfaceC1193a.hashCode() : 0);
    }

    public final String toString() {
        return "SettingsItemData(iconRes=" + this.a + ", title=" + this.f10204b + ", subtitle=" + this.f10205c + ", subtitleColor=" + this.f10206d + ", onClick=" + this.f10207e + ")";
    }

    public /* synthetic */ f1(int i6, String str, String str2, InterfaceC1193a interfaceC1193a, int i7) {
        this(i6, str, str2, (o0.s) null, (i7 & 16) != 0 ? null : interfaceC1193a);
    }
}
