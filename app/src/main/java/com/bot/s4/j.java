package s4;

import B4.z;
import D.AbstractC0090r0;
import I.m;
import I1.B;
import I1.H;
import I1.x;
import I3.C0244h;
import I3.l;
import I3.n;
import I3.y;
import J1.s;
import M4.j0;
import N3.t;
import O4.w;
import S0.F;
import S0.O;
import S2.Y;
import T.C0616l;
import T.C0626q;
import T.C0627q0;
import Y3.AbstractC0739f;
import Y3.k;
import Y3.r;
import Y3.v;
import Z2.X;
import android.content.Context;
import android.os.LocaleList;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.tencent.mmkv.R;
import com.vladsch.flexmark.parser.PegdownExtensions;
import com.vladsch.flexmark.util.format.TableCell;
import d5.A;
import e1.AbstractC0960b;
import e1.C0959a;
import e1.InterfaceC0961c;
import e1.o;
import e1.p;
import f4.AbstractC1011a;
import g0.C1013a;
import g0.C1014b;
import g4.AbstractC1021a;
import h0.C1026c;
import h0.C1038o;
import h0.InterfaceC1028e;
import h0.InterfaceC1041r;
import i4.AbstractC1117a;
import i4.AbstractC1120d;
import j1.AbstractC1135a;
import java.io.EOFException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import m4.AbstractC1289x;
import m4.C1265A;
import o4.AbstractC1410a;
import org.json.JSONArray;
import org.json.JSONObject;
import u3.C1759c;
import u4.AbstractC1776n;
import u4.u;
import v.C1818y;
import v.t0;

/* loaded from: classes.dex */
public abstract class j {
    public static final /* synthetic */ int a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f14822b = 0;

    public static final void A(E3.d dVar, String str, Object obj) {
        AbstractC1276k.f(str, "key");
        if (obj != null) {
            dVar.f1306c.e(str, obj.toString());
        }
    }

