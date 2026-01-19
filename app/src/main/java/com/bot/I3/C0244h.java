package I3;

import java.util.Set;

/* renamed from: I3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0244h implements y {

    /* renamed from: c, reason: collision with root package name */
    public static final C0244h f2745c = new Object();

    @Override // N3.q
    public final Set a() {
        return Y3.x.f9814c;
    }

    @Override // N3.q
    public final boolean b() {
        return true;
    }

    @Override // N3.q
    public final void c(l4.e eVar) {
        Y4.l.A(this, eVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof y) && ((y) obj).isEmpty();
    }

    @Override // N3.q
    public final boolean isEmpty() {
        return true;
    }

    public final String toString() {
        return "Parameters " + Y3.x.f9814c;
    }
}
