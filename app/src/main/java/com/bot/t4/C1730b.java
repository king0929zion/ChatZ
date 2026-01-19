package t4;

import Y3.z;
import java.util.Iterator;
import m4.AbstractC1276k;

/* renamed from: t4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1730b implements h, InterfaceC1731c {
    public final h a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14939b;

    public C1730b(h hVar, int i6) {
        AbstractC1276k.f(hVar, "sequence");
        this.a = hVar;
        this.f14939b = i6;
        if (i6 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i6 + '.').toString());
    }

    @Override // t4.InterfaceC1731c
    public final h a(int i6) {
        int i7 = this.f14939b + i6;
        return i7 < 0 ? new C1730b(this, i6) : new C1730b(this.a, i7);
    }

    @Override // t4.h
    public final Iterator iterator() {
        return new z(this);
    }

    @Override // t4.InterfaceC1731c
    public final h take() {
        int i6 = this.f14939b;
        int i7 = i6 + 6;
        return i7 < 0 ? new n(this) : new m(this.a, i6, i7);
    }
}
