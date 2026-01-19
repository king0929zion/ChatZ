package Z2;

import B0.AbstractC0047x;
import F0.InterfaceC0134w;
import m4.AbstractC1276k;
import n.AbstractC1318d;
import n.C1332k;
import n0.C1353b;
import o4.AbstractC1410a;

/* renamed from: Z2.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0745c0 implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10168c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l4.e f10169e;

    public /* synthetic */ C0745c0(int i6, l4.e eVar) {
        this.f10168c = i6;
        this.f10169e = eVar;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f10168c) {
            case 0:
                InterfaceC0134w interfaceC0134w = (InterfaceC0134w) obj;
                AbstractC1276k.f(interfaceC0134w, "coordinates");
                long U5 = interfaceC0134w.U(0L);
                this.f10169e.m(new e1.j((AbstractC1410a.K(Float.intBitsToFloat((int) (U5 >> 32))) << 32) | (AbstractC1410a.K(Float.intBitsToFloat((int) (U5 & 4294967295L))) & 4294967295L)), new e1.l(interfaceC0134w.m()));
                break;
            case 1:
                C1332k c1332k = (C1332k) obj;
                this.f10169e.m(c1332k.f13171e.getValue(), AbstractC1318d.f13114j.f12988b.f(c1332k.f13172f));
                break;
            case 2:
                B0.y yVar = (B0.y) obj;
                this.f10169e.m(yVar, new C1353b(AbstractC0047x.h(yVar, false)));
                yVar.a();
                break;
            default:
                B0.y yVar2 = (B0.y) obj;
                this.f10169e.m(yVar2, Float.valueOf(Float.intBitsToFloat((int) (AbstractC0047x.h(yVar2, false) >> 32))));
                yVar2.a();
                break;
        }
        return X3.y.a;
    }
}
