package Y2;

import b4.InterfaceC0905c;
import com.bot.core.model.LLMProviderUpdateRequest;
import java.util.List;

/* renamed from: Y2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0718g extends d4.i implements l4.c {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f9719h = 2;

    /* renamed from: i, reason: collision with root package name */
    public int f9720i;

    /* renamed from: j, reason: collision with root package name */
    public H2.g f9721j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f9722k;

    /* renamed from: l, reason: collision with root package name */
    public Object f9723l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f9724m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0718g(C0720i c0720i, String str, LLMProviderUpdateRequest lLMProviderUpdateRequest, InterfaceC0905c interfaceC0905c) {
        super(1, interfaceC0905c);
        this.f9721j = c0720i;
        this.f9722k = str;
        this.f9724m = lLMProviderUpdateRequest;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        InterfaceC0905c interfaceC0905c = (InterfaceC0905c) obj;
        switch (this.f9719h) {
            case 0:
                return new C0718g((List) this.f9724m, (C0720i) this.f9723l, this.f9722k, interfaceC0905c).r(X3.y.a);
            case 1:
                return new C0718g((C0720i) this.f9721j, this.f9722k, (LLMProviderUpdateRequest) this.f9724m, interfaceC0905c).r(X3.y.a);
            default:
                return new C0718g((W) this.f9724m, this.f9722k, interfaceC0905c).r(X3.y.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0178, code lost:
    
        if (r3 == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0197, code lost:
    
        if (r5 == null) goto L100;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.C0718g.r(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0718g(W w5, String str, InterfaceC0905c interfaceC0905c) {
        super(1, interfaceC0905c);
        this.f9724m = w5;
        this.f9722k = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0718g(List list, C0720i c0720i, String str, InterfaceC0905c interfaceC0905c) {
        super(1, interfaceC0905c);
        this.f9724m = list;
        this.f9723l = c0720i;
        this.f9722k = str;
    }
}
