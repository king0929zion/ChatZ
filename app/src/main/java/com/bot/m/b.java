package M;

import F0.InterfaceC0134w;
import m4.AbstractC1275j;
import m4.C1274i;
import o0.C1382D;

/* loaded from: classes.dex */
public final /* synthetic */ class b extends C1274i implements l4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ t f3132l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(t tVar) {
        super(1, AbstractC1275j.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.f3132l = tVar;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        float[] fArr = ((C1382D) obj).a;
        InterfaceC0134w interfaceC0134w = (InterfaceC0134w) this.f3132l.f3189u.getValue();
        if (interfaceC0134w != null) {
            if (!interfaceC0134w.j()) {
                interfaceC0134w = null;
            }
            if (interfaceC0134w != null) {
                interfaceC0134w.k(fArr);
            }
        }
        return X3.y.a;
    }
}
