package j;

import java.util.Iterator;

/* renamed from: j.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1133d extends AbstractC1134e implements Iterator {

    /* renamed from: c, reason: collision with root package name */
    public C1132c f12312c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f12313e = true;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1130a f12314f;

    public C1133d(C1130a c1130a) {
        this.f12314f = c1130a;
    }

    @Override // j.AbstractC1134e
    public final void a(C1132c c1132c) {
        C1132c c1132c2 = this.f12312c;
        if (c1132c == c1132c2) {
            C1132c c1132c3 = c1132c2.f12311g;
            this.f12312c = c1132c3;
            this.f12313e = c1132c3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f12313e) {
            return this.f12314f.f12300c != null;
        }
        C1132c c1132c = this.f12312c;
        return (c1132c == null || c1132c.f12310f == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f12313e) {
            this.f12313e = false;
            this.f12312c = this.f12314f.f12300c;
        } else {
            C1132c c1132c = this.f12312c;
            this.f12312c = c1132c != null ? c1132c.f12310f : null;
        }
        return this.f12312c;
    }
}
