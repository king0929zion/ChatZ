package d1;

import g1.AbstractC1016a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public static final l f11393b = new l(0);

    /* renamed from: c, reason: collision with root package name */
    public static final l f11394c = new l(1);

    /* renamed from: d, reason: collision with root package name */
    public static final l f11395d = new l(2);
    public final int a;

    public l(int i6) {
        this.a = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            return this.a == ((l) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i6 = this.a;
        if (i6 == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i6 & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i6 & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() != 1) {
            return B3.e.r(new StringBuilder("TextDecoration["), AbstractC1016a.a(arrayList, ", ", null, 62), ']');
        }
        return "TextDecoration." + ((String) arrayList.get(0));
    }
}
