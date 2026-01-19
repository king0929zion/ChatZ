package I0;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class Q0 implements H0.s0 {

    /* renamed from: c, reason: collision with root package name */
    public final int f2235c;

    /* renamed from: e, reason: collision with root package name */
    public final List f2236e;

    /* renamed from: f, reason: collision with root package name */
    public Float f2237f = null;

    /* renamed from: g, reason: collision with root package name */
    public Float f2238g = null;

    /* renamed from: h, reason: collision with root package name */
    public P0.j f2239h = null;

    /* renamed from: i, reason: collision with root package name */
    public P0.j f2240i = null;

    public Q0(int i6, ArrayList arrayList) {
        this.f2235c = i6;
        this.f2236e = arrayList;
    }

    @Override // H0.s0
    public final boolean u() {
        return this.f2236e.contains(this);
    }
}
