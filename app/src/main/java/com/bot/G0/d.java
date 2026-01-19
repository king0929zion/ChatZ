package g0;

import T.C0626q;
import U.K;
import androidx.lifecycle.N;
import b4.InterfaceC0908f;
import b4.InterfaceC0909g;
import b4.InterfaceC0910h;
import java.util.List;

/* loaded from: classes.dex */
public final class d implements K, InterfaceC0908f {

    /* renamed from: e, reason: collision with root package name */
    public static final N f11769e = new N(11);

    /* renamed from: c, reason: collision with root package name */
    public final C0626q f11770c;

    public d(C0626q c0626q) {
        this.f11770c = c0626q;
    }

    @Override // b4.InterfaceC0910h
    public final /* bridge */ InterfaceC0910h Y(InterfaceC0910h interfaceC0910h) {
        return Y4.d.P(this, interfaceC0910h);
    }

    @Override // U.K
    public final List e(Integer num) {
        return this.f11770c.I();
    }

    @Override // b4.InterfaceC0908f
    public final InterfaceC0909g getKey() {
        return f11769e;
    }

    @Override // b4.InterfaceC0910h
    public final /* bridge */ InterfaceC0910h h(InterfaceC0909g interfaceC0909g) {
        return Y4.d.L(this, interfaceC0909g);
    }

    @Override // b4.InterfaceC0910h
    public final Object q(Object obj, l4.e eVar) {
        return eVar.m(obj, this);
    }

    @Override // b4.InterfaceC0910h
    public final /* bridge */ InterfaceC0908f r(InterfaceC0909g interfaceC0909g) {
        return Y4.d.F(this, interfaceC0909g);
    }
}
