package r;

import D.C0091s;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import java.util.concurrent.CancellationException;
import m4.C1285t;
import n.AbstractC1318d;
import n.C1336m;
import n.C1347v;
import x4.InterfaceC1942y;

/* renamed from: r.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1519F extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public C1285t f14025h;

    /* renamed from: i, reason: collision with root package name */
    public C1336m f14026i;

    /* renamed from: j, reason: collision with root package name */
    public int f14027j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f14028k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1521G f14029l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1563e1 f14030m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1519F(float f6, C1521G c1521g, InterfaceC1563e1 interfaceC1563e1, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f14028k = f6;
        this.f14029l = c1521g;
        this.f14030m = interfaceC1563e1;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C1519F) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C1519F(this.f14028k, this.f14029l, this.f14030m, interfaceC0905c);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, m4.t] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, m4.t] */
    @Override // d4.a
    public final Object r(Object obj) {
        float f6;
        C1285t c1285t;
        C1336m c1336m;
        int i6 = this.f14027j;
        if (i6 == 0) {
            X3.a.e(obj);
            f6 = this.f14028k;
            if (Math.abs(f6) > 1.0f) {
                ?? obj2 = new Object();
                obj2.f12970c = f6;
                ?? obj3 = new Object();
                C1336m b5 = AbstractC1318d.b(S.l.f7374V, f6, 28);
                try {
                    C1521G c1521g = this.f14029l;
                    C1347v c1347v = c1521g.a;
                    C0091s c0091s = new C0091s((C1285t) obj3, this.f14030m, (C1285t) obj2, c1521g);
                    this.f14025h = obj2;
                    this.f14026i = b5;
                    this.f14027j = 1;
                    Object f7 = AbstractC1318d.f(b5, c1347v, false, c0091s, this);
                    EnumC0927a enumC0927a = EnumC0927a.f11114c;
                    if (f7 == enumC0927a) {
                        return enumC0927a;
                    }
                    c1285t = obj2;
                } catch (CancellationException unused) {
                    c1285t = obj2;
                    c1336m = b5;
                    c1285t.f12970c = ((Number) c1336m.a()).floatValue();
                    f6 = c1285t.f12970c;
                    return new Float(f6);
                }
            }
            return new Float(f6);
        }
        if (i6 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c1336m = this.f14026i;
        c1285t = this.f14025h;
        try {
            X3.a.e(obj);
        } catch (CancellationException unused2) {
            c1285t.f12970c = ((Number) c1336m.a()).floatValue();
            f6 = c1285t.f12970c;
            return new Float(f6);
        }
        f6 = c1285t.f12970c;
        return new Float(f6);
    }
}
