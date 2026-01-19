package V0;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes.dex */
public final class a extends MetricAffectingSpan {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8773c;

    /* renamed from: e, reason: collision with root package name */
    public final float f8774e;

    public /* synthetic */ a(float f6, int i6) {
        this.f8773c = i6;
        this.f8774e = f6;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f8773c) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f8774e);
                return;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f8774e);
                return;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f8773c) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f8774e);
                return;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f8774e);
                return;
        }
    }
}
