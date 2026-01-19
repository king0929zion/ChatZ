package e1;

import f1.InterfaceC1004a;
import j1.AbstractC1135a;

/* loaded from: classes.dex */
public final class n implements InterfaceC1004a {
    public final float a;

    public n(float f6) {
        this.a = f6;
    }

    @Override // f1.InterfaceC1004a
    public final float a(float f6) {
        return f6 / this.a;
    }

    @Override // f1.InterfaceC1004a
    public final float b(float f6) {
        return f6 * this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && Float.compare(this.a, ((n) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return AbstractC1135a.h(new StringBuilder("LinearFontScaleConverter(fontScale="), this.a, ')');
    }
}
