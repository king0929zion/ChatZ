package M3;

import X3.n;
import b4.InterfaceC0905c;
import d4.i;
import io.ktor.utils.io.jvm.javaio.h;
import io.ktor.utils.io.y;
import java.util.Collections;
import m4.AbstractC1276k;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class a extends i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ y f3410h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ R3.a f3411i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ N4.c f3412j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(y yVar, R3.a aVar, N4.c cVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f3410h = yVar;
        this.f3411i = aVar;
        this.f3412j = cVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        ((a) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
        throw null;
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new a(this.f3410h, this.f3411i, this.f3412j, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        X3.a.e(obj);
        n nVar = io.ktor.utils.io.jvm.javaio.d.a;
        y yVar = this.f3410h;
        AbstractC1276k.f(yVar, "<this>");
        new h(null, yVar);
        AbstractC1276k.f(this.f3411i, "<this>");
        Collections.EMPTY_LIST.get(0).getClass();
        throw new ClassCastException();
    }
}
