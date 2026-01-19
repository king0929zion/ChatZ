package w3;

import I3.C;
import X3.y;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x3.C1883g;
import x4.C1940w;
import x4.InterfaceC1922e0;
import x4.InterfaceC1942y;

/* renamed from: w3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1845b extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f15422h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1846c f15423i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ E3.e f15424j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1845b(InterfaceC1846c interfaceC1846c, E3.e eVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f15423i = interfaceC1846c;
        this.f15424j = eVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C1845b) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C1845b(this.f15423i, this.f15424j, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f15422h;
        if (i6 != 0) {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
            return obj;
        }
        X3.a.e(obj);
        InterfaceC1846c interfaceC1846c = this.f15423i;
        InterfaceC1922e0 interfaceC1922e0 = (InterfaceC1922e0) interfaceC1846c.c().r(C1940w.f15731e);
        if (!(interfaceC1922e0 != null ? interfaceC1922e0.d() : false)) {
            throw new C("Client already closed", 2);
        }
        this.f15422h = 1;
        Object d6 = ((C1883g) interfaceC1846c).d(this.f15424j, this);
        EnumC0927a enumC0927a = EnumC0927a.f11114c;
        return d6 == enumC0927a ? enumC0927a : d6;
    }
}
