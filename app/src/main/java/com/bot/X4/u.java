package X4;

import d5.C0949i;
import d5.I;
import d5.K;

/* loaded from: classes.dex */
public final class u implements I {

    /* renamed from: c, reason: collision with root package name */
    public final long f9510c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9511e;

    /* renamed from: f, reason: collision with root package name */
    public final C0949i f9512f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public final C0949i f9513g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public boolean f9514h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ w f9515i;

    /* JADX WARN: Type inference failed for: r1v1, types: [d5.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [d5.i, java.lang.Object] */
    public u(w wVar, long j3, boolean z5) {
        this.f9515i = wVar;
        this.f9510c = j3;
        this.f9511e = z5;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0095 A[LOOP:0: B:3:0x000e->B:40:0x0095, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0099 A[SYNTHETIC] */
    @Override // d5.I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long W(long r15, d5.C0949i r17) {
        /*
            Method dump skipped, instructions count: 199
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X4.u.W(long, d5.i):long");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j3;
        w wVar = this.f9515i;
        synchronized (wVar) {
            this.f9514h = true;
            C0949i c0949i = this.f9513g;
            j3 = c0949i.f11482e;
            c0949i.skip(j3);
            wVar.notifyAll();
        }
        if (j3 > 0) {
            w wVar2 = this.f9515i;
            byte[] bArr = R4.b.a;
            wVar2.f9517b.j(j3);
        }
        this.f9515i.a();
    }

    @Override // d5.I
    public final K timeout() {
        return this.f9515i.f9526k;
    }
}
