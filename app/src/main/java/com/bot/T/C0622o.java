package T;

import b0.C0878k;
import b4.InterfaceC0910h;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import m4.AbstractC1276k;
import m4.AbstractC1291z;
import n4.InterfaceC1372a;
import n4.InterfaceC1373b;

/* renamed from: T.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0622o extends AbstractC0633u {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8133b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8134c;

    /* renamed from: d, reason: collision with root package name */
    public HashSet f8135d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f8136e = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public final C0607g0 f8137f = new C0607g0(C0878k.f10988g, C0602e.f8081h);

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0626q f8138g;

    public C0622o(C0626q c0626q, long j3, boolean z5, boolean z6, A3.c cVar) {
        this.f8138g = c0626q;
        this.a = j3;
        this.f8133b = z5;
        this.f8134c = z6;
    }

    @Override // T.AbstractC0633u
    public final void a(C0639x c0639x, l4.e eVar) {
        this.f8138g.f8166b.a(c0639x, eVar);
    }

    @Override // T.AbstractC0633u
    public final k.N b(C0639x c0639x, G0 g02, l4.e eVar) {
        return this.f8138g.f8166b.b(c0639x, g02, eVar);
    }

    @Override // T.AbstractC0633u
    public final void c() {
        C0626q c0626q = this.f8138g;
        c0626q.f8145A--;
    }

    @Override // T.AbstractC0633u
    public final boolean d() {
        return this.f8138g.f8166b.d();
    }

    @Override // T.AbstractC0633u
    public final boolean e() {
        return this.f8133b;
    }

    @Override // T.AbstractC0633u
    public final boolean f() {
        return this.f8134c;
    }

    @Override // T.AbstractC0633u
    public final long g() {
        return this.a;
    }

    @Override // T.AbstractC0633u
    public final InterfaceC0631t h() {
        return this.f8138g.f8172h;
    }

    @Override // T.AbstractC0633u
    public final InterfaceC0617l0 i() {
        return (InterfaceC0617l0) this.f8137f.getValue();
    }

    @Override // T.AbstractC0633u
    public final InterfaceC0910h j() {
        return this.f8138g.f8166b.j();
    }

    @Override // T.AbstractC0633u
    public final boolean k() {
        return this.f8138g.f8166b.k();
    }

    @Override // T.AbstractC0633u
    public final void l(C0639x c0639x) {
        C0626q c0626q = this.f8138g;
        c0626q.f8166b.l(c0626q.f8172h);
        c0626q.f8166b.l(c0639x);
    }

    @Override // T.AbstractC0633u
    public final V m(W w5) {
        return this.f8138g.f8166b.m(w5);
    }

    @Override // T.AbstractC0633u
    public final k.N n(C0639x c0639x, G0 g02, k.N n3) {
        return this.f8138g.f8166b.n(c0639x, g02, n3);
    }

    @Override // T.AbstractC0633u
    public final void o(Set set) {
        HashSet hashSet = this.f8135d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.f8135d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // T.AbstractC0633u
    public final void p(C0626q c0626q) {
        this.f8136e.add(c0626q);
    }

    @Override // T.AbstractC0633u
    public final void q(C0627q0 c0627q0) {
        this.f8138g.f8166b.q(c0627q0);
    }

    @Override // T.AbstractC0633u
    public final void r(C0639x c0639x) {
        this.f8138g.f8166b.r(c0639x);
    }

    @Override // T.AbstractC0633u
    public final InterfaceC0604f s(A0.b bVar) {
        return this.f8138g.f8166b.s(bVar);
    }

    @Override // T.AbstractC0633u
    public final void t() {
        this.f8138g.f8145A++;
    }

    @Override // T.AbstractC0633u
    public final void u(C0626q c0626q) {
        HashSet hashSet = this.f8135d;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Set set = (Set) it.next();
                AbstractC1276k.d(c0626q, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
                set.remove(c0626q.y());
            }
        }
        LinkedHashSet linkedHashSet = this.f8136e;
        if (!(linkedHashSet instanceof InterfaceC1372a) || (linkedHashSet instanceof InterfaceC1373b)) {
            linkedHashSet.remove(c0626q);
        } else {
            AbstractC1291z.f(linkedHashSet, "kotlin.collections.MutableCollection");
            throw null;
        }
    }

    @Override // T.AbstractC0633u
    public final void v(C0639x c0639x) {
        this.f8138g.f8166b.v(c0639x);
    }

    public final void w() {
        LinkedHashSet<C0626q> linkedHashSet = this.f8136e;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        HashSet hashSet = this.f8135d;
        if (hashSet != null) {
            for (C0626q c0626q : linkedHashSet) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(c0626q.y());
                }
            }
        }
        linkedHashSet.clear();
    }
}
