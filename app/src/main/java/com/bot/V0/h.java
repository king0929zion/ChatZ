package V0;

import S.l;
import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* loaded from: classes.dex */
public final class h implements LineHeightSpan {

    /* renamed from: c, reason: collision with root package name */
    public final float f8780c;

    /* renamed from: e, reason: collision with root package name */
    public final int f8781e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f8782f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f8783g;

    /* renamed from: h, reason: collision with root package name */
    public final float f8784h;

    /* renamed from: i, reason: collision with root package name */
    public final int f8785i;

    /* renamed from: j, reason: collision with root package name */
    public int f8786j = Integer.MIN_VALUE;

    /* renamed from: k, reason: collision with root package name */
    public int f8787k = Integer.MIN_VALUE;

    /* renamed from: l, reason: collision with root package name */
    public int f8788l = Integer.MIN_VALUE;

    /* renamed from: m, reason: collision with root package name */
    public int f8789m = Integer.MIN_VALUE;

    /* renamed from: n, reason: collision with root package name */
    public int f8790n;

    /* renamed from: o, reason: collision with root package name */
    public int f8791o;

    public h(float f6, int i6, boolean z5, boolean z6, float f7, int i7) {
        this.f8780c = f6;
        this.f8781e = i6;
        this.f8782f = z5;
        this.f8783g = z6;
        this.f8784h = f7;
        this.f8785i = i7;
        if ((l.f7374V > f7 || f7 > 1.0f) && f7 != -1.0f) {
            Y0.a.b("topRatio should be in [0..1] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i6, int i7, int i8, int i9, Paint.FontMetricsInt fontMetricsInt) {
        int i10 = fontMetricsInt.descent;
        int i11 = fontMetricsInt.ascent;
        if (i10 - i11 <= 0) {
            return;
        }
        boolean z5 = i6 == 0;
        boolean z6 = i7 == this.f8781e;
        int i12 = this.f8785i;
        boolean z7 = this.f8783g;
        boolean z8 = this.f8782f;
        if (z5 && z6 && z8 && z7 && i12 != 2) {
            return;
        }
        if (this.f8786j == Integer.MIN_VALUE) {
            int i13 = i10 - i11;
            int ceil = (int) Math.ceil(this.f8780c);
            int i14 = ceil - i13;
            if (i12 != 1 || i14 > 0) {
                float f6 = this.f8784h;
                if (f6 == -1.0f) {
                    f6 = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                int ceil2 = (int) (i14 <= 0 ? Math.ceil(i14 * f6) : Math.ceil((1.0f - f6) * i14));
                int i15 = fontMetricsInt.descent;
                int i16 = ceil2 + i15;
                this.f8788l = i16;
                int i17 = i16 - ceil;
                this.f8787k = i17;
                if (i12 == 0 || i14 >= 0) {
                    if (z8) {
                        i17 = fontMetricsInt.ascent;
                    }
                    this.f8786j = i17;
                    if (z7) {
                        i16 = i15;
                    }
                    this.f8789m = i16;
                    this.f8790n = fontMetricsInt.ascent - i17;
                    this.f8791o = i16 - i15;
                } else if (i12 == 2) {
                    this.f8786j = z8 ? Math.max(fontMetricsInt.ascent, i17) : Math.min(fontMetricsInt.ascent, i17);
                    this.f8789m = z7 ? Math.min(fontMetricsInt.descent, this.f8788l) : Math.max(fontMetricsInt.descent, this.f8788l);
                    this.f8790n = 0;
                    this.f8791o = 0;
                }
            } else {
                int i18 = fontMetricsInt.ascent;
                this.f8787k = i18;
                int i19 = fontMetricsInt.descent;
                this.f8788l = i19;
                this.f8786j = i18;
                this.f8789m = i19;
                this.f8790n = 0;
                this.f8791o = 0;
            }
        }
        fontMetricsInt.ascent = z5 ? this.f8786j : this.f8787k;
        fontMetricsInt.descent = z6 ? this.f8789m : this.f8788l;
    }
}
