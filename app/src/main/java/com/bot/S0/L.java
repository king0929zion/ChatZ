package S0;

import android.graphics.RectF;
import android.text.Layout;
import j1.AbstractC1135a;
import java.util.ArrayList;
import m4.AbstractC1276k;
import n0.C1354c;
import o0.AbstractC1399j;
import o0.C1397h;
import z2.C2018a;

/* loaded from: classes.dex */
public final class L {
    public final K a;

    /* renamed from: b, reason: collision with root package name */
    public final C0554p f7599b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7600c;

    /* renamed from: d, reason: collision with root package name */
    public final float f7601d;

    /* renamed from: e, reason: collision with root package name */
    public final float f7602e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f7603f;

    public L(K k3, C0554p c0554p, long j3) {
        this.a = k3;
        this.f7599b = c0554p;
        this.f7600c = j3;
        ArrayList arrayList = c0554p.f7654h;
        boolean isEmpty = arrayList.isEmpty();
        float f6 = S.l.f7374V;
        this.f7601d = isEmpty ? 0.0f : ((r) arrayList.get(0)).a.f7617d.d(0);
        if (!arrayList.isEmpty()) {
            r rVar = (r) Y3.m.w0(arrayList);
            f6 = rVar.a.f7617d.d(r4.f8317g - 1) + rVar.f7661f;
        }
        this.f7602e = f6;
        this.f7603f = c0554p.f7653g;
    }

    public final d1.j a(int i6) {
        C0554p c0554p = this.f7599b;
        ArrayList arrayList = c0554p.f7654h;
        c0554p.l(i6);
        r rVar = (r) arrayList.get(i6 == ((C0545g) c0554p.a.a).f7630e.length() ? Y4.l.C(arrayList) : F.d(arrayList, i6));
        return rVar.a.f7617d.f8316f.isRtlCharAt(rVar.d(i6)) ? d1.j.f11391e : d1.j.f11390c;
    }

    public final C1354c b(int i6) {
        float i7;
        float i8;
        float h3;
        float h6;
        C0554p c0554p = this.f7599b;
        c0554p.k(i6);
        ArrayList arrayList = c0554p.f7654h;
        r rVar = (r) arrayList.get(F.d(arrayList, i6));
        C0539a c0539a = rVar.a;
        int d6 = rVar.d(i6);
        CharSequence charSequence = c0539a.f7618e;
        if (d6 < 0 || d6 >= charSequence.length()) {
            StringBuilder k3 = AbstractC1135a.k("offset(", d6, ") is out of bounds [0,");
            k3.append(charSequence.length());
            k3.append(')');
            Y0.a.a(k3.toString());
        }
        T0.j jVar = c0539a.f7617d;
        Layout layout = jVar.f8316f;
        int lineForOffset = layout.getLineForOffset(d6);
        float g3 = jVar.g(lineForOffset);
        float e6 = jVar.e(lineForOffset);
        boolean z5 = layout.getParagraphDirection(lineForOffset) == 1;
        boolean isRtlCharAt = layout.isRtlCharAt(d6);
        if (!z5 || isRtlCharAt) {
            if (z5 && isRtlCharAt) {
                h3 = jVar.i(d6, false);
                h6 = jVar.i(d6 + 1, true);
            } else if (isRtlCharAt) {
                h3 = jVar.h(d6, false);
                h6 = jVar.h(d6 + 1, true);
            } else {
                i7 = jVar.i(d6, false);
                i8 = jVar.i(d6 + 1, true);
            }
            float f6 = h3;
            i7 = h6;
            i8 = f6;
        } else {
            i7 = jVar.h(d6, false);
            i8 = jVar.h(d6 + 1, true);
        }
        RectF rectF = new RectF(i7, g3, i8, e6);
        return rVar.a(new C1354c(rectF.left, rectF.top, rectF.right, rectF.bottom));
    }

