package r;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import m4.C1287v;

/* loaded from: classes.dex */
public final class A1 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public E1 f13965h;

    /* renamed from: i, reason: collision with root package name */
    public C1287v f13966i;

    /* renamed from: j, reason: collision with root package name */
    public long f13967j;

    /* renamed from: k, reason: collision with root package name */
    public int f13968k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f13969l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ E1 f13970m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1287v f13971n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f13972o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A1(E1 e12, C1287v c1287v, long j3, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f13970m = e12;
        this.f13971n = c1287v;
        this.f13972o = j3;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((A1) p((InterfaceC0905c) obj2, (B1) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        A1 a12 = new A1(this.f13970m, this.f13971n, this.f13972o, interfaceC0905c);
        a12.f13969l = obj;
        return a12;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        E1 e12;
        C1287v c1287v;
        long j3;
        E1 e13;
        int i6 = this.f13968k;
        X0 x02 = X0.f14184e;
        if (i6 == 0) {
            X3.a.e(obj);
            B1 b1 = (B1) this.f13969l;
            e12 = this.f13970m;
            C1579k c1579k = new C1579k(1, e12, b1);
            InterfaceC1619x0 interfaceC1619x0 = e12.f14014c;
            C1287v c1287v2 = this.f13971n;
            long j4 = c1287v2.f12972c;
            X0 x03 = e12.f14015d;
            long j5 = this.f13972o;
            float d6 = e12.d(x03 == x02 ? e1.q.b(j5) : e1.q.c(j5));
            this.f13969l = e12;
            this.f13965h = e12;
            this.f13966i = c1287v2;
            this.f13967j = j4;
            this.f13968k = 1;
            obj = interfaceC1619x0.a(c1579k, d6, this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (obj == enumC0927a) {
                return enumC0927a;
            }
            c1287v = c1287v2;
            j3 = j4;
            e13 = e12;
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j3 = this.f13967j;
            c1287v = this.f13966i;
            e12 = this.f13965h;
            e13 = (E1) this.f13969l;
            X3.a.e(obj);
        }
        float d7 = e13.d(((Number) obj).floatValue());
        c1287v.f12972c = e12.f14015d == x02 ? e1.q.a(j3, d7, S.l.f7374V, 2) : e1.q.a(j3, S.l.f7374V, d7, 1);
        return X3.y.a;
    }
}
