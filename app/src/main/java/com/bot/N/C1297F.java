package n;

import T.C0607g0;
import T.d1;

/* renamed from: n.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1297F implements d1 {

    /* renamed from: c, reason: collision with root package name */
    public Float f12989c;

    /* renamed from: e, reason: collision with root package name */
    public Float f12990e;

    /* renamed from: f, reason: collision with root package name */
    public final C0607g0 f12991f;

    /* renamed from: g, reason: collision with root package name */
    public o0 f12992g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f12993h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f12994i;

    /* renamed from: j, reason: collision with root package name */
    public long f12995j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C1300I f12996k;

    public C1297F(C1300I c1300i, Float f6, Float f7, C1296E c1296e) {
        E0 e02 = AbstractC1318d.f13114j;
        this.f12996k = c1300i;
        this.f12989c = f6;
        this.f12990e = f7;
        this.f12991f = T.r.A(f6);
        this.f12992g = new o0(c1296e, e02, this.f12989c, this.f12990e, null);
    }

    @Override // T.d1
    public final Object getValue() {
        return this.f12991f.getValue();
    }
}
