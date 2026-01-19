package p0;

import i4.AbstractC1117a;

/* renamed from: p0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1477m implements InterfaceC1473i {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13877c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1481q f13878e;

    public /* synthetic */ C1477m(C1481q c1481q, int i6) {
        this.f13877c = i6;
        this.f13878e = c1481q;
    }

    @Override // p0.InterfaceC1473i
    public final double e(double d6) {
        switch (this.f13877c) {
            case 0:
                return AbstractC1117a.d(this.f13878e.f13893k.e(d6), r10.f13887e, r10.f13888f);
            default:
                return this.f13878e.f13896n.e(AbstractC1117a.d(d6, r0.f13887e, r0.f13888f));
        }
    }
}
