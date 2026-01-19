package h1;

import F0.InterfaceC0134w;
import H0.J;
import H0.r0;
import I0.C0199o;
import I0.ViewTreeObserverOnGlobalLayoutListenerC0216x;
import X3.y;
import android.view.WindowInsets;
import java.util.HashMap;
import m4.AbstractC1277l;
import t1.AbstractC1713p;
import t1.P;

/* renamed from: h1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1049c extends AbstractC1277l implements l4.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f11834e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x f11835f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ J f11836g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1049c(x xVar, J j3, int i6) {
        super(1);
        this.f11834e = i6;
        this.f11835f = xVar;
        this.f11836g = j3;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        WindowInsets b5;
        switch (this.f11834e) {
            case 0:
                r0 r0Var = (r0) obj;
                ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x = r0Var instanceof ViewTreeObserverOnGlobalLayoutListenerC0216x ? (ViewTreeObserverOnGlobalLayoutListenerC0216x) r0Var : null;
                x xVar = this.f11835f;
                if (viewTreeObserverOnGlobalLayoutListenerC0216x != null) {
                    HashMap<i, J> holderToLayoutNode = viewTreeObserverOnGlobalLayoutListenerC0216x.getAndroidViewsHandler$ui().getHolderToLayoutNode();
                    J j3 = this.f11836g;
                    holderToLayoutNode.put(xVar, j3);
                    viewTreeObserverOnGlobalLayoutListenerC0216x.getAndroidViewsHandler$ui().addView(xVar);
                    viewTreeObserverOnGlobalLayoutListenerC0216x.getAndroidViewsHandler$ui().getLayoutNodeToHolder().put(j3, xVar);
                    xVar.setImportantForAccessibility(1);
                    AbstractC1713p.b(xVar, new C0199o(viewTreeObserverOnGlobalLayoutListenerC0216x, j3, viewTreeObserverOnGlobalLayoutListenerC0216x));
                }
                if (xVar.getView().getParent() != xVar) {
                    xVar.addView(xVar.getView());
                }
                return y.a;
            case 1:
                k.d(this.f11835f, this.f11836g);
                return y.a;
            default:
                J j4 = this.f11836g;
                x xVar2 = this.f11835f;
                k.d(xVar2, j4);
                ((ViewTreeObserverOnGlobalLayoutListenerC0216x) xVar2.f11856f).f2424J = true;
                int[] iArr = xVar2.f11867q;
                int i6 = iArr[0];
                int i7 = iArr[1];
                xVar2.getView().getLocationOnScreen(iArr);
                long j5 = xVar2.f11868r;
                long m3 = ((InterfaceC0134w) obj).m();
                xVar2.f11868r = m3;
                P p5 = xVar2.f11869s;
                if (p5 != null && ((i6 != iArr[0] || i7 != iArr[1] || !e1.l.b(j5, m3)) && (b5 = xVar2.g(p5).b()) != null)) {
                    xVar2.getView().dispatchApplyWindowInsets(b5);
                }
                return y.a;
        }
    }
}
