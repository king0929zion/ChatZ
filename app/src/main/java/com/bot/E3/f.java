package E3;

import C4.u;

/* loaded from: classes.dex */
public final class f extends Q3.e {

    /* renamed from: g, reason: collision with root package name */
    public static final u f1316g = new u("Before", 1);

    /* renamed from: h, reason: collision with root package name */
    public static final u f1317h = new u("State", 1);

    /* renamed from: i, reason: collision with root package name */
    public static final u f1318i = new u("Transform", 1);

    /* renamed from: j, reason: collision with root package name */
    public static final u f1319j = new u("Render", 1);

    /* renamed from: k, reason: collision with root package name */
    public static final u f1320k = new u("Send", 1);

    /* renamed from: l, reason: collision with root package name */
    public static final u f1321l = new u("Before", 1);

    /* renamed from: m, reason: collision with root package name */
    public static final u f1322m = new u("State", 1);

    /* renamed from: n, reason: collision with root package name */
    public static final u f1323n = new u("Monitoring", 1);

    /* renamed from: o, reason: collision with root package name */
    public static final u f1324o = new u("Engine", 1);

    /* renamed from: p, reason: collision with root package name */
    public static final u f1325p = new u("Receive", 1);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1326e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1327f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(boolean z5, int i6) {
        super(f1316g, f1317h, f1318i, f1319j, f1320k);
        this.f1326e = i6;
        switch (i6) {
            case 1:
                super(f1321l, f1322m, f1323n, f1324o, f1325p);
                this.f1327f = z5;
                return;
            default:
                this.f1327f = z5;
                return;
        }
    }

    @Override // Q3.e
    public final boolean d() {
        switch (this.f1326e) {
            case 0:
                return this.f1327f;
            default:
                return this.f1327f;
        }
    }
}
