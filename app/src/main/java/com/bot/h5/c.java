package h5;

import java.lang.reflect.Method;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes.dex */
public final class c implements f5.a {

    /* renamed from: c, reason: collision with root package name */
    public final String f11921c;

    /* renamed from: e, reason: collision with root package name */
    public volatile f5.a f11922e;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f11923f;

    /* renamed from: g, reason: collision with root package name */
    public Method f11924g;

    /* renamed from: h, reason: collision with root package name */
    public g5.a f11925h;

    /* renamed from: i, reason: collision with root package name */
    public final Queue f11926i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f11927j;

    public c(String str, LinkedBlockingQueue linkedBlockingQueue, boolean z5) {
        this.f11921c = str;
        this.f11926i = linkedBlockingQueue;
        this.f11927j = z5;
    }

    @Override // f5.a
    public final void a() {
        d().a();
    }

    @Override // f5.a
    public final void b(String str) {
        d().b(str);
    }

    @Override // f5.a
    public final void c(String str) {
        d().c(str);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, g5.a] */
    public final f5.a d() {
        if (this.f11922e != null) {
            return this.f11922e;
        }
        if (this.f11927j) {
            return a.f11920c;
        }
        if (this.f11925h == null) {
            Queue queue = this.f11926i;
            Object obj = new Object();
            obj.f11777e = this;
            obj.f11776c = this.f11921c;
            obj.f11778f = queue;
            this.f11925h = obj;
        }
        return this.f11925h;
    }

    public final boolean e() {
        Boolean bool = this.f11923f;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.f11924g = this.f11922e.getClass().getMethod("log", g5.b.class);
            this.f11923f = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.f11923f = Boolean.FALSE;
        }
        return this.f11923f.booleanValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && c.class == obj.getClass() && this.f11921c.equals(((c) obj).f11921c);
    }

    @Override // f5.a
    public final String getName() {
        return this.f11921c;
    }

    public final int hashCode() {
        return this.f11921c.hashCode();
    }
}
