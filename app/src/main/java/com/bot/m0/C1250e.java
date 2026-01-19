package m0;

import h0.AbstractC1040q;
import m4.AbstractC1276k;

/* renamed from: m0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1250e extends AbstractC1040q implements h {

    /* renamed from: r, reason: collision with root package name */
    public l4.c f12888r;

    /* renamed from: s, reason: collision with root package name */
    public EnumC1245A f12889s;

    @Override // m0.h
    public final void H(EnumC1245A enumC1245A) {
        if (AbstractC1276k.b(this.f12889s, enumC1245A)) {
            return;
        }
        this.f12889s = enumC1245A;
        this.f12888r.f(enumC1245A);
    }
}
