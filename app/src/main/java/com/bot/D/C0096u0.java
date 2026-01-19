package D;

import j1.AbstractC1135a;

/* renamed from: D.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0096u0 {

    /* renamed from: c, reason: collision with root package name */
    public static final C0096u0 f1177c = new C0096u0(0, 0, 127);
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1178b;

    public C0096u0(int i6, int i7, int i8) {
        i6 = (i8 & 4) != 0 ? 0 : i6;
        i7 = (i8 & 8) != 0 ? -1 : i7;
        this.a = i6;
        this.f1178b = i7;
    }

    public final X0.k a(boolean z5) {
        X0.j jVar;
        int i6 = this.a;
        X0.l lVar = new X0.l(i6);
        if (i6 == 0) {
            lVar = null;
            jVar = null;
        } else {
            jVar = null;
        }
        int i7 = lVar != null ? lVar.a : 1;
        int i8 = this.f1178b;
        X0.j jVar2 = new X0.j(i8);
        if (i8 == -1) {
            jVar2 = jVar;
        }
        return new X0.k(z5, 0, true, i7, jVar2 != null ? jVar2.a : 1, Z0.b.f9854f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0096u0)) {
            return false;
        }
        C0096u0 c0096u0 = (C0096u0) obj;
        c0096u0.getClass();
        return this.a == c0096u0.a && this.f1178b == c0096u0.f1178b;
    }

    public final int hashCode() {
        return AbstractC1135a.b(this.f1178b, AbstractC1135a.b(this.a, Integer.hashCode(-1) * 961, 31), 29791);
    }

    public final String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) "Unspecified") + ", autoCorrectEnabled=null, keyboardType=" + ((Object) X0.l.a(this.a)) + ", imeAction=" + ((Object) X0.j.a(this.f1178b)) + ", platformImeOptions=nullshowKeyboardOnFocus=null, hintLocales=null)";
    }
}
