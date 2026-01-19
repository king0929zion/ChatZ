package I0;

import T.AbstractC0633u;
import m4.C1274i;
import m4.InterfaceC1272g;

/* loaded from: classes.dex */
public final /* synthetic */ class r1 implements G0, InterfaceC1272g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC0633u f2382c;

    public r1(AbstractC0633u abstractC0633u) {
        this.f2382c = abstractC0633u;
    }

    @Override // m4.InterfaceC1272g
    public final X3.e b() {
        return new C1274i(1, this.f2382c, AbstractC0633u.class, "scheduleFrameEndCallback", "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;", 0, 0);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof G0) && (obj instanceof InterfaceC1272g)) {
            return b().equals(((InterfaceC1272g) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
