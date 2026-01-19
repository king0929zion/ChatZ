package U2;

import T.C0621n0;
import X3.y;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.AbstractC1888A;

/* loaded from: classes.dex */
public final class h extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f8635h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f8636i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f8637j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Long f8638k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Long f8639l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(boolean z5, Long l3, Long l5, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f8637j = z5;
        this.f8638k = l3;
        this.f8639l = l5;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((h) p((InterfaceC0905c) obj2, (C0621n0) obj)).r(y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        h hVar = new h(this.f8637j, this.f8638k, this.f8639l, interfaceC0905c);
        hVar.f8636i = obj;
        return hVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        Object m3;
        EnumC0927a enumC0927a;
        C0621n0 c0621n0 = (C0621n0) this.f8636i;
        int i6 = this.f8635h;
        Long l3 = this.f8638k;
        if (i6 == 0) {
            X3.a.e(obj);
            if (!this.f8637j || l3 == null) {
                c0621n0.setValue(this.f8639l);
                return y.a;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
        }
        do {
            long currentTimeMillis = System.currentTimeMillis() - l3.longValue();
            if (currentTimeMillis < 0) {
                currentTimeMillis = 0;
            }
            c0621n0.setValue(new Long(currentTimeMillis));
            this.f8636i = c0621n0;
            this.f8635h = 1;
            m3 = AbstractC1888A.m(100L, this);
            enumC0927a = EnumC0927a.f11114c;
        } while (m3 != enumC0927a);
        return enumC0927a;
    }
}
