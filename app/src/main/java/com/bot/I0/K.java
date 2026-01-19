package I0;

import S0.C0545g;
import T.C0602e;
import android.R;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Binder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewParent;
import f0.InterfaceC0994q;
import i4.AbstractC1117a;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m4.AbstractC1276k;
import o0.AbstractC1399j;
import o0.C1397h;
import u1.C1753c;
import u1.C1754d;

/* loaded from: classes.dex */
public abstract class K implements W0 {
    public static final Class[] a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    public static final boolean a(View view, View view2) {
        if (view2.equals(view)) {
            return false;
        }
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }

    public static final boolean b(P0.p pVar) {
        P0.m k3 = pVar.k();
        return !k3.f4492c.c(P0.t.f4530i);
    }

    public static final boolean c(P0.p pVar, Resources resources) {
        Object g3 = pVar.f4499d.f4492c.g(P0.t.a);
        if (g3 == null) {
            g3 = null;
        }
        List list = (List) g3;
        return !P0.s.e(pVar) && (pVar.f4499d.f4494f || (pVar.o() && ((list != null ? (String) Y3.m.q0(list) : null) != null || i(pVar) != null || h(pVar, resources) != null || g(pVar))));
    }

    public static final void d(P0.p pVar, C1754d c1754d) {
        P0.m mVar = pVar.f4499d;
        k.M m3 = mVar.f4492c;
        Object g3 = mVar.f4492c.g(P0.t.f4546y);
        if (g3 == null) {
            g3 = null;
        }
        P0.i iVar = (P0.i) g3;
        if (b(pVar)) {
            if (iVar != null && iVar.a == 8) {
                return;
            }
            Object g6 = m3.g(P0.l.f4490y);
            if (g6 == null) {
                g6 = null;
            }
            P0.a aVar = (P0.a) g6;
            if (aVar != null) {
                c1754d.a(new C1753c(null, R.id.accessibilityActionPageUp, aVar.a, null));
            }
            Object g7 = m3.g(P0.l.f4464A);
            if (g7 == null) {
                g7 = null;
            }
            P0.a aVar2 = (P0.a) g7;
            if (aVar2 != null) {
                c1754d.a(new C1753c(null, R.id.accessibilityActionPageDown, aVar2.a, null));
            }
            Object g8 = m3.g(P0.l.f4491z);
            if (g8 == null) {
                g8 = null;
            }
            P0.a aVar3 = (P0.a) g8;
            if (aVar3 != null) {
                c1754d.a(new C1753c(null, R.id.accessibilityActionPageLeft, aVar3.a, null));
            }
            Object g9 = m3.g(P0.l.f4465B);
            if (g9 == null) {
                g9 = null;
            }
            P0.a aVar4 = (P0.a) g9;
            if (aVar4 != null) {
                c1754d.a(new C1753c(null, R.id.accessibilityActionPageRight, aVar4.a, null));
            }
        }
    }

