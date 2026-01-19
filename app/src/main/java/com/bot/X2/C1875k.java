package x2;

import X3.y;
import b4.InterfaceC0905c;
import com.bot.MainActivity;
import x4.InterfaceC1942y;

/* renamed from: x2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1875k extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ MainActivity f15599h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1875k(MainActivity mainActivity, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f15599h = mainActivity;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        C1875k c1875k = (C1875k) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj);
        y yVar = y.a;
        c1875k.r(yVar);
        return yVar;
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C1875k(this.f15599h, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        X3.a.e(obj);
        int i6 = MainActivity.f11132D;
        this.f15599h.o();
        return y.a;
    }
}
