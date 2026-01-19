package i4;

import B0.H;
import Y3.v;
import Y3.w;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import b.AbstractC0863g;
import com.tencent.mmkv.R;
import e.C0954b;
import e1.f;
import e1.m;
import h0.C1032i;
import io.ktor.utils.io.t;
import io.ktor.utils.io.y;
import j1.AbstractC1135a;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k.C1147A;
import m4.AbstractC1276k;
import m4.InterfaceC1269d;
import n0.C1354c;
import r4.g;
import s4.InterfaceC1672b;
import t1.AbstractC1713p;
import t1.C1712o;
import u4.AbstractC1766d;
import y.U;
import z.C2009g;
import z.r;

/* renamed from: i4.a */
/* loaded from: classes.dex */
public abstract class AbstractC1117a {
    public static boolean a = false;

    /* renamed from: b */
    public static Method f12084b;

    public static final C1354c a(long j3, long j4) {
        int i6 = (int) (j3 >> 32);
        int i7 = (int) (j3 & 4294967295L);
        return new C1354c(Float.intBitsToFloat(i6), Float.intBitsToFloat(i7), Float.intBitsToFloat((int) (j4 >> 32)) + Float.intBitsToFloat(i6), Float.intBitsToFloat((int) (j4 & 4294967295L)) + Float.intBitsToFloat(i7));
    }

    public static final void b(int i6, String str) {
        if (str.charAt(i6) == '-') {
            return;
        }
        StringBuilder k3 = AbstractC1135a.k("Expected '-' (hyphen) at index ", i6, ", but was '");
        k3.append(str.charAt(i6));
        k3.append('\'');
        throw new IllegalArgumentException(k3.toString().toString());
    }

    public static Comparable c(f fVar, f fVar2) {
        return fVar.compareTo(fVar2) < 0 ? fVar2 : fVar;
    }

    public static double d(double d6, double d7, double d8) {
        if (d7 <= d8) {
            return d6 < d7 ? d7 : d6 > d8 ? d8 : d6;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d8 + " is less than minimum " + d7 + '.');
    }

    public static float e(float f6, float f7, float f8) {
        if (f7 <= f8) {
            return f6 < f7 ? f7 : f6 > f8 ? f8 : f6;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f8 + " is less than minimum " + f7 + '.');
    }

    public static int f(int i6, int i7, int i8) {
        if (i7 <= i8) {
            return i6 < i7 ? i7 : i6 > i8 ? i8 : i6;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i8 + " is less than minimum " + i7 + '.');
    }

    public static long g(long j3, long j4, long j5) {
        if (j4 <= j5) {
            return j3 < j4 ? j4 : j3 > j5 ? j5 : j3;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j5 + " is less than minimum " + j4 + '.');
    }

    public static Comparable h(f fVar, f fVar2, f fVar3) {
        if (fVar2.compareTo(fVar3) <= 0) {
            return fVar.compareTo(fVar2) < 0 ? fVar2 : fVar.compareTo(fVar3) > 0 ? fVar3 : fVar;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + fVar3 + " is less than minimum " + fVar2 + '.');
    }

    public static Comparable i(Float f6, r4.d dVar) {
        AbstractC1276k.f(dVar, "range");
        float f7 = dVar.f14678b;
        float f8 = dVar.a;
        if (f8 <= f7) {
            return (!r4.d.a(f6, Float.valueOf(f8)) || r4.d.a(Float.valueOf(f8), f6)) ? (!r4.d.a(Float.valueOf(f7), f6) || r4.d.a(f6, Float.valueOf(f7))) ? f6 : Float.valueOf(f7) : Float.valueOf(f8);
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + dVar + '.');
    }

