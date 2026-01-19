package W;

import Y3.AbstractC0737d;
import java.util.List;

/* loaded from: classes.dex */
public final class a extends AbstractC0737d {

    /* renamed from: c, reason: collision with root package name */
    public final X.c f8821c;

    /* renamed from: e, reason: collision with root package name */
    public final int f8822e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8823f;

    public a(X.c cVar, int i6, int i7) {
        this.f8821c = cVar;
        this.f8822e = i6;
        Y4.d.q(i6, i7, cVar.a());
        this.f8823f = i7 - i6;
    }

    @Override // Y3.AbstractC0734a
    public final int a() {
        return this.f8823f;
    }

    @Override // java.util.List
    public final Object get(int i6) {
        Y4.d.o(i6, this.f8823f);
        return this.f8821c.get(this.f8822e + i6);
    }

    @Override // Y3.AbstractC0737d, java.util.List
    public final List subList(int i6, int i7) {
        Y4.d.q(i6, i7, this.f8823f);
        int i8 = this.f8822e;
        return new a(this.f8821c, i6 + i8, i8 + i7);
    }
}
