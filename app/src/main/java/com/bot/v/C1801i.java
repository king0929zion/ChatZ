package v;

import H0.AbstractC0141b0;
import h0.AbstractC1040q;
import h0.C1033j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: v.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1801i extends AbstractC0141b0 {
    public final C1033j a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15313b;

    public C1801i(C1033j c1033j, boolean z5) {
        this.a = c1033j;
        this.f15313b = z5;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [v.j, h0.q] */
    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        ?? abstractC1040q = new AbstractC1040q();
        abstractC1040q.f15314r = this.a;
        abstractC1040q.f15315s = this.f15313b;
        return abstractC1040q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C1801i c1801i = obj instanceof C1801i ? (C1801i) obj : null;
        return c1801i != null && this.a.equals(c1801i.a) && this.f15313b == c1801i.f15313b;
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        C1803j c1803j = (C1803j) abstractC1040q;
        c1803j.f15314r = this.a;
        c1803j.f15315s = this.f15313b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f15313b) + (this.a.hashCode() * 31);
    }
}
