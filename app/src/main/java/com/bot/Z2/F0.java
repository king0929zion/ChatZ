package Z2;

import a3.C0810H;
import b4.InterfaceC0905c;
import com.bot.core.model.LLMProvider;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class F0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f9959h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0810H f9960i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ T.X f9961j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ T.X f9962k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ T.X f9963l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ T.X f9964m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F0(boolean z5, C0810H c0810h, T.X x5, T.X x6, T.X x7, T.X x8, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f9959h = z5;
        this.f9960i = c0810h;
        this.f9961j = x5;
        this.f9962k = x6;
        this.f9963l = x7;
        this.f9964m = x8;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        F0 f02 = (F0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj);
        X3.y yVar = X3.y.a;
        f02.r(yVar);
        return yVar;
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new F0(this.f9959h, this.f9960i, this.f9961j, this.f9962k, this.f9963l, this.f9964m, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        C0810H c0810h;
        X3.a.e(obj);
        if (!this.f9959h && (c0810h = this.f9960i) != null) {
            LLMProvider lLMProvider = c0810h.a;
            T.X x5 = this.f9961j;
            if (!((Boolean) x5.getValue()).booleanValue()) {
                this.f9962k.setValue(lLMProvider.f11167c);
                this.f9963l.setValue(Boolean.valueOf(lLMProvider.f11175k));
                this.f9964m.setValue(Y3.m.N0(lLMProvider.f11177m));
                x5.setValue(Boolean.TRUE);
            }
        }
        return X3.y.a;
    }
}
