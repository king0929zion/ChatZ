package r;

import b4.InterfaceC0905c;
import c4.EnumC0927a;

/* renamed from: r.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1594p extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f14429h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f14430i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d4.i f14431j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C1606t f14432k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1594p(InterfaceC0905c interfaceC0905c, l4.f fVar, C1606t c1606t) {
        super(2, interfaceC0905c);
        this.f14431j = (d4.i) fVar;
        this.f14432k = c1606t;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C1594p) p((InterfaceC0905c) obj2, (C1517E) obj)).r(X3.y.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l4.f, d4.i] */
    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        C1594p c1594p = new C1594p(interfaceC0905c, this.f14431j, this.f14432k);
        c1594p.f14430i = obj;
        return c1594p;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l4.f, d4.i] */
    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f14429h;
        if (i6 == 0) {
            X3.a.e(obj);
            C1517E c1517e = (C1517E) this.f14430i;
            C1603s c1603s = this.f14432k.f14476j;
            this.f14429h = 1;
            Object d6 = this.f14431j.d(c1603s, c1517e, this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (d6 == enumC0927a) {
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
