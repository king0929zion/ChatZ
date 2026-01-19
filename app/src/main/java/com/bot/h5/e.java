package h5;

import A4.C0010k;
import A4.M;
import A4.W;
import B0.G;
import I1.AbstractC0230i;
import I1.C0228g;
import I1.I;
import I3.C0241e;
import I3.m;
import I3.s;
import I3.t;
import J1.j;
import L1.l;
import M4.AbstractC0252a0;
import M4.F;
import M4.e0;
import N1.C0286h;
import N1.Q;
import N1.x;
import N3.i;
import O4.w;
import T.A;
import T.C0602e;
import T.C0616l;
import T.C0626q;
import T.C0627q0;
import T.InterfaceC0598c;
import T.M0;
import T.X;
import T.r;
import X3.y;
import Y3.C;
import Y3.v;
import Z3.h;
import android.content.res.Resources;
import android.database.SQLException;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC0846u;
import b.C0853B;
import b.InterfaceC0854C;
import b.u;
import b0.C0873f;
import b4.InterfaceC0908f;
import b4.InterfaceC0910h;
import c.f;
import c.n;
import c.o;
import c.p;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import e1.k;
import i4.AbstractC1120d;
import j1.AbstractC1135a;
import java.io.EOFException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.JsonNull;
import m4.AbstractC1276k;
import m4.AbstractC1289x;
import m4.AbstractC1291z;
import m4.C1270e;
import n0.C1354c;
import org.jsoup.helper.HttpConnection;
import s4.InterfaceC1672b;
import t3.C1727b;
import u4.AbstractC1776n;
import x3.C1877a;
import x3.C1883g;
import x4.C1940w;
import x4.InterfaceC1922e0;
import x4.InterfaceC1942y;
import z3.K;
import z3.N;

/* loaded from: classes.dex */
public abstract class e implements Decoder, L4.a {
    public static d a = null;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f11928b = false;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f11929c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f11930d = 0;

