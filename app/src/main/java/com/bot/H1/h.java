package h1;

import H0.t0;
import X3.y;
import android.os.Parcelable;
import android.util.SparseArray;
import l4.InterfaceC1193a;
import m4.AbstractC1277l;

/* loaded from: classes.dex */
public final class h extends AbstractC1277l implements InterfaceC1193a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f11849e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x f11850f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(x xVar, int i6) {
        super(0);
        this.f11849e = i6;
        this.f11850f = xVar;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        t0 snapshotObserver;
        switch (this.f11849e) {
            case 0:
                this.f11850f.getLayoutNode().C();
                return y.a;
            case 1:
                x xVar = this.f11850f;
                if (xVar.f11858h && xVar.isAttachedToWindow() && xVar.getView().getParent() == xVar) {
                    snapshotObserver = xVar.getSnapshotObserver();
                    snapshotObserver.a.d(xVar, C1048b.f11829f, xVar.getUpdate());
                }
                return y.a;
            case 2:
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                this.f11850f.f11903D.saveHierarchyState(sparseArray);
                return sparseArray;
            case 3:
                x xVar2 = this.f11850f;
                xVar2.getReleaseBlock().f(xVar2.f11903D);
                x.h(xVar2);
                return y.a;
            case 4:
                x xVar3 = this.f11850f;
                xVar3.getResetBlock().f(xVar3.f11903D);
                return y.a;
            default:
                x xVar4 = this.f11850f;
                xVar4.getUpdateBlock().f(xVar4.f11903D);
                return y.a;
        }
    }
}
