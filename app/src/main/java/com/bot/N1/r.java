package N1;

import D.C0056a;
import android.content.Context;
import android.content.Intent;
import b4.InterfaceC0910h;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import i4.AbstractC1120d;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class r {
    public boolean a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3761b;

    /* renamed from: c, reason: collision with root package name */
    public final C0279a f3762c;

    /* renamed from: d, reason: collision with root package name */
    public final w f3763d;

    /* renamed from: e, reason: collision with root package name */
    public final List f3764e;

    /* renamed from: f, reason: collision with root package name */
    public final P1.b f3765f;

    /* renamed from: g, reason: collision with root package name */
    public Y1.a f3766g;

    public r(C0279a c0279a, I2.x xVar) {
        this.f3762c = c0279a;
        this.f3763d = new w(FlexmarkHtmlConverter.DEFAULT_NODE, -1, FlexmarkHtmlConverter.DEFAULT_NODE);
        List list = c0279a.f3722e;
        Y3.v vVar = Y3.v.f9812c;
        this.f3764e = list == null ? vVar : list;
        ArrayList A02 = Y3.m.A0(list == null ? vVar : list, new C0295q(new C0056a(this, 17)));
        Context context = c0279a.a;
        String str = c0279a.f3719b;
        F2.h hVar = c0279a.f3720c;
        F1.e eVar = c0279a.f3721d;
        boolean z5 = c0279a.f3723f;
        u uVar = c0279a.f3724g;
        Executor executor = c0279a.f3725h;
        Executor executor2 = c0279a.f3726i;
        Intent intent = c0279a.f3727j;
        boolean z6 = c0279a.f3728k;
        boolean z7 = c0279a.f3729l;
        Set set = c0279a.f3730m;
        String str2 = c0279a.f3731n;
        File file = c0279a.f3732o;
        Callable callable = c0279a.f3733p;
        List list2 = c0279a.f3734q;
        List list3 = c0279a.f3735r;
        boolean z8 = c0279a.f3736s;
        X1.b bVar = c0279a.f3737t;
        InterfaceC0910h interfaceC0910h = c0279a.f3738u;
        AbstractC1276k.f(context, "context");
        AbstractC1276k.f(eVar, "migrationContainer");
        AbstractC1276k.f(executor, "queryExecutor");
        AbstractC1276k.f(executor2, "transactionExecutor");
        AbstractC1276k.f(list2, "typeConverters");
        AbstractC1276k.f(list3, "autoMigrationSpecs");
        xVar.f(new C0279a(context, str, hVar, eVar, A02, z5, uVar, executor, executor2, intent, z6, z7, set, str2, file, callable, list2, list3, z8, bVar, interfaceC0910h));
        throw null;
    }

    public static final void a(r rVar, X1.a aVar) {
        Object b5;
        w wVar = rVar.f3763d;
        C0279a c0279a = rVar.f3762c;
        u uVar = c0279a.f3724g;
        u uVar2 = u.f3785f;
        if (uVar == uVar2) {
            h5.e.S("PRAGMA journal_mode = WAL", aVar);
        } else {
            h5.e.S("PRAGMA journal_mode = TRUNCATE", aVar);
        }
        if (c0279a.f3724g == uVar2) {
            h5.e.S("PRAGMA synchronous = NORMAL", aVar);
        } else {
            h5.e.S("PRAGMA synchronous = FULL", aVar);
        }
        b(aVar);
        X1.c c02 = aVar.c0("PRAGMA user_version");
        try {
            c02.Z();
            int i6 = (int) c02.getLong(0);
            AbstractC1120d.h(c02, null);
            int i7 = wVar.a;
            if (i6 != i7) {
                h5.e.S("BEGIN EXCLUSIVE TRANSACTION", aVar);
                try {
                    if (i6 == 0) {
                        rVar.d(aVar);
                    } else {
                        rVar.e(i6, i7, aVar);
                    }
                    h5.e.S("PRAGMA user_version = " + i7, aVar);
                    b5 = X3.y.a;
                } catch (Throwable th) {
                    b5 = X3.a.b(th);
                }
                if (!(b5 instanceof X3.k)) {
                    h5.e.S("END TRANSACTION", aVar);
                }
                Throwable a = X3.l.a(b5);
                if (a != null) {
                    h5.e.S("ROLLBACK TRANSACTION", aVar);
                    throw a;
                }
            }
            rVar.f(aVar);
        } finally {
        }
    }

    public static void b(X1.a aVar) {
        X1.c c02 = aVar.c0("PRAGMA busy_timeout");
        try {
            c02.Z();
            long j3 = c02.getLong(0);
            AbstractC1120d.h(c02, null);
            if (j3 < 3000) {
                h5.e.S("PRAGMA busy_timeout = 3000", aVar);
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC1120d.h(c02, th);
                throw th2;
            }
        }
    }

    public final Y1.b c() {
        A3.c cVar;
        P1.b bVar = this.f3765f;
        Q1.b bVar2 = bVar instanceof Q1.b ? (Q1.b) bVar : null;
        if (bVar2 == null || (cVar = bVar2.f6344c) == null) {
            return null;
        }
        return (Y1.b) cVar.f119e;
    }

    public final void d(X1.a aVar) {
        AbstractC1276k.f(aVar, "connection");
        X1.c c02 = aVar.c0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z5 = false;
            if (c02.Z()) {
                if (c02.getLong(0) == 0) {
                    z5 = true;
                }
            }
            AbstractC1120d.h(c02, null);
            w wVar = this.f3763d;
            wVar.a(aVar);
            if (!z5) {
                I3.I g3 = wVar.g(aVar);
                if (!g3.a) {
                    throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + ((String) g3.f2733b)).toString());
                }
            }
            g(aVar);
            wVar.c(aVar);
            Iterator it = this.f3764e.iterator();
            while (it.hasNext()) {
                ((C0295q) it.next()).getClass();
                if (aVar instanceof Q1.a) {
                    AbstractC1276k.f(((Q1.a) aVar).f6343c, "db");
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC1120d.h(c02, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:161:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x009b A[EDGE_INSN: B:195:0x009b->B:179:0x009b BREAK  A[LOOP:4: B:158:0x0024->B:180:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(int r13, int r14, X1.a r15) {
        /*
            Method dump skipped, instructions count: 866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N1.r.e(int, int, X1.a):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(X1.a r10) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N1.r.f(X1.a):void");
    }

    public final void g(X1.a aVar) {
        h5.e.S("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)", aVar);
        String str = (String) this.f3763d.f3795b;
        AbstractC1276k.f(str, "hash");
        h5.e.S("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + str + "')", aVar);
    }

    public r(C0279a c0279a, w wVar) {
        int i6;
        P1.g gVar;
        u uVar = c0279a.f3724g;
        F2.h hVar = c0279a.f3720c;
        String str = c0279a.f3719b;
        this.f3762c = c0279a;
        this.f3763d = wVar;
        List list = c0279a.f3722e;
        this.f3764e = list == null ? Y3.v.f9812c : list;
        X1.b bVar = c0279a.f3737t;
        if (bVar != null) {
            if (str == null) {
                gVar = new P1.g(new M.q(this, bVar));
            } else {
                M.q qVar = new M.q(this, bVar);
                int ordinal = uVar.ordinal();
                if (ordinal == 1) {
                    i6 = 1;
                } else {
                    if (ordinal != 2) {
                        throw new IllegalStateException(("Can't get max number of reader for journal mode '" + uVar + '\'').toString());
                    }
                    i6 = 4;
                }
                int ordinal2 = uVar.ordinal();
                if (ordinal2 != 1 && ordinal2 != 2) {
                    throw new IllegalStateException(("Can't get max number of writers for journal mode '" + uVar + '\'').toString());
                }
                gVar = new P1.g(qVar, str, i6);
            }
            this.f3765f = gVar;
        } else if (hVar != null) {
            Context context = c0279a.a;
            AbstractC1276k.f(context, "context");
            this.f3765f = new Q1.b(new A3.c(new Z1.g(context, str, new C0.c(this, wVar.a))));
        } else {
            throw new IllegalArgumentException("SQLiteManager was constructed with both null driver and open helper factory!");
        }
        boolean z5 = uVar == u.f3785f;
        Y1.b c6 = c();
        if (c6 != null) {
            c6.setWriteAheadLoggingEnabled(z5);
        }
    }
}
