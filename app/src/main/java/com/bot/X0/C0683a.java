package X0;

import S0.C0545g;
import i4.AbstractC1117a;
import m4.AbstractC1276k;

/* renamed from: X0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0683a implements g {
    public final C0545g a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9077b;

    public C0683a(C0545g c0545g, int i6) {
        this.a = c0545g;
        this.f9077b = i6;
    }

    @Override // X0.g
    public final void a(h hVar) {
        int i6 = hVar.f9106d;
        C0545g c0545g = this.a;
        if (i6 != -1) {
            hVar.d(i6, hVar.f9107e, c0545g.f7630e);
        } else {
            hVar.d(hVar.f9104b, hVar.f9105c, c0545g.f7630e);
        }
        int i7 = hVar.f9104b;
        int i8 = hVar.f9105c;
        int i9 = i7 == i8 ? i8 : -1;
        int i10 = this.f9077b;
        int f6 = AbstractC1117a.f(i10 > 0 ? (i9 + i10) - 1 : (i9 + i10) - c0545g.f7630e.length(), 0, hVar.a.b());
        hVar.f(f6, f6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0683a)) {
            return false;
        }
        C0683a c0683a = (C0683a) obj;
        return AbstractC1276k.b(this.a.f7630e, c0683a.a.f7630e) && this.f9077b == c0683a.f9077b;
    }

    public final int hashCode() {
        return (this.a.f7630e.hashCode() * 31) + this.f9077b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommitTextCommand(text='");
        sb.append(this.a.f7630e);
        sb.append("', newCursorPosition=");
        return B3.e.q(sb, this.f9077b, ')');
    }

    public C0683a(String str, int i6) {
        this(new C0545g(str), i6);
    }
}
