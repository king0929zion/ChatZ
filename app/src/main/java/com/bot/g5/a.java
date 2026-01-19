package g5;

import h5.c;
import java.util.Queue;

/* loaded from: classes.dex */
public final class a implements f5.a {

    /* renamed from: c, reason: collision with root package name */
    public String f11776c;

    /* renamed from: e, reason: collision with root package name */
    public c f11777e;

    /* renamed from: f, reason: collision with root package name */
    public Queue f11778f;

    @Override // f5.a
    public final void a() {
        d();
    }

    @Override // f5.a
    public final void b(String str) {
        d();
    }

    @Override // f5.a
    public final void c(String str) {
        d();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, g5.b] */
    public final void d() {
        Object obj = new Object();
        System.currentTimeMillis();
        obj.a = this.f11777e;
        Thread.currentThread().getName();
        this.f11778f.add(obj);
    }

    @Override // f5.a
    public final String getName() {
        return this.f11776c;
    }
}
