package V0;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes.dex */
public final class b extends MetricAffectingSpan {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8775c;

    /* renamed from: e, reason: collision with root package name */
    public final Object f8776e;

    public /* synthetic */ b(Object obj, int i6) {
        this.f8775c = i6;
        this.f8776e = obj;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f8775c) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.f8776e);
                return;
            default:
                textPaint.setTypeface((Typeface) this.f8776e);
                return;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f8775c) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.f8776e);
                return;
            default:
                textPaint.setTypeface((Typeface) this.f8776e);
                return;
        }
    }
}
