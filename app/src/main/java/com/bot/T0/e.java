package T0;

import android.os.Build;
import android.text.BoringLayout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class e {
    public final CharSequence a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f8304b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8305c;

    /* renamed from: d, reason: collision with root package name */
    public float f8306d = Float.NaN;

    /* renamed from: e, reason: collision with root package name */
    public float f8307e = Float.NaN;

    /* renamed from: f, reason: collision with root package name */
    public BoringLayout.Metrics f8308f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8309g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f8310h;

    public e(CharSequence charSequence, TextPaint textPaint, int i6) {
        this.a = charSequence;
        this.f8304b = textPaint;
        this.f8305c = i6;
    }

    public final BoringLayout.Metrics a() {
        if (!this.f8309g) {
            TextDirectionHeuristic b5 = k.b(this.f8305c);
            int i6 = Build.VERSION.SDK_INT;
            CharSequence charSequence = this.a;
            TextPaint textPaint = this.f8304b;
            this.f8308f = i6 >= 33 ? BoringLayout.isBoring(charSequence, textPaint, b5, true, null) : !b5.isRtl(charSequence, 0, charSequence.length()) ? BoringLayout.isBoring(charSequence, textPaint, null) : null;
            this.f8309g = true;
        }
        return this.f8308f;
    }

    public final CharSequence b() {
        CharSequence charSequence = this.f8310h;
        if (charSequence != null) {
            AbstractC1276k.c(charSequence);
            return charSequence;
        }
        CharSequence charSequence2 = this.a;
        if (charSequence2 instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence2;
            if (g.f(spanned, CharacterStyle.class)) {
                CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, charSequence2.length(), CharacterStyle.class);
                if (characterStyleArr != null && characterStyleArr.length != 0) {
                    SpannableString spannableString = null;
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            if (spannableString == null) {
                                spannableString = new SpannableString(charSequence2);
                            }
                            spannableString.removeSpan(characterStyle);
                        }
                    }
                    if (spannableString != null) {
                        charSequence2 = spannableString;
                    }
                }
            }
        }
        this.f8310h = charSequence2;
        return charSequence2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        if (T0.g.f(r2, V0.e.class) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        if (r3.getLetterSpacing() == S.l.f7374V) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float c() {
        /*
            r6 = this;
            float r0 = r6.f8306d
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lb
            float r0 = r6.f8306d
            return r0
        Lb:
            android.text.BoringLayout$Metrics r0 = r6.a()
            if (r0 == 0) goto L14
            int r0 = r0.width
            goto L15
        L14:
            r0 = -1
        L15:
            float r0 = (float) r0
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            android.text.TextPaint r3 = r6.f8304b
            if (r2 >= 0) goto L34
            java.lang.CharSequence r0 = r6.b()
            int r0 = r0.length()
            java.lang.CharSequence r2 = r6.b()
            r4 = 0
            float r0 = android.text.Layout.getDesiredWidth(r2, r4, r0, r3)
            double r4 = (double) r0
            double r4 = java.lang.Math.ceil(r4)
            float r0 = (float) r4
        L34:
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 != 0) goto L39
            goto L5d
        L39:
            java.lang.CharSequence r2 = r6.a
            boolean r4 = r2 instanceof android.text.Spanned
            if (r4 == 0) goto L51
            android.text.Spanned r2 = (android.text.Spanned) r2
            java.lang.Class<V0.f> r4 = V0.f.class
            boolean r4 = T0.g.f(r2, r4)
            if (r4 != 0) goto L5a
            java.lang.Class<V0.e> r4 = V0.e.class
            boolean r2 = T0.g.f(r2, r4)
            if (r2 != 0) goto L5a
        L51:
            float r2 = r3.getLetterSpacing()
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 != 0) goto L5a
            goto L5d
        L5a:
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
        L5d:
            r6.f8306d = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: T0.e.c():float");
    }
}
