package Q;

import T.C0626q;
import h0.InterfaceC1041r;
import t0.AbstractC1688b;
import u0.C1746g;

/* renamed from: Q.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0490z0 implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6278c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f6279e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1041r f6280f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f6281g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6282h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f6283i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f6284j;

    public /* synthetic */ C0490z0(Object obj, String str, InterfaceC1041r interfaceC1041r, long j3, int i6, int i7, int i8) {
        this.f6278c = i8;
        this.f6284j = obj;
        this.f6279e = str;
        this.f6280f = interfaceC1041r;
        this.f6281g = j3;
        this.f6282h = i6;
        this.f6283i = i7;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        switch (this.f6278c) {
            case 0:
                ((Integer) obj2).getClass();
                A0.b((C1746g) this.f6284j, this.f6279e, this.f6280f, this.f6281g, (C0626q) obj, T.r.J(this.f6282h | 1), this.f6283i);
                break;
            default:
                ((Integer) obj2).getClass();
                A0.a((AbstractC1688b) this.f6284j, this.f6279e, this.f6280f, this.f6281g, (C0626q) obj, T.r.J(this.f6282h | 1), this.f6283i);
                break;
        }
        return X3.y.a;
    }
}
