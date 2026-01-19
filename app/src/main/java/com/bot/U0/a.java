package U0;

import M.q;
import android.text.SegmentFinder;

/* loaded from: classes.dex */
public final class a extends SegmentFinder {
    public final /* synthetic */ q a;

    public a(q qVar) {
        this.a = qVar;
    }

    public final int nextEndBoundary(int i6) {
        return this.a.f(i6);
    }

    public final int nextStartBoundary(int i6) {
        return this.a.a(i6);
    }

    public final int previousEndBoundary(int i6) {
        return this.a.b(i6);
    }

    public final int previousStartBoundary(int i6) {
        return this.a.d(i6);
    }
}
