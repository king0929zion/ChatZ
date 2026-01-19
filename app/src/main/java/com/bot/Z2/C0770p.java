package Z2;

import m4.AbstractC1276k;
import n.C1316c;
import x4.AbstractC1888A;
import x4.InterfaceC1942y;

/* renamed from: Z2.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0770p implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10278c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1942y f10279e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1316c f10280f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f10281g;

    public /* synthetic */ C0770p(InterfaceC1942y interfaceC1942y, C1316c c1316c, float f6, int i6) {
        this.f10278c = i6;
        this.f10279e = interfaceC1942y;
        this.f10280f = c1316c;
        this.f10281g = f6;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        switch (this.f10278c) {
            case 0:
                float floatValue = ((Number) obj2).floatValue();
                AbstractC1276k.f((B0.y) obj, "<unused var>");
                AbstractC1888A.y(this.f10279e, null, new C0768o(this.f10280f, floatValue, this.f10281g, null), 3);
                return X3.y.a;
            case 1:
                float floatValue2 = ((Number) obj2).floatValue();
                AbstractC1276k.f((B0.y) obj, "<unused var>");
                AbstractC1888A.y(this.f10279e, null, new T(this.f10280f, floatValue2, this.f10281g, null), 3);
                return X3.y.a;
            default:
                float floatValue3 = ((Number) obj2).floatValue();
                AbstractC1276k.f((B0.y) obj, "<unused var>");
                AbstractC1888A.y(this.f10279e, null, new U0(this.f10280f, floatValue3, this.f10281g, null), 3);
                return X3.y.a;
        }
    }
}
