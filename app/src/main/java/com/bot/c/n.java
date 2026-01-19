package c;

import B0.C0033i;
import b.C0858b;
import b.u;
import x4.InterfaceC1942y;
import z4.C2057h;

/* loaded from: classes.dex */
public final class n extends u {

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC1942y f11089d;

    /* renamed from: e, reason: collision with root package name */
    public l4.e f11090e;

    /* renamed from: f, reason: collision with root package name */
    public C0033i f11091f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11092g;

    @Override // b.u
    public final void a() {
        C0033i c0033i = this.f11091f;
        if (c0033i != null) {
            c0033i.h();
        }
        C0033i c0033i2 = this.f11091f;
        if (c0033i2 != null) {
            c0033i2.f452c = false;
        }
        this.f11092g = false;
    }

    @Override // b.u
    public final void b() {
        C0033i c0033i = this.f11091f;
        if (c0033i != null && !c0033i.f452c) {
            c0033i.h();
            this.f11091f = null;
        }
        if (this.f11091f == null) {
            this.f11091f = new C0033i(this.f11089d, false, this.f11090e, this);
        }
        C0033i c0033i2 = this.f11091f;
        if (c0033i2 != null) {
            ((C2057h) c0033i2.f453e).n(null);
        }
        C0033i c0033i3 = this.f11091f;
        if (c0033i3 != null) {
            c0033i3.f452c = false;
        }
        this.f11092g = false;
    }

    @Override // b.u
    public final void c(C0858b c0858b) {
        super.c(c0858b);
        C0033i c0033i = this.f11091f;
        if (c0033i != null) {
            ((C2057h) c0033i.f453e).t(c0858b);
        }
    }

    @Override // b.u
    public final void d(C0858b c0858b) {
        super.d(c0858b);
        C0033i c0033i = this.f11091f;
        if (c0033i != null) {
            c0033i.h();
        }
        if (this.a) {
            this.f11091f = new C0033i(this.f11089d, true, this.f11090e, this);
        }
        this.f11092g = true;
    }
}
