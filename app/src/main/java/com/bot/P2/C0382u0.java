package P2;

import T.d1;
import b4.InterfaceC0905c;
import x4.InterfaceC1942y;

/* renamed from: P2.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0382u0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f5075h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ T.X f5076i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d1 f5077j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0382u0(float f6, T.X x5, d1 d1Var, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f5075h = f6;
        this.f5076i = x5;
        this.f5077j = d1Var;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        C0382u0 c0382u0 = (C0382u0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj);
        X3.y yVar = X3.y.a;
        c0382u0.r(yVar);
        return yVar;
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C0382u0(this.f5075h, this.f5076i, this.f5077j, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        C0344b c0344b;
        X3.a.e(obj);
        boolean c6 = e1.f.c(this.f5075h, 0);
        d1 d1Var = this.f5077j;
        T.X x5 = this.f5076i;
        if (c6) {
            C0344b c0344b2 = (C0344b) x5.getValue();
            boolean booleanValue = ((Boolean) d1Var.getValue()).booleanValue();
            boolean z5 = c0344b2.f4827b;
            c0344b2.getClass();
            c0344b = new C0344b(booleanValue, z5);
        } else {
            C0344b c0344b3 = (C0344b) x5.getValue();
            boolean booleanValue2 = ((Boolean) d1Var.getValue()).booleanValue();
            boolean z6 = c0344b3.a;
            c0344b3.getClass();
            c0344b = new C0344b(z6, booleanValue2);
        }
        x5.setValue(c0344b);
        return X3.y.a;
    }
}
