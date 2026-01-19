package X0;

import S0.C0545g;
import i4.AbstractC1117a;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class t implements g {
    public final C0545g a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9123b;

    public t(String str, int i6) {
        this.a = new C0545g(str);
        this.f9123b = i6;
    }

    @Override // X0.g
    public final void a(h hVar) {
        int i6 = hVar.f9106d;
        C0545g c0545g = this.a;
        if (i6 != -1) {
            int i7 = hVar.f9107e;
            String str = c0545g.f7630e;
            String str2 = c0545g.f7630e;
            hVar.d(i6, i7, str);
            if (str2.length() > 0) {
                hVar.e(i6, str2.length() + i6);
            }
        } else {
            int i8 = hVar.f9104b;
            int i9 = hVar.f9105c;
            String str3 = c0545g.f7630e;
            String str4 = c0545g.f7630e;
            hVar.d(i8, i9, str3);
            if (str4.length() > 0) {
                hVar.e(i8, str4.length() + i8);
            }
        }
        int i10 = hVar.f9104b;
        int i11 = hVar.f9105c;
        int i12 = i10 == i11 ? i11 : -1;
        int i13 = this.f9123b;
        int f6 = AbstractC1117a.f(i13 > 0 ? (i12 + i13) - 1 : (i12 + i13) - c0545g.f7630e.length(), 0, hVar.a.b());
        hVar.f(f6, f6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return AbstractC1276k.b(this.a.f7630e, tVar.a.f7630e) && this.f9123b == tVar.f9123b;
    }

    public final int hashCode() {
        return (this.a.f7630e.hashCode() * 31) + this.f9123b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingTextCommand(text='");
        sb.append(this.a.f7630e);
        sb.append("', newCursorPosition=");
        return B3.e.q(sb, this.f9123b, ')');
    }
}
