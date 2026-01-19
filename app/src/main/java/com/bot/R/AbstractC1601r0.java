package r;

import com.vladsch.flexmark.parser.PegdownExtensions;
import h0.InterfaceC1041r;
import t.C1682j;

/* renamed from: r.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1601r0 {
    public static final C1598q0 a = new C1598q0(3, 0, null);

    /* renamed from: b, reason: collision with root package name */
    public static final C1598q0 f14455b = new C1598q0(3, 1, null);

    public static InterfaceC1041r a(InterfaceC1041r interfaceC1041r, InterfaceC1616w0 interfaceC1616w0, X0 x02, boolean z5, C1682j c1682j, boolean z6, l4.f fVar, boolean z7, int i6) {
        if ((i6 & 8) != 0) {
            c1682j = null;
        }
        return interfaceC1041r.c(new C1595p0(interfaceC1616w0, x02, z5, c1682j, z6, a, fVar, (i6 & PegdownExtensions.FENCED_CODE_BLOCKS) != 0 ? false : z7));
    }

    public static final long b(long j3) {
        boolean isNaN = Float.isNaN(e1.q.b(j3));
        float f6 = S.l.f7374V;
        float b5 = isNaN ? 0.0f : e1.q.b(j3);
        if (!Float.isNaN(e1.q.c(j3))) {
            f6 = e1.q.c(j3);
        }
        return Y4.d.g(b5, f6);
    }
}
