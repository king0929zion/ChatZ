package J1;

import A4.C0024z;
import A4.InterfaceC0007h;
import T.C0599c0;
import T.X;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import java.util.List;
import java.util.concurrent.CancellationException;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class x extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f2893h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f2894i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f2895j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ X f2896k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0599c0 f2897l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ X f2898m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(i iVar, X x5, C0599c0 c0599c0, X x6, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f2895j = iVar;
        this.f2896k = x5;
        this.f2897l = c0599c0;
        this.f2898m = x6;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((x) p((InterfaceC0905c) obj2, (InterfaceC0007h) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        x xVar = new x(this.f2895j, this.f2896k, this.f2897l, this.f2898m, interfaceC0905c);
        xVar.f2894i = obj;
        return xVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        I1.j jVar;
        int i6 = this.f2893h;
        X x5 = this.f2898m;
        i iVar = this.f2895j;
        X x6 = this.f2896k;
        try {
            if (i6 == 0) {
                X3.a.e(obj);
                InterfaceC0007h interfaceC0007h = (InterfaceC0007h) this.f2894i;
                int size = ((List) x6.getValue()).size();
                C0599c0 c0599c0 = this.f2897l;
                if (size > 1) {
                    c0599c0.h(S.l.f7374V);
                    jVar = (I1.j) Y3.m.x0((List) x6.getValue());
                    AbstractC1276k.c(jVar);
                    iVar.g(jVar);
                    iVar.g((I1.j) ((List) x6.getValue()).get(((List) x6.getValue()).size() - 2));
                } else {
                    jVar = null;
                }
                C0024z c0024z = new C0024z(x6, x5, c0599c0, 2);
                this.f2894i = jVar;
                this.f2893h = 1;
                Object b5 = interfaceC0007h.b(c0024z, this);
                EnumC0927a enumC0927a = EnumC0927a.f11114c;
                if (b5 == enumC0927a) {
                    return enumC0927a;
                }
            } else {
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jVar = (I1.j) this.f2894i;
                X3.a.e(obj);
            }
            if (((List) x6.getValue()).size() > 1) {
                x5.setValue(Boolean.FALSE);
                AbstractC1276k.c(jVar);
                iVar.e(jVar, false);
            }
        } catch (CancellationException unused) {
            if (((List) x6.getValue()).size() > 1) {
                x5.setValue(Boolean.FALSE);
            }
        }
        return X3.y.a;
    }
}
