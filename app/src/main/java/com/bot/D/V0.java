package D;

import P2.C0359i0;
import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.InterfaceC0846u;
import java.util.Iterator;
import java.util.List;
import n.C1297F;
import n.C1300I;
import t.C1682j;
import t.C1683k;
import t.C1684l;
import t1.AbstractC1708k;
import t1.AbstractC1713p;
import v.AbstractC1787b;

/* loaded from: classes.dex */
public final class V0 implements T.G {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f945b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f946c;

    public /* synthetic */ V0(int i6, Object obj, Object obj2) {
        this.a = i6;
        this.f945b = obj;
        this.f946c = obj2;
    }

    @Override // T.G
    public final void dispose() {
        Integer num;
        int i6 = this.a;
        Object obj = this.f946c;
        Object obj2 = this.f945b;
        switch (i6) {
            case 0:
                T.X x5 = (T.X) obj2;
                C1684l c1684l = (C1684l) x5.getValue();
                if (c1684l != null) {
                    C1683k c1683k = new C1683k(c1684l);
                    C1682j c1682j = (C1682j) obj;
                    if (c1682j != null) {
                        c1682j.b(c1683k);
                    }
                    x5.setValue(null);
                    return;
                }
                return;
            case 1:
                ((i1) obj2).f1039c.remove((l4.c) obj);
                return;
            case 2:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((I0.N) obj);
                return;
            case 3:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((I0.O) obj);
                return;
            case 4:
                ((I1.j) obj2).f2550k.f2998j.j((J1.l) obj);
                return;
            case AbstractC1787b.f15290g /* 5 */:
                Iterator it = ((List) ((T.d1) obj2).getValue()).iterator();
                while (it.hasNext()) {
                    ((J1.i) obj).b().c((I1.j) it.next());
                }
                return;
            case 6:
                ((InterfaceC0846u) obj2).g().j((C0359i0) obj);
                return;
            case 7:
                Window window = (Window) obj2;
                if (window == null || (num = (Integer) obj) == null) {
                    return;
                }
                window.setSoftInputMode(num.intValue());
                return;
            case 8:
                ((InterfaceC0846u) obj2).g().j((L1.f) obj);
                return;
            case AbstractC1787b.f15287d /* 9 */:
                ((C1300I) obj2).a.j((C1297F) obj);
                return;
            case AbstractC1787b.f15289f /* 10 */:
                ((n.y0) obj2).f13286j.remove((n.y0) obj);
                return;
            case 11:
                n.y0 y0Var = (n.y0) obj2;
                y0Var.getClass();
                n.q0 q0Var = (n.q0) ((n.r0) obj).f13222b.getValue();
                if (q0Var != null) {
                    y0Var.f13285i.remove(q0Var.f13218c);
                    return;
                }
                return;
            case 12:
                ((n.y0) obj2).f13285i.remove((n.u0) obj);
                return;
            case 13:
                v.G0 g02 = (v.G0) obj2;
                View view = (View) obj;
                int i7 = g02.f15240u - 1;
                g02.f15240u = i7;
                if (i7 == 0) {
                    int i8 = AbstractC1713p.a;
                    AbstractC1708k.b(view, null);
                    AbstractC1713p.c(view, null);
                    view.removeOnAttachStateChangeListener(g02.f15241v);
                    return;
                }
                return;
            default:
                ((y.o0) obj2).f15908f.j(obj);
                return;
        }
    }
}
