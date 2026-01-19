package M4;

import java.util.Arrays;
import m4.AbstractC1276k;

/* renamed from: M4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0257d extends d0 {
    public boolean[] a;

    /* renamed from: b, reason: collision with root package name */
    public int f3461b;

    @Override // M4.d0
    public final Object a() {
        boolean[] copyOf = Arrays.copyOf(this.a, this.f3461b);
        AbstractC1276k.e(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // M4.d0
    public final void b(int i6) {
        boolean[] zArr = this.a;
        if (zArr.length < i6) {
            int length = zArr.length * 2;
            if (i6 < length) {
                i6 = length;
            }
            boolean[] copyOf = Arrays.copyOf(zArr, i6);
            AbstractC1276k.e(copyOf, "copyOf(...)");
            this.a = copyOf;
        }
    }

    @Override // M4.d0
    public final int d() {
        return this.f3461b;
    }
}
