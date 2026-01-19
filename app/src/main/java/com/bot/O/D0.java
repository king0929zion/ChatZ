package O;

import android.view.textclassifier.TextClassification;
import j1.AbstractC1135a;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class D0 {
    public final CharSequence a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3928b;

    /* renamed from: c, reason: collision with root package name */
    public final TextClassification f3929c;

    public D0(CharSequence charSequence, long j3, TextClassification textClassification) {
        this.a = charSequence;
        this.f3928b = j3;
        this.f3929c = textClassification;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D0)) {
            return false;
        }
        D0 d02 = (D0) obj;
        return AbstractC1276k.b(this.a, d02.a) && S0.O.b(this.f3928b, d02.f3928b) && AbstractC1276k.b(this.f3929c, d02.f3929c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i6 = S0.O.f7611c;
        return this.f3929c.hashCode() + AbstractC1135a.c(hashCode, 31, this.f3928b);
    }

    public final String toString() {
        return "TextClassificationResult(text=" + ((Object) this.a) + ", selection=" + ((Object) S0.O.h(this.f3928b)) + ", textClassification=" + this.f3929c + ')';
    }
}
