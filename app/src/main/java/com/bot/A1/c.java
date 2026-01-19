package A1;

import j1.AbstractC1135a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class c {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f65b;

    /* renamed from: c, reason: collision with root package name */
    public final long f66c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f67d;

    public c(byte[] bArr, int i6, int i7) {
        this(-1L, bArr, i6, i7);
    }

    public static c a(long j3, ByteOrder byteOrder) {
        long[] jArr = {j3};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[g.f73B[4]]);
        wrap.order(byteOrder);
        wrap.putInt((int) jArr[0]);
        return new c(wrap.array(), 4, 1);
    }

    public static c b(e eVar, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[g.f73B[5]]);
        wrap.order(byteOrder);
        e eVar2 = new e[]{eVar}[0];
        wrap.putInt((int) eVar2.a);
        wrap.putInt((int) eVar2.f71b);
        return new c(wrap.array(), 5, 1);
    }

    public static c c(int i6, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[g.f73B[3]]);
        wrap.order(byteOrder);
        wrap.putShort((short) new int[]{i6}[0]);
        return new c(wrap.array(), 3, 1);
    }

    public final double d(ByteOrder byteOrder) {
        Object g3 = g(byteOrder);
        if (g3 == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (g3 instanceof String) {
            return Double.parseDouble((String) g3);
        }
        if (g3 instanceof long[]) {
            if (((long[]) g3).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (g3 instanceof int[]) {
            if (((int[]) g3).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (g3 instanceof double[]) {
            double[] dArr = (double[]) g3;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(g3 instanceof e[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        e[] eVarArr = (e[]) g3;
        if (eVarArr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        e eVar = eVarArr[0];
        return eVar.a / eVar.f71b;
    }

    public final int e(ByteOrder byteOrder) {
        Object g3 = g(byteOrder);
        if (g3 == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (g3 instanceof String) {
            return Integer.parseInt((String) g3);
        }
        if (g3 instanceof long[]) {
            long[] jArr = (long[]) g3;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(g3 instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) g3;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    public final String f(ByteOrder byteOrder) {
        Object g3 = g(byteOrder);
        if (g3 == null) {
            return null;
        }
        if (g3 instanceof String) {
            return (String) g3;
        }
        StringBuilder sb = new StringBuilder();
        int i6 = 0;
        if (g3 instanceof long[]) {
            long[] jArr = (long[]) g3;
            while (i6 < jArr.length) {
                sb.append(jArr[i6]);
                i6++;
                if (i6 != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (g3 instanceof int[]) {
            int[] iArr = (int[]) g3;
            while (i6 < iArr.length) {
                sb.append(iArr[i6]);
                i6++;
                if (i6 != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (g3 instanceof double[]) {
            double[] dArr = (double[]) g3;
            while (i6 < dArr.length) {
                sb.append(dArr[i6]);
                i6++;
                if (i6 != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(g3 instanceof e[])) {
            return null;
        }
        e[] eVarArr = (e[]) g3;
        while (i6 < eVarArr.length) {
            sb.append(eVarArr[i6].a);
            sb.append('/');
            sb.append(eVarArr[i6].f71b);
            i6++;
            if (i6 != eVarArr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0032: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:100:0x0032 */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v23, types: [int[]] */
    /* JADX WARN: Type inference failed for: r14v24, types: [long[]] */
    /* JADX WARN: Type inference failed for: r14v25, types: [A1.e[]] */
    /* JADX WARN: Type inference failed for: r14v26, types: [int[]] */
    /* JADX WARN: Type inference failed for: r14v27, types: [int[]] */
    /* JADX WARN: Type inference failed for: r14v28, types: [A1.e[]] */
    /* JADX WARN: Type inference failed for: r14v29, types: [double[]] */
    /* JADX WARN: Type inference failed for: r14v30, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r14v31, types: [double[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable g(java.nio.ByteOrder r14) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A1.c.g(java.nio.ByteOrder):java.io.Serializable");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(g.f72A[this.a]);
        sb.append(", data length:");
        return AbstractC1135a.i(sb, this.f67d.length, ")");
    }

    public c(long j3, byte[] bArr, int i6, int i7) {
        this.a = i6;
        this.f65b = i7;
        this.f66c = j3;
        this.f67d = bArr;
    }
}
