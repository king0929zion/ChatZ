package f0;

import m4.AbstractC1276k;

/* renamed from: f0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0998u extends AbstractC0974D {

    /* renamed from: c, reason: collision with root package name */
    public W.d f11720c;

    /* renamed from: d, reason: collision with root package name */
    public int f11721d;

    public C0998u(long j3, W.d dVar) {
        super(j3);
        this.f11720c = dVar;
    }

    @Override // f0.AbstractC0974D
    public final void a(AbstractC0974D abstractC0974D) {
        AbstractC1276k.d(abstractC0974D, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord, V of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord>");
        C0998u c0998u = (C0998u) abstractC0974D;
        synchronized (AbstractC0997t.f11719b) {
            this.f11720c = c0998u.f11720c;
            this.f11721d = c0998u.f11721d;
        }
    }

    @Override // f0.AbstractC0974D
    public final AbstractC0974D b(long j3) {
        return new C0998u(j3, this.f11720c);
    }
}
