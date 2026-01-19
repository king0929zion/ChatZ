package I4;

import java.util.List;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements InterfaceC1193a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2774c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f2775e;

    public /* synthetic */ f(List list, int i6) {
        this.f2774c = i6;
        this.f2775e = list;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        switch (this.f2774c) {
            case 0:
                return ((s4.f) this.f2775e.get(0)).c();
            case 1:
                return ((s4.f) this.f2775e.get(0)).c();
            case 2:
                return Integer.valueOf(this.f2775e.size());
            default:
                Object obj = this.f2775e.get(2);
                AbstractC1276k.d(obj, "null cannot be cast to non-null type kotlin.Int");
                return (Integer) obj;
        }
    }
}
