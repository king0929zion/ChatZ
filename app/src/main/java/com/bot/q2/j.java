package Q2;

import X3.y;
import b4.InterfaceC0905c;
import com.bot.feature.settings.data.VendorConfig;
import f0.C0999v;
import java.util.List;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class j extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ List f6422h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0999v f6423i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(List list, C0999v c0999v, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f6422h = list;
        this.f6423i = c0999v;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        j jVar = (j) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj);
        y yVar = y.a;
        jVar.r(yVar);
        return yVar;
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new j(this.f6422h, this.f6423i, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        X3.a.e(obj);
        for (VendorConfig vendorConfig : this.f6422h) {
            String str = vendorConfig.a;
            C0999v c0999v = this.f6423i;
            if (c0999v.get(str) == null) {
                c0999v.put(vendorConfig.a, Boolean.valueOf(!vendorConfig.f11272c.isEmpty()));
            }
        }
        return y.a;
    }
}
