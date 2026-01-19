package y1;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.lifecycle.N;
import java.util.stream.IntStream;

/* loaded from: classes.dex */
public final class x implements Spannable {

    /* renamed from: c, reason: collision with root package name */
    public boolean f16011c = false;

    /* renamed from: e, reason: collision with root package name */
    public Spannable f16012e;

    public x(Spannable spannable) {
        this.f16012e = spannable;
    }

    public final void a() {
        Spannable spannable = this.f16012e;
        if (!this.f16011c) {
            if ((Build.VERSION.SDK_INT < 28 ? new N(27) : new N(27)).w(spannable)) {
                this.f16012e = new SpannableString(spannable);
            }
        }
        this.f16011c = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i6) {
        return this.f16012e.charAt(i6);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f16012e.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f16012e.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f16012e.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f16012e.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f16012e.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i6, int i7, Class cls) {
        return this.f16012e.getSpans(i6, i7, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f16012e.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i6, int i7, Class cls) {
        return this.f16012e.nextSpanTransition(i6, i7, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f16012e.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i6, int i7, int i8) {
        a();
        this.f16012e.setSpan(obj, i6, i7, i8);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i6, int i7) {
        return this.f16012e.subSequence(i6, i7);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f16012e.toString();
    }
}
