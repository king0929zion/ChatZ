package com.bot;

import A4.g0;
import C4.c;
import E4.e;
import G2.d;
import I2.A;
import X3.a;
import X3.i;
import X3.n;
import Z2.C0782v0;
import android.app.Application;
import androidx.lifecycle.N;
import com.tencent.mmkv.MMKV;
import f0.C0987j;
import i2.C1107a;
import i2.C1108b;
import i2.C1115i;
import i4.AbstractC1117a;
import java.util.ArrayList;
import m4.AbstractC1276k;
import p3.f;
import r3.b;
import w2.C1838h;
import x2.C1865a;
import x2.C1871g;
import x2.InterfaceC1866b;
import x4.AbstractC1888A;
import x4.AbstractC1898K;
import x4.t0;

/* loaded from: classes.dex */
public final class BotApplication extends Application implements b {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f11125j = 0;

    /* renamed from: c, reason: collision with root package name */
    public boolean f11126c = false;

    /* renamed from: e, reason: collision with root package name */
    public final f f11127e = new f(new C0987j(this, 27));

    /* renamed from: f, reason: collision with root package name */
    public d f11128f;

    /* renamed from: g, reason: collision with root package name */
    public A f11129g;

    /* renamed from: h, reason: collision with root package name */
    public final c f11130h;

    /* renamed from: i, reason: collision with root package name */
    public final n f11131i;

    public BotApplication() {
        t0 e6 = AbstractC1888A.e();
        e eVar = AbstractC1898K.a;
        this.f11130h = AbstractC1888A.c(Y4.d.P(e6, E4.d.f1360f));
        this.f11131i = a.d(new C0782v0(25));
    }

    public final void a() {
        if (!this.f11126c) {
            this.f11126c = true;
            C1871g c1871g = (C1871g) ((InterfaceC1866b) this.f11127e.b());
            this.f11128f = (d) c1871g.f15576d.get();
            this.f11129g = (A) c1871g.f15578f.get();
        }
        super.onCreate();
    }

    @Override // r3.b
    public final Object b() {
        return this.f11127e.b();
    }

    @Override // android.app.Application
    public final void onCreate() {
        i5.a.a.getClass();
        N.v(new Object[0]);
        MMKV.initialize(this);
        a();
        N.v(new Object[0]);
        E1.b bVar = new E1.b(this);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        arrayList4.add(new i(new C2.c((t3.d) this.f11131i.getValue()), Object.class));
        bVar.f1293c = new C1108b(AbstractC1117a.v(arrayList), AbstractC1117a.v(arrayList2), AbstractC1117a.v(arrayList3), AbstractC1117a.v(arrayList4), AbstractC1117a.v(arrayList5));
        bVar.f1295e = new Object();
        C1838h c1838h = (C1838h) bVar.f1294d;
        bVar.f1294d = new C1838h(c1838h.a, c1838h.f15406b, false, c1838h.f15408d, c1838h.f15409e);
        C1115i i6 = bVar.i();
        synchronized (C1107a.class) {
            C1107a.f12051b = i6;
        }
        N.k(new Object[0]);
        N.v(new Object[0]);
        d dVar = this.f11128f;
        if (dVar == null) {
            AbstractC1276k.k("preferencesManager");
            throw null;
        }
        g0 g0Var = dVar.f1656e;
        if (g0Var.getValue() == G2.a.f1647f) {
            dVar.c();
        } else {
            dVar.a(((G2.a) g0Var.getValue()).f1652e);
        }
        N.k(new Object[0]);
        AbstractC1888A.y(this.f11130h, null, new C1865a(this, null), 3);
        N.k(new Object[0]);
    }

    @Override // android.app.Application
    public final void onTerminate() {
        super.onTerminate();
        ((t3.d) this.f11131i.getValue()).close();
        AbstractC1888A.i(this.f11130h.f686c, null);
    }
}
