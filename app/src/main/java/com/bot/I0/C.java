package I0;

import B0.C0028d;
import android.view.accessibility.AccessibilityEvent;
import m4.AbstractC1277l;

/* loaded from: classes.dex */
public final class C extends AbstractC1277l implements l4.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2134e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ D f2135f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C(D d6, int i6) {
        super(1);
        this.f2134e = i6;
        this.f2135f = d6;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f2134e) {
            case 0:
                D d6 = this.f2135f;
                return Boolean.valueOf(d6.f2156g.getParent().requestSendAccessibilityEvent(d6.f2156g, (AccessibilityEvent) obj));
            default:
                Q0 q02 = (Q0) obj;
                if (q02.f2236e.contains(q02)) {
                    D d7 = this.f2135f;
                    H0.t0 snapshotObserver = d7.f2156g.getSnapshotObserver();
                    snapshotObserver.a.d(q02, d7.f2155Q, new C0028d(4, q02, d7));
                }
                return X3.y.a;
        }
    }
}
