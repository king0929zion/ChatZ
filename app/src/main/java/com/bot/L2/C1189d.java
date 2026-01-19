package l2;

import X3.y;
import b4.InterfaceC0905c;
import d4.i;
import d5.AbstractC0942b;
import java.io.IOException;
import x4.InterfaceC1942y;

/* renamed from: l2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1189d extends i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C1190e f12688h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1189d(C1190e c1190e, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f12688h = c1190e;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C1189d) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C1189d(this.f12688h, interfaceC0905c);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [d5.G, java.lang.Object] */
    @Override // d4.a
    public final Object r(Object obj) {
        X3.a.e(obj);
        C1190e c1190e = this.f12688h;
        synchronized (c1190e) {
            if (!c1190e.f12701o || c1190e.f12702p) {
                return y.a;
            }
            try {
                c1190e.y();
            } catch (IOException unused) {
                c1190e.f12703q = true;
            }
            try {
                if (c1190e.f12698l >= 2000) {
                    c1190e.H();
                }
            } catch (IOException unused2) {
                c1190e.f12704r = true;
                c1190e.f12699m = AbstractC0942b.b(new Object());
            }
            return y.a;
        }
    }
}
