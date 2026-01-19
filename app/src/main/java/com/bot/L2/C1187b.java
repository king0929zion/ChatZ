package l2;

import java.io.Closeable;
import u4.C1774l;

/* renamed from: l2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1187b implements Closeable {

    /* renamed from: c, reason: collision with root package name */
    public final C1186a f12684c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f12685e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1190e f12686f;

    public C1187b(C1190e c1190e, C1186a c1186a) {
        this.f12686f = c1190e;
        this.f12684c = c1186a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f12685e) {
            return;
        }
        this.f12685e = true;
        C1190e c1190e = this.f12686f;
        synchronized (c1190e) {
            C1186a c1186a = this.f12684c;
            int i6 = c1186a.f12682h - 1;
            c1186a.f12682h = i6;
            if (i6 == 0 && c1186a.f12680f) {
                C1774l c1774l = C1190e.f12689t;
                c1190e.u(c1186a);
            }
        }
    }
}
