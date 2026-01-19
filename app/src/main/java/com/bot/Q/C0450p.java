package Q;

import R.AbstractC0507l;
import T.C0616l;
import T.C0626q;
import T.C0627q0;
import b0.AbstractC0874g;
import com.tencent.mmkv.R;
import h0.C1038o;
import h0.InterfaceC1041r;
import v.AbstractC1787b;

/* renamed from: Q.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0450p {
    public static final C0450p a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final float f6030b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f6031c;

    /* renamed from: d, reason: collision with root package name */
    public static final float f6032d;

    /* JADX WARN: Type inference failed for: r0v0, types: [Q.p, java.lang.Object] */
    static {
        S.f fVar = S.v.a;
        float f6 = S.v.f7479f;
        f6030b = 640;
        f6031c = 56;
        f6032d = 125;
    }

    public final void a(InterfaceC1041r interfaceC1041r, float f6, float f7, o0.L l3, long j3, C0626q c0626q, final int i6) {
        final InterfaceC1041r interfaceC1041r2;
        final float f8;
        final float f9;
        final o0.L l5;
        final long j4;
        long d6;
        float f10;
        float f11;
        o0.L l6;
        InterfaceC1041r interfaceC1041r3;
        c0626q.d0(-1364277227);
        int i7 = i6 | 9654;
        if (c0626q.S(i7 & 1, (i7 & 9363) != 9362)) {
            c0626q.X();
            if ((i6 & 1) == 0 || c0626q.B()) {
                float f12 = S.v.f7478e;
                float f13 = S.v.f7477d;
                C.d dVar = ((V1) c0626q.j(W1.a)).f5547e;
                d6 = O.d(S.v.f7476c, c0626q);
                f10 = f12;
                f11 = f13;
                l6 = dVar;
                interfaceC1041r3 = C1038o.a;
            } else {
                c0626q.V();
                interfaceC1041r3 = interfaceC1041r;
                f10 = f6;
                f11 = f7;
                l6 = l3;
                d6 = j3;
            }
            c0626q.q();
            String j5 = AbstractC0507l.j(R.string.m3c_bottom_sheet_drag_handle_description, c0626q);
            InterfaceC1041r A5 = AbstractC1787b.A(S.l.f7374V, AbstractC0393a2.a, 1, interfaceC1041r3);
            boolean f14 = c0626q.f(j5);
            Object P5 = c0626q.P();
            if (f14 || P5 == C0616l.a) {
                P5 = new M2.b(j5, 1);
                c0626q.m0(P5);
            }
            long j6 = d6;
            X2.a(P0.n.a(A5, false, (l4.c) P5), l6, j6, 0L, S.l.f7374V, S.l.f7374V, AbstractC0874g.c(-1039573072, new C0446o(f10, f11), c0626q), c0626q, 12582912, 120);
            l5 = l6;
            j4 = j6;
            interfaceC1041r2 = interfaceC1041r3;
            f8 = f10;
            f9 = f11;
        } else {
            c0626q.V();
            interfaceC1041r2 = interfaceC1041r;
            f8 = f6;
            f9 = f7;
            l5 = l3;
            j4 = j3;
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new l4.e(interfaceC1041r2, f8, f9, l5, j4, i6) { // from class: Q.n

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1041r f5989e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ float f5990f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ float f5991g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ o0.L f5992h;

                /* renamed from: i, reason: collision with root package name */
                public final /* synthetic */ long f5993i;

                @Override // l4.e
                public final Object m(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int J4 = T.r.J(196609);
                    C0450p.this.a(this.f5989e, this.f5990f, this.f5991g, this.f5992h, this.f5993i, (C0626q) obj, J4);
                    return X3.y.a;
                }
            };
        }
    }
}
