package o1;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import i1.AbstractC1087g;
import io.ktor.utils.io.u;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class f extends u {

    /* renamed from: b, reason: collision with root package name */
    public final Class f13504b;

    /* renamed from: c, reason: collision with root package name */
    public final Constructor f13505c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f13506d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f13507e;

    /* renamed from: f, reason: collision with root package name */
    public final Method f13508f;

    /* renamed from: g, reason: collision with root package name */
    public final Method f13509g;

    /* renamed from: h, reason: collision with root package name */
    public final Method f13510h;

    public f() {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            method2 = q(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = r(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e6) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e6.getClass().getName()), e6);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f13504b = cls;
        this.f13505c = constructor;
        this.f13506d = method2;
        this.f13507e = method3;
        this.f13508f = method4;
        this.f13509g = method5;
        this.f13510h = method;
    }

    public static Method q(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    @Override // io.ktor.utils.io.u
    public final Typeface g(Context context, r1.d[] dVarArr) {
        Object obj;
        boolean z5;
        Typeface p5;
        boolean z6;
        if (dVarArr.length >= 1) {
            Method method = this.f13506d;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap hashMap = new HashMap();
                    for (r1.d dVar : dVarArr) {
                        if (dVar.f14652e == 0) {
                            Uri uri = dVar.a;
                            if (!hashMap.containsKey(uri)) {
                                hashMap.put(uri, AbstractC1087g.n(context, uri));
                            }
                        }
                    }
                    Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
                    try {
                        obj = this.f13505c.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        obj = null;
                    }
                    if (obj != null) {
                        int length = dVarArr.length;
                        int i6 = 0;
                        boolean z7 = false;
                        while (true) {
                            Method method2 = this.f13509g;
                            if (i6 < length) {
                                r1.d dVar2 = dVarArr[i6];
                                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(dVar2.a);
                                if (byteBuffer != null) {
                                    try {
                                        z6 = ((Boolean) this.f13507e.invoke(obj, byteBuffer, Integer.valueOf(dVar2.f14649b), null, Integer.valueOf(dVar2.f14650c), Integer.valueOf(dVar2.f14651d ? 1 : 0))).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        z6 = false;
                                    }
                                    if (!z6) {
                                        method2.invoke(obj, null);
                                        break;
                                    }
                                    z7 = true;
                                }
                                i6++;
                                z7 = z7;
                            } else if (z7) {
                                try {
                                    z5 = ((Boolean) this.f13508f.invoke(obj, null)).booleanValue();
                                } catch (IllegalAccessException | InvocationTargetException unused3) {
                                    z5 = false;
                                }
                                if (z5 && (p5 = p(obj)) != null) {
                                    return Typeface.create(p5, 0);
                                }
                            } else {
                                method2.invoke(obj, null);
                            }
                        }
                    }
                } else {
                    r1.d i7 = i(dVarArr);
                    ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(i7.a, "r", null);
                    if (openFileDescriptor != null) {
                        try {
                            Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(i7.f14650c).setItalic(i7.f14651d).build();
                            openFileDescriptor.close();
                            return build;
                        } finally {
                        }
                    }
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                        return null;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused4) {
            }
        }
        return null;
    }

    public Typeface p(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f13504b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f13510h.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method r(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
