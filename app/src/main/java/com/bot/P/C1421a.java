package p;

import H0.AbstractC0157l;
import H0.InterfaceC0155j;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import u.AbstractC1734b;

/* renamed from: p.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1421a implements InterfaceC1193a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13672c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f13673e;

    public /* synthetic */ C1421a(r rVar, int i6) {
        this.f13672c = i6;
        this.f13673e = rVar;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        InterfaceC0155j interfaceC0155j;
        switch (this.f13672c) {
            case 0:
                T.B b5 = AbstractC1450o0.a;
                r rVar = this.f13673e;
                InterfaceC1455r0 interfaceC1455r0 = (InterfaceC1455r0) AbstractC0157l.h(rVar, b5);
                if (interfaceC1455r0 == null) {
                    AbstractC1734b.a("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: " + interfaceC1455r0);
                }
                InterfaceC1455r0 interfaceC1455r02 = rVar.f13768B;
                rVar.f13768B = interfaceC1455r0;
                if (interfaceC1455r02 != null && !AbstractC1276k.b(interfaceC1455r0, interfaceC1455r02) && ((interfaceC0155j = rVar.f13770D) != null || !rVar.f13777K)) {
                    if (interfaceC0155j != null) {
                        rVar.N0(interfaceC0155j);
                    }
                    rVar.f13770D = null;
                    rVar.W0();
                }
                return X3.y.a;
            default:
                this.f13673e.f13787z.b();
                return Boolean.TRUE;
        }
    }
}
