package M;

import M4.C0269p;
import android.graphics.ColorSpace;
import android.text.GraphemeClusterSegmentFinder;
import android.text.SegmentFinder;
import android.text.TextPaint;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.SelectRangeGesture;

/* loaded from: classes.dex */
public abstract /* synthetic */ class n {
    public static /* bridge */ /* synthetic */ ColorSpace.Named b() {
        return ColorSpace.Named.BT2020_HLG;
    }

    public static /* synthetic */ GraphemeClusterSegmentFinder g(CharSequence charSequence, TextPaint textPaint) {
        return new GraphemeClusterSegmentFinder(charSequence, textPaint);
    }

    public static /* bridge */ /* synthetic */ SegmentFinder h(Object obj) {
        return (SegmentFinder) obj;
    }

    public static /* bridge */ /* synthetic */ DeleteGesture i(Object obj) {
        return (DeleteGesture) obj;
    }

    public static /* bridge */ /* synthetic */ DeleteRangeGesture j(Object obj) {
        return (DeleteRangeGesture) obj;
    }

    public static /* bridge */ /* synthetic */ HandwritingGesture k(Object obj) {
        return (HandwritingGesture) obj;
    }

    public static /* bridge */ /* synthetic */ SelectRangeGesture l(Object obj) {
        return (SelectRangeGesture) obj;
    }

    public static /* bridge */ /* synthetic */ Object m(C0269p c0269p, Class cls) {
        return c0269p.get(cls);
    }

    public static /* synthetic */ void p() {
    }

    public static /* bridge */ /* synthetic */ boolean q(Object obj) {
        return obj instanceof DeleteGesture;
    }

    public static /* bridge */ /* synthetic */ ColorSpace.Named s() {
        return ColorSpace.Named.BT2020_PQ;
    }

    public static /* bridge */ /* synthetic */ boolean v(Object obj) {
        return obj instanceof SelectRangeGesture;
    }

    public static /* bridge */ /* synthetic */ boolean w(Object obj) {
        return obj instanceof DeleteRangeGesture;
    }
}
