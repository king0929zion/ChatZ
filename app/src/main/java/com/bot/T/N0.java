package T;

import f0.AbstractC0974D;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class N0 extends AbstractC0974D {

    /* renamed from: c, reason: collision with root package name */
    public float f8011c;

    public N0(float f6, long j3) {
        super(j3);
        this.f8011c = f6;
    }

    @Override // f0.AbstractC0974D
    public final void a(AbstractC0974D abstractC0974D) {
        AbstractC1276k.d(abstractC0974D, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.f8011c = ((N0) abstractC0974D).f8011c;
    }

    @Override // f0.AbstractC0974D
    public final AbstractC0974D b(long j3) {
        return new N0(this.f8011c, j3);
    }
}
