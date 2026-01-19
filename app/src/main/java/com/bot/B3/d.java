package B3;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import u4.AbstractC1776n;
import x4.AbstractC1888A;
import x4.g0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f514f = AtomicIntegerFieldUpdater.newUpdater(d.class, "requestLogged");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f515g = AtomicIntegerFieldUpdater.newUpdater(d.class, "responseLogged");
    public final g a;

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f516b = new StringBuilder();

    /* renamed from: c, reason: collision with root package name */
    public final StringBuilder f517c = new StringBuilder();

    /* renamed from: d, reason: collision with root package name */
    public final g0 f518d = AbstractC1888A.d();

    /* renamed from: e, reason: collision with root package name */
    public final g0 f519e = AbstractC1888A.d();
    private volatile /* synthetic */ int requestLogged = 0;
    private volatile /* synthetic */ int responseLogged = 0;

    public d(g gVar) {
        this.a = gVar;
    }

    public final void a() {
        g0 g0Var = this.f518d;
        if (f514f.compareAndSet(this, 0, 1)) {
            try {
                String obj = AbstractC1776n.l0(this.f516b).toString();
                if (obj.length() > 0) {
                    this.a.k(obj);
                }
            } finally {
                g0Var.n0();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(d4.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof B3.a
            if (r0 == 0) goto L13
            r0 = r5
            B3.a r0 = (B3.a) r0
            int r1 = r0.f503j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f503j = r1
            goto L18
        L13:
            B3.a r0 = new B3.a
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f501h
            int r1 = r0.f503j
            X3.y r2 = X3.y.a
            r3 = 1
            if (r1 == 0) goto L31
            if (r1 != r3) goto L29
            B3.d r0 = r0.f500g
            X3.a.e(r5)
            goto L4e
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            X3.a.e(r5)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = B3.d.f515g
            r1 = 0
            boolean r5 = r5.compareAndSet(r4, r1, r3)
            if (r5 != 0) goto L3e
            goto L63
        L3e:
            r0.f500g = r4
            r0.f503j = r3
            x4.g0 r5 = r4.f518d
            java.lang.Object r5 = r5.Q(r0)
            c4.a r0 = c4.EnumC0927a.f11114c
            if (r5 != r0) goto L4d
            return r0
        L4d:
            r0 = r4
        L4e:
            java.lang.StringBuilder r5 = r0.f517c
            java.lang.CharSequence r5 = u4.AbstractC1776n.l0(r5)
            java.lang.String r5 = r5.toString()
            int r1 = r5.length()
            if (r1 <= 0) goto L63
            B3.g r0 = r0.a
            r0.k(r5)
        L63:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: B3.d.b(d4.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r5, d4.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof B3.b
            if (r0 == 0) goto L13
            r0 = r6
            B3.b r0 = (B3.b) r0
            int r1 = r0.f508k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f508k = r1
            goto L18
        L13:
            B3.b r0 = new B3.b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f506i
            int r1 = r0.f508k
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            java.lang.String r5 = r0.f505h
            B3.d r0 = r0.f504g
            X3.a.e(r6)
            goto L46
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            X3.a.e(r6)
            r0.f504g = r4
            r0.f505h = r5
            r0.f508k = r2
            x4.g0 r6 = r4.f519e
            java.lang.Object r6 = r6.Q(r0)
            c4.a r0 = c4.EnumC0927a.f11114c
            if (r6 != r0) goto L45
            return r0
        L45:
            r0 = r4
        L46:
            java.lang.StringBuilder r6 = r0.f517c
            r6.append(r5)
            X3.y r5 = X3.y.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: B3.d.c(java.lang.String, d4.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r5, d4.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof B3.c
            if (r0 == 0) goto L13
            r0 = r6
            B3.c r0 = (B3.c) r0
            int r1 = r0.f513k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f513k = r1
            goto L18
        L13:
            B3.c r0 = new B3.c
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f511i
            int r1 = r0.f513k
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            java.lang.String r5 = r0.f510h
            B3.d r0 = r0.f509g
            X3.a.e(r6)
            goto L46
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            X3.a.e(r6)
            r0.f509g = r4
            r0.f510h = r5
            r0.f513k = r2
            x4.g0 r6 = r4.f518d
            java.lang.Object r6 = r6.Q(r0)
            c4.a r0 = c4.EnumC0927a.f11114c
            if (r6 != r0) goto L45
            return r0
        L45:
            r0 = r4
        L46:
            B3.g r6 = r0.a
            java.lang.CharSequence r5 = u4.AbstractC1776n.l0(r5)
            java.lang.String r5 = r5.toString()
            r6.k(r5)
            X3.y r5 = X3.y.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: B3.d.d(java.lang.String, d4.c):java.lang.Object");
    }

    public final void e(String str) {
        String obj = AbstractC1776n.l0(str).toString();
        StringBuilder sb = this.f517c;
        sb.append(obj);
        sb.append('\n');
        this.f519e.n0();
    }
}
