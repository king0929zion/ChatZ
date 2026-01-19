package Y3;

import D.L;
import D.O;
import I3.AbstractC0238b;
import I3.C0245i;
import J1.C0246a;
import M4.C0255c;
import M4.n0;
import S0.C0545g;
import T.C0602e;
import T.C0616l;
import T.C0625p0;
import T.C0626q;
import T.C0627q0;
import T.X;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC0837k;
import androidx.lifecycle.InterfaceC0846u;
import androidx.lifecycle.N;
import androidx.lifecycle.U;
import androidx.lifecycle.W;
import androidx.lifecycle.Y;
import androidx.lifecycle.Z;
import androidx.lifecycle.a0;
import b.AbstractC0863g;
import b.C0853B;
import b.InterfaceC0854C;
import b0.AbstractC0874g;
import b0.C0873f;
import c.C0917e;
import c4.EnumC0927a;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.util.format.TableCell;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import e0.InterfaceC0958c;
import i4.AbstractC1117a;
import j1.AbstractC1135a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import m4.AbstractC1289x;
import m4.AbstractC1291z;
import m4.C1270e;
import o4.AbstractC1410a;
import u4.AbstractC1776n;
import x4.AbstractC1888A;
import x4.C1936s;

/* loaded from: classes.dex */
public abstract class C {
    public static final /* synthetic */ int a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f9789b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f9790c = 0;

    public static final boolean A(String str, Bundle bundle) {
        AbstractC1276k.f(str, "key");
        return bundle.containsKey(str) && bundle.get(str) == null;
    }

    public static final float B(float f6, float f7, float f8) {
        return (f8 * f7) + ((1 - f8) * f6);
    }

    public static final int C(float f6, int i6, int i7) {
        return i6 + ((int) Math.round((i7 - i6) * f6));
    }

    public static final void D(StringBuilder sb, String str, String str2) {
        AbstractC1276k.f(str, "key");
        AbstractC1276k.f(str2, "value");
        Appendable append = sb.append((CharSequence) ("-> " + str + ": " + str2));
        AbstractC1276k.e(append, "append(value)");
        AbstractC1276k.e(append.append('\n'), "append('\\n')");
    }

