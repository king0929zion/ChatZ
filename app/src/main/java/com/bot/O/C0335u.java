package O;

import android.view.textclassifier.TextClassifier;
import b4.InterfaceC0905c;
import c4.EnumC0927a;

/* renamed from: O.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0335u extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f4221h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f4222i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0341z f4223j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ CharSequence f4224k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f4225l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0335u(long j3, C0341z c0341z, InterfaceC0905c interfaceC0905c, CharSequence charSequence) {
        super(2, interfaceC0905c);
        this.f4223j = c0341z;
        this.f4224k = charSequence;
        this.f4225l = j3;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0335u) p((InterfaceC0905c) obj2, (TextClassifier) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        C0335u c0335u = new C0335u(this.f4225l, this.f4223j, interfaceC0905c, this.f4224k);
        c0335u.f4222i = obj;
        return c0335u;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f4221h;
        if (i6 == 0) {
            X3.a.e(obj);
            TextClassifier textClassifier = (TextClassifier) this.f4222i;
            this.f4221h = 1;
            Object a = C0341z.a(this.f4223j, this.f4224k, this.f4225l, textClassifier, this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (a == enumC0927a) {
                return enumC0927a;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
        }
        return X3.y.a;
    }
}
