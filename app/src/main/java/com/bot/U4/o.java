package u4;

import com.vladsch.flexmark.util.sequence.SequenceUtils;
import i1.AbstractC1087g;
import i4.AbstractC1120d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public abstract class o extends AbstractC1087g {
    public static String p(String str) {
        AbstractC1276k.f(str, "<this>");
        return t4.j.r(new t4.o(new Y3.t(str, 3), new M2.b("    ", 10), 1), SequenceUtils.EOL);
    }

    public static String q(String str) {
        Comparable comparable;
        AbstractC1276k.f(str, "<this>");
        List U5 = AbstractC1776n.U(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : U5) {
            if (!AbstractC1776n.Q((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(Y3.n.Z(arrayList, 10));
        int size = arrayList.size();
        int i6 = 0;
        int i7 = 0;
        while (i7 < size) {
            Object obj2 = arrayList.get(i7);
            i7++;
            String str2 = (String) obj2;
            int length = str2.length();
            int i8 = 0;
            while (true) {
                if (i8 >= length) {
                    i8 = -1;
                    break;
                }
                if (!AbstractC1120d.r(str2.charAt(i8))) {
                    break;
                }
                i8++;
            }
            if (i8 == -1) {
                i8 = str2.length();
            }
            arrayList2.add(Integer.valueOf(i8));
        }
        Iterator it = arrayList2.iterator();
        if (it.hasNext()) {
            comparable = (Comparable) it.next();
            while (it.hasNext()) {
                Comparable comparable2 = (Comparable) it.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int intValue = num != null ? num.intValue() : 0;
        int length2 = str.length();
        U5.size();
        int C5 = Y4.l.C(U5);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : U5) {
            int i9 = i6 + 1;
            if (i6 < 0) {
                Y4.l.U();
                throw null;
            }
            String str3 = (String) obj3;
            String I5 = ((i6 == 0 || i6 == C5) && AbstractC1776n.Q(str3)) ? null : AbstractC1776n.I(intValue, str3);
            if (I5 != null) {
                arrayList3.add(I5);
            }
            i6 = i9;
        }
        StringBuilder sb = new StringBuilder(length2);
        Y3.m.u0(arrayList3, sb, SequenceUtils.EOL, null, 124);
        return sb.toString();
    }

    public static String r(String str) {
        AbstractC1276k.f(str, "<this>");
        if (AbstractC1776n.Q("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List U5 = AbstractC1776n.U(str);
        int length = str.length();
        U5.size();
        int C5 = Y4.l.C(U5);
        ArrayList arrayList = new ArrayList();
        Iterator it = U5.iterator();
        int i6 = 0;
        while (true) {
            String str2 = null;
            if (!it.hasNext()) {
                StringBuilder sb = new StringBuilder(length);
                Y3.m.u0(arrayList, sb, SequenceUtils.EOL, null, 124);
                return sb.toString();
            }
            Object next = it.next();
            int i7 = i6 + 1;
            if (i6 < 0) {
                Y4.l.U();
                throw null;
            }
            String str3 = (String) next;
            if ((i6 != 0 && i6 != C5) || !AbstractC1776n.Q(str3)) {
                int length2 = str3.length();
                int i8 = 0;
                while (true) {
                    if (i8 >= length2) {
                        i8 = -1;
                        break;
                    }
                    if (!AbstractC1120d.r(str3.charAt(i8))) {
                        break;
                    }
                    i8++;
                }
                if (i8 != -1 && u.C(str3, "|", i8, false)) {
                    str2 = str3.substring("|".length() + i8);
                    AbstractC1276k.e(str2, "substring(...)");
                }
                if (str2 == null) {
                    str2 = str3;
                }
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
            i6 = i7;
        }
    }
}
