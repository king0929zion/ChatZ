package Y3;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import j1.AbstractC1135a;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import m4.AbstractC1276k;
import u4.C1772j;

/* loaded from: classes.dex */
public final class E extends AbstractC0737d {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f9794c = 0;

    /* renamed from: e, reason: collision with root package name */
    public final Object f9795e;

    public E(List list) {
        AbstractC1276k.f(list, "delegate");
        this.f9795e = list;
    }

    @Override // Y3.AbstractC0734a
    public final int a() {
        switch (this.f9794c) {
            case 0:
                return ((List) this.f9795e).size();
            default:
                return ((C1772j) this.f9795e).a.groupCount() + 1;
        }
    }

    @Override // Y3.AbstractC0734a, java.util.Collection, java.util.List
    public /* bridge */ boolean contains(Object obj) {
        switch (this.f9794c) {
            case 1:
                if (obj instanceof String) {
                    return super.contains((String) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.List
    public final Object get(int i6) {
        switch (this.f9794c) {
            case 0:
                List list = (List) this.f9795e;
                if (i6 >= 0 && i6 <= Y4.l.C(this)) {
                    return list.get(Y4.l.C(this) - i6);
                }
                StringBuilder k3 = AbstractC1135a.k("Element index ", i6, " must be in range [");
                k3.append(new r4.e(0, Y4.l.C(this), 1));
                k3.append("].");
                throw new IndexOutOfBoundsException(k3.toString());
            default:
                String group = ((C1772j) this.f9795e).a.group(i6);
                return group == null ? FlexmarkHtmlConverter.DEFAULT_NODE : group;
        }
    }

    @Override // Y3.AbstractC0737d, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.f9794c) {
            case 1:
                if (obj instanceof String) {
                    return super.indexOf((String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // Y3.AbstractC0737d, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.f9794c) {
            case 0:
                return new D(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // Y3.AbstractC0737d, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.f9794c) {
            case 1:
                if (obj instanceof String) {
                    return super.lastIndexOf((String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // Y3.AbstractC0737d, java.util.List
    public ListIterator listIterator() {
        switch (this.f9794c) {
            case 0:
                return new D(this, 0);
            default:
                return super.listIterator();
        }
    }

    @Override // Y3.AbstractC0737d, java.util.List
    public ListIterator listIterator(int i6) {
        switch (this.f9794c) {
            case 0:
                return new D(this, i6);
            default:
                return super.listIterator(i6);
        }
    }

    public E(C1772j c1772j) {
        this.f9795e = c1772j;
    }
}
