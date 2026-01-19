package P;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import o0.s;

/* loaded from: classes.dex */
public final class j extends RippleDrawable {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4426c;

    /* renamed from: e, reason: collision with root package name */
    public s f4427e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f4428f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4429g;

    public j(boolean z5) {
        super(ColorStateList.valueOf(-16777216), null, z5 ? new ColorDrawable(-1) : null);
        this.f4426c = z5;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.f4426c) {
            this.f4429g = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.f4429g = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.f4429g;
    }
}
