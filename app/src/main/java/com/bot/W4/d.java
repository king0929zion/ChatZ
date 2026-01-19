package W4;

import Q4.p;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: g, reason: collision with root package name */
    public final p f9030g;

    /* renamed from: h, reason: collision with root package name */
    public long f9031h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f9032i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h f9033j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, p pVar) {
        super(hVar);
        AbstractC1276k.f(pVar, "url");
        this.f9033j = hVar;
        this.f9030g = pVar;
        this.f9031h = -1L;
        this.f9032i = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x007d, code lost:
    
        if (r11.f9032i == false) goto L30;
     */
    @Override // W4.b, d5.I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long W(long r12, d5.C0949i r14) {
        /*
            r11 = this;
            W4.h r0 = r11.f9033j
            d5.k r1 = r0.f9041c
            java.lang.String r2 = "sink"
            m4.AbstractC1276k.f(r14, r2)
            r2 = 0
            int r4 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r4 < 0) goto Ld2
            boolean r4 = r11.f9025e
            if (r4 != 0) goto Lca
            boolean r4 = r11.f9032i
            r5 = -1
            if (r4 != 0) goto L1a
            goto L7f
        L1a:
            long r7 = r11.f9031h
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 == 0) goto L24
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 != 0) goto L80
        L24:
            java.lang.String r4 = "expected chunk size and optional extensions but was \""
            int r7 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r7 == 0) goto L2d
            r1.R()
        L2d:
            long r7 = r1.b0()     // Catch: java.lang.NumberFormatException -> L55
            r11.f9031h = r7     // Catch: java.lang.NumberFormatException -> L55
            java.lang.String r1 = r1.R()     // Catch: java.lang.NumberFormatException -> L55
            java.lang.CharSequence r1 = u4.AbstractC1776n.l0(r1)     // Catch: java.lang.NumberFormatException -> L55
            java.lang.String r1 = r1.toString()     // Catch: java.lang.NumberFormatException -> L55
            long r7 = r11.f9031h     // Catch: java.lang.NumberFormatException -> L55
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 < 0) goto La4
            int r7 = r1.length()     // Catch: java.lang.NumberFormatException -> L55
            r8 = 0
            if (r7 <= 0) goto L57
            java.lang.String r7 = ";"
            boolean r7 = u4.u.D(r1, r7, r8)     // Catch: java.lang.NumberFormatException -> L55
            if (r7 == 0) goto La4
            goto L57
        L55:
            r12 = move-exception
            goto Lc0
        L57:
            long r9 = r11.f9031h
            int r1 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r1 != 0) goto L7b
            r11.f9032i = r8
            W4.a r1 = r0.f9044f
            Q4.n r1 = r1.c()
            r0.f9045g = r1
            Q4.t r1 = r0.a
            m4.AbstractC1276k.c(r1)
            Q4.b r1 = r1.f6614m
            Q4.n r2 = r0.f9045g
            m4.AbstractC1276k.c(r2)
            Q4.p r3 = r11.f9030g
            V4.e.b(r1, r3, r2)
            r11.c()
        L7b:
            boolean r1 = r11.f9032i
            if (r1 != 0) goto L80
        L7f:
            return r5
        L80:
            long r1 = r11.f9031h
            long r12 = java.lang.Math.min(r12, r1)
            long r12 = super.W(r12, r14)
            int r14 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r14 == 0) goto L94
            long r0 = r11.f9031h
            long r0 = r0 - r12
            r11.f9031h = r0
            return r12
        L94:
            U4.k r12 = r0.f9040b
            r12.k()
            java.net.ProtocolException r12 = new java.net.ProtocolException
            java.lang.String r13 = "unexpected end of stream"
            r12.<init>(r13)
            r11.c()
            throw r12
        La4:
            java.net.ProtocolException r12 = new java.net.ProtocolException     // Catch: java.lang.NumberFormatException -> L55
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L55
            r13.<init>(r4)     // Catch: java.lang.NumberFormatException -> L55
            long r2 = r11.f9031h     // Catch: java.lang.NumberFormatException -> L55
            r13.append(r2)     // Catch: java.lang.NumberFormatException -> L55
            r13.append(r1)     // Catch: java.lang.NumberFormatException -> L55
            r14 = 34
            r13.append(r14)     // Catch: java.lang.NumberFormatException -> L55
            java.lang.String r13 = r13.toString()     // Catch: java.lang.NumberFormatException -> L55
            r12.<init>(r13)     // Catch: java.lang.NumberFormatException -> L55
            throw r12     // Catch: java.lang.NumberFormatException -> L55
        Lc0:
            java.net.ProtocolException r13 = new java.net.ProtocolException
            java.lang.String r12 = r12.getMessage()
            r13.<init>(r12)
            throw r13
        Lca:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "closed"
            r12.<init>(r13)
            throw r12
        Ld2:
            java.lang.String r14 = "byteCount < 0: "
            java.lang.String r12 = B3.e.m(r14, r12)
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r12 = r12.toString()
            r13.<init>(r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: W4.d.W(long, d5.i):long");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z5;
        if (this.f9025e) {
            return;
        }
        if (this.f9032i) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            byte[] bArr = R4.b.a;
            AbstractC1276k.f(timeUnit, "timeUnit");
            try {
                z5 = R4.b.t(this, 100);
            } catch (IOException unused) {
                z5 = false;
            }
            if (!z5) {
                this.f9033j.f9040b.k();
                c();
            }
        }
        this.f9025e = true;
    }
}
