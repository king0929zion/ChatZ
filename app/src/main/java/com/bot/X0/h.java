package X0;

import S0.C0545g;
import S0.F;
import S0.O;
import U.L;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import j1.AbstractC1135a;

/* loaded from: classes.dex */
public final class h {
    public final U0.d a;

    /* renamed from: b, reason: collision with root package name */
    public int f9104b;

    /* renamed from: c, reason: collision with root package name */
    public int f9105c;

    /* renamed from: d, reason: collision with root package name */
    public int f9106d;

    /* renamed from: e, reason: collision with root package name */
    public int f9107e;

    public h(C0545g c0545g, long j3) {
        String str = c0545g.f7630e;
        U0.d dVar = new U0.d();
        dVar.f8602d = str;
        dVar.f8600b = -1;
        dVar.f8601c = -1;
        this.a = dVar;
        this.f9104b = O.f(j3);
        this.f9105c = O.e(j3);
        this.f9106d = -1;
        this.f9107e = -1;
        int f6 = O.f(j3);
        int e6 = O.e(j3);
        if (f6 < 0 || f6 > str.length()) {
            StringBuilder k3 = AbstractC1135a.k("start (", f6, ") offset is outside of text region ");
            k3.append(str.length());
            throw new IndexOutOfBoundsException(k3.toString());
        }
        if (e6 < 0 || e6 > str.length()) {
            StringBuilder k5 = AbstractC1135a.k("end (", e6, ") offset is outside of text region ");
            k5.append(str.length());
            throw new IndexOutOfBoundsException(k5.toString());
        }
        if (f6 > e6) {
            throw new IllegalArgumentException(B3.e.k("Do not set reversed range: ", f6, e6, " > "));
        }
    }

    public final void a(int i6, int i7) {
        long b5 = F.b(i6, i7);
        this.a.k(i6, i7, FlexmarkHtmlConverter.DEFAULT_NODE);
        long P5 = s4.j.P(F.b(this.f9104b, this.f9105c), b5);
        h(O.f(P5));
        g(O.e(P5));
        int i8 = this.f9106d;
        if (i8 != -1) {
            long P6 = s4.j.P(F.b(i8, this.f9107e), b5);
            if (O.c(P6)) {
                this.f9106d = -1;
                this.f9107e = -1;
            } else {
                this.f9106d = O.f(P6);
                this.f9107e = O.e(P6);
            }
        }
    }

    public final char b(int i6) {
        U0.d dVar = this.a;
        L l3 = (L) dVar.f8603e;
        if (l3 != null && i6 >= dVar.f8600b) {
            int b5 = l3.f8546b - l3.b();
            int i7 = dVar.f8600b;
            if (i6 >= b5 + i7) {
                return ((String) dVar.f8602d).charAt(i6 - ((b5 - dVar.f8601c) + i7));
            }
            int i8 = i6 - i7;
            int i9 = l3.f8547c;
            return i8 < i9 ? ((char[]) l3.f8549e)[i8] : ((char[]) l3.f8549e)[(i8 - i9) + l3.f8548d];
        }
        return ((String) dVar.f8602d).charAt(i6);
    }

    public final O c() {
        int i6 = this.f9106d;
        if (i6 != -1) {
            return new O(F.b(i6, this.f9107e));
        }
        return null;
    }

    public final void d(int i6, int i7, String str) {
        U0.d dVar = this.a;
        if (i6 < 0 || i6 > dVar.b()) {
            StringBuilder k3 = AbstractC1135a.k("start (", i6, ") offset is outside of text region ");
            k3.append(dVar.b());
            throw new IndexOutOfBoundsException(k3.toString());
        }
        if (i7 < 0 || i7 > dVar.b()) {
            StringBuilder k5 = AbstractC1135a.k("end (", i7, ") offset is outside of text region ");
            k5.append(dVar.b());
            throw new IndexOutOfBoundsException(k5.toString());
        }
        if (i6 > i7) {
            throw new IllegalArgumentException(B3.e.k("Do not set reversed range: ", i6, i7, " > "));
        }
        dVar.k(i6, i7, str);
        h(str.length() + i6);
        g(str.length() + i6);
        this.f9106d = -1;
        this.f9107e = -1;
    }

    public final void e(int i6, int i7) {
        U0.d dVar = this.a;
        if (i6 < 0 || i6 > dVar.b()) {
            StringBuilder k3 = AbstractC1135a.k("start (", i6, ") offset is outside of text region ");
            k3.append(dVar.b());
            throw new IndexOutOfBoundsException(k3.toString());
        }
        if (i7 < 0 || i7 > dVar.b()) {
            StringBuilder k5 = AbstractC1135a.k("end (", i7, ") offset is outside of text region ");
            k5.append(dVar.b());
            throw new IndexOutOfBoundsException(k5.toString());
        }
        if (i6 >= i7) {
            throw new IllegalArgumentException(B3.e.k("Do not set reversed or empty range: ", i6, i7, " > "));
        }
        this.f9106d = i6;
        this.f9107e = i7;
    }

    public final void f(int i6, int i7) {
        U0.d dVar = this.a;
        if (i6 < 0 || i6 > dVar.b()) {
            StringBuilder k3 = AbstractC1135a.k("start (", i6, ") offset is outside of text region ");
            k3.append(dVar.b());
            throw new IndexOutOfBoundsException(k3.toString());
        }
        if (i7 < 0 || i7 > dVar.b()) {
            StringBuilder k5 = AbstractC1135a.k("end (", i7, ") offset is outside of text region ");
            k5.append(dVar.b());
            throw new IndexOutOfBoundsException(k5.toString());
        }
        if (i6 > i7) {
            throw new IllegalArgumentException(B3.e.k("Do not set reversed range: ", i6, i7, " > "));
        }
        h(i6);
        g(i7);
    }

    public final void g(int i6) {
        if (!(i6 >= 0)) {
            Y0.a.a("Cannot set selectionEnd to a negative value: " + i6);
        }
        this.f9105c = i6;
    }

    public final void h(int i6) {
        if (!(i6 >= 0)) {
            Y0.a.a("Cannot set selectionStart to a negative value: " + i6);
        }
        this.f9104b = i6;
    }

    public final String toString() {
        return this.a.toString();
    }
}
