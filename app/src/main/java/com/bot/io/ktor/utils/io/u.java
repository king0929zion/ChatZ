package io.ktor.utils.io;

import D.Q0;
import I0.AbstractC0204q0;
import T.C0602e;
import T.C0616l;
import T.C0626q;
import T.C0627q0;
import T.X;
import android.content.Context;
import android.graphics.Typeface;
import android.view.DragEvent;
import android.view.View;
import android.view.ViewParent;
import b0.C0873f;
import b4.InterfaceC0910h;
import com.tencent.mmkv.R;
import com.vladsch.flexmark.parser.PegdownExtensions;
import com.vladsch.flexmark.util.format.TableCell;
import e1.InterfaceC0961c;
import f0.C0987j;
import h0.C1026c;
import h0.C1032i;
import h0.InterfaceC1041r;
import i1.AbstractC1087g;
import i4.AbstractC1121e;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import m.c0;
import m4.AbstractC1276k;
import n.AbstractC1318d;
import n.C1327h0;
import n.C1347v;
import n.N0;
import org.jsoup.helper.HttpConnection;
import p.C1459u;
import p.F0;
import s.AbstractC1647k;
import s.C1643g;
import s.C1649m;
import t.C1678f;
import t.C1682j;
import u0.C1746g;
import u4.C1772j;
import v.InterfaceC1802i0;
import v.k0;
import x1.C1864a;
import x4.AbstractC1888A;
import x4.AbstractC1939v;
import x4.InterfaceC1942y;
import x4.s0;
import z.C2003a;
import z.C2004b;
import z.C2010h;

/* loaded from: classes.dex */
public abstract class u {
    public static C1746g a;

