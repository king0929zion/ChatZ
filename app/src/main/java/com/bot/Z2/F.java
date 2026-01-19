package Z2;

import a3.C0818g;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final /* synthetic */ class F implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f9957c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0818g f9958e;

    public /* synthetic */ F(C0818g c0818g, int i6) {
        this.f9957c = i6;
        this.f9958e = c0818g;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        T.H h3 = (T.H) obj;
        switch (this.f9957c) {
            case 0:
                AbstractC1276k.f(h3, "$this$DisposableEffect");
                return new N(this.f9958e, 0);
            default:
                AbstractC1276k.f(h3, "$this$DisposableEffect");
                return new N(this.f9958e, 1);
        }
    }
}
