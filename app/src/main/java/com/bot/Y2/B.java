package Y2;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import com.bot.core.model.ApiResponse;
import com.bot.core.model.LLMProvider;

/* loaded from: classes.dex */
public final class B extends d4.i implements l4.c {

    /* renamed from: h, reason: collision with root package name */
    public L f9583h;

    /* renamed from: i, reason: collision with root package name */
    public int f9584i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ L f9585j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f9586k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f9587l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ LLMProvider f9588m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f9589n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f9590o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(L l3, String str, String str2, LLMProvider lLMProvider, String str3, String str4, InterfaceC0905c interfaceC0905c) {
        super(1, interfaceC0905c);
        this.f9585j = l3;
        this.f9586k = str;
        this.f9587l = str2;
        this.f9588m = lLMProvider;
        this.f9589n = str3;
        this.f9590o = str4;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        String str = this.f9589n;
        String str2 = this.f9590o;
        return new B(this.f9585j, this.f9586k, this.f9587l, this.f9588m, str, str2, (InterfaceC0905c) obj).r(X3.y.a);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        L l3;
        int i6 = this.f9584i;
        if (i6 == 0) {
            X3.a.e(obj);
            l3 = this.f9585j;
            F2.i iVar = l3.a;
            String str = this.f9586k;
            boolean equals = str.equals("google");
            String str2 = this.f9587l;
            LLMProvider lLMProvider = this.f9588m;
            String str3 = (equals && str2.equals("vertex_ai")) ? null : lLMProvider.f11168d;
            String str4 = lLMProvider.f11172h;
            String str5 = lLMProvider.f11173i;
            this.f9583h = l3;
            this.f9584i = 1;
            obj = iVar.d(str3, this.f9589n, str, str2, str4, str5, this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (obj == enumC0927a) {
                return enumC0927a;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l3 = this.f9583h;
            X3.a.e(obj);
        }
        return L.g(l3, (ApiResponse) obj);
    }
}
