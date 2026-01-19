package n;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import m4.AbstractC1276k;
import x4.InterfaceC1942y;

/* renamed from: n.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1320e extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f13127h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f13128i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C1316c f13129j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ T.X f13130k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ T.X f13131l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1320e(Object obj, C1316c c1316c, T.X x5, T.X x6, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f13128i = obj;
        this.f13129j = c1316c;
        this.f13130k = x5;
        this.f13131l = x6;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C1320e) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C1320e(this.f13128i, this.f13129j, this.f13130k, this.f13131l, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        C1320e c1320e;
        int i6 = this.f13127h;
        C1316c c1316c = this.f13129j;
        if (i6 == 0) {
            X3.a.e(obj);
            if (AbstractC1276k.b(this.f13128i, c1316c.f13095e.getValue())) {
                return X3.y.a;
            }
            C1327h0 c1327h0 = AbstractC1324g.a;
            InterfaceC1334l interfaceC1334l = (InterfaceC1334l) this.f13130k.getValue();
            this.f13127h = 1;
            c1320e = this;
            Object c6 = C1316c.c(this.f13129j, this.f13128i, interfaceC1334l, null, c1320e, 12);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (c6 == enumC0927a) {
                return enumC0927a;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
            c1320e = this;
        }
        C1327h0 c1327h02 = AbstractC1324g.a;
        l4.c cVar = (l4.c) c1320e.f13131l.getValue();
        if (cVar != null) {
            cVar.f(c1316c.d());
        }
        return X3.y.a;
    }
}
