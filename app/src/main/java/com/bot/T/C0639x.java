package T;

import U.C0670a;
import android.os.Trace;
import b0.AbstractC0874g;
import b0.C0879l;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import k.C1147A;
import m4.AbstractC1276k;

/* renamed from: T.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0639x implements InterfaceC0631t {

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC0633u f8234c;

    /* renamed from: e, reason: collision with root package name */
    public final H0.G0 f8235e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f8236f = new AtomicReference(null);

    /* renamed from: g, reason: collision with root package name */
    public final Object f8237g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public final k.P f8238h;

    /* renamed from: i, reason: collision with root package name */
    public final J0 f8239i;

    /* renamed from: j, reason: collision with root package name */
    public final k.M f8240j;

    /* renamed from: k, reason: collision with root package name */
    public final k.N f8241k;

    /* renamed from: l, reason: collision with root package name */
    public final k.N f8242l;

    /* renamed from: m, reason: collision with root package name */
    public final k.M f8243m;

    /* renamed from: n, reason: collision with root package name */
    public final C0670a f8244n;

    /* renamed from: o, reason: collision with root package name */
    public final C0670a f8245o;

    /* renamed from: p, reason: collision with root package name */
    public final k.M f8246p;

    /* renamed from: q, reason: collision with root package name */
    public k.M f8247q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f8248r;

    /* renamed from: s, reason: collision with root package name */
    public G0 f8249s;

    /* renamed from: t, reason: collision with root package name */
    public C0611i0 f8250t;

    /* renamed from: u, reason: collision with root package name */
    public C0639x f8251u;

    /* renamed from: v, reason: collision with root package name */
    public int f8252v;

    /* renamed from: w, reason: collision with root package name */
    public final A3.c f8253w;

    /* renamed from: x, reason: collision with root package name */
    public final C0879l f8254x;

    /* renamed from: y, reason: collision with root package name */
    public final C0626q f8255y;

    /* renamed from: z, reason: collision with root package name */
    public int f8256z;

    public C0639x(AbstractC0633u abstractC0633u, H0.G0 g02) {
        this.f8234c = abstractC0633u;
        this.f8235e = g02;
        k.P p5 = new k.P(new k.N());
        this.f8238h = p5;
        J0 j02 = new J0();
        if (abstractC0633u.d()) {
            j02.f7976n = new C1147A();
        }
        if (abstractC0633u.f()) {
            j02.b();
        }
        this.f8239i = j02;
        this.f8240j = Y4.l.t();
        this.f8241k = new k.N();
        this.f8242l = new k.N();
        this.f8243m = Y4.l.t();
        C0670a c0670a = new C0670a();
        this.f8244n = c0670a;
        C0670a c0670a2 = new C0670a();
        this.f8245o = c0670a2;
        this.f8246p = Y4.l.t();
        this.f8247q = Y4.l.t();
        A3.c cVar = new A3.c(abstractC0633u, 21);
        this.f8253w = cVar;
        this.f8254x = new C0879l();
        C0626q c0626q = new C0626q(g02, abstractC0633u, j02, p5, c0670a, c0670a2, cVar, this);
        abstractC0633u.p(c0626q);
        this.f8255y = c0626q;
    }

    public final void A(Object obj) {
        synchronized (this.f8237g) {
            try {
                v(obj);
                Object g3 = this.f8243m.g(obj);
                if (g3 != null) {
                    if (g3 instanceof k.N) {
                        k.N n3 = (k.N) g3;
                        Object[] objArr = n3.f12490b;
                        long[] jArr = n3.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i6 = 0;
                            while (true) {
                                long j3 = jArr[i6];
                                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                                    for (int i8 = 0; i8 < i7; i8++) {
                                        if ((255 & j3) < 128) {
                                            v((E) objArr[(i6 << 3) + i8]);
                                        }
                                        j3 >>= 8;
                                    }
                                    if (i7 != 8) {
                                        break;
                                    }
                                }
                                if (i6 == length) {
                                    break;
                                } else {
                                    i6++;
                                }
                            }
                        }
                    } else {
                        v((E) g3);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void B(l4.e eVar) {
        boolean i6 = i();
        q();
        AbstractC0633u abstractC0633u = this.f8234c;
        if (!i6) {
            abstractC0633u.a(this, eVar);
            return;
        }
        C0626q c0626q = this.f8255y;
        c0626q.f8190z = 100;
        c0626q.f8189y = true;
        abstractC0633u.a(this, eVar);
        c0626q.u();
    }

    public final void a() {
        this.f8236f.set(null);
        this.f8244n.f8556c.S();
        this.f8245o.f8556c.S();
        k.P p5 = this.f8238h;
        if (p5.f12506c.g()) {
            return;
        }
        C0879l c0879l = this.f8254x;
        try {
            c0879l.g(p5, this.f8255y.C());
            c0879l.b();
        } finally {
            c0879l.a();
        }
    }

    public final void b(Object obj, boolean z5) {
        int i6;
        Object g3 = this.f8240j.g(obj);
        if (g3 == null) {
            return;
        }
        boolean z6 = g3 instanceof k.N;
        O o5 = O.f8012c;
        k.N n3 = this.f8241k;
        k.N n5 = this.f8242l;
        k.M m3 = this.f8246p;
        if (!z6) {
            C0627q0 c0627q0 = (C0627q0) g3;
            if (Y4.l.Q(m3, obj, c0627q0) || c0627q0.c(obj) == o5) {
                return;
            }
            if (c0627q0.f8196g == null || z5) {
                n3.a(c0627q0);
                return;
            } else {
                n5.a(c0627q0);
                return;
            }
        }
        k.N n6 = (k.N) g3;
        Object[] objArr = n6.f12490b;
        long[] jArr = n6.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i7 = 0;
        while (true) {
            long j3 = jArr[i7];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8;
                int i9 = 8 - ((~(i7 - length)) >>> 31);
                int i10 = 0;
                while (i10 < i9) {
                    if ((j3 & 255) < 128) {
                        C0627q0 c0627q02 = (C0627q0) objArr[(i7 << 3) + i10];
                        if (!Y4.l.Q(m3, obj, c0627q02)) {
                            i6 = i8;
                            if (c0627q02.c(obj) != o5) {
                                if (c0627q02.f8196g == null || z5) {
                                    n3.a(c0627q02);
                                } else {
                                    n5.a(c0627q02);
                                }
                            }
                            j3 >>= i6;
                            i10++;
                            i8 = i6;
                        }
                    }
                    i6 = i8;
                    j3 >>= i6;
                    i10++;
                    i8 = i6;
                }
                if (i9 != i8) {
                    return;
                }
            }
            if (i7 == length) {
                return;
            } else {
                i7++;
            }
        }
    }

    public final void c(Set set, boolean z5) {
        long j3;
        long j4;
        long j5;
        char c6;
        int i6;
        long[] jArr;
        String str;
        long[] jArr2;
        String str2;
        long j6;
        boolean c7;
        String str3;
        long j7;
        long[] jArr3;
        long[] jArr4;
        int i7;
        long j8;
        boolean z6;
        int i8;
        long j9;
        long[] jArr5;
        long[] jArr6;
        char c8;
        long j10;
        int i9;
        int i10;
        long[] jArr7;
        boolean z7 = set instanceof V.h;
        k.M m3 = this.f8243m;
        Object obj = null;
        int i11 = 8;
        if (z7) {
            k.N n3 = ((V.h) set).f8772c;
            Object[] objArr = n3.f12490b;
            long[] jArr8 = n3.a;
            int length = jArr8.length - 2;
            if (length >= 0) {
                int i12 = 0;
                j3 = 128;
                j4 = 255;
                while (true) {
                    long j11 = jArr8[i12];
                    char c9 = 7;
                    j5 = -9187201950435737472L;
                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i13 = 8 - ((~(i12 - length)) >>> 31);
                        int i14 = 0;
                        while (i14 < i13) {
                            if ((j11 & 255) < 128) {
                                Object obj2 = objArr[(i12 << 3) + i14];
                                c8 = c9;
                                if (obj2 instanceof C0627q0) {
                                    ((C0627q0) obj2).c(obj);
                                } else {
                                    b(obj2, z5);
                                    Object g3 = m3.g(obj2);
                                    if (g3 != null) {
                                        if (g3 instanceof k.N) {
                                            k.N n5 = (k.N) g3;
                                            Object[] objArr2 = n5.f12490b;
                                            long[] jArr9 = n5.a;
                                            int length2 = jArr9.length - 2;
                                            if (length2 >= 0) {
                                                int i15 = i11;
                                                i9 = length;
                                                int i16 = 0;
                                                while (true) {
                                                    long j12 = jArr9[i16];
                                                    j10 = j11;
                                                    long[] jArr10 = jArr9;
                                                    if ((((~j12) << c8) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i17 = 8 - ((~(i16 - length2)) >>> 31);
                                                        int i18 = 0;
                                                        while (i18 < i17) {
                                                            if ((j12 & 255) < 128) {
                                                                jArr7 = jArr8;
                                                                b((E) objArr2[(i16 << 3) + i18], z5);
                                                            } else {
                                                                jArr7 = jArr8;
                                                            }
                                                            j12 >>= i15;
                                                            i18++;
                                                            jArr8 = jArr7;
                                                        }
                                                        jArr6 = jArr8;
                                                        if (i17 != i15) {
                                                            break;
                                                        }
                                                    } else {
                                                        jArr6 = jArr8;
                                                    }
                                                    if (i16 == length2) {
                                                        break;
                                                    }
                                                    i16++;
                                                    jArr9 = jArr10;
                                                    j11 = j10;
                                                    jArr8 = jArr6;
                                                    i15 = 8;
                                                }
                                            }
                                        } else {
                                            jArr6 = jArr8;
                                            j10 = j11;
                                            i9 = length;
                                            b((E) g3, z5);
                                        }
                                        i10 = 8;
                                    }
                                }
                                jArr6 = jArr8;
                                j10 = j11;
                                i9 = length;
                                i10 = 8;
                            } else {
                                jArr6 = jArr8;
                                c8 = c9;
                                j10 = j11;
                                i9 = length;
                                i10 = i11;
                            }
                            j11 = j10 >> i10;
                            i14++;
                            length = i9;
                            i11 = i10;
                            c9 = c8;
                            jArr8 = jArr6;
                            obj = null;
                        }
                        jArr5 = jArr8;
                        c6 = c9;
                        int i19 = length;
                        if (i13 != i11) {
                            break;
                        } else {
                            length = i19;
                        }
                    } else {
                        jArr5 = jArr8;
                        c6 = 7;
                    }
                    if (i12 == length) {
                        break;
                    }
                    i12++;
                    jArr8 = jArr5;
                    obj = null;
                    i11 = 8;
                }
            } else {
                j3 = 128;
                j4 = 255;
                j5 = -9187201950435737472L;
                c6 = 7;
            }
        } else {
            j3 = 128;
            j4 = 255;
            j5 = -9187201950435737472L;
            c6 = 7;
            for (Object obj3 : set) {
                if (obj3 instanceof C0627q0) {
                    ((C0627q0) obj3).c(null);
                } else {
                    b(obj3, z5);
                    Object g6 = m3.g(obj3);
                    if (g6 != null) {
                        if (g6 instanceof k.N) {
                            k.N n6 = (k.N) g6;
                            Object[] objArr3 = n6.f12490b;
                            long[] jArr11 = n6.a;
                            int length3 = jArr11.length - 2;
                            if (length3 >= 0) {
                                while (true) {
                                    long j13 = jArr11[i6];
                                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i20 = 8 - ((~(i6 - length3)) >>> 31);
                                        for (int i21 = 0; i21 < i20; i21++) {
                                            if ((j13 & 255) < 128) {
                                                b((E) objArr3[(i6 << 3) + i21], z5);
                                            }
                                            j13 >>= 8;
                                        }
                                        if (i20 != 8) {
                                            break;
                                        }
                                    }
                                    i6 = i6 != length3 ? i6 + 1 : 0;
                                }
                            }
                        } else {
                            b((E) g6, z5);
                        }
                    }
                }
            }
        }
        String str4 = "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>";
        k.M m5 = this.f8240j;
        k.N n7 = this.f8241k;
        if (z5) {
            k.N n8 = this.f8242l;
            if (n8.h()) {
                long[] jArr12 = m5.a;
                int length4 = jArr12.length - 2;
                if (length4 >= 0) {
                    int i22 = 0;
                    while (true) {
                        long j14 = jArr12[i22];
                        if ((((~j14) << c6) & j14 & j5) != j5) {
                            int i23 = 8 - ((~(i22 - length4)) >>> 31);
                            int i24 = 0;
                            while (i24 < i23) {
                                if ((j14 & j4) < j3) {
                                    int i25 = (i22 << 3) + i24;
                                    Object obj4 = m5.f12485b[i25];
                                    Object obj5 = m5.f12486c[i25];
                                    if (obj5 instanceof k.N) {
                                        AbstractC1276k.d(obj5, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                        k.N n9 = (k.N) obj5;
                                        Object[] objArr4 = n9.f12490b;
                                        long[] jArr13 = n9.a;
                                        int length5 = jArr13.length - 2;
                                        if (length5 >= 0) {
                                            j8 = j14;
                                            int i26 = 0;
                                            while (true) {
                                                long j15 = jArr13[i26];
                                                jArr4 = jArr12;
                                                i7 = length4;
                                                if ((((~j15) << c6) & j15 & j5) != j5) {
                                                    int i27 = 8 - ((~(i26 - length5)) >>> 31);
                                                    for (int i28 = 0; i28 < i27; i28 = i8 + 1) {
                                                        if ((j15 & j4) < j3) {
                                                            i8 = i28;
                                                            int i29 = (i26 << 3) + i8;
                                                            j9 = j15;
                                                            C0627q0 c0627q0 = (C0627q0) objArr4[i29];
                                                            if (n8.c(c0627q0) || n7.c(c0627q0)) {
                                                                n9.m(i29);
                                                            }
                                                        } else {
                                                            i8 = i28;
                                                            j9 = j15;
                                                        }
                                                        j15 = j9 >> 8;
                                                    }
                                                    if (i27 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i26 == length5) {
                                                    break;
                                                }
                                                i26++;
                                                length4 = i7;
                                                jArr12 = jArr4;
                                            }
                                        } else {
                                            jArr4 = jArr12;
                                            i7 = length4;
                                            j8 = j14;
                                        }
                                        z6 = n9.g();
                                    } else {
                                        jArr4 = jArr12;
                                        i7 = length4;
                                        j8 = j14;
                                        AbstractC1276k.d(obj5, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                        C0627q0 c0627q02 = (C0627q0) obj5;
                                        z6 = n8.c(c0627q02) || n7.c(c0627q02);
                                    }
                                    if (z6) {
                                        m5.l(i25);
                                    }
                                } else {
                                    jArr4 = jArr12;
                                    i7 = length4;
                                    j8 = j14;
                                }
                                j14 = j8 >> 8;
                                i24++;
                                length4 = i7;
                                jArr12 = jArr4;
                            }
                            jArr3 = jArr12;
                            int i30 = length4;
                            if (i23 != 8) {
                                break;
                            } else {
                                length4 = i30;
                            }
                        } else {
                            jArr3 = jArr12;
                        }
                        if (i22 == length4) {
                            break;
                        }
                        i22++;
                        jArr12 = jArr3;
                    }
                }
                n8.b();
                h();
                return;
            }
        }
        if (n7.h()) {
            long[] jArr14 = m5.a;
            int length6 = jArr14.length - 2;
            if (length6 >= 0) {
                int i31 = 0;
                while (true) {
                    long j16 = jArr14[i31];
                    if ((((~j16) << c6) & j16 & j5) != j5) {
                        int i32 = 8 - ((~(i31 - length6)) >>> 31);
                        int i33 = 0;
                        while (i33 < i32) {
                            if ((j16 & j4) < j3) {
                                int i34 = (i31 << 3) + i33;
                                Object obj6 = m5.f12485b[i34];
                                Object obj7 = m5.f12486c[i34];
                                if (obj7 instanceof k.N) {
                                    AbstractC1276k.d(obj7, str4);
                                    k.N n10 = (k.N) obj7;
                                    Object[] objArr5 = n10.f12490b;
                                    long[] jArr15 = n10.a;
                                    int length7 = jArr15.length - 2;
                                    jArr2 = jArr14;
                                    if (length7 >= 0) {
                                        j6 = j16;
                                        int i35 = 0;
                                        while (true) {
                                            long j17 = jArr15[i35];
                                            Object[] objArr6 = objArr5;
                                            long[] jArr16 = jArr15;
                                            if ((((~j17) << c6) & j17 & j5) != j5) {
                                                int i36 = 8 - ((~(i35 - length7)) >>> 31);
                                                int i37 = 0;
                                                while (i37 < i36) {
                                                    if ((j17 & j4) < j3) {
                                                        str3 = str4;
                                                        int i38 = (i35 << 3) + i37;
                                                        j7 = j17;
                                                        if (n7.c((C0627q0) objArr6[i38])) {
                                                            n10.m(i38);
                                                        }
                                                    } else {
                                                        str3 = str4;
                                                        j7 = j17;
                                                    }
                                                    i37++;
                                                    str4 = str3;
                                                    j17 = j7 >> 8;
                                                }
                                                str2 = str4;
                                                if (i36 != 8) {
                                                    break;
                                                }
                                            } else {
                                                str2 = str4;
                                            }
                                            if (i35 == length7) {
                                                break;
                                            }
                                            i35++;
                                            objArr5 = objArr6;
                                            jArr15 = jArr16;
                                            str4 = str2;
                                        }
                                    } else {
                                        str2 = str4;
                                        j6 = j16;
                                    }
                                    c7 = n10.g();
                                } else {
                                    jArr2 = jArr14;
                                    str2 = str4;
                                    j6 = j16;
                                    AbstractC1276k.d(obj7, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                    c7 = n7.c((C0627q0) obj7);
                                }
                                if (c7) {
                                    m5.l(i34);
                                }
                            } else {
                                jArr2 = jArr14;
                                str2 = str4;
                                j6 = j16;
                            }
                            i33++;
                            j16 = j6 >> 8;
                            jArr14 = jArr2;
                            str4 = str2;
                        }
                        jArr = jArr14;
                        str = str4;
                        if (i32 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr14;
                        str = str4;
                    }
                    if (i31 == length6) {
                        break;
                    }
                    i31++;
                    jArr14 = jArr;
                    str4 = str;
                }
            }
            h();
            n7.b();
        }
    }

    public final void d() {
        synchronized (this.f8237g) {
            try {
                e(this.f8244n);
                o();
            } catch (Throwable th) {
                try {
                    if (!this.f8238h.f12506c.g()) {
                        C0879l c0879l = this.f8254x;
                        try {
                            c0879l.g(this.f8238h, this.f8255y.C());
                            c0879l.b();
                            c0879l.a();
                        } catch (Throwable th2) {
                            c0879l.a();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    a();
                    throw th3;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a A[Catch: all -> 0x003e, TRY_LEAVE, TryCatch #9 {all -> 0x003e, blocks: (B:3:0x0013, B:5:0x0035, B:7:0x0039, B:11:0x0047, B:12:0x004b, B:16:0x0056, B:29:0x007d, B:31:0x008a, B:148:0x0043), top: B:2:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(U.C0670a r34) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T.C0639x.e(U.a):void");
    }

    public final void f() {
        synchronized (this.f8237g) {
            try {
                if (this.f8245o.f8556c.V()) {
                    e(this.f8245o);
                }
            } catch (Throwable th) {
                try {
                    if (!this.f8238h.f12506c.g()) {
                        C0879l c0879l = this.f8254x;
                        try {
                            c0879l.g(this.f8238h, this.f8255y.C());
                            c0879l.b();
                            c0879l.a();
                        } catch (Throwable th2) {
                            c0879l.a();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    a();
                    throw th3;
                }
            }
        }
    }

    public final void g() {
        C0879l c0879l;
        synchronized (this.f8237g) {
            try {
                this.f8255y.f8186v = null;
                if (!this.f8238h.f12506c.g()) {
                    c0879l = this.f8254x;
                    try {
                        c0879l.g(this.f8238h, this.f8255y.C());
                        c0879l.b();
                        c0879l.a();
                    } finally {
                    }
                }
            } catch (Throwable th) {
                try {
                    if (!this.f8238h.f12506c.g()) {
                        c0879l = this.f8254x;
                        try {
                            c0879l.g(this.f8238h, this.f8255y.C());
                            c0879l.b();
                            c0879l.a();
                        } finally {
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    a();
                    throw th2;
                }
            }
        }
    }

    public final void h() {
        char c6;
        long j3;
        long j4;
        long j5;
        long[] jArr;
        long[] jArr2;
        int i6;
        long j6;
        char c7;
        long j7;
        long j8;
        int i7;
        boolean z5;
        int i8;
        long j9;
        k.M m3 = this.f8243m;
        long[] jArr3 = m3.a;
        int length = jArr3.length - 2;
        char c8 = 7;
        long j10 = -9187201950435737472L;
        int i9 = 8;
        if (length >= 0) {
            int i10 = 0;
            long j11 = 128;
            while (true) {
                long j12 = jArr3[i10];
                j4 = 255;
                if ((((~j12) << c8) & j12 & j10) != j10) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j12 & 255) < j11) {
                            c7 = c8;
                            int i13 = (i10 << 3) + i12;
                            j7 = j10;
                            Object obj = m3.f12485b[i13];
                            Object obj2 = m3.f12486c[i13];
                            boolean z6 = obj2 instanceof k.N;
                            k.M m5 = this.f8240j;
                            if (z6) {
                                AbstractC1276k.d(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                k.N n3 = (k.N) obj2;
                                Object[] objArr = n3.f12490b;
                                long[] jArr4 = n3.a;
                                j8 = j11;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j6 = j12;
                                    int i14 = i9;
                                    int i15 = 0;
                                    while (true) {
                                        long j13 = jArr4[i15];
                                        jArr2 = jArr3;
                                        i6 = length;
                                        if ((((~j13) << c7) & j13 & j7) != j7) {
                                            int i16 = 8 - ((~(i15 - length2)) >>> 31);
                                            int i17 = 0;
                                            while (i17 < i16) {
                                                if ((j13 & 255) < j8) {
                                                    i8 = i17;
                                                    int i18 = (i15 << 3) + i8;
                                                    j9 = j13;
                                                    if (!m5.c((E) objArr[i18])) {
                                                        n3.m(i18);
                                                    }
                                                } else {
                                                    i8 = i17;
                                                    j9 = j13;
                                                }
                                                j13 = j9 >> i14;
                                                i17 = i8 + 1;
                                            }
                                            if (i16 != i14) {
                                                break;
                                            }
                                        }
                                        if (i15 == length2) {
                                            break;
                                        }
                                        i15++;
                                        jArr3 = jArr2;
                                        length = i6;
                                        i14 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i6 = length;
                                    j6 = j12;
                                }
                                z5 = n3.g();
                            } else {
                                jArr2 = jArr3;
                                i6 = length;
                                j6 = j12;
                                j8 = j11;
                                AbstractC1276k.d(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                z5 = !m5.c((E) obj2);
                            }
                            if (z5) {
                                m3.l(i13);
                            }
                            i7 = 8;
                        } else {
                            jArr2 = jArr3;
                            i6 = length;
                            j6 = j12;
                            c7 = c8;
                            j7 = j10;
                            j8 = j11;
                            i7 = i9;
                        }
                        j12 = j6 >> i7;
                        i12++;
                        i9 = i7;
                        c8 = c7;
                        j10 = j7;
                        j11 = j8;
                        jArr3 = jArr2;
                        length = i6;
                    }
                    jArr = jArr3;
                    int i19 = length;
                    c6 = c8;
                    j3 = j10;
                    j5 = j11;
                    if (i11 != i9) {
                        break;
                    } else {
                        length = i19;
                    }
                } else {
                    jArr = jArr3;
                    c6 = c8;
                    j3 = j10;
                    j5 = j11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                c8 = c6;
                j10 = j3;
                j11 = j5;
                jArr3 = jArr;
                i9 = 8;
            }
        } else {
            c6 = 7;
            j3 = -9187201950435737472L;
            j4 = 255;
            j5 = 128;
        }
        k.N n5 = this.f8242l;
        if (!n5.h()) {
            return;
        }
        Object[] objArr2 = n5.f12490b;
        long[] jArr5 = n5.a;
        int length3 = jArr5.length - 2;
        if (length3 < 0) {
            return;
        }
        int i20 = 0;
        while (true) {
            long j14 = jArr5[i20];
            if ((((~j14) << c6) & j14 & j3) != j3) {
                int i21 = 8 - ((~(i20 - length3)) >>> 31);
                for (int i22 = 0; i22 < i21; i22++) {
                    if ((j14 & j4) < j5) {
                        int i23 = (i20 << 3) + i22;
                        if (!(((C0627q0) objArr2[i23]).f8196g != null)) {
                            n5.m(i23);
                        }
                    }
                    j14 >>= 8;
                }
                if (i21 != 8) {
                    return;
                }
            }
            if (i20 == length3) {
                return;
            } else {
                i20++;
            }
        }
    }

    public final boolean i() {
        boolean z5;
        synchronized (this.f8237g) {
            z5 = true;
            if (this.f8256z != 1) {
                z5 = false;
            }
            if (z5) {
                this.f8256z = 0;
            }
        }
        return z5;
    }

    public final void j(l4.e eVar) {
        try {
            synchronized (this.f8237g) {
                n();
                k.M m3 = this.f8247q;
                this.f8247q = Y4.l.t();
                try {
                    C0626q c0626q = this.f8255y;
                    G0 g02 = this.f8249s;
                    if (!c0626q.f8169e.f8556c.U()) {
                        AbstractC0629s.a("Expected applyChanges() to have been called");
                    }
                    c0626q.f8160P = g02;
                    try {
                        c0626q.n(m3, eVar);
                    } finally {
                        c0626q.f8160P = null;
                    }
                } catch (Throwable th) {
                    this.f8247q = m3;
                    throw th;
                }
            }
        } catch (Throwable th2) {
            try {
                if (!this.f8238h.f12506c.g()) {
                    C0879l c0879l = this.f8254x;
                    try {
                        c0879l.g(this.f8238h, this.f8255y.C());
                        c0879l.b();
                        c0879l.a();
                    } catch (Throwable th3) {
                        c0879l.a();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                a();
                throw th4;
            }
        }
    }

    public final C0611i0 k(boolean z5, l4.e eVar) {
        if (this.f8250t != null) {
            AbstractC0619m0.b("A pausable composition is in progress");
        }
        C0611i0 c0611i0 = new C0611i0(this, this.f8234c, this.f8255y, this.f8238h, eVar, z5, this.f8235e, this.f8237g);
        this.f8250t = c0611i0;
        return c0611i0;
    }

    public final void l() {
        C0879l c0879l;
        synchronized (this.f8237g) {
            try {
                if (this.f8250t != null) {
                    AbstractC0619m0.b("Deactivate is not supported while pausable composition is in progress");
                }
                boolean z5 = this.f8239i.f7967e > 0;
                try {
                    try {
                        if (!z5) {
                            if (!this.f8238h.f12506c.g()) {
                            }
                            this.f8240j.a();
                            this.f8243m.a();
                            this.f8247q.a();
                            this.f8244n.f8556c.S();
                            this.f8245o.f8556c.S();
                            C0626q c0626q = this.f8255y;
                            c0626q.f8149E.clear();
                            c0626q.f8183s.clear();
                            c0626q.f8169e.f8556c.S();
                            c0626q.f8186v = null;
                            this.f8256z = 1;
                        }
                        c0879l.g(this.f8238h, this.f8255y.C());
                        if (z5) {
                            M0 d6 = this.f8239i.d();
                            try {
                                d6.n(d6.f8004t, new I.m(11, this.f8254x, d6));
                                d6.e(true);
                                this.f8235e.n();
                                c0879l.c();
                            } catch (Throwable th) {
                                d6.e(false);
                                throw th;
                            }
                        }
                        c0879l.b();
                        c0879l.a();
                        this.f8240j.a();
                        this.f8243m.a();
                        this.f8247q.a();
                        this.f8244n.f8556c.S();
                        this.f8245o.f8556c.S();
                        C0626q c0626q2 = this.f8255y;
                        c0626q2.f8149E.clear();
                        c0626q2.f8183s.clear();
                        c0626q2.f8169e.f8556c.S();
                        c0626q2.f8186v = null;
                        this.f8256z = 1;
                    } catch (Throwable th2) {
                        c0879l.a();
                        throw th2;
                    }
                    c0879l = this.f8254x;
                } finally {
                    Trace.endSection();
                }
                Trace.beginSection("Compose:deactivate");
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void m() {
        synchronized (this.f8237g) {
            try {
                if (this.f8255y.f8150F) {
                    AbstractC0619m0.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.f8256z != 3) {
                    this.f8256z = 3;
                    C0670a c0670a = this.f8255y.f8156L;
                    if (c0670a != null) {
                        e(c0670a);
                    }
                    boolean z5 = this.f8239i.f7967e > 0;
                    if (z5 || !this.f8238h.f12506c.g()) {
                        C0879l c0879l = this.f8254x;
                        try {
                            c0879l.g(this.f8238h, this.f8255y.C());
                            if (z5) {
                                M0 d6 = this.f8239i.d();
                                try {
                                    d6.n(d6.f8004t, new B4.D(this.f8254x, 16));
                                    d6.H();
                                    d6.e(true);
                                    this.f8235e.a();
                                    this.f8235e.n();
                                    c0879l.c();
                                } catch (Throwable th) {
                                    d6.e(false);
                                    throw th;
                                }
                            }
                            c0879l.b();
                            c0879l.a();
                        } catch (Throwable th2) {
                            c0879l.a();
                            throw th2;
                        }
                    }
                    C0626q c0626q = this.f8255y;
                    c0626q.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        c0626q.f8166b.u(c0626q);
                        c0626q.f8149E.clear();
                        c0626q.f8183s.clear();
                        c0626q.f8169e.f8556c.S();
                        c0626q.f8186v = null;
                        c0626q.a.a();
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.f8234c.v(this);
    }

    public final void n() {
        Object obj = r.f8197b;
        AtomicReference atomicReference = this.f8236f;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                AbstractC0629s.b("pending composition has not been applied");
                throw new RuntimeException();
            }
            if (andSet instanceof Set) {
                c((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                AbstractC0629s.b("corrupt pendingModifications drain: " + atomicReference);
                throw new RuntimeException();
            }
            for (Set set : (Set[]) andSet) {
                c(set, true);
            }
        }
    }

    public final void o() {
        AtomicReference atomicReference = this.f8236f;
        Object andSet = atomicReference.getAndSet(null);
        if (AbstractC1276k.b(andSet, r.f8197b)) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                c(set, false);
            }
            return;
        }
        if (andSet != null) {
            AbstractC0629s.b("corrupt pendingModifications drain: " + atomicReference);
            throw new RuntimeException();
        }
        if (this.f8250t == null) {
            AbstractC0629s.a("calling recordModificationsOf and applyChanges concurrently is not supported");
        }
    }

    public final void p() {
        Y3.x xVar = Y3.x.f9814c;
        AtomicReference atomicReference = this.f8236f;
        Object andSet = atomicReference.getAndSet(xVar);
        if (AbstractC1276k.b(andSet, r.f8197b) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            AbstractC0629s.b("corrupt pendingModifications drain: " + atomicReference);
            throw new RuntimeException();
        }
        for (Set set : (Set[]) andSet) {
            c(set, false);
        }
    }

    public final void q() {
        int i6 = this.f8256z;
        if (i6 != 0) {
            AbstractC0619m0.b(i6 != 1 ? i6 != 2 ? i6 != 3 ? FlexmarkHtmlConverter.DEFAULT_NODE : "The composition is disposed" : "A previous pausable composition for this composition was cancelled. This composition must be disposed." : "The composition should be activated before setting content.");
        }
        if (this.f8250t == null) {
            return;
        }
        AbstractC0619m0.b("A pausable composition is in progress");
    }

    public final void r(ArrayList arrayList) {
        k.P p5 = this.f8238h;
        C0626q c0626q = this.f8255y;
        if (arrayList.size() > 0) {
            ((W) ((X3.i) arrayList.get(0)).f9393c).getClass();
            throw null;
        }
        try {
            c0626q.getClass();
            try {
                c0626q.F(arrayList);
                c0626q.i();
            } catch (Throwable th) {
                c0626q.a();
                throw th;
            }
        } catch (Throwable th2) {
            try {
                if (!p5.f12506c.g()) {
                    C0879l c0879l = this.f8254x;
                    try {
                        c0879l.g(p5, c0626q.C());
                        c0879l.b();
                        c0879l.a();
                    } catch (Throwable th3) {
                        c0879l.a();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                a();
                throw th4;
            }
        }
    }

    public final O s(C0627q0 c0627q0, Object obj) {
        C0639x c0639x;
        int i6 = c0627q0.f8191b;
        if ((i6 & 2) != 0) {
            c0627q0.f8191b = i6 | 4;
        }
        C0594a c0594a = c0627q0.f8192c;
        if (c0594a == null || !c0594a.a()) {
            return O.f8012c;
        }
        if (this.f8239i.e(c0594a)) {
            if (c0627q0.f8193d == null) {
                return O.f8012c;
            }
            O u5 = u(c0627q0, c0594a, obj);
            if (u5 != O.f8012c) {
                this.f8253w.i();
            }
            return u5;
        }
        synchronized (this.f8237g) {
            c0639x = this.f8251u;
        }
        if (c0639x != null) {
            C0626q c0626q = c0639x.f8255y;
            if (c0626q.f8150F && c0626q.h0(c0627q0, obj)) {
                return O.f8015g;
            }
        }
        return O.f8012c;
    }

    public final void t() {
        C0639x c0639x;
        synchronized (this.f8237g) {
            try {
                for (Object obj : this.f8239i.f7968f) {
                    C0627q0 c0627q0 = obj instanceof C0627q0 ? (C0627q0) obj : null;
                    if (c0627q0 != null && (c0639x = c0627q0.a) != null) {
                        c0639x.s(c0627q0, null);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final O u(C0627q0 c0627q0, C0594a c0594a, Object obj) {
        C0639x c0639x;
        int i6;
        synchronized (this.f8237g) {
            try {
                C0639x c0639x2 = this.f8251u;
                if (c0639x2 != null) {
                    J0 j02 = this.f8239i;
                    int i7 = this.f8252v;
                    if (j02.f7972j) {
                        AbstractC0629s.a("Writer is active");
                    }
                    if (i7 < 0 || i7 >= j02.f7967e) {
                        AbstractC0629s.a("Invalid group index");
                    }
                    if (j02.e(c0594a)) {
                        int i8 = j02.f7966c[(i7 * 5) + 3] + i7;
                        int i9 = c0594a.a;
                        c0639x = (i7 <= i9 && i9 < i8) ? c0639x2 : null;
                    }
                    c0639x2 = null;
                }
                if (c0639x == null) {
                    C0626q c0626q = this.f8255y;
                    if (c0626q.f8150F && c0626q.h0(c0627q0, obj)) {
                        return O.f8015g;
                    }
                    if (obj == null) {
                        this.f8247q.m(c0627q0, C0602e.f8082i);
                    } else if (obj instanceof E) {
                        Object g3 = this.f8247q.g(c0627q0);
                        if (g3 != null) {
                            if (g3 instanceof k.N) {
                                k.N n3 = (k.N) g3;
                                Object[] objArr = n3.f12490b;
                                long[] jArr = n3.a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i10 = 0;
                                    loop0: while (true) {
                                        long j3 = jArr[i10];
                                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i11 = 8;
                                            int i12 = 8 - ((~(i10 - length)) >>> 31);
                                            int i13 = 0;
                                            while (i13 < i12) {
                                                if ((j3 & 255) < 128) {
                                                    i6 = i11;
                                                    if (objArr[(i10 << 3) + i13] == C0602e.f8082i) {
                                                        break loop0;
                                                    }
                                                } else {
                                                    i6 = i11;
                                                }
                                                j3 >>= i6;
                                                i13++;
                                                i11 = i6;
                                            }
                                            if (i12 != i11) {
                                                break;
                                            }
                                        }
                                        if (i10 == length) {
                                            break;
                                        }
                                        i10++;
                                    }
                                }
                            } else if (g3 == C0602e.f8082i) {
                            }
                        }
                        Y4.l.l(this.f8247q, c0627q0, obj);
                    } else {
                        this.f8247q.m(c0627q0, C0602e.f8082i);
                    }
                }
                if (c0639x != null) {
                    return c0639x.u(c0627q0, c0594a, obj);
                }
                this.f8234c.l(this);
                return this.f8255y.f8150F ? O.f8014f : O.f8013e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void v(Object obj) {
        Object g3 = this.f8240j.g(obj);
        if (g3 == null) {
            return;
        }
        boolean z5 = g3 instanceof k.N;
        k.M m3 = this.f8246p;
        if (!z5) {
            C0627q0 c0627q0 = (C0627q0) g3;
            if (c0627q0.c(obj) == O.f8015g) {
                Y4.l.l(m3, obj, c0627q0);
                return;
            }
            return;
        }
        k.N n3 = (k.N) g3;
        Object[] objArr = n3.f12490b;
        long[] jArr = n3.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i6 = 0;
        while (true) {
            long j3 = jArr[i6];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i7 = 8 - ((~(i6 - length)) >>> 31);
                for (int i8 = 0; i8 < i7; i8++) {
                    if ((255 & j3) < 128) {
                        C0627q0 c0627q02 = (C0627q0) objArr[(i6 << 3) + i8];
                        if (c0627q02.c(obj) == O.f8015g) {
                            Y4.l.l(m3, obj, c0627q02);
                        }
                    }
                    j3 >>= 8;
                }
                if (i7 != 8) {
                    return;
                }
            }
            if (i6 == length) {
                return;
            } else {
                i6++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean w(java.util.Set r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            boolean r2 = r1 instanceof V.h
            k.M r3 = r0.f8243m
            k.M r4 = r0.f8240j
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L5e
            V.h r1 = (V.h) r1
            k.N r1 = r1.f8772c
            java.lang.Object[] r2 = r1.f12490b
            long[] r1 = r1.a
            int r7 = r1.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L7b
            r8 = r5
        L1c:
            r9 = r1[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L59
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r5
        L36:
            if (r13 >= r11) goto L57
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.32E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L53
            int r14 = r8 << 3
            int r14 = r14 + r13
            r14 = r2[r14]
            boolean r15 = r4.c(r14)
            if (r15 != 0) goto L52
            boolean r14 = r3.c(r14)
            if (r14 == 0) goto L53
        L52:
            return r6
        L53:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L36
        L57:
            if (r11 != r12) goto L7b
        L59:
            if (r8 == r7) goto L7b
            int r8 = r8 + 1
            goto L1c
        L5e:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L64:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L7b
            java.lang.Object r2 = r1.next()
            boolean r7 = r4.c(r2)
            if (r7 != 0) goto L7a
            boolean r2 = r3.c(r2)
            if (r2 == 0) goto L64
        L7a:
            return r6
        L7b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: T.C0639x.w(java.util.Set):boolean");
    }

    public final boolean x() {
        synchronized (this.f8237g) {
            C0611i0 c0611i0 = this.f8250t;
            boolean z5 = false;
            if (c0611i0 != null && (c0611i0.f8105h.get() != EnumC0613j0.f8118h || c0611i0.f8106i != AbstractC0874g.b())) {
                AtomicReference atomicReference = c0611i0.f8105h;
                EnumC0613j0 enumC0613j0 = EnumC0613j0.f8119i;
                EnumC0613j0 enumC0613j02 = EnumC0613j0.f8117g;
                while (!atomicReference.compareAndSet(enumC0613j0, enumC0613j02) && atomicReference.get() == enumC0613j0) {
                }
                c0611i0.f8109l.f8296c.a(9);
                return false;
            }
            n();
            try {
                k.M m3 = this.f8247q;
                this.f8247q = Y4.l.t();
                try {
                    C0626q c0626q = this.f8255y;
                    G0 g02 = this.f8249s;
                    U.M m5 = c0626q.f8169e.f8556c;
                    if (!m5.U()) {
                        AbstractC0629s.a("Expected applyChanges() to have been called");
                    }
                    if (m3.f12488e > 0 || !c0626q.f8183s.isEmpty()) {
                        c0626q.f8160P = g02;
                        try {
                            c0626q.n(m3, null);
                            c0626q.f8160P = null;
                            z5 = m5.V();
                        } catch (Throwable th) {
                            c0626q.f8160P = null;
                            throw th;
                        }
                    }
                    if (!z5) {
                        o();
                    }
                    return z5;
                } catch (Throwable th2) {
                    this.f8247q = m3;
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    if (!this.f8238h.f12506c.g()) {
                        C0879l c0879l = this.f8254x;
                        try {
                            c0879l.g(this.f8238h, this.f8255y.C());
                            c0879l.b();
                            c0879l.a();
                        } catch (Throwable th4) {
                            c0879l.a();
                            throw th4;
                        }
                    }
                    throw th3;
                } catch (Throwable th5) {
                    a();
                    throw th5;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.Set[]] */
    public final void y(V.h hVar) {
        V.h hVar2;
        while (true) {
            Object obj = this.f8236f.get();
            if (obj == null || obj.equals(r.f8197b)) {
                hVar2 = hVar;
            } else if (obj instanceof Set) {
                hVar2 = new Set[]{obj, hVar};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.f8236f).toString());
                }
                Set[] setArr = (Set[]) obj;
                int length = setArr.length;
                ?? copyOf = Arrays.copyOf(setArr, length + 1);
                copyOf[length] = hVar;
                hVar2 = copyOf;
            }
            AtomicReference atomicReference = this.f8236f;
            while (!atomicReference.compareAndSet(obj, hVar2)) {
                if (atomicReference.get() != obj) {
                    break;
                }
            }
            if (obj == null) {
                synchronized (this.f8237g) {
                    o();
                }
                return;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T.C0639x.z(java.lang.Object):void");
    }
}
