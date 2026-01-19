package T;

import f0.AbstractC0974D;
import f0.AbstractC0983f;
import f0.AbstractC0992o;
import f0.InterfaceC0972B;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class D extends AbstractC0974D {

    /* renamed from: h, reason: collision with root package name */
    public static final Object f7936h = new Object();

    /* renamed from: c, reason: collision with root package name */
    public long f7937c;

    /* renamed from: d, reason: collision with root package name */
    public int f7938d;

    /* renamed from: e, reason: collision with root package name */
    public k.H f7939e;

    /* renamed from: f, reason: collision with root package name */
    public Object f7940f;

    /* renamed from: g, reason: collision with root package name */
    public int f7941g;

    public D(long j3) {
        super(j3);
        k.H h3 = k.S.a;
        AbstractC1276k.d(h3, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
        this.f7939e = h3;
        this.f7940f = f7936h;
    }

    @Override // f0.AbstractC0974D
    public final void a(AbstractC0974D abstractC0974D) {
        AbstractC1276k.d(abstractC0974D, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
        D d6 = (D) abstractC0974D;
        this.f7939e = d6.f7939e;
        this.f7940f = d6.f7940f;
        this.f7941g = d6.f7941g;
    }

    @Override // f0.AbstractC0974D
    public final AbstractC0974D b(long j3) {
        return new D(j3);
    }

    public final boolean c(E e6, AbstractC0983f abstractC0983f) {
        boolean z5;
        boolean z6;
        Object obj = AbstractC0992o.f11707c;
        synchronized (obj) {
            z5 = true;
            if (this.f7937c == abstractC0983f.g()) {
                if (this.f7938d == abstractC0983f.h()) {
                    z6 = false;
                }
            }
            z6 = true;
        }
        if (this.f7940f == f7936h || (z6 && this.f7941g != d(e6, abstractC0983f))) {
            z5 = false;
        }
        if (!z5 || !z6) {
            return z5;
        }
        synchronized (obj) {
            this.f7937c = abstractC0983f.g();
            this.f7938d = abstractC0983f.h();
        }
        return z5;
    }

    public final int d(E e6, AbstractC0983f abstractC0983f) {
        k.H h3;
        int i6;
        long[] jArr;
        int i7;
        long[] jArr2;
        int i8;
        int i9;
        AbstractC0974D g3;
        synchronized (AbstractC0992o.f11707c) {
            h3 = this.f7939e;
        }
        int i10 = 7;
        if (h3.f12464e == 0) {
            return 7;
        }
        V.e q3 = r.q();
        Object[] objArr = q3.f8759c;
        int i11 = q3.f8761f;
        for (int i12 = 0; i12 < i11; i12++) {
            ((C0624p) objArr[i12]).b();
        }
        try {
            Object[] objArr2 = h3.f12461b;
            int[] iArr = h3.f12462c;
            long[] jArr3 = h3.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                i6 = 7;
                int i13 = 0;
                while (true) {
                    long j3 = jArr3[i13];
                    if ((((~j3) << i10) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i14 = 8;
                        int i15 = 8 - ((~(i13 - length)) >>> 31);
                        int i16 = 0;
                        while (i16 < i15) {
                            if ((j3 & 255) < 128) {
                                int i17 = (i13 << 3) + i16;
                                Object obj = objArr2[i17];
                                i8 = i10;
                                int i18 = iArr[i17];
                                i9 = i14;
                                InterfaceC0972B interfaceC0972B = (InterfaceC0972B) obj;
                                if (i18 != 1) {
                                    jArr2 = jArr3;
                                } else {
                                    if (interfaceC0972B instanceof E) {
                                        try {
                                            E e7 = (E) interfaceC0972B;
                                            g3 = e7.g((D) AbstractC0992o.i(e7.f7946g, abstractC0983f), abstractC0983f, false, e7.f7944e);
                                        } catch (Throwable th) {
                                            th = th;
                                            Object[] objArr3 = q3.f8759c;
                                            int i19 = q3.f8761f;
                                            for (int i20 = 0; i20 < i19; i20++) {
                                                ((C0624p) objArr3[i20]).a();
                                            }
                                            throw th;
                                        }
                                    } else {
                                        g3 = AbstractC0992o.i(interfaceC0972B.a(), abstractC0983f);
                                    }
                                    jArr2 = jArr3;
                                    i6 = (((i6 * 31) + System.identityHashCode(g3)) * 31) + Long.hashCode(g3.a);
                                }
                            } else {
                                jArr2 = jArr3;
                                i8 = i10;
                                i9 = i14;
                            }
                            j3 >>= i9;
                            i16++;
                            i10 = i8;
                            jArr3 = jArr2;
                            i14 = i9;
                        }
                        jArr = jArr3;
                        i7 = i10;
                        if (i15 != i14) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        i7 = i10;
                    }
                    if (i13 == length) {
                        i10 = i6;
                        break;
                    }
                    i13++;
                    i10 = i7;
                    jArr3 = jArr;
                }
            }
            i6 = i10;
            Object[] objArr4 = q3.f8759c;
            int i21 = q3.f8761f;
            for (int i22 = 0; i22 < i21; i22++) {
                ((C0624p) objArr4[i22]).a();
            }
            return i6;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
