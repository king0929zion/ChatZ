package p0;

import F0.F;

/* renamed from: p0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1468d {
    public static final float[] a;

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f13838b;

    /* renamed from: c, reason: collision with root package name */
    public static final C1482r f13839c;

    /* renamed from: d, reason: collision with root package name */
    public static final C1482r f13840d;

    /* renamed from: e, reason: collision with root package name */
    public static final C1481q f13841e;

    /* renamed from: f, reason: collision with root package name */
    public static final C1481q f13842f;

    /* renamed from: g, reason: collision with root package name */
    public static final C1481q f13843g;

    /* renamed from: h, reason: collision with root package name */
    public static final C1481q f13844h;

    /* renamed from: i, reason: collision with root package name */
    public static final C1481q f13845i;

    /* renamed from: j, reason: collision with root package name */
    public static final C1481q f13846j;

    /* renamed from: k, reason: collision with root package name */
    public static final C1481q f13847k;

    /* renamed from: l, reason: collision with root package name */
    public static final C1481q f13848l;

    /* renamed from: m, reason: collision with root package name */
    public static final C1481q f13849m;

    /* renamed from: n, reason: collision with root package name */
    public static final C1481q f13850n;

    /* renamed from: o, reason: collision with root package name */
    public static final C1481q f13851o;

    /* renamed from: p, reason: collision with root package name */
    public static final C1481q f13852p;

    /* renamed from: q, reason: collision with root package name */
    public static final C1481q f13853q;

    /* renamed from: r, reason: collision with root package name */
    public static final C1481q f13854r;

    /* renamed from: s, reason: collision with root package name */
    public static final C1475k f13855s;

    /* renamed from: t, reason: collision with root package name */
    public static final C1475k f13856t;

    /* renamed from: u, reason: collision with root package name */
    public static final C1481q f13857u;

    /* renamed from: v, reason: collision with root package name */
    public static final C1481q f13858v;

    /* renamed from: w, reason: collision with root package name */
    public static final C1481q f13859w;

    /* renamed from: x, reason: collision with root package name */
    public static final C1476l f13860x;

    /* renamed from: y, reason: collision with root package name */
    public static final AbstractC1467c[] f13861y;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [p0.c, p0.l] */
    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f13838b = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        C1482r c1482r = new C1482r(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        C1482r c1482r2 = new C1482r(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        C1482r c1482r3 = new C1482r(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        f13839c = c1482r3;
        C1482r c1482r4 = new C1482r(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        f13840d = c1482r4;
        C1483s c1483s = AbstractC1474j.f13870d;
        C1481q c1481q = new C1481q("sRGB IEC61966-2.1", fArr, c1483s, c1482r, 0);
        f13841e = c1481q;
        C1481q c1481q2 = new C1481q("sRGB IEC61966-2.1 (Linear)", fArr, c1483s, 1.0d, S.l.f7374V, 1.0f, 1);
        f13842f = c1481q2;
        C1481q c1481q3 = new C1481q("scRGB-nl IEC 61966-2-2:2003", fArr, c1483s, null, new F(11), new F(12), -0.799f, 2.399f, c1482r, 2);
        f13843g = c1481q3;
        C1481q c1481q4 = new C1481q("scRGB IEC 61966-2-2:2003", fArr, c1483s, 1.0d, -0.5f, 7.499f, 3);
        f13844h = c1481q4;
        C1481q c1481q5 = new C1481q("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, c1483s, new C1482r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        f13845i = c1481q5;
        C1481q c1481q6 = new C1481q("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, c1483s, new C1482r(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        f13846j = c1481q6;
        C1481q c1481q7 = new C1481q("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new C1483s(0.314f, 0.351f), 2.6d, S.l.f7374V, 1.0f, 6);
        f13847k = c1481q7;
        C1481q c1481q8 = new C1481q("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, c1483s, c1482r, 7);
        f13848l = c1481q8;
        C1481q c1481q9 = new C1481q("NTSC (1953)", fArr2, AbstractC1474j.a, new C1482r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 8);
        f13849m = c1481q9;
        C1481q c1481q10 = new C1481q("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, c1483s, new C1482r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 9);
        f13850n = c1481q10;
        C1481q c1481q11 = new C1481q("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, c1483s, 2.2d, S.l.f7374V, 1.0f, 10);
        f13851o = c1481q11;
        C1481q c1481q12 = new C1481q("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, AbstractC1474j.f13868b, new C1482r(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        f13852p = c1481q12;
        float[] fArr4 = {0.7347f, 0.2653f, S.l.f7374V, 1.0f, 1.0E-4f, -0.077f};
        C1483s c1483s2 = AbstractC1474j.f13869c;
        C1481q c1481q13 = new C1481q("SMPTE ST 2065-1:2012 ACES", fArr4, c1483s2, 1.0d, -65504.0f, 65504.0f, 12);
        f13853q = c1481q13;
        C1481q c1481q14 = new C1481q("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, c1483s2, 1.0d, -65504.0f, 65504.0f, 13);
        f13854r = c1481q14;
        C1475k c1475k = new C1475k(AbstractC1466b.f13832b, "Generic XYZ", 14, 1);
        f13855s = c1475k;
        long j3 = AbstractC1466b.f13833c;
        C1475k c1475k2 = new C1475k(j3, "Generic L*a*b*", 15, 0);
        f13856t = c1475k2;
        C1481q c1481q15 = new C1481q("None", fArr, c1483s, c1482r2, 16);
        f13857u = c1481q15;
        C1481q c1481q16 = new C1481q("Hybrid Log Gamma encoding", fArr3, c1483s, null, new F(13), new F(14), S.l.f7374V, 1.0f, c1482r3, 17);
        f13858v = c1481q16;
        C1481q c1481q17 = new C1481q("Perceptual Quantizer encoding", fArr3, c1483s, null, new F(15), new F(16), S.l.f7374V, 1.0f, c1482r4, 18);
        f13859w = c1481q17;
        AbstractC1467c abstractC1467c = new AbstractC1467c(j3, "Oklab", 19);
        f13860x = abstractC1467c;
        f13861y = new AbstractC1467c[]{c1481q, c1481q2, c1481q3, c1481q4, c1481q5, c1481q6, c1481q7, c1481q8, c1481q9, c1481q10, c1481q11, c1481q12, c1481q13, c1481q14, c1475k, c1475k2, c1481q15, c1481q16, c1481q17, abstractC1467c};
    }

    public static double a(C1482r c1482r, double d6) {
        double d7 = d6 < 0.0d ? -1.0d : 1.0d;
        double d8 = d6 * d7;
        double d9 = c1482r.f13900b;
        double d10 = c1482r.f13901c;
        double d11 = c1482r.f13902d;
        double d12 = c1482r.f13903e;
        double d13 = c1482r.f13904f;
        double d14 = d9 * d8;
        return (c1482r.f13905g + 1.0d) * d7 * (d14 <= 1.0d ? Math.pow(d14, d10) : Math.exp((d8 - d13) * d11) + d12);
    }

    public static double b(C1482r c1482r, double d6) {
        double d7 = d6 < 0.0d ? -1.0d : 1.0d;
        double d8 = 1.0d / c1482r.f13900b;
        double d9 = 1.0d / c1482r.f13901c;
        double d10 = 1.0d / c1482r.f13902d;
        double d11 = c1482r.f13903e;
        double d12 = c1482r.f13904f;
        double d13 = (d6 * d7) / (c1482r.f13905g + 1.0d);
        return d7 * (d13 <= 1.0d ? Math.pow(d13, d9) * d8 : (Math.log(d13 - d11) * d10) + d12);
    }

    public static double c(C1482r c1482r, double d6) {
        double d7 = d6 < 0.0d ? -1.0d : 1.0d;
        double d8 = d6 * d7;
        double d9 = c1482r.f13900b;
        double d10 = c1482r.f13902d;
        double pow = (Math.pow(d8, d10) * c1482r.f13901c) + d9;
        return Math.pow((pow >= 0.0d ? pow : 0.0d) / ((Math.pow(d8, d10) * c1482r.f13904f) + c1482r.f13903e), c1482r.f13905g) * d7;
    }

    public static double d(C1482r c1482r, double d6) {
        double d7 = d6 < 0.0d ? -1.0d : 1.0d;
        double d8 = d6 * d7;
        double d9 = -c1482r.f13900b;
        double d10 = c1482r.f13903e;
        double d11 = 1.0d / c1482r.f13905g;
        return Math.pow(Math.max((Math.pow(d8, d11) * d10) + d9, 0.0d) / ((Math.pow(d8, d11) * (-c1482r.f13904f)) + c1482r.f13901c), 1.0d / c1482r.f13902d) * d7;
    }
}
