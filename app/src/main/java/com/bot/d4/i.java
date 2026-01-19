package d4;

import b4.InterfaceC0905c;
import m4.AbstractC1276k;
import m4.AbstractC1289x;
import m4.C1290y;
import m4.InterfaceC1273h;

/* loaded from: classes.dex */
public abstract class i extends c implements InterfaceC1273h {

    /* renamed from: g, reason: collision with root package name */
    public final int f11439g;

    public i(int i6, InterfaceC0905c interfaceC0905c) {
        super(interfaceC0905c);
        this.f11439g = i6;
    }

    @Override // m4.InterfaceC1273h
    public final int c() {
        return this.f11439g;
    }

    @Override // d4.a
    public final String toString() {
        if (this.f11433c != null) {
            return super.toString();
        }
        AbstractC1289x.a.getClass();
        String a = C1290y.a(this);
        AbstractC1276k.e(a, "renderLambdaToString(...)");
        return a;
    }
}