    public final C1354c c(int i6) {
        C0554p c0554p = this.f7599b;
        ArrayList arrayList = c0554p.f7654h;
        c0554p.l(i6);
        r rVar = (r) arrayList.get(i6 == ((C0545g) c0554p.a.a).f7630e.length() ? Y4.l.C(arrayList) : F.d(arrayList, i6));
        C0539a c0539a = rVar.a;
        int d6 = rVar.d(i6);
        CharSequence charSequence = c0539a.f7618e;
        T0.j jVar = c0539a.f7617d;
        if (d6 < 0 || d6 > charSequence.length()) {
            StringBuilder k3 = AbstractC1135a.k("offset(", d6, ") is out of bounds [0,");
            k3.append(charSequence.length());
            k3.append(']');
            Y0.a.a(k3.toString());
        }
        float h3 = jVar.h(d6, false);
        int lineForOffset = jVar.f8316f.getLineForOffset(d6);
        return rVar.a(new C1354c(h3, jVar.g(lineForOffset), h3, jVar.e(lineForOffset)));
    }

    public final boolean d() {
        long j3 = this.f7600c;
        float f6 = (int) (j3 >> 32);
        C0554p c0554p = this.f7599b;
        return f6 < c0554p.f7650d || c0554p.f7649c || ((float) ((int) (j3 & 4294967295L))) < c0554p.f7651e;
    }

