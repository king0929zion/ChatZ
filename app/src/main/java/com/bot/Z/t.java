package z;

import F0.W;
import e1.InterfaceC0961c;
import java.util.List;
import java.util.Map;
import r.X0;
import s.C1649m;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class t implements W {
    public final List a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16152b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16153c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16154d;

    /* renamed from: e, reason: collision with root package name */
    public final X0 f16155e;

    /* renamed from: f, reason: collision with root package name */
    public final int f16156f;

    /* renamed from: g, reason: collision with root package name */
    public final int f16157g;

    /* renamed from: h, reason: collision with root package name */
    public final int f16158h;

    /* renamed from: i, reason: collision with root package name */
    public final C2009g f16159i;

    /* renamed from: j, reason: collision with root package name */
    public final C2009g f16160j;

    /* renamed from: k, reason: collision with root package name */
    public final float f16161k;

    /* renamed from: l, reason: collision with root package name */
    public final int f16162l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f16163m;

    /* renamed from: n, reason: collision with root package name */
    public final C1649m f16164n;

    /* renamed from: o, reason: collision with root package name */
    public final W f16165o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f16166p;

    /* renamed from: q, reason: collision with root package name */
    public final List f16167q;

    /* renamed from: r, reason: collision with root package name */
    public final List f16168r;

    /* renamed from: s, reason: collision with root package name */
    public final InterfaceC1942y f16169s;

    /* renamed from: t, reason: collision with root package name */
    public final InterfaceC0961c f16170t;

    /* renamed from: u, reason: collision with root package name */
    public final long f16171u;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ t(int r24, int r25, int r26, int r27, int r28, int r29, s.C1649m r30, F0.W r31, x4.InterfaceC1942y r32, e1.InterfaceC0961c r33, long r34) {
        /*
            r23 = this;
            r13 = 0
            r16 = 0
            Y3.v r1 = Y3.v.f9812c
            r.X0 r5 = r.X0.f14184e
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r17 = r1
            r18 = r1
            r0 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            r6 = r27
            r7 = r28
            r8 = r29
            r14 = r30
            r15 = r31
            r19 = r32
            r20 = r33
            r21 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z.t.<init>(int, int, int, int, int, int, s.m, F0.W, x4.y, e1.c, long):void");
    }

    public final t a(int i6) {
        int i7;
        int i8 = this.f16152b + this.f16153c;
        if (this.f16166p) {
            return null;
        }
        List list = this.a;
        if (list.isEmpty() || this.f16159i == null || (i7 = this.f16162l - i6) < 0 || i7 >= i8) {
            return null;
        }
        float f6 = this.f16161k - (i8 != 0 ? i6 / i8 : S.l.f7374V);
        if (this.f16160j == null || f6 >= 0.5f || f6 <= -0.5f) {
            return null;
        }
        C2009g c2009g = (C2009g) Y3.m.o0(list);
        C2009g c2009g2 = (C2009g) Y3.m.w0(list);
        int i9 = this.f16157g;
        int i10 = this.f16156f;
        if (i6 < 0) {
            if (Math.min((c2009g.f16114j + i8) - i10, (c2009g2.f16114j + i8) - i9) <= (-i6)) {
                return null;
            }
        } else if (Math.min(i10 - c2009g.f16114j, i9 - c2009g2.f16114j) <= i6) {
            return null;
        }
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((C2009g) list.get(i11)).a(i6);
        }
        List list2 = this.f16167q;
        int size2 = list2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            ((C2009g) list2.get(i12)).a(i6);
        }
        List list3 = this.f16168r;
        int size3 = list3.size();
        for (int i13 = 0; i13 < size3; i13++) {
            ((C2009g) list3.get(i13)).a(i6);
        }
        return new t(this.a, this.f16152b, this.f16153c, this.f16154d, this.f16155e, this.f16156f, this.f16157g, this.f16158h, this.f16159i, this.f16160j, f6, i7, this.f16163m || i6 > 0, this.f16164n, this.f16165o, this.f16166p, this.f16167q, this.f16168r, this.f16169s, this.f16170t, this.f16171u);
    }

    @Override // F0.W
    public final Map b() {
        return this.f16165o.b();
    }

    @Override // F0.W
    public final void c() {
        this.f16165o.c();
    }

    @Override // F0.W
    public final int d() {
        return this.f16165o.d();
    }

    @Override // F0.W
    public final int e() {
        return this.f16165o.e();
    }

    @Override // F0.W
    public final l4.c f() {
        return this.f16165o.f();
    }

    public final long g() {
        W w5 = this.f16165o;
        return (w5.e() << 32) | (w5.d() & 4294967295L);
    }

    public t(List list, int i6, int i7, int i8, X0 x02, int i9, int i10, int i11, C2009g c2009g, C2009g c2009g2, float f6, int i12, boolean z5, C1649m c1649m, W w5, boolean z6, List list2, List list3, InterfaceC1942y interfaceC1942y, InterfaceC0961c interfaceC0961c, long j3) {
        this.a = list;
        this.f16152b = i6;
        this.f16153c = i7;
        this.f16154d = i8;
        this.f16155e = x02;
        this.f16156f = i9;
        this.f16157g = i10;
        this.f16158h = i11;
        this.f16159i = c2009g;
        this.f16160j = c2009g2;
        this.f16161k = f6;
        this.f16162l = i12;
        this.f16163m = z5;
        this.f16164n = c1649m;
        this.f16165o = w5;
        this.f16166p = z6;
        this.f16167q = list2;
        this.f16168r = list3;
        this.f16169s = interfaceC1942y;
        this.f16170t = interfaceC0961c;
        this.f16171u = j3;
    }
}
