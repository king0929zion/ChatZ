package r;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import java.util.concurrent.CancellationException;
import x4.AbstractC1888A;
import x4.InterfaceC1922e0;
import x4.InterfaceC1942y;

/* renamed from: r.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1513C extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f13982h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f13983i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C1515D f13984j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ h2 f13985k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1618x f13986l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f13987m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1513C(C1515D c1515d, h2 h2Var, InterfaceC1618x interfaceC1618x, long j3, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f13984j = c1515d;
        this.f13985k = h2Var;
        this.f13986l = interfaceC1618x;
        this.f13987m = j3;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C1513C) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        C1513C c1513c = new C1513C(this.f13984j, this.f13985k, this.f13986l, this.f13987m, interfaceC0905c);
        c1513c.f13983i = obj;
        return c1513c;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        C1515D c1515d = this.f13984j;
        C1609u c1609u = c1515d.f13999w;
        int i6 = this.f13982h;
        try {
            try {
                if (i6 == 0) {
                    X3.a.e(obj);
                    InterfaceC1922e0 r5 = AbstractC1888A.r(((InterfaceC1942y) this.f13983i).c());
                    c1515d.f14002z = true;
                    E1 e12 = c1515d.f13995s;
                    p.x0 x0Var = p.x0.f13823c;
                    C1511B c1511b = new C1511B(this.f13985k, c1515d, this.f13986l, this.f13987m, r5, null);
                    this.f13982h = 1;
                    Object f6 = e12.f(x0Var, c1511b, this);
                    EnumC0927a enumC0927a = EnumC0927a.f11114c;
                    if (f6 == enumC0927a) {
                        return enumC0927a;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    X3.a.e(obj);
                }
                c1609u.b();
                c1515d.f14002z = false;
                c1609u.a(null);
                c1515d.f14000x = false;
                return X3.y.a;
            } catch (CancellationException e6) {
                throw e6;
            }
        } catch (Throwable th) {
            c1515d.f14002z = false;
            c1609u.a(null);
            c1515d.f14000x = false;
            throw th;
        }
    }
}
