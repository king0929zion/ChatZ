package A4;

import B4.AbstractC0050c;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import m4.C1288w;
import z4.C2062m;
import z4.C2063n;
import z4.C2064o;

/* renamed from: A4.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0014o extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public C1288w f284h;

    /* renamed from: i, reason: collision with root package name */
    public int f285i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f286j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C1288w f287k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0008i f288l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0014o(C1288w c1288w, InterfaceC0008i interfaceC0008i, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f287k = c1288w;
        this.f288l = interfaceC0008i;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0014o) p((InterfaceC0905c) obj2, new C2064o(((C2064o) obj).a))).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        C0014o c0014o = new C0014o(this.f287k, this.f288l, interfaceC0905c);
        c0014o.f286j = obj;
        return c0014o;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        C1288w c1288w;
        C1288w c1288w2;
        int i6 = this.f285i;
        if (i6 == 0) {
            X3.a.e(obj);
            Object obj2 = ((C2064o) this.f286j).a;
            boolean z5 = obj2 instanceof C2063n;
            c1288w = this.f287k;
            if (!z5) {
                c1288w.f12973c = obj2;
            }
            if (z5) {
                C2062m c2062m = obj2 instanceof C2062m ? (C2062m) obj2 : null;
                Throwable th = c2062m != null ? c2062m.a : null;
                if (th != null) {
                    throw th;
                }
                Object obj3 = c1288w.f12973c;
                if (obj3 != null) {
                    Object obj4 = obj3 != AbstractC0050c.f579b ? obj3 : null;
                    this.f286j = obj2;
                    this.f284h = c1288w;
                    this.f285i = 1;
                    Object a = this.f288l.a(obj4, this);
                    EnumC0927a enumC0927a = EnumC0927a.f11114c;
                    if (a == enumC0927a) {
                        return enumC0927a;
                    }
                    c1288w2 = c1288w;
                }
                c1288w.f12973c = AbstractC0050c.f581d;
            }
            return X3.y.a;
        }
        if (i6 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c1288w2 = this.f284h;
        X3.a.e(obj);
        c1288w = c1288w2;
        c1288w.f12973c = AbstractC0050c.f581d;
        return X3.y.a;
    }
}
