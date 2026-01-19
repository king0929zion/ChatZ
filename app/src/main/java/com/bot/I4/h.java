package I4;

import java.util.ArrayList;
import l4.InterfaceC1193a;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements InterfaceC1193a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2779c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2780e;

    public /* synthetic */ h(int i6, ArrayList arrayList) {
        this.f2779c = i6;
        this.f2780e = arrayList;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        switch (this.f2779c) {
            case 0:
                return ((s4.f) this.f2780e.get(0)).c();
            default:
                return this.f2780e.iterator();
        }
    }
}
