package X0;

import S0.C0545g;
import S0.F;
import S0.O;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import j1.AbstractC1135a;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class v {
    public final C0545g a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9125b;

    /* renamed from: c, reason: collision with root package name */
    public final O f9126c;

    public v(C0545g c0545g, long j3, O o5) {
        this.a = c0545g;
        this.f9125b = F.c(j3, c0545g.f7630e.length());
        this.f9126c = o5 != null ? new O(F.c(o5.a, c0545g.f7630e.length())) : null;
    }

    public static v a(v vVar, C0545g c0545g, long j3, int i6) {
        if ((i6 & 1) != 0) {
            c0545g = vVar.a;
        }
        if ((i6 & 2) != 0) {
            j3 = vVar.f9125b;
        }
        O o5 = (i6 & 4) != 0 ? vVar.f9126c : null;
        vVar.getClass();
        return new v(c0545g, j3, o5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return O.b(this.f9125b, vVar.f9125b) && AbstractC1276k.b(this.f9126c, vVar.f9126c) && AbstractC1276k.b(this.a, vVar.a);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i6 = O.f7611c;
        int c6 = AbstractC1135a.c(hashCode, 31, this.f9125b);
        O o5 = this.f9126c;
        return c6 + (o5 != null ? Long.hashCode(o5.a) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.a) + "', selection=" + ((Object) O.h(this.f9125b)) + ", composition=" + this.f9126c + ')';
    }

    public v(long j3, String str, int i6) {
        this(new C0545g((i6 & 1) != 0 ? FlexmarkHtmlConverter.DEFAULT_NODE : str), (i6 & 2) != 0 ? O.f7610b : j3, (O) null);
    }
}
