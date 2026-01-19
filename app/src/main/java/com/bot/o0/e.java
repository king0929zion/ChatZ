package O0;

import P0.l;
import X3.y;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import n0.C1353b;

/* loaded from: classes.dex */
public final class e extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f4293h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ float f4294i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f4295j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f4295j = fVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((e) p((InterfaceC0905c) obj2, Float.valueOf(((Number) obj).floatValue()))).r(y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        e eVar = new e(this.f4295j, interfaceC0905c);
        eVar.f4294i = ((Number) obj).floatValue();
        return eVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f4293h;
        if (i6 == 0) {
            X3.a.e(obj);
            float f6 = this.f4294i;
            f fVar = this.f4295j;
            Object g3 = fVar.a.f4499d.f4492c.g(l.f4470e);
            if (g3 == null) {
                g3 = null;
            }
            l4.e eVar = (l4.e) g3;
            if (eVar == null) {
                throw B3.e.f("Required value was null.");
            }
            C1353b c1353b = new C1353b((Float.floatToRawIntBits(S.l.f7374V) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L));
            this.f4293h = 1;
            obj = eVar.m(c1353b, this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (obj == enumC0927a) {
                return enumC0927a;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
        }
        return new Float(Float.intBitsToFloat((int) (((C1353b) obj).a & 4294967295L)));
    }
}
