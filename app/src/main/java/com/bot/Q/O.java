package Q;

import S.AbstractC0538e;
import T.AbstractC0623o0;
import T.C0626q;
import com.vladsch.flexmark.parser.PegdownExtensions;
import org.jsoup.internal.SharedConstants;
import v.AbstractC1787b;

/* loaded from: classes.dex */
public abstract class O {
    public static final T.e1 a = new AbstractC0623o0(new O.A(7));

    /* renamed from: b, reason: collision with root package name */
    public static final T.e1 f5451b = new AbstractC0623o0(new O.A(8));

    public static final long a(N n3, long j3) {
        long j4 = n3.a;
        long j5 = n3.f5398U;
        long j6 = n3.f5394Q;
        long j7 = n3.f5390M;
        long j8 = n3.f5427q;
        if (o0.s.d(j3, j4)) {
            return n3.f5405b;
        }
        if (o0.s.d(j3, n3.f5413f)) {
            return n3.f5415g;
        }
        if (o0.s.d(j3, n3.f5420j)) {
            return n3.f5421k;
        }
        if (o0.s.d(j3, n3.f5424n)) {
            return n3.f5425o;
        }
        if (o0.s.d(j3, n3.f5433w)) {
            return n3.f5434x;
        }
        if (o0.s.d(j3, n3.f5407c)) {
            return n3.f5409d;
        }
        if (o0.s.d(j3, n3.f5417h)) {
            return n3.f5419i;
        }
        if (o0.s.d(j3, n3.f5422l)) {
            return n3.f5423m;
        }
        if (o0.s.d(j3, n3.f5435y)) {
            return n3.f5436z;
        }
        if (o0.s.d(j3, n3.f5431u)) {
            return n3.f5432v;
        }
        if (o0.s.d(j3, n3.f5426p)) {
            return j8;
        }
        if (o0.s.d(j3, n3.f5428r)) {
            return n3.f5429s;
        }
        if (o0.s.d(j3, n3.f5381D) || o0.s.d(j3, n3.f5383F) || o0.s.d(j3, n3.f5384G) || o0.s.d(j3, n3.f5385H) || o0.s.d(j3, n3.f5386I) || o0.s.d(j3, n3.f5387J) || o0.s.d(j3, n3.f5382E)) {
            return j8;
        }
        if (o0.s.d(j3, n3.f5388K) || o0.s.d(j3, n3.f5389L)) {
            return j7;
        }
        if (o0.s.d(j3, n3.f5392O) || o0.s.d(j3, n3.f5393P)) {
            return j6;
        }
        if (o0.s.d(j3, n3.f5396S) || o0.s.d(j3, n3.f5397T)) {
            return j5;
        }
        int i6 = o0.s.f13482i;
        return o0.s.f13481h;
    }

    public static final long b(long j3, C0626q c0626q) {
        c0626q.b0(89374938);
        long a6 = a((N) c0626q.j(a), j3);
        if (a6 == 16) {
            a6 = ((o0.s) c0626q.j(U.a)).a;
        }
        c0626q.p(false);
        return a6;
    }

