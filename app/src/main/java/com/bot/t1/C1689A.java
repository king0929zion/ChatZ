package t1;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* renamed from: t1.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1689A extends AbstractC1693E {

    /* renamed from: e, reason: collision with root package name */
    public static Field f14836e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f14837f = false;

    /* renamed from: g, reason: collision with root package name */
    public static Constructor f14838g = null;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f14839h = false;

    /* renamed from: c, reason: collision with root package name */
    public WindowInsets f14840c;

    /* renamed from: d, reason: collision with root package name */
    public o1.c f14841d;

    public C1689A() {
        this.f14840c = i();
    }

    private static WindowInsets i() {
        if (!f14837f) {
            try {
                f14836e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException unused) {
            }
            f14837f = true;
        }
        Field field = f14836e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException unused2) {
            }
        }
        if (!f14839h) {
            try {
                f14838g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException unused3) {
            }
            f14839h = true;
        }
        Constructor constructor = f14838g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException unused4) {
            }
        }
        return null;
    }

    @Override // t1.AbstractC1693E
    public P b() {
        a();
        P c6 = P.c(null, this.f14840c);
        o1.c[] cVarArr = this.f14843b;
        L l3 = c6.a;
        l3.r(cVarArr);
        l3.u(this.f14841d);
        return c6;
    }

    @Override // t1.AbstractC1693E
    public void e(o1.c cVar) {
        this.f14841d = cVar;
    }

    @Override // t1.AbstractC1693E
    public void g(o1.c cVar) {
        WindowInsets windowInsets = this.f14840c;
        if (windowInsets != null) {
            this.f14840c = windowInsets.replaceSystemWindowInsets(cVar.a, cVar.f13501b, cVar.f13502c, cVar.f13503d);
        }
    }

    public C1689A(P p5) {
        super(p5);
        this.f14840c = p5.b();
    }
}
