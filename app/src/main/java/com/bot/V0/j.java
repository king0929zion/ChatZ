package V0;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* loaded from: classes.dex */
public final class j extends CharacterStyle {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final float f8796b;

    /* renamed from: c, reason: collision with root package name */
    public final float f8797c;

    /* renamed from: d, reason: collision with root package name */
    public final float f8798d;

    public j(float f6, float f7, float f8, int i6) {
        this.a = i6;
        this.f8796b = f6;
        this.f8797c = f7;
        this.f8798d = f8;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f8798d, this.f8796b, this.f8797c, this.a);
    }
}
