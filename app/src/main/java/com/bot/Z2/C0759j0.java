package Z2;

import b4.InterfaceC0905c;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import x4.InterfaceC1942y;

/* renamed from: Z2.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0759j0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f10237h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Integer f10238i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ T.X f10239j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ T.X f10240k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0759j0(String str, Integer num, T.X x5, T.X x6, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f10237h = str;
        this.f10238i = num;
        this.f10239j = x5;
        this.f10240k = x6;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        C0759j0 c0759j0 = (C0759j0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj);
        X3.y yVar = X3.y.a;
        c0759j0.r(yVar);
        return yVar;
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C0759j0(this.f10237h, this.f10238i, this.f10239j, this.f10240k, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        X3.a.e(obj);
        if (!((Boolean) this.f10239j.getValue()).booleanValue() && this.f10237h == null) {
            Integer num = this.f10238i;
            String num2 = num != null ? num.toString() : null;
            if (num2 == null) {
                num2 = FlexmarkHtmlConverter.DEFAULT_NODE;
            }
            this.f10240k.setValue(num2);
        }
        return X3.y.a;
    }
}
