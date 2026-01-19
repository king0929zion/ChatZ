package M4;

import java.util.Arrays;
import m4.AbstractC1276k;

/* renamed from: M4.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0266m extends d0 {
    public char[] a;

    /* renamed from: b, reason: collision with root package name */
    public int f3476b;

    @Override // M4.d0
    public final Object a() {
        char[] copyOf = Arrays.copyOf(this.a, this.f3476b);
        AbstractC1276k.e(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // M4.d0
    public final void b(int i6) {
        char[] cArr = this.a;
        if (cArr.length < i6) {
            int length = cArr.length * 2;
            if (i6 < length) {
                i6 = length;
            }
            char[] copyOf = Arrays.copyOf(cArr, i6);
            AbstractC1276k.e(copyOf, "copyOf(...)");
            this.a = copyOf;
        }
    }

    @Override // M4.d0
    public final int d() {
        return this.f3476b;
    }
}
