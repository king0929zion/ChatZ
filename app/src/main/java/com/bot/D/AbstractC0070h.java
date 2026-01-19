package D;

import O.AbstractC0336u0;
import O.InterfaceC0331s;
import T.C0616l;
import T.C0626q;
import T.C0627q0;
import b0.AbstractC0874g;
import com.vladsch.flexmark.parser.PegdownExtensions;
import h0.AbstractC1024a;
import h0.C1026c;
import h0.C1038o;
import h0.InterfaceC1041r;
import v.AbstractC1787b;

/* renamed from: D.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0070h {
    public static final float a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f1029b;

    static {
        float f6 = 25;
        a = f6;
        f1029b = (f6 * 2.0f) / 2.4142137f;
    }

    public static final void a(InterfaceC0331s interfaceC0331s, InterfaceC1041r interfaceC1041r, long j3, C0626q c0626q, int i6) {
        int i7;
        c0626q.d0(1776202187);
        int i8 = (c0626q.f(interfaceC0331s) ? 4 : 2) | i6 | (c0626q.f(interfaceC1041r) ? 32 : 16) | PegdownExtensions.FENCED_CODE_BLOCKS;
        if (c0626q.S(i8 & 1, (i8 & 147) != 146)) {
            c0626q.X();
            if ((i6 & 1) == 0 || c0626q.B()) {
                i7 = i8 & (-897);
                j3 = 9205357640488583168L;
            } else {
                c0626q.V();
                i7 = i8 & (-897);
            }
            c0626q.q();
            int i9 = i7 & 14;
            boolean z5 = i9 == 4;
            Object P5 = c0626q.P();
            if (z5 || P5 == C0616l.a) {
                P5 = new C0056a(interfaceC0331s, 0);
                c0626q.m0(P5);
            }
            AbstractC0336u0.a(interfaceC0331s, C1026c.f11787e, AbstractC0874g.c(-1653527038, new C0058b(j3, P0.n.a(interfaceC1041r, false, (l4.c) P5)), c0626q), c0626q, i9 | 432);
        } else {
            c0626q.V();
        }
        long j4 = j3;
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new C0060c(interfaceC0331s, interfaceC1041r, j4, i6);
        }
    }

    public static final void b(InterfaceC1041r interfaceC1041r, C0626q c0626q, int i6, int i7) {
        int i8;
        c0626q.d0(694251107);
        int i9 = i7 & 1;
        if (i9 != 0) {
            i8 = i6 | 6;
        } else {
            i8 = (c0626q.f(interfaceC1041r) ? 4 : 2) | i6;
        }
        if (c0626q.S(i8 & 1, (i8 & 3) != 2)) {
            if (i9 != 0) {
                interfaceC1041r = C1038o.a;
            }
            AbstractC1787b.h(c0626q, AbstractC1024a.a(v.t0.k(interfaceC1041r, f1029b, a), new C0064e(0)));
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new C0062d(interfaceC1041r, i6, i7);
        }
    }
}
