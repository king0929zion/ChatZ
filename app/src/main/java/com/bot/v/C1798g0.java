package v;

import H0.AbstractC0141b0;
import h0.AbstractC1040q;
import j1.AbstractC1135a;
import w.AbstractC1829a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: v.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1798g0 extends AbstractC0141b0 {
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final float f15301b;

    /* renamed from: c, reason: collision with root package name */
    public final float f15302c;

    /* renamed from: d, reason: collision with root package name */
    public final float f15303d;

    public C1798g0(float f6, float f7, float f8, float f9) {
        this.a = f6;
        this.f15301b = f7;
        this.f15302c = f8;
        this.f15303d = f9;
        boolean z5 = true;
        boolean z6 = (f6 >= S.l.f7374V || Float.isNaN(f6)) & (f7 >= S.l.f7374V || Float.isNaN(f7)) & (f8 >= S.l.f7374V || Float.isNaN(f8));
        if (f9 < S.l.f7374V && !Float.isNaN(f9)) {
            z5 = false;
        }
        if (!z6 || !z5) {
            AbstractC1829a.a("Padding must be non-negative");
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [v.h0, h0.q] */
    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        AbstractC1040q abstractC1040q = new AbstractC1040q();
        abstractC1040q.f15308r = this.a;
        abstractC1040q.f15309s = this.f15301b;
        abstractC1040q.f15310t = this.f15302c;
        abstractC1040q.f15311u = this.f15303d;
        abstractC1040q.f15312v = true;
        return abstractC1040q;
    }

    public final boolean equals(Object obj) {
        C1798g0 c1798g0 = obj instanceof C1798g0 ? (C1798g0) obj : null;
        return c1798g0 != null && e1.f.c(this.a, c1798g0.a) && e1.f.c(this.f15301b, c1798g0.f15301b) && e1.f.c(this.f15302c, c1798g0.f15302c) && e1.f.c(this.f15303d, c1798g0.f15303d);
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        C1800h0 c1800h0 = (C1800h0) abstractC1040q;
        c1800h0.f15308r = this.a;
        c1800h0.f15309s = this.f15301b;
        c1800h0.f15310t = this.f15302c;
        c1800h0.f15311u = this.f15303d;
        c1800h0.f15312v = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + AbstractC1135a.a(this.f15303d, AbstractC1135a.a(this.f15302c, AbstractC1135a.a(this.f15301b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }
}
