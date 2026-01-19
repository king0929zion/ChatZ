package K4;

import M4.C0276x;
import Y3.z;
import java.util.Iterator;
import l4.InterfaceC1193a;
import n4.InterfaceC1372a;
import u4.C1764b;
import u4.C1765c;

/* loaded from: classes.dex */
public final class i implements Iterable, InterfaceC1372a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2972c;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2973e;

    public /* synthetic */ i(Object obj, int i6) {
        this.f2972c = i6;
        this.f2973e = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f2972c) {
            case 0:
                return new h((C0276x) this.f2973e);
            case 1:
                return new z((Iterator) ((InterfaceC1193a) this.f2973e).b());
            default:
                return new C1764b((C1765c) this.f2973e);
        }
    }
}
