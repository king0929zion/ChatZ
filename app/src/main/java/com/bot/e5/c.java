package e5;

import androidx.lifecycle.N;
import d5.C0952l;
import d5.y;
import j1.AbstractC1135a;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public abstract class c {
    public static final C0952l a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0952l f11598b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0952l f11599c;

    /* renamed from: d, reason: collision with root package name */
    public static final C0952l f11600d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0952l f11601e;

    static {
        C0952l c0952l = C0952l.f11483g;
        a = N.q("/");
        f11598b = N.q("\\");
        f11599c = N.q("/\\");
        f11600d = N.q(".");
        f11601e = N.q("..");
    }

    public static final int a(y yVar) {
        C0952l c0952l = yVar.f11514c;
        if (c0952l.d() != 0) {
            if (c0952l.i(0) != 47) {
                if (c0952l.i(0) == 92) {
                    if (c0952l.d() > 2 && c0952l.i(1) == 92) {
                        C0952l c0952l2 = f11598b;
                        AbstractC1276k.f(c0952l2, "other");
                        int f6 = c0952l.f(c0952l2.h(), 2);
                        return f6 == -1 ? c0952l.d() : f6;
                    }
                } else if (c0952l.d() > 2 && c0952l.i(1) == 58 && c0952l.i(2) == 92) {
                    char i6 = (char) c0952l.i(0);
                    if ('a' <= i6 && i6 < '{') {
                        return 3;
                    }
                    if ('A' <= i6 && i6 < '[') {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [d5.i, java.lang.Object] */
    public static final y b(y yVar, y yVar2, boolean z5) {
        AbstractC1276k.f(yVar2, "child");
        if (a(yVar2) != -1 || yVar2.f() != null) {
            return yVar2;
        }
        C0952l c6 = c(yVar);
        if (c6 == null && (c6 = c(yVar2)) == null) {
            c6 = f(y.f11513e);
        }
        ?? obj = new Object();
        obj.N(yVar.f11514c);
        if (obj.f11482e > 0) {
            obj.N(c6);
        }
        obj.N(yVar2.f11514c);
        return d(obj, z5);
    }

    public static final C0952l c(y yVar) {
        C0952l c0952l = yVar.f11514c;
        C0952l c0952l2 = a;
        if (C0952l.g(c0952l, c0952l2) != -1) {
            return c0952l2;
        }
        C0952l c0952l3 = yVar.f11514c;
        C0952l c0952l4 = f11598b;
        if (C0952l.g(c0952l3, c0952l4) != -1) {
            return c0952l4;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0110 A[EDGE_INSN: B:68:0x0110->B:69:0x0110 BREAK  A[LOOP:1: B:20:0x00ab->B:36:0x00ab], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00a5  */
    /* JADX WARN: Type inference failed for: r1v0, types: [d5.i, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final d5.y d(d5.C0949i r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.c.d(d5.i, boolean):d5.y");
    }

    public static final C0952l e(byte b5) {
        if (b5 == 47) {
            return a;
        }
        if (b5 == 92) {
            return f11598b;
        }
        throw new IllegalArgumentException(B3.e.h(b5, "not a directory separator: "));
    }

    public static final C0952l f(String str) {
        if (AbstractC1276k.b(str, "/")) {
            return a;
        }
        if (AbstractC1276k.b(str, "\\")) {
            return f11598b;
        }
        throw new IllegalArgumentException(AbstractC1135a.f("not a directory separator: ", str));
    }
}
