package d5;

/* loaded from: classes.dex */
public final class z implements I {

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0951k f11515c;

    /* renamed from: e, reason: collision with root package name */
    public final C0949i f11516e;

    /* renamed from: f, reason: collision with root package name */
    public D f11517f;

    /* renamed from: g, reason: collision with root package name */
    public int f11518g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f11519h;

    /* renamed from: i, reason: collision with root package name */
    public long f11520i;

    public z(InterfaceC0951k interfaceC0951k) {
        this.f11515c = interfaceC0951k;
        C0949i x5 = interfaceC0951k.x();
        this.f11516e = x5;
        D d6 = x5.f11481c;
        this.f11517f = d6;
        this.f11518g = d6 != null ? d6.f11447b : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if (r3 == r5.f11447b) goto L15;
     */
    @Override // d5.I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long W(long r9, d5.C0949i r11) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            m4.AbstractC1276k.f(r11, r0)
            r0 = 0
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 < 0) goto L6b
            boolean r3 = r8.f11519h
            if (r3 != 0) goto L63
            d5.D r3 = r8.f11517f
            d5.i r4 = r8.f11516e
            if (r3 == 0) goto L2b
            d5.D r5 = r4.f11481c
            if (r3 != r5) goto L23
            int r3 = r8.f11518g
            m4.AbstractC1276k.c(r5)
            int r5 = r5.f11447b
            if (r3 != r5) goto L23
            goto L2b
        L23:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            r9.<init>(r10)
            throw r9
        L2b:
            if (r2 != 0) goto L2e
            return r0
        L2e:
            long r0 = r8.f11520i
            r2 = 1
            long r0 = r0 + r2
            d5.k r2 = r8.f11515c
            boolean r0 = r2.P(r0)
            if (r0 != 0) goto L3e
            r9 = -1
            return r9
        L3e:
            d5.D r0 = r8.f11517f
            if (r0 != 0) goto L4c
            d5.D r0 = r4.f11481c
            if (r0 == 0) goto L4c
            r8.f11517f = r0
            int r0 = r0.f11447b
            r8.f11518g = r0
        L4c:
            long r0 = r4.f11482e
            long r2 = r8.f11520i
            long r0 = r0 - r2
            long r6 = java.lang.Math.min(r9, r0)
            d5.i r2 = r8.f11516e
            long r4 = r8.f11520i
            r3 = r11
            r2.d(r3, r4, r6)
            long r9 = r8.f11520i
            long r9 = r9 + r6
            r8.f11520i = r9
            return r6
        L63:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            r9.<init>(r10)
            throw r9
        L6b:
            java.lang.String r11 = "byteCount < 0: "
            java.lang.String r9 = B3.e.m(r11, r9)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.z.W(long, d5.i):long");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f11519h = true;
    }

    @Override // d5.I
    public final K timeout() {
        return this.f11515c.timeout();
    }
}
