package j2;

import F0.C0120h;
import F0.InterfaceC0121i;
import H0.C0146e;
import H0.C0148f;
import H0.C0150g;
import H0.InterfaceC0152h;
import I0.E0;
import Q.C0457q2;
import T.AbstractC0623o0;
import T.C0616l;
import T.C0626q;
import T.C0627q0;
import T.InterfaceC0617l0;
import android.content.Context;
import android.os.Trace;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.C0873f;
import com.vladsch.flexmark.parser.PegdownExtensions;
import h0.AbstractC1024a;
import h0.C1026c;
import h0.C1033j;
import h0.C1038o;
import h0.InterfaceC1028e;
import h0.InterfaceC1041r;
import i2.C1107a;
import i2.C1115i;
import j1.AbstractC1135a;
import m4.AbstractC1276k;
import o0.C1395f;
import s2.C1660h;
import s2.C1661i;
import t0.AbstractC1688b;
import t2.C1721e;
import u0.C1746g;

/* loaded from: classes.dex */
public abstract class n {
    public static final m a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final u f12393b = new Object();

    public static final void a(Comparable comparable, String str, InterfaceC1041r interfaceC1041r, C0873f c0873f, C0873f c0873f2, l4.c cVar, InterfaceC0121i interfaceC0121i, C0626q c0626q, int i6, int i7, int i8) {
        c0626q.c0(-1555574782);
        if ((i8 & 16) != 0) {
            c0873f = null;
        }
        l4.c cVar2 = (i8 & PegdownExtensions.WIKILINKS) != 0 ? null : cVar;
        C1033j c1033j = C1026c.f11790h;
        InterfaceC0121i interfaceC0121i2 = (i8 & 2048) != 0 ? C0120h.f1476b : interfaceC0121i;
        C1115i d6 = d(v.a, c0626q);
        int i9 = i6 << 3;
        int i10 = (i6 & 112) | 520 | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (i9 & 3670016) | (29360128 & i9) | (234881024 & i9) | (i9 & 1879048192);
        int i11 = ((i6 >> 27) & 14) | ((i7 << 3) & 896);
        c0626q.c0(-1545157471);
        o oVar = new o(comparable, f12393b, d6);
        C1721e c1721e = B.f12363b;
        int i12 = i10 >> 3;
        b(oVar, str, interfaceC1041r, l.f12377w, cVar2 != null ? new P2.r(cVar2, 6) : null, c1033j, interfaceC0121i2, new C0873f(new C1144A(c0873f, c0873f2), true, 750771424), c0626q, (i10 & 112) | (i12 & 896) | (i12 & 7168) | (3670016 & (i11 << 12)), 0);
        c0626q.p(false);
        c0626q.p(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final j2.o r22, final java.lang.String r23, final h0.InterfaceC1041r r24, final l4.c r25, final l4.c r26, final h0.InterfaceC1028e r27, final F0.InterfaceC0121i r28, final b0.C0873f r29, T.C0626q r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 863
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.n.b(j2.o, java.lang.String, h0.r, l4.c, l4.c, h0.e, F0.i, b0.f, T.q, int, int):void");
    }

    public static final void c(w wVar, InterfaceC1041r interfaceC1041r, AbstractC1688b abstractC1688b, String str, InterfaceC1028e interfaceC1028e, InterfaceC0121i interfaceC0121i, float f6, boolean z5, C0626q c0626q, int i6) {
        int i7;
        AbstractC1688b abstractC1688b2;
        String str2;
        InterfaceC1028e interfaceC1028e2;
        InterfaceC0121i interfaceC0121i2;
        InterfaceC1041r interfaceC1041r2;
        float f7;
        boolean z6;
        AbstractC1688b abstractC1688b3;
        InterfaceC1041r interfaceC1041r3;
        float f8;
        boolean z7;
        c0626q.d0(880638523);
        if ((i6 & 14) == 0) {
            i7 = (c0626q.f(wVar) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        int i8 = i7 | 176;
        if ((i6 & 7168) == 0) {
            i8 = i7 | 1200;
        }
        if ((57344 & i6) == 0) {
            i8 |= 8192;
        }
        if ((458752 & i6) == 0) {
            i8 |= PegdownExtensions.SUPPRESS_HTML_BLOCKS;
        }
        if ((3670016 & i6) == 0) {
            i8 |= PegdownExtensions.SUBSCRIPT;
        }
        if ((29360128 & i6) == 0) {
            i8 |= PegdownExtensions.EXTANCHORLINKS;
        }
        if ((234881024 & i6) == 0) {
            i8 |= PegdownExtensions.TOC;
        }
        if ((191739611 & i8) == 38347922 && c0626q.E()) {
            c0626q.V();
            interfaceC1041r3 = interfaceC1041r;
            abstractC1688b3 = abstractC1688b;
            str2 = str;
            interfaceC1028e2 = interfaceC1028e;
            interfaceC0121i2 = interfaceC0121i;
            f8 = f6;
            z7 = z5;
        } else {
            c0626q.X();
            if ((i6 & 1) == 0 || c0626q.B()) {
                abstractC1688b2 = wVar.f12416b;
                str2 = wVar.f12417c;
                interfaceC1028e2 = wVar.f12418d;
                interfaceC0121i2 = wVar.f12419e;
                wVar.getClass();
                wVar.getClass();
                wVar.getClass();
                interfaceC1041r2 = C1038o.a;
                f7 = 1.0f;
                z6 = true;
            } else {
                c0626q.V();
                interfaceC1041r2 = interfaceC1041r;
                abstractC1688b2 = abstractC1688b;
                str2 = str;
                interfaceC1028e2 = interfaceC1028e;
                interfaceC0121i2 = interfaceC0121i;
                f7 = f6;
                z6 = z5;
            }
            c0626q.q();
            C1721e c1721e = B.f12363b;
            InterfaceC1041r a6 = str2 != null ? P0.n.a(interfaceC1041r2, false, new M2.b(str2, 8)) : interfaceC1041r2;
            if (z6) {
                a6 = l0.h.d(a6);
            }
            InterfaceC1041r c6 = a6.c(new r(abstractC1688b2, interfaceC1028e2, interfaceC0121i2, f7));
            c0626q.c0(544976794);
            int hashCode = Long.hashCode(c0626q.f8164T);
            InterfaceC1041r c7 = AbstractC1024a.c(c0626q, c6);
            InterfaceC0617l0 l3 = c0626q.l();
            InterfaceC0152h.a.getClass();
            C0148f c0148f = C0150g.f1924b;
            c0626q.c0(1405779621);
            c0626q.f0();
            if (c0626q.f8163S) {
                c0626q.k(new A0.b(c0148f, 17));
            } else {
                c0626q.p0();
            }
            T.r.G(c0626q, z.a, C0150g.f1928f);
            T.r.G(c0626q, l3, C0150g.f1927e);
            T.r.G(c0626q, c7, C0150g.f1926d);
            C0146e c0146e = C0150g.f1929g;
            if (c0626q.f8163S || !AbstractC1276k.b(c0626q.P(), Integer.valueOf(hashCode))) {
                B3.e.v(hashCode, c0626q, hashCode, c0146e);
            }
            c0626q.p(true);
            c0626q.p(false);
            c0626q.p(false);
            abstractC1688b3 = abstractC1688b2;
            interfaceC1041r3 = interfaceC1041r2;
            f8 = f7;
            z7 = z6;
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new C0457q2(wVar, interfaceC1041r3, abstractC1688b3, str2, interfaceC1028e2, interfaceC0121i2, f8, z7, i6);
        }
    }

    public static final C1115i d(AbstractC0623o0 abstractC0623o0, C0626q c0626q) {
        C1115i c1115i = (C1115i) c0626q.j(abstractC0623o0);
        if (c1115i != null) {
            return c1115i;
        }
        Context context = (Context) c0626q.j(AndroidCompositionLocals_androidKt.f10780b);
        C1115i c1115i2 = C1107a.f12051b;
        if (c1115i2 != null) {
            return c1115i2;
        }
        synchronized (C1107a.a) {
            C1115i c1115i3 = C1107a.f12051b;
            if (c1115i3 != null) {
                return c1115i3;
            }
            context.getApplicationContext();
            C1115i i6 = new E1.b(context).i();
            C1107a.f12051b = i6;
            return i6;
        }
    }

    public static final l e(Object obj, C1115i c1115i, l4.c cVar, l4.c cVar2, InterfaceC0121i interfaceC0121i, C0626q c0626q, int i6) {
        c0626q.c0(1645646697);
        c0626q.c0(952940650);
        Trace.beginSection("rememberAsyncImagePainter");
        try {
            C1661i a6 = B.a(obj, c0626q);
            g(a6);
            c0626q.c0(1094691773);
            Object P5 = c0626q.P();
            if (P5 == C0616l.a) {
                P5 = new l(a6, c1115i);
                c0626q.m0(P5);
            }
            l lVar = (l) P5;
            c0626q.p(false);
            lVar.f12385o = cVar;
            lVar.f12386p = cVar2;
            lVar.f12387q = interfaceC0121i;
            lVar.f12388r = 1;
            lVar.f12389s = ((Boolean) c0626q.j(E0.a)).booleanValue();
            lVar.f12392v.setValue(c1115i);
            lVar.f12391u.setValue(a6);
            lVar.e();
            c0626q.p(false);
            Trace.endSection();
            c0626q.p(false);
            return lVar;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public static void f(String str) {
        throw new IllegalArgumentException("Unsupported type: " + str + ". " + AbstractC1135a.s("If you wish to display this ", str, ", use androidx.compose.foundation.Image."));
    }

    public static final void g(C1661i c1661i) {
        Object obj = c1661i.f14766b;
        if (obj instanceof C1660h) {
            throw new IllegalArgumentException("Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?");
        }
        if (obj instanceof C1395f) {
            f("ImageBitmap");
            throw null;
        }
        if (obj instanceof C1746g) {
            f("ImageVector");
            throw null;
        }
        if (obj instanceof AbstractC1688b) {
            f("Painter");
            throw null;
        }
        if (c1661i.f14767c != null) {
            throw new IllegalArgumentException("request.target must be null.");
        }
    }
}
