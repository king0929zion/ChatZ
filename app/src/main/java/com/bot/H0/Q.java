package H0;

import F0.W;
import java.util.Map;

/* loaded from: classes.dex */
public final class Q implements F0.W {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1791b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f1792c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l4.c f1793d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l4.c f1794e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ S f1795f;

    public Q(int i6, int i7, Map map, l4.c cVar, l4.c cVar2, S s5) {
        this.a = i6;
        this.f1791b = i7;
        this.f1792c = map;
        this.f1793d = cVar;
        this.f1794e = cVar2;
        this.f1795f = s5;
    }

    @Override // F0.W
    public final Map b() {
        return this.f1792c;
    }

    @Override // F0.W
    public final void c() {
        this.f1794e.f(this.f1795f.f1802o);
    }

    @Override // F0.W
    public final int d() {
        return this.f1791b;
    }

    @Override // F0.W
    public final int e() {
        return this.a;
    }

    @Override // F0.W
    public final l4.c f() {
        return this.f1793d;
    }
}
