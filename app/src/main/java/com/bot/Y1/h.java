package y1;

import a1.C0799g;
import i4.AbstractC1120d;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class h implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f15971c;

    /* renamed from: e, reason: collision with root package name */
    public final int f15972e;

    public h(List list, int i6, Throwable th) {
        AbstractC1120d.f(list, "initCallbacks cannot be null");
        this.f15971c = new ArrayList(list);
        this.f15972e = i6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f15971c;
        int size = arrayList.size();
        int i6 = 0;
        if (this.f15972e != 1) {
            while (i6 < size) {
                ((C0799g) arrayList.get(i6)).f10576b.f119e = a1.j.a;
                i6++;
            }
            return;
        }
        while (i6 < size) {
            C0799g c0799g = (C0799g) arrayList.get(i6);
            c0799g.a.setValue(Boolean.TRUE);
            c0799g.f10576b.f119e = new a1.k(true);
            i6++;
        }
    }
}
