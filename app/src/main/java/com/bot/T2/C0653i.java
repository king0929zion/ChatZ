package T2;

import j1.AbstractC1135a;
import m4.AbstractC1276k;
import o4.AbstractC1410a;

/* renamed from: T2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0653i extends AbstractC1410a {

    /* renamed from: e, reason: collision with root package name */
    public final char f8449e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8450f;

    /* renamed from: g, reason: collision with root package name */
    public final String f8451g;

    public C0653i(char c6, int i6, String str) {
        this.f8449e = c6;
        this.f8450f = i6;
        this.f8451g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0653i)) {
            return false;
        }
        C0653i c0653i = (C0653i) obj;
        return this.f8449e == c0653i.f8449e && this.f8450f == c0653i.f8450f && AbstractC1276k.b(this.f8451g, c0653i.f8451g);
    }

    public final int hashCode() {
        int b5 = AbstractC1135a.b(this.f8450f, Character.hashCode(this.f8449e) * 31, 31);
        String str = this.f8451g;
        return b5 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InCodeFence(marker=");
        sb.append(this.f8449e);
        sb.append(", fenceLength=");
        sb.append(this.f8450f);
        sb.append(", language=");
        return B3.e.s(sb, this.f8451g, ")");
    }
}
