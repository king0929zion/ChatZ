package I2;

import O.C0325o0;
import Q.s3;
import R.C0513s;
import Y2.C0720i;
import Y2.L;
import b4.InterfaceC0905c;
import com.bot.core.model.LLMProviderCreateRequest;
import java.util.List;
import p.x0;
import r.C1606t;

/* loaded from: classes.dex */
public final class u extends d4.i implements l4.c {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2682h;

    /* renamed from: i, reason: collision with root package name */
    public int f2683i;

    /* renamed from: j, reason: collision with root package name */
    public Object f2684j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f2685k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f2686l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(Object obj, H2.g gVar, InterfaceC0905c interfaceC0905c, int i6) {
        super(1, interfaceC0905c);
        this.f2682h = i6;
        this.f2685k = obj;
        this.f2686l = gVar;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f2682h) {
            case 0:
                return new u((v) this.f2684j, (String) this.f2685k, (String) this.f2686l, (InterfaceC0905c) obj, 0).r(X3.y.a);
            case 1:
                return new u((s3) this.f2684j, (C0325o0) this.f2685k, (x0) this.f2686l, (InterfaceC0905c) obj, 1).r(X3.y.a);
            case 2:
                InterfaceC0905c interfaceC0905c = (InterfaceC0905c) obj;
                return new u((C0513s) this.f2684j, this.f2685k, (l4.g) this.f2686l, interfaceC0905c, 2).r(X3.y.a);
            case 3:
                return new u((LLMProviderCreateRequest) this.f2685k, (C0720i) this.f2686l, (InterfaceC0905c) obj, 3).r(X3.y.a);
            case 4:
                return new u((List) this.f2685k, (L) this.f2686l, (InterfaceC0905c) obj, 4).r(X3.y.a);
            default:
                InterfaceC0905c interfaceC0905c2 = (InterfaceC0905c) obj;
                return new u((C1606t) this.f2684j, this.f2685k, (l4.g) this.f2686l, interfaceC0905c2, 5).r(X3.y.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02b0  */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 710
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I2.u.r(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(Object obj, Object obj2, Object obj3, InterfaceC0905c interfaceC0905c, int i6) {
        super(1, interfaceC0905c);
        this.f2682h = i6;
        this.f2684j = obj;
        this.f2685k = obj2;
        this.f2686l = obj3;
    }
}