    public final float e(int i6, boolean z5) {
        C0554p c0554p = this.f7599b;
        ArrayList arrayList = c0554p.f7654h;
        c0554p.l(i6);
        r rVar = (r) arrayList.get(i6 == ((C0545g) c0554p.a.a).f7630e.length() ? Y4.l.C(arrayList) : F.d(arrayList, i6));
        C0539a c0539a = rVar.a;
        int d6 = rVar.d(i6);
        T0.j jVar = c0539a.f7617d;
        return z5 ? jVar.h(d6, false) : jVar.i(d6, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l3 = (L) obj;
        return AbstractC1276k.b(this.a, l3.a) && this.f7599b.equals(l3.f7599b) && e1.l.b(this.f7600c, l3.f7600c) && this.f7601d == l3.f7601d && this.f7602e == l3.f7602e && AbstractC1276k.b(this.f7603f, l3.f7603f);
    }

    public final float f(int i6) {
        C0554p c0554p = this.f7599b;
        c0554p.m(i6);
        ArrayList arrayList = c0554p.f7654h;
        r rVar = (r) arrayList.get(F.e(arrayList, i6));
        C0539a c0539a = rVar.a;
        return c0539a.f7617d.d(i6 - rVar.f7659d) + rVar.f7661f;
    }

    public final float g(int i6) {
        C0554p c0554p = this.f7599b;
        c0554p.m(i6);
        ArrayList arrayList = c0554p.f7654h;
        r rVar = (r) arrayList.get(F.e(arrayList, i6));
        C0539a c0539a = rVar.a;
        int i7 = i6 - rVar.f7659d;
        T0.j jVar = c0539a.f7617d;
        return jVar.f8316f.getLineLeft(i7) + (i7 == jVar.f8317g + (-1) ? jVar.f8320j : S.l.f7374V);
    }

    public final float h(int i6) {
        C0554p c0554p = this.f7599b;
        c0554p.m(i6);
        ArrayList arrayList = c0554p.f7654h;
        r rVar = (r) arrayList.get(F.e(arrayList, i6));
        C0539a c0539a = rVar.a;
        int i7 = i6 - rVar.f7659d;
        T0.j jVar = c0539a.f7617d;
        return jVar.f8316f.getLineRight(i7) + (i7 == jVar.f8317g + (-1) ? jVar.f8321k : S.l.f7374V);
    }

    public final int hashCode() {
        return this.f7603f.hashCode() + AbstractC1135a.a(this.f7602e, AbstractC1135a.a(this.f7601d, AbstractC1135a.c((this.f7599b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.f7600c), 31), 31);
    }

    public final int i(int i6) {
        C0554p c0554p = this.f7599b;
        c0554p.m(i6);
        ArrayList arrayList = c0554p.f7654h;
        r rVar = (r) arrayList.get(F.e(arrayList, i6));
        C0539a c0539a = rVar.a;
        return c0539a.f7617d.f8316f.getLineStart(i6 - rVar.f7659d) + rVar.f7657b;
    }

    public final d1.j j(int i6) {
        C0554p c0554p = this.f7599b;
        ArrayList arrayList = c0554p.f7654h;
        c0554p.l(i6);
        r rVar = (r) arrayList.get(i6 == ((C0545g) c0554p.a.a).f7630e.length() ? Y4.l.C(arrayList) : F.d(arrayList, i6));
        C0539a c0539a = rVar.a;
        int d6 = rVar.d(i6);
        T0.j jVar = c0539a.f7617d;
        return jVar.f8316f.getParagraphDirection(jVar.f8316f.getLineForOffset(d6)) == 1 ? d1.j.f11390c : d1.j.f11391e;
    }

    public final C1397h k(int i6, int i7) {
        C0554p c0554p = this.f7599b;
        C0545g c0545g = (C0545g) c0554p.a.a;
        if (i6 < 0 || i6 > i7 || i7 > c0545g.f7630e.length()) {
            StringBuilder j3 = AbstractC1135a.j(i6, "Start(", i7, ") or End(", ") is out of range [0..");
            j3.append(c0545g.f7630e.length());
            j3.append("), or start > end!");
            Y0.a.a(j3.toString());
        }
        if (i6 == i7) {
            return AbstractC1399j.a();
        }
        C1397h a = AbstractC1399j.a();
        F.g(c0554p.f7654h, F.b(i6, i7), new C2018a(a, i6, i7, 2));
        return a;
    }

    public final long l(int i6) {
        int j3;
        int i7;
        int i8;
        C0554p c0554p = this.f7599b;
        ArrayList arrayList = c0554p.f7654h;
        c0554p.l(i6);
        r rVar = (r) arrayList.get(i6 == ((C0545g) c0554p.a.a).f7630e.length() ? Y4.l.C(arrayList) : F.d(arrayList, i6));
        C0539a c0539a = rVar.a;
        int d6 = rVar.d(i6);
        U0.d j4 = c0539a.f7617d.j();
        if (j4.h(j4.j(d6))) {
            j4.a(d6);
            j3 = d6;
            while (j3 != -1 && (!j4.h(j3) || j4.d(j3))) {
                j3 = j4.j(j3);
            }
        } else {
            j4.a(d6);
            j3 = j4.g(d6) ? (!j4.e(d6) || j4.c(d6)) ? j4.j(d6) : d6 : j4.c(d6) ? j4.j(d6) : -1;
        }
        if (j3 == -1) {
            j3 = d6;
        }
        if (j4.d(j4.i(d6))) {
            j4.a(d6);
            i7 = d6;
            while (i7 != -1 && (j4.h(i7) || !j4.d(i7))) {
                i7 = j4.i(i7);
            }
        } else {
            j4.a(d6);
            if (j4.c(d6)) {
                if (!j4.e(d6) || j4.g(d6)) {
                    i8 = j4.i(d6);
                    i7 = i8;
                } else {
                    i7 = d6;
                }
            } else if (j4.g(d6)) {
                i8 = j4.i(d6);
                i7 = i8;
            } else {
                i7 = -1;
            }
        }
        if (i7 != -1) {
            d6 = i7;
        }
        return rVar.b(F.b(j3, d6), false);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.a + ", multiParagraph=" + this.f7599b + ", size=" + ((Object) e1.l.c(this.f7600c)) + ", firstBaseline=" + this.f7601d + ", lastBaseline=" + this.f7602e + ", placeholderRects=" + this.f7603f + ')';
    }
}