    public static final void E(StringBuilder sb, Set set, List list) {
        AbstractC1276k.f(set, "headers");
        AbstractC1276k.f(list, "sanitizedHeaders");
        for (Map.Entry entry : m.G0(m.J0(set), new B3.q(0))) {
            String str = (String) entry.getKey();
            List list2 = (List) entry.getValue();
            Iterator it = list.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            D(sb, str, m.v0(list2, "; ", null, null, null, 62));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object F(java.lang.StringBuilder r5, I3.C0241e r6, io.ktor.utils.io.y r7, d4.c r8) {
        /*
            boolean r0 = r8 instanceof B3.r
            if (r0 == 0) goto L13
            r0 = r8
            B3.r r0 = (B3.r) r0
            int r1 = r0.f552j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f552j = r1
            goto L18
        L13:
            B3.r r0 = new B3.r
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f551i
            int r1 = r0.f552j
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            java.nio.charset.Charset r5 = r0.f550h
            java.lang.StringBuilder r6 = r0.f549g
            X3.a.e(r8)     // Catch: java.lang.Throwable -> L29
            goto L70
        L29:
            r5 = r6
            goto L77
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            X3.a.e(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r1 = "BODY Content-Type: "
            r8.<init>(r1)
            r8.append(r6)
            java.lang.String r8 = r8.toString()
            r5.append(r8)
            r8 = 10
            r5.append(r8)
            java.lang.String r1 = "BODY START"
            r5.append(r1)
            r5.append(r8)
            if (r6 == 0) goto L5c
            java.nio.charset.Charset r6 = Y4.l.q(r6)
            if (r6 != 0) goto L5e
        L5c:
            java.nio.charset.Charset r6 = u4.AbstractC1763a.a
        L5e:
            r0.f549g = r5     // Catch: java.lang.Throwable -> L77
            r0.f550h = r6     // Catch: java.lang.Throwable -> L77
            r0.f552j = r2     // Catch: java.lang.Throwable -> L77
            java.lang.Object r8 = i4.AbstractC1117a.t(r7, r0)     // Catch: java.lang.Throwable -> L77
            c4.a r7 = c4.EnumC0927a.f11114c
            if (r8 != r7) goto L6d
            return r7
        L6d:
            r4 = r6
            r6 = r5
            r5 = r4
        L70:
            U3.h r8 = (U3.h) r8     // Catch: java.lang.Throwable -> L29
            java.lang.String r5 = Y4.d.S(r8, r5)     // Catch: java.lang.Throwable -> L29
            goto L7b
        L77:
            r6 = 0
            r4 = r6
            r6 = r5
            r5 = r4
        L7b:
            if (r5 != 0) goto L7f
            java.lang.String r5 = "[response body omitted]"
        L7f:
            r6.append(r5)
            java.lang.String r5 = "\nBODY END"
            r6.append(r5)
            X3.y r5 = X3.y.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Y3.C.F(java.lang.StringBuilder, I3.e, io.ktor.utils.io.y, d4.c):java.lang.Object");
    }

    public static final void G(StringBuilder sb, F3.c cVar, int i6, List list) {
        AbstractC1135a.o(i6, "level");
        AbstractC1276k.f(list, "sanitizedHeaders");
        if (B3.e.c(i6)) {
            sb.append("RESPONSE: " + cVar.g());
            sb.append('\n');
            sb.append("METHOD: " + cVar.b().d().getMethod());
            sb.append('\n');
            sb.append("FROM: " + cVar.b().d().getUrl());
            sb.append('\n');
        }
        if (B3.e.b(i6)) {
            sb.append("COMMON HEADERS");
            sb.append('\n');
            E(sb, cVar.a().a(), list);
        }
    }

    public static int H(int i6) {
        return i6 < 0 ? i6 : i6 < 3 ? i6 + 1 : i6 < 1073741824 ? (int) ((i6 / 0.75f) + 1.0f) : TableCell.NOT_TRACKED;
    }

    public static Map I(X3.i iVar) {
        AbstractC1276k.f(iVar, "pair");
        Map singletonMap = Collections.singletonMap(iVar.f9393c, iVar.f9394e);
        AbstractC1276k.e(singletonMap, "singletonMap(...)");
        return singletonMap;
    }

    public static final long J(float f6, long j3) {
        return (Float.isNaN(f6) || f6 >= 1.0f) ? j3 : o0.s.c(o0.s.e(j3) * f6, j3);
    }

    public static Q4.n K(String... strArr) {
        if (strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr2 = (String[]) strArr.clone();
        int length = strArr2.length;
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7++) {
            String str = strArr2[i7];
            if (str == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr2[i7] = AbstractC1776n.l0(str).toString();
        }
        int Y5 = h5.e.Y(0, strArr2.length - 1, 2);
        if (Y5 >= 0) {
            while (true) {
                String str2 = strArr2[i6];
                String str3 = strArr2[i6 + 1];
                h(str2);
                i(str3, str2);
                if (i6 == Y5) {
                    break;
                }
                i6 += 2;
            }
        }
        return new Q4.n(strArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final t0.AbstractC1688b L(int r53, int r54, T.C0626q r55) {
        /*
            Method dump skipped, instructions count: 1628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y3.C.L(int, int, T.q):t0.b");
    }

    public static final List M(String str) {
        v vVar;
        v vVar2;
        X3.i iVar;
        v vVar3 = v.f9812c;
        if (str == null) {
            return vVar3;
        }
        I3.q qVar = I3.q.f2751f;
        X3.g gVar = X3.g.f9391e;
        X3.f c6 = X3.a.c(gVar, qVar);
        int i6 = 0;
        while (i6 <= AbstractC1776n.L(str)) {
            X3.f c7 = X3.a.c(gVar, I3.q.f2752g);
            Integer num = null;
            int i7 = i6;
            while (true) {
                if (i7 <= AbstractC1776n.L(str)) {
                    char charAt = str.charAt(i7);
                    if (charAt == ',') {
                        ((ArrayList) c6.getValue()).add(new C0245i(U(i6, num != null ? num.intValue() : i7, str), c7.a() ? (List) c7.getValue() : vVar3));
                        i7++;
                        vVar = vVar3;
                    } else if (charAt == ';') {
                        if (num == null) {
                            num = Integer.valueOf(i7);
                        }
                        int i8 = i7 + 1;
                        int i9 = i8;
                        while (i9 <= AbstractC1776n.L(str)) {
                            char charAt2 = str.charAt(i9);
                            if (charAt2 != '=') {
                                vVar2 = vVar3;
                                if (charAt2 == ';' || charAt2 == ',') {
                                    N(c7, str, i8, i9, FlexmarkHtmlConverter.DEFAULT_NODE);
                                    break;
                                }
                                i9++;
                                vVar3 = vVar2;
                            } else {
                                int i10 = i9 + 1;
                                if (str.length() == i10) {
                                    iVar = new X3.i(Integer.valueOf(i10), FlexmarkHtmlConverter.DEFAULT_NODE);
                                    vVar2 = vVar3;
                                } else {
                                    char c8 = '\"';
                                    if (str.charAt(i10) == '\"') {
                                        int i11 = i9 + 2;
                                        StringBuilder sb = new StringBuilder();
                                        while (i11 <= AbstractC1776n.L(str)) {
                                            char charAt3 = str.charAt(i11);
                                            if (charAt3 == c8) {
                                                int i12 = i11 + 1;
                                                int i13 = i12;
                                                while (true) {
                                                    if (i13 >= str.length()) {
                                                        vVar2 = vVar3;
                                                        break;
                                                    }
                                                    vVar2 = vVar3;
                                                    if (str.charAt(i13) != ' ') {
                                                        break;
                                                    }
                                                    i13++;
                                                    vVar3 = vVar2;
                                                }
                                                if (i13 == str.length() || str.charAt(i13) == ';') {
                                                    Integer valueOf = Integer.valueOf(i12);
                                                    String sb2 = sb.toString();
                                                    AbstractC1276k.e(sb2, "builder.toString()");
                                                    iVar = new X3.i(valueOf, sb2);
                                                    break;
                                                }
                                            } else {
                                                vVar2 = vVar3;
                                            }
                                            if (charAt3 != '\\' || i11 >= AbstractC1776n.L(str) - 2) {
                                                sb.append(charAt3);
                                                i11++;
                                            } else {
                                                sb.append(str.charAt(i11 + 1));
                                                i11 += 2;
                                            }
                                            vVar3 = vVar2;
                                            c8 = '\"';
                                        }
                                        vVar2 = vVar3;
                                        Integer valueOf2 = Integer.valueOf(i11);
                                        String sb3 = sb.toString();
                                        AbstractC1276k.e(sb3, "builder.toString()");
                                        iVar = new X3.i(valueOf2, "\"".concat(sb3));
                                    } else {
                                        vVar2 = vVar3;
                                        int i14 = i10;
                                        while (i14 <= AbstractC1776n.L(str)) {
                                            char charAt4 = str.charAt(i14);
                                            if (charAt4 == ';' || charAt4 == ',') {
                                                iVar = new X3.i(Integer.valueOf(i14), U(i10, i14, str));
                                                break;
                                            }
                                            i14++;
                                        }
                                        iVar = new X3.i(Integer.valueOf(i14), U(i10, i14, str));
                                    }
                                }
                                int intValue = ((Number) iVar.f9393c).intValue();
                                N(c7, str, i8, i9, (String) iVar.f9394e);
                                i7 = intValue;
                                vVar3 = vVar2;
                            }
                        }
                        vVar2 = vVar3;
                        N(c7, str, i8, i9, FlexmarkHtmlConverter.DEFAULT_NODE);
                        i7 = i9;
                        vVar3 = vVar2;
                    } else {
                        i7++;
                    }
                } else {
                    vVar = vVar3;
                    ((ArrayList) c6.getValue()).add(new C0245i(U(i6, num != null ? num.intValue() : i7, str), c7.a() ? (List) c7.getValue() : vVar));
                }
            }
            i6 = i7;
            vVar3 = vVar;
        }
        return c6.a() ? (List) c6.getValue() : vVar3;
    }

    public static final void N(X3.f fVar, String str, int i6, int i7, String str2) {
        String U5 = U(i6, i7, str);
        if (U5.length() == 0) {
            return;
        }
        ((ArrayList) fVar.getValue()).add(new I3.j(U5, str2));
    }

    public static final long O(long j3, long j4) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) + ((int) (j4 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L)) + ((int) (j4 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e2, code lost:
    
        r1 = h5.e.H(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01e6, code lost:
    
        i4.AbstractC1120d.h(r2, null);
        r10 = r1;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static T1.i P(java.lang.String r31, X1.a r32) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y3.C.P(java.lang.String, X1.a):T1.i");
    }

    public static final long Q(long j3) {
        return (Math.round(Float.intBitsToFloat((int) (j3 & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (j3 >> 32))) << 32);
    }

    public static final KSerializer R(F2.h hVar, R3.a aVar) {
        AbstractC1276k.f(hVar, "<this>");
        AbstractC1276k.f(aVar, "typeInfo");
        C1270e c1270e = aVar.a;
        KSerializer N5 = Collections.EMPTY_LIST.isEmpty() ? null : AbstractC1410a.N(hVar, aVar.f7077c);
        return N5 != null ? N5 : AbstractC1410a.M(c1270e);
    }

    public static final ByteBuffer S(ByteBuffer byteBuffer, int i6, int i7) {
        AbstractC1276k.f(byteBuffer, "<this>");
        ByteBuffer duplicate = byteBuffer.duplicate();
        AbstractC1276k.e(duplicate, "myDuplicate$lambda$1");
        duplicate.position(i6);
        duplicate.limit(i6 + i7);
        ByteBuffer slice = duplicate.slice();
        AbstractC1276k.e(slice, "mySlice$lambda$2");
        return slice;
    }

    public static final Object T(C4.r rVar, C4.r rVar2, l4.e eVar) {
        Object c1936s;
        Object a02;
        try {
            AbstractC1291z.b(2, eVar);
            c1936s = eVar.m(rVar2, rVar);
        } catch (Throwable th) {
            c1936s = new C1936s(th, false);
        }
        EnumC0927a enumC0927a = EnumC0927a.f11114c;
        if (c1936s == enumC0927a || (a02 = rVar.a0(c1936s)) == AbstractC1888A.f15641e) {
            return enumC0927a;
        }
        if (a02 instanceof C1936s) {
            throw ((C1936s) a02).a;
        }
        return AbstractC1888A.F(a02);
    }

    public static final String U(int i6, int i7, String str) {
        String substring = str.substring(i6, i7);
        AbstractC1276k.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return AbstractC1776n.l0(substring).toString();
    }

    public static final Map V(Map map) {
        AbstractC1276k.f(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        AbstractC1276k.e(singletonMap, "with(...)");
        return singletonMap;
    }

    public static final U W(Class cls, a0 a0Var, o3.e eVar, F1.c cVar, C0626q c0626q) {
        return p(a0Var, AbstractC1289x.a(cls), eVar, cVar);
    }

    public static final void X(U3.a aVar, ByteBuffer byteBuffer) {
        AbstractC1276k.f(aVar, "<this>");
        int remaining = byteBuffer.remaining();
        ByteBuffer byteBuffer2 = aVar.a;
        int i6 = aVar.f8663c;
        int i7 = aVar.f8665e - i6;
        if (i7 < remaining) {
            String str = "Not enough free space to write buffer content of " + remaining + " bytes, available " + i7 + " bytes.";
            AbstractC1276k.f(str, "message");
            throw new Exception(str);
        }
        AbstractC1276k.f(byteBuffer2, "destination");
        if (!byteBuffer.hasArray() || byteBuffer.isReadOnly()) {
            S(byteBuffer2, i6, byteBuffer.remaining()).put(byteBuffer);
        } else {
            byte[] array = byteBuffer.array();
            AbstractC1276k.e(array, "array()");
            int position = byteBuffer.position() + byteBuffer.arrayOffset();
            int remaining2 = byteBuffer.remaining();
            ByteBuffer order = ByteBuffer.wrap(array, position, remaining2).slice().order(ByteOrder.BIG_ENDIAN);
            AbstractC1276k.e(order, "wrap(this, offset, lengt…der(ByteOrder.BIG_ENDIAN)");
            S3.b.a(order, byteBuffer2, 0, remaining2, i6);
            byteBuffer.position(byteBuffer.limit());
        }
        aVar.a(remaining);
    }

    public static final void a(boolean z5, InterfaceC1193a interfaceC1193a, C0626q c0626q, int i6, int i7) {
        int i8;
        c0626q.d0(-361453782);
        int i9 = i7 & 1;
        if (i9 != 0) {
            i8 = i6 | 6;
        } else if ((i6 & 6) == 0) {
            i8 = (c0626q.g(z5) ? 4 : 2) | i6;
        } else {
            i8 = i6;
        }
        if ((i6 & 48) == 0) {
            i8 |= c0626q.h(interfaceC1193a) ? 32 : 16;
        }
        if ((i8 & 19) == 18 && c0626q.E()) {
            c0626q.V();
        } else {
            if (i9 != 0) {
                z5 = true;
            }
            X E5 = T.r.E(interfaceC1193a, c0626q);
            Object P5 = c0626q.P();
            C0602e c0602e = C0616l.a;
            if (P5 == c0602e) {
                P5 = new c.h(z5, E5);
                c0626q.m0(P5);
            }
            c.h hVar = (c.h) P5;
            boolean z6 = (i8 & 14) == 4;
            Object P6 = c0626q.P();
            if (z6 || P6 == c0602e) {
                P6 = new C0917e(hVar, z5);
                c0626q.m0(P6);
            }
            T.r.j((InterfaceC1193a) P6, c0626q);
            InterfaceC0854C a6 = c.k.a(c0626q);
            if (a6 == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
            C0853B a7 = a6.a();
            InterfaceC0846u interfaceC0846u = (InterfaceC0846u) c0626q.j(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            boolean h3 = c0626q.h(a7) | c0626q.h(interfaceC0846u);
            Object P7 = c0626q.P();
            if (h3 || P7 == c0602e) {
                P7 = new c.f(a7, interfaceC0846u, hVar, 0);
                c0626q.m0(P7);
            }
            T.r.c(interfaceC0846u, a7, (l4.c) P7, c0626q);
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new c.g(z5, interfaceC1193a, i6, i7);
        }
    }

    public static final void b(I1.j jVar, InterfaceC0958c interfaceC0958c, C0873f c0873f, C0626q c0626q, int i6) {
        c0626q.d0(233973821);
        if ((((c0626q.h(jVar) ? 4 : 2) | i6 | (c0626q.h(interfaceC0958c) ? 32 : 16)) & 147) == 146 && c0626q.E()) {
            c0626q.V();
        } else {
            T.r.b(new C0625p0[]{G1.a.a.a(jVar), D1.e.a.a(jVar), V1.a.a.a(jVar)}, AbstractC0874g.c(1808964477, new J1.m(1, interfaceC0958c, c0873f), c0626q), c0626q, 56);
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new L(jVar, interfaceC0958c, c0873f, i6, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x01c0, code lost:
    
        if (r0 != null) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final X2.L r61, final a3.w r62, final X2.C0692g r63, final X2.Y r64, final l4.InterfaceC1193a r65, final l4.InterfaceC1193a r66, T.C0626q r67, int r68) {
        /*
            Method dump skipped, instructions count: 1556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y3.C.c(X2.L, a3.w, X2.g, X2.Y, l4.a, l4.a, T.q, int):void");
    }

    public static final void d(boolean z5, l4.e eVar, C0626q c0626q, int i6) {
        c0626q.d0(1818896922);
        int i7 = (c0626q.g(z5) ? 4 : 2) | i6 | (c0626q.h(eVar) ? 32 : 16);
        if ((i7 & 19) == 18 && c0626q.E()) {
            c0626q.V();
        } else {
            h5.e.F(z5, eVar, c0626q, i7 & 126);
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new O(z5, eVar, i6);
        }
    }

    public static final void e(InterfaceC0958c interfaceC0958c, C0873f c0873f, C0626q c0626q, int i6) {
        c0626q.d0(832919318);
        int i7 = (c0626q.h(interfaceC0958c) ? 4 : 2) | i6 | (c0626q.h(c0873f) ? 32 : 16);
        if ((i7 & 19) == 18 && c0626q.E()) {
            c0626q.V();
        } else {
            Object P5 = c0626q.P();
            if (P5 == C0616l.a) {
                P5 = new I2.x(6);
                c0626q.m0(P5);
            }
            l4.c cVar = (l4.c) P5;
            a0 a6 = G1.a.a(c0626q);
            if (a6 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            C1270e a7 = AbstractC1289x.a(C0246a.class);
            F1.e eVar = new F1.e(0);
            eVar.a(AbstractC1289x.a(C0246a.class), cVar);
            C0246a c0246a = (C0246a) p(a6, a7, eVar.c(), a6 instanceof InterfaceC0837k ? ((InterfaceC0837k) a6).d() : F1.a.f1544b);
            c0246a.f2829d = new A3.c(interfaceC0958c);
            interfaceC0958c.f(c0246a.f2828c, c0873f, c0626q, ((i7 << 6) & 896) | (i7 & 112));
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new I.m(i6, 4, interfaceC0958c, c0873f);
        }
    }

    public static final void f(T4.a aVar, T4.c cVar, String str) {
        T4.d.f8527h.getClass();
        T4.d.f8529j.fine(cVar.f8522b + SequenceUtils.SPC + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + aVar.a);
    }

    public static final void g(N3.r rVar, N3.r rVar2) {
        AbstractC1276k.f(rVar, "<this>");
        AbstractC1276k.f(rVar2, "builder");
        for (Map.Entry entry : rVar2.a()) {
            rVar.c((String) entry.getKey(), (List) entry.getValue());
        }
    }

    public static void h(String str) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i6 = 0; i6 < length; i6++) {
            char charAt = str.charAt(i6);
            if ('!' > charAt || charAt >= 127) {
                throw new IllegalArgumentException(R4.b.i("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i6), str).toString());
            }
        }
    }

    public static void i(String str, String str2) {
        int length = str.length();
        for (int i6 = 0; i6 < length; i6++) {
            char charAt = str.charAt(i6);
            if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                StringBuilder sb = new StringBuilder();
                sb.append(R4.b.i("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i6), str2));
                sb.append(R4.b.q(str2) ? FlexmarkHtmlConverter.DEFAULT_NODE : ": ".concat(str));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static final void j(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i6) {
        AbstractC1276k.f(byteBuffer, "$this$copyTo");
        int remaining = byteBuffer2.remaining();
        if (byteBuffer.hasArray() && !byteBuffer.isReadOnly() && byteBuffer2.hasArray() && !byteBuffer2.isReadOnly()) {
            int position = byteBuffer2.position();
            System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset() + i6, byteBuffer2.array(), byteBuffer2.arrayOffset() + position, remaining);
            byteBuffer2.position(position + remaining);
        } else {
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.limit(remaining + i6);
            duplicate.position(i6);
            byteBuffer2.put(duplicate);
        }
    }

    public static final long k() {
        return Thread.currentThread().getId();
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [I3.y, N3.t] */
    public static final I3.y l(N3.r rVar) {
        AbstractC1276k.f(rVar, "parameters");
        I3.n nVar = new I3.n(1);
        for (String str : rVar.names()) {
            List d6 = rVar.d(str);
            if (d6 == null) {
                d6 = v.f9812c;
            }
            String e6 = AbstractC0238b.e(0, 0, 15, str);
            ArrayList arrayList = new ArrayList(n.Z(d6, 10));
            Iterator it = d6.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC0238b.e(0, 0, 11, (String) it.next()));
            }
            nVar.c(e6, arrayList);
        }
        Map map = (Map) nVar.a;
        AbstractC1276k.f(map, "values");
        return new N3.t(map);
    }

    public static final KSerializer m(Collection collection, F2.h hVar) {
        Collection collection2 = collection;
        Collection collection3 = collection2;
        AbstractC1276k.f(collection3, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection3) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(n.Z(arrayList, 10));
        int size = arrayList.size();
        int i6 = 0;
        int i7 = 0;
        while (i7 < size) {
            Object obj2 = arrayList.get(i7);
            i7++;
            arrayList2.add(z(obj2, hVar));
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        int size2 = arrayList2.size();
        int i8 = 0;
        while (i8 < size2) {
            Object obj3 = arrayList2.get(i8);
            i8++;
            if (hashSet.add(((KSerializer) obj3).getDescriptor().a())) {
                arrayList3.add(obj3);
            }
        }
        if (arrayList3.size() > 1) {
            StringBuilder sb = new StringBuilder("Serializing collections of different element types is not yet supported. Selected serializers: ");
            ArrayList arrayList4 = new ArrayList(n.Z(arrayList3, 10));
            int size3 = arrayList3.size();
            while (i6 < size3) {
                Object obj4 = arrayList3.get(i6);
                i6++;
                arrayList4.add(((KSerializer) obj4).getDescriptor().a());
            }
            sb.append(arrayList4);
            throw new IllegalStateException(sb.toString().toString());
        }
        KSerializer kSerializer = (KSerializer) m.E0(arrayList3);
        if (kSerializer == null) {
            kSerializer = n0.a;
        }
        if (!kSerializer.getDescriptor().c() && (!(collection2 instanceof Collection) || !collection2.isEmpty())) {
            Iterator it = collection2.iterator();
            while (it.hasNext()) {
                if (it.next() == null) {
                    return Y4.d.J(kSerializer);
                }
            }
        }
        return kSerializer;
    }

    public static final float n(float f6) {
        float intBitsToFloat = Float.intBitsToFloat(((int) ((Float.floatToRawIntBits(f6) & 8589934591L) / 3)) + 709952852);
        float f7 = intBitsToFloat - ((intBitsToFloat - (f6 / (intBitsToFloat * intBitsToFloat))) * 0.33333334f);
        return f7 - ((f7 - (f6 / (f7 * f7))) * 0.33333334f);
    }

    public static final String o(long j3) {
        String str;
        if (j3 <= -999500000) {
            str = ((j3 - 500000000) / 1000000000) + " s ";
        } else if (j3 <= -999500) {
            str = ((j3 - 500000) / 1000000) + " ms";
        } else if (j3 <= 0) {
            str = ((j3 - 500) / 1000) + " µs";
        } else if (j3 < 999500) {
            str = ((j3 + 500) / 1000) + " µs";
        } else if (j3 < 999500000) {
            str = ((j3 + 500000) / 1000000) + " ms";
        } else {
            str = ((j3 + 500000000) / 1000000000) + " s ";
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
    }

    public static final U p(a0 a0Var, C1270e c1270e, W w5, F1.c cVar) {
        Y j3;
        if (w5 != null) {
            Z e6 = a0Var.e();
            AbstractC1276k.f(cVar, "extras");
            j3 = new Y(e6, w5, cVar);
        } else if (a0Var instanceof InterfaceC0837k) {
            Z e7 = a0Var.e();
            W c6 = ((InterfaceC0837k) a0Var).c();
            AbstractC1276k.f(c6, "factory");
            AbstractC1276k.f(cVar, "extras");
            j3 = new Y(e7, c6, cVar);
        } else {
            j3 = N.j(a0Var, null, 6);
        }
        return j3.a(c1270e);
    }

    public static final float q(Layout layout, int i6, Paint paint) {
        float abs;
        float width;
        float lineLeft = layout.getLineLeft(i6);
        ThreadLocal threadLocal = T0.k.a;
        if (layout.getEllipsisCount(i6) <= 0 || layout.getParagraphDirection(i6) != 1 || lineLeft >= S.l.f7374V) {
            return S.l.f7374V;
        }
        float measureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i6) + layout.getLineStart(i6)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i6);
        if ((paragraphAlignment == null ? -1 : V0.d.a[paragraphAlignment.ordinal()]) == 1) {
            abs = Math.abs(lineLeft);
            width = (layout.getWidth() - measureText) / 2.0f;
        } else {
            abs = Math.abs(lineLeft);
            width = layout.getWidth() - measureText;
        }
        return width + abs;
    }

    public static final float r(Layout layout, int i6, Paint paint) {
        float width;
        float width2;
        ThreadLocal threadLocal = T0.k.a;
        if (layout.getEllipsisCount(i6) <= 0) {
            return S.l.f7374V;
        }
        if (layout.getParagraphDirection(i6) != -1 || layout.getWidth() >= layout.getLineRight(i6)) {
            return S.l.f7374V;
        }
        float measureText = paint.measureText("…") + (layout.getLineRight(i6) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i6) + layout.getLineStart(i6)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i6);
        if ((paragraphAlignment != null ? V0.d.a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i6);
            width2 = (layout.getWidth() - measureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i6);
            width2 = layout.getWidth() - measureText;
        }
        return width - width2;
    }

