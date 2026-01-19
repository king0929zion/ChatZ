package M;

import D.C0098v0;
import O.N0;
import S0.O;
import android.os.CancellationSignal;
import x4.s0;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements CancellationSignal.OnCancelListener {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3177b;

    public /* synthetic */ o(Object obj, int i6) {
        this.a = i6;
        this.f3177b = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        switch (this.a) {
            case 0:
                N0 n02 = (N0) this.f3177b;
                if (n02 != null) {
                    C0098v0 c0098v0 = n02.f3995d;
                    if (c0098v0 != null) {
                        c0098v0.e(O.f7610b);
                    }
                    C0098v0 c0098v02 = n02.f3995d;
                    if (c0098v02 != null) {
                        c0098v02.f(O.f7610b);
                        return;
                    }
                    return;
                }
                return;
            default:
                ((s0) this.f3177b).f(null);
                return;
        }
    }
}
