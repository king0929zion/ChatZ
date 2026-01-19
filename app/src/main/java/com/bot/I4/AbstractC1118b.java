package i4;

import S.l;
import X3.i;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Size;
import android.util.SizeF;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.EditorInfo;
import io.ktor.utils.io.t;
import io.ktor.utils.io.y;
import j1.AbstractFutureC1142h;
import j1.C1138d;
import j1.C1141g;
import java.io.Closeable;
import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import m4.AbstractC1276k;
import n0.C1355d;
import o4.AbstractC1410a;
import r.X0;
import u0.C1746g;
import v1.AbstractC1822a;
import z.C2004b;
import z.E;
import z3.C2042l;

/* renamed from: i4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1118b {
    public static C1746g a;

    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(h0.InterfaceC1041r r16, x.s r17, v.InterfaceC1802i0 r18, v.InterfaceC1797g r19, h0.InterfaceC1027d r20, r.InterfaceC1619x0 r21, boolean r22, p.C1459u r23, l4.c r24, T.C0626q r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.AbstractC1118b.a(h0.r, x.s, v.i0, v.g, h0.d, r.x0, boolean, p.u, l4.c, T.q, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(h0.InterfaceC1041r r18, x.s r19, v.InterfaceC1802i0 r20, v.InterfaceC1793e r21, h0.C1032i r22, r.InterfaceC1619x0 r23, boolean r24, p.C1459u r25, l4.c r26, T.C0626q r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.AbstractC1118b.b(h0.r, x.s, v.i0, v.e, h0.i, r.x0, boolean, p.u, l4.c, T.q, int, int):void");
    }

    public static final C1355d c(float f6, float f7, float f8, float f9, long j3) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(intBitsToFloat2));
        return new C1355d(f6, f7, f8, f9, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits);
    }

    public static final Bundle d(i... iVarArr) {
        Bundle bundle = new Bundle(iVarArr.length);
        for (i iVar : iVarArr) {
            String str = (String) iVar.f9393c;
            Object obj = iVar.f9394e;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                AbstractC1276k.c(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static final void h(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                X3.a.a(th, th2);
            }
        }
    }

    public static final Object i(y yVar, t tVar, C2042l c2042l) {
        if (yVar != tVar) {
            return yVar instanceof t ? tVar.j((t) yVar, Long.MAX_VALUE, c2042l) : j(yVar, tVar, Long.MAX_VALUE, c2042l);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1 A[Catch: all -> 0x003e, TryCatch #2 {all -> 0x003e, blocks: (B:12:0x0038, B:14:0x00df, B:16:0x00e3, B:18:0x00ec, B:32:0x00a8, B:34:0x00b1, B:36:0x00cf, B:23:0x0101, B:57:0x0055), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r0v17, types: [io.ktor.utils.io.t] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v3, types: [int] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r14v13, types: [io.ktor.utils.io.A] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2, types: [io.ktor.utils.io.z, d4.c] */
    /* JADX WARN: Type inference failed for: r4v3, types: [io.ktor.utils.io.t] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00d9 -> B:14:0x00df). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(io.ktor.utils.io.y r19, io.ktor.utils.io.t r20, long r21, d4.c r23) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.AbstractC1118b.j(io.ktor.utils.io.y, io.ktor.utils.io.t, long, d4.c):java.lang.Object");
    }

    public static final long k(E e6) {
        return AbstractC1410a.L(e6.f16051d.f16173c.g() * e6.o()) + (e6.f16051d.f16172b.g() * e6.o());
    }

    public static final float l(C2004b c2004b) {
        return c2004b.l().f16155e == X0.f14184e ? Float.intBitsToFloat((int) (c2004b.p() >> 32)) : Float.intBitsToFloat((int) (c2004b.p() & 4294967295L));
    }

    public static Set m() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (invoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) invoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static Intent n(Context context, ComponentName componentName) {
        String o5 = o(context, componentName);
        if (o5 == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), o5);
        return o(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String o(Context context, ComponentName componentName) {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static final boolean p(C2004b c2004b, float f6) {
        c2004b.l().getClass();
        return !(((c2004b.q() ? -f6 : l(c2004b)) > l.f7374V ? 1 : ((c2004b.q() ? -f6 : l(c2004b)) == l.f7374V ? 0 : -1)) > 0);
    }

    public static final boolean q(C1355d c1355d) {
        long j3 = c1355d.f13301e;
        return (j3 >>> 32) == (4294967295L & j3) && j3 == c1355d.f13302f && j3 == c1355d.f13303g && j3 == c1355d.f13304h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object t(u3.C1759c r4, d4.c r5) {
        /*
            boolean r0 = r5 instanceof u3.C1761e
            if (r0 == 0) goto L13
            r0 = r5
            u3.e r0 = (u3.C1761e) r0
            int r1 = r0.f15167i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15167i = r1
            goto L18
        L13:
            u3.e r0 = new u3.e
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f15166h
            int r1 = r0.f15167i
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            u3.c r4 = r0.f15165g
            X3.a.e(r5)
            goto L47
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            X3.a.e(r5)
            F3.c r5 = r4.e()
            io.ktor.utils.io.y r5 = r5.d()
            r0.f15165g = r4
            r0.f15167i = r2
            java.lang.Object r5 = i4.AbstractC1117a.t(r5, r0)
            c4.a r0 = c4.EnumC0927a.f11114c
            if (r5 != r0) goto L47
            return r0
        L47:
            U3.d r5 = (U3.d) r5
            byte[] r5 = Y4.d.R(r5)
            u3.f r0 = new u3.f
            t3.d r1 = r4.f15161c
            E3.b r2 = r4.d()
            F3.c r4 = r4.e()
            r0.<init>(r1, r2, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.AbstractC1118b.t(u3.c, d4.c):java.lang.Object");
    }

    public static void u(Window window, boolean z5) {
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 35) {
            L0.c.d(window, z5);
        } else {
            if (i6 >= 30) {
                L0.c.c(window, z5);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z5 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public static void v(EditorInfo editorInfo, CharSequence charSequence) {
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 30) {
            L0.c.f(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        if (i6 >= 30) {
            L0.c.f(editorInfo, charSequence);
            return;
        }
        int i7 = editorInfo.initialSelStart;
        int i8 = editorInfo.initialSelEnd;
        int i9 = i7 > i8 ? i8 : i7;
        if (i7 <= i8) {
            i7 = i8;
        }
        int length = charSequence.length();
        if (i9 < 0 || i7 > length) {
            x(editorInfo, null, 0, 0);
            return;
        }
        int i10 = editorInfo.inputType & 4095;
        if (i10 == 129 || i10 == 225 || i10 == 18) {
            x(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            x(editorInfo, charSequence, i9, i7);
            return;
        }
        int i11 = i7 - i9;
        int i12 = i11 > 1024 ? 0 : i11;
        int i13 = 2048 - i12;
        int min = Math.min(charSequence.length() - i7, i13 - Math.min(i9, (int) (i13 * 0.8d)));
        int min2 = Math.min(i9, i13 - min);
        int i14 = i9 - min2;
        if (Character.isLowSurrogate(charSequence.charAt(i14))) {
            i14++;
            min2--;
        }
        if (Character.isHighSurrogate(charSequence.charAt((i7 + min) - 1))) {
            min--;
        }
        int i15 = min2 + i12;
        x(editorInfo, i12 != i11 ? TextUtils.concat(charSequence.subSequence(i14, i14 + min2), charSequence.subSequence(i7, min + i7)) : charSequence.subSequence(i14, i15 + min + i14), min2, i15);
    }

    public static void w(EditorInfo editorInfo, boolean z5) {
        if (Build.VERSION.SDK_INT >= 35) {
            AbstractC1822a.a(editorInfo, z5);
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", z5);
    }

    public static void x(EditorInfo editorInfo, CharSequence charSequence, int i6, int i7) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i6);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i7);
    }

    public abstract boolean e(AbstractFutureC1142h abstractFutureC1142h, C1138d c1138d);

    public abstract boolean f(AbstractFutureC1142h abstractFutureC1142h, Object obj, Object obj2);

    public abstract boolean g(AbstractFutureC1142h abstractFutureC1142h, C1141g c1141g, C1141g c1141g2);

    public abstract void r(C1141g c1141g, C1141g c1141g2);

    public abstract void s(C1141g c1141g, Thread thread);
}
