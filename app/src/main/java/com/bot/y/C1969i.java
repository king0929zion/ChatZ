package y;

import u.AbstractC1734b;

/* renamed from: y.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1969i {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15876b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1980u f15877c;

    public C1969i(int i6, int i7, InterfaceC1980u interfaceC1980u) {
        this.a = i6;
        this.f15876b = i7;
        this.f15877c = interfaceC1980u;
        if (i6 < 0) {
            AbstractC1734b.a("startIndex should be >= 0");
        }
        if (i7 > 0) {
            return;
        }
        AbstractC1734b.a("size should be > 0");
    }
}
