package I0;

/* renamed from: I0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0179e extends AbstractC0173b {

    /* renamed from: d, reason: collision with root package name */
    public static C0179e f2298d;

    @Override // I0.AbstractC0173b
    public final int[] a(int i6) {
        int length = c().length();
        if (length <= 0 || i6 >= length) {
            return null;
        }
        if (i6 < 0) {
            i6 = 0;
        }
        while (i6 < length && c().charAt(i6) == '\n' && (c().charAt(i6) == '\n' || (i6 != 0 && c().charAt(i6 - 1) != '\n'))) {
            i6++;
        }
        if (i6 >= length) {
            return null;
        }
        int i7 = i6 + 1;
        while (i7 < length && !f(i7)) {
            i7++;
        }
        return b(i6, i7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        return null;
     */
    @Override // I0.AbstractC0173b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int[] e(int r5) {
        /*
            r4 = this;
            java.lang.String r0 = r4.c()
            int r0 = r0.length()
            if (r0 > 0) goto Lb
            goto L2c
        Lb:
            if (r5 > 0) goto Le
            goto L2c
        Le:
            if (r5 <= r0) goto L11
            r5 = r0
        L11:
            r0 = 10
            if (r5 <= 0) goto L2a
            java.lang.String r1 = r4.c()
            int r2 = r5 + (-1)
            char r1 = r1.charAt(r2)
            if (r1 != r0) goto L2a
            boolean r1 = r4.f(r5)
            if (r1 != 0) goto L2a
            int r5 = r5 + (-1)
            goto L11
        L2a:
            if (r5 > 0) goto L2e
        L2c:
            r5 = 0
            return r5
        L2e:
            int r1 = r5 + (-1)
        L30:
            if (r1 <= 0) goto L4e
            java.lang.String r2 = r4.c()
            char r2 = r2.charAt(r1)
            if (r2 == r0) goto L4b
            if (r1 == 0) goto L4e
            java.lang.String r2 = r4.c()
            int r3 = r1 + (-1)
            char r2 = r2.charAt(r3)
            if (r2 != r0) goto L4b
            goto L4e
        L4b:
            int r1 = r1 + (-1)
            goto L30
        L4e:
            int[] r5 = r4.b(r1, r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.C0179e.e(int):int[]");
    }

    public final boolean f(int i6) {
        if (i6 <= 0 || c().charAt(i6 - 1) == '\n') {
            return false;
        }
        return i6 == c().length() || c().charAt(i6) == '\n';
    }
}
