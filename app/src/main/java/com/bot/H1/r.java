package h1;

import H0.AbstractC0157l;
import I0.ViewTreeObserverOnGlobalLayoutListenerC0216x;
import X3.y;
import android.graphics.Rect;
import android.view.View;
import m0.AbstractC1249d;
import m0.C;
import m0.C1246a;
import m4.AbstractC1277l;
import n0.C1354c;

/* loaded from: classes.dex */
public final class r extends AbstractC1277l implements l4.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f11896e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s f11897f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(s sVar, int i6) {
        super(1);
        this.f11896e = i6;
        this.f11897f = sVar;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f11896e) {
            case 0:
                C1246a c1246a = (C1246a) obj;
                s sVar = this.f11897f;
                View c6 = k.c(sVar);
                if (!c6.isFocused() && !c6.hasFocus()) {
                    m0.n focusOwner = ((ViewTreeObserverOnGlobalLayoutListenerC0216x) AbstractC0157l.w(sVar)).getFocusOwner();
                    View x5 = AbstractC0157l.x(sVar);
                    Integer c7 = m0.j.c(c1246a.a);
                    int[] iArr = new int[2];
                    x5.getLocationOnScreen(iArr);
                    int[] iArr2 = new int[2];
                    c6.getLocationOnScreen(iArr2);
                    C f6 = AbstractC1249d.f(((m0.q) focusOwner).f12900c);
                    Rect rect = null;
                    C1354c i6 = f6 != null ? AbstractC1249d.i(f6) : null;
                    if (i6 != null) {
                        int i7 = (int) i6.a;
                        int i8 = iArr[0];
                        int i9 = iArr2[0];
                        int i10 = (int) i6.f13295b;
                        int i11 = iArr[1];
                        int i12 = iArr2[1];
                        rect = new Rect((i7 + i8) - i9, (i10 + i11) - i12, (((int) i6.f13296c) + i8) - i9, (((int) i6.f13297d) + i11) - i12);
                    }
                    if (!m0.j.b(c6, c7, rect)) {
                        c1246a.f12883b = true;
                    }
                }
                return y.a;
            default:
                k.c(this.f11897f);
                return y.a;
        }
    }
}
