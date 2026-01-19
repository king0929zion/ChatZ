package io.ktor.utils.io.jvm.javaio;

import x4.InterfaceC1922e0;

/* loaded from: classes.dex */
public final class g extends b {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h f12207g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(InterfaceC1922e0 interfaceC1922e0, h hVar) {
        super(interfaceC1922e0);
        this.f12207g = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // io.ktor.utils.io.jvm.javaio.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(d4.c r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof io.ktor.utils.io.jvm.javaio.f
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.utils.io.jvm.javaio.f r0 = (io.ktor.utils.io.jvm.javaio.f) r0
            int r1 = r0.f12206j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12206j = r1
            goto L18
        L13:
            io.ktor.utils.io.jvm.javaio.f r0 = new io.ktor.utils.io.jvm.javaio.f
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.f12204h
            c4.a r1 = c4.EnumC0927a.f11114c
            int r2 = r0.f12206j
            r3 = 1
            if (r2 == 0) goto L6a
            r4 = 2
            if (r2 == r3) goto L34
            if (r2 != r4) goto L2c
            io.ktor.utils.io.jvm.javaio.g r2 = r0.f12203g
            X3.a.e(r10)
            goto L55
        L2c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L34:
            io.ktor.utils.io.jvm.javaio.g r2 = r0.f12203g
            X3.a.e(r10)
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.ByteArray"
            m4.AbstractC1276k.d(r10, r5)
            byte[] r10 = (byte[]) r10
            io.ktor.utils.io.jvm.javaio.h r5 = r2.f12207g
            io.ktor.utils.io.y r5 = r5.f12208c
            int r6 = r2.f12198d
            int r7 = r2.f12199e
            r0.f12203g = r2
            r0.f12206j = r4
            io.ktor.utils.io.t r5 = (io.ktor.utils.io.t) r5
            java.lang.Object r10 = r5.w(r10, r6, r7, r0)
            if (r10 != r1) goto L55
            return r1
        L55:
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            r4 = -1
            if (r10 != r4) goto L6f
            io.ktor.utils.io.jvm.javaio.h r0 = r2.f12207g
            x4.g0 r0 = r0.f12209e
            r0.n0()
            r2.result = r10
            X3.y r10 = X3.y.a
            return r10
        L6a:
            X3.a.e(r10)
            r10 = 0
            r2 = r9
        L6f:
            r2.result = r10
            r0.f12203g = r2
            r0.f12206j = r3
            r10 = 0
        L76:
            java.lang.Object r3 = r2.state
            boolean r4 = r3 instanceof java.lang.Thread
            if (r4 == 0) goto L82
            b4.c r10 = Y4.d.K(r0)
            r4 = r3
            goto L8f
        L82:
            boolean r4 = m4.AbstractC1276k.b(r3, r2)
            if (r4 == 0) goto Lb1
            b4.c r4 = Y4.d.K(r0)
            r8 = r4
            r4 = r10
            r10 = r8
        L8f:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = io.ktor.utils.io.jvm.javaio.b.f12195f
        L91:
            boolean r6 = r5.compareAndSet(r2, r3, r10)
            if (r6 == 0) goto La9
            if (r4 == 0) goto La8
            java.lang.ThreadLocal r10 = io.ktor.utils.io.jvm.javaio.j.a
            java.lang.Object r10 = r10.get()
            io.ktor.utils.io.jvm.javaio.i r10 = (io.ktor.utils.io.jvm.javaio.i) r10
            if (r10 != 0) goto La5
            io.ktor.utils.io.jvm.javaio.e r10 = io.ktor.utils.io.jvm.javaio.e.f12201b
        La5:
            r10.b(r4)
        La8:
            return r1
        La9:
            java.lang.Object r6 = r5.get(r2)
            if (r6 == r3) goto L91
            r10 = r4
            goto L76
        Lb1:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already suspended or in finished state"
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.jvm.javaio.g.a(d4.c):java.lang.Object");
    }
}
