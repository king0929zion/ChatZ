package P2;

import b4.InterfaceC0905c;
import x4.InterfaceC1942y;

/* renamed from: P2.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0386w0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f5093h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f5094i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ T.X f5095j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ T.X f5096k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0386w0(boolean z5, boolean z6, T.X x5, T.X x6, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f5093h = z5;
        this.f5094i = z6;
        this.f5095j = x5;
        this.f5096k = x6;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        C0386w0 c0386w0 = (C0386w0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj);
        X3.y yVar = X3.y.a;
        c0386w0.r(yVar);
        return yVar;
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C0386w0(this.f5093h, this.f5094i, this.f5095j, this.f5096k, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        X3.a.e(obj);
        T.X x5 = this.f5095j;
        if (((Boolean) x5.getValue()).booleanValue() && !this.f5093h && this.f5094i) {
            x5.setValue(Boolean.FALSE);
            this.f5096k.setValue(Boolean.TRUE);
        }
        return X3.y.a;
    }
}