    public static final long B(float f6, long j3) {
        long floatToRawIntBits = j3 | (Float.floatToRawIntBits(f6) & 4294967295L);
        p[] pVarArr = o.f11579b;
        return floatToRawIntBits;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static Q4.C0495c C(Q4.n r26) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.j.C(Q4.n):Q4.c");
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [I3.y, N3.t] */
    public static y D(String str) {
        int i6;
        AbstractC1276k.f(str, "query");
        if (AbstractC1776n.L(str) < 0) {
            y.f2771b.getClass();
            return C0244h.f2745c;
        }
        l lVar = y.f2771b;
        n nVar = new n(1);
        int L5 = AbstractC1776n.L(str);
        int i7 = 0;
        int i8 = -1;
        if (L5 >= 0) {
            int i9 = 0;
            i6 = 0;
            int i10 = -1;
            while (i7 != 1000) {
                char charAt = str.charAt(i9);
                if (charAt == '&') {
                    g(nVar, str, i6, i10, i9);
                    i6 = i9 + 1;
                    i7++;
                    i10 = -1;
                } else if (charAt == '=' && i10 == -1) {
                    i10 = i9;
                }
                if (i9 != L5) {
                    i9++;
                } else {
                    i8 = i10;
                }
            }
            Map map = (Map) nVar.a;
            AbstractC1276k.f(map, "values");
            return new t(map);
        }
        i6 = 0;
        if (i7 != 1000) {
            g(nVar, str, i6, i8, str.length());
        }
        Map map2 = (Map) nVar.a;
        AbstractC1276k.f(map2, "values");
        return new t(map2);
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:211:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void E(android.view.ViewStructure r39, H0.J r40, android.view.autofill.AutofillId r41, java.lang.String r42, Q0.b r43) {
        /*
            Method dump skipped, instructions count: 1063
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.j.E(android.view.ViewStructure, H0.J, android.view.autofill.AutofillId, java.lang.String, Q0.b):void");
    }

    public static final void F(U3.d dVar, ByteBuffer byteBuffer) {
        AbstractC1276k.f(dVar, "<this>");
        while (true) {
            if (!byteBuffer.hasRemaining()) {
                break;
            }
            V3.b j3 = dVar.j();
            if (dVar.f8683h - dVar.f8682g < 1) {
                j3 = dVar.q(1, j3);
            }
            if (j3 == null) {
                break;
            }
            int remaining = byteBuffer.remaining();
            int i6 = j3.f8663c - j3.f8662b;
            if (remaining < i6) {
                AbstractC1410a.I(j3, byteBuffer, remaining);
                dVar.f8682g = j3.f8662b;
                break;
            } else {
                AbstractC1410a.I(j3, byteBuffer, i6);
                dVar.s(j3);
            }
        }
        if (byteBuffer.hasRemaining()) {
            throw new EOFException("Not enough data in packet to fill buffer: " + byteBuffer.remaining() + " more bytes required");
        }
    }

    public static final void G(Object[] objArr, int i6, int i7) {
        AbstractC1276k.f(objArr, "<this>");
        while (i6 < i7) {
            objArr[i6] = null;
            i6++;
        }
    }

    public static final float H(long j3, float f6, InterfaceC0961c interfaceC0961c) {
        float c6;
        long b5 = o.b(j3);
        if (p.a(b5, 4294967296L)) {
            if (interfaceC0961c.b0() <= 1.05d) {
                return interfaceC0961c.u0(j3);
            }
            c6 = o.c(j3) / o.c(interfaceC0961c.O(f6));
        } else {
            if (!p.a(b5, 8589934592L)) {
                return Float.NaN;
            }
            c6 = o.c(j3);
        }
        return c6 * f6;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlinx.serialization.KSerializer I(F2.h r5, s4.f r6, boolean r7) {
        /*
            s4.b r0 = M4.AbstractC0252a0.h(r6)
            boolean r1 = r6.a()
            java.util.List r6 = r6.b()
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = Y3.n.Z(r6, r3)
            r2.<init>(r3)
            java.util.Iterator r6 = r6.iterator()
            boolean r3 = r6.hasNext()
            r4 = 0
            if (r3 != 0) goto Lb2
            boolean r6 = r2.isEmpty()
            if (r6 == 0) goto L47
            boolean r6 = M4.AbstractC0252a0.g(r0)
            if (r6 == 0) goto L31
            r5.getClass()
        L31:
            M.q r6 = I4.g.a
            if (r1 != 0) goto L40
            M.q r6 = I4.g.a
            kotlinx.serialization.KSerializer r6 = r6.m(r0)
            if (r6 == 0) goto L3e
            goto L67
        L3e:
            r6 = r4
            goto L67
        L40:
            M.q r6 = I4.g.f2776b
            kotlinx.serialization.KSerializer r6 = r6.m(r0)
            goto L67
        L47:
            r5.getClass()
            M.q r6 = I4.g.a
            java.lang.String r6 = "clazz"
            m4.AbstractC1276k.f(r0, r6)
            if (r1 != 0) goto L5a
            M.q r6 = I4.g.f2777c
            java.lang.Object r6 = r6.n(r0, r2)
            goto L60
        L5a:
            M.q r6 = I4.g.f2778d
            java.lang.Object r6 = r6.n(r0, r2)
        L60:
            boolean r3 = r6 instanceof X3.k
            if (r3 == 0) goto L65
            r6 = r4
        L65:
            kotlinx.serialization.KSerializer r6 = (kotlinx.serialization.KSerializer) r6
        L67:
            if (r6 == 0) goto L6a
            return r6
        L6a:
            boolean r6 = r2.isEmpty()
            if (r6 == 0) goto L88
            kotlinx.serialization.KSerializer r6 = o4.AbstractC1410a.O(r0)
            if (r6 != 0) goto La7
            r5.getClass()
            boolean r5 = M4.AbstractC0252a0.g(r0)
            if (r5 == 0) goto L86
            I4.c r5 = new I4.c
            r5.<init>(r0)
        L84:
            r6 = r5
            goto La7
        L86:
            r6 = r4
            goto La7
        L88:
            java.util.ArrayList r5 = o4.AbstractC1410a.P(r5, r2, r7)
            if (r5 != 0) goto L8f
            goto Lb1
        L8f:
            I4.h r6 = new I4.h
            r7 = 0
            r6.<init>(r7, r2)
            kotlinx.serialization.KSerializer r6 = o4.AbstractC1410a.A(r0, r5, r6)
            if (r6 != 0) goto La7
            boolean r5 = M4.AbstractC0252a0.g(r0)
            if (r5 == 0) goto L86
            I4.c r5 = new I4.c
            r5.<init>(r0)
            goto L84
        La7:
            if (r6 == 0) goto Lb1
            if (r1 == 0) goto Lb0
            kotlinx.serialization.KSerializer r5 = Y4.d.J(r6)
            return r5
        Lb0:
            return r6
        Lb1:
            return r4
        Lb2:
            java.lang.Object r5 = r6.next()
            if (r5 != 0) goto Lbe
            java.lang.String r5 = "<this>"
            m4.AbstractC1276k.f(r4, r5)
            throw r4
        Lbe:
            java.lang.ClassCastException r5 = new java.lang.ClassCastException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.j.I(F2.h, s4.f, boolean):kotlinx.serialization.KSerializer");
    }

    public static final void J(Spannable spannable, long j3, int i6, int i7) {
        if (j3 != 16) {
            spannable.setSpan(new ForegroundColorSpan(o0.y.B(j3)), i6, i7, 33);
        }
    }

    public static final void K(Spannable spannable, long j3, InterfaceC0961c interfaceC0961c, int i6, int i7) {
        long b5 = o.b(j3);
        if (p.a(b5, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(AbstractC1410a.K(interfaceC0961c.u0(j3)), false), i6, i7, 33);
        } else if (p.a(b5, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(o.c(j3)), i6, i7, 33);
        }
    }

    public static final void L(Spannable spannable, Z0.b bVar, int i6, int i7) {
        if (bVar != null) {
            ArrayList arrayList = new ArrayList(Y3.n.Z(bVar, 10));
            Iterator it = bVar.f9855c.iterator();
            while (it.hasNext()) {
                arrayList.add(((Z0.a) it.next()).a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i6, i7, 33);
        }
    }

    public static final int M(int i6, int i7, String str) {
        while (i7 > i6 && AbstractC1120d.r(str.charAt(i7 - 1))) {
            i7--;
        }
        return i7;
    }

    public static final int N(int i6, int i7, String str) {
        while (i6 < i7 && AbstractC1120d.r(str.charAt(i6))) {
            i6++;
        }
        return i6;
    }

    public static final boolean O(Throwable th, InterfaceC1193a interfaceC1193a) {
        List a02;
        Object invoke;
        AbstractC1276k.f(th, "<this>");
        Integer num = AbstractC1021a.a;
        g0.f fVar = null;
        if (num == null || num.intValue() >= 19) {
            Throwable[] suppressed = th.getSuppressed();
            AbstractC1276k.e(suppressed, "getSuppressed(...)");
            a02 = k.a0(suppressed);
        } else {
            Method method = AbstractC1011a.f11762b;
            a02 = (method == null || (invoke = method.invoke(th, null)) == null) ? v.f9812c : k.a0((Throwable[]) invoke);
        }
        int size = a02.size();
        boolean z5 = false;
        for (int i6 = 0; i6 < size; i6++) {
            if (((Throwable) a02.get(i6)) instanceof g0.f) {
                return false;
            }
        }
        try {
            C1013a c1013a = (C1013a) interfaceC1193a.b();
            if (c1013a != null && !c1013a.a.isEmpty()) {
                z5 = true;
            }
            if (z5) {
                AbstractC1276k.c(c1013a);
                fVar = new g0.f(c1013a);
            }
        } catch (Throwable th2) {
            fVar = th2;
        }
        if (fVar != null) {
            X3.a.a(th, fVar);
        }
        return z5;
    }

    public static final long P(long j3, long j4) {
        int d6;
        int f6 = O.f(j3);
        int e6 = O.e(j3);
        if ((O.f(j4) < O.e(j3)) && (O.f(j3) < O.e(j4))) {
            if ((O.f(j4) <= O.f(j3)) && (O.e(j3) <= O.e(j4))) {
                f6 = O.f(j4);
                e6 = f6;
            } else {
                if ((O.f(j3) <= O.f(j4)) && (O.e(j4) <= O.e(j3))) {
                    d6 = O.d(j4);
                } else {
                    int f7 = O.f(j4);
                    if (f6 >= O.e(j4) || f7 > f6) {
                        e6 = O.f(j4);
                    } else {
                        f6 = O.f(j4);
                        d6 = O.d(j4);
                    }
                }
                e6 -= d6;
            }
        } else if (e6 > O.f(j4)) {
            f6 -= O.d(j4);
            d6 = O.d(j4);
            e6 -= d6;
        }
        return F.b(f6, e6);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [u3.c, C3.a] */
    public static final C3.a Q(C1759c c1759c, io.ktor.utils.io.y yVar) {
        AbstractC1276k.f(c1759c, "<this>");
        AbstractC1276k.f(yVar, "content");
        ?? c1759c2 = new C1759c(c1759c.f15161c);
        c1759c2.f15162e = new C3.b(c1759c2, c1759c.d(), 0);
        c1759c2.f15163f = new C3.c(c1759c2, yVar, c1759c.e());
        return c1759c2;
    }

    /* JADX WARN: Removed duplicated region for block: B:193:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x04f5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x03b2  */
    /* JADX WARN: Type inference failed for: r4v37, types: [D.n1, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final I1.B r38, final I1.x r39, final h0.InterfaceC1041r r40, final h0.InterfaceC1028e r41, final l4.c r42, final l4.c r43, final l4.c r44, final l4.c r45, T.C0626q r46, final int r47) {
        /*
            Method dump skipped, instructions count: 2892
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.j.a(I1.B, I1.x, h0.r, h0.e, l4.c, l4.c, l4.c, l4.c, T.q, int):void");
    }

    public static final void b(B b5, InterfaceC1041r interfaceC1041r, InterfaceC1028e interfaceC1028e, l4.c cVar, l4.c cVar2, l4.c cVar3, l4.c cVar4, l4.c cVar5, C0626q c0626q, int i6) {
        InterfaceC1028e interfaceC1028e2;
        InterfaceC1028e interfaceC1028e3;
        c0626q.d0(1840250294);
        int i7 = i6 | (c0626q.h(b5) ? 4 : 2) | (c0626q.f(interfaceC1041r) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS) | 27648 | (c0626q.h(cVar) ? PegdownExtensions.SUPPRESS_INLINE_HTML : PegdownExtensions.SUPPRESS_HTML_BLOCKS) | (c0626q.h(cVar2) ? PegdownExtensions.RELAXEDHRULES : PegdownExtensions.SUBSCRIPT) | (c0626q.h(cVar3) ? PegdownExtensions.EXTANCHORLINKS_WRAP : PegdownExtensions.EXTANCHORLINKS) | (c0626q.h(cVar4) ? PegdownExtensions.MULTI_LINE_IMAGE_URLS : PegdownExtensions.TOC) | 805306368;
        char c6 = c0626q.h(cVar5) ? (char) 4 : (char) 2;
        if ((306783379 & i7) == 306783378 && (c6 & 3) == 2 && c0626q.E()) {
            c0626q.V();
            interfaceC1028e3 = interfaceC1028e;
        } else {
            c0626q.X();
            if ((i6 & 1) == 0 || c0626q.B()) {
                interfaceC1028e2 = C1026c.f11786c;
            } else {
                c0626q.V();
                interfaceC1028e2 = interfaceC1028e;
            }
            c0626q.q();
            boolean z5 = (c6 & 14) == 4;
            Object P5 = c0626q.P();
            if (z5 || P5 == C0616l.a) {
                I1.y yVar = new I1.y(b5.f2518b.f3032s);
                cVar5.f(yVar);
                P5 = yVar.c();
                c0626q.m0(P5);
            }
            int i8 = i7 & 8078;
            int i9 = i7 >> 3;
            int i10 = (i9 & 29360128) | i8 | (57344 & i9) | (458752 & i9) | (3670016 & i9) | 100663296;
            interfaceC1028e3 = interfaceC1028e2;
            a(b5, (x) P5, interfaceC1041r, interfaceC1028e3, cVar, cVar2, cVar3, cVar4, c0626q, i10);
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new s(b5, interfaceC1041r, interfaceC1028e3, cVar, cVar2, cVar3, cVar4, cVar5, i6);
        }
    }

    public static final void c(InterfaceC1041r interfaceC1041r, G2.d dVar, C0626q c0626q, int i6) {
        c0626q.d0(-925036481);
        int i7 = i6 | 6 | (c0626q.h(dVar) ? 32 : 16);
        if (c0626q.S(i7 & 1, (i7 & 19) != 18)) {
            Context context = (Context) c0626q.j(AndroidCompositionLocals_androidKt.f10780b);
            Object[] copyOf = Arrays.copyOf(new H[0], 0);
            e0.k kVar = new e0.k(0, new z(7), new A2.b(context, 1));
            boolean h3 = c0626q.h(context);
            Object P5 = c0626q.P();
            Object obj = C0616l.a;
            if (h3 || P5 == obj) {
                P5 = new A.b(context, 13);
                c0626q.m0(P5);
            }
            B b5 = (B) e0.l.d(copyOf, kVar, (InterfaceC1193a) P5, c0626q, 0, 4);
            C1818y c1818y = t0.f15349c;
            Y y5 = new Y(26);
            Y y6 = new Y(23);
            Y y7 = new Y(25);
            Y y8 = new Y(24);
            boolean h6 = c0626q.h(b5) | ((i7 & 112) == 32 || c0626q.h(dVar));
            Object P6 = c0626q.P();
            if (h6 || P6 == obj) {
                P6 = new X(3, b5, dVar);
                c0626q.m0(P6);
            }
            b(b5, c1818y, null, y5, y6, y7, y8, (l4.c) P6, c0626q, 48);
            interfaceC1041r = C1038o.a;
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new m(i6, 19, interfaceC1041r, dVar);
        }
    }

    public static final String d(Object[] objArr, int i6, int i7, AbstractC0739f abstractC0739f) {
        StringBuilder sb = new StringBuilder((i7 * 3) + 2);
        sb.append("[");
        for (int i8 = 0; i8 < i7; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i6 + i8];
            if (obj == abstractC0739f) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String sb2 = sb.toString();
        AbstractC1276k.e(sb2, "toString(...)");
        return sb2;
    }

    public static final String e(Type type) {
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (!cls.isArray()) {
            return cls.getName();
        }
        t4.h q3 = t4.j.q(type, i.f14821l);
        StringBuilder sb = new StringBuilder();
        sb.append(((Class) t4.j.s(q3)).getName());
        Iterator it = q3.iterator();
        int i6 = 0;
        while (it.hasNext()) {
            it.next();
            i6++;
            if (i6 < 0) {
                Y4.l.T();
                throw null;
            }
        }
        sb.append(u.A("[]", i6));
        return sb.toString();
    }

    public static final void f(Encoder encoder) {
        AbstractC1276k.f(encoder, "<this>");
        if ((encoder instanceof w ? (w) encoder : null) != null) {
            return;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + AbstractC1289x.a(encoder.getClass()));
    }

    public static final void g(n nVar, String str, int i6, int i7, int i8) {
        if (i7 == -1) {
            int N5 = N(i6, i8, str);
            int M5 = M(N5, i8, str);
            if (M5 > N5) {
                String substring = str.substring(N5, M5);
                AbstractC1276k.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                nVar.c(substring, v.f9812c);
                return;
            }
            return;
        }
        int N6 = N(i6, i7, str);
        int M6 = M(N6, i7, str);
        if (M6 > N6) {
            String substring2 = str.substring(N6, M6);
            AbstractC1276k.e(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            int N7 = N(i7 + 1, i8, str);
            String substring3 = str.substring(N7, M(N7, i8, str));
            AbstractC1276k.e(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
            nVar.e(substring2, substring3);
        }
    }

    public static final N4.i h(Decoder decoder) {
        AbstractC1276k.f(decoder, "<this>");
        N4.i iVar = decoder instanceof N4.i ? (N4.i) decoder : null;
        if (iVar != null) {
            return iVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + AbstractC1289x.a(decoder.getClass()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static JSONObject i(String str, String str2, List list) {
        AbstractC1276k.f(str2, "content");
        AbstractC1276k.f(list, "images");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("role", str);
        if (!list.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            if (!AbstractC1776n.Q(str2)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("type", "text");
                jSONObject2.put("text", str2);
                jSONArray.put(jSONObject2);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("type", "image_url");
                jSONObject3.put("image_url", new JSONObject().put("url", str3));
                jSONArray.put(jSONObject3);
            }
            str2 = jSONArray;
        }
        jSONObject.put("content", str2);
        return jSONObject;
    }

    public static final void j(long j3) {
        p[] pVarArr = o.f11579b;
        if ((j3 & 1095216660480L) == 0) {
            e1.i.a("Cannot perform operation for Unspecified type.");
        }
    }

    public static void k(int i6, int i7, int i8) {
        if (i6 < 0 || i7 > i8) {
            StringBuilder j3 = AbstractC1135a.j(i6, "startIndex: ", i7, ", endIndex: ", ", size: ");
            j3.append(i8);
            throw new IndexOutOfBoundsException(j3.toString());
        }
        if (i6 > i7) {
            throw new IllegalArgumentException(B3.e.k("startIndex: ", i6, i7, " > endIndex: "));
        }
    }

    public static void l(int i6, int i7, int i8) {
        if (i6 < 0 || i7 > i8) {
            StringBuilder j3 = AbstractC1135a.j(i6, "fromIndex: ", i7, ", toIndex: ", ", size: ");
            j3.append(i8);
            throw new IndexOutOfBoundsException(j3.toString());
        }
        if (i6 > i7) {
            throw new IllegalArgumentException(B3.e.k("fromIndex: ", i6, i7, " > toIndex: "));
        }
    }

    public static final h o(Class cls, List list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ArrayList arrayList = new ArrayList(Y3.n.Z(list, 10));
            Iterator it = list.iterator();
            if (!it.hasNext()) {
                return new h(cls, null, arrayList);
            }
            it.next().getClass();
            throw new ClassCastException();
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            ArrayList arrayList2 = new ArrayList(Y3.n.Z(list, 10));
            Iterator it2 = list.iterator();
            if (!it2.hasNext()) {
                return new h(cls, declaringClass, arrayList2);
            }
            it2.next().getClass();
            throw new ClassCastException();
        }
        int length = cls.getTypeParameters().length;
        h o5 = o(declaringClass, list.subList(length, list.size()));
        List subList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(Y3.n.Z(subList, 10));
        Iterator it3 = subList.iterator();
        if (!it3.hasNext()) {
            return new h(cls, o5, arrayList3);
        }
        it3.next().getClass();
        throw new ClassCastException();
    }

    public static final ArrayList p(C1013a c1013a) {
        int[] iArr = {201, 202, 204, 206, 207, 125, -127, 126665345, 200};
        List list = c1013a.a;
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i6 = 0;
        while (i6 < size) {
            int i7 = i6 + 1;
            C1014b c1014b = (C1014b) list.get(i6);
            if (!k.d0(iArr, c1014b.a)) {
                if (c1014b.a == 100) {
                    int i8 = i6 + 2;
                    if (i8 < size && ((C1014b) list.get(i8)).a == 1000) {
                        break;
                    }
                    r.g0(arrayList);
                } else {
                    arrayList.add(c1014b);
                }
            }
            i6 = i7;
        }
        return arrayList;
    }

    public static final long q(float f6, int i6, long j3, boolean z5) {
        int h3 = ((z5 || i6 == 2 || i6 == 4 || i6 == 5) && C0959a.d(j3)) ? C0959a.h(j3) : TableCell.NOT_TRACKED;
        if (C0959a.j(j3) != h3) {
            h3 = AbstractC1117a.f(AbstractC0090r0.o(f6), C0959a.j(j3), h3);
        }
        return s(0, h3, 0, C0959a.g(j3));
    }

    public static long r(int i6, int i7, int i8, int i9) {
        int i10 = 262142;
        int min = Math.min(i8, 262142);
        int i11 = TableCell.NOT_TRACKED;
        int min2 = i9 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i9, 262142);
        int i12 = min2 == Integer.MAX_VALUE ? min : min2;
        if (i12 >= 8191) {
            if (i12 < 32767) {
                i10 = 65534;
            } else if (i12 < 65535) {
                i10 = 32766;
            } else {
                if (i12 >= 262143) {
                    AbstractC0960b.l(i12);
                    throw new RuntimeException();
                }
                i10 = 8190;
            }
        }
        if (i7 != Integer.MAX_VALUE) {
            i11 = Math.min(i10, i7);
        }
        return AbstractC0960b.a(Math.min(i10, i6), i11, min, min2);
    }

    public static long s(int i6, int i7, int i8, int i9) {
        int i10 = 262142;
        int min = Math.min(i6, 262142);
        int i11 = TableCell.NOT_TRACKED;
        int min2 = i7 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i7, 262142);
        int i12 = min2 == Integer.MAX_VALUE ? min : min2;
        if (i12 >= 8191) {
            if (i12 < 32767) {
                i10 = 65534;
            } else if (i12 < 65535) {
                i10 = 32766;
            } else {
                if (i12 >= 262143) {
                    AbstractC0960b.l(i12);
                    throw new RuntimeException();
                }
                i10 = 8190;
            }
        }
        if (i9 != Integer.MAX_VALUE) {
            i11 = Math.min(i10, i9);
        }
        return AbstractC0960b.a(min, min2, Math.min(i10, i8), i11);
    }

    public static final U1.e t(View view) {
        AbstractC1276k.f(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            U1.e eVar = tag instanceof U1.e ? (U1.e) tag : null;
            if (eVar != null) {
                return eVar;
            }
            Object j3 = io.ktor.utils.io.u.j(view);
            view = j3 instanceof View ? (View) j3 : null;
        }
        return null;
    }

    public static final int u(W0.k kVar, int i6) {
        boolean z5 = AbstractC1276k.g(kVar.f8840c, W0.k.f8831e.f8840c) >= 0;
        boolean z6 = i6 == 1;
        if (z6 && z5) {
            return 3;
        }
        if (z5) {
            return 1;
        }
        return z6 ? 2 : 0;
    }

    public static final InterfaceC1672b v(SerialDescriptor serialDescriptor) {
        AbstractC1276k.f(serialDescriptor, "<this>");
        if (serialDescriptor instanceof K4.b) {
            return ((K4.b) serialDescriptor).f2946b;
        }
        if (serialDescriptor instanceof j0) {
            return v(((j0) serialDescriptor).a);
        }
        return null;
    }

    public static final Type w(C1265A c1265a) {
        Class o5 = AbstractC1117a.o(c1265a.a);
        List list = Collections.EMPTY_LIST;
        if (!list.isEmpty()) {
            if (!o5.isArray()) {
                return o(o5, list);
            }
            if (!o5.getComponentType().isPrimitive()) {
                if (Y3.m.E0(list) != null) {
                    throw new ClassCastException();
                }
                throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + c1265a);
            }
        }
        return o5;
    }

    public static final long x(X1.a aVar) {
        X1.c c02 = aVar.c0("SELECT changes()");
        try {
            c02.Z();
            int i6 = (int) c02.getLong(0);
            AbstractC1120d.h(c02, null);
            if (i6 == 0) {
                return -1L;
            }
            c02 = aVar.c0("SELECT last_insert_rowid()");
            try {
                c02.Z();
                long j3 = c02.getLong(0);
                AbstractC1120d.h(c02, null);
                return j3;
            } finally {
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    public static final long y(double d6) {
        return B((float) d6, 4294967296L);
    }

    public static final long z(int i6) {
        return B(i6, 4294967296L);
    }

    public abstract void R(A a6);

    public abstract long m();

    public abstract Q4.r n();
}
