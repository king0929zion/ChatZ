package B0;

import m4.AbstractC1276k;
import m4.AbstractC1277l;
import z3.C2045o;

/* renamed from: B0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0031g extends AbstractC1277l implements l4.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f448e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0031g(Object obj, int i6) {
        super(1);
        this.f448e = i6;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f448e) {
            case 0:
                ((AbstractC0032h) obj).getClass();
                return Boolean.TRUE;
            default:
                C2045o c2045o = (C2045o) obj;
                AbstractC1276k.f(c2045o, "$this$HttpResponseValidator");
                c2045o.f16289c = false;
                c2045o.a.add(new d4.i(2, null));
                return X3.y.a;
        }
    }
}
