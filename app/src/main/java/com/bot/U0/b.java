package U0;

import android.text.TextPaint;
import java.text.BreakIterator;

/* loaded from: classes.dex */
public final class b extends Y4.d {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f8597f = 1;

    /* renamed from: g, reason: collision with root package name */
    public final CharSequence f8598g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f8599h;

    public b(CharSequence charSequence) {
        this.f8598g = charSequence;
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.f8599h = characterInstance;
    }

    @Override // Y4.d
    public final int M(int i6) {
        int textRunCursor;
        switch (this.f8597f) {
            case 0:
                TextPaint textPaint = (TextPaint) this.f8599h;
                CharSequence charSequence = this.f8598g;
                textRunCursor = textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i6, 0);
                return textRunCursor;
            default:
                return ((BreakIterator) this.f8599h).following(i6);
        }
    }

    @Override // Y4.d
    public final int Q(int i6) {
        int textRunCursor;
        switch (this.f8597f) {
            case 0:
                TextPaint textPaint = (TextPaint) this.f8599h;
                CharSequence charSequence = this.f8598g;
                textRunCursor = textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i6, 2);
                return textRunCursor;
            default:
                return ((BreakIterator) this.f8599h).preceding(i6);
        }
    }

    public b(CharSequence charSequence, TextPaint textPaint) {
        this.f8598g = charSequence;
        this.f8599h = textPaint;
    }
}
