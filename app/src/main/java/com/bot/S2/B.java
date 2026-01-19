package S2;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class B extends X {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7681b;

    public B(String str, String str2) {
        AbstractC1276k.f(str, FlexmarkHtmlConverter.CODE_NODE);
        this.a = str;
        this.f7681b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b5 = (B) obj;
        return AbstractC1276k.b(this.a, b5.a) && AbstractC1276k.b(this.f7681b, b5.f7681b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.f7681b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return B3.e.o("CodeBlock(code=", this.a, ", language=", this.f7681b, ")");
    }
}