    public static void j(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        int read = inputStream.read(bArr);
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            read = inputStream.read(bArr);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, t1.o] */
    public static boolean k(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        int i6 = AbstractC1713p.a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = C1712o.f14875d;
        C1712o c1712o = (C1712o) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        C1712o c1712o2 = c1712o;
        if (c1712o == null) {
            Object obj = new Object();
            obj.a = null;
            obj.f14876b = null;
            obj.f14877c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, obj);
            c1712o2 = obj;
        }
        WeakReference weakReference2 = c1712o2.f14877c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        c1712o2.f14877c = new WeakReference(keyEvent);
        if (c1712o2.f14876b == null) {
            c1712o2.f14876b = new SparseArray();
        }
        SparseArray sparseArray = c1712o2.f14876b;
        if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
            sparseArray.removeAt(indexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        r4 = r4.getValue("android:text");
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        r4 = r4.getText();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void l(j0.d r6, android.util.LongSparseArray r7) {
        /*
            int r0 = r7.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L5b
            long r2 = r7.keyAt(r1)
            java.lang.Object r4 = r7.get(r2)
            android.view.translation.ViewTranslationResponse r4 = I0.AbstractC0189j.m(r4)
            if (r4 == 0) goto L58
            android.view.translation.TranslationResponseValue r4 = I0.AbstractC0189j.j(r4)
            if (r4 == 0) goto L58
            java.lang.CharSequence r4 = I0.AbstractC0189j.n(r4)
            if (r4 == 0) goto L58
            k.n r5 = r6.e()
            int r2 = (int) r2
            java.lang.Object r2 = r5.b(r2)
            P0.q r2 = (P0.q) r2
            if (r2 == 0) goto L58
            P0.p r2 = r2.a
            if (r2 == 0) goto L58
            P0.m r2 = r2.f4499d
            P0.w r3 = P0.l.f4477l
            k.M r2 = r2.f4492c
            java.lang.Object r2 = r2.g(r3)
            if (r2 != 0) goto L3f
            r2 = 0
        L3f:
            P0.a r2 = (P0.a) r2
            if (r2 == 0) goto L58
            X3.e r2 = r2.f4430b
            l4.c r2 = (l4.c) r2
            if (r2 == 0) goto L58
            S0.g r3 = new S0.g
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            java.lang.Object r2 = r2.f(r3)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
        L58:
            int r1 = r1 + 1
            goto L5
        L5b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.AbstractC1117a.l(j0.d, android.util.LongSparseArray):void");
    }

    public static final void m(long j3, byte[] bArr, int i6, int i7, int i8) {
        int i9 = 7 - i7;
        int i10 = 8 - i8;
        if (i10 > i9) {
            return;
        }
        while (true) {
            int i11 = AbstractC1766d.a[(int) ((j3 >> (i9 << 3)) & 255)];
            int i12 = i6 + 1;
            bArr[i6] = (byte) (i11 >> 8);
            i6 += 2;
            bArr[i12] = (byte) i11;
            if (i9 == i10) {
                return;
            } else {
                i9--;
            }
        }
    }

    public static final C2009g n(U u5, int i6, long j3, r rVar, long j4, C1032i c1032i, m mVar, int i7, C1147A c1147a) {
        List list;
        Object b5 = rVar.b(i6);
        List list2 = (List) c1147a.b(i6);
        if (list2 != null) {
            list = list2;
        } else {
            List b6 = u5.b(i6);
            int size = b6.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i8 = 0; i8 < size; i8++) {
                arrayList.add(((F0.U) b6.get(i8)).w(j3));
            }
            c1147a.i(i6, arrayList);
            list = arrayList;
        }
        return new C2009g(i6, i7, list, j4, b5, c1032i, mVar);
    }

    public static final Class o(InterfaceC1672b interfaceC1672b) {
        AbstractC1276k.f(interfaceC1672b, "<this>");
        Class a6 = ((InterfaceC1269d) interfaceC1672b).a();
        AbstractC1276k.d(a6, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return a6;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001b. Please report as an issue. */
    public static final Class p(InterfaceC1672b interfaceC1672b) {
        AbstractC1276k.f(interfaceC1672b, "<this>");
        Class a6 = ((InterfaceC1269d) interfaceC1672b).a();
        if (a6.isPrimitive()) {
            String name = a6.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return a6;
    }

    public static Object q(String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 34) {
            return AbstractC0863g.b(str, bundle);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (C0954b.class.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static /* synthetic */ Object t(y yVar, d4.c cVar) {
        return ((t) yVar).A(Long.MAX_VALUE, cVar);
    }

    public static r4.e u(g gVar, int i6) {
        AbstractC1276k.f(gVar, "<this>");
        boolean z5 = i6 > 0;
        Integer valueOf = Integer.valueOf(i6);
        if (!z5) {
            throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
        }
        int i7 = gVar.f14679c;
        int i8 = gVar.f14680e;
        if (gVar.f14681f <= 0) {
            i6 = -i6;
        }
        return new r4.e(i7, i8, i6);
    }

    public static final List v(ArrayList arrayList) {
        int size = arrayList.size();
        return size != 0 ? size != 1 ? Collections.unmodifiableList(new ArrayList(arrayList)) : Collections.singletonList(Y3.m.o0(arrayList)) : v.f9812c;
    }

    public static final Map w(Map map) {
        int size = map.size();
        if (size == 0) {
            return w.f9813c;
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) Y3.m.n0(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    public static final X3.r x(String str) {
        int i6;
        AbstractC1120d.g(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i7 = 0;
        char charAt = str.charAt(0);
        if (AbstractC1276k.g(charAt, 48) < 0) {
            i6 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        } else {
            i6 = 0;
        }
        int i8 = 119304647;
        while (i6 < length) {
            int digit = Character.digit((int) str.charAt(i6), 10);
            if (digit < 0) {
                return null;
            }
            if (Integer.compareUnsigned(i7, i8) > 0) {
                if (i8 != 119304647) {
                    return null;
                }
                i8 = Integer.divideUnsigned(-1, 10);
                if (Integer.compareUnsigned(i7, i8) > 0) {
                    return null;
                }
            }
            int i9 = i7 * 10;
            int i10 = digit + i9;
            if (Integer.compareUnsigned(i10, i9) < 0) {
                return null;
            }
            i6++;
            i7 = i10;
        }
        return new X3.r(i7);
    }

    public static final X3.t y(String str) {
        AbstractC1276k.f(str, "<this>");
        AbstractC1120d.g(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i6 = 0;
        char charAt = str.charAt(0);
        if (AbstractC1276k.g(charAt, 48) < 0) {
            i6 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        }
        long j3 = 10;
        long j4 = 0;
        long j5 = 512409557603043100L;
        while (i6 < length) {
            int digit = Character.digit((int) str.charAt(i6), 10);
            if (digit < 0) {
                return null;
            }
            if (Long.compareUnsigned(j4, j5) > 0) {
                if (j5 != 512409557603043100L) {
                    return null;
                }
                j5 = Long.divideUnsigned(-1L, j3);
                if (Long.compareUnsigned(j4, j5) > 0) {
                    return null;
                }
            }
            long j6 = j4 * j3;
            long j7 = (digit & 4294967295L) + j6;
            if (Long.compareUnsigned(j7, j6) < 0) {
                return null;
            }
            i6++;
            j4 = j7;
        }
        return new X3.t(j4);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [r4.e, r4.g] */
    public static g z(int i6, int i7) {
        if (i7 > Integer.MIN_VALUE) {
            return new r4.e(i6, i7 - 1, 1);
        }
        g gVar = g.f14686g;
        return g.f14686g;
    }

    public abstract void r(Throwable th);

    public abstract void s(H h3);
}
