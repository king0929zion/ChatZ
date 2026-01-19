package P0;

import java.util.Comparator;
import n0.C1354c;

/* loaded from: classes.dex */
public final class g implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final g f4435b = new g(0);

    /* renamed from: c, reason: collision with root package name */
    public static final g f4436c = new g(1);

    /* renamed from: d, reason: collision with root package name */
    public static final g f4437d = new g(2);
    public final /* synthetic */ int a;

    public /* synthetic */ g(int i6) {
        this.a = i6;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                C1354c h3 = ((p) obj).h();
                C1354c h6 = ((p) obj2).h();
                int compare = Float.compare(h3.a, h6.a);
                if (compare != 0) {
                    return compare;
                }
                int compare2 = Float.compare(h3.f13295b, h6.f13295b);
                if (compare2 != 0) {
                    return compare2;
                }
                int compare3 = Float.compare(h3.f13297d, h6.f13297d);
                return compare3 != 0 ? compare3 : Float.compare(h3.f13296c, h6.f13296c);
            case 1:
                C1354c h7 = ((p) obj).h();
                C1354c h8 = ((p) obj2).h();
                int compare4 = Float.compare(h8.f13296c, h7.f13296c);
                if (compare4 != 0) {
                    return compare4;
                }
                int compare5 = Float.compare(h7.f13295b, h8.f13295b);
                if (compare5 != 0) {
                    return compare5;
                }
                int compare6 = Float.compare(h7.f13297d, h8.f13297d);
                return compare6 != 0 ? compare6 : Float.compare(h8.a, h7.a);
            default:
                X3.i iVar = (X3.i) obj;
                X3.i iVar2 = (X3.i) obj2;
                int compare7 = Float.compare(((C1354c) iVar.f9393c).f13295b, ((C1354c) iVar2.f9393c).f13295b);
                return compare7 != 0 ? compare7 : Float.compare(((C1354c) iVar.f9393c).f13297d, ((C1354c) iVar2.f9393c).f13297d);
        }
    }
}
