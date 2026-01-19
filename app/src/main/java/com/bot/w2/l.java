package W2;

import R2.A;
import X2.L;
import X3.y;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8929c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ L f8930e;

    public /* synthetic */ l(L l3, int i6) {
        this.f8929c = i6;
        this.f8930e = l3;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f8929c) {
            case 0:
                A a = (A) obj;
                AbstractC1276k.f(a, "it");
                this.f8930e.m(a);
                break;
            default:
                String str = (String) obj;
                AbstractC1276k.f(str, "it");
                this.f8930e.r(str);
                break;
        }
        return y.a;
    }
}
