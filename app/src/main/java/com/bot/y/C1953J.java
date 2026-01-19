package y;

import O.C0316k;
import java.util.Comparator;

/* renamed from: y.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1953J implements Comparator {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0316k f15782b;

    public /* synthetic */ C1953J(C0316k c0316k, int i6) {
        this.a = i6;
        this.f15782b = c0316k;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Object obj3 = ((x.m) obj).f15517k;
                C0316k c0316k = this.f15782b;
                return h5.e.J(Integer.valueOf(c0316k.c(obj3)), Integer.valueOf(c0316k.c(((x.m) obj2).f15517k)));
            case 1:
                Object obj4 = ((x.m) obj).f15517k;
                C0316k c0316k2 = this.f15782b;
                return h5.e.J(Integer.valueOf(c0316k2.c(obj4)), Integer.valueOf(c0316k2.c(((x.m) obj2).f15517k)));
            case 2:
                Object obj5 = ((x.m) obj2).f15517k;
                C0316k c0316k3 = this.f15782b;
                return h5.e.J(Integer.valueOf(c0316k3.c(obj5)), Integer.valueOf(c0316k3.c(((x.m) obj).f15517k)));
            default:
                Object obj6 = ((x.m) obj2).f15517k;
                C0316k c0316k4 = this.f15782b;
                return h5.e.J(Integer.valueOf(c0316k4.c(obj6)), Integer.valueOf(c0316k4.c(((x.m) obj).f15517k)));
        }
    }
}
