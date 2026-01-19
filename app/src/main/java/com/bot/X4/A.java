package X4;

import com.vladsch.flexmark.parser.PegdownExtensions;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class A {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f9416b = new int[10];

    public final int a() {
        if ((this.a & PegdownExtensions.FENCED_CODE_BLOCKS) != 0) {
            return this.f9416b[7];
        }
        return 65535;
    }

    public final void b(A a) {
        AbstractC1276k.f(a, "other");
        for (int i6 = 0; i6 < 10; i6++) {
            if (((1 << i6) & a.a) != 0) {
                c(i6, a.f9416b[i6]);
            }
        }
    }

    public final void c(int i6, int i7) {
        if (i6 >= 0) {
            int[] iArr = this.f9416b;
            if (i6 >= iArr.length) {
                return;
            }
            this.a = (1 << i6) | this.a;
            iArr[i6] = i7;
        }
    }
}
