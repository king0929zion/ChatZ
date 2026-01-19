package Y;

import Y3.AbstractC0734a;
import i4.AbstractC1117a;
import java.util.Iterator;
import java.util.regex.Matcher;
import m4.AbstractC1276k;
import u4.C1771i;
import u4.C1772j;

/* loaded from: classes.dex */
public final class m extends AbstractC0734a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f9567c;

    /* renamed from: e, reason: collision with root package name */
    public final Object f9568e;

    public /* synthetic */ m(Object obj, int i6) {
        this.f9567c = i6;
        this.f9568e = obj;
    }

    @Override // Y3.AbstractC0734a
    public final int a() {
        switch (this.f9567c) {
            case 0:
                c cVar = (c) this.f9568e;
                cVar.getClass();
                return cVar.f9545e;
            default:
                return ((C1772j) this.f9568e).a.groupCount() + 1;
        }
    }

    public C1771i b(int i6) {
        Matcher matcher = ((C1772j) this.f9568e).a;
        r4.g z5 = AbstractC1117a.z(matcher.start(i6), matcher.end(i6));
        if (z5.f14679c < 0) {
            return null;
        }
        String group = matcher.group(i6);
        AbstractC1276k.e(group, "group(...)");
        return new C1771i(group, z5);
    }

    @Override // Y3.AbstractC0734a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.f9567c) {
            case 0:
                return ((c) this.f9568e).containsValue(obj);
            default:
                if (obj == null ? true : obj instanceof C1771i) {
                    return super.contains((C1771i) obj);
                }
                return false;
        }
    }

    @Override // Y3.AbstractC0734a, java.util.Collection
    public boolean isEmpty() {
        switch (this.f9567c) {
            case 1:
                return false;
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f9567c) {
            case 0:
                n nVar = ((c) this.f9568e).f9544c;
                o[] oVarArr = new o[8];
                for (int i6 = 0; i6 < 8; i6++) {
                    oVarArr[i6] = new p(2);
                }
                return new d(nVar, oVarArr);
            default:
                return new N3.l(new t4.o(Y3.m.h0(new r4.e(0, a() - 1, 1)), new W0.e(this, 13), 1));
        }
    }
}
