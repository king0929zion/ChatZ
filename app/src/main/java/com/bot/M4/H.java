package M4;

import java.util.Arrays;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class H extends d0 {
    public int[] a;

    /* renamed from: b, reason: collision with root package name */
    public int f3428b;

    @Override // M4.d0
    public final Object a() {
        int[] copyOf = Arrays.copyOf(this.a, this.f3428b);
        AbstractC1276k.e(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // M4.d0
    public final void b(int i6) {
        int[] iArr = this.a;
        if (iArr.length < i6) {
            int length = iArr.length * 2;
            if (i6 < length) {
                i6 = length;
            }
            int[] copyOf = Arrays.copyOf(iArr, i6);
            AbstractC1276k.e(copyOf, "copyOf(...)");
            this.a = copyOf;
        }
    }

    @Override // M4.d0
    public final int d() {
        return this.f3428b;
    }
}
