package Z2;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import r.AbstractC1571h0;
import r.AbstractC1573i;
import r.C1559d0;
import w0.InterfaceC1830a;

/* renamed from: Z2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0760k implements PointerInputEventHandler {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1830a f10241b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f10242c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f10243d;

    public /* synthetic */ C0760k(InterfaceC1830a interfaceC1830a, Object obj, String str, int i6) {
        this.a = i6;
        this.f10241b = interfaceC1830a;
        this.f10243d = obj;
        this.f10242c = str;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(B0.D d6, InterfaceC0905c interfaceC0905c) {
        int i6 = this.a;
        EnumC0927a enumC0927a = EnumC0927a.f11114c;
        String str = this.f10242c;
        Object obj = this.f10243d;
        InterfaceC1830a interfaceC1830a = this.f10241b;
        X3.y yVar = X3.y.a;
        switch (i6) {
            case 0:
                B b5 = (B) obj;
                N2.e eVar = new N2.e(interfaceC1830a, b5, str, 1);
                C0758j c0758j = new C0758j(b5, 0);
                C0758j c0758j2 = new C0758j(b5, 1);
                Q.V v5 = new Q.V(b5, 4);
                float f6 = AbstractC1571h0.a;
                Object h3 = AbstractC1573i.h(d6, new C1559d0(eVar, c0758j, c0758j2, v5, null), interfaceC0905c);
                if (h3 != enumC0927a) {
                    h3 = yVar;
                }
                return h3 == enumC0927a ? h3 : yVar;
            default:
                Z0 z02 = (Z0) obj;
                N2.e eVar2 = new N2.e(interfaceC1830a, z02, str, 2);
                S0 s02 = new S0(z02, 0);
                S0 s03 = new S0(z02, 1);
                Q.V v6 = new Q.V(z02, 5);
                float f7 = AbstractC1571h0.a;
                Object h6 = AbstractC1573i.h(d6, new C1559d0(eVar2, s02, s03, v6, null), interfaceC0905c);
                if (h6 != enumC0927a) {
                    h6 = yVar;
                }
                return h6 == enumC0927a ? h6 : yVar;
        }
    }
}
