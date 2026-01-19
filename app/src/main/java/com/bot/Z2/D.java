package Z2;

import m0.EnumC1245A;
import m4.AbstractC1276k;
import x4.AbstractC1888A;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final /* synthetic */ class D implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f9911c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1942y f9912e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ A.d f9913f;

    public /* synthetic */ D(InterfaceC1942y interfaceC1942y, A.d dVar, int i6) {
        this.f9911c = i6;
        this.f9912e = interfaceC1942y;
        this.f9913f = dVar;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        EnumC1245A enumC1245A = (EnumC1245A) obj;
        switch (this.f9911c) {
            case 0:
                AbstractC1276k.f(enumC1245A, "focusState");
                if (enumC1245A.b()) {
                    AbstractC1888A.y(this.f9912e, null, new L(this.f9913f, null), 3);
                }
                return X3.y.a;
            case 1:
                AbstractC1276k.f(enumC1245A, "focusState");
                if (enumC1245A.b()) {
                    AbstractC1888A.y(this.f9912e, null, new M(this.f9913f, null), 3);
                }
                return X3.y.a;
            default:
                AbstractC1276k.f(enumC1245A, "focusState");
                if (enumC1245A.b()) {
                    AbstractC1888A.y(this.f9912e, null, new J0(this.f9913f, null), 3);
                }
                return X3.y.a;
        }
    }
}
