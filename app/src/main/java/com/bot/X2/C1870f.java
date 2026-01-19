package x2;

import I2.A;
import I2.v;
import M2.t;
import N1.s;
import X2.C0692g;
import X2.Y;
import Y2.C0720i;
import Y2.L;
import Y2.M;
import Y2.W;
import Y2.x;
import a3.C0808F;
import a3.C0811I;
import a3.C0818g;
import a3.w;
import android.content.Context;
import com.bot.core.database.dao.ConversationDao;
import com.bot.core.database.dao.LLMProviderDao;
import com.bot.core.database.dao.LLMSettingDao;
import com.bot.core.database.dao.McpServerDao;
import com.bot.core.database.dao.MessageDao;
import com.bot.core.database.data.AppDatabase;
import com.tencent.mmkv.MMKV;
import i4.AbstractC1121e;
import java.util.Arrays;
import m4.AbstractC1276k;
import u4.AbstractC1776n;
import v.AbstractC1787b;

/* renamed from: x2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1870f implements s3.c {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final C1871g f15572b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15573c;

    public /* synthetic */ C1870f(C1871g c1871g, int i6, int i7) {
        this.a = i7;
        this.f15572b = c1871g;
        this.f15573c = i6;
    }

    @Override // s3.c
    public final Object get() {
        AppDatabase appDatabase;
        Object c0692g;
        switch (this.a) {
            case 0:
                switch (this.f15573c) {
                    case 0:
                        C1871g c1871g = this.f15572b;
                        return new G2.d(c1871g.a.a, (MMKV) c1871g.f15575c.get());
                    case 1:
                        MMKV defaultMMKV = MMKV.defaultMMKV();
                        AbstractC1276k.e(defaultMMKV, "defaultMMKV(...)");
                        return defaultMMKV;
                    case 2:
                        C1871g c1871g2 = this.f15572b;
                        return new A(c1871g2.a.a, (F2.i) c1871g2.f15577e.get(), (MMKV) this.f15572b.f15575c.get());
                    case 3:
                        return new F2.i();
                    case 4:
                        AppDatabase appDatabase2 = (AppDatabase) this.f15572b.f15579g.get();
                        AbstractC1276k.f(appDatabase2, "database");
                        ConversationDao j3 = appDatabase2.j();
                        AbstractC1121e.f(j3);
                        AppDatabase appDatabase3 = (AppDatabase) this.f15572b.f15579g.get();
                        AbstractC1276k.f(appDatabase3, "database");
                        MessageDao n3 = appDatabase3.n();
                        AbstractC1121e.f(n3);
                        return new v(j3, n3);
                    case AbstractC1787b.f15290g /* 5 */:
                        Context context = this.f15572b.a.a;
                        A2.c cVar = AppDatabase.Companion;
                        cVar.getClass();
                        AppDatabase appDatabase4 = AppDatabase.f11139j;
                        if (appDatabase4 != null) {
                            return appDatabase4;
                        }
                        synchronized (cVar) {
                            A2.c.a(context);
                            Context applicationContext = context.getApplicationContext();
                            AbstractC1276k.e(applicationContext, "getApplicationContext(...)");
                            if (AbstractC1776n.Q("bothub.db")) {
                                throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
                            }
                            s sVar = new s(applicationContext);
                            sVar.a((B2.a[]) Arrays.copyOf(B2.b.a, 13));
                            sVar.f3779n = false;
                            sVar.f3780o = true;
                            sVar.f3781p = true;
                            appDatabase = (AppDatabase) sVar.b();
                            AppDatabase.f11139j = appDatabase;
                        }
                        return appDatabase;
                    case 6:
                        return new t((I2.g) this.f15572b.f15581i.get(), (v) this.f15572b.f15580h.get());
                    case 7:
                        return new I2.g((A) this.f15572b.f15578f.get());
                    case 8:
                        AppDatabase appDatabase5 = (AppDatabase) this.f15572b.f15579g.get();
                        AbstractC1276k.f(appDatabase5, "database");
                        LLMProviderDao k3 = appDatabase5.k();
                        AbstractC1121e.f(k3);
                        return new C0720i(k3);
                    case AbstractC1787b.f15287d /* 9 */:
                        return new L((F2.i) this.f15572b.f15577e.get(), (C0720i) this.f15572b.f15583k.get());
                    case AbstractC1787b.f15289f /* 10 */:
                        AppDatabase appDatabase6 = (AppDatabase) this.f15572b.f15579g.get();
                        AbstractC1276k.f(appDatabase6, "database");
                        McpServerDao m3 = appDatabase6.m();
                        AbstractC1121e.f(m3);
                        return new x(m3);
                    case 11:
                        return new M((MMKV) this.f15572b.f15575c.get());
                    case 12:
                        return new O2.d((I2.g) this.f15572b.f15581i.get(), (C0720i) this.f15572b.f15583k.get(), (L) this.f15572b.f15584l.get());
                    case 13:
                        return new O2.a((v) this.f15572b.f15580h.get());
                    case 14:
                        return new Object();
                    case 15:
                        AppDatabase appDatabase7 = (AppDatabase) this.f15572b.f15579g.get();
                        AbstractC1276k.f(appDatabase7, "database");
                        LLMSettingDao l3 = appDatabase7.l();
                        AbstractC1121e.f(l3);
                        return new W(l3);
                    default:
                        throw new AssertionError(this.f15573c);
                }
            default:
                C1871g c1871g3 = this.f15572b;
                L1.e eVar = c1871g3.a;
                int i6 = this.f15573c;
                switch (i6) {
                    case 0:
                        c0692g = new C0692g((v) c1871g3.f15580h.get());
                        break;
                    case 1:
                        return new X2.L((v) c1871g3.f15580h.get(), (t) c1871g3.f15582j.get(), (F2.i) c1871g3.f15577e.get(), (C0720i) c1871g3.f15583k.get(), (A) c1871g3.f15578f.get(), (L) c1871g3.f15584l.get(), (x) c1871g3.f15585m.get(), (M) c1871g3.f15586n.get(), (O2.d) c1871g3.f15587o.get(), (O2.a) c1871g3.f15588p.get(), (V2.a) c1871g3.f15589q.get(), eVar.a);
                    case 2:
                        c0692g = new C0818g((x) c1871g3.f15585m.get());
                        break;
                    case 3:
                        c0692g = new w((W) c1871g3.f15590r.get(), (L) c1871g3.f15584l.get(), (C0720i) c1871g3.f15583k.get(), (A) c1871g3.f15578f.get());
                        break;
                    case 4:
                        c0692g = new C0808F((C0720i) c1871g3.f15583k.get(), (L) c1871g3.f15584l.get());
                        break;
                    case AbstractC1787b.f15290g /* 5 */:
                        c0692g = new C0811I((M) c1871g3.f15586n.get());
                        break;
                    case 6:
                        return new Y(eVar.a);
                    default:
                        throw new AssertionError(i6);
                }
                return c0692g;
        }
    }
}
