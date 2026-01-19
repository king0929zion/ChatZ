package W0;

import a1.AbstractC0800h;
import b4.C0911i;
import i4.AbstractC1117a;
import x4.AbstractC1888A;
import x4.g0;
import y4.C1998d;

/* loaded from: classes.dex */
public final class f implements d {
    public final F2.h a;

    /* renamed from: b, reason: collision with root package name */
    public final a f8827b;

    /* renamed from: c, reason: collision with root package name */
    public final M.q f8828c;

    /* renamed from: d, reason: collision with root package name */
    public final h f8829d;

    /* renamed from: e, reason: collision with root package name */
    public final A3.c f8830e;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, W0.h] */
    public f(F2.h hVar, a aVar) {
        M.q qVar = g.a;
        M.q qVar2 = g.a;
        ?? obj = new Object();
        N3.k kVar = h.a;
        C1998d c1998d = AbstractC0800h.a;
        kVar.getClass();
        AbstractC1888A.c(Y4.d.P(kVar, c1998d).Y(C0911i.f11057c).Y(new g0(null)));
        A3.c cVar = new A3.c(25, (byte) 0);
        this.a = hVar;
        this.f8827b = aVar;
        this.f8828c = qVar;
        this.f8829d = obj;
        this.f8830e = cVar;
        new e(this, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0086 A[Catch: Exception -> 0x008e, TRY_ENTER, TryCatch #1 {Exception -> 0x008e, blocks: (B:15:0x0028, B:17:0x003b, B:20:0x0040, B:22:0x0044, B:23:0x005d, B:39:0x0086, B:40:0x008d, B:43:0x004d, B:44:0x004f, B:45:0x0052, B:46:0x0058), top: B:14:0x0028 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final W0.r a(W0.q r7) {
        /*
            r6 = this;
            M.q r0 = r6.f8828c
            java.lang.Object r1 = r0.f3179e
            F2.h r1 = (F2.h) r1
            monitor-enter(r1)
            java.lang.Object r2 = r0.f3180f     // Catch: java.lang.Throwable -> L24
            k.w r2 = (k.C1175w) r2     // Catch: java.lang.Throwable -> L24
            java.lang.Object r2 = r2.b(r7)     // Catch: java.lang.Throwable -> L24
            W0.r r2 = (W0.r) r2     // Catch: java.lang.Throwable -> L24
            if (r2 == 0) goto L27
            boolean r3 = r2.f8850e     // Catch: java.lang.Throwable -> L24
            if (r3 == 0) goto L19
            monitor-exit(r1)
            return r2
        L19:
            java.lang.Object r2 = r0.f3180f     // Catch: java.lang.Throwable -> L24
            k.w r2 = (k.C1175w) r2     // Catch: java.lang.Throwable -> L24
            java.lang.Object r2 = r2.d(r7)     // Catch: java.lang.Throwable -> L24
            W0.r r2 = (W0.r) r2     // Catch: java.lang.Throwable -> L24
            goto L27
        L24:
            r7 = move-exception
            goto L97
        L27:
            monitor-exit(r1)
            W0.h r1 = r6.f8829d     // Catch: java.lang.Exception -> L8e
            r1.getClass()     // Catch: java.lang.Exception -> L8e
            W0.p r1 = r7.a     // Catch: java.lang.Exception -> L8e
            A3.c r2 = r6.f8830e     // Catch: java.lang.Exception -> L8e
            java.lang.Object r2 = r2.f119e     // Catch: java.lang.Exception -> L8e
            F2.h r2 = (F2.h) r2     // Catch: java.lang.Exception -> L8e
            int r3 = r7.f8846c     // Catch: java.lang.Exception -> L8e
            W0.k r4 = r7.f8845b     // Catch: java.lang.Exception -> L8e
            if (r1 == 0) goto L4d
            boolean r5 = r1 instanceof W0.b     // Catch: java.lang.Exception -> L8e
            if (r5 == 0) goto L40
            goto L4d
        L40:
            boolean r5 = r1 instanceof W0.m     // Catch: java.lang.Exception -> L8e
            if (r5 == 0) goto L4b
            W0.m r1 = (W0.m) r1     // Catch: java.lang.Exception -> L8e
            android.graphics.Typeface r1 = r2.i(r1, r4, r3)     // Catch: java.lang.Exception -> L8e
            goto L5d
        L4b:
            r1 = 0
            goto L63
        L4d:
            int r1 = r2.f1567c     // Catch: java.lang.Exception -> L8e
            switch(r1) {
                case 20: goto L58;
                default: goto L52;
            }     // Catch: java.lang.Exception -> L8e
        L52:
            r1 = 0
            android.graphics.Typeface r1 = F2.h.h(r1, r4, r3)     // Catch: java.lang.Exception -> L8e
            goto L5d
        L58:
            r1 = 0
            android.graphics.Typeface r1 = F2.h.g(r1, r4, r3)     // Catch: java.lang.Exception -> L8e
        L5d:
            W0.r r2 = new W0.r     // Catch: java.lang.Exception -> L8e
            r2.<init>(r1)     // Catch: java.lang.Exception -> L8e
            r1 = r2
        L63:
            if (r1 == 0) goto L86
            java.lang.Object r2 = r0.f3179e
            F2.h r2 = (F2.h) r2
            monitor-enter(r2)
            java.lang.Object r3 = r0.f3180f     // Catch: java.lang.Throwable -> L80
            k.w r3 = (k.C1175w) r3     // Catch: java.lang.Throwable -> L80
            java.lang.Object r3 = r3.b(r7)     // Catch: java.lang.Throwable -> L80
            if (r3 != 0) goto L82
            boolean r3 = r1.f8850e     // Catch: java.lang.Throwable -> L80
            if (r3 == 0) goto L82
            java.lang.Object r0 = r0.f3180f     // Catch: java.lang.Throwable -> L80
            k.w r0 = (k.C1175w) r0     // Catch: java.lang.Throwable -> L80
            r0.c(r7, r1)     // Catch: java.lang.Throwable -> L80
            goto L82
        L80:
            r7 = move-exception
            goto L84
        L82:
            monitor-exit(r2)
            return r1
        L84:
            monitor-exit(r2)
            throw r7
        L86:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> L8e
            java.lang.String r0 = "Could not load font"
            r7.<init>(r0)     // Catch: java.lang.Exception -> L8e
            throw r7     // Catch: java.lang.Exception -> L8e
        L8e:
            r7 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Could not load font"
            r0.<init>(r1, r7)
            throw r0
        L97:
            monitor-exit(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: W0.f.a(W0.q):W0.r");
    }

    public final r b(p pVar, k kVar, int i6, int i7) {
        a aVar = this.f8827b;
        aVar.getClass();
        int i8 = aVar.f8824c;
        k kVar2 = (i8 == 0 || i8 == Integer.MAX_VALUE) ? kVar : new k(AbstractC1117a.f(kVar.f8840c + i8, 1, 1000));
        this.a.getClass();
        return a(new q(pVar, kVar2, i6, i7, null));
    }
}
