package D;

import e1.InterfaceC0961c;
import java.util.List;

/* loaded from: classes.dex */
public final class W implements F0.V {
    public final /* synthetic */ C0098v0 a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l4.c f947b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ X0.v f948c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ X0.p f949d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0961c f950e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f951f;

    public W(C0098v0 c0098v0, l4.c cVar, X0.v vVar, X0.p pVar, InterfaceC0961c interfaceC0961c, int i6) {
        this.a = c0098v0;
        this.f947b = cVar;
        this.f948c = vVar;
        this.f949d = pVar;
        this.f950e = interfaceC0961c;
        this.f951f = i6;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01de  */
    @Override // F0.V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final F0.W e(F0.X r30, java.util.List r31, long r32) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D.W.e(F0.X, java.util.List, long):F0.W");
    }

    @Override // F0.V
    public final int j(F0.r rVar, List list, int i6) {
        C0098v0 c0098v0 = this.a;
        c0098v0.a.a(rVar.getLayoutDirection());
        E1.b bVar = c0098v0.a.f776j;
        if (bVar != null) {
            return AbstractC0090r0.o(bVar.c());
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }
}