    public static final k E(long j3, long j4) {
        int i6 = (int) (j3 >> 32);
        int i7 = (int) (j3 & 4294967295L);
        return new k(i6, i7, ((int) (j4 >> 32)) + i6, ((int) (j4 & 4294967295L)) + i7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [c.n, b.u, java.lang.Object] */
    public static final void F(boolean z5, l4.e eVar, C0626q c0626q, int i6) {
        int i7;
        c0626q.d0(-642000585);
        if ((i6 & 6) == 0) {
            i7 = (c0626q.g(z5) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= c0626q.h(eVar) ? 32 : 16;
        }
        if ((i7 & 19) == 18 && c0626q.E()) {
            c0626q.V();
        } else {
            X E5 = r.E(eVar, c0626q);
            Object P5 = c0626q.P();
            C0602e c0602e = C0616l.a;
            if (P5 == c0602e) {
                A a6 = new A(r.p(c0626q));
                c0626q.m0(a6);
                P5 = a6;
            }
            InterfaceC1942y interfaceC1942y = ((A) P5).f7930c;
            Object P6 = c0626q.P();
            Object obj = P6;
            if (P6 == c0602e) {
                l4.e eVar2 = (l4.e) E5.getValue();
                ?? uVar = new u(z5);
                uVar.f11089d = interfaceC1942y;
                uVar.f11090e = eVar2;
                c0626q.m0(uVar);
                obj = uVar;
            }
            n nVar = (n) obj;
            boolean f6 = c0626q.f((l4.e) E5.getValue()) | c0626q.f(interfaceC1942y);
            Object P7 = c0626q.P();
            if (f6 || P7 == c0602e) {
                nVar.f11090e = (l4.e) E5.getValue();
                nVar.f11089d = interfaceC1942y;
                c0626q.m0(y.a);
            }
            Boolean valueOf = Boolean.valueOf(z5);
            boolean h3 = ((i7 & 14) == 4) | c0626q.h(nVar);
            Object P8 = c0626q.P();
            if (h3 || P8 == c0602e) {
                P8 = new o(nVar, z5, null);
                c0626q.m0(P8);
            }
            r.f(c0626q, valueOf, (l4.e) P8);
            InterfaceC0854C a7 = c.k.a(c0626q);
            if (a7 == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
            C0853B a8 = a7.a();
            InterfaceC0846u interfaceC0846u = (InterfaceC0846u) c0626q.j(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            boolean h6 = c0626q.h(a8) | c0626q.h(interfaceC0846u) | c0626q.h(nVar);
            Object P9 = c0626q.P();
            if (h6 || P9 == c0602e) {
                P9 = new f(a8, interfaceC0846u, nVar, 1);
                c0626q.m0(P9);
            }
            r.c(interfaceC0846u, a8, (l4.c) P9, c0626q);
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new p(z5, eVar, i6);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x003e -> B:10:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object G(B0.V r6, d4.a r7) {
        /*
            boolean r0 = r7 instanceof H.a
            if (r0 == 0) goto L13
            r0 = r7
            H.a r0 = (H.a) r0
            int r1 = r0.f1682i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1682i = r1
            goto L18
        L13:
            H.a r0 = new H.a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f1681h
            int r1 = r0.f1682i
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            B0.V r6 = r0.f1680g
            X3.a.e(r7)
            goto L41
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            X3.a.e(r7)
        L32:
            r0.f1680g = r6
            r0.f1682i = r2
            B0.q r7 = B0.EnumC0041q.f476e
            java.lang.Object r7 = r6.b(r7, r0)
            c4.a r1 = c4.EnumC0927a.f11114c
            if (r7 != r1) goto L41
            return r1
        L41:
            B0.p r7 = (B0.C0040p) r7
            int r1 = r7.f472d
            java.lang.Object r7 = r7.a
            r1 = r1 & 66
            if (r1 == 0) goto L32
            int r1 = r7.size()
            r3 = 0
            r4 = r3
        L51:
            if (r4 >= r1) goto L63
            java.lang.Object r5 = r7.get(r4)
            B0.y r5 = (B0.y) r5
            boolean r5 = B0.AbstractC0047x.a(r5)
            if (r5 != 0) goto L60
            goto L32
        L60:
            int r4 = r4 + 1
            goto L51
        L63:
            java.lang.Object r6 = r7.get(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.e.G(B0.V, d4.a):java.lang.Object");
    }

    public static h H(h hVar) {
        Z3.f fVar = hVar.f10542c;
        fVar.b();
        return fVar.f10534l > 0 ? hVar : h.f10541e;
    }

    public static final i I(String str) {
        AbstractC1276k.f(str, "<this>");
        return new i(str);
    }

    public static int J(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static void K(I1.y yVar, String str, List list, C0873f c0873f, int i6) {
        if ((i6 & 2) != 0) {
            list = v.f9812c;
        }
        I i7 = yVar.f2601f;
        i7.getClass();
        j jVar = new j((J1.i) i7.b(AbstractC0230i.d(J1.i.class)), str, c0873f);
        for (C0228g c0228g : list) {
            jVar.f2596c.put(c0228g.a, c0228g.f2541b);
        }
        yVar.f2603h.add(jVar.a());
    }

    public static final C0241e L(s sVar) {
        AbstractC1276k.f(sVar, "<this>");
        m a6 = sVar.a();
        List list = I3.r.a;
        String d6 = a6.d(HttpConnection.CONTENT_TYPE);
        if (d6 == null) {
            return null;
        }
        C0241e c0241e = C0241e.f2741f;
        return Y4.d.N(d6);
    }

    public static final C0241e M(t tVar) {
        AbstractC1276k.f(tVar, "<this>");
        I3.n a6 = tVar.a();
        List list = I3.r.a;
        String j3 = a6.j(HttpConnection.CONTENT_TYPE);
        if (j3 == null) {
            return null;
        }
        C0241e c0241e = C0241e.f2741f;
        return Y4.d.N(j3);
    }

    public static final void N(E3.d dVar, C0241e c0241e) {
        AbstractC1276k.f(c0241e, "type");
        I3.n nVar = dVar.f1306c;
        List list = I3.r.a;
        String abstractC0173b = c0241e.toString();
        nVar.getClass();
        AbstractC1276k.f(abstractC0173b, "value");
        nVar.s(abstractC0173b);
        List i6 = nVar.i(HttpConnection.CONTENT_TYPE);
        i6.clear();
        i6.add(abstractC0173b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [x3.b, java.lang.Object] */
    public static t3.d O(final long j3, final long j4, final long j5, l4.c cVar) {
        t3.f fVar = new t3.f();
        fVar.a(N.f16254d, new l4.c() { // from class: E2.a
            @Override // l4.c
            public final Object f(Object obj) {
                K k3 = (K) obj;
                AbstractC1276k.f(k3, "$this$install");
                Long valueOf = Long.valueOf(j3);
                K.a(valueOf);
                k3.f16248b = valueOf;
                Long valueOf2 = Long.valueOf(j4);
                K.a(valueOf2);
                k3.a = valueOf2;
                Long valueOf3 = Long.valueOf(j5);
                K.a(valueOf3);
                k3.f16249c = valueOf3;
                return y.a;
            }
        });
        cVar.f(fVar);
        C1727b c1727b = fVar.f14935d;
        AbstractC1276k.f(c1727b, "block");
        ?? obj = new Object();
        obj.a = C1877a.f15600f;
        obj.f15603b = 10;
        c1727b.f(obj);
        C1883g c1883g = new C1883g(obj);
        t3.d dVar = new t3.d(c1883g, fVar);
        InterfaceC0908f r5 = dVar.f14924g.r(C1940w.f15731e);
        AbstractC1276k.c(r5);
        ((InterfaceC1922e0) r5).S(new G(c1883g, 29));
        return dVar;
    }

    public static final M P(N1.v vVar, String[] strArr, l4.c cVar) {
        AbstractC1276k.f(vVar, "db");
        C0286h d6 = vVar.d();
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        AbstractC1276k.f(strArr2, "tables");
        Q q3 = d6.f3744b;
        q3.getClass();
        h hVar = new h();
        for (String str : strArr2) {
            LinkedHashMap linkedHashMap = q3.f3710c;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            AbstractC1276k.e(lowerCase, "toLowerCase(...)");
            Set set = (Set) linkedHashMap.get(lowerCase);
            if (set != null) {
                hVar.addAll(set);
            } else {
                hVar.add(str);
            }
        }
        String[] strArr3 = (String[]) H(hVar).toArray(new String[0]);
        int length = strArr3.length;
        int[] iArr = new int[length];
        for (int i6 = 0; i6 < length; i6++) {
            String str2 = strArr3[i6];
            LinkedHashMap linkedHashMap2 = q3.f3713f;
            String lowerCase2 = str2.toLowerCase(Locale.ROOT);
            AbstractC1276k.e(lowerCase2, "toLowerCase(...)");
            Integer num = (Integer) linkedHashMap2.get(lowerCase2);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name ".concat(str2));
            }
            iArr[i6] = num.intValue();
        }
        X3.i iVar = new X3.i(strArr3, iArr);
        String[] strArr4 = (String[]) iVar.f9393c;
        int[] iArr2 = (int[]) iVar.f9394e;
        AbstractC1276k.f(strArr4, "resolvedTableNames");
        AbstractC1276k.f(iArr2, "tableIds");
        return new M(W.e(new C0010k(new N1.G(q3, iArr2, strArr4, null)), -1), vVar, cVar);
    }

    public static final boolean R(String str, String str2) {
        AbstractC1276k.f(str, "current");
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                if (i6 < str.length()) {
                    char charAt = str.charAt(i6);
                    int i9 = i8 + 1;
                    if (i8 == 0 && charAt != '(') {
                        break;
                    }
                    if (charAt == '(') {
                        i7++;
                    } else if (charAt == ')' && i7 - 1 == 0 && i8 != str.length() - 1) {
                        break;
                    }
                    i6++;
                    i8 = i9;
                } else if (i7 == 0) {
                    String substring = str.substring(1, str.length() - 1);
                    AbstractC1276k.e(substring, "substring(...)");
                    return AbstractC1276k.b(AbstractC1776n.l0(substring).toString(), str2);
                }
            }
        }
        return false;
    }

    public static final void S(String str, X1.a aVar) {
        AbstractC1276k.f(aVar, "<this>");
        AbstractC1276k.f(str, "sql");
        X1.c c02 = aVar.c0(str);
        try {
            c02.Z();
            AbstractC1120d.h(c02, null);
        } finally {
        }
    }

    public static final void T(I4.c cVar, L4.a aVar, String str) {
        AbstractC1276k.f(cVar, "<this>");
        F2.h a6 = aVar.a();
        InterfaceC1672b interfaceC1672b = cVar.a;
        a6.getClass();
        AbstractC1276k.f(interfaceC1672b, "baseClass");
        AbstractC1291z.d(1, null);
        AbstractC0252a0.k(str, interfaceC1672b);
        throw null;
    }

    public static final void U(I4.c cVar, w wVar, Object obj) {
        AbstractC1276k.f(cVar, "<this>");
        AbstractC1276k.f(obj, "value");
        F2.h a6 = wVar.a();
        InterfaceC1672b interfaceC1672b = cVar.a;
        a6.getClass();
        AbstractC1276k.f(interfaceC1672b, "baseClass");
        if (((C1270e) interfaceC1672b).d(obj)) {
            AbstractC1291z.d(1, null);
        }
        C1270e a7 = AbstractC1289x.a(obj.getClass());
        String c6 = a7.c();
        if (c6 == null) {
            c6 = String.valueOf(a7);
        }
        AbstractC0252a0.k(c6, interfaceC1672b);
        throw null;
    }

    public static final String V(Collection collection) {
        AbstractC1276k.f(collection, "collection");
        if (collection.isEmpty()) {
            return " }";
        }
        return u4.o.p(Y3.m.v0(collection, ",\n", SequenceUtils.EOL, SequenceUtils.EOL, null, 56)) + "},";
    }

    public static Q4.r W(String str) {
        AbstractC1276k.f(str, "<this>");
        Matcher matcher = Q4.r.f6573b.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException(B3.e.g('\"', "No subtype found for: \"", str).toString());
        }
        String group = matcher.group(1);
        AbstractC1276k.e(group, "typeSubtype.group(1)");
        Locale locale = Locale.US;
        AbstractC1276k.e(locale, "US");
        AbstractC1276k.e(group.toLowerCase(locale), "this as java.lang.String).toLowerCase(locale)");
        String group2 = matcher.group(2);
        AbstractC1276k.e(group2, "typeSubtype.group(2)");
        AbstractC1276k.e(group2.toLowerCase(locale), "this as java.lang.String).toLowerCase(locale)");
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = Q4.r.f6574c.matcher(str);
        int end = matcher.end();
        while (end < str.length()) {
            matcher2.region(end, str.length());
            if (!matcher2.lookingAt()) {
                StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                String substring = str.substring(end);
                AbstractC1276k.e(substring, "this as java.lang.String).substring(startIndex)");
                sb.append(substring);
                sb.append("\" for: \"");
                throw new IllegalArgumentException(B3.e.r(sb, str, '\"').toString());
            }
            String group3 = matcher2.group(1);
            if (group3 == null) {
                end = matcher2.end();
            } else {
                String group4 = matcher2.group(2);
                if (group4 == null) {
                    group4 = matcher2.group(3);
                } else if (u4.u.D(group4, "'", false) && u4.u.w(group4, "'", false) && group4.length() > 2) {
                    group4 = group4.substring(1, group4.length() - 1);
                    AbstractC1276k.e(group4, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                arrayList.add(group3);
                arrayList.add(group4);
                end = matcher2.end();
            }
        }
        return new Q4.r(str);
    }

    public static final InterfaceC0910h X(N1.v vVar, boolean z5, d4.c cVar) {
        if (!vVar.g()) {
            C4.c cVar2 = vVar.a;
            if (cVar2 != null) {
                return cVar2.f686c;
            }
            AbstractC1276k.k("coroutineScope");
            throw null;
        }
        if (cVar.o().r(x.f3797c) != null) {
            throw new ClassCastException();
        }
        if (z5) {
            InterfaceC0910h interfaceC0910h = vVar.f3787b;
            if (interfaceC0910h != null) {
                return interfaceC0910h;
            }
            AbstractC1276k.k("transactionContext");
            throw null;
        }
        C4.c cVar3 = vVar.a;
        if (cVar3 != null) {
            return cVar3.f686c;
        }
        AbstractC1276k.k("coroutineScope");
        throw null;
    }

    public static final int Y(int i6, int i7, int i8) {
        if (i8 > 0) {
            if (i6 < i7) {
                int i9 = i7 % i8;
                if (i9 < 0) {
                    i9 += i8;
                }
                int i10 = i6 % i8;
                if (i10 < 0) {
                    i10 += i8;
                }
                int i11 = (i9 - i10) % i8;
                if (i11 < 0) {
                    i11 += i8;
                }
                return i7 - i11;
            }
        } else {
            if (i8 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i6 > i7) {
                int i12 = -i8;
                int i13 = i6 % i12;
                if (i13 < 0) {
                    i13 += i12;
                }
                int i14 = i7 % i12;
                if (i14 < 0) {
                    i14 += i12;
                }
                int i15 = (i13 - i14) % i12;
                if (i15 < 0) {
                    i15 += i12;
                }
                return i15 + i7;
            }
        }
        return i7;
    }

    public static final int Z(int i6, int i7) {
        return (i6 >> i7) & 31;
    }

    public static final void a0(String str) {
        AbstractC1276k.f(str, "key");
        throw new IllegalArgumentException(AbstractC1135a.s("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b0(J3.d r4, io.ktor.utils.io.t r5, d4.c r6) {
        /*
            boolean r0 = r6 instanceof B3.t
            if (r0 == 0) goto L13
            r0 = r6
            B3.t r0 = (B3.t) r0
            int r1 = r0.f559j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f559j = r1
            goto L18
        L13:
            B3.t r0 = new B3.t
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f558i
            int r1 = r0.f559j
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            io.ktor.utils.io.t r5 = r0.f557h
            J3.b r4 = r0.f556g
            X3.a.e(r6)
            goto L59
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            X3.a.e(r6)
            boolean r6 = r4 instanceof J3.b
            if (r6 == 0) goto L5d
            r6 = r4
            J3.b r6 = (J3.b) r6
            byte[] r6 = r6.e()
            r1 = r4
            J3.b r1 = (J3.b) r1
            r0.f556g = r1
            r0.f557h = r5
            r0.f559j = r2
            int r1 = r6.length
            java.lang.Object r6 = r5.V(r6, r1, r0)
            c4.a r0 = c4.EnumC0927a.f11114c
            if (r6 != r0) goto L52
            goto L54
        L52:
            X3.y r6 = X3.y.a
        L54:
            c4.a r0 = c4.EnumC0927a.f11114c
            if (r6 != r0) goto L59
            return r0
        L59:
            i4.AbstractC1121e.h(r5)
            return r4
        L5d:
            boolean r6 = r4 instanceof J3.c
            if (r6 == 0) goto L9b
            io.ktor.utils.io.t r6 = new io.ktor.utils.io.t
            io.ktor.utils.io.internal.e r0 = io.ktor.utils.io.internal.f.f12171c
            r1 = 8
            r2 = 0
            r6.<init>(r2, r0, r1)
            r0 = r4
            J3.c r0 = (J3.c) r0
            io.ktor.utils.io.y r0 = r0.e()
            java.lang.String r1 = "<this>"
            m4.AbstractC1276k.f(r0, r1)
            java.lang.String r1 = "first"
            m4.AbstractC1276k.f(r5, r1)
            x4.A0 r1 = x4.AbstractC1898K.f15658b
            N3.b r2 = new N3.b
            r3 = 0
            r2.<init>(r0, r5, r6, r3)
            r0 = 2
            x4.Y r3 = x4.C1911Y.f15677c
            x4.s0 r0 = x4.AbstractC1888A.y(r3, r1, r2, r0)
            B0.F r1 = new B0.F
            r2 = 9
            r1.<init>(r2, r5, r6)
            r0.S(r1)
            B3.f r5 = new B3.f
            r5.<init>(r4, r6)
            return r5
        L9b:
            i4.AbstractC1121e.h(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.e.b0(J3.d, io.ktor.utils.io.t, d4.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c0(N1.v r15, b4.InterfaceC0905c r16, l4.c r17, boolean r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.e.c0(N1.v, b4.c, l4.c, boolean, boolean):java.lang.Object");
    }

    public static final boolean d0(String str) {
        AbstractC1276k.f(str, "method");
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    public static final void e0(M0 m02, InterfaceC0598c interfaceC0598c, int i6) {
        while (true) {
            int i7 = m02.f8006v;
            if (i6 > i7 && i6 < m02.f8005u) {
                return;
            }
            if (i7 == 0 && i6 == 0) {
                return;
            }
            m02.M();
            if (m02.y(m02.f8006v)) {
                interfaceC0598c.j();
            }
            m02.j();
        }
    }

    public static final void f0(V3.b bVar, byte[] bArr, int i6, int i7) {
        ByteBuffer byteBuffer = bVar.a;
        int i8 = bVar.f8662b;
        if (bVar.f8663c - i8 < i7) {
            throw new EOFException("Not enough bytes to read a byte array of size " + i7 + '.');
        }
        AbstractC1276k.f(byteBuffer, "$this$copyTo");
        if (!byteBuffer.hasArray() || byteBuffer.isReadOnly()) {
            byteBuffer.duplicate().get(bArr, i6, i7);
        } else {
            System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset() + i8, bArr, i6, i7);
        }
        bVar.c(i7);
    }

    public static final void g0(String str) {
        System.err.println("SLF4J: " + str);
    }

    public static final k h0(C1354c c1354c) {
        return new k(Math.round(c1354c.a), Math.round(c1354c.f13295b), Math.round(c1354c.f13296c), Math.round(c1354c.f13297d));
    }

    public static Set i0(Object obj) {
        Set singleton = Collections.singleton(obj);
        AbstractC1276k.e(singleton, "singleton(...)");
        return singleton;
    }

    public static final String j0(int i6, C0626q c0626q) {
        return ((Resources) c0626q.j(AndroidCompositionLocals_androidKt.f10781c)).getString(i6);
    }

    public static final String k0(int i6, Object[] objArr, C0626q c0626q) {
        return ((Resources) c0626q.j(AndroidCompositionLocals_androidKt.f10781c)).getString(i6, Arrays.copyOf(objArr, objArr.length));
    }

    public static final void l0(int i6, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Error code: " + i6);
        if (str != null) {
            sb.append(", message: ".concat(str));
        }
        throw new SQLException(sb.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Serializable m0(kotlinx.serialization.json.b bVar) {
        Serializable serializable = null;
        if (bVar instanceof JsonNull) {
            return null;
        }
        if (!(bVar instanceof kotlinx.serialization.json.d)) {
            if (bVar instanceof kotlinx.serialization.json.a) {
                Iterable iterable = (Iterable) bVar;
                ArrayList arrayList = new ArrayList(Y3.n.Z(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(m0((kotlinx.serialization.json.b) it.next()));
                }
                return arrayList;
            }
            if (!(bVar instanceof kotlinx.serialization.json.c)) {
                throw new RuntimeException();
            }
            Map map = (Map) bVar;
            LinkedHashMap linkedHashMap = new LinkedHashMap(C.H(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), m0((kotlinx.serialization.json.b) entry.getValue()));
            }
            return linkedHashMap;
        }
        kotlinx.serialization.json.d dVar = (kotlinx.serialization.json.d) bVar;
        if (dVar.b()) {
            return dVar.a();
        }
        F f6 = N4.j.a;
        String a6 = dVar.a();
        String[] strArr = O4.y.a;
        AbstractC1276k.f(a6, "<this>");
        if ((a6.equalsIgnoreCase("true") ? Boolean.TRUE : a6.equalsIgnoreCase("false") ? Boolean.FALSE : null) == null) {
            try {
                serializable = Long.valueOf(new l(dVar.a()).i());
            } catch (O4.i unused) {
            }
            return serializable != null ? Long.valueOf(N4.j.f(dVar)) : u4.t.u(dVar.a()) != null ? Double.valueOf(Double.parseDouble(dVar.a())) : dVar.a();
        }
        String a7 = dVar.a();
        AbstractC1276k.f(a7, "<this>");
        if (a7.equalsIgnoreCase("true")) {
            serializable = Boolean.TRUE;
        } else if (a7.equalsIgnoreCase("false")) {
            serializable = Boolean.FALSE;
        }
        if (serializable != null) {
            return serializable;
        }
        throw new IllegalStateException(dVar + " does not represent a Boolean");
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public float A() {
        Q();
        throw null;
    }

    @Override // L4.a
    public float B(SerialDescriptor serialDescriptor, int i6) {
        AbstractC1276k.f(serialDescriptor, "descriptor");
        return A();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public double C() {
        Q();
        throw null;
    }

    @Override // L4.a
    public double D(e0 e0Var, int i6) {
        AbstractC1276k.f(e0Var, "descriptor");
        return C();
    }

    public void Q() {
        throw new IllegalArgumentException(AbstractC1289x.a(getClass()) + " can't retrieve untyped values");
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public L4.a b(SerialDescriptor serialDescriptor) {
        AbstractC1276k.f(serialDescriptor, "descriptor");
        return this;
    }

    @Override // L4.a
    public Decoder c(e0 e0Var, int i6) {
        AbstractC1276k.f(e0Var, "descriptor");
        return u(e0Var.j(i6));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean d() {
        Q();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public char e() {
        Q();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public int f(SerialDescriptor serialDescriptor) {
        AbstractC1276k.f(serialDescriptor, "enumDescriptor");
        Q();
        throw null;
    }

    @Override // L4.a
    public long g(SerialDescriptor serialDescriptor, int i6) {
        AbstractC1276k.f(serialDescriptor, "descriptor");
        return n();
    }

    public void h(SerialDescriptor serialDescriptor) {
        AbstractC1276k.f(serialDescriptor, "descriptor");
    }

    @Override // L4.a
    public byte j(e0 e0Var, int i6) {
        AbstractC1276k.f(e0Var, "descriptor");
        return y();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract int k();

    @Override // L4.a
    public int l(SerialDescriptor serialDescriptor, int i6) {
        AbstractC1276k.f(serialDescriptor, "descriptor");
        return k();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public String m() {
        Q();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract long n();

    @Override // L4.a
    public boolean o(SerialDescriptor serialDescriptor, int i6) {
        AbstractC1276k.f(serialDescriptor, "descriptor");
        return d();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public Object p(KSerializer kSerializer) {
        AbstractC1276k.f(kSerializer, "deserializer");
        return kSerializer.deserialize(this);
    }

    @Override // L4.a
    public String q(SerialDescriptor serialDescriptor, int i6) {
        AbstractC1276k.f(serialDescriptor, "descriptor");
        return m();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean r() {
        return true;
    }

    @Override // L4.a
    public Object t(SerialDescriptor serialDescriptor, int i6, KSerializer kSerializer, Object obj) {
        AbstractC1276k.f(serialDescriptor, "descriptor");
        AbstractC1276k.f(kSerializer, "deserializer");
        if (kSerializer.getDescriptor().c() || r()) {
            return p(kSerializer);
        }
        return null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public Decoder u(SerialDescriptor serialDescriptor) {
        AbstractC1276k.f(serialDescriptor, "descriptor");
        return this;
    }

    @Override // L4.a
    public char v(e0 e0Var, int i6) {
        AbstractC1276k.f(e0Var, "descriptor");
        return e();
    }

    @Override // L4.a
    public short w(e0 e0Var, int i6) {
        AbstractC1276k.f(e0Var, "descriptor");
        return z();
    }

    public Object x(SerialDescriptor serialDescriptor, int i6, KSerializer kSerializer, Object obj) {
        AbstractC1276k.f(serialDescriptor, "descriptor");
        AbstractC1276k.f(kSerializer, "deserializer");
        return p(kSerializer);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract byte y();

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract short z();
}
