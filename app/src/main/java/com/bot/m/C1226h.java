package m;

import m4.AbstractC1277l;
import n.AbstractC1318d;

/* renamed from: m.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1226h extends AbstractC1277l implements l4.e {

    /* renamed from: f, reason: collision with root package name */
    public static final C1226h f12810f;

    /* renamed from: g, reason: collision with root package name */
    public static final C1226h f12811g;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f12812e;

    static {
        int i6 = 2;
        f12810f = new C1226h(i6, 0);
        f12811g = new C1226h(i6, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1226h(int i6, int i7) {
        super(i6);
        this.f12812e = i7;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        switch (this.f12812e) {
            case 0:
                long j3 = ((e1.l) obj).a;
                long j4 = ((e1.l) obj2).a;
                long j5 = 1;
                return AbstractC1318d.r(S.l.f7374V, 400.0f, new e1.l((j5 & 4294967295L) | (j5 << 32)), 1);
            default:
                EnumC1199F enumC1199F = (EnumC1199F) obj2;
                return Boolean.valueOf(((EnumC1199F) obj) == enumC1199F && enumC1199F == EnumC1199F.f12716f);
        }
    }
}
