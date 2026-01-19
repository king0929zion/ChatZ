package M2;

import X2.C0696k;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import java.util.List;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class s extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f3383h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ t f3384i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f3385j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f3386k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f3387l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ List f3388m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ List f3389n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f3390o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f3391p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f3392q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f3393r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Integer f3394s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ List f3395t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ I2.w f3396u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C0696k f3397v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, String str, String str2, String str3, List list, List list2, String str4, String str5, float f6, float f7, Integer num, List list3, I2.w wVar, C0696k c0696k, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f3384i = tVar;
        this.f3385j = str;
        this.f3386k = str2;
        this.f3387l = str3;
        this.f3388m = list;
        this.f3389n = list2;
        this.f3390o = str4;
        this.f3391p = str5;
        this.f3392q = f6;
        this.f3393r = f7;
        this.f3394s = num;
        this.f3395t = list3;
        this.f3396u = wVar;
        this.f3397v = c0696k;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((s) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new s(this.f3384i, this.f3385j, this.f3386k, this.f3387l, this.f3388m, this.f3389n, this.f3390o, this.f3391p, this.f3392q, this.f3393r, this.f3394s, this.f3395t, this.f3396u, this.f3397v, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f3383h;
        if (i6 == 0) {
            X3.a.e(obj);
            this.f3383h = 1;
            Object a = t.a(this.f3384i, this.f3385j, this.f3386k, this.f3387l, this.f3388m, this.f3389n, this.f3390o, this.f3391p, this.f3392q, this.f3393r, this.f3394s, this.f3395t, this.f3396u, this.f3397v, this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (a == enumC0927a) {
                return enumC0927a;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
        }
        return X3.y.a;
    }
}