    public u() {
        new ConcurrentHashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [z.w, java.lang.Object] */
    public static final void a(final C2004b c2004b, final InterfaceC1041r interfaceC1041r, InterfaceC1802i0 interfaceC1802i0, C2010h c2010h, float f6, C1032i c1032i, C1643g c1643g, boolean z5, A0.a aVar, C1649m c1649m, C1459u c1459u, final C0873f c0873f, C0626q c0626q, final int i6) {
        final InterfaceC1802i0 interfaceC1802i02;
        final C2010h c2010h2;
        final float f7;
        final C1032i c1032i2;
        final C1643g c1643g2;
        final boolean z6;
        final A0.a aVar2;
        final C1649m c1649m2;
        final C1459u c1459u2;
        A0.a aVar3;
        int i7;
        C1032i c1032i3;
        C1459u c1459u3;
        InterfaceC1802i0 interfaceC1802i03;
        C2010h c2010h3;
        float f8;
        C1643g c1643g3;
        boolean z7;
        c0626q.d0(1860873769);
        int i8 = i6 | (c0626q.f(c2004b) ? 4 : 2) | 911961472;
        if (c0626q.S(i8 & 1, (306783379 & i8) != 306783378)) {
            c0626q.X();
            if ((i6 & 1) == 0 || c0626q.B()) {
                float f9 = 0;
                k0 k0Var = new k0(f9, f9, f9, f9);
                float f10 = 0;
                C1032i c1032i4 = C1026c.f11796n;
                int i9 = (i8 & 14) | PegdownExtensions.SUPPRESS_ALL_HTML;
                ?? obj = new Object();
                C1347v a6 = c0.a(c0626q);
                Object obj2 = N0.a;
                C1327h0 r5 = AbstractC1318d.r(S.l.f7374V, 400.0f, Float.valueOf(1), 1);
                InterfaceC0961c interfaceC0961c = (InterfaceC0961c) c0626q.j(AbstractC0204q0.f2358h);
                e1.m mVar = (e1.m) c0626q.j(AbstractC0204q0.f2364n);
                boolean f11 = ((((i9 & 14) ^ 6) > 4 && c0626q.f(c2004b)) || (i9 & 6) == 4) | c0626q.f(a6) | c0626q.f(r5) | c0626q.f(obj) | c0626q.f(interfaceC0961c) | c0626q.d(mVar.ordinal());
                Object P5 = c0626q.P();
                Object obj3 = C0616l.a;
                if (f11 || P5 == obj3) {
                    e0.k kVar = new e0.k(c2004b, new Q0(13, c2004b, mVar), (z.w) obj);
                    float f12 = AbstractC1647k.a;
                    Object c1643g4 = new C1643g(kVar, a6, r5);
                    c0626q.m0(c1643g4);
                    P5 = c1643g4;
                }
                C1643g c1643g5 = (C1643g) P5;
                int i10 = i8 & (-29360129);
                int i11 = (i8 & 14) | 432;
                boolean z8 = (((i11 & 14) ^ 6) > 4 && c0626q.f(c2004b)) || (i11 & 6) == 4;
                Object P6 = c0626q.P();
                if (z8 || P6 == obj3) {
                    P6 = new C2003a(c2004b);
                    c0626q.m0(P6);
                }
                C1459u a7 = F0.a(c0626q);
                C2010h c2010h4 = C2010h.a;
                c1649m2 = C1649m.a;
                aVar3 = (C2003a) P6;
                i7 = i10;
                c1032i3 = c1032i4;
                c1459u3 = a7;
                interfaceC1802i03 = k0Var;
                c2010h3 = c2010h4;
                f8 = f10;
                c1643g3 = c1643g5;
                z7 = true;
            } else {
                c0626q.V();
                i7 = i8 & (-29360129);
                interfaceC1802i03 = interfaceC1802i0;
                c2010h3 = c2010h;
                f8 = f6;
                c1032i3 = c1032i;
                c1643g3 = c1643g;
                z7 = z5;
                aVar3 = aVar;
                c1649m2 = c1649m;
                c1459u3 = c1459u;
            }
            c0626q.q();
            AbstractC1121e.a(interfaceC1041r, c2004b, interfaceC1802i03, c1643g3, z7, c1459u3, f8, c2010h3, aVar3, c1032i3, c1649m2, c0873f, c0626q, ((i7 << 3) & 112) | 907570566, 1797510);
            c1459u2 = c1459u3;
            f7 = f8;
            c1032i2 = c1032i3;
            aVar2 = aVar3;
            z6 = z7;
            c2010h2 = c2010h3;
            c1643g2 = c1643g3;
            interfaceC1802i02 = interfaceC1802i03;
        } else {
            c0626q.V();
            interfaceC1802i02 = interfaceC1802i0;
            c2010h2 = c2010h;
            f7 = f6;
            c1032i2 = c1032i;
            c1643g2 = c1643g;
            z6 = z5;
            aVar2 = aVar;
            c1649m2 = c1649m;
            c1459u2 = c1459u;
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new l4.e(interfaceC1041r, interfaceC1802i02, c2010h2, f7, c1032i2, c1643g2, z6, aVar2, c1649m2, c1459u2, c0873f, i6) { // from class: z.m

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1041r f16123e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1802i0 f16124f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ C2010h f16125g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ float f16126h;

                /* renamed from: i, reason: collision with root package name */
                public final /* synthetic */ C1032i f16127i;

                /* renamed from: j, reason: collision with root package name */
                public final /* synthetic */ C1643g f16128j;

                /* renamed from: k, reason: collision with root package name */
                public final /* synthetic */ boolean f16129k;

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ A0.a f16130l;

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ C1649m f16131m;

                /* renamed from: n, reason: collision with root package name */
                public final /* synthetic */ C1459u f16132n;

                /* renamed from: o, reason: collision with root package name */
                public final /* synthetic */ C0873f f16133o;

                @Override // l4.e
                public final Object m(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    io.ktor.utils.io.u.a(C2004b.this, this.f16123e, this.f16124f, this.f16125g, this.f16126h, this.f16127i, this.f16128j, this.f16129k, this.f16130l, this.f16131m, this.f16132n, this.f16133o, (C0626q) obj4, T.r.J(49));
                    return X3.y.a;
                }
            };
        }
    }

    public static final C1772j b(Matcher matcher, int i6, CharSequence charSequence) {
        if (matcher.find(i6)) {
            return new C1772j(matcher, charSequence);
        }
        return null;
    }

    public static final void c(Throwable th) {
        Throwable th2;
        try {
            th2 = H.b(th, th);
        } catch (Throwable unused) {
            th2 = null;
        }
        if (th2 != null) {
            throw th2;
        }
    }

    public static final X d(C1682j c1682j, C0626q c0626q, int i6) {
        Object P5 = c0626q.P();
        C0602e c0602e = C0616l.a;
        if (P5 == c0602e) {
            P5 = T.r.A(Boolean.FALSE);
            c0626q.m0(P5);
        }
        X x5 = (X) P5;
        boolean z5 = (((i6 & 14) ^ 6) > 4 && c0626q.f(c1682j)) || (i6 & 6) == 4;
        Object P6 = c0626q.P();
        if (z5 || P6 == c0602e) {
            P6 = new C1678f(c1682j, x5, null);
            c0626q.m0(P6);
        }
        T.r.f(c0626q, c1682j, (l4.e) P6);
        return x5;
    }

    public static Q4.n e(Q4.n nVar, Q4.n nVar2) {
        Q4.m mVar = new Q4.m(0);
        int size = nVar.size();
        for (int i6 = 0; i6 < size; i6++) {
            String b5 = nVar.b(i6);
            String d6 = nVar.d(i6);
            if ((!"Warning".equalsIgnoreCase(b5) || !u4.u.D(d6, "1", false)) && ("Content-Length".equalsIgnoreCase(b5) || HttpConnection.CONTENT_ENCODING.equalsIgnoreCase(b5) || HttpConnection.CONTENT_TYPE.equalsIgnoreCase(b5) || !m(b5) || nVar2.a(b5) == null)) {
                mVar.b(b5, d6);
            }
        }
        int size2 = nVar2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            String b6 = nVar2.b(i7);
            if (!"Content-Length".equalsIgnoreCase(b6) && !HttpConnection.CONTENT_ENCODING.equalsIgnoreCase(b6) && !HttpConnection.CONTENT_TYPE.equalsIgnoreCase(b6) && m(b6)) {
                mVar.b(b6, nVar2.d(i7));
            }
        }
        return mVar.d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        if (i1.AbstractC1087g.h(r9, r1, m4.AbstractC1276k.b(r7, r2) ? r0.getWidth() : w2.AbstractC1835e.d(r7.a, r8), m4.AbstractC1276k.b(r7, r2) ? r0.getHeight() : w2.AbstractC1835e.d(r7.f14910b, r8), r8) == 1.0d) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap f(android.graphics.drawable.Drawable r5, android.graphics.Bitmap.Config r6, t2.C1723g r7, t2.EnumC1722f r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.u.f(android.graphics.drawable.Drawable, android.graphics.Bitmap$Config, t2.g, t2.f, boolean):android.graphics.Bitmap");
    }

    public static final boolean h(long j3, long j4) {
        return j3 == j4;
    }

    public static final ViewParent j(View view) {
        AbstractC1276k.f(view, "<this>");
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static final C1864a k(View view) {
        C1864a c1864a = (C1864a) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (c1864a != null) {
            return c1864a;
        }
        C1864a c1864a2 = new C1864a();
        view.setTag(R.id.pooling_container_listener_holder_tag, c1864a2);
        return c1864a2;
    }

    public static final long l(C0987j c0987j) {
        DragEvent dragEvent = (DragEvent) c0987j.f11690e;
        float x5 = dragEvent.getX();
        float y5 = dragEvent.getY();
        return (Float.floatToRawIntBits(x5) << 32) | (Float.floatToRawIntBits(y5) & 4294967295L);
    }

    public static boolean m(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public static String n(long j3) {
        int i6 = (int) (j3 >> 32);
        int i7 = (int) (j3 & 4294967295L);
        if (Float.intBitsToFloat(i6) == Float.intBitsToFloat(i7)) {
            return "CornerRadius.circular(" + AbstractC1087g.o(Float.intBitsToFloat(i6)) + ')';
        }
        return "CornerRadius.elliptical(" + AbstractC1087g.o(Float.intBitsToFloat(i6)) + ", " + AbstractC1087g.o(Float.intBitsToFloat(i7)) + ')';
    }

    public static final B o(InterfaceC1942y interfaceC1942y, InterfaceC0910h interfaceC0910h, boolean z5, l4.e eVar) {
        AbstractC1276k.f(interfaceC1942y, "<this>");
        AbstractC1276k.f(interfaceC0910h, "coroutineContext");
        t tVar = new t(z5, io.ktor.utils.io.internal.f.f12171c, 8);
        s0 y5 = AbstractC1888A.y(interfaceC1942y, interfaceC0910h, new E(tVar, eVar, (AbstractC1939v) interfaceC1942y.c().r(AbstractC1939v.f15729e), null), 2);
        y5.S(new s(tVar, 2));
        return new B(y5, tVar);
    }

    public abstract Typeface g(Context context, r1.d[] dVarArr);

    public r1.d i(r1.d[] dVarArr) {
        r1.d dVar = null;
        int i6 = TableCell.NOT_TRACKED;
        for (r1.d dVar2 : dVarArr) {
            int abs = (dVar2.f14651d ? 1 : 0) + (Math.abs(dVar2.f14650c - 400) * 2);
            if (dVar == null || i6 > abs) {
                dVar = dVar2;
                i6 = abs;
            }
        }
        return dVar;
    }
}
