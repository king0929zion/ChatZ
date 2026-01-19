package K;

import A4.C0013n;
import T.C0607g0;
import T.C0626q;
import T.C0627q0;
import T.r;
import X3.y;
import b0.C0873f;
import c4.EnumC0927a;
import d4.i;
import l4.InterfaceC1193a;
import p.A0;
import p.C0;
import p.x0;
import x4.AbstractC1888A;

/* loaded from: classes.dex */
public final class c implements f {
    public final C0873f a;

    /* renamed from: b, reason: collision with root package name */
    public final C0 f2913b = new C0();

    /* renamed from: c, reason: collision with root package name */
    public final C0607g0 f2914c = r.A(null);

    public c(C0873f c0873f) {
        this.a = c0873f;
    }

    @Override // K.f
    public final Object a(e eVar, i iVar) {
        C0013n c0013n = new C0013n(this, new b(eVar), null, 2);
        C0 c02 = this.f2913b;
        c02.getClass();
        Object l3 = AbstractC1888A.l(new A0(x0.f13823c, c02, c0013n, null), iVar);
        return l3 == EnumC0927a.f11114c ? l3 : y.a;
    }

    public final void b(final InterfaceC1193a interfaceC1193a, C0626q c0626q, final int i6) {
        final InterfaceC1193a interfaceC1193a2;
        C0626q c0626q2;
        c0626q.d0(723898654);
        int i7 = (c0626q.f(this) ? 32 : 16) | i6;
        if (c0626q.S(i7 & 1, (i7 & 19) != 18)) {
            b bVar = (b) this.f2914c.getValue();
            if (bVar == null) {
                C0627q0 t5 = c0626q.t();
                if (t5 != null) {
                    final int i8 = 0;
                    t5.f8193d = new l4.e(this, interfaceC1193a, i6, i8) { // from class: K.a

                        /* renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ int f2909c;

                        /* renamed from: e, reason: collision with root package name */
                        public final /* synthetic */ c f2910e;

                        /* renamed from: f, reason: collision with root package name */
                        public final /* synthetic */ InterfaceC1193a f2911f;

                        {
                            this.f2909c = i8;
                            this.f2910e = this;
                        }

                        @Override // l4.e
                        public final Object m(Object obj, Object obj2) {
                            int i9 = this.f2909c;
                            C0626q c0626q3 = (C0626q) obj;
                            ((Integer) obj2).getClass();
                            switch (i9) {
                                case 0:
                                    this.f2910e.b(this.f2911f, c0626q3, r.J(7));
                                    break;
                                default:
                                    this.f2910e.b(this.f2911f, c0626q3, r.J(7));
                                    break;
                            }
                            return y.a;
                        }
                    };
                    return;
                }
                return;
            }
            interfaceC1193a2 = interfaceC1193a;
            c0626q2 = c0626q;
            this.a.n(bVar, bVar.a, interfaceC1193a2, c0626q2, 384);
        } else {
            interfaceC1193a2 = interfaceC1193a;
            c0626q2 = c0626q;
            c0626q2.V();
        }
        C0627q0 t6 = c0626q2.t();
        if (t6 != null) {
            final int i9 = 1;
            t6.f8193d = new l4.e(this, interfaceC1193a2, i6, i9) { // from class: K.a

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ int f2909c;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ c f2910e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1193a f2911f;

                {
                    this.f2909c = i9;
                    this.f2910e = this;
                }

                @Override // l4.e
                public final Object m(Object obj, Object obj2) {
                    int i92 = this.f2909c;
                    C0626q c0626q3 = (C0626q) obj;
                    ((Integer) obj2).getClass();
                    switch (i92) {
                        case 0:
                            this.f2910e.b(this.f2911f, c0626q3, r.J(7));
                            break;
                        default:
                            this.f2910e.b(this.f2911f, c0626q3, r.J(7));
                            break;
                    }
                    return y.a;
                }
            };
        }
    }
}
