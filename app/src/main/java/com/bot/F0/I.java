package F0;

import H0.C0164t;
import java.util.Map;

/* loaded from: classes.dex */
public final class I implements W {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1419b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f1420c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l4.c f1421d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ J f1422e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Q f1423f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l4.c f1424g;

    public I(int i6, int i7, Map map, l4.c cVar, J j3, Q q3, l4.c cVar2) {
        this.a = i6;
        this.f1419b = i7;
        this.f1420c = map;
        this.f1421d = cVar;
        this.f1422e = j3;
        this.f1423f = q3;
        this.f1424g = cVar2;
    }

    @Override // F0.W
    public final Map b() {
        return this.f1420c;
    }

    @Override // F0.W
    public final void c() {
        C0164t c0164t;
        H0.J j3 = this.f1423f.f1442c;
        boolean d02 = this.f1422e.d0();
        l4.c cVar = this.f1424g;
        if (!d02 || (c0164t = j3.f1721J.f1916c.f2000W) == null) {
            cVar.f(j3.f1721J.f1916c.f1802o);
        } else {
            cVar.f(c0164t.f1802o);
        }
    }

    @Override // F0.W
    public final int d() {
        return this.f1419b;
    }

    @Override // F0.W
    public final int e() {
        return this.a;
    }

    @Override // F0.W
    public final l4.c f() {
        return this.f1421d;
    }
}
