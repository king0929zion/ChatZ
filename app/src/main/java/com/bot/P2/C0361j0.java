package P2;

import T.C0601d0;
import java.util.Iterator;
import l4.InterfaceC1193a;

/* renamed from: P2.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0361j0 implements InterfaceC1193a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4965c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x.s f4966e;

    public /* synthetic */ C0361j0(x.s sVar, int i6) {
        this.f4965c = i6;
        this.f4966e = sVar;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.lang.Iterable] */
    @Override // l4.InterfaceC1193a
    public final Object b() {
        switch (this.f4965c) {
            case 0:
                return Boolean.valueOf(!this.f4966e.d());
            case 1:
                Iterator it = this.f4966e.g().f15501k.iterator();
                int i6 = 0;
                while (it.hasNext()) {
                    i6 += ((x.m) it.next()).f15522p;
                }
                return Integer.valueOf(i6);
            case 2:
                x.s sVar = this.f4966e;
                return new X3.i(Integer.valueOf(((C0601d0) sVar.f15548e.f378b).g()), Integer.valueOf(((C0601d0) sVar.f15548e.f379c).g()));
            case 3:
                return this.f4966e.g().f15501k;
            case 4:
                return this.f4966e.g();
            default:
                return Integer.valueOf(this.f4966e.g().f15504n);
        }
    }
}
