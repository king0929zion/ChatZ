package i0;

import X3.y;
import android.view.ViewStructure;
import m4.AbstractC1277l;

/* renamed from: i0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1076o extends AbstractC1277l implements l4.g {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewStructure f11954e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1076o(ViewStructure viewStructure) {
        super(4);
        this.f11954e = viewStructure;
    }

    @Override // l4.g
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        int intValue3 = ((Number) obj3).intValue();
        int intValue4 = ((Number) obj4).intValue() - intValue2;
        this.f11954e.setDimens(intValue, intValue2, 0, 0, intValue3 - intValue, intValue4);
        return y.a;
    }
}
