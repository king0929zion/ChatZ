package D1;

import A4.InterfaceC0008i;
import T.C0621n0;
import X3.y;
import b4.InterfaceC0905c;

/* loaded from: classes.dex */
public final class a implements InterfaceC0008i {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1251c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0621n0 f1252e;

    public /* synthetic */ a(C0621n0 c0621n0, int i6) {
        this.f1251c = i6;
        this.f1252e = c0621n0;
    }

    @Override // A4.InterfaceC0008i
    public final Object a(Object obj, InterfaceC0905c interfaceC0905c) {
        switch (this.f1251c) {
            case 0:
                this.f1252e.setValue(obj);
                return y.a;
            case 1:
                this.f1252e.setValue(obj);
                return y.a;
            case 2:
                this.f1252e.setValue(obj);
                return y.a;
            default:
                this.f1252e.setValue(obj);
                return y.a;
        }
    }
}
