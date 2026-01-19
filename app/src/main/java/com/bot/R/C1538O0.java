package r;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.AbstractC1888A;
import x4.InterfaceC1922e0;
import x4.InterfaceC1942y;
import z4.InterfaceC2061l;

/* renamed from: r.O0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1538O0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f14103h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f14104i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2061l f14105j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1538O0(InterfaceC2061l interfaceC2061l, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f14105j = interfaceC2061l;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C1538O0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        C1538O0 c1538o0 = new C1538O0(this.f14105j, interfaceC0905c);
        c1538o0.f14104i = obj;
        return c1538o0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v1, types: [x4.e0] */
    /* JADX WARN: Type inference failed for: r0v2, types: [d4.i, l4.e] */
    /* JADX WARN: Type inference failed for: r0v4, types: [x4.e0] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // d4.a
    public final Object r(Object obj) {
        ?? r02 = this.f14103h;
        try {
            if (r02 == 0) {
                X3.a.e(obj);
                x4.s0 y5 = AbstractC1888A.y((InterfaceC1942y) this.f14104i, null, new d4.i(2, null), 3);
                InterfaceC2061l interfaceC2061l = this.f14105j;
                this.f14104i = y5;
                this.f14103h = 1;
                obj = interfaceC2061l.p(this);
                EnumC0927a enumC0927a = EnumC0927a.f11114c;
                r02 = y5;
                if (obj == enumC0927a) {
                    return enumC0927a;
                }
            } else {
                if (r02 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                InterfaceC1922e0 interfaceC1922e0 = (InterfaceC1922e0) this.f14104i;
                X3.a.e(obj);
                r02 = interfaceC1922e0;
            }
            return (C1534M0) obj;
        } finally {
            r02.f(null);
        }
    }
}
