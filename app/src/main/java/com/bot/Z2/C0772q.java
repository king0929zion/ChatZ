package Z2;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import n.C1316c;
import r.AbstractC1571h0;
import x4.InterfaceC1942y;

/* renamed from: Z2.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0772q implements PointerInputEventHandler {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f10285b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ T.X f10286c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1942y f10287d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1316c f10288e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f10289f;

    public /* synthetic */ C0772q(float f6, int i6, T.X x5, String str, C1316c c1316c, InterfaceC1942y interfaceC1942y) {
        this.a = i6;
        this.f10285b = str;
        this.f10286c = x5;
        this.f10287d = interfaceC1942y;
        this.f10288e = c1316c;
        this.f10289f = f6;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(B0.D d6, InterfaceC0905c interfaceC0905c) {
        switch (this.a) {
            case 0:
                String str = this.f10285b;
                T.X x5 = this.f10286c;
                C0762l c0762l = new C0762l(str, x5, 0);
                float f6 = this.f10289f;
                C1316c c1316c = this.f10288e;
                InterfaceC1942y interfaceC1942y = this.f10287d;
                Object f7 = AbstractC1571h0.f(d6, c0762l, new C0766n(f6, 0, x5, str, c1316c, interfaceC1942y), new C0770p(interfaceC1942y, c1316c, f6, 0), interfaceC0905c);
                return f7 == EnumC0927a.f11114c ? f7 : X3.y.a;
            case 1:
                String str2 = this.f10285b;
                T.X x6 = this.f10286c;
                C0762l c0762l2 = new C0762l(str2, x6, 1);
                float f8 = this.f10289f;
                C1316c c1316c2 = this.f10288e;
                InterfaceC1942y interfaceC1942y2 = this.f10287d;
                Object f9 = AbstractC1571h0.f(d6, c0762l2, new C0766n(f8, 1, x6, str2, c1316c2, interfaceC1942y2), new C0770p(interfaceC1942y2, c1316c2, f8, 1), interfaceC0905c);
                return f9 == EnumC0927a.f11114c ? f9 : X3.y.a;
            default:
                String str3 = this.f10285b;
                T.X x7 = this.f10286c;
                C0762l c0762l3 = new C0762l(str3, x7, 2);
                float f10 = this.f10289f;
                C1316c c1316c3 = this.f10288e;
                InterfaceC1942y interfaceC1942y3 = this.f10287d;
                Object f11 = AbstractC1571h0.f(d6, c0762l3, new C0766n(f10, 2, x7, str3, c1316c3, interfaceC1942y3), new C0770p(interfaceC1942y3, c1316c3, f10, 2), interfaceC0905c);
                return f11 == EnumC0927a.f11114c ? f11 : X3.y.a;
        }
    }
}
