package m;

import m4.AbstractC1277l;

/* renamed from: m.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1204K extends AbstractC1277l implements l4.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f12734e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l4.c f12735f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1204K(l4.c cVar, int i6) {
        super(1);
        this.f12734e = i6;
        this.f12735f = cVar;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f12734e) {
            case 0:
                return new e1.j((0 << 32) | (4294967295L & ((Number) this.f12735f.f(Integer.valueOf((int) (((e1.l) obj).a & 4294967295L)))).intValue()));
            case 1:
                return new e1.j((((Number) this.f12735f.f(Integer.valueOf((int) (((e1.l) obj).a >> 32)))).intValue() << 32) | (0 & 4294967295L));
            default:
                return new e1.j((0 << 32) | (4294967295L & ((Number) this.f12735f.f(Integer.valueOf((int) (((e1.l) obj).a & 4294967295L)))).intValue()));
        }
    }
}
