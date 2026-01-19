package O;

import B0.AbstractC0047x;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import m4.C1287v;
import r.AbstractC1571h0;

/* loaded from: classes.dex */
public final class Z extends d4.h implements l4.e {

    /* renamed from: f, reason: collision with root package name */
    public int f4063f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f4064g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f4065h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1287v f4066i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(long j3, C1287v c1287v, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f4065h = j3;
        this.f4066i = c1287v;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((Z) p((InterfaceC0905c) obj2, (B0.V) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        Z z5 = new Z(this.f4065h, this.f4066i, interfaceC0905c);
        z5.f4064g = obj;
        return z5;
    }

    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.List, java.lang.Object] */
    @Override // d4.a
    public final Object r(Object obj) {
        B0.V v5;
        int i6 = this.f4063f;
        C1287v c1287v = this.f4066i;
        if (i6 == 0) {
            X3.a.e(obj);
            v5 = (B0.V) this.f4064g;
            B4.D d6 = new B4.D(c1287v, 9);
            this.f4064g = v5;
            this.f4063f = 1;
            obj = AbstractC1571h0.e(v5, this.f4065h, d6, this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (obj == enumC0927a) {
                return enumC0927a;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v5 = (B0.V) this.f4064g;
            X3.a.e(obj);
        }
        if (((B0.y) obj) != null && (c1287v.f12972c & 9223372034707292159L) != 9205357640488583168L) {
            return EnumC0322n.f4157e;
        }
        B0.y yVar = (B0.y) Y3.m.o0(v5.f419i.f427v.a);
        if (!AbstractC0047x.d(yVar)) {
            return EnumC0322n.f4159g;
        }
        yVar.a();
        return EnumC0322n.f4156c;
    }
}
