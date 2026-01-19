package T;

import f0.AbstractC0974D;
import f0.AbstractC0992o;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class Q0 extends AbstractC0974D {

    /* renamed from: c, reason: collision with root package name */
    public Object f8023c;

    public Q0(long j3, Object obj) {
        super(j3);
        this.f8023c = obj;
    }

    @Override // f0.AbstractC0974D
    public final void a(AbstractC0974D abstractC0974D) {
        AbstractC1276k.d(abstractC0974D, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
        this.f8023c = ((Q0) abstractC0974D).f8023c;
    }

    @Override // f0.AbstractC0974D
    public final AbstractC0974D b(long j3) {
        return new Q0(AbstractC0992o.j().g(), this.f8023c);
    }
}
