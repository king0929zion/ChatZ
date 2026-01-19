package I0;

import android.view.View;

/* loaded from: classes.dex */
public final class H {
    public static final H a = new Object();

    public final void a(View view) {
        view.clearViewTranslationCallback();
    }

    public final void b(View view) {
        G g3 = G.a;
        G g6 = G.a;
        view.setViewTranslationCallback(G.a);
    }
}
