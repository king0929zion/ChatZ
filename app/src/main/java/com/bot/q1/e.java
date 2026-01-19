package Q1;

import android.database.Cursor;
import java.util.Arrays;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class e extends g {

    /* renamed from: g, reason: collision with root package name */
    public int[] f6350g;

    /* renamed from: h, reason: collision with root package name */
    public long[] f6351h;

    /* renamed from: i, reason: collision with root package name */
    public double[] f6352i;

    /* renamed from: j, reason: collision with root package name */
    public String[] f6353j;

    /* renamed from: k, reason: collision with root package name */
    public byte[][] f6354k;

    /* renamed from: l, reason: collision with root package name */
    public Cursor f6355l;

    public static void h(Cursor cursor, int i6) {
        if (i6 < 0 || i6 >= cursor.getColumnCount()) {
            h5.e.l0(25, "column index out of range");
            throw null;
        }
    }

    @Override // X1.c
    public final String M(int i6) {
        c();
        Cursor j3 = j();
        h(j3, i6);
        String string = j3.getString(i6);
        AbstractC1276k.e(string, "getString(...)");
        return string;
    }

    @Override // X1.c
    public final boolean Z() {
        c();
        f();
        Cursor cursor = this.f6355l;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X1.c
    public final void a(long j3, int i6) {
        c();
        d(1, i6);
        this.f6350g[i6] = 1;
        this.f6351h[i6] = j3;
    }

    @Override // X1.c
    public final void b(double d6, int i6) {
        c();
        d(2, i6);
        this.f6350g[i6] = 2;
        this.f6352i[i6] = d6;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.f6359f) {
            c();
            this.f6350g = new int[0];
            this.f6351h = new long[0];
            this.f6352i = new double[0];
            this.f6353j = new String[0];
            this.f6354k = new byte[0];
            reset();
        }
        this.f6359f = true;
    }

    public final void d(int i6, int i7) {
        int i8 = i7 + 1;
        int[] iArr = this.f6350g;
        if (iArr.length < i8) {
            int[] copyOf = Arrays.copyOf(iArr, i8);
            AbstractC1276k.e(copyOf, "copyOf(...)");
            this.f6350g = copyOf;
        }
        if (i6 == 1) {
            long[] jArr = this.f6351h;
            if (jArr.length < i8) {
                long[] copyOf2 = Arrays.copyOf(jArr, i8);
                AbstractC1276k.e(copyOf2, "copyOf(...)");
                this.f6351h = copyOf2;
                return;
            }
            return;
        }
        if (i6 == 2) {
            double[] dArr = this.f6352i;
            if (dArr.length < i8) {
                double[] copyOf3 = Arrays.copyOf(dArr, i8);
                AbstractC1276k.e(copyOf3, "copyOf(...)");
                this.f6352i = copyOf3;
                return;
            }
            return;
        }
        if (i6 == 3) {
            String[] strArr = this.f6353j;
            if (strArr.length < i8) {
                Object[] copyOf4 = Arrays.copyOf(strArr, i8);
                AbstractC1276k.e(copyOf4, "copyOf(...)");
                this.f6353j = (String[]) copyOf4;
                return;
            }
            return;
        }
        if (i6 != 4) {
            return;
        }
        byte[][] bArr = this.f6354k;
        if (bArr.length < i8) {
            Object[] copyOf5 = Arrays.copyOf(bArr, i8);
            AbstractC1276k.e(copyOf5, "copyOf(...)");
            this.f6354k = (byte[][]) copyOf5;
        }
    }

    @Override // X1.c
    public final void e(int i6) {
        c();
        d(5, i6);
        this.f6350g[i6] = 5;
    }

    public final void f() {
        if (this.f6355l == null) {
            this.f6355l = this.f6357c.i(new A3.c(this, 19));
        }
    }

    @Override // X1.c
    public final int getColumnCount() {
        c();
        f();
        Cursor cursor = this.f6355l;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // X1.c
    public final String getColumnName(int i6) {
        c();
        f();
        Cursor cursor = this.f6355l;
        if (cursor == null) {
            throw new IllegalStateException("Required value was null.");
        }
        h(cursor, i6);
        String columnName = cursor.getColumnName(i6);
        AbstractC1276k.e(columnName, "getColumnName(...)");
        return columnName;
    }

    @Override // X1.c
    public final double getDouble(int i6) {
        c();
        Cursor j3 = j();
        h(j3, i6);
        return j3.getDouble(i6);
    }

    @Override // X1.c
    public final long getLong(int i6) {
        c();
        Cursor j3 = j();
        h(j3, i6);
        return j3.getLong(i6);
    }

    @Override // X1.c
    public final boolean isNull(int i6) {
        c();
        Cursor j3 = j();
        h(j3, i6);
        return j3.isNull(i6);
    }

    public final Cursor j() {
        Cursor cursor = this.f6355l;
        if (cursor != null) {
            return cursor;
        }
        h5.e.l0(21, "no row");
        throw null;
    }

    @Override // X1.c
    public final void reset() {
        c();
        Cursor cursor = this.f6355l;
        if (cursor != null) {
            cursor.close();
        }
        this.f6355l = null;
    }

    @Override // X1.c
    public final void z(int i6, String str) {
        AbstractC1276k.f(str, "value");
        c();
        d(3, i6);
        this.f6350g[i6] = 3;
        this.f6353j[i6] = str;
    }
}
