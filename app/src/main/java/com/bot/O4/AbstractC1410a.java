package o4;

import A3.c;
import B0.AbstractC0047x;
import B0.C0027c;
import B0.C0028d;
import B0.y;
import C0.b;
import E3.d;
import F1.e;
import F2.h;
import H0.AbstractC0156k;
import H0.AbstractC0157l;
import H0.C0149f0;
import H0.InterfaceC0155j;
import H0.J;
import I1.A;
import I1.B;
import I2.x;
import I3.D;
import I3.w;
import J1.r;
import M4.AbstractC0252a0;
import M4.C0255c;
import M4.E;
import M4.S;
import M4.h0;
import M4.i0;
import M4.o0;
import N4.j;
import O.C0316k;
import S.l;
import T.AbstractC0629s;
import T.AbstractC0633u;
import T.C0;
import T.C0594a;
import T.C0616l;
import T.C0620n;
import T.I0;
import T.M0;
import U.M;
import X3.i;
import X3.o;
import Y3.C;
import Y3.k;
import Y3.m;
import Y3.n;
import Y3.v;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import androidx.lifecycle.U;
import c2.AbstractC0923a;
import c4.EnumC0927a;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.parser.PegdownExtensions;
import com.vladsch.flexmark.util.format.TableCell;
import com.vladsch.flexmark.util.html.Attribute;
import f1.AbstractC1005b;
import f1.InterfaceC1004a;
import h0.AbstractC1040q;
import i0.C1066e;
import i0.InterfaceC1075n;
import i4.AbstractC1117a;
import i4.AbstractC1121e;
import j1.AbstractC1135a;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import k.C1147A;
import k.I;
import kotlinx.serialization.KSerializer;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import m4.AbstractC1289x;
import m4.C1270e;
import n0.C1353b;
import n0.C1354c;
import org.json.JSONArray;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import s4.InterfaceC1672b;
import s4.f;
import u4.AbstractC1763a;
import u4.AbstractC1776n;
import u4.u;

