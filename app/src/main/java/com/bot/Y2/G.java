package Y2;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import com.bot.core.model.ApiResponse;

/* loaded from: classes.dex */
public final class G extends d4.i implements l4.c {

    /* renamed from: h, reason: collision with root package name */
    public L f9612h;

    /* renamed from: i, reason: collision with root package name */
    public int f9613i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ L f9614j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f9615k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f9616l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f9617m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f9618n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f9619o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f9620p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f9621q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(L l3, String str, String str2, String str3, String str4, String str5, String str6, String str7, InterfaceC0905c interfaceC0905c) {
        super(1, interfaceC0905c);
        this.f9614j = l3;
        this.f9615k = str;
        this.f9616l = str2;
        this.f9617m = str3;
        this.f9618n = str4;
        this.f9619o = str5;
        this.f9620p = str6;
        this.f9621q = str7;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        String str = this.f9620p;
        String str2 = this.f9621q;
        return new G(this.f9614j, this.f9615k, this.f9616l, this.f9617m, this.f9618n, this.f9619o, str, str2, (InterfaceC0905c) obj).r(X3.y.a);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        L l3;
        int i6 = this.f9613i;
        if (i6 == 0) {
            X3.a.e(obj);
            l3 = this.f9614j;
            F2.i iVar = l3.a;
            String str = this.f9615k;
            boolean equals = str.equals("google");
            String str2 = this.f9616l;
            String str3 = (equals && str2.equals("vertex_ai")) ? null : this.f9617m;
            this.f9612h = l3;
            this.f9613i = 1;
            obj = iVar.d(str3, this.f9618n, str, str2, this.f9620p, this.f9621q, this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (obj == enumC0927a) {
                return enumC0927a;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l3 = this.f9612h;
            X3.a.e(obj);
        }
        return L.g(l3, (ApiResponse) obj);
    }
}
