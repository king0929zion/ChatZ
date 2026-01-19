package Y2;

import b4.InterfaceC0905c;
import com.bot.core.model.LLMProvider;
import x4.InterfaceC1942y;
import z4.C2057h;

/* loaded from: classes.dex */
public final class D extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f9594h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ LLMProvider f9595i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ L f9596j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C2057h f9597k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f9598l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(LLMProvider lLMProvider, L l3, C2057h c2057h, int i6, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f9595i = lLMProvider;
        this.f9596j = l3;
        this.f9597k = c2057h;
        this.f9598l = i6;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((D) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new D(this.f9595i, this.f9596j, this.f9597k, this.f9598l, interfaceC0905c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0054, code lost:
    
        if (r4.f9597k.a(r4, r2) == r3) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
    
        if (r5 == r3) goto L21;
     */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.f9594h
            r1 = 2
            r2 = 1
            c4.a r3 = c4.EnumC0927a.f11114c
            if (r0 == 0) goto L1c
            if (r0 == r2) goto L18
            if (r0 != r1) goto L10
            X3.a.e(r5)
            goto L57
        L10:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L18:
            X3.a.e(r5)
            goto L3e
        L1c:
            X3.a.e(r5)
            com.bot.core.model.LLMProvider r5 = r4.f9595i
            java.lang.String r0 = r5.f11176l
            if (r0 == 0) goto L2e
            java.lang.CharSequence r0 = u4.AbstractC1776n.l0(r0)
            java.lang.String r0 = r0.toString()
            goto L2f
        L2e:
            r0 = 0
        L2f:
            if (r0 != 0) goto L33
            java.lang.String r0 = ""
        L33:
            r4.f9594h = r2
            Y2.L r2 = r4.f9596j
            java.lang.Object r5 = Y2.L.f(r2, r5, r0, r4)
            if (r5 != r3) goto L3e
            goto L56
        L3e:
            com.bot.feature.settings.data.VendorConfig r5 = (com.bot.feature.settings.data.VendorConfig) r5
            java.lang.Integer r0 = new java.lang.Integer
            int r2 = r4.f9598l
            r0.<init>(r2)
            X3.i r2 = new X3.i
            r2.<init>(r0, r5)
            r4.f9594h = r1
            z4.h r5 = r4.f9597k
            java.lang.Object r5 = r5.a(r4, r2)
            if (r5 != r3) goto L57
        L56:
            return r3
        L57:
            X3.y r5 = X3.y.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.D.r(java.lang.Object):java.lang.Object");
    }
}
