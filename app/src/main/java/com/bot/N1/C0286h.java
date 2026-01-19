package N1;

import D.P0;
import com.bot.core.database.data.AppDatabase_Impl;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import m4.AbstractC1276k;

/* renamed from: N1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0286h {
    public final AppDatabase_Impl a;

    /* renamed from: b, reason: collision with root package name */
    public final Q f3744b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f3745c;

    /* renamed from: d, reason: collision with root package name */
    public final ReentrantLock f3746d;

    /* renamed from: e, reason: collision with root package name */
    public final C0285g f3747e;

    /* renamed from: f, reason: collision with root package name */
    public final C0285g f3748f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f3749g;

    public C0286h(AppDatabase_Impl appDatabase_Impl, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String... strArr) {
        this.a = appDatabase_Impl;
        Q q3 = new Q(appDatabase_Impl, linkedHashMap, linkedHashMap2, strArr, appDatabase_Impl.f3794i, new P0(1, this, C0286h.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0, 0, 3));
        this.f3744b = q3;
        this.f3745c = new LinkedHashMap();
        this.f3746d = new ReentrantLock();
        this.f3747e = new C0285g(this, 0);
        this.f3748f = new C0285g(this, 1);
        AbstractC1276k.e(Collections.newSetFromMap(new IdentityHashMap()), "newSetFromMap(...)");
        this.f3749g = new Object();
        q3.f3718k = new C0285g(this, 2);
    }
}
