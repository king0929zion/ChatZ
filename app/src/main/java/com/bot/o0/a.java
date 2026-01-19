package O0;

import S.l;
import T.C0607g0;
import X3.y;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class a extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f4274h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ f f4275i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Runnable f4276j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f fVar, Runnable runnable, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f4275i = fVar;
        this.f4276j = runnable;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((a) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new a(this.f4275i, this.f4276j, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f4274h;
        y yVar = y.a;
        f fVar = this.f4275i;
        if (i6 == 0) {
            X3.a.e(obj);
            i iVar = fVar.f4300f;
            this.f4274h = 1;
            Object b5 = iVar.b(l.f7374V - iVar.f4305b, this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (b5 != enumC0927a) {
                b5 = yVar;
            }
            if (b5 == enumC0927a) {
                return enumC0927a;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
        }
        ((C0607g0) fVar.f4297c.f119e).setValue(Boolean.FALSE);
        this.f4276j.run();
        return yVar;
    }
}
