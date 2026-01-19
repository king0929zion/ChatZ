package O;

import D.AbstractC0090r0;

/* loaded from: classes.dex */
public final class I implements InterfaceC0314j {

    /* renamed from: b, reason: collision with root package name */
    public static final I f3951b = new I(0);

    /* renamed from: c, reason: collision with root package name */
    public static final I f3952c = new I(1);

    /* renamed from: d, reason: collision with root package name */
    public static final H f3953d = new H(0);

    /* renamed from: e, reason: collision with root package name */
    public static final H f3954e = new H(1);

    /* renamed from: f, reason: collision with root package name */
    public static final H f3955f = new H(2);

    /* renamed from: g, reason: collision with root package name */
    public static final H f3956g = new H(3);
    public final /* synthetic */ int a;

    public /* synthetic */ I(int i6) {
        this.a = i6;
    }

    @Override // O.InterfaceC0314j
    public long a(D d6, int i6) {
        switch (this.a) {
            case 0:
                String str = d6.f3927f.a.a.f7630e;
                return S0.F.b(AbstractC0090r0.u(i6, str), AbstractC0090r0.t(i6, str));
            default:
                return d6.f3927f.l(i6);
        }
    }
}
