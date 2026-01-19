package D;

import B0.C0025a;
import F0.InterfaceC0134w;
import H0.C0148f;
import H0.C0150g;
import H0.C0158m;
import H0.InterfaceC0152h;
import I0.AbstractC0204q0;
import O.AbstractC0336u0;
import O.C0323n0;
import O.C0325o0;
import O.C0332s0;
import O.InterfaceC0331s;
import S0.AbstractC0546h;
import S0.C0539a;
import S0.C0543e;
import S0.C0545g;
import S0.C0554p;
import T.C0602e;
import T.C0607g0;
import T.C0616l;
import T.C0626q;
import T.C0627q0;
import T.InterfaceC0617l0;
import android.text.Spanned;
import android.view.KeyEvent;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b0.C0873f;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import com.vladsch.flexmark.parser.PegdownExtensions;
import com.vladsch.flexmark.util.format.TableCell;
import e1.InterfaceC0961c;
import f0.AbstractC0983f;
import f0.AbstractC0997t;
import h0.AbstractC1024a;
import h0.C1026c;
import h0.C1038o;
import h0.InterfaceC1041r;
import i4.AbstractC1117a;
import i4.AbstractC1120d;
import j1.AbstractC1135a;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import n0.C1354c;
import u.AbstractC1734b;
import v.AbstractC1806l;
import x4.AbstractC1888A;
import z0.AbstractC2015c;

