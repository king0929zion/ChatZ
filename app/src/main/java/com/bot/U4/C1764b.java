package u4;

import i4.AbstractC1117a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import m4.AbstractC1276k;
import n4.InterfaceC1372a;

/* renamed from: u4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1764b implements Iterator, InterfaceC1372a {

    /* renamed from: c, reason: collision with root package name */
    public int f15170c = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f15171e;

    /* renamed from: f, reason: collision with root package name */
    public int f15172f;

    /* renamed from: g, reason: collision with root package name */
    public r4.g f15173g;

    /* renamed from: h, reason: collision with root package name */
    public int f15174h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1765c f15175i;

    public C1764b(C1765c c1765c) {
        this.f15175i = c1765c;
        int f6 = AbstractC1117a.f(0, 0, c1765c.a.length());
        this.f15171e = f6;
        this.f15172f = f6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
    
        if (r6 < r3) goto L10;
     */
    /* JADX WARN: Type inference failed for: r0v7, types: [r4.e, r4.g] */
    /* JADX WARN: Type inference failed for: r0v8, types: [r4.e, r4.g] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r7 = this;
            int r0 = r7.f15172f
            r1 = 0
            if (r0 >= 0) goto Lb
            r7.f15170c = r1
            r0 = 0
            r7.f15173g = r0
            return
        Lb:
            u4.c r2 = r7.f15175i
            int r3 = r2.f15176b
            r4 = -1
            r5 = 1
            if (r3 <= 0) goto L1a
            int r6 = r7.f15174h
            int r6 = r6 + r5
            r7.f15174h = r6
            if (r6 >= r3) goto L22
        L1a:
            java.lang.CharSequence r3 = r2.a
            int r3 = r3.length()
            if (r0 <= r3) goto L34
        L22:
            r4.g r0 = new r4.g
            int r1 = r7.f15171e
            java.lang.CharSequence r2 = r2.a
            int r2 = u4.AbstractC1776n.L(r2)
            r0.<init>(r1, r2, r5)
            r7.f15173g = r0
            r7.f15172f = r4
            goto L79
        L34:
            l4.e r0 = r2.f15177c
            java.lang.CharSequence r3 = r2.a
            int r6 = r7.f15172f
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r0 = r0.m(r3, r6)
            X3.i r0 = (X3.i) r0
            if (r0 != 0) goto L58
            r4.g r0 = new r4.g
            int r1 = r7.f15171e
            java.lang.CharSequence r2 = r2.a
            int r2 = u4.AbstractC1776n.L(r2)
            r0.<init>(r1, r2, r5)
            r7.f15173g = r0
            r7.f15172f = r4
            goto L79
        L58:
            java.lang.Object r2 = r0.f9393c
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r0 = r0.f9394e
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r3 = r7.f15171e
            r4.g r3 = i4.AbstractC1117a.z(r3, r2)
            r7.f15173g = r3
            int r2 = r2 + r0
            r7.f15171e = r2
            if (r0 != 0) goto L76
            r1 = r5
        L76:
            int r2 = r2 + r1
            r7.f15172f = r2
        L79:
            r7.f15170c = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.C1764b.a():void");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f15170c == -1) {
            a();
        }
        return this.f15170c == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f15170c == -1) {
            a();
        }
        if (this.f15170c == 0) {
            throw new NoSuchElementException();
        }
        r4.g gVar = this.f15173g;
        AbstractC1276k.d(gVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f15173g = null;
        this.f15170c = -1;
        return gVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