    public static final long c(N n3, S.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return n3.f5424n;
            case 1:
                return n3.f5433w;
            case 2:
                return n3.f5435y;
            case 3:
                return n3.f5432v;
            case 4:
                return n3.f5411e;
            case AbstractC1787b.f15290g /* 5 */:
                return n3.f5431u;
            case 6:
                return n3.f5425o;
            case 7:
                return n3.f5434x;
            case 8:
                return n3.f5436z;
            case AbstractC1787b.f15287d /* 9 */:
                return n3.f5405b;
            case AbstractC1787b.f15289f /* 10 */:
                return n3.f5409d;
            case 11:
                return n3.f5390M;
            case 12:
                return n3.f5391N;
            case 13:
                return n3.f5415g;
            case 14:
                return n3.f5419i;
            case 15:
                return n3.f5394Q;
            case PegdownExtensions.AUTOLINKS /* 16 */:
                return n3.f5395R;
            case 17:
                return n3.f5427q;
            case 18:
                return n3.f5429s;
            case 19:
                return n3.f5421k;
            case 20:
                return n3.f5423m;
            case 21:
                return n3.f5398U;
            case 22:
                return n3.f5399V;
            case 23:
                return n3.f5378A;
            case 24:
                return n3.f5379B;
            case 25:
                return n3.a;
            case 26:
                return n3.f5407c;
            case 27:
                return n3.f5388K;
            case 28:
                return n3.f5389L;
            case 29:
                return n3.f5380C;
            case 30:
                return n3.f5413f;
            case 31:
                return n3.f5417h;
            case 32:
                return n3.f5392O;
            case 33:
                return n3.f5393P;
            case 34:
                return n3.f5426p;
            case 35:
                return n3.f5381D;
            case 36:
                return n3.f5383F;
            case 37:
                return n3.f5384G;
            case 38:
                return n3.f5385H;
            case 39:
                return n3.f5386I;
            case 40:
                return n3.f5387J;
            case 41:
                return n3.f5382E;
            case 42:
                return n3.f5430t;
            case 43:
                return n3.f5428r;
            case 44:
                return n3.f5420j;
            case 45:
                return n3.f5422l;
            case 46:
                return n3.f5396S;
            case 47:
                return n3.f5397T;
            default:
                throw new RuntimeException();
        }
    }

    public static final long d(S.f fVar, C0626q c0626q) {
        return c((N) c0626q.j(a), fVar);
    }

    public static N e(long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, int i6, int i7) {
        long j47 = (i6 & 1) != 0 ? AbstractC0538e.f7301z : j3;
        return new N(j47, (i6 & 2) != 0 ? AbstractC0538e.f7285j : j4, (i6 & 4) != 0 ? AbstractC0538e.f7256A : j5, (i6 & 8) != 0 ? AbstractC0538e.f7286k : j6, (i6 & 16) != 0 ? AbstractC0538e.f7280e : j7, (i6 & 32) != 0 ? AbstractC0538e.f7260E : j8, (i6 & 64) != 0 ? AbstractC0538e.f7289n : j9, (i6 & PegdownExtensions.FENCED_CODE_BLOCKS) != 0 ? AbstractC0538e.f7261F : j10, (i6 & PegdownExtensions.WIKILINKS) != 0 ? AbstractC0538e.f7290o : j11, (i6 & PegdownExtensions.STRIKETHROUGH) != 0 ? AbstractC0538e.f7273R : j12, (i6 & PegdownExtensions.ANCHORLINKS) != 0 ? AbstractC0538e.f7295t : j13, (i6 & 2048) != 0 ? AbstractC0538e.f7274S : j14, (i6 & 4096) != 0 ? AbstractC0538e.f7296u : j15, (i6 & 8192) != 0 ? AbstractC0538e.a : j16, (i6 & 16384) != 0 ? AbstractC0538e.f7282g : j17, (i6 & SharedConstants.DefaultBufferSize) != 0 ? AbstractC0538e.f7264I : j18, (65536 & i6) != 0 ? AbstractC0538e.f7293r : j19, (131072 & i6) != 0 ? AbstractC0538e.f7272Q : j20, (262144 & i6) != 0 ? AbstractC0538e.f7294s : j21, (524288 & i6) != 0 ? j47 : j22, (1048576 & i6) != 0 ? AbstractC0538e.f7281f : j23, (2097152 & i6) != 0 ? AbstractC0538e.f7279d : j24, AbstractC0538e.f7277b, AbstractC0538e.f7283h, AbstractC0538e.f7278c, AbstractC0538e.f7284i, (67108864 & i6) != 0 ? AbstractC0538e.f7299x : j25, (134217728 & i6) != 0 ? AbstractC0538e.f7300y : j26, (268435456 & i6) != 0 ? AbstractC0538e.f7259D : j27, (536870912 & i6) != 0 ? AbstractC0538e.f7265J : j28, (i7 & 8) != 0 ? AbstractC0538e.f7271P : j34, (1073741824 & i6) != 0 ? AbstractC0538e.f7266K : j29, (i6 & Integer.MIN_VALUE) != 0 ? AbstractC0538e.f7267L : j30, (i7 & 1) != 0 ? AbstractC0538e.f7268M : j31, (i7 & 2) != 0 ? AbstractC0538e.f7269N : j32, (i7 & 4) != 0 ? AbstractC0538e.f7270O : j33, (i7 & 16) != 0 ? AbstractC0538e.f7257B : j35, (i7 & 32) != 0 ? AbstractC0538e.f7258C : j36, (i7 & 64) != 0 ? AbstractC0538e.f7287l : j37, (i7 & PegdownExtensions.FENCED_CODE_BLOCKS) != 0 ? AbstractC0538e.f7288m : j38, (i7 & PegdownExtensions.WIKILINKS) != 0 ? AbstractC0538e.f7262G : j39, (i7 & PegdownExtensions.STRIKETHROUGH) != 0 ? AbstractC0538e.f7263H : j40, (i7 & PegdownExtensions.ANCHORLINKS) != 0 ? AbstractC0538e.f7291p : j41, (i7 & 2048) != 0 ? AbstractC0538e.f7292q : j42, (i7 & 4096) != 0 ? AbstractC0538e.f7275T : j43, (i7 & 8192) != 0 ? AbstractC0538e.f7276U : j44, (i7 & 16384) != 0 ? AbstractC0538e.f7297v : j45, (i7 & SharedConstants.DefaultBufferSize) != 0 ? AbstractC0538e.f7298w : j46);
    }
}
