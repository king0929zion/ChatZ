package t4;

import java.util.Iterator;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class m implements h, InterfaceC1731c {
    public final h a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14953b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14954c;

    public m(h hVar, int i6, int i7) {
        AbstractC1276k.f(hVar, "sequence");
        this.a = hVar;
        this.f14953b = i6;
        this.f14954c = i7;
        if (i6 < 0) {
            throw new IllegalArgumentException(B3.e.h(i6, "startIndex should be non-negative, but is ").toString());
        }
        if (i7 < 0) {
            throw new IllegalArgumentException(B3.e.h(i7, "endIndex should be non-negative, but is ").toString());
        }
        if (i7 < i6) {
            throw new IllegalArgumentException(B3.e.k("endIndex should be not less than startIndex, but was ", i7, i6, " < ").toString());
        }
    }

    @Override // t4.InterfaceC1731c
    public final h a(int i6) {
        int i7 = this.f14954c;
        int i8 = this.f14953b;
        return i6 >= i7 - i8 ? C1732d.a : new m(this.a, i8 + i6, i7);
    }

    @Override // t4.h
    public final Iterator iterator() {
        return new Z.c(this);
    }

    @Override // t4.InterfaceC1731c
    public final h take() {
        int i6 = this.f14954c;
        int i7 = this.f14953b;
        if (6 >= i6 - i7) {
            return this;
        }
        return new m(this.a, i7, i7 + 6);
    }
}
