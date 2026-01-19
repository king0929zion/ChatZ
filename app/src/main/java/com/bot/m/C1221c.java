package m;

import m4.AbstractC1277l;
import n.AbstractC1318d;
import n.C1340o;
import n.C1342q;
import p0.C1468d;
import v.AbstractC1787b;

/* renamed from: m.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1221c extends AbstractC1277l implements l4.c {

    /* renamed from: f, reason: collision with root package name */
    public static final C1221c f12771f;

    /* renamed from: g, reason: collision with root package name */
    public static final C1221c f12772g;

    /* renamed from: h, reason: collision with root package name */
    public static final C1221c f12773h;

    /* renamed from: i, reason: collision with root package name */
    public static final C1221c f12774i;

    /* renamed from: j, reason: collision with root package name */
    public static final C1221c f12775j;

    /* renamed from: k, reason: collision with root package name */
    public static final C1221c f12776k;

    /* renamed from: l, reason: collision with root package name */
    public static final C1221c f12777l;

    /* renamed from: m, reason: collision with root package name */
    public static final C1221c f12778m;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f12779e;

    static {
        int i6 = 1;
        f12771f = new C1221c(i6, 0);
        f12772g = new C1221c(i6, 1);
        f12773h = new C1221c(i6, 2);
        f12774i = new C1221c(i6, 3);
        f12775j = new C1221c(i6, 4);
        f12776k = new C1221c(i6, 5);
        f12777l = new C1221c(i6, 6);
        f12778m = new C1221c(i6, 7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1221c(int i6, int i7) {
        super(i6);
        this.f12779e = i7;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f12779e) {
            case 0:
                return obj;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 2:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return bool2;
            case 3:
                long b5 = o0.s.b(((o0.s) obj).a, C1468d.f13860x);
                return new C1342q(o0.s.e(b5), o0.s.i(b5), o0.s.h(b5), o0.s.f(b5));
            case 4:
                long j3 = ((o0.O) obj).a;
                return new C1340o(o0.O.b(j3), o0.O.c(j3));
            case AbstractC1787b.f15290g /* 5 */:
                C1340o c1340o = (C1340o) obj;
                return new o0.O(o0.y.h(c1340o.a, c1340o.f13202b));
            case 6:
                return AbstractC1318d.r(S.l.f7374V, S.l.f7374V, null, 7);
            case 7:
                return AbstractC1205L.f12737c;
            case 8:
                return new e1.l((((int) (((e1.l) obj).a >> 32)) << 32) | (0 & 4294967295L));
            default:
                return new e1.l((((int) (((e1.l) obj).a >> 32)) << 32) | (0 & 4294967295L));
        }
    }
}
