package B4;

import A4.InterfaceC0007h;
import P2.C0367m0;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import java.util.concurrent.atomic.AtomicInteger;
import x4.InterfaceC1942y;
import z4.C2057h;

/* loaded from: classes.dex */
public final class r extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f618h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0007h[] f619i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f620j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ AtomicInteger f621k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C2057h f622l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(InterfaceC0007h[] interfaceC0007hArr, int i6, AtomicInteger atomicInteger, C2057h c2057h, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f619i = interfaceC0007hArr;
        this.f620j = i6;
        this.f621k = atomicInteger;
        this.f622l = c2057h;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((r) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new r(this.f619i, this.f620j, this.f621k, this.f622l, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f618h;
        AtomicInteger atomicInteger = this.f621k;
        C2057h c2057h = this.f622l;
        try {
            if (i6 == 0) {
                X3.a.e(obj);
                InterfaceC0007h[] interfaceC0007hArr = this.f619i;
                int i7 = this.f620j;
                InterfaceC0007h interfaceC0007h = interfaceC0007hArr[i7];
                C0367m0 c0367m0 = new C0367m0(i7, 2, c2057h);
                this.f618h = 1;
                Object b5 = interfaceC0007h.b(c0367m0, this);
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
            if (atomicInteger.decrementAndGet() == 0) {
                c2057h.n(null);
            }
            return X3.y.a;
        } finally {
            if (atomicInteger.decrementAndGet() == 0) {
                c2057h.n(null);
            }
        }
    }
}
