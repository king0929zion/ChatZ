package U3;

import Y4.l;
import java.io.Closeable;
import java.io.EOFException;
import java.nio.ByteBuffer;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public abstract class h implements Closeable {

    /* renamed from: c, reason: collision with root package name */
    public final W3.e f8679c;

    /* renamed from: e, reason: collision with root package name */
    public V3.b f8680e;

    /* renamed from: f, reason: collision with root package name */
    public ByteBuffer f8681f;

    /* renamed from: g, reason: collision with root package name */
    public int f8682g;

    /* renamed from: h, reason: collision with root package name */
    public int f8683h;

    /* renamed from: i, reason: collision with root package name */
    public long f8684i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f8685j;

    public h(V3.b bVar, long j3, W3.e eVar) {
        AbstractC1276k.f(bVar, "head");
        AbstractC1276k.f(eVar, "pool");
        this.f8679c = eVar;
        this.f8680e = bVar;
        this.f8681f = bVar.a;
        this.f8682g = bVar.f8662b;
        this.f8683h = bVar.f8663c;
        this.f8684i = j3 - (r3 - r6);
    }

    public final void c(int i6) {
        if (i6 < 0) {
            throw new IllegalArgumentException(B3.e.h(i6, "Negative discard is not allowed: ").toString());
        }
        int i7 = 0;
        int i8 = i6;
        while (i8 != 0) {
            V3.b j3 = j();
            if (this.f8683h - this.f8682g < 1) {
                j3 = q(1, j3);
            }
            if (j3 == null) {
                break;
            }
            int min = Math.min(j3.f8663c - j3.f8662b, i8);
            j3.c(min);
            this.f8682g += min;
            if (j3.f8663c - j3.f8662b == 0) {
                s(j3);
            }
            i8 -= min;
            i7 += min;
        }
        if (i7 != i6) {
            throw new EOFException(B3.e.l("Unable to discard ", i6, " bytes due to end of packet"));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        r();
        if (this.f8685j) {
            return;
        }
        this.f8685j = true;
    }

    public final V3.b d(V3.b bVar) {
        V3.b bVar2 = V3.b.f8804l;
        while (bVar != bVar2) {
            V3.b f6 = bVar.f();
            bVar.j(this.f8679c);
            if (f6 == null) {
                y(bVar2);
                u(0L);
                bVar = bVar2;
            } else {
                if (f6.f8663c > f6.f8662b) {
                    y(f6);
                    u(this.f8684i - (f6.f8663c - f6.f8662b));
                    return f6;
                }
                bVar = f6;
            }
        }
        if (this.f8685j) {
            return null;
        }
        this.f8685j = true;
        return null;
    }

    public final void f(V3.b bVar) {
        long j3 = 0;
        if (this.f8685j && bVar.h() == null) {
            this.f8682g = bVar.f8662b;
            this.f8683h = bVar.f8663c;
            u(0L);
            return;
        }
        int i6 = bVar.f8663c - bVar.f8662b;
        int min = Math.min(i6, 8 - (bVar.f8666f - bVar.f8665e));
        W3.e eVar = this.f8679c;
        if (i6 > min) {
            V3.b bVar2 = (V3.b) eVar.v();
            V3.b bVar3 = (V3.b) eVar.v();
            bVar2.e();
            bVar3.e();
            bVar2.l(bVar3);
            bVar3.l(bVar.f());
            Y4.d.Z(bVar2, bVar, i6 - min);
            Y4.d.Z(bVar3, bVar, min);
            y(bVar2);
            do {
                j3 += bVar3.f8663c - bVar3.f8662b;
                bVar3 = bVar3.h();
            } while (bVar3 != null);
            u(j3);
        } else {
            V3.b bVar4 = (V3.b) eVar.v();
            bVar4.e();
            bVar4.l(bVar.f());
            Y4.d.Z(bVar4, bVar, i6);
            y(bVar4);
        }
        bVar.j(eVar);
    }

    public final boolean h() {
        if (this.f8683h - this.f8682g != 0 || this.f8684i != 0) {
            return false;
        }
        boolean z5 = this.f8685j;
        if (!z5 && !z5) {
            this.f8685j = true;
        }
        return true;
    }

    public final V3.b j() {
        V3.b bVar = this.f8680e;
        int i6 = this.f8682g;
        if (i6 < 0 || i6 > bVar.f8663c) {
            int i7 = bVar.f8662b;
            l.z(i6 - i7, bVar.f8663c - i7);
            throw null;
        }
        if (bVar.f8662b != i6) {
            bVar.f8662b = i6;
        }
        return bVar;
    }

    public final long p() {
        return (this.f8683h - this.f8682g) + this.f8684i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c5, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V3.b q(int r7, V3.b r8) {
        /*
            r6 = this;
        L0:
            int r0 = r6.f8683h
            int r1 = r6.f8682g
            int r0 = r0 - r1
            if (r0 < r7) goto L9
            goto Lc5
        L9:
            V3.b r1 = r8.h()
            if (r1 != 0) goto L19
            boolean r7 = r6.f8685j
            if (r7 == 0) goto L14
            goto L17
        L14:
            r7 = 1
            r6.f8685j = r7
        L17:
            r7 = 0
            return r7
        L19:
            if (r0 != 0) goto L24
            V3.b r0 = V3.b.f8804l
            if (r8 == r0) goto L22
            r6.s(r8)
        L22:
            r8 = r1
            goto L0
        L24:
            int r0 = r7 - r0
            int r0 = Y4.d.Z(r8, r1, r0)
            int r2 = r8.f8663c
            r6.f8683h = r2
            long r2 = r6.f8684i
            long r4 = (long) r0
            long r2 = r2 - r4
            r6.u(r2)
            int r2 = r1.f8663c
            int r3 = r1.f8662b
            if (r2 <= r3) goto Laf
            if (r0 < 0) goto L9f
            if (r3 < r0) goto L43
            r1.f8664d = r0
            goto Lbe
        L43:
            java.lang.String r4 = " start gap: there are already "
            java.lang.String r5 = "Unable to reserve "
            if (r3 != r2) goto L7f
            int r2 = r1.f8665e
            if (r0 <= r2) goto L78
            int r7 = r1.f8666f
            if (r0 <= r7) goto L5f
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Start gap "
            java.lang.String r2 = " is bigger than the capacity "
            java.lang.String r7 = B3.e.k(r1, r0, r7, r2)
            r8.<init>(r7)
            throw r8
        L5f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = j1.AbstractC1135a.k(r5, r0, r4)
            int r1 = r1.f8665e
            int r7 = r7 - r1
            r0.append(r7)
            java.lang.String r7 = " bytes reserved in the end"
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.<init>(r7)
            throw r8
        L78:
            r1.f8663c = r0
            r1.f8662b = r0
            r1.f8664d = r0
            goto Lbe
        L7f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = j1.AbstractC1135a.k(r5, r0, r4)
            int r0 = r1.f8663c
            int r2 = r1.f8662b
            int r0 = r0 - r2
            r8.append(r0)
            java.lang.String r0 = " content bytes starting at offset "
            r8.append(r0)
            int r0 = r1.f8662b
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L9f:
            java.lang.String r7 = "startGap shouldn't be negative: "
            java.lang.String r7 = B3.e.h(r0, r7)
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        Laf:
            r8.f()
            V3.b r0 = r1.f()
            r8.l(r0)
            W3.e r0 = r6.f8679c
            r1.j(r0)
        Lbe:
            int r0 = r8.f8663c
            int r1 = r8.f8662b
            int r0 = r0 - r1
            if (r0 < r7) goto Lc6
        Lc5:
            return r8
        Lc6:
            r0 = 8
            if (r7 > r0) goto Lcc
            goto L0
        Lcc:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "minSize of "
            java.lang.String r1 = " is too big (should be less than 8)"
            java.lang.String r7 = B3.e.l(r0, r7, r1)
            r8.<init>(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: U3.h.q(int, V3.b):V3.b");
    }

    public final void r() {
        V3.b j3 = j();
        V3.b bVar = V3.b.f8804l;
        if (j3 != bVar) {
            y(bVar);
            u(0L);
            W3.e eVar = this.f8679c;
            AbstractC1276k.f(eVar, "pool");
            while (j3 != null) {
                V3.b f6 = j3.f();
                j3.j(eVar);
                j3 = f6;
            }
        }
    }

    public final void s(V3.b bVar) {
        V3.b f6 = bVar.f();
        if (f6 == null) {
            f6 = V3.b.f8804l;
        }
        y(f6);
        u(this.f8684i - (f6.f8663c - f6.f8662b));
        bVar.j(this.f8679c);
    }

    public final void u(long j3) {
        if (j3 < 0) {
            throw new IllegalArgumentException(B3.e.m("tailRemaining shouldn't be negative: ", j3).toString());
        }
        this.f8684i = j3;
    }

    public final void y(V3.b bVar) {
        this.f8680e = bVar;
        this.f8681f = bVar.a;
        this.f8682g = bVar.f8662b;
        this.f8683h = bVar.f8663c;
    }
}
