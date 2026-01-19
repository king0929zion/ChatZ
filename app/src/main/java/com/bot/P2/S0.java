package P2;

import b3.C0889e;
import b3.C0898n;
import java.util.List;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class S0 implements InterfaceC1193a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0889e f4785c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f4786e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4787f;

    public S0(C0889e c0889e, List list, int i6) {
        this.f4785c = c0889e;
        this.f4786e = list;
        this.f4787f = i6;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        C0889e c0889e = this.f4785c;
        if (c0889e != null) {
            List list = this.f4786e;
            AbstractC1276k.f(list, "images");
            c0889e.a.setValue(new C0898n(true, list, this.f4787f));
        }
        return X3.y.a;
    }
}