/* renamed from: D.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0090r0 {
    public static final C0085o0 a = new C0085o0(1);

    /* renamed from: b, reason: collision with root package name */
    public static final C0025a f1149b = new C0025a(1022);

    /* renamed from: c, reason: collision with root package name */
    public static final n1 f1150c = new n1(0, 0);

    /* JADX WARN: Type inference failed for: r3v0, types: [m4.w, java.lang.Object] */
    public static final void A(X0.w wVar, C0098v0 c0098v0, X0.v vVar, X0.k kVar, X0.p pVar) {
        M.q qVar = c0098v0.f1185d;
        Q q3 = c0098v0.f1203v;
        Q q5 = c0098v0.f1204w;
        Object obj = new Object();
        C0091s c0091s = new C0091s(3, qVar, (Object) obj, q3);
        X0.q qVar2 = wVar.a;
        qVar2.e(vVar, kVar, c0091s, q5);
        X0.A a6 = new X0.A(wVar, qVar2);
        wVar.f9127b.set(a6);
        obj.f12973c = a6;
        c0098v0.f1186e = a6;
        y(c0098v0, vVar, pVar);
    }

    public static final InterfaceC1041r B(InterfaceC1041r interfaceC1041r, C0545g c0545g, S0.P p5, l4.c cVar, int i6, boolean z5, int i7, int i8, W0.d dVar, List list, l4.c cVar2, N.i iVar, l4.c cVar3) {
        if (iVar == null) {
            return interfaceC1041r.c(C1038o.a).c(new N.n(c0545g, p5, dVar, cVar, i6, z5, i7, i8, list, cVar2, cVar3));
        }
        return interfaceC1041r.c(iVar.f3572i).c(new N.f(c0545g, p5, dVar, cVar, i6, z5, i7, i8, list, cVar2, iVar));
    }

    public static final void C(int i6, int i7) {
        if (i6 <= 0 || i7 <= 0) {
            AbstractC1734b.a("both minLines " + i6 + " and maxLines " + i7 + " must be greater than zero");
        }
        if (i6 <= i7) {
            return;
        }
        AbstractC1734b.a("minLines " + i6 + " must be less than or equal to maxLines " + i7);
    }

    public static final void D(int i6, int i7, int i8) {
        boolean z5 = false;
        if (i6 >= 0 && i6 <= i7) {
            z5 = true;
        }
        if (z5) {
            return;
        }
        StringBuilder j3 = AbstractC1135a.j(i8, "OffsetMapping.originalToTransformed returned invalid mapping: ", i6, " -> ", " is not in range of transformed text [0, ");
        j3.append(i7);
        j3.append(']');
        AbstractC1734b.c(j3.toString());
    }

    public static final void E(int i6, int i7, int i8) {
        boolean z5 = false;
        if (i6 >= 0 && i6 <= i7) {
            z5 = true;
        }
        if (z5) {
            return;
        }
        StringBuilder j3 = AbstractC1135a.j(i8, "OffsetMapping.transformedToOriginal returned invalid mapping: ", i6, " -> ", " is not in range of original text [0, ");
        j3.append(i7);
        j3.append(']');
        AbstractC1734b.c(j3.toString());
    }

    public static final void a(final C0545g c0545g, final InterfaceC1041r interfaceC1041r, final S0.P p5, final l4.c cVar, final int i6, final boolean z5, final int i7, final int i8, final Map map, C0626q c0626q, final int i9, final int i10) {
        int i11;
        N.i iVar;
        int i12;
        boolean z6;
        C0626q c0626q2 = c0626q;
        c0626q2.d0(-1343466571);
        int i13 = (i9 & 6) == 0 ? (c0626q2.f(c0545g) ? 4 : 2) | i9 : i9;
        if ((i9 & 48) == 0) {
            i13 |= c0626q2.f(interfaceC1041r) ? 32 : 16;
        }
        if ((i9 & 384) == 0) {
            i13 |= c0626q2.f(p5) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS;
        }
        if ((i9 & 3072) == 0) {
            i13 |= c0626q2.h(cVar) ? 2048 : PegdownExtensions.ANCHORLINKS;
        }
        if ((i9 & 24576) == 0) {
            i13 |= c0626q2.d(i6) ? 16384 : 8192;
        }
        if ((196608 & i9) == 0) {
            i13 |= c0626q2.g(z5) ? PegdownExtensions.SUPPRESS_INLINE_HTML : PegdownExtensions.SUPPRESS_HTML_BLOCKS;
        }
        if ((1572864 & i9) == 0) {
            i13 |= c0626q2.d(i7) ? PegdownExtensions.RELAXEDHRULES : PegdownExtensions.SUBSCRIPT;
        }
        if ((12582912 & i9) == 0) {
            i13 |= c0626q2.d(i8) ? PegdownExtensions.EXTANCHORLINKS_WRAP : PegdownExtensions.EXTANCHORLINKS;
        }
        if ((100663296 & i9) == 0) {
            i13 |= c0626q2.h(map) ? PegdownExtensions.MULTI_LINE_IMAGE_URLS : PegdownExtensions.TOC;
        }
        int i14 = i13 | 805306368;
        int i15 = (i10 & 6) == 0 ? i10 | ((i10 & 8) == 0 ? c0626q2.f(null) : c0626q2.h(null) ? 4 : 2) : i10;
        int i16 = 1;
        if (c0626q2.S(i14 & 1, ((i14 & 306783379) == 306783378 && (i15 & 3) == 2) ? false : true)) {
            C(i8, i7);
            O.z0 z0Var = (O.z0) c0626q2.j(O.A0.a);
            Object obj = C0616l.a;
            if (z0Var != null) {
                c0626q2.b0(1588268245);
                long j3 = ((O.T0) c0626q2.j(O.U0.a)).f4037b;
                Object[] objArr = {z0Var};
                i11 = i14;
                int i17 = 0;
                e0.k kVar = new e0.k(i17, new B4.D(z0Var, i16), new A2.a(4));
                boolean h3 = c0626q2.h(z0Var);
                Object P5 = c0626q2.P();
                if (h3 || P5 == obj) {
                    P5 = new C0097v(z0Var, i17);
                    c0626q2.m0(P5);
                }
                long longValue = ((Number) e0.l.c(objArr, kVar, (InterfaceC1193a) P5, c0626q2, 0)).longValue();
                boolean e6 = c0626q2.e(longValue) | c0626q2.f(z0Var) | c0626q2.e(j3);
                Object P6 = c0626q2.P();
                if (e6 || P6 == obj) {
                    P6 = new N.i(longValue, z0Var, j3);
                    c0626q2.m0(P6);
                }
                c0626q2.p(false);
                iVar = (N.i) P6;
            } else {
                i11 = i14;
                c0626q2.b0(1588759409);
                c0626q2.p(false);
                iVar = null;
            }
            X3.i iVar2 = AbstractC0078l.a;
            int length = c0545g.f7630e.length();
            List list = c0545g.f7629c;
            if (list != null) {
                int size = list.size();
                for (int i18 = 0; i18 < size; i18++) {
                    C0543e c0543e = (C0543e) list.get(i18);
                    if ((c0543e.a instanceof S0.I) && "androidx.compose.foundation.text.inlineContent".equals(c0543e.f7628d)) {
                        i12 = 0;
                        if (AbstractC0546h.b(0, length, c0543e.f7626b, c0543e.f7627c)) {
                            z6 = true;
                            break;
                        }
                    }
                }
            }
            i12 = 0;
            z6 = false;
            boolean E5 = Y4.l.E(c0545g);
            W0.d dVar = (W0.d) c0626q2.j(AbstractC0204q0.f2361k);
            if (z6 || E5) {
                int i19 = i12;
                c0626q2.b0(1590022070);
                int i20 = (i11 & 14) == 4 ? 1 : i19;
                Object P7 = c0626q2.P();
                if (i20 != 0 || P7 == obj) {
                    P7 = T.r.A(c0545g);
                    c0626q2.m0(P7);
                }
                T.X x5 = (T.X) P7;
                C0545g c0545g2 = (C0545g) x5.getValue();
                boolean f6 = c0626q2.f(x5);
                Object P8 = c0626q2.P();
                if (f6 || P8 == obj) {
                    P8 = new C0103y(x5, i19);
                    c0626q2.m0(P8);
                }
                int i21 = i11 << 6;
                i(interfaceC1041r, c0545g2, cVar, z6, map, p5, i6, z5, i7, i8, dVar, iVar, (l4.c) P8, c0626q2, ((i11 >> 3) & 910) | ((i11 >> 12) & 57344) | ((i11 << 9) & 458752) | (3670016 & i21) | (29360128 & i21) | (234881024 & i21) | (i21 & 1879048192), ((i11 >> 21) & 896) | (57344 & (i15 << 12)));
                c0626q2 = c0626q2;
                c0626q2.p(false);
            } else {
                c0626q2.b0(1589006262);
                F.a(c0545g, p5, dVar, null, c0626q2, (i11 & 14) | 3072 | ((i11 >> 3) & 112));
                InterfaceC1041r B5 = B(interfaceC1041r, c0545g, p5, cVar, i6, z5, i7, i8, dVar, null, null, iVar, null);
                C0076k c0076k = C0076k.f1050c;
                int hashCode = Long.hashCode(c0626q2.f8164T);
                InterfaceC1041r c6 = AbstractC1024a.c(c0626q2, B5);
                InterfaceC0617l0 l3 = c0626q2.l();
                InterfaceC0152h.a.getClass();
                C0148f c0148f = C0150g.f1924b;
                c0626q2.f0();
                if (c0626q2.f8163S) {
                    c0626q2.k(c0148f);
                } else {
                    c0626q2.p0();
                }
                T.r.G(c0626q2, c0076k, C0150g.f1928f);
                T.r.G(c0626q2, l3, C0150g.f1927e);
                T.r.C(c0626q2, C0150g.f1930h);
                T.r.G(c0626q2, c6, C0150g.f1926d);
                T.r.x(c0626q2, Integer.valueOf(hashCode), C0150g.f1929g);
                c0626q2.p(true);
                c0626q2.p(false);
                c0626q2 = c0626q2;
            }
        } else {
            c0626q2.V();
        }
        C0627q0 t5 = c0626q2.t();
        if (t5 != null) {
            t5.f8193d = new l4.e() { // from class: D.z
                @Override // l4.e
                public final Object m(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    AbstractC0090r0.a(C0545g.this, interfaceC1041r, p5, cVar, i6, z5, i7, i8, map, (C0626q) obj2, T.r.J(i9 | 1), T.r.J(i10));
                    return X3.y.a;
                }
            };
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:71|(2:115|116)|73|(7:114|76|(1:113)(1:80)|81|(6:103|104|105|106|107|108)|84|85)|75|76|(1:78)|111|113|81|(0)|103|104|105|106|107|108|84|85) */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x023f, code lost:
    
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01ed, code lost:
    
        if (r33.f(r28) == false) goto L122;
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final java.lang.String r26, final h0.InterfaceC1041r r27, final S0.P r28, int r29, boolean r30, final int r31, int r32, T.C0626q r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 776
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D.AbstractC0090r0.b(java.lang.String, h0.r, S0.P, int, boolean, int, int, T.q, int, int):void");
    }

    public static final void c(C0332s0 c0332s0, C0873f c0873f, C0626q c0626q, int i6) {
        c0626q.d0(-614342087);
        int i7 = (c0626q.h(c0332s0) ? 4 : 2) | i6;
        if (c0626q.S(i7 & 1, (i7 & 19) != 18)) {
            c0626q.b0(-1009319487);
            InterfaceC0905c interfaceC0905c = null;
            I.k.b(J.i.d(J.i.c(new C0323n0(c0332s0, interfaceC0905c, 0)), c0332s0.f4196g, new C0325o0(c0332s0, interfaceC0905c, 0), null, new O.O(c0332s0, 3)), c0873f, c0626q, 48);
            c0626q.p(false);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new H(c0332s0, c0873f, i6, 0);
        }
    }

    public static final void d(O.N0 n02, C0873f c0873f, C0626q c0626q, int i6) {
        int i7;
        InterfaceC1041r d6;
        c0626q.d0(1533506138);
        if ((i6 & 6) == 0) {
            i7 = (c0626q.h(n02) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= c0626q.h(c0873f) ? 32 : 16;
        }
        if (c0626q.S(i7 & 1, (i7 & 19) != 18)) {
            c0626q.b0(-885604480);
            if (n02.k()) {
                InterfaceC0905c interfaceC0905c = null;
                d6 = J.i.d(J.i.c(new C0323n0(n02, interfaceC0905c, 1)), n02.f4015x, new C0325o0(n02, interfaceC0905c, 1), new O.F0(n02, interfaceC0905c, 0), new I(n02, 2));
            } else {
                d6 = C1038o.a;
            }
            I.k.b(d6, c0873f, c0626q, i7 & 112);
            c0626q.p(false);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new G(n02, c0873f, i6, 0);
        }
    }

    public static final void e(C0332s0 c0332s0, C0873f c0873f, C0626q c0626q, int i6) {
        c0626q.d0(-954926513);
        int i7 = (c0626q.h(c0332s0) ? 4 : 2) | i6;
        if (c0626q.S(i7 & 1, (i7 & 19) != 18)) {
            c(c0332s0, c0873f, c0626q, i7 & 126);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new H(c0332s0, c0873f, i6, 1);
        }
    }

    public static final void f(O.N0 n02, C0873f c0873f, C0626q c0626q, int i6) {
        int i7;
        c0626q.d0(2080741862);
        if ((i6 & 6) == 0) {
            i7 = (c0626q.h(n02) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= c0626q.h(c0873f) ? 32 : 16;
        }
        if (c0626q.S(i7 & 1, (i7 & 19) != 18)) {
            d(n02, c0873f, c0626q, i7 & 126);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new G(n02, c0873f, i6, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:205:0x049f, code lost:
    
        if (r5 > ((r7 != null ? r7.longValue() : 0) + 5000)) goto L238;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:232:0x05b7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0605 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x064e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x068a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x06ce A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x06f2  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x070c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0738  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0747 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0760  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0773  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0782 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:286:0x07bb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x07f5  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0816 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0832  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x083a  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x084e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:313:0x086f  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0891  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x08b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:325:0x08e5  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x08f9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:332:0x096d  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0998  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0872  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0834  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0809  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0775  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0762  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x073a  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x06fd  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0645  */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r3v57, types: [h0.r] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final X0.v r61, final l4.c r62, final h0.InterfaceC1041r r63, final S0.P r64, final F0.F r65, final l4.c r66, final t.C1682j r67, final o0.N r68, final boolean r69, final int r70, final int r71, final X0.k r72, final D.C0094t0 r73, final boolean r74, final boolean r75, final b0.C0873f r76, T.C0626q r77, final int r78, final int r79) {
        /*
            Method dump skipped, instructions count: 2600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D.AbstractC0090r0.g(X0.v, l4.c, h0.r, S0.P, F0.F, l4.c, t.j, o0.N, boolean, int, int, X0.k, D.t0, boolean, boolean, b0.f, T.q, int, int):void");
    }

    public static final void h(InterfaceC1041r interfaceC1041r, O.N0 n02, C0873f c0873f, C0626q c0626q, int i6) {
        c0626q.d0(2036174316);
        int i7 = (c0626q.f(interfaceC1041r) ? 4 : 2) | i6 | (c0626q.h(n02) ? 32 : 16);
        if (c0626q.S(i7 & 1, (i7 & 147) != 146)) {
            F0.V d6 = AbstractC1806l.d(C1026c.f11786c, true);
            int hashCode = Long.hashCode(c0626q.f8164T);
            InterfaceC0617l0 l3 = c0626q.l();
            InterfaceC1041r c6 = AbstractC1024a.c(c0626q, interfaceC1041r);
            InterfaceC0152h.a.getClass();
            C0148f c0148f = C0150g.f1924b;
            c0626q.f0();
            if (c0626q.f8163S) {
                c0626q.k(c0148f);
            } else {
                c0626q.p0();
            }
            T.r.G(c0626q, d6, C0150g.f1928f);
            T.r.G(c0626q, l3, C0150g.f1927e);
            T.r.x(c0626q, Integer.valueOf(hashCode), C0150g.f1929g);
            T.r.C(c0626q, C0150g.f1930h);
            T.r.G(c0626q, c6, C0150g.f1926d);
            f(n02, c0873f, c0626q, (i7 >> 3) & 126);
            c0626q.p(true);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new L(interfaceC1041r, n02, c0873f, i6, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [Y3.v] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, T.X] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r1v45, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v51, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r43v0, types: [T.q] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    public static final void i(final InterfaceC1041r interfaceC1041r, final C0545g c0545g, final l4.c cVar, final boolean z5, final Map map, final S0.P p5, final int i6, final boolean z6, final int i7, final int i8, final W0.d dVar, final N.i iVar, final l4.c cVar2, C0626q c0626q, final int i9, final int i10) {
        i1 i1Var;
        int i11;
        r rVar;
        X3.i iVar2;
        C0103y c0103y;
        Object r10;
        Object r22;
        Object obj;
        Object obj2;
        boolean z7;
        Object r5;
        Object obj3;
        Object r02;
        int i12;
        c0626q.d0(-2118572703);
        int i13 = (i9 & 6) == 0 ? (c0626q.f(interfaceC1041r) ? 4 : 2) | i9 : i9;
        if ((i9 & 48) == 0) {
            i13 |= c0626q.f(c0545g) ? 32 : 16;
        }
        if ((i9 & 384) == 0) {
            i13 |= c0626q.h(cVar) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS;
        }
        int i14 = i9 & 3072;
        int i15 = PegdownExtensions.ANCHORLINKS;
        if (i14 == 0) {
            i13 |= c0626q.g(z5) ? 2048 : 1024;
        }
        if ((i9 & 24576) == 0) {
            i13 |= c0626q.h(map) ? 16384 : 8192;
        }
        if ((196608 & i9) == 0) {
            i13 |= c0626q.f(p5) ? PegdownExtensions.SUPPRESS_INLINE_HTML : PegdownExtensions.SUPPRESS_HTML_BLOCKS;
        }
        if ((i9 & 1572864) == 0) {
            i13 |= c0626q.d(i6) ? PegdownExtensions.RELAXEDHRULES : PegdownExtensions.SUBSCRIPT;
        }
        if ((i9 & 12582912) == 0) {
            i13 |= c0626q.g(z6) ? PegdownExtensions.EXTANCHORLINKS_WRAP : PegdownExtensions.EXTANCHORLINKS;
        }
        if ((i9 & 100663296) == 0) {
            i13 |= c0626q.d(i7) ? PegdownExtensions.MULTI_LINE_IMAGE_URLS : PegdownExtensions.TOC;
        }
        if ((i9 & 805306368) == 0) {
            i13 |= c0626q.d(i8) ? PegdownExtensions.NOT_USED : PegdownExtensions.FORCELISTITEMPARA;
        }
        int i16 = (i10 & 6) == 0 ? i10 | (c0626q.h(dVar) ? 4 : 2) : i10;
        if ((i10 & 48) == 0) {
            i16 |= c0626q.h(iVar) ? 32 : 16;
        }
        int i17 = i13;
        if ((i10 & 384) == 0) {
            i16 |= c0626q.h(null) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS;
        }
        if ((i10 & 3072) == 0) {
            if (c0626q.h(cVar2)) {
                i15 = 2048;
            }
            i16 |= i15;
        }
        if ((i10 & 24576) == 0) {
            i16 |= (32768 & i10) == 0 ? c0626q.f(null) : c0626q.h(null) ? 16384 : 8192;
        }
        int i18 = i16;
        if (c0626q.S(i17 & 1, ((i17 & 306783379) == 306783378 && (i18 & 9363) == 9362) ? false : true)) {
            boolean E5 = Y4.l.E(c0545g);
            C0602e c0602e = C0616l.a;
            if (E5) {
                c0626q.b0(145641571);
                boolean z8 = (i17 & 112) == 32;
                Object P5 = c0626q.P();
                i1 i1Var2 = P5;
                if (z8 || P5 == c0602e) {
                    i1 i1Var3 = new i1(c0545g);
                    c0626q.m0(i1Var3);
                    i1Var2 = i1Var3;
                }
                c0626q.p(false);
                i1Var = i1Var2;
            } else {
                c0626q.b0(145707228);
                c0626q.p(false);
                i1Var = null;
            }
            if (Y4.l.E(c0545g)) {
                c0626q.b0(145905443);
                i11 = i18;
                boolean f6 = ((i17 & 112) == 32) | c0626q.f(i1Var);
                Object P6 = c0626q.P();
                r rVar2 = P6;
                if (f6 || P6 == c0602e) {
                    r rVar3 = new r(1, i1Var, c0545g);
                    c0626q.m0(rVar3);
                    rVar2 = rVar3;
                }
                rVar = rVar2;
                c0626q.p(false);
            } else {
                i11 = i18;
                c0626q.b0(146002721);
                boolean z9 = (i17 & 112) == 32;
                Object P7 = c0626q.P();
                Object obj4 = P7;
                if (z9 || P7 == c0602e) {
                    A.b bVar = new A.b(c0545g, 2);
                    c0626q.m0(bVar);
                    obj4 = bVar;
                }
                rVar = (InterfaceC1193a) obj4;
                c0626q.p(false);
            }
            InterfaceC1193a interfaceC1193a = rVar;
            if (z5) {
                if (map != null) {
                    X3.i iVar3 = AbstractC0078l.a;
                    if (!map.isEmpty()) {
                        int length = c0545g.f7630e.length();
                        List list = c0545g.f7629c;
                        if (list != null) {
                            r02 = new ArrayList(list.size());
                            int size = list.size();
                            int i19 = 0;
                            while (i19 < size) {
                                List list2 = list;
                                C0543e c0543e = (C0543e) list.get(i19);
                                int i20 = size;
                                Object obj5 = c0543e.a;
                                int i21 = i19;
                                int i22 = c0543e.f7627c;
                                int i23 = c0543e.f7626b;
                                String str = c0543e.f7628d;
                                if ((obj5 instanceof S0.I) && "androidx.compose.foundation.text.inlineContent".equals(str) && AbstractC0546h.b(0, length, i23, i22)) {
                                    Object obj6 = c0543e.a;
                                    i12 = length;
                                    AbstractC1276k.d(obj6, "null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
                                    r02.add(new C0543e(((S0.I) obj6).a, i23, i22, str));
                                } else {
                                    i12 = length;
                                }
                                i19 = i21 + 1;
                                size = i20;
                                list = list2;
                                length = i12;
                            }
                        } else {
                            r02 = Y3.v.f9812c;
                        }
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = r02.size();
                        for (int i24 = 0; i24 < size2; i24++) {
                            if (map.get(((C0543e) r02.get(i24)).a) != null) {
                                throw new ClassCastException();
                            }
                        }
                        iVar2 = new X3.i(arrayList, arrayList2);
                        c0103y = null;
                    }
                }
                iVar2 = AbstractC0078l.a;
                c0103y = null;
            } else {
                c0103y = null;
                iVar2 = new X3.i(null, null);
            }
            List list3 = (List) iVar2.f9393c;
            List list4 = (List) iVar2.f9394e;
            if (z5) {
                c0626q.b0(146318828);
                Object P8 = c0626q.P();
                Object obj7 = P8;
                if (P8 == c0602e) {
                    C0607g0 A5 = T.r.A(c0103y);
                    c0626q.m0(A5);
                    obj7 = A5;
                }
                c0626q.p(false);
                r10 = (T.X) obj7;
            } else {
                c0626q.b0(146406588);
                c0626q.p(false);
                r10 = c0103y;
            }
            if (z5) {
                c0626q.b0(146499837);
                boolean f7 = c0626q.f(r10);
                Object P9 = c0626q.P();
                C0103y c0103y2 = P9;
                if (f7 || P9 == c0602e) {
                    C0103y c0103y3 = new C0103y(r10, 1);
                    c0626q.m0(c0103y3);
                    c0103y2 = c0103y3;
                }
                c0103y = c0103y2;
                c0626q.p(false);
            } else {
                c0626q.b0(146571260);
                c0626q.p(false);
            }
            l4.c cVar3 = c0103y;
            int i25 = (i17 >> 3) & 14;
            F.a(c0545g, p5, dVar, list3, c0626q, ((i17 >> 12) & 112) | i25 | ((i11 << 6) & 896));
            C0545g c0545g2 = (C0545g) interfaceC1193a.b();
            boolean h3 = c0626q.h(i1Var) | ((i17 & 896) == 256);
            Object P10 = c0626q.P();
            Object obj8 = P10;
            if (h3 || P10 == c0602e) {
                A a6 = new A(i1Var, cVar, 0);
                c0626q.m0(a6);
                obj8 = a6;
            }
            InterfaceC1041r B5 = B(interfaceC1041r, c0545g2, p5, (l4.c) obj8, i6, z6, i7, i8, dVar, list3, cVar3, iVar, cVar2);
            if (z5) {
                c0626q.b0(147927697);
                boolean h6 = c0626q.h(i1Var);
                Object P11 = c0626q.P();
                Object obj9 = P11;
                if (h6 || P11 == c0602e) {
                    B b5 = new B(i1Var, 1);
                    c0626q.m0(b5);
                    obj9 = b5;
                }
                InterfaceC1193a interfaceC1193a2 = (InterfaceC1193a) obj9;
                boolean f8 = c0626q.f(r10);
                Object P12 = c0626q.P();
                if (f8 || P12 == c0602e) {
                    r22 = 0;
                    C c6 = new C(r10, false ? 1 : 0);
                    c0626q.m0(c6);
                    obj = c6;
                } else {
                    r22 = 0;
                    obj = P12;
                }
                k1 k1Var = new k1(r22, interfaceC1193a2, (InterfaceC1193a) obj);
                c0626q.p(r22);
                obj2 = k1Var;
            } else {
                c0626q.b0(147750935);
                boolean h7 = c0626q.h(i1Var);
                Object P13 = c0626q.P();
                if (h7 || P13 == c0602e) {
                    r5 = 0;
                    B b6 = new B(i1Var, false ? 1 : 0);
                    c0626q.m0(b6);
                    obj3 = b6;
                } else {
                    r5 = 0;
                    obj3 = P13;
                }
                obj2 = new C0102x0((InterfaceC1193a) obj3, r5);
                c0626q.p(r5);
            }
            int hashCode = Long.hashCode(c0626q.f8164T);
            InterfaceC0617l0 l3 = c0626q.l();
            InterfaceC1041r c7 = AbstractC1024a.c(c0626q, B5);
            InterfaceC0152h.a.getClass();
            C0148f c0148f = C0150g.f1924b;
            c0626q.f0();
            if (c0626q.f8163S) {
                c0626q.k(c0148f);
            } else {
                c0626q.p0();
            }
            T.r.G(c0626q, obj2, C0150g.f1928f);
            T.r.G(c0626q, l3, C0150g.f1927e);
            T.r.x(c0626q, Integer.valueOf(hashCode), C0150g.f1929g);
            T.r.C(c0626q, C0150g.f1930h);
            T.r.G(c0626q, c7, C0150g.f1926d);
            if (i1Var == null) {
                c0626q.b0(-433557001);
                z7 = false;
            } else {
                z7 = false;
                c0626q.b0(-291080374);
                i1Var.a(0, c0626q);
            }
            c0626q.p(z7);
            if (list4 == null) {
                c0626q.b0(-433506223);
            } else {
                c0626q.b0(-433506222);
                AbstractC0078l.a(c0545g, list4, c0626q, i25);
            }
            c0626q.p(z7);
            c0626q.p(true);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new l4.e() { // from class: D.w
                @Override // l4.e
                public final Object m(Object obj10, Object obj11) {
                    ((Integer) obj11).getClass();
                    int J4 = T.r.J(i9 | 1);
                    int J5 = T.r.J(i10);
                    AbstractC0090r0.i(InterfaceC1041r.this, c0545g, cVar, z5, map, p5, i6, z6, i7, i8, dVar, iVar, cVar2, (C0626q) obj10, J4, J5);
                    return X3.y.a;
                }
            };
        }
    }

    public static final void j(O.N0 n02, boolean z5, C0626q c0626q, int i6) {
        d1 d6;
        c0626q.d0(626339208);
        int i7 = (c0626q.h(n02) ? 4 : 2) | i6 | (c0626q.g(z5) ? 32 : 16);
        if (!c0626q.S(i7 & 1, (i7 & 19) != 18)) {
            c0626q.V();
        } else if (z5) {
            c0626q.b0(1530097388);
            C0098v0 c0098v0 = n02.f3995d;
            S0.L l3 = null;
            if (c0098v0 != null && (d6 = c0098v0.d()) != null) {
                S0.L l5 = d6.a;
                C0098v0 c0098v02 = n02.f3995d;
                if (!(c0098v02 != null ? c0098v02.f1197p : true)) {
                    l3 = l5;
                }
            }
            if (l3 == null) {
                c0626q.b0(1530097387);
            } else {
                c0626q.b0(1530097388);
                if (S0.O.c(n02.n().f9125b)) {
                    c0626q.b0(2062097806);
                } else {
                    c0626q.b0(2109807302);
                    int b5 = n02.f3993b.b((int) (n02.n().f9125b >> 32));
                    int b6 = n02.f3993b.b((int) (n02.n().f9125b & 4294967295L));
                    d1.j a6 = l3.a(b5);
                    d1.j a7 = l3.a(Math.max(b6 - 1, 0));
                    C0098v0 c0098v03 = n02.f3995d;
                    if (c0098v03 == null || !((Boolean) c0098v03.f1194m.getValue()).booleanValue()) {
                        c0626q.b0(2062097806);
                    } else {
                        c0626q.b0(2110225306);
                        AbstractC0336u0.g(true, a6, n02, c0626q, ((i7 << 6) & 896) | 6);
                    }
                    c0626q.p(false);
                    C0098v0 c0098v04 = n02.f3995d;
                    if (c0098v04 == null || !((Boolean) c0098v04.f1195n.getValue()).booleanValue()) {
                        c0626q.b0(2062097806);
                    } else {
                        c0626q.b0(2110574459);
                        AbstractC0336u0.g(false, a7, n02, c0626q, ((i7 << 6) & 896) | 6);
                    }
                    c0626q.p(false);
                }
                c0626q.p(false);
                C0098v0 c0098v05 = n02.f3995d;
                if (c0098v05 != null) {
                    C0607g0 c0607g0 = c0098v05.f1193l;
                    if (!AbstractC1276k.b(n02.f4011t.a.f7630e, n02.n().a.f7630e)) {
                        c0607g0.setValue(Boolean.FALSE);
                    }
                    if (c0098v05.b()) {
                        if (((Boolean) c0607g0.getValue()).booleanValue()) {
                            n02.r();
                        } else {
                            n02.o();
                        }
                    }
                }
            }
            c0626q.p(false);
            c0626q.p(false);
        } else {
            c0626q.b0(1989076778);
            c0626q.p(false);
            n02.o();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new O(i6, 0, n02, z5);
        }
    }

    public static final void k(O.N0 n02, C0626q c0626q, int i6) {
        C0545g m3;
        c0626q.d0(-1436003720);
        int i7 = 2;
        int i8 = (c0626q.h(n02) ? 4 : 2) | i6;
        int i9 = 1;
        int i10 = 0;
        if (c0626q.S(i8 & 1, (i8 & 3) != 2)) {
            C0098v0 c0098v0 = n02.f3995d;
            if (c0098v0 == null || !((Boolean) c0098v0.f1196o.getValue()).booleanValue() || (m3 = n02.m()) == null || m3.f7630e.length() <= 0) {
                c0626q.b0(2132946858);
            } else {
                c0626q.b0(-2112351432);
                boolean f6 = c0626q.f(n02);
                Object P5 = c0626q.P();
                C0602e c0602e = C0616l.a;
                if (f6 || P5 == c0602e) {
                    P5 = new O.H0(n02);
                    c0626q.m0(P5);
                }
                H0 h02 = (H0) P5;
                InterfaceC0961c interfaceC0961c = (InterfaceC0961c) c0626q.j(AbstractC0204q0.f2358h);
                X0.p pVar = n02.f3993b;
                long j3 = n02.n().f9125b;
                int i11 = S0.O.f7611c;
                int b5 = pVar.b((int) (j3 >> 32));
                C0098v0 c0098v02 = n02.f3995d;
                d1 d6 = c0098v02 != null ? c0098v02.d() : null;
                AbstractC1276k.c(d6);
                S0.L l3 = d6.a;
                C1354c c6 = l3.c(AbstractC1117a.f(b5, 0, l3.a.a.f7630e.length()));
                long floatToRawIntBits = (Float.floatToRawIntBits((interfaceC0961c.e0(L0.a) / 2) + c6.a) << 32) | (Float.floatToRawIntBits(c6.f13297d) & 4294967295L);
                boolean e6 = c0626q.e(floatToRawIntBits);
                Object P6 = c0626q.P();
                if (e6 || P6 == c0602e) {
                    P6 = new C0059b0(floatToRawIntBits);
                    c0626q.m0(P6);
                }
                InterfaceC0331s interfaceC0331s = (InterfaceC0331s) P6;
                boolean h3 = c0626q.h(h02) | c0626q.h(n02);
                Object P7 = c0626q.P();
                if (h3 || P7 == c0602e) {
                    P7 = new C0067f0(i10, h02, n02);
                    c0626q.m0(P7);
                }
                InterfaceC1041r a6 = B0.Q.a(C1038o.a, h02, (PointerInputEventHandler) P7);
                boolean e7 = c0626q.e(floatToRawIntBits);
                Object P8 = c0626q.P();
                if (e7 || P8 == c0602e) {
                    P8 = new C0066f(floatToRawIntBits, i9);
                    c0626q.m0(P8);
                }
                AbstractC0070h.a(interfaceC0331s, P0.n.a(a6, false, (l4.c) P8), 0L, c0626q, 0);
            }
            c0626q.p(false);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new B4.D(i6, i7, n02);
        }
    }

    public static final C1354c l(F0.j0 j0Var, int i6, X0.B b5, S0.L l3, boolean z5, int i7) {
        C1354c c6 = l3 != null ? l3.c(b5.f9076b.b(i6)) : C1354c.f13294e;
        float f6 = c6.a;
        int l02 = j0Var.l0(L0.a);
        return C1354c.b(c6, z5 ? (i7 - f6) - l02 : f6, z5 ? i7 - f6 : l02 + f6, S.l.f7374V, 10);
    }

    public static final boolean m(int i6, KeyEvent keyEvent) {
        return ((int) (AbstractC2015c.b(keyEvent) >> 32)) == i6;
    }

    public static final ArrayList n(List list, InterfaceC1193a interfaceC1193a) {
        B3.s sVar;
        if (!((Boolean) interfaceC1193a.b()).booleanValue()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            F0.U u5 = (F0.U) list.get(i6);
            Object H3 = u5.H();
            AbstractC1276k.d(H3, "null cannot be cast to non-null type androidx.compose.foundation.text.TextRangeLayoutModifier");
            f1 f1Var = ((l1) H3).a;
            i1 i1Var = (i1) f1Var.f1018c;
            C0543e c0543e = (C0543e) f1Var.f1019e;
            S0.L l3 = (S0.L) i1Var.a.getValue();
            if (l3 == null) {
                sVar = new B3.s(0, 0, new C0080m(2));
            } else {
                C0543e c6 = i1.c(c0543e, l3);
                if (c6 == null) {
                    sVar = new B3.s(0, 0, new C0080m(3));
                } else {
                    e1.k h02 = h5.e.h0(l3.k(c6.f7626b, c6.f7627c).c());
                    sVar = new B3.s(h02.d(), h02.b(), new A.b(h02, 5));
                }
            }
            int i7 = sVar.f553c;
            int i8 = sVar.f554e;
            arrayList.add(new X3.i(u5.w(s4.j.s(i7, i7, i8, i8)), (InterfaceC1193a) sVar.f555f));
        }
        return arrayList;
    }

    public static final int o(float f6) {
        return Math.round((float) Math.ceil(f6));
    }

    public static final Object p(B0.D d6, H0 h02, InterfaceC0905c interfaceC0905c) {
        Object l3 = AbstractC1888A.l(new C0(d6, h02, null), interfaceC0905c);
        return l3 == EnumC0927a.f11114c ? l3 : X3.y.a;
    }

    public static final void q(C0098v0 c0098v0) {
        X0.A a6 = c0098v0.f1186e;
        if (a6 != null) {
            c0098v0.f1203v.f(X0.v.a((X0.v) c0098v0.f1185d.f3179e, null, 0L, 3));
            X0.w wVar = a6.a;
            AtomicReference atomicReference = wVar.f9127b;
            while (true) {
                if (atomicReference.compareAndSet(a6, null)) {
                    wVar.a.d();
                    break;
                } else if (atomicReference.get() != a6) {
                    break;
                }
            }
        }
        c0098v0.f1186e = null;
    }

    public static final X0.B r(F0.F f6, C0545g c0545g) {
        f6.getClass();
        int length = c0545g.f7630e.length();
        int length2 = c0545g.f7630e.length();
        int min = Math.min(length, 100);
        for (int i6 = 0; i6 < min; i6++) {
            D(i6, length2, i6);
        }
        D(length, length2, length);
        int min2 = Math.min(length2, 100);
        for (int i7 = 0; i7 < min2; i7++) {
            E(i7, length, i7);
        }
        E(length2, length, length2);
        return new X0.B(c0545g, new n1(c0545g.f7630e.length(), c0545g.f7630e.length()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int s(int i6, String str) {
        String str2;
        int i7;
        y1.j w5 = w();
        Integer num = null;
        if (w5 != null) {
            if (!(w5.c() == 1)) {
                throw new IllegalStateException("Not initialized yet");
            }
            AbstractC1120d.f(str, "charSequence cannot be null");
            C0158m c0158m = w5.f15978e.f15969b;
            c0158m.getClass();
            if (i6 < 0 || i6 >= str.length()) {
                str2 = str;
                i7 = -1;
            } else {
                if (str instanceof Spanned) {
                    Spanned spanned = (Spanned) str;
                    y1.v[] vVarArr = (y1.v[]) spanned.getSpans(i6, i6 + 1, y1.v.class);
                    if (vVarArr.length > 0) {
                        i7 = spanned.getSpanEnd(vVarArr[0]);
                        str2 = str;
                    }
                }
                str2 = str;
                i7 = ((y1.p) c0158m.n(str2, Math.max(0, i6 - 16), Math.min(str.length(), i6 + 16), TableCell.NOT_TRACKED, true, new y1.p(i6))).f15988f;
            }
            Integer valueOf = Integer.valueOf(i7);
            if (i7 != -1) {
                num = valueOf;
            }
        } else {
            str2 = str;
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str2);
        return characterInstance.following(i6);
    }

    public static final int t(int i6, CharSequence charSequence) {
        int length = charSequence.length();
        while (i6 < length) {
            if (charSequence.charAt(i6) == '\n') {
                return i6;
            }
            i6++;
        }
        return charSequence.length();
    }

    public static final int u(int i6, CharSequence charSequence) {
        while (i6 > 0) {
            if (charSequence.charAt(i6 - 1) == '\n') {
                return i6;
            }
            i6--;
        }
        return 0;
    }

    public static final int v(int i6, String str) {
        y1.j w5 = w();
        Integer num = null;
        if (w5 != null) {
            Integer valueOf = Integer.valueOf(w5.b(Math.max(0, i6 - 1), str));
            if (valueOf.intValue() != -1) {
                num = valueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i6);
    }

    public static final y1.j w() {
        if (!y1.j.d()) {
            return null;
        }
        y1.j a6 = y1.j.a();
        if (a6.c() == 1) {
            return a6;
        }
        return null;
    }

    public static final float x(S0.L l3, int i6) {
        if (i6 < 0) {
            return S.l.f7374V;
        }
        S0.K k3 = l3.a;
        C0554p c0554p = l3.f7599b;
        if (k3.a.f7630e.length() == 0) {
            return S.l.f7374V;
        }
        int min = Math.min(c0554p.d(i6), Math.min(c0554p.f7648b - 1, c0554p.f7652f - 1));
        if (i6 > c0554p.c(min, false)) {
            return S.l.f7374V;
        }
        c0554p.m(min);
        ArrayList arrayList = c0554p.f7654h;
        S0.r rVar = (S0.r) arrayList.get(S0.F.e(arrayList, min));
        C0539a c0539a = rVar.a;
        int i7 = min - rVar.f7659d;
        T0.j jVar = c0539a.f7617d;
        return jVar.e(i7) - jVar.g(i7);
    }

    public static final void y(C0098v0 c0098v0, X0.v vVar, X0.p pVar) {
        AbstractC0983f e6 = AbstractC0997t.e();
        l4.c e7 = e6 != null ? e6.e() : null;
        AbstractC0983f h3 = AbstractC0997t.h(e6);
        try {
            d1 d6 = c0098v0.d();
            if (d6 == null) {
                return;
            }
            X0.A a6 = c0098v0.f1186e;
            if (a6 == null) {
                return;
            }
            InterfaceC0134w c6 = c0098v0.c();
            if (c6 == null) {
                return;
            }
            z(vVar, c0098v0.a, d6.a, c6, a6, c0098v0.b(), pVar);
        } finally {
            AbstractC0997t.k(e6, h3, e7);
        }
    }

    public static void z(X0.v vVar, G0 g02, S0.L l3, InterfaceC0134w interfaceC0134w, X0.A a6, boolean z5, X0.p pVar) {
        if (z5) {
            int b5 = pVar.b(S0.O.e(vVar.f9125b));
            String str = M0.a;
            C1354c b6 = b5 < l3.a.a.f7630e.length() ? l3.b(b5) : b5 != 0 ? l3.b(b5 - 1) : new C1354c(S.l.f7374V, S.l.f7374V, 1.0f, (int) (M0.b(g02.f768b, g02.f773g, g02.f774h) & 4294967295L));
            float f6 = b6.f13295b;
            float f7 = b6.a;
            long U5 = interfaceC0134w.U((Float.floatToRawIntBits(f7) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L));
            C1354c a7 = AbstractC1117a.a((Float.floatToRawIntBits(Float.intBitsToFloat((int) (U5 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (U5 >> 32))) << 32), (Float.floatToRawIntBits(b6.f13296c - f7) << 32) | (Float.floatToRawIntBits(b6.f13297d - f6) & 4294967295L));
            if (AbstractC1276k.b((X0.A) a6.a.f9127b.get(), a6)) {
                a6.f9075b.f(a7);
            }
        }
    }
}
