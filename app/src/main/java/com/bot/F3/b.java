package F3;

import C4.u;

/* loaded from: classes.dex */
public final class b extends Q3.e {

    /* renamed from: g, reason: collision with root package name */
    public static final u f1577g = new u("Before", 1);

    /* renamed from: h, reason: collision with root package name */
    public static final u f1578h = new u("State", 1);

    /* renamed from: i, reason: collision with root package name */
    public static final u f1579i = new u("After", 1);

    /* renamed from: j, reason: collision with root package name */
    public static final u f1580j = new u("Receive", 1);

    /* renamed from: k, reason: collision with root package name */
    public static final u f1581k = new u("Parse", 1);

    /* renamed from: l, reason: collision with root package name */
    public static final u f1582l = new u("Transform", 1);

    /* renamed from: m, reason: collision with root package name */
    public static final u f1583m = new u("State", 1);

    /* renamed from: n, reason: collision with root package name */
    public static final u f1584n = new u("After", 1);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1585e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1586f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(boolean z5, int i6) {
        super(f1577g, f1578h, f1579i);
        this.f1585e = i6;
        switch (i6) {
            case 1:
                super(f1580j, f1581k, f1582l, f1583m, f1584n);
                this.f1586f = z5;
                return;
            default:
                this.f1586f = z5;
                return;
        }
    }

    @Override // Q3.e
    public final boolean d() {
        switch (this.f1585e) {
            case 0:
                return this.f1586f;
            default:
                return this.f1586f;
        }
    }
}
