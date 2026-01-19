package S0;

import java.util.Comparator;

/* renamed from: S0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0544f implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ C0544f(int i6) {
        this.a = i6;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return h5.e.J(Integer.valueOf(((C0543e) obj).f7626b), Integer.valueOf(((C0543e) obj2).f7626b));
            default:
                return h5.e.J(Integer.valueOf(((C0543e) obj).f7626b), Integer.valueOf(((C0543e) obj2).f7626b));
        }
    }
}
