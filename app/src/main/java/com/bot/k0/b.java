package k0;

import B0.C0030f;
import B0.G;
import H0.AbstractC0157l;
import H0.E0;
import android.view.DragEvent;
import android.view.View;
import f0.C0987j;
import h0.AbstractC1040q;
import k.C1155b;
import k.C1160g;
import v.AbstractC1787b;

/* loaded from: classes.dex */
public final class b implements View.OnDragListener, c {
    public final e a;

    /* renamed from: b, reason: collision with root package name */
    public final C1160g f12593b;

    /* renamed from: c, reason: collision with root package name */
    public final a f12594c;

    /* JADX WARN: Type inference failed for: r0v0, types: [h0.q, k0.e] */
    public b() {
        AbstractC1040q abstractC1040q = new AbstractC1040q();
        abstractC1040q.f12597t = 0L;
        this.a = abstractC1040q;
        this.f12593b = new C1160g(0);
        this.f12594c = new a(this);
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [m4.r, java.lang.Object] */
    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        C0987j c0987j = new C0987j(dragEvent, 2);
        int action = dragEvent.getAction();
        E0 e02 = E0.f1692c;
        C1160g c1160g = this.f12593b;
        e eVar = this.a;
        switch (action) {
            case 1:
                Object obj = new Object();
                C0030f c0030f = new C0030f(c0987j, eVar, obj);
                if (c0030f.f(eVar) == e02) {
                    AbstractC0157l.B(eVar, c0030f);
                }
                boolean z5 = obj.f12968c;
                c1160g.getClass();
                C1155b c1155b = new C1155b(c1160g);
                while (c1155b.hasNext()) {
                    ((e) c1155b.next()).Q0(c0987j);
                }
                return z5;
            case 2:
                eVar.P0(c0987j);
                return false;
            case 3:
                return eVar.M0(c0987j);
            case 4:
                G g3 = new G(c0987j, 20);
                if (g3.f(eVar) == e02) {
                    AbstractC0157l.B(eVar, g3);
                }
                c1160g.clear();
                return false;
            case AbstractC1787b.f15290g /* 5 */:
                eVar.N0(c0987j);
                return false;
            case 6:
                eVar.O0(c0987j);
                return false;
            default:
                return false;
        }
    }
}
