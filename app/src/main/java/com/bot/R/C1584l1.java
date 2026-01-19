package r;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import m4.C1285t;
import n.AbstractC1318d;

/* renamed from: r.l1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1584l1 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f14376h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f14377i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ E1 f14378j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f14379k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1285t f14380l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1584l1(E1 e12, long j3, C1285t c1285t, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f14378j = e12;
        this.f14379k = j3;
        this.f14380l = c1285t;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C1584l1) p((InterfaceC0905c) obj2, (B1) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        C1584l1 c1584l1 = new C1584l1(this.f14378j, this.f14379k, this.f14380l, interfaceC0905c);
        c1584l1.f14377i = obj;
        return c1584l1;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f14376h;
        if (i6 == 0) {
            X3.a.e(obj);
            B1 b1 = (B1) this.f14377i;
            long j3 = this.f14379k;
            E1 e12 = this.f14378j;
            float g3 = e12.g(j3);
            D.L l3 = new D.L(this.f14380l, e12, b1, 19);
            this.f14376h = 1;
            Object e6 = AbstractC1318d.e(S.l.f7374V, g3, null, l3, this, 12);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (e6 == enumC0927a) {
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
