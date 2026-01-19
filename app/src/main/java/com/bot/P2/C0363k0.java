package P2;

import b4.InterfaceC0905c;
import java.util.List;
import x4.InterfaceC1942y;

/* renamed from: P2.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0363k0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ List f4971h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ A4.N f4972i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ T.X f4973j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ T.X f4974k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0363k0(List list, A4.N n3, T.X x5, T.X x6, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f4971h = list;
        this.f4972i = n3;
        this.f4973j = x5;
        this.f4974k = x6;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        C0363k0 c0363k0 = (C0363k0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj);
        X3.y yVar = X3.y.a;
        c0363k0.r(yVar);
        return yVar;
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C0363k0(this.f4971h, this.f4972i, this.f4973j, this.f4974k, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int ordinal;
        X3.a.e(obj);
        if (!this.f4971h.isEmpty() && (ordinal = ((EnumC0356h) this.f4973j.getValue()).ordinal()) != 0) {
            if (ordinal == 1) {
                this.f4972i.h(C0352f.f4927d);
            } else {
                if (ordinal != 2) {
                    throw new RuntimeException();
                }
                this.f4974k.setValue(Boolean.TRUE);
            }
        }
        return X3.y.a;
    }
}
