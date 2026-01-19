package F0;

import com.vladsch.flexmark.parser.PegdownExtensions;
import k.C1147A;

/* loaded from: classes.dex */
public abstract class E0 {
    public static final C1147A a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0[] f1398b;

    static {
        C1147A c1147a = new C1147A(8);
        C0.a.getClass();
        D0 d02 = B0.f1388g;
        c1147a.i(1, d02);
        D0 d03 = B0.f1387f;
        c1147a.i(2, d03);
        D0 d04 = B0.f1383b;
        c1147a.i(4, d04);
        D0 d05 = B0.f1385d;
        c1147a.i(8, d05);
        D0 d06 = B0.f1389h;
        c1147a.i(16, d06);
        D0 d07 = B0.f1386e;
        c1147a.i(32, d07);
        D0 d08 = B0.f1390i;
        c1147a.i(64, d08);
        D0 d09 = B0.f1384c;
        c1147a.i(PegdownExtensions.FENCED_CODE_BLOCKS, d09);
        a = c1147a;
        f1398b = new C0[]{d02, d03, d04, d08, d06, d07, d05, B0.f1391j, d09};
    }

    public static final void a(H0.O o5, C0128p c0128p, long j3, int i6, int i7) {
        if (AbstractC0137z.g(j3, -1L)) {
            return;
        }
        o5.b(c0128p.b(), (int) ((j3 >>> 48) & 65535));
        o5.b(c0128p.d(), (int) ((j3 >>> 32) & 65535));
        o5.b(c0128p.c(), i6 - ((int) ((j3 >>> 16) & 65535)));
        o5.b(c0128p.a(), i7 - ((int) (j3 & 65535)));
    }
}
