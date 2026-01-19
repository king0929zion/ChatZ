package T;

import com.vladsch.flexmark.util.sequence.SequenceUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import k.C1178z;

/* renamed from: T.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0612j extends RuntimeException {

    /* renamed from: c, reason: collision with root package name */
    public final k.I f8110c;

    /* renamed from: e, reason: collision with root package name */
    public final k.I f8111e;

    /* renamed from: f, reason: collision with root package name */
    public final C1178z f8112f;

    /* renamed from: g, reason: collision with root package name */
    public final int f8113g;

    public C0612j(k.I i6, k.I i7, C1178z c1178z, int i8, Exception exc) {
        super(exc);
        this.f8110c = i6;
        this.f8111e = i7;
        this.f8112f = c1178z;
        this.f8113g = i8;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        Collection collection;
        StringBuilder sb = new StringBuilder("\n            |Failed to execute op number ");
        sb.append(this.f8113g);
        sb.append(":\n            |");
        List v5 = t4.j.v(new Y3.t(new C0610i(this, null)));
        int size = v5.size();
        if (50 >= size) {
            collection = Y3.m.J0(v5);
        } else {
            ArrayList arrayList = new ArrayList(50);
            if (v5 instanceof RandomAccess) {
                for (int i6 = size - 50; i6 < size; i6++) {
                    arrayList.add(v5.get(i6));
                }
            } else {
                ListIterator listIterator = v5.listIterator(size - 50);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
            }
            collection = arrayList;
        }
        sb.append(Y3.m.v0(collection, SequenceUtils.EOL, null, null, null, 62));
        sb.append("\n            ");
        return u4.o.r(sb.toString());
    }
}
