package V0;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* loaded from: classes.dex */
public final class k extends CharacterStyle {
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8799b;

    public k(boolean z5, boolean z6) {
        this.a = z5;
        this.f8799b = z6;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.a);
        textPaint.setStrikeThruText(this.f8799b);
    }
}
