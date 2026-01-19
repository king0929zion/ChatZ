package Q4;

import com.vladsch.flexmark.util.html.Attribute;
import java.util.ArrayList;
import m4.AbstractC1276k;
import u4.AbstractC1776n;

/* loaded from: classes.dex */
public final class m {
    public final ArrayList a;

    public m(int i6) {
        switch (i6) {
            case 1:
                this.a = new ArrayList(32);
                return;
            default:
                this.a = new ArrayList(20);
                return;
        }
    }

    public void a(String str, String str2) {
        AbstractC1276k.f(str, Attribute.NAME_ATTR);
        AbstractC1276k.f(str2, "value");
        ArrayList arrayList = this.a;
        arrayList.add(str);
        arrayList.add(AbstractC1776n.l0(str2).toString());
    }

    public void b(String str, String str2) {
        AbstractC1276k.f(str, Attribute.NAME_ATTR);
        AbstractC1276k.f(str2, "value");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i6 = 0; i6 < length; i6++) {
            char charAt = str.charAt(i6);
            if ('!' > charAt || charAt >= 127) {
                throw new IllegalArgumentException(R4.b.i("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i6), str).toString());
            }
        }
        a(str, str2);
    }

    public void c(float f6, float f7, float f8, float f9, boolean z5) {
        this.a.add(new u0.s(f6, f7, S.l.f7374V, false, z5, f8, f9));
    }

    public n d() {
        return new n((String[]) this.a.toArray(new String[0]));
    }

    public void e(float f6, float f7, float f8, float f9, float f10, float f11) {
        this.a.add(new u0.t(f6, f7, f8, f9, f10, f11));
    }

    public void f(String str) {
        int i6 = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i6 >= arrayList.size()) {
                return;
            }
            if (str.equalsIgnoreCase((String) arrayList.get(i6))) {
                arrayList.remove(i6);
                arrayList.remove(i6);
                i6 -= 2;
            }
            i6 += 2;
        }
    }
}
