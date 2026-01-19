package R2;

import T.C0626q;
import b3.AbstractC0888d;
import h0.InterfaceC1041r;

/* renamed from: R2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0531k implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6952c = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f6953e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f6954f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f6955g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1041r f6956h;

    public /* synthetic */ C0531k(InterfaceC1041r interfaceC1041r, String str, String str2, float f6, int i6) {
        this.f6956h = interfaceC1041r;
        this.f6953e = str;
        this.f6954f = str2;
        this.f6955g = f6;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        switch (this.f6952c) {
            case 0:
                ((Integer) obj2).getClass();
                int J4 = T.r.J(1);
                AbstractC0530j.i(this.f6955g, J4, (C0626q) obj, this.f6956h, this.f6953e, this.f6954f);
                break;
            default:
                ((Integer) obj2).getClass();
                int J5 = T.r.J(385);
                AbstractC0888d.b(this.f6955g, J5, (C0626q) obj, this.f6956h, this.f6953e, this.f6954f);
                break;
        }
        return X3.y.a;
    }

    public /* synthetic */ C0531k(String str, String str2, float f6, InterfaceC1041r interfaceC1041r, int i6) {
        this.f6953e = str;
        this.f6954f = str2;
        this.f6955g = f6;
        this.f6956h = interfaceC1041r;
    }
}
