package N1;

import b4.InterfaceC0910h;
import i4.AbstractC1117a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import m4.AbstractC1276k;
import s4.InterfaceC1672b;

/* loaded from: classes.dex */
public abstract class v {
    public static final t Companion = new Object();
    public C4.c a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0910h f3787b;

    /* renamed from: c, reason: collision with root package name */
    public Executor f3788c;

    /* renamed from: d, reason: collision with root package name */
    public z f3789d;

    /* renamed from: e, reason: collision with root package name */
    public r f3790e;

    /* renamed from: f, reason: collision with root package name */
    public C0286h f3791f;

    /* renamed from: g, reason: collision with root package name */
    public final M.q f3792g = new M.q(new I.o(0, this, v.class, "onClosed", "onClosed()V", 0, 0, 2));

    /* renamed from: h, reason: collision with root package name */
    public final LinkedHashMap f3793h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3794i;

    public v() {
        new ThreadLocal();
        this.f3793h = new LinkedHashMap();
        this.f3794i = true;
    }

    public List a(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(Y3.C.H(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(AbstractC1117a.o((InterfaceC1672b) entry.getKey()), entry.getValue());
        }
        return Y3.v.f9812c;
    }

    public abstract C0286h b();

    public w c() {
        throw new X3.h();
    }

    public final C0286h d() {
        C0286h c0286h = this.f3791f;
        if (c0286h != null) {
            return c0286h;
        }
        AbstractC1276k.k("internalTracker");
        throw null;
    }

    public Set e() {
        return Y3.m.N0(new ArrayList(Y3.n.Z(Y3.x.f9814c, 10)));
    }

    public LinkedHashMap f() {
        int H3 = Y3.C.H(Y3.n.Z(Y3.x.f9814c, 10));
        if (H3 < 16) {
            H3 = 16;
        }
        return new LinkedHashMap(H3);
    }

    public final boolean g() {
        r rVar = this.f3790e;
        if (rVar != null) {
            return rVar.c() != null;
        }
        AbstractC1276k.k("connectionManager");
        throw null;
    }

    public final boolean h() {
        r rVar = this.f3790e;
        if (rVar == null) {
            AbstractC1276k.k("connectionManager");
            throw null;
        }
        Y1.a aVar = rVar.f3766g;
        if (aVar != null) {
            return aVar.isOpen();
        }
        return false;
    }

    public final Object i(boolean z5, l4.e eVar, d4.c cVar) {
        r rVar = this.f3790e;
        if (rVar != null) {
            return rVar.f3765f.l(z5, eVar, cVar);
        }
        AbstractC1276k.k("connectionManager");
        throw null;
    }
}
