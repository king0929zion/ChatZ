package t1;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import i4.AbstractC1120d;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import p1.AbstractC1484a;

/* renamed from: t1.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1694F extends L {

    /* renamed from: i, reason: collision with root package name */
    public static boolean f14844i = false;

    /* renamed from: j, reason: collision with root package name */
    public static Method f14845j;

    /* renamed from: k, reason: collision with root package name */
    public static Class f14846k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f14847l;

    /* renamed from: m, reason: collision with root package name */
    public static Field f14848m;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f14849c;

    /* renamed from: d, reason: collision with root package name */
    public o1.c[] f14850d;

    /* renamed from: e, reason: collision with root package name */
    public o1.c f14851e;

    /* renamed from: f, reason: collision with root package name */
    public P f14852f;

    /* renamed from: g, reason: collision with root package name */
    public o1.c f14853g;

    /* renamed from: h, reason: collision with root package name */
    public int f14854h;

    public C1694F(P p5, WindowInsets windowInsets) {
        super(p5);
        this.f14851e = null;
        this.f14849c = windowInsets;
    }

    @SuppressLint({"PrivateApi"})
    private static void B() {
        try {
            f14845j = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f14846k = cls;
            f14847l = cls.getDeclaredField("mVisibleInsets");
            f14848m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f14847l.setAccessible(true);
            f14848m.setAccessible(true);
        } catch (ReflectiveOperationException e6) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e6.getMessage(), e6);
        }
        f14844i = true;
    }

    public static boolean C(int i6, int i7) {
        return (i6 & 6) == (i7 & 6);
    }

    @SuppressLint({"WrongConstant"})
    private o1.c w(int i6, boolean z5) {
        o1.c cVar = o1.c.f13500e;
        for (int i7 = 1; i7 <= 512; i7 <<= 1) {
            if ((i6 & i7) != 0) {
                cVar = o1.c.a(cVar, x(i7, z5));
            }
        }
        return cVar;
    }

    private o1.c y() {
        P p5 = this.f14852f;
        return p5 != null ? p5.a.j() : o1.c.f13500e;
    }

    private o1.c z(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f14844i) {
            B();
        }
        Method method = f14845j;
        if (method != null && f14846k != null && f14847l != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f14847l.get(f14848m.get(invoke));
                if (rect != null) {
                    return o1.c.b(rect.left, rect.top, rect.right, rect.bottom);
                }
            } catch (ReflectiveOperationException e6) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e6.getMessage(), e6);
            }
        }
        return null;
    }

    public boolean A(int i6) {
        if (i6 != 1 && i6 != 2) {
            if (i6 == 4) {
                return false;
            }
            if (i6 != 8 && i6 != 128) {
                return true;
            }
        }
        return !x(i6, false).equals(o1.c.f13500e);
    }

    @Override // t1.L
    public void d(View view) {
        o1.c z5 = z(view);
        if (z5 == null) {
            z5 = o1.c.f13500e;
        }
        s(z5);
    }

    @Override // t1.L
    public void e(P p5) {
        p5.a.t(this.f14852f);
        o1.c cVar = this.f14853g;
        L l3 = p5.a;
        l3.s(cVar);
        l3.v(this.f14854h);
    }

    @Override // t1.L
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        C1694F c1694f = (C1694F) obj;
        return Objects.equals(this.f14853g, c1694f.f14853g) && C(this.f14854h, c1694f.f14854h);
    }

    @Override // t1.L
    public o1.c g(int i6) {
        return w(i6, false);
    }

    @Override // t1.L
    public o1.c h(int i6) {
        return w(i6, true);
    }

    @Override // t1.L
    public final o1.c l() {
        if (this.f14851e == null) {
            WindowInsets windowInsets = this.f14849c;
            this.f14851e = o1.c.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f14851e;
    }

    @Override // t1.L
    public P n(int i6, int i7, int i8, int i9) {
        P c6 = P.c(null, this.f14849c);
        int i10 = Build.VERSION.SDK_INT;
        AbstractC1693E c1692d = i10 >= 34 ? new C1692D(c6) : i10 >= 30 ? new C1691C(c6) : i10 >= 29 ? new C1690B(c6) : new C1689A(c6);
        c1692d.g(P.a(l(), i6, i7, i8, i9));
        c1692d.e(P.a(j(), i6, i7, i8, i9));
        return c1692d.b();
    }

    @Override // t1.L
    public boolean p() {
        return this.f14849c.isRound();
    }

    @Override // t1.L
    @SuppressLint({"WrongConstant"})
    public boolean q(int i6) {
        for (int i7 = 1; i7 <= 512; i7 <<= 1) {
            if ((i6 & i7) != 0 && !A(i7)) {
                return false;
            }
        }
        return true;
    }

    @Override // t1.L
    public void r(o1.c[] cVarArr) {
        this.f14850d = cVarArr;
    }

    @Override // t1.L
    public void s(o1.c cVar) {
        this.f14853g = cVar;
    }

    @Override // t1.L
    public void t(P p5) {
        this.f14852f = p5;
    }

    @Override // t1.L
    public void v(int i6) {
        this.f14854h = i6;
    }

    public o1.c x(int i6, boolean z5) {
        o1.c j3;
        int i7;
        o1.c cVar = o1.c.f13500e;
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 == 8) {
                    o1.c[] cVarArr = this.f14850d;
                    j3 = cVarArr != null ? cVarArr[AbstractC1120d.q(8)] : null;
                    if (j3 != null) {
                        return j3;
                    }
                    o1.c l3 = l();
                    o1.c y5 = y();
                    int i8 = l3.f13503d;
                    if (i8 > y5.f13503d) {
                        return o1.c.b(0, 0, 0, i8);
                    }
                    o1.c cVar2 = this.f14853g;
                    if (cVar2 != null && !cVar2.equals(cVar) && (i7 = this.f14853g.f13503d) > y5.f13503d) {
                        return o1.c.b(0, 0, 0, i7);
                    }
                } else {
                    if (i6 == 16) {
                        return k();
                    }
                    if (i6 == 32) {
                        return i();
                    }
                    if (i6 == 64) {
                        return m();
                    }
                    if (i6 == 128) {
                        P p5 = this.f14852f;
                        C1701d f6 = p5 != null ? p5.a.f() : f();
                        if (f6 != null) {
                            int i9 = Build.VERSION.SDK_INT;
                            return o1.c.b(i9 >= 28 ? AbstractC1484a.e(f6.a) : 0, i9 >= 28 ? AbstractC1484a.g(f6.a) : 0, i9 >= 28 ? AbstractC1484a.f(f6.a) : 0, i9 >= 28 ? AbstractC1484a.d(f6.a) : 0);
                        }
                    }
                }
            } else {
                if (z5) {
                    o1.c y6 = y();
                    o1.c j4 = j();
                    return o1.c.b(Math.max(y6.a, j4.a), 0, Math.max(y6.f13502c, j4.f13502c), Math.max(y6.f13503d, j4.f13503d));
                }
                if ((this.f14854h & 2) == 0) {
                    o1.c l5 = l();
                    P p6 = this.f14852f;
                    j3 = p6 != null ? p6.a.j() : null;
                    int i10 = l5.f13503d;
                    if (j3 != null) {
                        i10 = Math.min(i10, j3.f13503d);
                    }
                    return o1.c.b(l5.a, 0, l5.f13502c, i10);
                }
            }
        } else {
            if (z5) {
                return o1.c.b(0, Math.max(y().f13501b, l().f13501b), 0, 0);
            }
            if ((this.f14854h & 4) == 0) {
                return o1.c.b(0, l().f13501b, 0, 0);
            }
        }
        return cVar;
    }

    public C1694F(P p5, C1694F c1694f) {
        this(p5, new WindowInsets(c1694f.f14849c));
    }
}
