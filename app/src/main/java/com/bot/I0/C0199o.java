package I0;

import t1.AbstractC1699b;

/* renamed from: I0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0199o extends AbstractC1699b {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0216x f2335g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ H0.J f2336h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0216x f2337i;

    public C0199o(ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x, H0.J j3, ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x2) {
        this.f2335g = viewTreeObserverOnGlobalLayoutListenerC0216x;
        this.f2336h = j3;
        this.f2337i = viewTreeObserverOnGlobalLayoutListenerC0216x2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        if (r4.intValue() == r8.getSemanticsOwner().a().f4502g) goto L19;
     */
    @Override // t1.AbstractC1699b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.view.View r8, u1.C1754d r9) {
        /*
            r7 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r9.a
            android.view.View$AccessibilityDelegate r1 = r7.f14867c
            r1.onInitializeAccessibilityNodeInfo(r8, r0)
            I0.x r8 = r7.f2335g
            I0.D r1 = r8.f2409B
            boolean r2 = r1.o()
            if (r2 == 0) goto L15
            r2 = 0
            r0.setVisibleToUser(r2)
        L15:
            H0.J r2 = r7.f2336h
            H0.J r3 = r2.v()
        L1b:
            r4 = 0
            if (r3 == 0) goto L2e
            H0.f0 r5 = r3.f1721J
            r6 = 8
            boolean r5 = r5.d(r6)
            if (r5 == 0) goto L29
            goto L2f
        L29:
            H0.J r3 = r3.v()
            goto L1b
        L2e:
            r3 = r4
        L2f:
            if (r3 == 0) goto L37
            int r3 = r3.f1734e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
        L37:
            r3 = -1
            if (r4 == 0) goto L4a
            P0.r r5 = r8.getSemanticsOwner()
            P0.p r5 = r5.a()
            int r5 = r5.f4502g
            int r6 = r4.intValue()
            if (r6 != r5) goto L4e
        L4a:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
        L4e:
            int r4 = r4.intValue()
            r9.f15151b = r4
            I0.x r9 = r7.f2337i
            r0.setParent(r9, r4)
            int r2 = r2.f1734e
            k.y r4 = r1.f2144F
            int r4 = r4.d(r2)
            if (r4 == r3) goto L79
            I0.c0 r5 = r8.getAndroidViewsHandler$ui()
            h1.i r5 = I0.K.p(r5, r4)
            if (r5 == 0) goto L71
            r0.setTraversalBefore(r5)
            goto L74
        L71:
            r0.setTraversalBefore(r9, r4)
        L74:
            java.lang.String r4 = r1.f2146H
            I0.ViewTreeObserverOnGlobalLayoutListenerC0216x.b(r8, r2, r0, r4)
        L79:
            k.y r4 = r1.f2145G
            int r4 = r4.d(r2)
            if (r4 == r3) goto L97
            I0.c0 r3 = r8.getAndroidViewsHandler$ui()
            h1.i r3 = I0.K.p(r3, r4)
            if (r3 == 0) goto L8f
            r0.setTraversalAfter(r3)
            goto L92
        L8f:
            r0.setTraversalAfter(r9, r4)
        L92:
            java.lang.String r9 = r1.f2147I
            I0.ViewTreeObserverOnGlobalLayoutListenerC0216x.b(r8, r2, r0, r9)
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.C0199o.b(android.view.View, u1.d):void");
    }
}
