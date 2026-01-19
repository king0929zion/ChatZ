package V0;

import S.l;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes.dex */
public final class f extends MetricAffectingSpan {

    /* renamed from: c, reason: collision with root package name */
    public final float f8778c;

    public f(float f6) {
        this.f8778c = f6;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        float textScaleX = textPaint.getTextScaleX() * textPaint.getTextSize();
        if (textScaleX == l.f7374V) {
            return;
        }
        textPaint.setLetterSpacing(this.f8778c / textScaleX);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        float textScaleX = textPaint.getTextScaleX() * textPaint.getTextSize();
        if (textScaleX == l.f7374V) {
            return;
        }
        textPaint.setLetterSpacing(this.f8778c / textScaleX);
    }
}
