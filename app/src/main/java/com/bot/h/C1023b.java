package h;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import com.tencent.mmkv.R;
import d2.AbstractC0939a;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;
import k.C1173u;

/* renamed from: h.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1023b {

    /* renamed from: d, reason: collision with root package name */
    public static C1023b f11780d;
    public final WeakHashMap a = new WeakHashMap(0);

    /* renamed from: b, reason: collision with root package name */
    public TypedValue f11781b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f11782c;

    static {
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        new LinkedHashMap(0, 0.75f, true);
    }

    public static synchronized C1023b a() {
        C1023b c1023b;
        synchronized (C1023b.class) {
            try {
                if (f11780d == null) {
                    f11780d = new C1023b();
                }
                c1023b = f11780d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1023b;
    }

    public final synchronized Drawable b(Context context, long j3) {
        C1173u c1173u = (C1173u) this.a.get(context);
        if (c1173u == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) c1173u.a(j3);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            c1173u.d(j3);
        }
        return null;
    }

    public final synchronized Drawable c(Context context, int i6) {
        return d(context, i6);
    }

    public final synchronized Drawable d(Context context, int i6) {
        Drawable b5;
        try {
            if (!this.f11782c) {
                this.f11782c = true;
                Drawable c6 = c(context, R.drawable.abc_vector_test);
                if (c6 == null || (!(c6 instanceof AbstractC0939a) && !"android.graphics.drawable.VectorDrawable".equals(c6.getClass().getName()))) {
                    this.f11782c = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            if (this.f11781b == null) {
                this.f11781b = new TypedValue();
            }
            context.getResources().getValue(i6, this.f11781b, true);
            b5 = b(context, (r0.assetCookie << 32) | r0.data);
            if (b5 == null) {
                b5 = null;
            }
            if (b5 == null) {
                b5 = context.getDrawable(i6);
            }
            if (b5 != null) {
                synchronized (this) {
                }
            }
            if (b5 != null) {
                int[] iArr = AbstractC1022a.a;
                String name = b5.getClass().getName();
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= 29 && i7 < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name)) {
                    int[] state = b5.getState();
                    if (state != null && state.length != 0) {
                        b5.setState(AbstractC1022a.f11779b);
                        b5.setState(state);
                    }
                    b5.setState(AbstractC1022a.a);
                    b5.setState(state);
                }
            }
        } finally {
        }
        return b5;
    }
}
