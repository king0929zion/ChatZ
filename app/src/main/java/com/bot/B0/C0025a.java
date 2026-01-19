package B0;

import m4.AbstractC1276k;

/* renamed from: B0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0025a implements InterfaceC0045v {

    /* renamed from: b, reason: collision with root package name */
    public final int f432b;

    public C0025a(int i6) {
        this.f432b = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0025a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC1276k.d(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        return this.f432b == ((C0025a) obj).f432b;
    }

    public final int hashCode() {
        return this.f432b;
    }

    public final String toString() {
        return B3.e.q(new StringBuilder("AndroidPointerIcon(type="), this.f432b, ')');
    }
}
