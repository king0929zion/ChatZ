package t3;

import B3.m;
import C4.u;
import X3.y;
import b4.InterfaceC0905c;
import m4.AbstractC1276k;
import m4.AbstractC1277l;
import x3.C1878b;
import z3.AbstractC2043m;
import z3.C2031a;

/* renamed from: t3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1727b extends AbstractC1277l implements l4.c {

    /* renamed from: f, reason: collision with root package name */
    public static final C1727b f14913f;

    /* renamed from: g, reason: collision with root package name */
    public static final C1727b f14914g;

    /* renamed from: h, reason: collision with root package name */
    public static final C1727b f14915h;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f14916e;

    static {
        int i6 = 1;
        f14913f = new C1727b(i6, 0);
        f14914g = new C1727b(i6, 1);
        f14915h = new C1727b(i6, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1727b(int i6, int i7) {
        super(i6);
        this.f14916e = i7;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        int i6 = this.f14916e;
        y yVar = y.a;
        switch (i6) {
            case 0:
                d dVar = (d) obj;
                AbstractC1276k.f(dVar, "$this$install");
                f5.a aVar = AbstractC2043m.a;
                int i7 = 3;
                InterfaceC0905c interfaceC0905c = null;
                dVar.f14925h.f(E3.f.f1319j, new C2031a(i7, 1, interfaceC0905c));
                F3.b bVar = dVar.f14926i;
                u uVar = F3.b.f1581k;
                bVar.f(uVar, new m(i7, interfaceC0905c));
                bVar.f(uVar, new A3.e(i7, 5, interfaceC0905c));
                return yVar;
            case 1:
                AbstractC1276k.f((C1878b) obj, "$this$null");
                return yVar;
            default:
                AbstractC1276k.f(obj, "$this$null");
                return yVar;
        }
    }
}