    public static final boolean e(Object obj) {
        if (obj instanceof InterfaceC0994q) {
            InterfaceC0994q interfaceC0994q = (InterfaceC0994q) obj;
            if (interfaceC0994q.b() == C0602e.f8080g || interfaceC0994q.b() == C0602e.f8083j || interfaceC0994q.b() == C0602e.f8081h) {
                Object value = interfaceC0994q.getValue();
                if (value == null) {
                    return true;
                }
                return e(value);
            }
        } else {
            if ((obj instanceof X3.e) && (obj instanceof Serializable)) {
                return false;
            }
            for (int i6 = 0; i6 < 7; i6++) {
                if (a[i6].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final float f(float[] fArr, int i6, float[] fArr2, int i7) {
        int i8 = i6 * 4;
        return (fArr[i8 + 3] * fArr2[12 + i7]) + (fArr[i8 + 2] * fArr2[8 + i7]) + (fArr[i8 + 1] * fArr2[4 + i7]) + (fArr[i8] * fArr2[i7]);
    }

    public static final boolean g(P0.p pVar) {
        Object g3 = pVar.f4499d.f4492c.g(P0.t.f4516J);
        if (g3 == null) {
            g3 = null;
        }
        R0.a aVar = (R0.a) g3;
        k.M m3 = pVar.f4499d.f4492c;
        Object g6 = m3.g(P0.t.f4546y);
        if (g6 == null) {
            g6 = null;
        }
        P0.i iVar = (P0.i) g6;
        boolean z5 = aVar != null;
        Object g7 = m3.g(P0.t.f4515I);
        if (((Boolean) (g7 != null ? g7 : null)) == null || (iVar != null && iVar.a == 4)) {
            return z5;
        }
        return true;
    }

    public static final String h(P0.p pVar, Resources resources) {
        P0.m mVar = pVar.f4499d;
        P0.m mVar2 = pVar.f4499d;
        Object g3 = mVar.f4492c.g(P0.t.f4523b);
        String str = null;
        if (g3 == null) {
            g3 = null;
        }
        k.M m3 = mVar2.f4492c;
        Object g6 = m3.g(P0.t.f4516J);
        if (g6 == null) {
            g6 = null;
        }
        R0.a aVar = (R0.a) g6;
        Object g7 = m3.g(P0.t.f4546y);
        if (g7 == null) {
            g7 = null;
        }
        P0.i iVar = (P0.i) g7;
        if (aVar != null) {
            int ordinal = aVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        throw new RuntimeException();
                    }
                    if (g3 == null) {
                        g3 = resources.getString(com.tencent.mmkv.R.string.indeterminate);
                    }
                } else if (iVar != null && iVar.a == 2 && g3 == null) {
                    g3 = resources.getString(com.tencent.mmkv.R.string.state_off);
                }
            } else if (iVar != null && iVar.a == 2 && g3 == null) {
                g3 = resources.getString(com.tencent.mmkv.R.string.state_on);
            }
        }
        Object g8 = m3.g(P0.t.f4515I);
        if (g8 == null) {
            g8 = null;
        }
        Boolean bool = (Boolean) g8;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if ((iVar == null || iVar.a != 4) && g3 == null) {
                g3 = booleanValue ? resources.getString(com.tencent.mmkv.R.string.selected) : resources.getString(com.tencent.mmkv.R.string.not_selected);
            }
        }
        Object g9 = m3.g(P0.t.f4524c);
        if (g9 == null) {
            g9 = null;
        }
        P0.h hVar = (P0.h) g9;
        if (hVar != null) {
            if (hVar != P0.h.f4438d) {
                if (g3 == null) {
                    r4.d dVar = hVar.f4439b;
                    float f6 = dVar.f14678b;
                    float f7 = dVar.a;
                    float f8 = f6 - f7 == S.l.f7374V ? 0.0f : (hVar.a - f7) / (dVar.f14678b - f7);
                    if (f8 < S.l.f7374V) {
                        f8 = 0.0f;
                    }
                    if (f8 > 1.0f) {
                        f8 = 1.0f;
                    }
                    g3 = resources.getString(com.tencent.mmkv.R.string.template_percent, Integer.valueOf(f8 == S.l.f7374V ? 0 : f8 == 1.0f ? 100 : AbstractC1117a.f(Math.round(f8 * 100), 1, 99)));
                }
            } else if (g3 == null) {
                g3 = resources.getString(com.tencent.mmkv.R.string.in_progress);
            }
        }
        P0.w wVar = P0.t.f4512F;
        if (m3.c(wVar)) {
            k.M m5 = new P0.p(pVar.a, true, pVar.f4498c, mVar2).k().f4492c;
            Object g10 = m5.g(P0.t.a);
            if (g10 == null) {
                g10 = null;
            }
            Collection collection = (Collection) g10;
            if (collection == null || collection.isEmpty()) {
                Object g11 = m5.g(P0.t.f4508B);
                if (g11 == null) {
                    g11 = null;
                }
                Collection collection2 = (Collection) g11;
                if (collection2 == null || collection2.isEmpty()) {
                    Object g12 = m5.g(wVar);
                    if (g12 == null) {
                        g12 = null;
                    }
                    CharSequence charSequence = (CharSequence) g12;
                    if (charSequence == null || charSequence.length() == 0) {
                        str = resources.getString(com.tencent.mmkv.R.string.state_empty);
                    }
                }
            }
            g3 = str;
        }
        return (String) g3;
    }

    public static final C0545g i(P0.p pVar) {
        P0.m mVar = pVar.f4499d;
        P0.w wVar = P0.t.a;
        C0545g c0545g = (C0545g) P0.s.d(mVar, P0.t.f4512F);
        List list = (List) P0.s.d(pVar.f4499d, P0.t.f4508B);
        return c0545g == null ? list != null ? (C0545g) Y3.m.q0(list) : null : c0545g;
    }

