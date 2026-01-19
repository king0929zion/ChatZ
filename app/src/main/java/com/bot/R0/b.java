package r0;

import B0.B;
import B0.G;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import e1.InterfaceC0961c;
import e1.m;
import i4.AbstractC1118b;
import java.util.Locale;
import k.N;
import k.W;
import m4.AbstractC1276k;
import m4.AbstractC1277l;
import n0.C1353b;
import n0.C1354c;
import n0.C1356e;
import o0.C1383E;
import o0.C1384F;
import o0.C1385G;
import o0.C1397h;
import o0.y;
import o4.AbstractC1410a;
import q0.AbstractC1497c;
import q0.C1496b;
import q0.InterfaceC1498d;

/* loaded from: classes.dex */
public final class b {
    public final d a;

    /* renamed from: f, reason: collision with root package name */
    public Outline f14538f;

    /* renamed from: j, reason: collision with root package name */
    public float f14542j;

    /* renamed from: k, reason: collision with root package name */
    public y f14543k;

    /* renamed from: l, reason: collision with root package name */
    public C1397h f14544l;

    /* renamed from: m, reason: collision with root package name */
    public C1397h f14545m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f14546n;

    /* renamed from: o, reason: collision with root package name */
    public C1496b f14547o;

    /* renamed from: p, reason: collision with root package name */
    public L1.d f14548p;

    /* renamed from: q, reason: collision with root package name */
    public int f14549q;

    /* renamed from: s, reason: collision with root package name */
    public boolean f14551s;

    /* renamed from: t, reason: collision with root package name */
    public long f14552t;

    /* renamed from: u, reason: collision with root package name */
    public long f14553u;

    /* renamed from: v, reason: collision with root package name */
    public long f14554v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f14555w;

    /* renamed from: x, reason: collision with root package name */
    public RectF f14556x;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0961c f14534b = AbstractC1497c.a;

    /* renamed from: c, reason: collision with root package name */
    public m f14535c = m.f11576c;

    /* renamed from: d, reason: collision with root package name */
    public AbstractC1277l f14536d = C1627a.f14531f;

    /* renamed from: e, reason: collision with root package name */
    public final G f14537e = new G(this, 27);

    /* renamed from: g, reason: collision with root package name */
    public boolean f14539g = true;

    /* renamed from: h, reason: collision with root package name */
    public long f14540h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f14541i = 9205357640488583168L;

