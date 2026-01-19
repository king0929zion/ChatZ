package M4;

import java.util.Arrays;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class M extends d0 {
    public long[] a;

    /* renamed from: b, reason: collision with root package name */
    public int f3431b;

    @Override // M4.d0
    public final Object a() {
        long[] copyOf = Arrays.copyOf(this.a, this.f3431b);
        AbstractC1276k.e(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // M4.d0
    public final void b(int i6) {
        long[] jArr = this.a;
        if (jArr.length < i6) {
            int length = jArr.length * 2;
            if (i6 < length) {
                i6 = length;
            }
            long[] copyOf = Arrays.copyOf(jArr, i6);
            AbstractC1276k.e(copyOf, "copyOf(...)");
            this.a = copyOf;
        }
    }

    @Override // M4.d0
    public final int d() {
        return this.f3431b;
    }
}
