package v;

import com.vladsch.flexmark.util.format.TableCell;
import e1.AbstractC0960b;
import e1.C0959a;
import m.AbstractC1216X;

/* loaded from: classes.dex */
public final class U extends AbstractC1216X {

    /* renamed from: s, reason: collision with root package name */
    public V f15270s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f15271t;

    @Override // m.AbstractC1216X
    public final long M0(F0.U u5, long j3) {
        int a02 = this.f15270s == V.f15272c ? u5.a0(C0959a.h(j3)) : u5.d(C0959a.h(j3));
        if (a02 < 0) {
            a02 = 0;
        }
        if (a02 < 0) {
            e1.i.a("height must be >= 0");
        }
        return AbstractC0960b.h(0, TableCell.NOT_TRACKED, a02, a02);
    }

    @Override // m.AbstractC1216X
    public final boolean N0() {
        return this.f15271t;
    }

    @Override // m.AbstractC1216X, H0.InterfaceC0170z
    public final int P(H0.S s5, F0.U u5, int i6) {
        return this.f15270s == V.f15272c ? u5.a0(i6) : u5.d(i6);
    }

    @Override // m.AbstractC1216X, H0.InterfaceC0170z
    public final int m0(H0.S s5, F0.U u5, int i6) {
        return this.f15270s == V.f15272c ? u5.a0(i6) : u5.d(i6);
    }
}