/* renamed from: o4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1410a {
    public static final /* synthetic */ int a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f13515b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static long f13516c;

    /* renamed from: d, reason: collision with root package name */
    public static Method f13517d;

    public static final KSerializer A(InterfaceC1672b interfaceC1672b, ArrayList arrayList, InterfaceC1193a interfaceC1193a) {
        KSerializer c0255c;
        KSerializer i0Var;
        AbstractC1276k.f(interfaceC1672b, "<this>");
        if (interfaceC1672b.equals(AbstractC1289x.a(Collection.class)) || interfaceC1672b.equals(AbstractC1289x.a(List.class)) || interfaceC1672b.equals(AbstractC1289x.a(List.class)) || interfaceC1672b.equals(AbstractC1289x.a(ArrayList.class))) {
            c0255c = new C0255c((KSerializer) arrayList.get(0), 0);
        } else if (interfaceC1672b.equals(AbstractC1289x.a(HashSet.class))) {
            c0255c = new C0255c((KSerializer) arrayList.get(0), 1);
        } else if (interfaceC1672b.equals(AbstractC1289x.a(Set.class)) || interfaceC1672b.equals(AbstractC1289x.a(Set.class)) || interfaceC1672b.equals(AbstractC1289x.a(LinkedHashSet.class))) {
            c0255c = new C0255c((KSerializer) arrayList.get(0), 2);
        } else if (interfaceC1672b.equals(AbstractC1289x.a(HashMap.class))) {
            c0255c = new E((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1), 0);
        } else if (interfaceC1672b.equals(AbstractC1289x.a(Map.class)) || interfaceC1672b.equals(AbstractC1289x.a(Map.class)) || interfaceC1672b.equals(AbstractC1289x.a(LinkedHashMap.class))) {
            c0255c = new E((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1), 1);
        } else {
            if (interfaceC1672b.equals(AbstractC1289x.a(Map.Entry.class))) {
                KSerializer kSerializer = (KSerializer) arrayList.get(0);
                KSerializer kSerializer2 = (KSerializer) arrayList.get(1);
                AbstractC1276k.f(kSerializer, "keySerializer");
                AbstractC1276k.f(kSerializer2, "valueSerializer");
                i0Var = new S(kSerializer, kSerializer2, 0);
            } else if (interfaceC1672b.equals(AbstractC1289x.a(i.class))) {
                KSerializer kSerializer3 = (KSerializer) arrayList.get(0);
                KSerializer kSerializer4 = (KSerializer) arrayList.get(1);
                AbstractC1276k.f(kSerializer3, "keySerializer");
                AbstractC1276k.f(kSerializer4, "valueSerializer");
                i0Var = new S(kSerializer3, kSerializer4, 1);
            } else if (interfaceC1672b.equals(AbstractC1289x.a(o.class))) {
                KSerializer kSerializer5 = (KSerializer) arrayList.get(0);
                KSerializer kSerializer6 = (KSerializer) arrayList.get(1);
                KSerializer kSerializer7 = (KSerializer) arrayList.get(2);
                AbstractC1276k.f(kSerializer5, "aSerializer");
                AbstractC1276k.f(kSerializer6, "bSerializer");
                AbstractC1276k.f(kSerializer7, "cSerializer");
                c0255c = new o0(kSerializer5, kSerializer6, kSerializer7);
            } else if (AbstractC1117a.o(interfaceC1672b).isArray()) {
                Object b5 = interfaceC1193a.b();
                AbstractC1276k.d(b5, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                KSerializer kSerializer8 = (KSerializer) arrayList.get(0);
                AbstractC1276k.f(kSerializer8, "elementSerializer");
                i0Var = new i0((InterfaceC1672b) b5, kSerializer8);
            } else {
                c0255c = null;
            }
            c0255c = i0Var;
        }
        if (c0255c != null) {
            return c0255c;
        }
        KSerializer[] kSerializerArr = (KSerializer[]) arrayList.toArray(new KSerializer[0]);
        return AbstractC0252a0.d(interfaceC1672b, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
    }

    public static C0316k B(String str) {
        int i6;
        String str2;
        AbstractC1276k.f(str, "statusLine");
        boolean D4 = u.D(str, "HTTP/1.", false);
        Q4.u uVar = Q4.u.HTTP_1_0;
        if (D4) {
            i6 = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt != 0) {
                if (charAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                uVar = Q4.u.HTTP_1_1;
            }
        } else {
            if (!u.D(str, "ICY ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i6 = 4;
        }
        int i7 = i6 + 3;
        if (str.length() < i7) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            String substring = str.substring(i6, i7);
            AbstractC1276k.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            int parseInt = Integer.parseInt(substring);
            if (str.length() <= i7) {
                str2 = FlexmarkHtmlConverter.DEFAULT_NODE;
            } else {
                if (str.charAt(i7) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                str2 = str.substring(i6 + 4);
                AbstractC1276k.e(str2, "this as java.lang.String).substring(startIndex)");
            }
            return new C0316k(uVar, parseInt, str2);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public static final void C(float[] fArr, float[] fArr2, int i6, float[] fArr3) {
        if (i6 == 0) {
            E0.a.a("At least one point must be provided");
        }
        int i7 = 2 >= i6 ? i6 - 1 : 2;
        int i8 = i7 + 1;
        float[][] fArr4 = new float[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            fArr4[i9] = new float[i6];
        }
        for (int i10 = 0; i10 < i6; i10++) {
            fArr4[0][i10] = 1.0f;
            for (int i11 = 1; i11 < i8; i11++) {
                fArr4[i11][i10] = fArr4[i11 - 1][i10] * fArr[i10];
            }
        }
        float[][] fArr5 = new float[i8];
        for (int i12 = 0; i12 < i8; i12++) {
            fArr5[i12] = new float[i6];
        }
        float[][] fArr6 = new float[i8];
        for (int i13 = 0; i13 < i8; i13++) {
            fArr6[i13] = new float[i8];
        }
        int i14 = 0;
        while (i14 < i8) {
            float[] fArr7 = fArr5[i14];
            float[] fArr8 = fArr4[i14];
            AbstractC1276k.f(fArr8, "<this>");
            AbstractC1276k.f(fArr7, "destination");
            System.arraycopy(fArr8, 0, fArr7, 0, i6);
            for (int i15 = 0; i15 < i14; i15++) {
                float[] fArr9 = fArr5[i15];
                float o5 = o(fArr7, fArr9);
                for (int i16 = 0; i16 < i6; i16++) {
                    fArr7[i16] = fArr7[i16] - (fArr9[i16] * o5);
                }
            }
            float sqrt = (float) Math.sqrt(o(fArr7, fArr7));
            if (sqrt < 1.0E-6f) {
                sqrt = 1.0E-6f;
            }
            float f6 = 1.0f / sqrt;
            for (int i17 = 0; i17 < i6; i17++) {
                fArr7[i17] = fArr7[i17] * f6;
            }
            float[] fArr10 = fArr6[i14];
            int i18 = 0;
            while (i18 < i8) {
                fArr10[i18] = i18 < i14 ? l.f7374V : o(fArr7, fArr4[i18]);
                i18++;
            }
            i14++;
        }
        for (int i19 = i7; -1 < i19; i19--) {
            float o6 = o(fArr5[i19], fArr2);
            float[] fArr11 = fArr6[i19];
            int i20 = i19 + 1;
            if (i20 <= i7) {
                int i21 = i7;
                while (true) {
                    o6 -= fArr11[i21] * fArr3[i21];
                    if (i21 != i20) {
                        i21--;
                    }
                }
            }
            fArr3[i19] = o6 / fArr11[i19];
        }
    }

    public static final void D(e eVar, String str, String str2) {
        AbstractC1276k.f(eVar, "<this>");
        eVar.e(str, j.a(str2));
    }

    public static final void E(String str, Bundle bundle) {
        AbstractC1276k.f(str, "key");
        bundle.putString(str, null);
    }

    public static final void F(Bundle bundle, String str, Bundle bundle2) {
        AbstractC1276k.f(str, "key");
        AbstractC1276k.f(bundle2, "value");
        bundle.putBundle(str, bundle2);
    }

    public static final void G(String str, String str2, Bundle bundle) {
        AbstractC1276k.f(str, "key");
        AbstractC1276k.f(str2, "value");
        bundle.putString(str, str2);
    }

    public static final void H(Bundle bundle, String str, List list) {
        bundle.putStringArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
    }

    public static final void I(U3.a aVar, ByteBuffer byteBuffer, int i6) {
        AbstractC1276k.f(aVar, "<this>");
        ByteBuffer byteBuffer2 = aVar.a;
        int i7 = aVar.f8662b;
        if (aVar.f8663c - i7 < i6) {
            throw new EOFException("Not enough bytes to read a buffer content of size " + i6 + '.');
        }
        int limit = byteBuffer.limit();
        try {
            byteBuffer.limit(byteBuffer.position() + i6);
            C.j(byteBuffer2, byteBuffer, i7);
            byteBuffer.limit(limit);
            aVar.c(i6);
        } catch (Throwable th) {
            byteBuffer.limit(limit);
            throw th;
        }
    }

    public static int J(double d6) {
        if (Double.isNaN(d6)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d6 > 2.147483647E9d) {
            return TableCell.NOT_TRACKED;
        }
        if (d6 < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d6);
    }

    public static int K(float f6) {
        if (Float.isNaN(f6)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f6);
    }

    public static long L(double d6) {
        if (Double.isNaN(d6)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d6);
    }

    public static final KSerializer M(C1270e c1270e) {
        AbstractC1276k.f(c1270e, "<this>");
        KSerializer O5 = O(c1270e);
        if (O5 != null) {
            return O5;
        }
        AbstractC0252a0.i(c1270e);
        throw null;
    }

    public static final KSerializer N(h hVar, f fVar) {
        AbstractC1276k.f(hVar, "<this>");
        AbstractC1276k.f(fVar, "type");
        return s4.j.I(hVar, fVar, false);
    }

    public static final KSerializer O(InterfaceC1672b interfaceC1672b) {
        AbstractC1276k.f(interfaceC1672b, "<this>");
        KSerializer d6 = AbstractC0252a0.d(interfaceC1672b, new KSerializer[0]);
        return d6 == null ? (KSerializer) h0.a.get(interfaceC1672b) : d6;
    }

    public static final ArrayList P(h hVar, List list, boolean z5) {
        AbstractC1276k.f(hVar, "<this>");
        AbstractC1276k.f(list, "typeArguments");
        if (!z5) {
            ArrayList arrayList = new ArrayList(n.Z(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                KSerializer N5 = N(hVar, (f) it.next());
                if (N5 == null) {
                    return null;
                }
                arrayList.add(N5);
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(n.Z(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            f fVar = (f) it2.next();
            AbstractC1276k.f(fVar, "type");
            KSerializer I5 = s4.j.I(hVar, fVar, true);
            if (I5 == null) {
                InterfaceC1672b h3 = AbstractC0252a0.h(fVar);
                AbstractC1276k.f(h3, "<this>");
                AbstractC0252a0.i(h3);
                throw null;
            }
            arrayList2.add(I5);
        }
        return arrayList2;
    }

    public static final void Q(M m3, int i6, Object obj) {
        m3.f8554g[(m3.f8555h - m3.f8550c[m3.f8551d - 1].f8545b) + i6] = obj;
    }

    public static final void R(M m3, int i6, Object obj, int i7, Object obj2) {
        int i8 = m3.f8555h - m3.f8550c[m3.f8551d - 1].f8545b;
        Object[] objArr = m3.f8554g;
        objArr[i6 + i8] = obj;
        objArr[i8 + i7] = obj2;
    }

    public static final long S(long j3) {
        return (Float.floatToRawIntBits((int) (j3 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j3 >> 32)) << 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [g0.j, N3.s] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public static final ArrayList T(I0 i02, int i6, Integer num) {
        g0.j jVar = new g0.j(i02);
        int q3 = i02.q(i6);
        C0594a a6 = i02.a(i6);
        while (i6 >= 0) {
            jVar.m(i02.i(i6), i02.k(i6) ? i02.p(i02.f7953b, i6) : C0616l.a, i02.a.f(i6), num);
            if (q3 >= 0) {
                C0594a c0594a = a6;
                a6 = i02.a(q3);
                i6 = q3;
                q3 = i02.q(q3);
                num = c0594a;
            } else {
                i6 = q3;
                num = a6;
            }
        }
        return (ArrayList) jVar.a;
    }

    public static final void U(d dVar, String str) {
        AbstractC1276k.f(str, "urlString");
        D.b(dVar.a, str);
    }

    public static final C1066e a(String str) {
        return new C1066e(h5.e.i0(str));
    }

    public static final e1.e b(Context context) {
        float f6 = context.getResources().getConfiguration().fontScale;
        float f7 = context.getResources().getDisplayMetrics().density;
        InterfaceC1004a a6 = AbstractC1005b.a(f6);
        if (a6 == null) {
            a6 = new e1.n(f6);
        }
        return new e1.e(f7, f6, a6);
    }

    public static final Object[] c(Object[] objArr, int i6, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        k.l0(objArr, objArr2, 0, i6, 6);
        k.j0(objArr, objArr2, i6 + 2, i6, objArr.length);
        objArr2[i6] = obj;
        objArr2[i6 + 1] = obj2;
        return objArr2;
    }

    public static final Object[] d(Object[] objArr, int i6) {
        Object[] objArr2 = new Object[objArr.length - 2];
        k.l0(objArr, objArr2, 0, i6, 6);
        k.j0(objArr, objArr2, i6, i6 + 2, objArr.length);
        return objArr2;
    }

    public static final Object[] e(Object[] objArr, int i6) {
        Object[] objArr2 = new Object[objArr.length - 1];
        k.l0(objArr, objArr2, 0, i6, 6);
        k.j0(objArr, objArr2, i6, i6 + 1, objArr.length);
        return objArr2;
    }

    public static final void f(c cVar, y yVar, long j3) {
        b bVar = (b) cVar.f119e;
        bVar.getClass();
        C0.e eVar = bVar.f646b;
        C0.e eVar2 = bVar.a;
        boolean b5 = AbstractC0047x.b(yVar);
        long j4 = yVar.f482b;
        if (b5) {
            k.o0(null, r6, 0, eVar2.f655d.length);
            eVar2.f656e = 0;
            k.o0(null, r6, 0, eVar.f655d.length);
            eVar.f656e = 0;
            bVar.f647c = 0L;
        }
        if (!AbstractC0047x.d(yVar)) {
            List list = yVar.f491k;
            if (list == null) {
                list = v.f9812c;
            }
            int i6 = 0;
            for (int size = list.size(); i6 < size; size = size) {
                C0027c c0027c = (C0027c) list.get(i6);
                bVar.a(c0027c.a, C1353b.f(c0027c.f435c, j3));
                i6++;
            }
            bVar.a(j4, C1353b.f(yVar.f492l, j3));
        }
        if (AbstractC0047x.d(yVar) && j4 - bVar.f647c > 40) {
            k.o0(null, r0, 0, eVar2.f655d.length);
            eVar2.f656e = 0;
            k.o0(null, r2, 0, eVar.f655d.length);
            eVar.f656e = 0;
            bVar.f647c = 0L;
        }
        bVar.f647c = j4;
    }

    public static void g(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static final Object h(InterfaceC0155j interfaceC0155j, InterfaceC1193a interfaceC1193a, d4.c cVar) {
        Object obj;
        H0.i0 u5;
        Object M5;
        C0149f0 c0149f0;
        AbstractC1040q abstractC1040q = (AbstractC1040q) interfaceC0155j;
        boolean z5 = abstractC1040q.f11806c.f11819q;
        if (z5) {
            if (!z5) {
                E0.a.b("visitAncestors called on an unattached node");
            }
            AbstractC1040q abstractC1040q2 = abstractC1040q.f11806c.f11810h;
            J v5 = AbstractC0157l.v(interfaceC0155j);
            loop0: while (true) {
                obj = null;
                if (v5 == null) {
                    break;
                }
                if ((v5.f1721J.f1919f.f11809g & PegdownExtensions.SUBSCRIPT) != 0) {
                    while (abstractC1040q2 != null) {
                        if ((abstractC1040q2.f11808f & PegdownExtensions.SUBSCRIPT) != 0) {
                            AbstractC1040q abstractC1040q3 = abstractC1040q2;
                            V.e eVar = null;
                            while (abstractC1040q3 != null) {
                                if (abstractC1040q3 instanceof M0.a) {
                                    obj = abstractC1040q3;
                                    break loop0;
                                }
                                if ((abstractC1040q3.f11808f & PegdownExtensions.SUBSCRIPT) != 0 && (abstractC1040q3 instanceof AbstractC0156k)) {
                                    int i6 = 0;
                                    for (AbstractC1040q abstractC1040q4 = ((AbstractC0156k) abstractC1040q3).f1964s; abstractC1040q4 != null; abstractC1040q4 = abstractC1040q4.f11811i) {
                                        if ((abstractC1040q4.f11808f & PegdownExtensions.SUBSCRIPT) != 0) {
                                            i6++;
                                            if (i6 == 1) {
                                                abstractC1040q3 = abstractC1040q4;
                                            } else {
                                                if (eVar == null) {
                                                    eVar = new V.e(new AbstractC1040q[16]);
                                                }
                                                if (abstractC1040q3 != null) {
                                                    eVar.b(abstractC1040q3);
                                                    abstractC1040q3 = null;
                                                }
                                                eVar.b(abstractC1040q4);
                                            }
                                        }
                                    }
                                    if (i6 == 1) {
                                    }
                                }
                                abstractC1040q3 = AbstractC0157l.e(eVar);
                            }
                        }
                        abstractC1040q2 = abstractC1040q2.f11810h;
                    }
                }
                v5 = v5.v();
                abstractC1040q2 = (v5 == null || (c0149f0 = v5.f1721J) == null) ? null : c0149f0.f1918e;
            }
            M0.a aVar = (M0.a) obj;
            if (aVar != null && (M5 = aVar.M((u5 = AbstractC0157l.u(interfaceC0155j)), new C0028d(5, interfaceC1193a, u5), cVar)) == EnumC0927a.f11114c) {
                return M5;
            }
        }
        return X3.y.a;
    }

    public static String i(List list) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            N2.j jVar = (N2.j) it.next();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Attribute.TITLE_ATTR, jVar.a);
            jSONObject.put("url", jVar.f3830b);
            jSONObject.put("content", jVar.f3831c);
            jSONArray.put(jSONObject);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("results", jSONArray);
        String jSONObject3 = jSONObject2.toString();
        AbstractC1276k.e(jSONObject3, "toString(...)");
        return jSONObject3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [g0.j, N3.s] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [T.a] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Integer] */
    public static final List j(M0 m02, Integer num, int i6, Integer num2) {
        int i7;
        int s5;
        I i8;
        if (m02.f8007w || m02.p() == 0) {
            return v.f9812c;
        }
        g0.j jVar = new g0.j(m02);
        if (num2 != null) {
            i7 = num2.intValue();
        } else {
            i7 = m02.f8006v;
            if (i7 < 0) {
                i7 = m02.E(m02.f7986b, i6);
            }
        }
        if (num == 0) {
            int N5 = m02.f7993i - m02.N(m02.f7986b, m02.r(i6));
            C1147A c1147a = m02.f8003s;
            num = Integer.valueOf(N5 + ((c1147a == null || (i8 = (I) c1147a.b(i6)) == null) ? 0 : i8.f12466b));
        }
        int r5 = m02.r(i6) * 5;
        int[] iArr = m02.f7986b;
        if (r5 < iArr.length) {
            s5 = m02.s(i6);
        } else {
            int E5 = i7 >= 0 ? m02.E(iArr, i7) : i7;
            s5 = m02.s(i7);
            int i9 = i7;
            i7 = E5;
            i6 = i9;
        }
        while (i6 >= 0) {
            jVar.m(s5, (m02.f7986b[(m02.r(i6) * 5) + 1] & PegdownExtensions.NOT_USED) != 0 ? m02.t(i6) : C0616l.a, m02.O(i6), num);
            num = m02.b(i6);
            if (i7 >= 0) {
                int E6 = m02.E(m02.f7986b, i7);
                s5 = m02.s(i7);
                int i10 = i7;
                i7 = E6;
                i6 = i10;
            } else {
                i6 = i7;
            }
        }
        return (ArrayList) jVar.a;
    }

    public static final boolean k(C1354c c1354c, float f6, float f7) {
        float f8 = c1354c.a;
        if (f6 > c1354c.f13296c || f8 > f6) {
            return false;
        }
        return f7 <= c1354c.f13297d && c1354c.f13295b <= f7;
    }

    public static final B l(Context context) {
        AbstractC1276k.f(context, "context");
        B b5 = new B(context);
        L1.i iVar = b5.f2518b;
        I1.I i6 = iVar.f3032s;
        i6.a(new A(i6));
        iVar.f3032s.a(new J1.i());
        iVar.f3032s.a(new r());
        return b5;
    }

    public static U m(Class cls) {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new RuntimeException("Cannot create an instance of " + cls);
            }
            try {
                Object newInstance = declaredConstructor.newInstance(null);
                AbstractC1276k.c(newInstance);
                return (U) newInstance;
            } catch (IllegalAccessException e6) {
                throw new RuntimeException("Cannot create an instance of " + cls, e6);
            } catch (InstantiationException e7) {
                throw new RuntimeException("Cannot create an instance of " + cls, e7);
            }
        } catch (NoSuchMethodException e8) {
            throw new RuntimeException("Cannot create an instance of " + cls, e8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object n(java.util.ArrayList r10, io.ktor.utils.io.y r11, R3.a r12, java.nio.charset.Charset r13, d4.c r14) {
        /*
            boolean r0 = r14 instanceof K3.d
            if (r0 == 0) goto L13
            r0 = r14
            K3.d r0 = (K3.d) r0
            int r1 = r0.f2938j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2938j = r1
            goto L18
        L13:
            K3.d r0 = new K3.d
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f2937i
            int r1 = r0.f2938j
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            R3.a r12 = r0.f2936h
            io.ktor.utils.io.y r11 = r0.f2935g
            X3.a.e(r14)
            goto L59
        L2a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L32:
            X3.a.e(r14)
            A4.k r5 = new A4.k
            r5.<init>(r10)
            K3.c r4 = new K3.c
            r9 = 0
            r8 = r11
            r7 = r12
            r6 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            K3.e r10 = new K3.e
            r10.<init>(r8, r3)
            r0.f2935g = r8
            r0.f2936h = r7
            r0.f2938j = r2
            java.lang.Object r14 = A4.W.k(r4, r10, r0)
            c4.a r10 = c4.EnumC0927a.f11114c
            if (r14 != r10) goto L57
            return r10
        L57:
            r12 = r7
            r11 = r8
        L59:
            if (r14 != 0) goto L7f
            io.ktor.utils.io.t r11 = (io.ktor.utils.io.t) r11
            boolean r10 = r11.p()
            if (r10 != 0) goto L64
            return r11
        L64:
            m4.A r10 = r12.f7077c
            A3.a r10 = new A3.a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r13 = "No suitable converter found for "
            r11.<init>(r13)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            java.lang.String r12 = "message"
            m4.AbstractC1276k.f(r11, r12)
            r10.<init>(r11, r3)
            throw r10
        L7f:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.AbstractC1410a.n(java.util.ArrayList, io.ktor.utils.io.y, R3.a, java.nio.charset.Charset, d4.c):java.lang.Object");
    }

    public static final float o(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f6 = l.f7374V;
        for (int i6 = 0; i6 < length; i6++) {
            f6 += fArr[i6] * fArr2[i6];
        }
        return f6;
    }

    public static List p(String str) {
        String f6 = AbstractC1135a.f("https://www.bing.com/search?q=", URLEncoder.encode(str, "UTF-8"));
        Locale locale = Locale.getDefault();
        Document document = Jsoup.connect(f6).userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36").header("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8").header("Accept-Language", locale.getLanguage() + "-" + locale.getCountry() + "," + locale.getLanguage()).header("Accept-Encoding", "gzip, deflate, sdch").header("Accept-Charset", "utf-8").header("Connection", "keep-alive").referrer("https://www.bing.com/").cookie("SRCHHPGUSR", "ULSR=1").timeout(5000).get();
        AbstractC1276k.e(document, "get(...)");
        Elements select = document.select("li.b_algo");
        AbstractC1276k.e(select, "select(...)");
        return t4.j.v(t4.j.u(t4.j.t(m.h0(select), new x(20))));
    }

    public static List q(String str, String str2) {
        String str3 = null;
        String obj = str2 != null ? AbstractC1776n.l0(str2).toString() : null;
        String str4 = FlexmarkHtmlConverter.DEFAULT_NODE;
        if (obj == null) {
            obj = FlexmarkHtmlConverter.DEFAULT_NODE;
        }
        if (AbstractC1776n.Q(obj)) {
            throw new IllegalArgumentException("Exa API key missing");
        }
        URLConnection openConnection = new URL("https://api.exa.ai/search").openConnection();
        AbstractC1276k.d(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setConnectTimeout(5000);
        httpURLConnection.setReadTimeout(5000);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("x-api-key", obj);
        httpURLConnection.setRequestProperty(HttpConnection.CONTENT_TYPE, "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("query", str);
        jSONObject.put("num_results", 6);
        jSONObject.put("type", "neural");
        String jSONObject2 = jSONObject.toString();
        AbstractC1276k.e(jSONObject2, "toString(...)");
        OutputStream outputStream = httpURLConnection.getOutputStream();
        try {
            Charset charset = AbstractC1763a.a;
            byte[] bytes = jSONObject2.getBytes(charset);
            AbstractC1276k.e(bytes, "getBytes(...)");
            outputStream.write(bytes);
            outputStream.close();
            int responseCode = httpURLConnection.getResponseCode();
            InputStream errorStream = (200 > responseCode || responseCode >= 300) ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream();
            if (errorStream != null) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, charset), 8192);
                try {
                    str3 = AbstractC1121e.m(bufferedReader);
                    bufferedReader.close();
                } finally {
                }
            }
            if (str3 != null) {
                str4 = str3;
            }
            if (200 > responseCode || responseCode >= 300) {
                throw new IllegalStateException(("Exa search failed: HTTP " + responseCode).toString());
            }
            JSONArray optJSONArray = new JSONObject(str4).optJSONArray("results");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            return t4.j.v(t4.j.u(t4.j.t(m.h0(AbstractC1117a.z(0, optJSONArray.length())), new N2.i(optJSONArray, 2))));
        } finally {
        }
    }

    public static List r(String str, String str2) {
        String str3 = null;
        String obj = str2 != null ? AbstractC1776n.l0(str2).toString() : null;
        String str4 = FlexmarkHtmlConverter.DEFAULT_NODE;
        if (obj == null) {
            obj = FlexmarkHtmlConverter.DEFAULT_NODE;
        }
        if (AbstractC1776n.Q(obj)) {
            throw new IllegalArgumentException("Metaso API key missing");
        }
        URLConnection openConnection = new URL("https://metaso.cn/api/v1/search").openConnection();
        AbstractC1276k.d(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setConnectTimeout(5000);
        httpURLConnection.setReadTimeout(5000);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Authorization", "Bearer ".concat(obj));
        httpURLConnection.setRequestProperty(HttpConnection.CONTENT_TYPE, "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("q", str);
        jSONObject.put("scope", "webpage");
        jSONObject.put("includeSummary", false);
        jSONObject.put("includeRawContent", false);
        jSONObject.put("conciseSnippet", false);
        jSONObject.put("size", String.valueOf(6));
        String jSONObject2 = jSONObject.toString();
        AbstractC1276k.e(jSONObject2, "toString(...)");
        OutputStream outputStream = httpURLConnection.getOutputStream();
        try {
            Charset charset = AbstractC1763a.a;
            byte[] bytes = jSONObject2.getBytes(charset);
            AbstractC1276k.e(bytes, "getBytes(...)");
            outputStream.write(bytes);
            outputStream.close();
            int responseCode = httpURLConnection.getResponseCode();
            InputStream errorStream = (200 > responseCode || responseCode >= 300) ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream();
            if (errorStream != null) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, charset), 8192);
                try {
                    str3 = AbstractC1121e.m(bufferedReader);
                    bufferedReader.close();
                } finally {
                }
            }
            if (str3 != null) {
                str4 = str3;
            }
            if (200 > responseCode || responseCode >= 300) {
                throw new IllegalStateException(("Metaso search failed: HTTP " + responseCode).toString());
            }
            JSONArray optJSONArray = new JSONObject(str4).optJSONArray("webpages");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            return t4.j.v(t4.j.u(t4.j.t(m.h0(AbstractC1117a.z(0, optJSONArray.length())), new N2.i(optJSONArray, 1))));
        } finally {
        }
    }

    public static List s(String str, String str2) {
        String str3 = null;
        String obj = str2 != null ? AbstractC1776n.l0(str2).toString() : null;
        String str4 = FlexmarkHtmlConverter.DEFAULT_NODE;
        if (obj == null) {
            obj = FlexmarkHtmlConverter.DEFAULT_NODE;
        }
        if (AbstractC1776n.Q(obj)) {
            throw new IllegalArgumentException("Ollama API key missing");
        }
        URLConnection openConnection = new URL("https://ollama.com/api/web_search").openConnection();
        AbstractC1276k.d(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setConnectTimeout(5000);
        httpURLConnection.setReadTimeout(5000);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Authorization", "Bearer ".concat(obj));
        httpURLConnection.setRequestProperty(HttpConnection.CONTENT_TYPE, "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("query", str);
        String jSONObject2 = jSONObject.toString();
        AbstractC1276k.e(jSONObject2, "toString(...)");
        OutputStream outputStream = httpURLConnection.getOutputStream();
        try {
            Charset charset = AbstractC1763a.a;
            byte[] bytes = jSONObject2.getBytes(charset);
            AbstractC1276k.e(bytes, "getBytes(...)");
            outputStream.write(bytes);
            outputStream.close();
            int responseCode = httpURLConnection.getResponseCode();
            InputStream errorStream = (200 > responseCode || responseCode >= 300) ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream();
            if (errorStream != null) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, charset), 8192);
                try {
                    str3 = AbstractC1121e.m(bufferedReader);
                    bufferedReader.close();
                } finally {
                }
            }
            if (str3 != null) {
                str4 = str3;
            }
            if (200 > responseCode || responseCode >= 300) {
                throw new IllegalStateException(("Ollama search failed: HTTP " + responseCode).toString());
            }
            JSONArray optJSONArray = new JSONObject(str4).optJSONArray("results");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            return t4.j.v(t4.j.u(t4.j.t(m.h0(AbstractC1117a.z(0, optJSONArray.length())), new N2.i(optJSONArray, 0))));
        } finally {
        }
    }

    public static final Integer t(I0 i02, AbstractC0633u abstractC0633u, int i6, int i7) {
        Integer t5;
        int[] iArr = i02.f7953b;
        while (true) {
            if (i6 >= i7) {
                return null;
            }
            int i8 = iArr[(i6 * 5) + 3] + i6;
            if (i02.j(i6) && i02.i(i6) == 206 && AbstractC1276k.b(i02.p(iArr, i6), AbstractC0629s.f8204e)) {
                Object h3 = i02.h(i6, 0);
                C0 c02 = h3 instanceof C0 ? (C0) h3 : null;
                Object obj = c02 != null ? c02.a : null;
                C0620n c0620n = obj instanceof C0620n ? (C0620n) obj : null;
                if (c0620n != null && c0620n.f8130c.equals(abstractC0633u)) {
                    return Integer.valueOf(i6);
                }
            }
            if (i02.d(i6) && (t5 = t(i02, abstractC0633u, i6 + 1, i8)) != null) {
                return Integer.valueOf(t5.intValue());
            }
            i6 = i8;
        }
    }

    public static Q4.u u(String str) {
        if (str.equals("http/1.0")) {
            return Q4.u.HTTP_1_0;
        }
        if (str.equals("http/1.1")) {
            return Q4.u.HTTP_1_1;
        }
        if (str.equals("h2_prior_knowledge")) {
            return Q4.u.H2_PRIOR_KNOWLEDGE;
        }
        if (str.equals(FlexmarkHtmlConverter.H2_NODE)) {
            return Q4.u.HTTP_2;
        }
        if (str.equals("spdy/3.1")) {
            return Q4.u.SPDY_3;
        }
        if (str.equals("quic")) {
            return Q4.u.QUIC;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    public static final String[] v(InterfaceC1075n interfaceC1075n) {
        AbstractC1276k.d(interfaceC1075n, "null cannot be cast to non-null type androidx.compose.ui.autofill.AndroidContentType");
        return (String[]) ((C1066e) interfaceC1075n).f11949b.toArray(new String[0]);
    }

    public static Z1.b w(c cVar, SQLiteDatabase sQLiteDatabase) {
        AbstractC1276k.f(cVar, "refHolder");
        Z1.b bVar = (Z1.b) cVar.f119e;
        if (bVar != null && bVar.f9860c.equals(sQLiteDatabase)) {
            return bVar;
        }
        Z1.b bVar2 = new Z1.b(sQLiteDatabase);
        cVar.f119e = bVar2;
        return bVar2;
    }

    public static final int x(int i6, int i7) {
        return (i6 >> i7) & 31;
    }

    public static boolean y() {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC0923a.a();
        }
        try {
            if (f13517d == null) {
                f13516c = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f13517d = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f13517d.invoke(null, Long.valueOf(f13516c))).booleanValue();
        } catch (Exception e6) {
            if (!(e6 instanceof InvocationTargetException)) {
                return false;
            }
            Throwable cause = e6.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static final boolean z(w wVar) {
        AbstractC1276k.f(wVar, "<this>");
        int i6 = wVar.f2769c;
        return 200 <= i6 && i6 < 300;
    }
}
