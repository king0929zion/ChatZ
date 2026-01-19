package T;

import m4.AbstractC1276k;

/* renamed from: T.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0627q0 {
    public C0639x a;

    /* renamed from: b, reason: collision with root package name */
    public int f8191b;

    /* renamed from: c, reason: collision with root package name */
    public C0594a f8192c;

    /* renamed from: d, reason: collision with root package name */
    public l4.e f8193d;

    /* renamed from: e, reason: collision with root package name */
    public int f8194e;

    /* renamed from: f, reason: collision with root package name */
    public k.H f8195f;

    /* renamed from: g, reason: collision with root package name */
    public k.M f8196g;

    public C0627q0(C0639x c0639x) {
        this.a = c0639x;
    }

    public static boolean a(E e6, k.M m3) {
        AbstractC1276k.d(e6, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        R0 r02 = e6.f7945f;
        if (r02 == null) {
            r02 = C0602e.f8083j;
        }
        return !r02.a(e6.h().f7940f, m3.g(e6));
    }

    public final boolean b() {
        if (this.a != null) {
            C0594a c0594a = this.f8192c;
            if (c0594a != null ? c0594a.a() : false) {
                return true;
            }
        }
        return false;
    }

    public final O c(Object obj) {
        O s5;
        C0639x c0639x = this.a;
        return (c0639x == null || (s5 = c0639x.s(this, obj)) == null) ? O.f8012c : s5;
    }

    public final void d() {
        C0639x c0639x = this.a;
        if (c0639x != null) {
            c0639x.f8248r = true;
            c0639x.f8253w.i();
        }
        this.a = null;
        this.f8195f = null;
        this.f8196g = null;
        this.f8193d = null;
    }

    public final void e(boolean z5) {
        int i6 = this.f8191b;
        this.f8191b = z5 ? i6 | 32 : i6 & (-33);
    }

    public final void f(l4.e eVar) {
        this.f8193d = eVar;
    }
}
