package O;

import android.view.textclassifier.TextClassifier;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.InterfaceC1942y;

/* renamed from: O.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0337v extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f4229h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ TextClassifier f4230i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d4.i f4231j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0337v(TextClassifier textClassifier, l4.e eVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f4230i = textClassifier;
        this.f4231j = (d4.i) eVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0337v) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [d4.i, l4.e] */
    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C0337v(this.f4230i, this.f4231j, interfaceC0905c);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [d4.i, l4.e] */
    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f4229h;
        if (i6 != 0) {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
            return obj;
        }
        X3.a.e(obj);
        TextClassifier textClassifier = this.f4230i;
        if (textClassifier == null) {
            return null;
        }
        this.f4229h = 1;
        Object m3 = this.f4231j.m(textClassifier, this);
        EnumC0927a enumC0927a = EnumC0927a.f11114c;
        return m3 == enumC0927a ? enumC0927a : m3;
    }
}