    public static boolean j() {
        try {
            if (ViewTreeObserverOnGlobalLayoutListenerC0216x.f2401N0 == null) {
                ViewTreeObserverOnGlobalLayoutListenerC0216x.f2401N0 = Class.forName("android.os.SystemProperties");
            }
            if (ViewTreeObserverOnGlobalLayoutListenerC0216x.f2402O0 == null) {
                Class cls = ViewTreeObserverOnGlobalLayoutListenerC0216x.f2401N0;
                ViewTreeObserverOnGlobalLayoutListenerC0216x.f2402O0 = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
            }
            Method method = ViewTreeObserverOnGlobalLayoutListenerC0216x.f2402O0;
            Object invoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
            return AbstractC1276k.b(invoke instanceof Boolean ? (Boolean) invoke : null, Boolean.TRUE);
        } catch (Exception unused) {
            return false;
        }
    }

    public static final S0.L k(P0.m mVar) {
        l4.c cVar;
        ArrayList arrayList = new ArrayList();
        Object g3 = mVar.f4492c.g(P0.l.a);
        if (g3 == null) {
            g3 = null;
        }
        P0.a aVar = (P0.a) g3;
        if (aVar == null || (cVar = (l4.c) aVar.f4430b) == null || !((Boolean) cVar.f(arrayList)).booleanValue()) {
            return null;
        }
        return (S0.L) arrayList.get(0);
    }

    public static final boolean l(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f6 = fArr[0];
        float f7 = fArr[1];
        float f8 = fArr[2];
        float f9 = fArr[3];
        float f10 = fArr[4];
        float f11 = fArr[5];
        float f12 = fArr[6];
        float f13 = fArr[7];
        float f14 = fArr[8];
        float f15 = fArr[9];
        float f16 = fArr[10];
        float f17 = fArr[11];
        float f18 = fArr[12];
        float f19 = fArr[13];
        float f20 = fArr[14];
        float f21 = fArr[15];
        float f22 = (f6 * f11) - (f7 * f10);
        float f23 = (f6 * f12) - (f8 * f10);
        float f24 = (f6 * f13) - (f9 * f10);
        float f25 = (f7 * f12) - (f8 * f11);
        float f26 = (f7 * f13) - (f9 * f11);
        float f27 = (f8 * f13) - (f9 * f12);
        float f28 = (f14 * f19) - (f15 * f18);
        float f29 = (f14 * f20) - (f16 * f18);
        float f30 = (f14 * f21) - (f17 * f18);
        float f31 = (f15 * f20) - (f16 * f19);
        float f32 = (f15 * f21) - (f17 * f19);
        float f33 = (f16 * f21) - (f17 * f20);
        float f34 = (f27 * f28) + (((f25 * f30) + ((f24 * f31) + ((f22 * f33) - (f23 * f32)))) - (f26 * f29));
        if (f34 != S.l.f7374V) {
            float f35 = 1.0f / f34;
            fArr2[0] = ((f13 * f31) + ((f11 * f33) - (f12 * f32))) * f35;
            fArr2[1] = (((f8 * f32) + ((-f7) * f33)) - (f9 * f31)) * f35;
            fArr2[2] = ((f21 * f25) + ((f19 * f27) - (f20 * f26))) * f35;
            fArr2[3] = (((f16 * f26) + ((-f15) * f27)) - (f17 * f25)) * f35;
            float f36 = -f10;
            fArr2[4] = (((f12 * f30) + (f36 * f33)) - (f13 * f29)) * f35;
            fArr2[5] = ((f9 * f29) + ((f33 * f6) - (f8 * f30))) * f35;
            float f37 = -f18;
            fArr2[6] = (((f20 * f24) + (f37 * f27)) - (f21 * f23)) * f35;
            fArr2[7] = ((f17 * f23) + ((f27 * f14) - (f16 * f24))) * f35;
            fArr2[8] = ((f13 * f28) + ((f10 * f32) - (f11 * f30))) * f35;
            fArr2[9] = (((f30 * f7) + ((-f6) * f32)) - (f9 * f28)) * f35;
            fArr2[10] = ((f21 * f22) + ((f18 * f26) - (f19 * f24))) * f35;
            fArr2[11] = (((f24 * f15) + ((-f14) * f26)) - (f17 * f22)) * f35;
            fArr2[12] = (((f11 * f29) + (f36 * f31)) - (f12 * f28)) * f35;
            fArr2[13] = ((f8 * f28) + ((f6 * f31) - (f7 * f29))) * f35;
            fArr2[14] = (((f19 * f23) + (f37 * f25)) - (f20 * f22)) * f35;
            fArr2[15] = ((f16 * f22) + ((f14 * f25) - (f15 * f23))) * f35;
        }
        return !(f34 == S.l.f7374V);
    }

