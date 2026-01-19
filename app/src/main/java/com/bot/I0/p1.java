package I0;

import T.C0602e;
import T.C0616l;
import T.C0626q;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.AbstractC0874g;
import com.tencent.mmkv.R;
import java.util.Set;
import m4.AbstractC1277l;
import n4.InterfaceC1372a;
import n4.InterfaceC1377f;

/* loaded from: classes.dex */
public final class p1 extends AbstractC1277l implements l4.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2347e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q1 f2348f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l4.e f2349g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p1(q1 q1Var, l4.e eVar, int i6) {
        super(2);
        this.f2347e = i6;
        this.f2348f = q1Var;
        this.f2349g = eVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        switch (this.f2347e) {
            case 0:
                C0626q c0626q = (C0626q) obj;
                int intValue = ((Number) obj2).intValue();
                if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                    AndroidCompositionLocals_androidKt.a(this.f2348f.f2374c, this.f2349g, c0626q, 0);
                } else {
                    c0626q.V();
                }
                return X3.y.a;
            default:
                C0626q c0626q2 = (C0626q) obj;
                int intValue2 = ((Number) obj2).intValue();
                if (c0626q2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                    q1 q1Var = this.f2348f;
                    ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x = q1Var.f2374c;
                    Object tag = viewTreeObserverOnGlobalLayoutListenerC0216x.getTag(R.id.inspection_slot_table_set);
                    Set set = (!(tag instanceof Set) || ((tag instanceof InterfaceC1372a) && !(tag instanceof InterfaceC1377f))) ? null : (Set) tag;
                    if (set == null) {
                        Object parent = viewTreeObserverOnGlobalLayoutListenerC0216x.getParent();
                        View view = parent instanceof View ? (View) parent : null;
                        Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                        set = (!(tag2 instanceof Set) || ((tag2 instanceof InterfaceC1372a) && !(tag2 instanceof InterfaceC1377f))) ? null : (Set) tag2;
                    }
                    if (set != null) {
                        set.add(c0626q2.y());
                        c0626q2.f8181q = true;
                        c0626q2.f8147C = true;
                        c0626q2.f8167c.b();
                        c0626q2.f8152H.b();
                        T.M0 m02 = c0626q2.f8153I;
                        T.J0 j02 = m02.a;
                        m02.f7989e = j02.f7975m;
                        m02.f7990f = j02.f7976n;
                    }
                    boolean h3 = c0626q2.h(q1Var);
                    Object P5 = c0626q2.P();
                    C0602e c0602e = C0616l.a;
                    if (h3 || P5 == c0602e) {
                        P5 = new n1(q1Var, null);
                        c0626q2.m0(P5);
                    }
                    T.r.f(c0626q2, viewTreeObserverOnGlobalLayoutListenerC0216x, (l4.e) P5);
                    boolean h6 = c0626q2.h(q1Var);
                    Object P6 = c0626q2.P();
                    if (h6 || P6 == c0602e) {
                        P6 = new o1(q1Var, null);
                        c0626q2.m0(P6);
                    }
                    T.r.f(c0626q2, viewTreeObserverOnGlobalLayoutListenerC0216x, (l4.e) P6);
                    T.r.a(g0.g.a.a(set), AbstractC0874g.c(-280240369, new p1(q1Var, this.f2349g, 0), c0626q2), c0626q2, 56);
                } else {
                    c0626q2.V();
                }
                return X3.y.a;
        }
    }
}
