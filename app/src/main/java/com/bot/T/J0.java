package T;

import g0.InterfaceC1015c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import k.C1147A;
import m4.AbstractC1276k;
import n4.InterfaceC1372a;

/* loaded from: classes.dex */
public final class J0 implements InterfaceC1015c, Iterable, InterfaceC1372a {

    /* renamed from: e, reason: collision with root package name */
    public int f7967e;

    /* renamed from: g, reason: collision with root package name */
    public int f7969g;

    /* renamed from: h, reason: collision with root package name */
    public int f7970h;

    /* renamed from: j, reason: collision with root package name */
    public boolean f7972j;

    /* renamed from: k, reason: collision with root package name */
    public int f7973k;

    /* renamed from: m, reason: collision with root package name */
    public HashMap f7975m;

    /* renamed from: n, reason: collision with root package name */
    public C1147A f7976n;

    /* renamed from: c, reason: collision with root package name */
    public int[] f7966c = new int[0];

    /* renamed from: f, reason: collision with root package name */
    public Object[] f7968f = new Object[0];

    /* renamed from: i, reason: collision with root package name */
    public final Object f7971i = new Object();

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f7974l = new ArrayList();

    public final int a(C0594a c0594a) {
        if (this.f7972j) {
            AbstractC0629s.a("Use active SlotWriter to determine anchor location instead");
        }
        if (!c0594a.a()) {
            AbstractC0619m0.a("Anchor refers to a group that was removed");
        }
        return c0594a.a;
    }

    public final void b() {
        this.f7975m = new HashMap();
    }

    public final I0 c() {
        if (this.f7972j) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.f7970h++;
        return new I0(this);
    }

    public final M0 d() {
        if (this.f7972j) {
            AbstractC0629s.a("Cannot start a writer when another writer is pending");
        }
        if (this.f7970h > 0) {
            AbstractC0629s.a("Cannot start a writer when a reader is pending");
        }
        this.f7972j = true;
        this.f7973k++;
        return new M0(this);
    }

    public final boolean e(C0594a c0594a) {
        int e6;
        return c0594a.a() && (e6 = L0.e(this.f7974l, c0594a.a, this.f7967e)) >= 0 && AbstractC1276k.b(this.f7974l.get(e6), c0594a);
    }

    public final M f(int i6) {
        int i7;
        ArrayList arrayList;
        int e6;
        HashMap hashMap = this.f7975m;
        if (hashMap != null) {
            if (this.f7972j) {
                AbstractC0629s.a("use active SlotWriter to crate an anchor for location instead");
            }
            C0594a c0594a = (i6 < 0 || i6 >= (i7 = this.f7967e) || (e6 = L0.e((arrayList = this.f7974l), i6, i7)) < 0) ? null : (C0594a) arrayList.get(e6);
            if (c0594a != null) {
                return (M) hashMap.get(c0594a);
            }
        }
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new L(this, 0, this.f7967e);
    }
}
