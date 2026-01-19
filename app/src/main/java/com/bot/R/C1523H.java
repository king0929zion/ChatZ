package r;

import T.C0607g0;
import b4.InterfaceC0905c;
import c4.EnumC0927a;

/* renamed from: r.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1523H extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f14052h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f14053i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C1529K f14054j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ l4.e f14055k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1523H(C1529K c1529k, l4.e eVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f14054j = c1529k;
        this.f14055k = eVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C1523H) p((InterfaceC0905c) obj2, (InterfaceC1563e1) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        C1523H c1523h = new C1523H(this.f14054j, this.f14055k, interfaceC0905c);
        c1523h.f14053i = obj;
        return c1523h;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        C0607g0 c0607g0 = this.f14054j.f14073d;
        int i6 = this.f14052h;
        try {
            if (i6 == 0) {
                X3.a.e(obj);
                InterfaceC1563e1 interfaceC1563e1 = (InterfaceC1563e1) this.f14053i;
                c0607g0.setValue(Boolean.TRUE);
                l4.e eVar = this.f14055k;
                this.f14052h = 1;
                Object m3 = eVar.m(interfaceC1563e1, this);
                EnumC0927a enumC0927a = EnumC0927a.f11114c;
                if (m3 == enumC0927a) {
                    return enumC0927a;
                }
            } else {
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                X3.a.e(obj);
            }
            c0607g0.setValue(Boolean.FALSE);
            return X3.y.a;
        } catch (Throwable th) {
            c0607g0.setValue(Boolean.FALSE);
            throw th;
        }
    }
}
