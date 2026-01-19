package M4;

import java.util.Arrays;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class y0 extends d0 {
    public short[] a;

    /* renamed from: b, reason: collision with root package name */
    public int f3507b;

    @Override // M4.d0
    public final Object a() {
        short[] copyOf = Arrays.copyOf(this.a, this.f3507b);
        AbstractC1276k.e(copyOf, "copyOf(...)");
        return new X3.x(copyOf);
    }

    @Override // M4.d0
    public final void b(int i6) {
        short[] sArr = this.a;
        if (sArr.length < i6) {
            int length = sArr.length * 2;
            if (i6 < length) {
                i6 = length;
            }
            short[] copyOf = Arrays.copyOf(sArr, i6);
            AbstractC1276k.e(copyOf, "copyOf(...)");
            this.a = copyOf;
        }
    }

    @Override // M4.d0
    public final int d() {
        return this.f3507b;
    }
}
