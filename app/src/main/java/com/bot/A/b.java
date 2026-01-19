package A;

import D.C0056a;
import D.C0098v0;
import D.Z0;
import H0.AbstractC0157l;
import I0.S0;
import I1.t;
import M.q;
import M4.AbstractC0252a0;
import N.u;
import Q.C0405d2;
import Q.C0439m0;
import Q.C2;
import Q.I2;
import Q.T0;
import Q.T2;
import R.k0;
import R.l0;
import S0.C0545g;
import X3.y;
import Y3.C;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.EnumC0842p;
import androidx.lifecycle.N;
import androidx.lifecycle.W;
import b3.C0889e;
import b3.C0898n;
import com.vladsch.flexmark.parser.PegdownExtensions;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import m4.AbstractC1289x;
import n0.C1354c;
import o4.AbstractC1410a;
import r.X0;
import s4.InterfaceC1672b;
import v.AbstractC1787b;
import x4.C1928k;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements InterfaceC1193a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f0c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1e;

    public /* synthetic */ b(C0439m0 c0439m0, S0 s02) {
        this.f0c = 23;
        this.f1e = c0439m0;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        ActivityOptions pendingIntentBackgroundActivityStartMode;
        InterfaceC1193a interfaceC1193a;
        switch (this.f0c) {
            case 0:
                return (C1354c) this.f1e;
            case 1:
                ((B.i) this.f1e).f360R.f(Boolean.valueOf(!r0.f359Q));
                return y.a;
            case 2:
                return (C0545g) this.f1e;
            case 3:
                return ((C0098v0) this.f1e).d();
            case 4:
                return new Z0((X0) this.f1e, S.l.f7374V);
            case AbstractC1787b.f15290g /* 5 */:
                return new e1.j(((e1.k) this.f1e).c());
            case 6:
                return ((K.e) this.f1e).data();
            case 7:
                ((G.g) this.f1e).close();
                return y.a;
            case 8:
                PendingIntent actionIntent = ((RemoteAction) this.f1e).getActionIntent();
                if (Build.VERSION.SDK_INT >= 34) {
                    try {
                        pendingIntentBackgroundActivityStartMode = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1);
                        actionIntent.send(pendingIntentBackgroundActivityStartMode.toBundle());
                    } catch (PendingIntent.CanceledException e6) {
                        Log.e("TextClassification", "error sending pendingIntent: " + actionIntent + " error: " + e6);
                    }
                } else {
                    actionIntent.send();
                }
                return y.a;
            case AbstractC1787b.f15287d /* 9 */:
                L1.c cVar = ((I1.j) this.f1e).f2550k;
                if (!cVar.f2997i) {
                    throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
                }
                if (cVar.f2998j.f10884g != EnumC0842p.f10875c) {
                    return ((L1.b) N.j(cVar.a, (W) cVar.f3001m.getValue(), 4).a(AbstractC1289x.a(L1.b.class))).f2989b;
                }
                throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
            case AbstractC1787b.f15289f /* 10 */:
                ((t3.d) this.f1e).close();
                return y.a;
            case 11:
                I4.c cVar2 = (I4.c) this.f1e;
                K4.g l3 = Y4.d.l("kotlinx.serialization.Polymorphic", K4.c.f2948e, new SerialDescriptor[0], new C0056a(cVar2, 5));
                InterfaceC1672b interfaceC1672b = cVar2.a;
                AbstractC1276k.f(interfaceC1672b, "context");
                return new K4.b(l3, interfaceC1672b);
            case 12:
                J.l lVar = (J.l) this.f1e;
                return lVar.f11819q ? J.i.b(lVar) : G.c.f1636b;
            case 13:
                return AbstractC1410a.l((Context) this.f1e);
            case 14:
                K4.g gVar = (K4.g) this.f1e;
                return Integer.valueOf(AbstractC0252a0.e(gVar, gVar.f2967j));
            case 15:
                return new t((String) this.f1e);
            case PegdownExtensions.AUTOLINKS /* 16 */:
                Object systemService = ((View) ((q) this.f1e).f3179e).getContext().getSystemService("input_method");
                AbstractC1276k.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                return (InputMethodManager) systemService;
            case 17:
                return new BaseInputConnection(((M.y) this.f1e).a, false);
            case 18:
                N.q qVar = (N.q) this.f1e;
                qVar.f3606G = null;
                AbstractC0157l.m(qVar);
                AbstractC0157l.l(qVar);
                AbstractC0157l.k(qVar);
                return Boolean.TRUE;
            case 19:
                u uVar = (u) this.f1e;
                uVar.f3628B = null;
                AbstractC0157l.m(uVar);
                AbstractC0157l.l(uVar);
                AbstractC0157l.k(uVar);
                return Boolean.TRUE;
            case 20:
                AbstractC0157l.k((P.a) this.f1e);
                return y.a;
            case 21:
                return ((q) this.f1e).c(":memory:");
            case 22:
                C0889e c0889e = (C0889e) this.f1e;
                C0898n c0898n = (C0898n) c0889e.a.getValue();
                List list = c0898n.f11044b;
                int i6 = c0898n.f11045c;
                AbstractC1276k.f(list, "images");
                c0889e.a.setValue(new C0898n(false, list, i6));
                return y.a;
            case 23:
                ((C0439m0) this.f1e).b();
                return Boolean.TRUE;
            case 24:
                ((T0) this.f1e).f5518g.b();
                return y.a;
            case 25:
                return new e1.f(C.B(l0.f6804d, l0.f6805e, ((k0) this.f1e).a()));
            case 26:
                return ((C0405d2) this.f1e).f5766c;
            case 27:
                C2 c22 = (C2) this.f1e;
                if (!((Boolean) c22.f5192q.getValue()).booleanValue() && (interfaceC1193a = c22.f5180e) != null) {
                    interfaceC1193a.b();
                }
                return y.a;
            case 28:
                C1928k c1928k = ((I2) this.f1e).f5297b;
                if (c1928k.y()) {
                    c1928k.k(T2.f5525c);
                }
                return Boolean.TRUE;
            default:
                U1.e eVar = (U1.e) this.f1e;
                eVar.g().a(new U1.b(eVar, 0));
                return y.a;
        }
    }

    public /* synthetic */ b(Object obj, int i6) {
        this.f0c = i6;
        this.f1e = obj;
    }
}