    public static final boolean m(float f6, float f7, C1397h c1397h) {
        float f8 = f6 - 0.005f;
        float f9 = f7 - 0.005f;
        float f10 = f6 + 0.005f;
        float f11 = f7 + 0.005f;
        C1397h a6 = AbstractC1399j.a();
        if (Float.isNaN(f8) || Float.isNaN(f9) || Float.isNaN(f10) || Float.isNaN(f11)) {
            AbstractC1399j.b("Invalid rectangle, make sure no value is NaN");
        }
        if (a6.f13465b == null) {
            a6.f13465b = new RectF();
        }
        RectF rectF = a6.f13465b;
        AbstractC1276k.c(rectF);
        rectF.set(f8, f9, f10, f11);
        Path path = a6.a;
        RectF rectF2 = a6.f13465b;
        AbstractC1276k.c(rectF2);
        path.addRect(rectF2, Path.Direction.CCW);
        C1397h a7 = AbstractC1399j.a();
        a7.d(c1397h, a6, 1);
        boolean isEmpty = a7.a.isEmpty();
        a7.e();
        a6.e();
        return !isEmpty;
    }

    public static final boolean n(float f6, float f7, float f8, float f9, long j3) {
        float f10 = f6 - f8;
        float f11 = f7 - f9;
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        return ((f11 * f11) / (intBitsToFloat2 * intBitsToFloat2)) + ((f10 * f10) / (intBitsToFloat * intBitsToFloat)) <= 1.0f;
    }

    public static final void o(float[] fArr, float[] fArr2) {
        float f6 = f(fArr2, 0, fArr, 0);
        float f7 = f(fArr2, 0, fArr, 1);
        float f8 = f(fArr2, 0, fArr, 2);
        float f9 = f(fArr2, 0, fArr, 3);
        float f10 = f(fArr2, 1, fArr, 0);
        float f11 = f(fArr2, 1, fArr, 1);
        float f12 = f(fArr2, 1, fArr, 2);
        float f13 = f(fArr2, 1, fArr, 3);
        float f14 = f(fArr2, 2, fArr, 0);
        float f15 = f(fArr2, 2, fArr, 1);
        float f16 = f(fArr2, 2, fArr, 2);
        float f17 = f(fArr2, 2, fArr, 3);
        float f18 = f(fArr2, 3, fArr, 0);
        float f19 = f(fArr2, 3, fArr, 1);
        float f20 = f(fArr2, 3, fArr, 2);
        float f21 = f(fArr2, 3, fArr, 3);
        fArr[0] = f6;
        fArr[1] = f7;
        fArr[2] = f8;
        fArr[3] = f9;
        fArr[4] = f10;
        fArr[5] = f11;
        fArr[6] = f12;
        fArr[7] = f13;
        fArr[8] = f14;
        fArr[9] = f15;
        fArr[10] = f16;
        fArr[11] = f17;
        fArr[12] = f18;
        fArr[13] = f19;
        fArr[14] = f20;
        fArr[15] = f21;
    }

    public static final h1.i p(C0176c0 c0176c0, int i6) {
        Object obj;
        Iterator<T> it = c0176c0.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((H0.J) ((Map.Entry) obj).getKey()).f1734e == i6) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            return (h1.i) entry.getValue();
        }
        return null;
    }

    public static final String q(Object obj) {
        return (obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName()) + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    public static final String r(int i6) {
        if (i6 == 0) {
            return "android.widget.Button";
        }
        if (i6 == 1) {
            return "android.widget.CheckBox";
        }
        if (i6 == 3) {
            return "android.widget.RadioButton";
        }
        if (i6 == 5) {
            return "android.widget.ImageView";
        }
        if (i6 == 6) {
            return "android.widget.Spinner";
        }
        if (i6 == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }
}