    public static final int s(String str, Bundle bundle) {
        int i6 = bundle.getInt(str, Integer.MIN_VALUE);
        if (i6 != Integer.MIN_VALUE || bundle.getInt(str, TableCell.NOT_TRACKED) != Integer.MAX_VALUE) {
            return i6;
        }
        h5.e.a0(str);
        throw null;
    }

    public static final Bundle t(String str, Bundle bundle) {
        AbstractC1276k.f(str, "key");
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        h5.e.a0(str);
        throw null;
    }

    public static final ArrayList u(String str, Bundle bundle) {
        AbstractC1276k.f(str, "key");
        ArrayList c6 = Build.VERSION.SDK_INT >= 34 ? AbstractC0863g.c(bundle, str, AbstractC1117a.o(AbstractC1289x.a(Bundle.class))) : bundle.getParcelableArrayList(str);
        if (c6 != null) {
            return c6;
        }
        h5.e.a0(str);
        throw null;
    }

    public static final C0545g v(X0.v vVar) {
        C0545g c0545g = vVar.a;
        long j3 = vVar.f9125b;
        c0545g.getClass();
        return c0545g.subSequence(S0.O.f(j3), S0.O.e(j3));
    }

    public static final C0545g w(X0.v vVar, int i6) {
        C0545g c0545g = vVar.a;
        C0545g c0545g2 = vVar.a;
        long j3 = vVar.f9125b;
        int e6 = S0.O.e(j3);
        int e7 = S0.O.e(j3);
        int i7 = e7 + i6;
        if (((i6 ^ i7) & (e7 ^ i7)) < 0) {
            i7 = c0545g2.f7630e.length();
        }
        return c0545g.subSequence(e6, Math.min(i7, c0545g2.f7630e.length()));
    }

