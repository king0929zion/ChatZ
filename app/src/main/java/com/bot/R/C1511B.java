package r;

import D.C0091s;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.InterfaceC1922e0;

/* renamed from: r.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1511B extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f13973h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f13974i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h2 f13975j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C1515D f13976k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1618x f13977l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f13978m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1922e0 f13979n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1511B(h2 h2Var, C1515D c1515d, InterfaceC1618x interfaceC1618x, long j3, InterfaceC1922e0 interfaceC1922e0, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f13975j = h2Var;
        this.f13976k = c1515d;
        this.f13977l = interfaceC1618x;
        this.f13978m = j3;
        this.f13979n = interfaceC1922e0;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C1511B) p((InterfaceC0905c) obj2, (B1) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        C1511B c1511b = new C1511B(this.f13975j, this.f13976k, this.f13977l, this.f13978m, this.f13979n, interfaceC0905c);
        c1511b.f13974i = obj;
        return c1511b;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f13973h;
        if (i6 == 0) {
            X3.a.e(obj);
            B1 b1 = (B1) this.f13974i;
            long j3 = this.f13978m;
            C1515D c1515d = this.f13976k;
            InterfaceC1618x interfaceC1618x = this.f13977l;
            float M02 = C1515D.M0(c1515d, interfaceC1618x, j3);
            h2 h2Var = this.f13975j;
            h2Var.f14346e = M02;
            C0091s c0091s = new C0091s(c1515d, h2Var, this.f13979n, b1);
            A.g gVar = new A.g(c1515d, h2Var, interfaceC1618x, 14);
            this.f13973h = 1;
            Object a = h2Var.a(c0091s, gVar, this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (a == enumC0927a) {
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
