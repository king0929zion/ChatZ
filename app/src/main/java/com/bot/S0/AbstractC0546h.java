package S0;

import P2.D0;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import i4.AbstractC1117a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: S0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0546h {
    public static final C0545g a = new C0545g(FlexmarkHtmlConverter.DEFAULT_NODE);

    public static final List a(C0545g c0545g, int i6, int i7, D0 d02) {
        List list;
        if (i6 == i7 || (list = c0545g.f7629c) == null) {
            return null;
        }
        if (i6 != 0 || i7 < c0545g.f7630e.length()) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                C0543e c0543e = (C0543e) list.get(i8);
                if ((d02 != null ? ((Boolean) d02.f(c0543e.a)).booleanValue() : true) && b(i6, i7, c0543e.f7626b, c0543e.f7627c)) {
                    arrayList.add(new C0543e((InterfaceC0540b) c0543e.a, AbstractC1117a.f(c0543e.f7626b, i6, i7) - i6, AbstractC1117a.f(c0543e.f7627c, i6, i7) - i6, c0543e.f7628d));
                }
            }
            return arrayList;
        }
        if (d02 == null) {
            return list;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        for (int i9 = 0; i9 < size2; i9++) {
            Object obj = list.get(i9);
            if (((Boolean) d02.f(((C0543e) obj).a)).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static final boolean b(int i6, int i7, int i8, int i9) {
        return ((i6 < i9) & (i8 < i7)) | (((i6 == i7) | (i8 == i9)) & (i6 == i8));
    }
}
