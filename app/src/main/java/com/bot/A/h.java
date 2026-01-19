package A;

import B0.C0028d;
import H0.i0;
import l4.InterfaceC1193a;
import m4.AbstractC1275j;
import m4.C1274i;

/* loaded from: classes.dex */
public final /* synthetic */ class h extends C1274i implements InterfaceC1193a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l f14l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i0 f15m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0028d f16n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(l lVar, i0 i0Var, C0028d c0028d) {
        super(0, AbstractC1275j.class, "localRect", "bringIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
        this.f14l = lVar;
        this.f15m = i0Var;
        this.f16n = c0028d;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        return l.M0(this.f14l, this.f15m, this.f16n);
    }
}
