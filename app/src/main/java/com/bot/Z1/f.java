package Z1;

import N1.r;
import a2.C0802a;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import m4.AbstractC1276k;
import o4.AbstractC1410a;

/* loaded from: classes.dex */
public final class f extends SQLiteOpenHelper {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f9870j = 0;

    /* renamed from: c, reason: collision with root package name */
    public final Context f9871c;

    /* renamed from: e, reason: collision with root package name */
    public final A3.c f9872e;

    /* renamed from: f, reason: collision with root package name */
    public final C0.c f9873f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9874g;

    /* renamed from: h, reason: collision with root package name */
    public final C0802a f9875h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f9876i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, String str, final A3.c cVar, final C0.c cVar2) {
        super(context, str, null, cVar2.f648b, new DatabaseErrorHandler() { // from class: Z1.c
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                int i6 = f.f9870j;
                AbstractC1276k.c(sQLiteDatabase);
                b w5 = AbstractC1410a.w(cVar, sQLiteDatabase);
                C0.c.this.getClass();
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + w5 + ".path");
                SQLiteDatabase sQLiteDatabase2 = w5.f9860c;
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        C0.c.e(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> list = null;
                try {
                    try {
                        list = sQLiteDatabase2.getAttachedDbs();
                    } finally {
                        if (list != null) {
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                Object obj = ((Pair) it.next()).second;
                                AbstractC1276k.e(obj, "second");
                                C0.c.e((String) obj);
                            }
                        } else {
                            String path2 = sQLiteDatabase2.getPath();
                            if (path2 != null) {
                                C0.c.e(path2);
                            }
                        }
                    }
                } catch (SQLiteException unused) {
                }
                try {
                    w5.close();
                } catch (IOException unused2) {
                    if (list != null) {
                        return;
                    }
                }
            }
        });
        String str2;
        AbstractC1276k.f(context, "context");
        AbstractC1276k.f(cVar2, "callback");
        this.f9871c = context;
        this.f9872e = cVar;
        this.f9873f = cVar2;
        if (str == null) {
            str2 = UUID.randomUUID().toString();
            AbstractC1276k.e(str2, "toString(...)");
        } else {
            str2 = str;
        }
        this.f9875h = new C0802a(str2, context.getCacheDir(), false);
    }

    public final Y1.a c(boolean z5) {
        C0802a c0802a = this.f9875h;
        try {
            c0802a.a((this.f9876i || getDatabaseName() == null) ? false : true);
            this.f9874g = false;
            SQLiteDatabase d6 = d(z5);
            if (!this.f9874g) {
                b w5 = AbstractC1410a.w(this.f9872e, d6);
                c0802a.b();
                return w5;
            }
            close();
            Y1.a c6 = c(z5);
            c0802a.b();
            return c6;
        } catch (Throwable th) {
            c0802a.b();
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        C0802a c0802a = this.f9875h;
        try {
            c0802a.a(c0802a.a);
            super.close();
            this.f9872e.f119e = null;
            this.f9876i = false;
        } finally {
            c0802a.b();
        }
    }

    public final SQLiteDatabase d(boolean z5) {
        SQLiteDatabase readableDatabase;
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z6 = this.f9876i;
        if (databaseName != null && !z6 && (parentFile = this.f9871c.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            if (z5) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                AbstractC1276k.c(writableDatabase);
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase2 = getReadableDatabase();
            AbstractC1276k.c(readableDatabase2);
            return readableDatabase2;
        } catch (Throwable unused) {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                if (z5) {
                    readableDatabase = getWritableDatabase();
                    AbstractC1276k.c(readableDatabase);
                } else {
                    readableDatabase = getReadableDatabase();
                    AbstractC1276k.c(readableDatabase);
                }
                return readableDatabase;
            } catch (Throwable th) {
                th = th;
                if (th instanceof d) {
                    d dVar = (d) th;
                    int ordinal = dVar.f9862c.ordinal();
                    th = dVar.f9863e;
                    if (ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3) {
                        throw th;
                    }
                    if (ordinal != 4) {
                        throw new RuntimeException();
                    }
                    if (!(th instanceof SQLiteException)) {
                        throw th;
                    }
                }
                throw th;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        AbstractC1276k.f(sQLiteDatabase, "db");
        boolean z5 = this.f9874g;
        C0.c cVar = this.f9873f;
        if (!z5 && cVar.f648b != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            AbstractC1410a.w(this.f9872e, sQLiteDatabase);
            cVar.getClass();
        } catch (Throwable th) {
            throw new d(e.f9864c, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        AbstractC1276k.f(sQLiteDatabase, "sqLiteDatabase");
        try {
            ((r) this.f9873f.f649c).d(new Q1.a(AbstractC1410a.w(this.f9872e, sQLiteDatabase)));
        } catch (Throwable th) {
            throw new d(e.f9865e, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i6, int i7) {
        AbstractC1276k.f(sQLiteDatabase, "db");
        this.f9874g = true;
        try {
            this.f9873f.g(AbstractC1410a.w(this.f9872e, sQLiteDatabase), i6, i7);
        } catch (Throwable th) {
            throw new d(e.f9867g, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        AbstractC1276k.f(sQLiteDatabase, "db");
        if (!this.f9874g) {
            try {
                C0.c cVar = this.f9873f;
                b w5 = AbstractC1410a.w(this.f9872e, sQLiteDatabase);
                r rVar = (r) cVar.f649c;
                rVar.f(new Q1.a(w5));
                rVar.f3766g = w5;
            } catch (Throwable th) {
                throw new d(e.f9868h, th);
            }
        }
        this.f9876i = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i6, int i7) {
        AbstractC1276k.f(sQLiteDatabase, "sqLiteDatabase");
        this.f9874g = true;
        try {
            this.f9873f.g(AbstractC1410a.w(this.f9872e, sQLiteDatabase), i6, i7);
        } catch (Throwable th) {
            throw new d(e.f9866f, th);
        }
    }
}
