package P2;

import F0.AbstractC0137z;
import F0.InterfaceC0134w;
import m4.AbstractC1276k;
import n0.C1354c;

/* loaded from: classes.dex */
public final /* synthetic */ class D implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4675c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l4.c f4676e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ T.X f4677f;

    public /* synthetic */ D(l4.c cVar, T.X x5, int i6) {
        this.f4675c = i6;
        this.f4676e = cVar;
        this.f4677f = x5;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f4675c) {
            case 0:
                X0.v vVar = (X0.v) obj;
                AbstractC1276k.f(vVar, "newValue");
                this.f4677f.setValue(vVar);
                this.f4676e.f(vVar.a.f7630e);
                break;
            default:
                InterfaceC0134w interfaceC0134w = (InterfaceC0134w) obj;
                AbstractC1276k.f(interfaceC0134w, "coordinates");
                C1354c f6 = AbstractC0137z.f(interfaceC0134w, true);
                e1.j jVar = new e1.j((((int) f6.a) << 32) | (((int) f6.f13295b) & 4294967295L));
                T.X x5 = this.f4677f;
                x5.setValue(jVar);
                this.f4676e.f(new e1.j(((e1.j) x5.getValue()).a));
                break;
        }
        return X3.y.a;
    }
}
