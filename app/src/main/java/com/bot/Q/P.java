package Q;

import T.C0626q;
import com.vladsch.flexmark.parser.PegdownExtensions;
import java.util.WeakHashMap;
import v.C1788b0;
import v.C1810p;

/* loaded from: classes.dex */
public final class P implements l4.e {

    /* renamed from: e, reason: collision with root package name */
    public static final P f5472e = new P(0);

    /* renamed from: f, reason: collision with root package name */
    public static final P f5473f = new P(1);

    /* renamed from: g, reason: collision with root package name */
    public static final P f5474g = new P(2);

    /* renamed from: h, reason: collision with root package name */
    public static final P f5475h = new P(3);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5476c;

    public /* synthetic */ P(int i6) {
        this.f5476c = i6;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        int i6 = this.f5476c;
        X3.y yVar = X3.y.a;
        switch (i6) {
            case 0:
                C0626q c0626q = (C0626q) obj;
                int intValue = ((Number) obj2).intValue();
                if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                    C0450p.a.a(null, S.l.f7374V, S.l.f7374V, null, 0L, c0626q, PegdownExtensions.SUPPRESS_ALL_HTML);
                } else {
                    c0626q.V();
                }
                return yVar;
            case 1:
                C0626q c0626q2 = (C0626q) obj;
                int intValue2 = ((Number) obj2).intValue();
                if (c0626q2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                    C0450p.a.a(null, S.l.f7374V, S.l.f7374V, null, 0L, c0626q2, PegdownExtensions.SUPPRESS_ALL_HTML);
                } else {
                    c0626q2.V();
                }
                return yVar;
            case 2:
                C0626q c0626q3 = (C0626q) obj;
                int intValue3 = ((Number) obj2).intValue();
                if (!c0626q3.S(intValue3 & 1, (intValue3 & 3) != 2)) {
                    c0626q3.V();
                }
                return yVar;
            default:
                C0626q c0626q4 = (C0626q) obj;
                ((Number) obj2).intValue();
                c0626q4.b0(-511854661);
                C0450p c0450p = C0450p.a;
                WeakHashMap weakHashMap = v.G0.f15220w;
                C1788b0 c1788b0 = new C1788b0(C1810p.f(c0626q4).f15231l);
                c0626q4.p(false);
                return c1788b0;
        }
    }
}
