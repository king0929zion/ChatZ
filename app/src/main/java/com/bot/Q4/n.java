package Q4;

import com.vladsch.flexmark.util.html.Attribute;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import m4.AbstractC1276k;
import n4.InterfaceC1372a;

/* loaded from: classes.dex */
public final class n implements Iterable, InterfaceC1372a {

    /* renamed from: c, reason: collision with root package name */
    public final String[] f6556c;

    public n(String[] strArr) {
        this.f6556c = strArr;
    }

    public final String a(String str) {
        AbstractC1276k.f(str, Attribute.NAME_ATTR);
        String[] strArr = this.f6556c;
        int length = strArr.length - 2;
        int Y5 = h5.e.Y(length, 0, -2);
        if (Y5 > length) {
            return null;
        }
        while (!u4.u.x(str, strArr[length], true)) {
            if (length == Y5) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public final String b(int i6) {
        return this.f6556c[i6 * 2];
    }

    public final m c() {
        m mVar = new m(0);
        ArrayList arrayList = mVar.a;
        AbstractC1276k.f(arrayList, "<this>");
        String[] strArr = this.f6556c;
        AbstractC1276k.f(strArr, "elements");
        arrayList.addAll(Y3.k.a0(strArr));
        return mVar;
    }

    public final String d(int i6) {
        return this.f6556c[(i6 * 2) + 1];
    }

    public final List e(String str) {
        AbstractC1276k.f(str, Attribute.NAME_ATTR);
        int size = size();
        ArrayList arrayList = null;
        for (int i6 = 0; i6 < size; i6++) {
            if (str.equalsIgnoreCase(b(i6))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(d(i6));
            }
        }
        if (arrayList == null) {
            return Y3.v.f9812c;
        }
        List unmodifiableList = Collections.unmodifiableList(arrayList);
        AbstractC1276k.e(unmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
        return unmodifiableList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return Arrays.equals(this.f6556c, ((n) obj).f6556c);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f6556c);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        X3.i[] iVarArr = new X3.i[size];
        for (int i6 = 0; i6 < size; i6++) {
            iVarArr[i6] = new X3.i(b(i6), d(i6));
        }
        return AbstractC1276k.i(iVarArr);
    }

    public final int size() {
        return this.f6556c.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i6 = 0; i6 < size; i6++) {
            String b5 = b(i6);
            String d6 = d(i6);
            sb.append(b5);
            sb.append(": ");
            if (R4.b.q(b5)) {
                d6 = "██";
            }
            sb.append(d6);
            sb.append(SequenceUtils.EOL);
        }
        String sb2 = sb.toString();
        AbstractC1276k.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
