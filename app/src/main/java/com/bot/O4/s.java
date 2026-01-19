package O4;

import b4.InterfaceC0905c;
import c4.EnumC0927a;

/* loaded from: classes.dex */
public final class s extends d4.h implements l4.f {

    /* renamed from: f, reason: collision with root package name */
    public int f4353f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ X3.b f4354g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ u f4355h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(u uVar, InterfaceC0905c interfaceC0905c) {
        super(3, interfaceC0905c);
        this.f4355h = uVar;
    }

    @Override // l4.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        s sVar = new s(this.f4355h, (InterfaceC0905c) obj3);
        sVar.f4354g = (X3.b) obj;
        return sVar.r(X3.y.a);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        u uVar = this.f4355h;
        L1.l lVar = uVar.a;
        int i6 = this.f4353f;
        if (i6 == 0) {
            X3.a.e(obj);
            X3.b bVar = this.f4354g;
            byte z5 = lVar.z();
            if (z5 == 1) {
                return uVar.d(true);
            }
            if (z5 == 0) {
                return uVar.d(false);
            }
            if (z5 != 6) {
                if (z5 == 8) {
                    return uVar.c();
                }
                L1.l.p(lVar, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.f4353f = 1;
            obj = u.a(uVar, bVar, this);
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
        return (kotlinx.serialization.json.b) obj;
    }
}
