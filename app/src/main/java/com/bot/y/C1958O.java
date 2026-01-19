package y;

import l4.InterfaceC1193a;
import x.C1856g;

/* renamed from: y.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1958O implements InterfaceC1193a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f15799c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ T.X f15800e;

    public /* synthetic */ C1958O(T.X x5, int i6) {
        this.f15799c = i6;
        this.f15800e = x5;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        switch (this.f15799c) {
            case 0:
                return (InterfaceC1957N) ((InterfaceC1193a) this.f15800e.getValue()).b();
            default:
                return new C1856g((l4.c) this.f15800e.getValue());
        }
    }
}
