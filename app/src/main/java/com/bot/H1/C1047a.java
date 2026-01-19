package h1;

import F0.AbstractC0137z;
import H0.C0165u;
import Y3.C;
import android.view.View;
import android.view.ViewGroup;
import i1.C1101u;
import java.util.List;
import t1.P;
import t1.z;

/* renamed from: h1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1047a extends O4.d {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f11827f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f11828g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1047a(ViewGroup viewGroup, int i6) {
        super(1);
        this.f11827f = i6;
        this.f11828g = viewGroup;
    }

    @Override // O4.d
    public final P d(P p5, List list) {
        switch (this.f11827f) {
            case 0:
                return ((x) this.f11828g).g(p5);
            default:
                C1101u c1101u = (C1101u) this.f11828g;
                if (c1101u.f12013o) {
                    return p5;
                }
                View childAt = c1101u.getChildAt(0);
                int max = Math.max(0, childAt.getLeft());
                int max2 = Math.max(0, childAt.getTop());
                int max3 = Math.max(0, c1101u.getWidth() - childAt.getRight());
                int max4 = Math.max(0, c1101u.getHeight() - childAt.getBottom());
                return (max == 0 && max2 == 0 && max3 == 0 && max4 == 0) ? p5 : p5.a.n(max, max2, max3, max4);
        }
    }

    @Override // O4.d
    public final e0.k e(z zVar, e0.k kVar) {
        switch (this.f11827f) {
            case 0:
                C0165u c0165u = ((x) this.f11828g).f11853C.f1721J.f1916c;
                if (!c0165u.f1999V.f11819q) {
                    return kVar;
                }
                long Q5 = C.Q(c0165u.U(0L));
                int i6 = (int) (Q5 >> 32);
                if (i6 < 0) {
                    i6 = 0;
                }
                int i7 = (int) (Q5 & 4294967295L);
                if (i7 < 0) {
                    i7 = 0;
                }
                long m3 = AbstractC0137z.h(c0165u).m();
                int i8 = (int) (m3 >> 32);
                int i9 = (int) (m3 & 4294967295L);
                long j3 = c0165u.f1487f;
                long Q6 = C.Q(c0165u.U((Float.floatToRawIntBits((int) (j3 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j3 & 4294967295L)) & 4294967295L)));
                int i10 = i8 - ((int) (Q6 >> 32));
                if (i10 < 0) {
                    i10 = 0;
                }
                int i11 = i9 - ((int) (4294967295L & Q6));
                int i12 = i11 >= 0 ? i11 : 0;
                if (i6 == 0 && i7 == 0 && i10 == 0 && i12 == 0) {
                    return kVar;
                }
                return new e0.k(8, i.f((o1.c) kVar.f11564e, i6, i7, i10, i12), i.f((o1.c) kVar.f11565f, i6, i7, i10, i12));
            default:
                C1101u c1101u = (C1101u) this.f11828g;
                if (c1101u.f12013o) {
                    return kVar;
                }
                View childAt = c1101u.getChildAt(0);
                int max = Math.max(0, childAt.getLeft());
                int max2 = Math.max(0, childAt.getTop());
                int max3 = Math.max(0, c1101u.getWidth() - childAt.getRight());
                int max4 = Math.max(0, c1101u.getHeight() - childAt.getBottom());
                if (max == 0 && max2 == 0 && max3 == 0 && max4 == 0) {
                    return kVar;
                }
                o1.c b5 = o1.c.b(max, max2, max3, max4);
                int i13 = b5.a;
                o1.c cVar = (o1.c) kVar.f11564e;
                int i14 = b5.f13501b;
                int i15 = b5.f13502c;
                int i16 = b5.f13503d;
                return new e0.k(8, P.a(cVar, i13, i14, i15, i16), P.a((o1.c) kVar.f11565f, i13, i14, i15, i16));
        }
    }
}
