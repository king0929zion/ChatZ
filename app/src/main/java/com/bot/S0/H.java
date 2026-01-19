package S0;

import d1.C0936c;

/* loaded from: classes.dex */
public abstract class H {
    public static final long a = s4.j.z(14);

    /* renamed from: b, reason: collision with root package name */
    public static final long f7586b = s4.j.z(0);

    /* renamed from: c, reason: collision with root package name */
    public static final long f7587c = o0.s.f13480g;

    /* renamed from: d, reason: collision with root package name */
    public static final d1.o f7588d;

    static {
        long j3 = o0.s.f13475b;
        f7588d = j3 != 16 ? new C0936c(j3) : d1.n.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x00b6, code lost:
    
        if (r15.equals(r24.f7578i) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x00c5, code lost:
    
        if (r39.equals(r24.f7579j) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x00d4, code lost:
    
        if (r40.equals(r24.f7580k) == false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final S0.G a(S0.G r24, long r25, o0.AbstractC1404o r27, float r28, long r29, W0.k r31, W0.i r32, W0.j r33, W0.p r34, java.lang.String r35, long r36, d1.C0934a r38, d1.p r39, Z0.b r40, long r41, d1.l r43, o0.C1389K r44, S0.x r45, q0.AbstractC1499e r46) {
        /*
            Method dump skipped, instructions count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S0.H.a(S0.G, long, o0.o, float, long, W0.k, W0.i, W0.j, W0.p, java.lang.String, long, d1.a, d1.p, Z0.b, long, d1.l, o0.K, S0.x, q0.e):S0.G");
    }

    public static final Object b(Object obj, Object obj2, float f6) {
        return ((double) f6) < 0.5d ? obj : obj2;
    }

    public static final long c(long j3, long j4, float f6) {
        e1.p[] pVarArr = e1.o.f11579b;
        long j5 = j3 & 1095216660480L;
        if (j5 != 0) {
            long j6 = 1095216660480L & j4;
            if (j6 != 0) {
                if (j5 == 0 || j6 == 0) {
                    e1.i.a("Cannot perform operation for Unspecified type.");
                }
                if (!e1.p.a(e1.o.b(j3), e1.o.b(j4))) {
                    e1.i.a("Cannot perform operation for " + ((Object) e1.p.b(e1.o.b(j3))) + " and " + ((Object) e1.p.b(e1.o.b(j4))));
                }
                return s4.j.B(Y3.C.B(e1.o.c(j3), e1.o.c(j4), f6), j5);
            }
        }
        return ((e1.o) b(new e1.o(j3), new e1.o(j4), f6)).a;
    }
}
