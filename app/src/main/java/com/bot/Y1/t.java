package y1;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class t {
    public final SparseArray a;

    /* renamed from: b, reason: collision with root package name */
    public u f16002b;

    public t(int i6) {
        this.a = new SparseArray(i6);
    }

    public final void a(u uVar, int i6, int i7) {
        int a = uVar.a(i6);
        SparseArray sparseArray = this.a;
        t tVar = sparseArray == null ? null : (t) sparseArray.get(a);
        if (tVar == null) {
            tVar = new t(1);
            sparseArray.put(uVar.a(i6), tVar);
        }
        if (i7 > i6) {
            tVar.a(uVar, i6 + 1, i7);
        } else {
            tVar.f16002b = uVar;
        }
    }
}
