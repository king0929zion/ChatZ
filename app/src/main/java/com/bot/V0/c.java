package V0;

import S.l;
import Y3.C;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class c implements LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i6, int i7, int i8, int i9, int i10, CharSequence charSequence, int i11, int i12, boolean z5, Layout layout) {
        int lineForOffset;
        if (layout == null || paint == null || (lineForOffset = layout.getLineForOffset(i11)) != layout.getLineCount() - 1) {
            return;
        }
        ThreadLocal threadLocal = T0.k.a;
        if (layout.getEllipsisCount(lineForOffset) > 0) {
            float r5 = C.r(layout, lineForOffset, paint) + C.q(layout, lineForOffset, paint);
            if (r5 == l.f7374V) {
                return;
            }
            AbstractC1276k.c(canvas);
            canvas.translate(r5, l.f7374V);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z5) {
        return 0;
    }
}
