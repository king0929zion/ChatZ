package I;

import android.view.DisplayCutout;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassificationContext;
import android.view.textclassifier.TextSelection;

/* loaded from: classes.dex */
public abstract /* synthetic */ class u {
    public static /* synthetic */ void A() {
    }

    public static /* synthetic */ void D() {
    }

    public static /* bridge */ /* synthetic */ DisplayCutout d(Object obj) {
        return (DisplayCutout) obj;
    }

    public static /* synthetic */ TextClassification.Request.Builder f(CharSequence charSequence, int i6, int i7) {
        return new TextClassification.Request.Builder(charSequence, i6, i7);
    }

    public static /* synthetic */ TextClassificationContext.Builder i(String str, String str2) {
        return new TextClassificationContext.Builder(str, str2);
    }

    public static /* synthetic */ TextSelection.Request.Builder m(CharSequence charSequence, int i6, int i7) {
        return new TextSelection.Request.Builder(charSequence, i6, i7);
    }

    public static /* synthetic */ void r() {
    }

    public static /* bridge */ /* synthetic */ boolean y(Object obj) {
        return obj instanceof DisplayCutout;
    }
}
