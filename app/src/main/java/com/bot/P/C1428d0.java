package p;

import android.content.Context;
import android.widget.EdgeEffect;
import o4.AbstractC1410a;

/* renamed from: p.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1428d0 extends EdgeEffect {
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public float f13690b;

    public C1428d0(Context context) {
        super(context);
        this.a = AbstractC1410a.b(context).f11568c * 1;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i6) {
        this.f13690b = S.l.f7374V;
        super.onAbsorb(i6);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f6, float f7) {
        this.f13690b = S.l.f7374V;
        super.onPull(f6, f7);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.f13690b = S.l.f7374V;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f6) {
        this.f13690b = S.l.f7374V;
        super.onPull(f6);
    }
}
