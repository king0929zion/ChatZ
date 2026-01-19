package B4;

import A4.InterfaceC0008i;
import b4.C0911i;
import b4.InterfaceC0905c;
import b4.InterfaceC0910h;
import c4.EnumC0927a;
import m4.AbstractC1276k;
import x4.AbstractC1888A;

/* loaded from: classes.dex */
public final class A extends d4.c implements InterfaceC0008i {

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0008i f560g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC0910h f561h;

    /* renamed from: i, reason: collision with root package name */
    public final int f562i;

    /* renamed from: j, reason: collision with root package name */
    public InterfaceC0910h f563j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC0905c f564k;

    public A(InterfaceC0008i interfaceC0008i, InterfaceC0910h interfaceC0910h) {
        super(x.f639c, C0911i.f11057c);
        this.f560g = interfaceC0008i;
        this.f561h = interfaceC0910h;
        this.f562i = ((Number) interfaceC0910h.q(0, new z(0))).intValue();
    }

    @Override // A4.InterfaceC0008i
    public final Object a(Object obj, InterfaceC0905c interfaceC0905c) {
        try {
            Object t5 = t(interfaceC0905c, obj);
            return t5 == EnumC0927a.f11114c ? t5 : X3.y.a;
        } catch (Throwable th) {
            this.f563j = new t(interfaceC0905c.o(), th);
            throw th;
        }
    }

    @Override // d4.a, d4.d
    public final d4.d g() {
        InterfaceC0905c interfaceC0905c = this.f564k;
        if (interfaceC0905c instanceof d4.d) {
            return (d4.d) interfaceC0905c;
        }
        return null;
    }

    @Override // d4.c, b4.InterfaceC0905c
    public final InterfaceC0910h o() {
        InterfaceC0910h interfaceC0910h = this.f563j;
        return interfaceC0910h == null ? C0911i.f11057c : interfaceC0910h;
    }

    @Override // d4.a
    public final StackTraceElement q() {
        return null;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        Throwable a = X3.l.a(obj);
        if (a != null) {
            this.f563j = new t(o(), a);
        }
        InterfaceC0905c interfaceC0905c = this.f564k;
        if (interfaceC0905c != null) {
            interfaceC0905c.k(obj);
        }
        return EnumC0927a.f11114c;
    }

    public final Object t(InterfaceC0905c interfaceC0905c, Object obj) {
        InterfaceC0910h o5 = interfaceC0905c.o();
        AbstractC1888A.n(o5);
        InterfaceC0910h interfaceC0910h = this.f563j;
        if (interfaceC0910h != o5) {
            if (interfaceC0910h instanceof t) {
                throw new IllegalStateException(u4.o.q("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((t) interfaceC0910h).f633e + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) o5.q(0, new D(this, 0))).intValue() != this.f562i) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f561h + ",\n\t\tbut emission happened in " + o5 + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f563j = o5;
        }
        this.f564k = interfaceC0905c;
        l4.f fVar = C.a;
        InterfaceC0008i interfaceC0008i = this.f560g;
        AbstractC1276k.d(interfaceC0008i, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object d6 = fVar.d(interfaceC0008i, obj, this);
        if (!AbstractC1276k.b(d6, EnumC0927a.f11114c)) {
            this.f564k = null;
        }
        return d6;
    }
}
