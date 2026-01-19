package i1;

import m4.AbstractC1277l;

/* renamed from: i1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1084d extends AbstractC1277l implements l4.c {

    /* renamed from: f, reason: collision with root package name */
    public static final C1084d f11973f;

    /* renamed from: g, reason: collision with root package name */
    public static final C1084d f11974g;

    /* renamed from: h, reason: collision with root package name */
    public static final C1084d f11975h;

    /* renamed from: i, reason: collision with root package name */
    public static final C1084d f11976i;

    /* renamed from: j, reason: collision with root package name */
    public static final C1084d f11977j;

    /* renamed from: k, reason: collision with root package name */
    public static final C1084d f11978k;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f11979e;

    static {
        int i6 = 1;
        f11973f = new C1084d(i6, 0);
        f11974g = new C1084d(i6, 1);
        f11975h = new C1084d(i6, 2);
        f11976i = new C1084d(i6, 3);
        f11977j = new C1084d(i6, 4);
        f11978k = new C1084d(i6, 5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1084d(int i6, int i7) {
        super(i6);
        this.f11979e = i7;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        int i6 = this.f11979e;
        X3.y yVar = X3.y.a;
        switch (i6) {
            case 0:
                s4.e[] eVarArr = P0.v.a;
                ((P0.x) obj).a(P0.t.f4545x, yVar);
                return yVar;
            case 1:
                ((Number) obj).longValue();
                return yVar;
            case 2:
                return yVar;
            case 3:
                s4.e[] eVarArr2 = P0.v.a;
                ((P0.x) obj).a(P0.t.f4544w, yVar);
                return yVar;
            case 4:
                return yVar;
            default:
                C1105y c1105y = (C1105y) obj;
                if (c1105y.isAttachedToWindow()) {
                    c1105y.o();
                }
                return yVar;
        }
    }
}
