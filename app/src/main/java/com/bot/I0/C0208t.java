package I0;

import m4.AbstractC1277l;

/* renamed from: I0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0208t extends AbstractC1277l implements l4.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2384e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2385f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0208t(int i6, int i7) {
        super(1);
        this.f2384e = i7;
        this.f2385f = i6;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f2384e) {
            case 0:
                return Boolean.valueOf(((m0.C) obj).T0(this.f2385f));
            case 1:
                return Boolean.valueOf(((m0.C) obj).T0(this.f2385f));
            case 2:
                return Boolean.valueOf(((m0.C) obj).T0(this.f2385f));
            case 3:
                return Boolean.valueOf(((m0.C) obj).T0(this.f2385f));
            default:
                return Boolean.valueOf(((m0.C) obj).M0(this.f2385f));
        }
    }
}
