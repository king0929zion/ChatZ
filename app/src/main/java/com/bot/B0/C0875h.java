package b0;

import i4.AbstractC1120d;
import m4.AbstractC1276k;

/* renamed from: b0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0875h {
    public int a = 0;

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRef(element = ");
        sb.append(this.a);
        sb.append(")@");
        int hashCode = hashCode();
        AbstractC1120d.g(16);
        String num = Integer.toString(hashCode, 16);
        AbstractC1276k.e(num, "toString(...)");
        sb.append(num);
        return sb.toString();
    }
}
