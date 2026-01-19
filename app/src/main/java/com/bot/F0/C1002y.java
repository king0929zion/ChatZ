package f0;

import m4.AbstractC1276k;

/* renamed from: f0.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1002y extends AbstractC0974D {

    /* renamed from: c, reason: collision with root package name */
    public X.c f11747c;

    /* renamed from: d, reason: collision with root package name */
    public int f11748d;

    /* renamed from: e, reason: collision with root package name */
    public int f11749e;

    public C1002y(long j3, X.c cVar) {
        super(j3);
        this.f11747c = cVar;
    }

    @Override // f0.AbstractC0974D
    public final void a(AbstractC0974D abstractC0974D) {
        synchronized (AbstractC0997t.a) {
            AbstractC1276k.d(abstractC0974D, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.StateListStateRecord>");
            this.f11747c = ((C1002y) abstractC0974D).f11747c;
            this.f11748d = ((C1002y) abstractC0974D).f11748d;
            this.f11749e = ((C1002y) abstractC0974D).f11749e;
        }
    }

    @Override // f0.AbstractC0974D
    public final AbstractC0974D b(long j3) {
        return new C1002y(j3, this.f11747c);
    }
}
