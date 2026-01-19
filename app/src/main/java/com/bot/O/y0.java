package O;

import java.util.Comparator;

/* loaded from: classes.dex */
public final /* synthetic */ class y0 implements Comparator {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4255b;

    public /* synthetic */ y0(Object obj, int i6) {
        this.a = i6;
        this.f4255b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ((Number) ((B4.D) this.f4255b).m(obj, obj2)).intValue();
            case 1:
                return ((Number) ((l4.e) this.f4255b).m(obj, obj2)).intValue();
            default:
                for (l4.c cVar : (l4.c[]) this.f4255b) {
                    int J4 = h5.e.J((Comparable) cVar.f(obj), (Comparable) cVar.f(obj2));
                    if (J4 != 0) {
                        return J4;
                    }
                }
                return 0;
        }
    }
}
