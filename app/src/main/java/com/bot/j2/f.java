package j2;

import F0.C0120h;
import F0.InterfaceC0121i;
import android.graphics.drawable.Drawable;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import i2.C1111e;
import i2.C1115i;
import m4.AbstractC1276k;
import s2.AbstractC1662j;
import s2.C1656d;
import s2.C1657e;
import s2.C1660h;
import s2.C1661i;
import s2.C1667o;
import t2.C1721e;
import t2.EnumC1720d;
import t2.EnumC1722f;
import x4.AbstractC1888A;
import x4.AbstractC1898K;

/* loaded from: classes.dex */
public final class f extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f12366h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f12367i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l f12368j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(l lVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f12368j = lVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((f) p((InterfaceC0905c) obj2, (C1661i) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        f fVar = new f(this.f12368j, interfaceC0905c);
        fVar.f12367i = obj;
        return fVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        l lVar;
        int i6 = this.f12366h;
        if (i6 == 0) {
            X3.a.e(obj);
            C1661i c1661i = (C1661i) this.f12367i;
            lVar = this.f12368j;
            C1115i c1115i = (C1115i) lVar.f12392v.getValue();
            C1660h a = C1661i.a(c1661i);
            a.f14752d = new i(lVar);
            a.f14763o = null;
            a.f14764p = null;
            a.f14765q = null;
            C1656d c1656d = c1661i.f14789y;
            if (c1656d.a == null) {
                a.f14761m = new i(lVar);
                a.f14763o = null;
                a.f14764p = null;
                a.f14765q = null;
            }
            if (c1656d.f14743b == null) {
                InterfaceC0121i interfaceC0121i = lVar.f12387q;
                C1721e c1721e = B.f12363b;
                a.f14762n = (AbstractC1276k.b(interfaceC0121i, C0120h.f1476b) || AbstractC1276k.b(interfaceC0121i, C0120h.f1477c)) ? EnumC1722f.f14907e : EnumC1722f.f14906c;
            }
            if (c1656d.f14745d != EnumC1720d.f14902c) {
                a.f14753e = EnumC1720d.f14903e;
            }
            C1661i a6 = a.a();
            this.f12367i = lVar;
            this.f12366h = 1;
            c1115i.getClass();
            E4.e eVar = AbstractC1898K.a;
            obj = AbstractC1888A.H(C4.o.a.f16023i, new C1111e(c1115i, a6, null), this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (obj == enumC0927a) {
                return enumC0927a;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lVar = (l) this.f12367i;
            X3.a.e(obj);
        }
        AbstractC1662j abstractC1662j = (AbstractC1662j) obj;
        lVar.getClass();
        if (abstractC1662j instanceof C1667o) {
            C1667o c1667o = (C1667o) abstractC1662j;
            return new d(lVar.j(c1667o.a), c1667o);
        }
        if (!(abstractC1662j instanceof C1657e)) {
            throw new RuntimeException();
        }
        C1657e c1657e = (C1657e) abstractC1662j;
        Drawable drawable = c1657e.a;
        return new C1146b(drawable != null ? lVar.j(drawable) : null, c1657e);
    }
}
