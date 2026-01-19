package n;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import java.util.concurrent.CancellationException;
import m4.C1283r;

/* renamed from: n.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1312a extends d4.i implements l4.c {

    /* renamed from: h, reason: collision with root package name */
    public C1336m f13069h;

    /* renamed from: i, reason: collision with root package name */
    public C1283r f13070i;

    /* renamed from: j, reason: collision with root package name */
    public int f13071j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C1316c f13072k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f13073l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ o0 f13074m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f13075n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l4.c f13076o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1312a(C1316c c1316c, Object obj, o0 o0Var, long j3, l4.c cVar, InterfaceC0905c interfaceC0905c) {
        super(1, interfaceC0905c);
        this.f13072k = c1316c;
        this.f13073l = obj;
        this.f13074m = o0Var;
        this.f13075n = j3;
        this.f13076o = cVar;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        long j3 = this.f13075n;
        l4.c cVar = this.f13076o;
        return new C1312a(this.f13072k, this.f13073l, this.f13074m, j3, cVar, (InterfaceC0905c) obj).r(X3.y.a);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [m4.r, java.lang.Object] */
    @Override // d4.a
    public final Object r(Object obj) {
        C1316c c1316c;
        C1336m c1336m;
        C1283r c1283r;
        o0 o0Var = this.f13074m;
        int i6 = this.f13071j;
        C1316c c1316c2 = this.f13072k;
        if (i6 == 0) {
            X3.a.e(obj);
            try {
                c1316c2.f13093c.f13187f = (AbstractC1343r) c1316c2.a.a.f(this.f13073l);
                c1316c2.f13095e.setValue(o0Var.f13204c);
                c1316c2.f13094d.setValue(Boolean.TRUE);
                C1336m c1336m2 = c1316c2.f13093c;
                C1336m c1336m3 = new C1336m(c1336m2.f13185c, c1336m2.f13186e.getValue(), AbstractC1318d.k(c1336m2.f13187f), c1336m2.f13188g, Long.MIN_VALUE, c1336m2.f13190i);
                Object obj2 = new Object();
                long j3 = this.f13075n;
                D.P p5 = new D.P(c1316c2, c1336m3, this.f13076o, obj2, 6);
                c1316c = c1316c2;
                try {
                    this.f13069h = c1336m3;
                    this.f13070i = obj2;
                    this.f13071j = 1;
                    Object d6 = AbstractC1318d.d(c1336m3, o0Var, j3, p5, this);
                    EnumC0927a enumC0927a = EnumC0927a.f11114c;
                    if (d6 == enumC0927a) {
                        return enumC0927a;
                    }
                    c1336m = c1336m3;
                    c1283r = obj2;
                } catch (CancellationException e6) {
                    e = e6;
                    C1316c.b(c1316c);
                    throw e;
                }
            } catch (CancellationException e7) {
                e = e7;
                c1316c = c1316c2;
                C1316c.b(c1316c);
                throw e;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1283r = this.f13070i;
            c1336m = this.f13069h;
            try {
                X3.a.e(obj);
                c1316c = c1316c2;
            } catch (CancellationException e8) {
                e = e8;
                c1316c = c1316c2;
                C1316c.b(c1316c);
                throw e;
            }
        }
        EnumC1328i enumC1328i = c1283r.f12968c ? EnumC1328i.f13161c : EnumC1328i.f13162e;
        C1316c.b(c1316c);
        return new C1330j(c1336m, enumC1328i);
    }
}
