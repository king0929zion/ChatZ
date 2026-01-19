package b0;

import T.B0;
import T.C0;
import T.InterfaceC0608h;
import Z2.C0741a0;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import k.M;
import k.N;
import k.W;
import l4.InterfaceC1193a;

/* renamed from: b0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0879l {
    public Set a;

    /* renamed from: b, reason: collision with root package name */
    public g0.d f10989b;

    /* renamed from: c, reason: collision with root package name */
    public final V.e f10990c;

    /* renamed from: d, reason: collision with root package name */
    public N f10991d;

    /* renamed from: e, reason: collision with root package name */
    public V.e f10992e;

    /* renamed from: f, reason: collision with root package name */
    public final V.e f10993f;

    /* renamed from: g, reason: collision with root package name */
    public final V.e f10994g;

    /* renamed from: h, reason: collision with root package name */
    public N f10995h;

    /* renamed from: i, reason: collision with root package name */
    public M f10996i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f10997j;

    /* renamed from: k, reason: collision with root package name */
    public N f10998k;

    public C0879l() {
        V.e eVar = new V.e(new C0[16]);
        this.f10990c = eVar;
        N n3 = W.a;
        this.f10991d = new N();
        this.f10992e = eVar;
        this.f10993f = new V.e(new Object[16]);
        this.f10994g = new V.e(new InterfaceC1193a[16]);
    }

    public static final boolean f(C0 c02, V.e eVar) {
        Object[] objArr = eVar.f8759c;
        int i6 = eVar.f8761f;
        for (int i7 = 0; i7 < i6; i7++) {
            B0 b02 = ((C0) objArr[i7]).a;
            if (b02 instanceof C0876i) {
                V.e eVar2 = ((C0876i) b02).f10986e;
                if (eVar2.j(c02) || f(c02, eVar2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void a() {
        this.a = null;
        this.f10989b = null;
        V.e eVar = this.f10990c;
        eVar.g();
        this.f10991d.b();
        this.f10992e = eVar;
        this.f10993f.g();
        this.f10994g.g();
        this.f10995h = null;
        this.f10996i = null;
        this.f10997j = null;
    }

    public final void b() {
        Set set = this.a;
        if (set == null || set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                B0 b02 = (B0) it.next();
                it.remove();
                b02.a();
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void c() {
        Set set = this.a;
        if (set == null) {
            return;
        }
        this.f10998k = null;
        V.e eVar = this.f10993f;
        if (eVar.f8761f != 0) {
            Trace.beginSection("Compose:onForgotten");
            try {
                N n3 = this.f10995h;
                int i6 = eVar.f8761f;
                while (true) {
                    i6--;
                    if (-1 >= i6) {
                        break;
                    }
                    Object obj = eVar.f8759c[i6];
                    try {
                        if (obj instanceof C0) {
                            B0 b02 = ((C0) obj).a;
                            set.remove(b02);
                            b02.b();
                        }
                        if (obj instanceof InterfaceC0608h) {
                            if (n3 == null || !n3.c(obj)) {
                                ((InterfaceC0608h) obj).c();
                            } else {
                                ((InterfaceC0608h) obj).b();
                            }
                        }
                    } catch (Throwable th) {
                        g0.d dVar = this.f10989b;
                        if (dVar != null) {
                            s4.j.O(th, new C0741a0(1, dVar, obj));
                        }
                        throw th;
                    }
                }
            } finally {
            }
        }
        V.e eVar2 = this.f10990c;
        if (eVar2.f8761f != 0) {
            Trace.beginSection("Compose:onRemembered");
            try {
                Set set2 = this.a;
                if (set2 != null) {
                    Object[] objArr = eVar2.f8759c;
                    int i7 = eVar2.f8761f;
                    for (int i8 = 0; i8 < i7; i8++) {
                        C0 c02 = (C0) objArr[i8];
                        B0 b03 = c02.a;
                        set2.remove(b03);
                        try {
                            b03.e();
                        } catch (Throwable th2) {
                            g0.d dVar2 = this.f10989b;
                            if (dVar2 != null) {
                                s4.j.O(th2, new C0741a0(1, dVar2, c02));
                            }
                            throw th2;
                        }
                    }
                }
            } finally {
            }
        }
    }

    public final void d() {
        V.e eVar = this.f10994g;
        if (eVar.f8761f != 0) {
            Trace.beginSection("Compose:sideeffects");
            try {
                Object[] objArr = eVar.f8759c;
                int i6 = eVar.f8761f;
                for (int i7 = 0; i7 < i6; i7++) {
                    ((InterfaceC1193a) objArr[i7]).b();
                }
                eVar.g();
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
    }

    public final void e(C0 c02) {
        if (!this.f10991d.c(c02)) {
            N n3 = this.f10998k;
            if (n3 == null || !n3.c(c02)) {
                this.f10993f.b(c02);
                return;
            }
            return;
        }
        this.f10991d.l(c02);
        if (!this.f10992e.j(c02)) {
            V.e eVar = this.f10990c;
            if (!eVar.j(c02)) {
                f(c02, eVar);
            }
        }
        Set set = this.a;
        if (set == null) {
            return;
        }
        set.add(c02.a);
    }

    public final void g(Set set, g0.d dVar) {
        a();
        this.a = set;
        this.f10989b = dVar;
    }
}
