package I;

import F0.InterfaceC0134w;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import n0.C1354c;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements InterfaceC1193a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2070c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f2071e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ K.e f2072f;

    public /* synthetic */ b(i iVar, K.e eVar, int i6) {
        this.f2070c = i6;
        this.f2071e = iVar;
        this.f2072f = eVar;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [m4.w, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [m4.w, java.lang.Object] */
    @Override // l4.InterfaceC1193a
    public final Object b() {
        switch (this.f2070c) {
            case 0:
                i iVar = this.f2071e;
                a aVar = iVar.f2090f;
                A.b bVar = new A.b(this.f2072f, 6);
                ?? obj = new Object();
                iVar.f2089e.d("dataBuilder", aVar, new D.r(2, (Object) obj, bVar));
                Object obj2 = obj.f12973c;
                if (obj2 != null) {
                    return (G.c) obj2;
                }
                AbstractC1276k.k("result");
                throw null;
            case 1:
                i iVar2 = this.f2071e;
                a aVar2 = iVar2.f2091g;
                b bVar2 = new b(iVar2, this.f2072f, 2);
                ?? obj3 = new Object();
                iVar2.f2089e.d("positioner", aVar2, new D.r(2, (Object) obj3, bVar2));
                Object obj4 = obj3.f12973c;
                if (obj4 != null) {
                    return (C1354c) obj4;
                }
                AbstractC1276k.k("result");
                throw null;
            default:
                InterfaceC0134w interfaceC0134w = (InterfaceC0134w) this.f2071e.f2087c.b();
                return this.f2072f.r(interfaceC0134w).j(interfaceC0134w.U(0L));
        }
    }
}
