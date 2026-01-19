package b3;

import l4.InterfaceC1193a;
import z.C2004b;

/* renamed from: b3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0892h implements InterfaceC1193a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11031c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2004b f11032e;

    public /* synthetic */ C0892h(C2004b c2004b, int i6) {
        this.f11031c = i6;
        this.f11032e = c2004b;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        int g3;
        switch (this.f11031c) {
            case 0:
                g3 = this.f11032e.f16051d.f16172b.g();
                break;
            case 1:
                g3 = this.f11032e.m();
                break;
            default:
                g3 = this.f11032e.m();
                break;
        }
        return Integer.valueOf(g3);
    }
}
