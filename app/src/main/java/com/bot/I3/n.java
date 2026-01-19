package I3;

import com.vladsch.flexmark.util.html.Attribute;
import java.util.List;
import java.util.Map;
import m4.AbstractC1276k;
import u4.AbstractC1776n;

/* loaded from: classes.dex */
public final class n extends N3.s implements z {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2750b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i6) {
        super(0);
        this.f2750b = i6;
    }

    @Override // N3.s
    public void r(String str) {
        switch (this.f2750b) {
            case 0:
                AbstractC1276k.f(str, Attribute.NAME_ATTR);
                List list = r.a;
                int i6 = 0;
                int i7 = 0;
                while (i6 < str.length()) {
                    char charAt = str.charAt(i6);
                    int i8 = i7 + 1;
                    if (AbstractC1276k.g(charAt, 32) <= 0 || AbstractC1776n.H("\"(),/:;<=>?@[\\]{}", charAt)) {
                        StringBuilder t5 = B3.e.t("Header name '", str, "' contains illegal character '");
                        t5.append(str.charAt(i7));
                        t5.append("' (code ");
                        throw new IllegalArgumentException(B3.e.q(t5, str.charAt(i7) & 255, ')'));
                    }
                    i6++;
                    i7 = i8;
                }
                return;
            default:
                super.r(str);
                return;
        }
    }

    @Override // N3.s
    public void s(String str) {
        switch (this.f2750b) {
            case 0:
                AbstractC1276k.f(str, "value");
                List list = r.a;
                int i6 = 0;
                int i7 = 0;
                while (i6 < str.length()) {
                    char charAt = str.charAt(i6);
                    int i8 = i7 + 1;
                    if (AbstractC1276k.g(charAt, 32) < 0 && charAt != '\t') {
                        StringBuilder t5 = B3.e.t("Header value '", str, "' contains illegal character '");
                        t5.append(str.charAt(i7));
                        t5.append("' (code ");
                        throw new IllegalArgumentException(B3.e.q(t5, str.charAt(i7) & 255, ')'));
                    }
                    i6++;
                    i7 = i8;
                }
                return;
            default:
                super.s(str);
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [I3.o, N3.t] */
    public o t() {
        Map map = (Map) this.a;
        AbstractC1276k.f(map, "values");
        return new N3.t(map);
    }
}
