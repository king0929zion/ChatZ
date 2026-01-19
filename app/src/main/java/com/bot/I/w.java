package I;

import D.C0056a;
import T.C0616l;
import T.C0626q;
import T.C0627q0;
import X3.y;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import h0.C1038o;
import h0.InterfaceC1041r;
import q.AbstractC1493e;
import v.AbstractC1806l;
import v.t0;

/* loaded from: classes.dex */
public final class w {
    public static final w a = new Object();

    public final void a(Drawable drawable, C0626q c0626q, int i6) {
        c0626q.d0(257732500);
        int i7 = (c0626q.h(drawable) ? 4 : 2) | i6;
        if (c0626q.S(i7 & 1, (i7 & 3) != 2)) {
            InterfaceC1041r j3 = t0.j(C1038o.a, AbstractC1493e.f13933j);
            boolean h3 = c0626q.h(drawable);
            Object P5 = c0626q.P();
            if (h3 || P5 == C0616l.a) {
                P5 = new C0056a(drawable, 3);
                c0626q.m0(P5);
            }
            AbstractC1806l.a(l0.h.e(j3, (l4.c) P5), c0626q, 0);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new m(i6, 2, this, drawable);
        }
    }

    public final void b(final Icon icon, C0626q c0626q, final int i6) {
        C0627q0 t5;
        l4.e eVar;
        c0626q.d0(2116504409);
        int i7 = (c0626q.h(icon) ? 4 : 2) | i6;
        if (c0626q.S(i7 & 1, (i7 & 19) != 18)) {
            Context context = (Context) c0626q.j(AndroidCompositionLocals_androidKt.f10780b);
            boolean f6 = c0626q.f(icon) | c0626q.f(context);
            Object P5 = c0626q.P();
            if (f6 || P5 == C0616l.a) {
                P5 = icon.loadDrawable(context);
                c0626q.m0(P5);
            }
            Drawable drawable = (Drawable) P5;
            if (drawable == null) {
                t5 = c0626q.t();
                if (t5 != null) {
                    final int i8 = 0;
                    eVar = new l4.e(this, icon, i6, i8) { // from class: I.v

                        /* renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ int f2121c;

                        /* renamed from: e, reason: collision with root package name */
                        public final /* synthetic */ w f2122e;

                        /* renamed from: f, reason: collision with root package name */
                        public final /* synthetic */ Icon f2123f; {
                            this.f2121c = i8;
                            this.f2122e = this;
                        }

                        @Override // l4.e
                        public final Object m(Object obj, Object obj2) {
                            int i9 = this.f2121c;
                            C0626q c0626q2 = (C0626q) obj;
                            ((Integer) obj2).getClass();
                            switch (i9) {
                                case 0:
                                    this.f2122e.b(this.f2123f, c0626q2, T.r.J(49));
                                    break;
                                default:
                                    this.f2122e.b(this.f2123f, c0626q2, T.r.J(49));
                                    break;
                            }
                            return y.a;
                        }
                    };
                    t5.f8193d = eVar;
                }
                return;
            }
            a(drawable, c0626q, 48);
        } else {
            c0626q.V();
        }
        t5 = c0626q.t();
        if (t5 != null) {
            final int i9 = 1;
            eVar = new l4.e(this, icon, i6, i9) { // from class: I.v

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ int f2121c;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ w f2122e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ Icon f2123f; {
                    this.f2121c = i9;
                    this.f2122e = this;
                }

                @Override // l4.e
                public final Object m(Object obj, Object obj2) {
                    int i92 = this.f2121c;
                    C0626q c0626q2 = (C0626q) obj;
                    ((Integer) obj2).getClass();
                    switch (i92) {
                        case 0:
                            this.f2122e.b(this.f2123f, c0626q2, T.r.J(49));
                            break;
                        default:
                            this.f2122e.b(this.f2123f, c0626q2, T.r.J(49));
                            break;
                    }
                    return y.a;
                }
            };
            t5.f8193d = eVar;
        }
    }
}