    public static final C0545g x(X0.v vVar, int i6) {
        C0545g c0545g = vVar.a;
        long j3 = vVar.f9125b;
        int f6 = S0.O.f(j3);
        int i7 = f6 - i6;
        if (((f6 ^ i7) & (i6 ^ f6)) < 0) {
            i7 = 0;
        }
        return c0545g.subSequence(Math.max(0, i7), S0.O.f(j3));
    }

    public static String y(f.e eVar) {
        if (eVar instanceof f.d) {
            return "image/*";
        }
        if (eVar instanceof f.c) {
            return null;
        }
        throw new RuntimeException();
    }

    public static final KSerializer z(Object obj, F2.h hVar) {
        AbstractC1276k.f(hVar, "module");
        if (obj == null) {
            return Y4.d.J(n0.a);
        }
        if (obj instanceof List) {
            return new C0255c(m((Collection) obj, hVar), 0);
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            Object obj2 = objArr.length == 0 ? null : objArr[0];
            return obj2 != null ? z(obj2, hVar) : new C0255c(n0.a, 0);
        }
        if (obj instanceof Set) {
            return new C0255c(m((Collection) obj, hVar), 2);
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            return new M4.E(m(map.keySet(), hVar), m(map.values(), hVar), 1);
        }
        AbstractC1289x.a(obj.getClass());
        return AbstractC1410a.M(AbstractC1289x.a(obj.getClass()));
    }
}
