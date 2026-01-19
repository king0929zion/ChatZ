package y1;

import B0.H;
import H0.C0158m;
import android.os.Build;
import i4.AbstractC1117a;
import i4.AbstractC1118b;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e extends AbstractC1117a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f15968c;

    public e(f fVar) {
        this.f15968c = fVar;
    }

    @Override // i4.AbstractC1117a
    public final void r(Throwable th) {
        this.f15968c.a.f(th);
    }

    @Override // i4.AbstractC1117a
    public final void s(H h3) {
        f fVar = this.f15968c;
        fVar.f15970c = h3;
        H h6 = fVar.f15970c;
        j jVar = fVar.a;
        fVar.f15969b = new C0158m(h6, jVar.f15980g, jVar.f15982i, Build.VERSION.SDK_INT >= 34 ? n.a() : AbstractC1118b.m());
        j jVar2 = fVar.a;
        jVar2.getClass();
        ArrayList arrayList = new ArrayList();
        jVar2.a.writeLock().lock();
        try {
            jVar2.f15976c = 1;
            arrayList.addAll(jVar2.f15975b);
            jVar2.f15975b.clear();
            jVar2.a.writeLock().unlock();
            jVar2.f15977d.post(new h(arrayList, jVar2.f15976c, null));
        } catch (Throwable th) {
            jVar2.a.writeLock().unlock();
            throw th;
        }
    }
}
