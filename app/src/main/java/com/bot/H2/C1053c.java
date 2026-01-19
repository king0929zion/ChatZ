package h2;

import I.u;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.WindowManager;
import f2.C1007a;
import g2.C1017a;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import m4.AbstractC1276k;

/* renamed from: h2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1053c implements InterfaceC1052b, InterfaceC1055e, h {

    /* renamed from: c, reason: collision with root package name */
    public static final C1053c f11910c = new C1053c(0);

    /* renamed from: d, reason: collision with root package name */
    public static final C1053c f11911d = new C1053c(1);

    /* renamed from: e, reason: collision with root package name */
    public static final C1053c f11912e = new C1053c(2);

    /* renamed from: f, reason: collision with root package name */
    public static final C1053c f11913f = new C1053c(3);

    /* renamed from: g, reason: collision with root package name */
    public static final C1053c f11914g = new C1053c(4);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11915b;

    public /* synthetic */ C1053c(int i6) {
        this.f11915b = i6;
    }

    @Override // h2.InterfaceC1052b
    public Rect a(Activity activity) {
        int safeInsetLeft;
        int safeInsetRight;
        int safeInsetTop;
        int safeInsetBottom;
        int safeInsetBottom2;
        int safeInsetRight2;
        int i6 = this.f11915b;
        C1051a c1051a = InterfaceC1052b.a;
        DisplayCutout displayCutout = null;
        switch (i6) {
            case 0:
                Rect rect = new Rect();
                Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
                defaultDisplay.getRectSize(rect);
                if (!activity.isInMultiWindowMode()) {
                    Point point = new Point();
                    defaultDisplay.getRealSize(point);
                    Resources resources = activity.getResources();
                    int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    int i7 = rect.bottom + dimensionPixelSize;
                    if (i7 == point.y) {
                        rect.bottom = i7;
                    } else {
                        int i8 = rect.right + dimensionPixelSize;
                        if (i8 == point.x) {
                            rect.right = i8;
                        }
                    }
                }
                return rect;
            case 1:
                Rect rect2 = new Rect();
                Configuration configuration = activity.getResources().getConfiguration();
                try {
                    Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(configuration);
                    if (activity.isInMultiWindowMode()) {
                        Object invoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                        AbstractC1276k.d(invoke, "null cannot be cast to non-null type android.graphics.Rect");
                        rect2.set((Rect) invoke);
                    } else {
                        Object invoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                        AbstractC1276k.d(invoke2, "null cannot be cast to non-null type android.graphics.Rect");
                        rect2.set((Rect) invoke2);
                    }
                } catch (Exception e6) {
                    if (!(e6 instanceof NoSuchFieldException) && !(e6 instanceof NoSuchMethodException) && !(e6 instanceof IllegalAccessException) && !(e6 instanceof InvocationTargetException)) {
                        throw e6;
                    }
                    c1051a.getClass();
                    Log.w(C1051a.f11909b, e6);
                    activity.getWindowManager().getDefaultDisplay().getRectSize(rect2);
                }
                Display defaultDisplay2 = activity.getWindowManager().getDefaultDisplay();
                Point point2 = new Point();
                defaultDisplay2.getRealSize(point2);
                if (!activity.isInMultiWindowMode()) {
                    Resources resources2 = activity.getResources();
                    int identifier2 = resources2.getIdentifier("navigation_bar_height", "dimen", "android");
                    int dimensionPixelSize2 = identifier2 > 0 ? resources2.getDimensionPixelSize(identifier2) : 0;
                    int i9 = rect2.bottom + dimensionPixelSize2;
                    if (i9 == point2.y) {
                        rect2.bottom = i9;
                    } else {
                        int i10 = rect2.right + dimensionPixelSize2;
                        if (i10 == point2.x) {
                            rect2.right = i10;
                        } else if (rect2.left == dimensionPixelSize2) {
                            rect2.left = 0;
                        }
                    }
                }
                if ((rect2.width() < point2.x || rect2.height() < point2.y) && !activity.isInMultiWindowMode()) {
                    try {
                        Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
                        constructor.setAccessible(true);
                        Object newInstance = constructor.newInstance(null);
                        Method declaredMethod = defaultDisplay2.getClass().getDeclaredMethod("getDisplayInfo", newInstance.getClass());
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(defaultDisplay2, newInstance);
                        Field declaredField2 = newInstance.getClass().getDeclaredField("displayCutout");
                        declaredField2.setAccessible(true);
                        Object obj2 = declaredField2.get(newInstance);
                        if (u.y(obj2)) {
                            displayCutout = u.d(obj2);
                        }
                    } catch (Exception e7) {
                        if (!(e7 instanceof ClassNotFoundException) && !(e7 instanceof NoSuchMethodException) && !(e7 instanceof NoSuchFieldException) && !(e7 instanceof IllegalAccessException) && !(e7 instanceof InvocationTargetException) && !(e7 instanceof InstantiationException)) {
                            throw e7;
                        }
                        c1051a.getClass();
                        Log.w(C1051a.f11909b, e7);
                    }
                    if (displayCutout != null) {
                        int i11 = rect2.left;
                        safeInsetLeft = displayCutout.getSafeInsetLeft();
                        if (i11 == safeInsetLeft) {
                            rect2.left = 0;
                        }
                        int i12 = point2.x - rect2.right;
                        safeInsetRight = displayCutout.getSafeInsetRight();
                        if (i12 == safeInsetRight) {
                            int i13 = rect2.right;
                            safeInsetRight2 = displayCutout.getSafeInsetRight();
                            rect2.right = safeInsetRight2 + i13;
                        }
                        int i14 = rect2.top;
                        safeInsetTop = displayCutout.getSafeInsetTop();
                        if (i14 == safeInsetTop) {
                            rect2.top = 0;
                        }
                        int i15 = point2.y - rect2.bottom;
                        safeInsetBottom = displayCutout.getSafeInsetBottom();
                        if (i15 == safeInsetBottom) {
                            int i16 = rect2.bottom;
                            safeInsetBottom2 = displayCutout.getSafeInsetBottom();
                            rect2.bottom = safeInsetBottom2 + i16;
                        }
                    }
                }
                return rect2;
            default:
                Configuration configuration2 = activity.getResources().getConfiguration();
                try {
                    Field declaredField3 = Configuration.class.getDeclaredField("windowConfiguration");
                    declaredField3.setAccessible(true);
                    Object obj3 = declaredField3.get(configuration2);
                    Object invoke3 = obj3.getClass().getDeclaredMethod("getBounds", null).invoke(obj3, null);
                    AbstractC1276k.d(invoke3, "null cannot be cast to non-null type android.graphics.Rect");
                    return new Rect((Rect) invoke3);
                } catch (Exception e8) {
                    if (!(e8 instanceof NoSuchFieldException) && !(e8 instanceof NoSuchMethodException) && !(e8 instanceof IllegalAccessException) && !(e8 instanceof InvocationTargetException)) {
                        throw e8;
                    }
                    c1051a.getClass();
                    Log.w(C1051a.f11909b, e8);
                    return f11911d.a(activity);
                }
        }
    }

    @Override // h2.InterfaceC1055e
    public float b(ContextWrapper contextWrapper) {
        return contextWrapper.getResources().getDisplayMetrics().density;
    }

    @Override // h2.h
    public C1017a c(ContextWrapper contextWrapper, InterfaceC1055e interfaceC1055e) {
        AbstractC1276k.f(interfaceC1055e, "densityCompatHelper");
        Context context = contextWrapper;
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                context = contextWrapper;
                break;
            }
            if ((context instanceof Activity) || (context instanceof InputMethodService)) {
                break;
            }
            ContextWrapper contextWrapper2 = (ContextWrapper) context;
            if (contextWrapper2.getBaseContext() == null) {
                break;
            }
            context = contextWrapper2.getBaseContext();
            AbstractC1276k.e(context, "getBaseContext(...)");
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            InterfaceC1052b.a.getClass();
            int i6 = Build.VERSION.SDK_INT;
            return new C1017a(new C1007a((i6 >= 30 ? C1054d.f11916b : i6 >= 29 ? f11912e : i6 >= 28 ? f11911d : f11910c).a(activity)), interfaceC1055e.b(activity));
        }
        if (!(context instanceof InputMethodService) && !(context instanceof Application)) {
            throw new IllegalArgumentException("Must provide a UiContext or Application Context");
        }
        Object systemService = contextWrapper.getSystemService("window");
        AbstractC1276k.d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        AbstractC1276k.e(defaultDisplay, "getDefaultDisplay(...)");
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new C1017a(new Rect(0, 0, point.x, point.y), interfaceC1055e.b(contextWrapper));
    }
}
