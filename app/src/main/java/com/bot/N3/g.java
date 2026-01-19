package N3;

import java.util.Map;
import m4.AbstractC1276k;
import m4.AbstractC1277l;

/* loaded from: classes.dex */
public final class g extends AbstractC1277l implements l4.c {

    /* renamed from: f, reason: collision with root package name */
    public static final g f3858f;

    /* renamed from: g, reason: collision with root package name */
    public static final g f3859g;

    /* renamed from: h, reason: collision with root package name */
    public static final g f3860h;

    /* renamed from: i, reason: collision with root package name */
    public static final g f3861i;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3862e;

    static {
        int i6 = 1;
        f3858f = new g(i6, 0);
        f3859g = new g(i6, 1);
        f3860h = new g(i6, 2);
        f3861i = new g(i6, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i6, int i7) {
        super(i6);
        this.f3862e = i7;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f3862e) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                AbstractC1276k.f(entry, "$this$$receiver");
                return new n(((i) entry.getKey()).a, entry.getValue());
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                AbstractC1276k.f(entry2, "$this$$receiver");
                return new n(h5.e.I((String) entry2.getKey()), entry2.getValue());
            case 2:
                i iVar = (i) obj;
                AbstractC1276k.f(iVar, "$this$$receiver");
                return iVar.a;
            default:
                String str = (String) obj;
                AbstractC1276k.f(str, "$this$$receiver");
                return h5.e.I(str);
        }
    }
}
