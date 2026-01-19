package Z1;

import android.database.sqlite.SQLiteProgram;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public class h implements Y1.c {

    /* renamed from: c, reason: collision with root package name */
    public final SQLiteProgram f9882c;

    public h(SQLiteProgram sQLiteProgram) {
        AbstractC1276k.f(sQLiteProgram, "delegate");
        this.f9882c = sQLiteProgram;
    }

    @Override // Y1.c
    public final void I(byte[] bArr, int i6) {
        this.f9882c.bindBlob(i6, bArr);
    }

    @Override // Y1.c
    public final void a(long j3, int i6) {
        this.f9882c.bindLong(i6, j3);
    }

    @Override // Y1.c
    public final void b(double d6, int i6) {
        this.f9882c.bindDouble(i6, d6);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f9882c.close();
    }

    @Override // Y1.c
    public final void e(int i6) {
        this.f9882c.bindNull(i6);
    }

    @Override // Y1.c
    public final void o(int i6, String str) {
        AbstractC1276k.f(str, "value");
        this.f9882c.bindString(i6, str);
    }
}
