package O;

import D.EnumC0073i0;
import m0.EnumC1245A;
import m4.AbstractC1276k;

/* renamed from: O.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0298b implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4075c = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f4076e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f4077f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f4078g;

    public /* synthetic */ C0298b(InterfaceC0331s interfaceC0331s, boolean z5, boolean z6) {
        this.f4078g = interfaceC0331s;
        this.f4076e = z5;
        this.f4077f = z6;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f4075c) {
            case 0:
                P0.x xVar = (P0.x) obj;
                long a = ((InterfaceC0331s) this.f4078g).a();
                xVar.a(AbstractC0305e0.f4106c, new C0303d0(this.f4076e ? EnumC0073i0.f1035e : EnumC0073i0.f1036f, a, this.f4077f ? EnumC0301c0.f4086c : EnumC0301c0.f4088f, (9223372034707292159L & a) != 9205357640488583168L));
                return X3.y.a;
            default:
                l4.c cVar = (l4.c) this.f4078g;
                EnumC1245A enumC1245A = (EnumC1245A) obj;
                AbstractC1276k.f(enumC1245A, "focusState");
                if (this.f4076e) {
                    boolean b5 = enumC1245A.b();
                    boolean z5 = this.f4077f;
                    if (b5 && !z5) {
                        cVar.f(Boolean.TRUE);
                    } else if (!enumC1245A.b() && z5) {
                        cVar.f(Boolean.FALSE);
                    }
                }
                return X3.y.a;
        }
    }

    public /* synthetic */ C0298b(boolean z5, boolean z6, l4.c cVar) {
        this.f4076e = z5;
        this.f4077f = z6;
        this.f4078g = cVar;
    }
}
