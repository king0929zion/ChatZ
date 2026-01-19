package z3;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import i4.AbstractC1118b;
import java.util.concurrent.CancellationException;
import x4.AbstractC1888A;

/* renamed from: z3.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2042l extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f16282h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f16283i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f16284j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ F3.c f16285k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2042l(Object obj, F3.c cVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f16284j = obj;
        this.f16285k = cVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C2042l) p((InterfaceC0905c) obj2, (io.ktor.utils.io.C) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        C2042l c2042l = new C2042l(this.f16284j, this.f16285k, interfaceC0905c);
        c2042l.f16283i = obj;
        return c2042l;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f16282h;
        F3.c cVar = this.f16285k;
        try {
            if (i6 != 0) {
                try {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    X3.a.e(obj);
                } catch (Throwable th) {
                    Y4.d.u(cVar);
                    throw th;
                }
            } else {
                X3.a.e(obj);
                io.ktor.utils.io.C c6 = (io.ktor.utils.io.C) this.f16283i;
                io.ktor.utils.io.y yVar = (io.ktor.utils.io.y) this.f16284j;
                io.ktor.utils.io.t tVar = c6.f12089c;
                this.f16282h = 1;
                Object i7 = AbstractC1118b.i(yVar, tVar, this);
                EnumC0927a enumC0927a = EnumC0927a.f11114c;
                if (i7 == enumC0927a) {
                    return enumC0927a;
                }
            }
            Y4.d.u(cVar);
            return X3.y.a;
        } catch (CancellationException e6) {
            AbstractC1888A.j(cVar, e6);
            throw e6;
        } catch (Throwable th2) {
            AbstractC1888A.j(cVar, AbstractC1888A.a("Receive failed", th2));
            throw th2;
        }
    }
}
