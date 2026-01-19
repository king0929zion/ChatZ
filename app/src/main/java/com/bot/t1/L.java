package t1;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public class L {

    /* renamed from: b, reason: collision with root package name */
    public static final P f14861b;
    public final P a;

    static {
        int i6 = Build.VERSION.SDK_INT;
        f14861b = (i6 >= 34 ? new C1692D() : i6 >= 30 ? new C1691C() : i6 >= 29 ? new C1690B() : new C1689A()).b().a.a().a.b().a.c();
    }

    public L(P p5) {
        this.a = p5;
    }

    public P a() {
        return this.a;
    }

    public P b() {
        return this.a;
    }

    public P c() {
        return this.a;
    }

    public void d(View view) {
    }

    public void e(P p5) {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l3 = (L) obj;
        return p() == l3.p() && o() == l3.o() && Objects.equals(l(), l3.l()) && Objects.equals(j(), l3.j()) && Objects.equals(f(), l3.f());
    }

    public C1701d f() {
        return null;
    }

    public o1.c g(int i6) {
        return o1.c.f13500e;
    }

    public o1.c h(int i6) {
        if ((i6 & 8) == 0) {
            return o1.c.f13500e;
        }
        throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(p()), Boolean.valueOf(o()), l(), j(), f());
    }

    public o1.c i() {
        return l();
    }

    public o1.c j() {
        return o1.c.f13500e;
    }

    public o1.c k() {
        return l();
    }

    public o1.c l() {
        return o1.c.f13500e;
    }

    public o1.c m() {
        return l();
    }

    public P n(int i6, int i7, int i8, int i9) {
        return f14861b;
    }

    public boolean o() {
        return false;
    }

    public boolean p() {
        return false;
    }

    public boolean q(int i6) {
        return true;
    }

    public void r(o1.c[] cVarArr) {
    }

    public void s(o1.c cVar) {
    }

    public void t(P p5) {
    }

    public void u(o1.c cVar) {
    }

    public void v(int i6) {
    }
}
