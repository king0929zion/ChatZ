package T;

import f0.AbstractC0974D;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class O0 extends AbstractC0974D {

    /* renamed from: c, reason: collision with root package name */
    public int f8017c;

    public O0(long j3, int i6) {
        super(j3);
        this.f8017c = i6;
    }

    @Override // f0.AbstractC0974D
    public final void a(AbstractC0974D abstractC0974D) {
        AbstractC1276k.d(abstractC0974D, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.f8017c = ((O0) abstractC0974D).f8017c;
    }

    @Override // f0.AbstractC0974D
    public final AbstractC0974D b(long j3) {
        return new O0(j3, this.f8017c);
    }
}
