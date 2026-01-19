package y;

/* loaded from: classes.dex */
public abstract class h0 {
    public static final float a = 2500;

    /* renamed from: b, reason: collision with root package name */
    public static final float f15874b = 1500;

    /* renamed from: c, reason: collision with root package name */
    public static final float f15875c = 50;

    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x00c2. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00da A[Catch: j -> 0x01a0, TRY_ENTER, TRY_LEAVE, TryCatch #7 {j -> 0x01a0, blocks: (B:26:0x00bc, B:33:0x00da, B:40:0x0100, B:42:0x0114, B:45:0x0129, B:48:0x0131), top: B:25:0x00bc }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0067  */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, m4.u] */
    /* JADX WARN: Type inference failed for: r20v1, types: [java.lang.Object, m4.t] */
    /* JADX WARN: Type inference failed for: r7v3, types: [m4.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [m4.w, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x017a -> B:21:0x0184). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(x.n r27, int r28, int r29, e1.InterfaceC0961c r30, d4.c r31) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y.h0.a(x.n, int, int, e1.c, d4.c):java.lang.Object");
    }

    public static final boolean b(boolean z5, x.n nVar, int i6) {
        if (z5) {
            if (nVar.c() > i6) {
                return true;
            }
            return nVar.c() == i6 && nVar.d() > 0;
        }
        if (nVar.c() < i6) {
            return true;
        }
        return nVar.c() == i6 && nVar.d() < 0;
    }

    public static final boolean c(x.n nVar, int i6) {
        return i6 <= nVar.e() && nVar.c() <= i6;
    }
}
