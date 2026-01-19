package k;

import l.AbstractC1180a;
import m4.AbstractC1276k;

/* renamed from: k.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1175w {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final F1.e f12578b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.lifecycle.N f12579c;

    /* renamed from: d, reason: collision with root package name */
    public int f12580d;

    /* renamed from: e, reason: collision with root package name */
    public int f12581e;

    /* renamed from: f, reason: collision with root package name */
    public int f12582f;

    public C1175w(int i6) {
        this.a = i6;
        if (i6 <= 0) {
            AbstractC1180a.c("maxSize <= 0");
            throw null;
        }
        this.f12578b = new F1.e(3);
        this.f12579c = new androidx.lifecycle.N(13);
    }

    public void a(Object obj, Object obj2, Object obj3) {
        AbstractC1276k.f(obj, "key");
        AbstractC1276k.f(obj2, "oldValue");
    }

    public final Object b(Object obj) {
        AbstractC1276k.f(obj, "key");
        synchronized (this.f12579c) {
            F1.e eVar = this.f12578b;
            eVar.getClass();
            Object obj2 = eVar.a.get(obj);
            if (obj2 != null) {
                this.f12581e++;
                return obj2;
            }
            this.f12582f++;
            return null;
        }
    }

    public final Object c(Object obj, Object obj2) {
        Object put;
        AbstractC1276k.f(obj, "key");
        synchronized (this.f12579c) {
            this.f12580d += e(obj, obj2);
            F1.e eVar = this.f12578b;
            eVar.getClass();
            put = eVar.a.put(obj, obj2);
            if (put != null) {
                this.f12580d -= e(obj, put);
            }
        }
        if (put != null) {
            a(obj, put, obj2);
        }
        g(this.a);
        return put;
    }

    public final Object d(Object obj) {
        Object remove;
        synchronized (this.f12579c) {
            F1.e eVar = this.f12578b;
            eVar.getClass();
            remove = eVar.a.remove(obj);
            if (remove != null) {
                this.f12580d -= e(obj, remove);
            }
        }
        if (remove != null) {
            a(obj, remove, null);
        }
        return remove;
    }

    public final int e(Object obj, Object obj2) {
        int f6 = f(obj, obj2);
        if (f6 >= 0) {
            return f6;
        }
        String str = "Negative size: " + obj + '=' + obj2;
        AbstractC1276k.f(str, "message");
        throw new IllegalStateException(str);
    }

    public int f(Object obj, Object obj2) {
        AbstractC1276k.f(obj, "key");
        AbstractC1276k.f(obj2, "value");
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006f, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0067, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(int r6) {
        /*
            r5 = this;
        L0:
            androidx.lifecycle.N r0 = r5.f12579c
            monitor-enter(r0)
            int r1 = r5.f12580d     // Catch: java.lang.Throwable -> L16
            if (r1 < 0) goto L68
            F1.e r1 = r5.f12578b     // Catch: java.lang.Throwable -> L16
            java.util.LinkedHashMap r1 = r1.a     // Catch: java.lang.Throwable -> L16
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L18
            int r1 = r5.f12580d     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L68
            goto L18
        L16:
            r6 = move-exception
            goto L70
        L18:
            int r1 = r5.f12580d     // Catch: java.lang.Throwable -> L16
            if (r1 <= r6) goto L66
            F1.e r1 = r5.f12578b     // Catch: java.lang.Throwable -> L16
            java.util.LinkedHashMap r1 = r1.a     // Catch: java.lang.Throwable -> L16
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L27
            goto L66
        L27:
            F1.e r1 = r5.f12578b     // Catch: java.lang.Throwable -> L16
            java.util.LinkedHashMap r1 = r1.a     // Catch: java.lang.Throwable -> L16
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L16
            java.lang.String r2 = "<get-entries>(...)"
            m4.AbstractC1276k.e(r1, r2)     // Catch: java.lang.Throwable -> L16
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L16
            java.lang.Object r1 = Y3.m.p0(r1)     // Catch: java.lang.Throwable -> L16
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L40
            monitor-exit(r0)
            return
        L40:
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L16
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L16
            F1.e r3 = r5.f12578b     // Catch: java.lang.Throwable -> L16
            r3.getClass()     // Catch: java.lang.Throwable -> L16
            java.lang.String r4 = "key"
            m4.AbstractC1276k.f(r2, r4)     // Catch: java.lang.Throwable -> L16
            java.util.LinkedHashMap r3 = r3.a     // Catch: java.lang.Throwable -> L16
            r3.remove(r2)     // Catch: java.lang.Throwable -> L16
            int r3 = r5.f12580d     // Catch: java.lang.Throwable -> L16
            int r4 = r5.e(r2, r1)     // Catch: java.lang.Throwable -> L16
            int r3 = r3 - r4
            r5.f12580d = r3     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)
            r0 = 0
            r5.a(r2, r1, r0)
            goto L0
        L66:
            monitor-exit(r0)
            return
        L68:
            java.lang.String r6 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L16
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L16
            throw r1     // Catch: java.lang.Throwable -> L16
        L70:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: k.C1175w.g(int):void");
    }

    public final String toString() {
        String str;
        synchronized (this.f12579c) {
            try {
                int i6 = this.f12581e;
                int i7 = this.f12582f + i6;
                str = "LruCache[maxSize=" + this.a + ",hits=" + this.f12581e + ",misses=" + this.f12582f + ",hitRate=" + (i7 != 0 ? (i6 * 100) / i7 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
