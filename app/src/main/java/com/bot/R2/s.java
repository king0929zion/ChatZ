package R2;

import androidx.lifecycle.N;
import b4.InterfaceC0905c;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class s extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f7029h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(String str, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f7029h = str;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        s sVar = (s) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj);
        X3.y yVar = X3.y.a;
        sVar.r(yVar);
        return yVar;
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new s(this.f7029h, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        X3.a.e(obj);
        i5.a.a.getClass();
        N.o(new Object[0]);
        return X3.y.a;
    }
}
