package I0;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class Y0 extends ViewOutlineProvider {
    public final /* synthetic */ int a;

    public /* synthetic */ Y0(int i6) {
        this.a = i6;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Outline outline2;
        switch (this.a) {
            case 0:
                AbstractC1276k.d(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
                B3.e.y(view);
                throw null;
            case 1:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(S.l.f7374V);
                return;
            case 2:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(S.l.f7374V);
                return;
            case 3:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(S.l.f7374V);
                return;
            default:
                if (!(view instanceof r0.l) || (outline2 = ((r0.l) view).f14637h) == null) {
                    return;
                }
                outline.set(outline2);
                return;
        }
    }
}
