package Z1;

import O.A;
import O.C0319l0;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import java.lang.reflect.Method;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class b implements Y1.a {

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f9857e = new String[0];

    /* renamed from: f, reason: collision with root package name */
    public static final Object f9858f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f9859g;

    /* renamed from: c, reason: collision with root package name */
    public final SQLiteDatabase f9860c;

    static {
        A a = new A(26);
        X3.g gVar = X3.g.f9391e;
        f9858f = X3.a.c(gVar, a);
        f9859g = X3.a.c(gVar, new A(27));
    }

    public b(SQLiteDatabase sQLiteDatabase) {
        this.f9860c = sQLiteDatabase;
    }

    @Override // Y1.a
    public final void B() {
        this.f9860c.setTransactionSuccessful();
    }

    @Override // Y1.a
    public final void C(String str, Object[] objArr) {
        this.f9860c.execSQL(str, objArr);
    }

    @Override // Y1.a
    public final void D() {
        this.f9860c.beginTransactionNonExclusive();
    }

    @Override // Y1.a
    public final void J() {
        this.f9860c.endTransaction();
    }

    @Override // Y1.a
    public final boolean U() {
        return this.f9860c.inTransaction();
    }

    @Override // Y1.a
    public final Cursor V() {
        return i(new F2.h(23));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f9860c.close();
    }

    @Override // Y1.a
    public final void g() {
        this.f9860c.beginTransaction();
    }

    @Override // Y1.a
    public final Cursor i(Y1.d dVar) {
        final C0319l0 c0319l0 = new C0319l0(dVar, 1);
        Cursor rawQueryWithFactory = this.f9860c.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: Z1.a
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return (Cursor) C0319l0.this.i(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, dVar.d(), f9857e, null);
        AbstractC1276k.e(rawQueryWithFactory, "rawQueryWithFactory(...)");
        return rawQueryWithFactory;
    }

    @Override // Y1.a
    public final boolean isOpen() {
        return this.f9860c.isOpen();
    }

    @Override // Y1.a
    public final void n(String str) {
        this.f9860c.execSQL(str);
    }

    @Override // Y1.a
    public final i t(String str) {
        AbstractC1276k.f(str, "sql");
        SQLiteStatement compileStatement = this.f9860c.compileStatement(str);
        AbstractC1276k.e(compileStatement, "compileStatement(...)");
        return new i(compileStatement);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X3.f] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, X3.f] */
    @Override // Y1.a
    public final void w() {
        ?? r12 = f9859g;
        if (((Method) r12.getValue()) != null) {
            ?? r22 = f9858f;
            if (((Method) r22.getValue()) != null) {
                Method method = (Method) r12.getValue();
                AbstractC1276k.c(method);
                Method method2 = (Method) r22.getValue();
                AbstractC1276k.c(method2);
                Object invoke = method2.invoke(this.f9860c, null);
                if (invoke == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                method.invoke(invoke, 0, null, 0, null);
                return;
            }
        }
        g();
    }
}
