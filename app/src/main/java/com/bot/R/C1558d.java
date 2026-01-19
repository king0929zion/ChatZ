package r;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import n.InterfaceC1334l;

/* renamed from: r.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1558d extends d4.i implements l4.g {

    /* renamed from: h, reason: collision with root package name */
    public int f14278h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ C1603s f14279i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ C1517E f14280j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f14281k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1606t f14282l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1334l f14283m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1558d(C1606t c1606t, InterfaceC1334l interfaceC1334l, InterfaceC0905c interfaceC0905c) {
        super(4, interfaceC0905c);
        this.f14282l = c1606t;
        this.f14283m = interfaceC1334l;
    }

    @Override // l4.g
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        C1558d c1558d = new C1558d(this.f14282l, this.f14283m, (InterfaceC0905c) obj4);
        c1558d.f14279i = (C1603s) obj;
        c1558d.f14280j = (C1517E) obj2;
        c1558d.f14281k = obj3;
        return c1558d.r(X3.y.a);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f14278h;
        if (i6 == 0) {
            X3.a.e(obj);
            C1603s c1603s = this.f14279i;
            C1517E c1517e = this.f14280j;
            Object obj2 = this.f14281k;
            C1606t c1606t = this.f14282l;
            float g3 = c1606t.f14473g.g();
            this.f14279i = null;
            this.f14280j = null;
            this.f14278h = 1;
            Object b5 = AbstractC1573i.b(c1606t, g3, c1603s, c1517e, obj2, this.f14283m, this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (b5 == enumC0927a) {
                return enumC0927a;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
        }
        return X3.y.a;
    }
}
