package H0;

import java.util.Comparator;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class o0 implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final o0 f1979b = new o0(0);
    public final /* synthetic */ int a;

    public /* synthetic */ o0(int i6) {
        this.a = i6;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                J j3 = (J) obj;
                J j4 = (J) obj2;
                int g3 = AbstractC1276k.g(j4.f1749t, j3.f1749t);
                return g3 != 0 ? g3 : AbstractC1276k.g(j3.hashCode(), j4.hashCode());
            default:
                J j5 = (J) obj;
                J j6 = (J) obj2;
                int g6 = AbstractC1276k.g(j5.f1749t, j6.f1749t);
                return g6 != 0 ? g6 : AbstractC1276k.g(j5.hashCode(), j6.hashCode());
        }
    }
}
