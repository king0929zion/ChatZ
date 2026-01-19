package t4;

import Y3.t;
import Y3.v;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import i1.AbstractC1087g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import m4.AbstractC1276k;
import p.O0;

/* loaded from: classes.dex */
public abstract class j extends k {
    public static h p(Iterator it) {
        AbstractC1276k.f(it, "<this>");
        return new C1729a(new t(it, 2));
    }

    public static h q(Object obj, l4.c cVar) {
        return obj == null ? C1732d.a : new g(new Y3.l(obj, 19), cVar);
    }

    public static String r(h hVar, String str) {
        AbstractC1276k.f(hVar, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) FlexmarkHtmlConverter.DEFAULT_NODE);
        int i6 = 0;
        for (Object obj : hVar) {
            i6++;
            if (i6 > 1) {
                sb.append((CharSequence) str);
            }
            AbstractC1087g.g(sb, obj, null);
        }
        sb.append((CharSequence) FlexmarkHtmlConverter.DEFAULT_NODE);
        return sb.toString();
    }

    public static Object s(h hVar) {
        Iterator it = hVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static f t(t tVar, l4.c cVar) {
        return new f(new o(tVar, cVar, 1), false, new O0(10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static h u(f fVar) {
        return fVar instanceof InterfaceC1731c ? ((InterfaceC1731c) fVar).take() : new n(fVar);
    }

    public static List v(h hVar) {
        AbstractC1276k.f(hVar, "<this>");
        Iterator it = hVar.iterator();
        if (!it.hasNext()) {
            return v.f9812c;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return Y4.l.H(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
