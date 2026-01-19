package r;

import H0.AbstractC0157l;
import java.util.ArrayList;
import m4.AbstractC1276k;
import n0.C1353b;
import y0.C1986a;

/* renamed from: r.G0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1522G0 {
    public final AbstractC1592o0 a;

    /* renamed from: b, reason: collision with root package name */
    public C1512B0 f14037b;

    /* renamed from: c, reason: collision with root package name */
    public C1518E0 f14038c;

    /* renamed from: d, reason: collision with root package name */
    public C1516D0 f14039d;

    /* renamed from: e, reason: collision with root package name */
    public C1514C0 f14040e;

    /* renamed from: f, reason: collision with root package name */
    public AbstractC1573i f14041f;

    /* renamed from: g, reason: collision with root package name */
    public A3.c f14042g;

    /* renamed from: h, reason: collision with root package name */
    public long f14043h = 9205357640488583168L;

    /* renamed from: i, reason: collision with root package name */
    public W4.a f14044i;

    /* renamed from: j, reason: collision with root package name */
    public final U4.n f14045j;

    /* renamed from: k, reason: collision with root package name */
    public final U4.n f14046k;

    /* renamed from: l, reason: collision with root package name */
    public long f14047l;

    /* JADX WARN: Type inference failed for: r3v1, types: [U4.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [U4.n, java.lang.Object] */
    public C1522G0(AbstractC1592o0 abstractC1592o0) {
        this.a = abstractC1592o0;
        Object obj = new Object();
        obj.f8749b = new ArrayList();
        this.f14045j = obj;
        Object obj2 = new Object();
        obj2.f8749b = new ArrayList();
        this.f14046k = obj2;
        this.f14047l = 0L;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, r.D0] */
    public static void c(C1522G0 c1522g0, y0.b bVar, long j3, long j4, int i6) {
        if ((i6 & 4) != 0) {
            j4 = 0;
        }
        AbstractC1592o0 abstractC1592o0 = c1522g0.a;
        C1516D0 c1516d0 = c1522g0.f14039d;
        C1516D0 c1516d02 = c1516d0;
        if (c1516d0 == null) {
            Object obj = new Object();
            obj.f14003d = null;
            obj.f14004e = Long.MAX_VALUE;
            obj.f14005f = false;
            c1522g0.f14039d = obj;
            c1516d02 = obj;
        }
        c1516d02.f14003d = bVar;
        c1516d02.f14004e = j3;
        W4.a aVar = c1522g0.f14044i;
        if (aVar == null) {
            c1522g0.f14044i = new W4.a(abstractC1592o0.f14420t, 2);
        } else {
            aVar.f9023b = abstractC1592o0.f14420t;
            aVar.a = j4;
        }
        c1516d02.f14005f = false;
        c1522g0.f14041f = c1516d02;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, r.B0] */
    public final void a() {
        C1512B0 c1512b0 = this.f14037b;
        EnumC1510A0 enumC1510A0 = EnumC1510A0.f13963f;
        C1512B0 c1512b02 = c1512b0;
        if (c1512b0 == null) {
            Object obj = new Object();
            obj.f13980d = enumC1510A0;
            obj.f13981e = false;
            this.f14037b = obj;
            c1512b02 = obj;
        }
        c1512b02.f13980d = enumC1510A0;
        c1512b02.f13981e = false;
        this.f14041f = c1512b02;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, r.C0] */
    public final void b(y0.b bVar, long j3, W4.a aVar) {
        C1514C0 c1514c0 = this.f14040e;
        C1514C0 c1514c02 = c1514c0;
        if (c1514c0 == null) {
            Object obj = new Object();
            obj.f13988d = null;
            obj.f13989e = Long.MAX_VALUE;
            this.f14040e = obj;
            c1514c02 = obj;
        }
        c1514c02.f13988d = bVar;
        c1514c02.f13989e = j3;
        aVar.a = 0L;
        this.f14041f = c1514c02;
    }

    public final A3.c d() {
        A3.c cVar = this.f14042g;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalArgumentException("Velocity Tracker not initialized.");
    }

    public final void e(y0.b bVar, C1986a c1986a, long j3) {
        AbstractC1592o0 abstractC1592o0 = this.a;
        long r5 = AbstractC0157l.u(abstractC1592o0).r(0L);
        if (!C1353b.c(this.f14043h, 9205357640488583168L) && !C1353b.c(r5, this.f14043h)) {
            this.f14047l = C1353b.f(this.f14047l, C1353b.e(r5, this.f14043h));
        }
        this.f14043h = r5;
        X0 x02 = abstractC1592o0.f14420t;
        AbstractC1276k.c(x02);
        C1598q0 c1598q0 = AbstractC1601r0.a;
        if (Math.abs(Float.intBitsToFloat((int) (x02 == X0.f14183c ? j3 & 4294967295L : j3 >> 32))) > 2.0f) {
            AbstractC1573i.a(d(), bVar, abstractC1592o0.f14420t, c1986a, this.f14045j, this.f14047l);
            U4.n nVar = this.f14046k;
            ArrayList arrayList = nVar.f8749b;
            if (arrayList.size() == 3) {
                int i6 = nVar.a;
                nVar.a = i6 + 1;
                arrayList.set(i6, new C1353b(j3));
            } else {
                arrayList.add(new C1353b(j3));
            }
            if (nVar.a == 3) {
                nVar.a = 0;
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                arrayList2.add(Float.valueOf(Float.intBitsToFloat((int) (((C1353b) arrayList.get(i7)).a >> 32))));
            }
            float i02 = (float) Y3.m.i0(arrayList2);
            ArrayList arrayList3 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i8 = 0; i8 < size2; i8++) {
                arrayList3.add(Float.valueOf(Float.intBitsToFloat((int) (((C1353b) arrayList.get(i8)).a & 4294967295L))));
            }
            abstractC1592o0.X0(new C1541S((Float.floatToRawIntBits((float) Y3.m.i0(arrayList3)) & 4294967295L) | (Float.floatToRawIntBits(i02) << 32), true));
        }
    }

    public final void f(y0.b bVar, y0.b bVar2, C1986a c1986a, long j3) {
        if (this.f14042g == null) {
            this.f14042g = new A3.c(3, (byte) 0);
        }
        this.f14047l = 0L;
        A3.c d6 = d();
        AbstractC1592o0 abstractC1592o0 = this.a;
        AbstractC1573i.a(d6, bVar, abstractC1592o0.f14420t, c1986a, this.f14045j, this.f14047l);
        long e6 = C1353b.e(AbstractC1573i.k(bVar2, abstractC1592o0.f14420t, c1986a), j3);
        if (((Boolean) abstractC1592o0.f14421u.f(new B0.L(1))).booleanValue()) {
            this.f14043h = AbstractC0157l.u(abstractC1592o0).r(0L);
            abstractC1592o0.X0(new C1542T(e6));
        }
        U4.n nVar = this.f14046k;
        nVar.a = 0;
        nVar.f8749b.clear();
    }
}
