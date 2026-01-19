package io.ktor.utils.io;

import b4.InterfaceC0905c;
import b4.InterfaceC0908f;
import c4.EnumC0927a;
import m4.AbstractC1276k;
import x4.A0;
import x4.AbstractC1898K;
import x4.AbstractC1939v;
import x4.C1940w;
import x4.InterfaceC1922e0;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class E extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f12092h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f12093i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ t f12094j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ d4.i f12095k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC1939v f12096l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public E(t tVar, l4.e eVar, AbstractC1939v abstractC1939v, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f12094j = tVar;
        this.f12095k = (d4.i) eVar;
        this.f12096l = abstractC1939v;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((E) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [d4.i, l4.e] */
    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        E e6 = new E(this.f12094j, this.f12095k, this.f12096l, interfaceC0905c);
        e6.f12093i = obj;
        return e6;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [d4.i, l4.e] */
    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f12092h;
        t tVar = this.f12094j;
        try {
            if (i6 == 0) {
                X3.a.e(obj);
                InterfaceC1942y interfaceC1942y = (InterfaceC1942y) this.f12093i;
                InterfaceC0908f r5 = interfaceC1942y.c().r(C1940w.f15731e);
                AbstractC1276k.c(r5);
                tVar.d((InterfaceC1922e0) r5);
                C c6 = new C(interfaceC1942y, tVar);
                ?? r52 = this.f12095k;
                this.f12092h = 1;
                Object m3 = r52.m(c6, this);
                EnumC0927a enumC0927a = EnumC0927a.f11114c;
                if (m3 == enumC0927a) {
                    return enumC0927a;
                }
            } else {
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                X3.a.e(obj);
            }
        } catch (Throwable th) {
            A0 a02 = AbstractC1898K.f15658b;
            AbstractC1939v abstractC1939v = this.f12096l;
            if (!AbstractC1276k.b(abstractC1939v, a02) && abstractC1939v != null) {
                throw th;
            }
            tVar.i(th);
        }
        return X3.y.a;
    }
}
