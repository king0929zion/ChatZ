package A4;

import B4.AbstractC0054g;
import b4.C0911i;
import b4.InterfaceC0905c;
import b4.InterfaceC0910h;
import c4.EnumC0927a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import x4.InterfaceC1942y;
import z4.EnumC2050a;

/* renamed from: A4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0003d extends AbstractC0054g {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f244i = AtomicIntegerFieldUpdater.newUpdater(C0003d.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;

    /* renamed from: g, reason: collision with root package name */
    public final z4.w f245g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f246h;

    public /* synthetic */ C0003d(z4.w wVar, boolean z5) {
        this(wVar, z5, C0911i.f11057c, -3, EnumC2050a.f16327c);
    }

    @Override // B4.AbstractC0054g, A4.InterfaceC0007h
    public final Object b(InterfaceC0008i interfaceC0008i, InterfaceC0905c interfaceC0905c) {
        int i6 = this.f590e;
        EnumC0927a enumC0927a = EnumC0927a.f11114c;
        if (i6 == -3) {
            boolean z5 = this.f246h;
            if (z5 && f244i.getAndSet(this, 1) != 0) {
                throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
            }
            Object h3 = W.h(interfaceC0008i, this.f245g, z5, interfaceC0905c);
            if (h3 == enumC0927a) {
                return h3;
            }
        } else {
            Object b5 = super.b(interfaceC0008i, interfaceC0905c);
            if (b5 == enumC0927a) {
                return b5;
            }
        }
        return X3.y.a;
    }

    @Override // B4.AbstractC0054g
    public final String d() {
        return "channel=" + this.f245g;
    }

    @Override // B4.AbstractC0054g
    public final Object e(z4.u uVar, InterfaceC0905c interfaceC0905c) {
        Object h3 = W.h(new B4.E(uVar), this.f245g, this.f246h, interfaceC0905c);
        return h3 == EnumC0927a.f11114c ? h3 : X3.y.a;
    }

    @Override // B4.AbstractC0054g
    public final AbstractC0054g f(InterfaceC0910h interfaceC0910h, int i6, EnumC2050a enumC2050a) {
        return new C0003d(this.f245g, this.f246h, interfaceC0910h, i6, enumC2050a);
    }

    @Override // B4.AbstractC0054g
    public final InterfaceC0007h g() {
        return new C0003d(this.f245g, this.f246h);
    }

    @Override // B4.AbstractC0054g
    public final z4.w i(InterfaceC1942y interfaceC1942y) {
        if (!this.f246h || f244i.getAndSet(this, 1) == 0) {
            return this.f590e == -3 ? this.f245g : super.i(interfaceC1942y);
        }
        throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
    }

    public C0003d(z4.w wVar, boolean z5, InterfaceC0910h interfaceC0910h, int i6, EnumC2050a enumC2050a) {
        super(interfaceC0910h, i6, enumC2050a);
        this.f245g = wVar;
        this.f246h = z5;
        this.consumed$volatile = 0;
    }
}