    /* renamed from: r, reason: collision with root package name */
    public final B f14550r = new Object();

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        AbstractC1276k.e(lowerCase, "toLowerCase(...)");
        lowerCase.equals("robolectric");
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, B0.B] */
    public b(d dVar) {
        this.a = dVar;
        dVar.D(false);
        this.f14552t = 0L;
        this.f14553u = 0L;
        this.f14554v = 9205357640488583168L;
    }

    public final void a() {
        Outline outline;
        if (this.f14539g) {
            boolean z5 = this.f14555w;
            Outline outline2 = null;
            d dVar = this.a;
            if (z5 || dVar.L() > S.l.f7374V) {
                C1397h c1397h = this.f14544l;
                if (c1397h != null) {
                    RectF rectF = this.f14556x;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.f14556x = rectF;
                    }
                    boolean z6 = c1397h instanceof C1397h;
                    if (!z6) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    Path path = c1397h.a;
                    path.computeBounds(rectF, false);
                    int i6 = Build.VERSION.SDK_INT;
                    if (i6 > 28 || c1397h.a.isConvex()) {
                        outline = this.f14538f;
                        if (outline == null) {
                            outline = new Outline();
                            this.f14538f = outline;
                        }
                        if (i6 >= 30) {
                            if (!z6) {
                                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                            }
                            outline.setPath(path);
                        } else {
                            if (!z6) {
                                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                            }
                            outline.setConvexPath(path);
                        }
                        this.f14546n = !outline.canClip();
                    } else {
                        Outline outline3 = this.f14538f;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.f14546n = true;
                        outline = null;
                    }
                    this.f14544l = c1397h;
                    if (outline != null) {
                        outline.setAlpha(dVar.a());
                        outline2 = outline;
                    }
                    dVar.g(outline2, (4294967295L & Math.round(rectF.height())) | (Math.round(rectF.width()) << 32));
                    if (this.f14546n && this.f14555w) {
                        dVar.D(false);
                        dVar.i();
                    } else {
                        dVar.D(this.f14555w);
                    }
                } else {
                    dVar.D(this.f14555w);
                    Outline outline4 = this.f14538f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f14538f = outline4;
                    }
                    Outline outline5 = outline4;
                    long S5 = AbstractC1410a.S(this.f14553u);
                    long j3 = this.f14540h;
                    long j4 = this.f14541i;
                    if (j4 != 9205357640488583168L) {
                        S5 = j4;
                    }
                    int i7 = (int) (j3 >> 32);
                    int i8 = (int) (j3 & 4294967295L);
                    int i9 = (int) (S5 >> 32);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i7)), Math.round(Float.intBitsToFloat(i8)), Math.round(Float.intBitsToFloat(i9) + Float.intBitsToFloat(i7)), Math.round(Float.intBitsToFloat((int) (S5 & 4294967295L)) + Float.intBitsToFloat(i8)), this.f14542j);
                    outline5.setAlpha(dVar.a());
                    dVar.g(outline5, (4294967295L & Math.round(Float.intBitsToFloat(r15))) | (Math.round(Float.intBitsToFloat(i9)) << 32));
                }
            } else {
                dVar.D(false);
                dVar.g(null, 0L);
            }
        }
        this.f14539g = false;
    }

    public final void b() {
        if (this.f14551s && this.f14549q == 0) {
            B b5 = this.f14550r;
            b bVar = (b) b5.f378b;
            if (bVar != null) {
                bVar.e();
                b5.f378b = null;
            }
            N n3 = (N) b5.f380d;
            if (n3 != null) {
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
                                    ((b) objArr[(i6 << 3) + i8]).e();
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
                n3.b();
            }
            this.a.i();
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [m4.l, l4.c] */
    public final void c(InterfaceC1498d interfaceC1498d) {
        B b5 = this.f14550r;
        b5.f379c = (b) b5.f378b;
        N n3 = (N) b5.f380d;
        if (n3 != null && n3.h()) {
            N n5 = (N) b5.f381e;
            if (n5 == null) {
                N n6 = W.a;
                n5 = new N();
                b5.f381e = n5;
            }
            n5.k(n3);
            n3.b();
        }
        b5.a = true;
        this.f14536d.f(interfaceC1498d);
        b5.a = false;
        b bVar = (b) b5.f379c;
        if (bVar != null) {
            bVar.e();
        }
        N n7 = (N) b5.f381e;
        if (n7 == null || !n7.h()) {
            return;
        }
        Object[] objArr = n7.f12490b;
        long[] jArr = n7.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i6 = 0;
            while (true) {
                long j3 = jArr[i6];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                    for (int i8 = 0; i8 < i7; i8++) {
                        if ((255 & j3) < 128) {
                            ((b) objArr[(i6 << 3) + i8]).e();
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
        n7.b();
    }

    public final y d() {
        y c1384f;
        y yVar = this.f14543k;
        C1397h c1397h = this.f14544l;
        if (yVar != null) {
            return yVar;
        }
        if (c1397h != null) {
            C1383E c1383e = new C1383E(c1397h);
            this.f14543k = c1383e;
            return c1383e;
        }
        long S5 = AbstractC1410a.S(this.f14553u);
        long j3 = this.f14540h;
        long j4 = this.f14541i;
        if (j4 != 9205357640488583168L) {
            S5 = j4;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (S5 >> 32)) + intBitsToFloat;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (S5 & 4294967295L)) + intBitsToFloat2;
        if (this.f14542j > S.l.f7374V) {
            c1384f = new C1385G(AbstractC1118b.c(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4, (Float.floatToRawIntBits(r0) << 32) | (4294967295L & Float.floatToRawIntBits(r0))));
        } else {
            c1384f = new C1384F(new C1354c(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4));
        }
        this.f14543k = c1384f;
        return c1384f;
    }

    public final void e() {
        this.f14549q--;
        b();
    }

    public final void f(float f6) {
        d dVar = this.a;
        if (dVar.a() == f6) {
            return;
        }
        dVar.u(f6);
    }

    public final void g(long j3, long j4, float f6) {
        if (C1353b.c(this.f14540h, j3) && C1356e.a(this.f14541i, j4) && this.f14542j == f6 && this.f14544l == null) {
            return;
        }
        this.f14543k = null;
        this.f14544l = null;
        this.f14539g = true;
        this.f14546n = false;
        this.f14540h = j3;
        this.f14541i = j4;
        this.f14542j = f6;
        a();
    }
}
