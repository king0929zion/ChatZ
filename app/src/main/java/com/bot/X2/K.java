package X2;

import A4.g0;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class K extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f9191h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ L f9192i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f9193j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(L l3, String str, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f9192i = l3;
        this.f9193j = str;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((K) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new K(this.f9192i, this.f9193j, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f9191h;
        L l3 = this.f9192i;
        if (i6 == 0) {
            X3.a.e(obj);
            O2.a aVar = l3.f9210k;
            this.f9191h = 1;
            I2.v vVar = aVar.a;
            vVar.getClass();
            Y3.v vVar2 = Y3.v.f9812c;
            obj = vVar.c(this, new I2.q(vVar2, vVar, this.f9193j, FlexmarkHtmlConverter.DEFAULT_NODE, null, vVar2, null));
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (obj == enumC0927a) {
                return enumC0927a;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
        }
        D2.i iVar = (D2.i) obj;
        if (iVar instanceof D2.f) {
            g0 g0Var = l3.f9222w;
            String str = ((D2.f) iVar).a;
            g0Var.getClass();
            g0Var.l(null, str);
        }
        return X3.y.a;
    }
}
