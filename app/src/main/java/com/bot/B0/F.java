package B0;

import D.V0;
import F0.j0;
import F0.k0;
import H0.H0;
import I0.C0197n;
import I0.D0;
import I0.Y;
import I0.Z;
import I0.p1;
import I0.q1;
import android.content.Context;
import android.view.Choreographer;
import android.view.MotionEvent;
import androidx.lifecycle.EnumC0842p;
import b0.C0873f;
import com.vladsch.flexmark.parser.PegdownExtensions;
import h0.C1046w;
import h0.InterfaceC1041r;
import i1.C1105y;
import i1.InterfaceC1078B;
import m.C1198E;
import m4.AbstractC1276k;
import m4.AbstractC1277l;
import o0.C1402m;
import u4.AbstractC1776n;
import v.AbstractC1787b;

/* loaded from: classes.dex */
public final class F extends AbstractC1277l implements l4.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f386e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f387f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f388g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ F(int i6, Object obj, Object obj2) {
        super(1);
        this.f386e = i6;
        this.f387f = obj;
        this.f388g = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l4.c
    public final Object f(Object obj) {
        M.z zVar;
        switch (this.f386e) {
            case 0:
                MotionEvent motionEvent = (MotionEvent) obj;
                I i6 = (I) this.f388g;
                if (motionEvent.getActionMasked() == 0) {
                    ((H) this.f387f).f392e = ((Boolean) ((J) i6.e()).f(motionEvent)).booleanValue() ? E.f383e : E.f384f;
                } else {
                    ((J) i6.e()).f(motionEvent);
                }
                return X3.y.a;
            case 1:
                B3.d dVar = (B3.d) this.f387f;
                String sb = ((StringBuilder) this.f388g).toString();
                AbstractC1276k.e(sb, "requestLog.toString()");
                StringBuilder sb2 = dVar.f516b;
                sb2.append(AbstractC1776n.l0(sb).toString());
                sb2.append('\n');
                dVar.a();
                return X3.y.a;
            case 2:
                Context context = (Context) this.f387f;
                Context applicationContext = context.getApplicationContext();
                I0.N n3 = (I0.N) this.f388g;
                applicationContext.registerComponentCallbacks(n3);
                return new V0(2, context, n3);
            case 3:
                Context context2 = (Context) this.f387f;
                Context applicationContext2 = context2.getApplicationContext();
                I0.O o5 = (I0.O) this.f388g;
                applicationContext2.registerComponentCallbacks(o5);
                return new V0(3, context2, o5);
            case 4:
                return new D0((M.y) this.f387f, new A0.b((I0.S) this.f388g, 5));
            case AbstractC1787b.f15290g /* 5 */:
                D0 d02 = (D0) this.f387f;
                synchronized (d02.f2177c) {
                    try {
                        d02.f2179e = true;
                        V.e eVar = d02.f2178d;
                        Object[] objArr = eVar.f8759c;
                        int i7 = eVar.f8761f;
                        for (int i8 = 0; i8 < i7; i8++) {
                            X0.m mVar = (X0.m) ((H0) objArr[i8]).get();
                            if (mVar != null && (zVar = mVar.f9114b) != null) {
                                mVar.a(zVar);
                                mVar.f9114b = null;
                            }
                        }
                        d02.f2178d.g();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                X0.w wVar = ((I0.S) this.f388g).f2243e;
                wVar.f9127b.set(null);
                wVar.a.d();
                return X3.y.a;
            case 6:
                I0.X x5 = (I0.X) this.f387f;
                Y y5 = (Y) this.f388g;
                synchronized (x5.f2257h) {
                    x5.f2259j.remove(y5);
                }
                return X3.y.a;
            case 7:
                ((Choreographer) ((Z) this.f387f).f2268e).removeFrameCallback((Y) this.f388g);
                return X3.y.a;
            case 8:
                C0197n c0197n = (C0197n) obj;
                l4.e eVar2 = (l4.e) this.f388g;
                q1 q1Var = (q1) this.f387f;
                if (!q1Var.f2376f) {
                    androidx.lifecycle.O g3 = c0197n.a.g();
                    q1Var.f2378h = eVar2;
                    if (q1Var.f2377g == null) {
                        q1Var.f2377g = g3;
                        g3.a(q1Var);
                    } else if (g3.g().compareTo(EnumC0842p.f10877f) >= 0) {
                        q1Var.f2375e.B(new C0873f(new p1(q1Var, eVar2, 1), true, 1330788943));
                    }
                }
                return X3.y.a;
            case AbstractC1787b.f15287d /* 9 */:
                Throwable th2 = (Throwable) obj;
                if (th2 != null) {
                    ((io.ktor.utils.io.t) ((io.ktor.utils.io.A) this.f387f)).i(th2);
                    ((io.ktor.utils.io.t) this.f388g).i(th2);
                }
                return X3.y.a;
            case AbstractC1787b.f15289f /* 10 */:
                Throwable th3 = (Throwable) obj;
                if (th3 != null) {
                    ((io.ktor.utils.io.t) this.f387f).i(th3);
                    ((io.ktor.utils.io.t) this.f388g).i(th3);
                }
                return X3.y.a;
            case 11:
                ((j0) obj).h((k0) this.f387f, 0, 0, ((C1046w) this.f388g).f11826r);
                return X3.y.a;
            case 12:
                ((H0.J) this.f387f).f0(((InterfaceC1041r) obj).c((InterfaceC1041r) this.f388g));
                return X3.y.a;
            case 13:
                C1105y c1105y = (C1105y) this.f387f;
                c1105y.setPositionProvider((InterfaceC1078B) this.f388g);
                c1105y.o();
                return new Object();
            case 14:
                ((j0) obj).h((k0) this.f387f, 0, 0, ((C1198E) this.f388g).f12712c.g());
                return X3.y.a;
            case 15:
                j0.p((j0) obj, (k0) this.f387f, 0, 0, ((C1402m) this.f388g).f13470r, 4);
                return X3.y.a;
            case PegdownExtensions.AUTOLINKS /* 16 */:
                j0.p((j0) obj, (k0) this.f387f, 0, 0, ((o0.M) this.f388g).f13444G, 4);
                return X3.y.a;
            default:
                AbstractC1276k.f(obj, "$this$null");
                l4.c cVar = (l4.c) this.f387f;
                if (cVar != null) {
                    cVar.f(obj);
                }
                ((l4.c) this.f388g).f(obj);
                return X3.y.a;
        }
    }
}
