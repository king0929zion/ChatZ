package v;

import com.vladsch.flexmark.util.format.TableCell;
import e1.AbstractC0960b;
import e1.C0959a;
import m.AbstractC1216X;

/* loaded from: classes.dex */
public final class X extends AbstractC1216X {

    /* renamed from: s, reason: collision with root package name */
    public V f15275s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f15276t;

    @Override // m.AbstractC1216X
    public final long M0(F0.U u5, long j3) {
        int o5 = this.f15275s == V.f15272c ? u5.o(C0959a.g(j3)) : u5.q(C0959a.g(j3));
        if (o5 < 0) {
            o5 = 0;
        }
        if (o5 < 0) {
            e1.i.a("width must be >= 0");
        }
        return AbstractC0960b.h(o5, o5, 0, TableCell.NOT_TRACKED);
    }

    @Override // m.AbstractC1216X
    public final boolean N0() {
        return this.f15276t;
    }

    @Override // m.AbstractC1216X, H0.InterfaceC0170z
    public final int j(H0.S s5, F0.U u5, int i6) {
        return this.f15275s == V.f15272c ? u5.o(i6) : u5.q(i6);
    }

    @Override // m.AbstractC1216X, H0.InterfaceC0170z
    public final int z0(H0.S s5, F0.U u5, int i6) {
        return this.f15275s == V.f15272c ? u5.o(i6) : u5.q(i6);
    }
}
