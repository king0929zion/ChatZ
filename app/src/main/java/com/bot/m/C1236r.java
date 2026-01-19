package m;

import T.d1;
import m4.AbstractC1277l;
import v.AbstractC1787b;

/* renamed from: m.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1236r extends AbstractC1277l implements l4.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f12829e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1237s f12830f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1236r(C1237s c1237s, int i6) {
        super(1);
        this.f12829e = i6;
        this.f12830f = c1237s;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f12829e) {
            case 0:
                int intValue = ((Number) obj).intValue();
                C1237s c1237s = this.f12830f;
                long j3 = intValue;
                return Integer.valueOf(((int) (C1237s.d(c1237s) >> 32)) - ((int) (c1237s.f12831b.a((j3 << 32) | (j3 & 4294967295L), C1237s.d(c1237s), e1.m.f11576c) >> 32)));
            case 1:
                int intValue2 = ((Number) obj).intValue();
                long j4 = intValue2;
                long j5 = (j4 << 32) | (j4 & 4294967295L);
                C1237s c1237s2 = this.f12830f;
                return Integer.valueOf((-((int) (c1237s2.f12831b.a(j5, C1237s.d(c1237s2), e1.m.f11576c) >> 32))) - intValue2);
            case 2:
                int intValue3 = ((Number) obj).intValue();
                C1237s c1237s3 = this.f12830f;
                long j6 = intValue3;
                return Integer.valueOf(((int) (C1237s.d(c1237s3) & 4294967295L)) - ((int) (c1237s3.f12831b.a((j6 << 32) | (j6 & 4294967295L), C1237s.d(c1237s3), e1.m.f11576c) & 4294967295L)));
            case 3:
                int intValue4 = ((Number) obj).intValue();
                long j7 = intValue4;
                long j8 = (j7 << 32) | (j7 & 4294967295L);
                C1237s c1237s4 = this.f12830f;
                return Integer.valueOf((-((int) (c1237s4.f12831b.a(j8, C1237s.d(c1237s4), e1.m.f11576c) & 4294967295L))) - intValue4);
            case 4:
                int intValue5 = ((Number) obj).intValue();
                C1237s c1237s5 = this.f12830f;
                d1 d1Var = (d1) c1237s5.f12834e.g(c1237s5.a.f13280d.getValue());
                long j9 = d1Var != null ? ((e1.l) d1Var.getValue()).a : 0L;
                long j10 = intValue5;
                return Integer.valueOf((-((int) (c1237s5.f12831b.a((j10 << 32) | (j10 & 4294967295L), j9, e1.m.f11576c) >> 32))) - intValue5);
            case AbstractC1787b.f15290g /* 5 */:
                int intValue6 = ((Number) obj).intValue();
                C1237s c1237s6 = this.f12830f;
                d1 d1Var2 = (d1) c1237s6.f12834e.g(c1237s6.a.f13280d.getValue());
                long j11 = d1Var2 != null ? ((e1.l) d1Var2.getValue()).a : 0L;
                long j12 = intValue6;
                return Integer.valueOf((-((int) (c1237s6.f12831b.a((j12 << 32) | (j12 & 4294967295L), j11, e1.m.f11576c) >> 32))) + ((int) (j11 >> 32)));
            case 6:
                int intValue7 = ((Number) obj).intValue();
                C1237s c1237s7 = this.f12830f;
                d1 d1Var3 = (d1) c1237s7.f12834e.g(c1237s7.a.f13280d.getValue());
                long j13 = d1Var3 != null ? ((e1.l) d1Var3.getValue()).a : 0L;
                long j14 = intValue7;
                return Integer.valueOf((-((int) (c1237s7.f12831b.a((j14 << 32) | (j14 & 4294967295L), j13, e1.m.f11576c) & 4294967295L))) - intValue7);
            default:
                int intValue8 = ((Number) obj).intValue();
                C1237s c1237s8 = this.f12830f;
                d1 d1Var4 = (d1) c1237s8.f12834e.g(c1237s8.a.f13280d.getValue());
                long j15 = d1Var4 != null ? ((e1.l) d1Var4.getValue()).a : 0L;
                long j16 = intValue8;
                return Integer.valueOf((-((int) (c1237s8.f12831b.a((j16 << 32) | (j16 & 4294967295L), j15, e1.m.f11576c) & 4294967295L))) + ((int) (j15 & 4294967295L)));
        }
    }
}
