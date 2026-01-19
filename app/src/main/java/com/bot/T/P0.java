package T;

import f0.AbstractC0974D;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class P0 extends AbstractC0974D {

    /* renamed from: c, reason: collision with root package name */
    public long f8019c;

    public P0(long j3, long j4) {
        super(j3);
        this.f8019c = j4;
    }

    @Override // f0.AbstractC0974D
    public final void a(AbstractC0974D abstractC0974D) {
        AbstractC1276k.d(abstractC0974D, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.f8019c = ((P0) abstractC0974D).f8019c;
    }

    @Override // f0.AbstractC0974D
    public final AbstractC0974D b(long j3) {
        return new P0(j3, this.f8019c);
    }
}
