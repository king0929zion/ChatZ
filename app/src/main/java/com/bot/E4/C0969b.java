package e4;

import B3.e;
import Y3.AbstractC0737d;
import java.io.Serializable;

/* renamed from: e4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0969b extends AbstractC0737d implements InterfaceC0968a, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public final Enum[] f11597c;

    public C0969b(Enum[] enumArr) {
        this.f11597c = enumArr;
    }

    @Override // Y3.AbstractC0734a
    public final int a() {
        return this.f11597c.length;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d A[RETURN] */
    @Override // Y3.AbstractC0734a, java.util.Collection, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean contains(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof java.lang.Enum
            if (r0 != 0) goto L5
            goto L1f
        L5:
            java.lang.Enum r4 = (java.lang.Enum) r4
            java.lang.String r0 = "element"
            m4.AbstractC1276k.f(r4, r0)
            int r0 = r4.ordinal()
            if (r0 < 0) goto L1a
            java.lang.Enum[] r1 = r3.f11597c
            int r2 = r1.length
            if (r0 >= r2) goto L1a
            r0 = r1[r0]
            goto L1b
        L1a:
            r0 = 0
        L1b:
            if (r0 != r4) goto L1f
            r4 = 1
            return r4
        L1f:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.C0969b.contains(java.lang.Object):boolean");
    }

    @Override // java.util.List
    public final Object get(int i6) {
        Enum[] enumArr = this.f11597c;
        int length = enumArr.length;
        if (i6 < 0 || i6 >= length) {
            throw new IndexOutOfBoundsException(e.k("index: ", i6, length, ", size: "));
        }
        return enumArr[i6];
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001f A[RETURN] */
    @Override // Y3.AbstractC0737d, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int indexOf(java.lang.Object r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof java.lang.Enum
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Enum r5 = (java.lang.Enum) r5
            java.lang.String r0 = "element"
            m4.AbstractC1276k.f(r5, r0)
            int r0 = r5.ordinal()
            if (r0 < 0) goto L1b
            java.lang.Enum[] r2 = r4.f11597c
            int r3 = r2.length
            if (r0 >= r3) goto L1b
            r2 = r2[r0]
            goto L1c
        L1b:
            r2 = 0
        L1c:
            if (r2 != r5) goto L1f
            return r0
        L1f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.C0969b.indexOf(java.lang.Object):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001f A[RETURN] */
    @Override // Y3.AbstractC0737d, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int lastIndexOf(java.lang.Object r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof java.lang.Enum
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Enum r5 = (java.lang.Enum) r5
            java.lang.String r0 = "element"
            m4.AbstractC1276k.f(r5, r0)
            int r0 = r5.ordinal()
            if (r0 < 0) goto L1b
            java.lang.Enum[] r2 = r4.f11597c
            int r3 = r2.length
            if (r0 >= r3) goto L1b
            r2 = r2[r0]
            goto L1c
        L1b:
            r2 = 0
        L1c:
            if (r2 != r5) goto L1f
            return r0
        L1f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.C0969b.lastIndexOf(java.lang.Object):int");
    }
}
