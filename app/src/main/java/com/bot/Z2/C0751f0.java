package Z2;

import a3.C0824m;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import u4.AbstractC1776n;
import x4.AbstractC1888A;
import x4.InterfaceC1942y;

/* renamed from: Z2.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0751f0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f10201h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f10202i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ a3.w f10203j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0751f0(a3.w wVar, InterfaceC0905c interfaceC0905c, String str) {
        super(2, interfaceC0905c);
        this.f10202i = str;
        this.f10203j = wVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0751f0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C0751f0(this.f10203j, interfaceC0905c, this.f10202i);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f10201h;
        if (i6 == 0) {
            X3.a.e(obj);
            String str = this.f10202i;
            if (str != null && !AbstractC1776n.Q(str)) {
                boolean equals = str.equals("new");
                a3.w wVar = this.f10203j;
                if (equals) {
                    this.f10201h = 1;
                    wVar.B();
                    EnumC0927a enumC0927a = EnumC0927a.f11114c;
                    if ("new" == enumC0927a) {
                        return enumC0927a;
                    }
                } else {
                    wVar.getClass();
                    if (!AbstractC1776n.Q(str)) {
                        AbstractC1888A.y(androidx.lifecycle.O.i(wVar), null, new C0824m(wVar, null, str), 3);
                    }
                }
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
        }
        return X3.y.a;
    }
}
