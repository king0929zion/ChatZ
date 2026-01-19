package z3;

import I3.AbstractC0240d;
import I3.C0241e;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import java.io.InputStream;
import java.util.List;
import m4.AbstractC1276k;
import m4.AbstractC1289x;
import org.jsoup.helper.HttpConnection;
import v3.C1824a;

/* renamed from: z3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2031a extends d4.i implements l4.f {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16261h;

    /* renamed from: i, reason: collision with root package name */
    public int f16262i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Q3.f f16263j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f16264k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2031a(int i6, int i7, InterfaceC0905c interfaceC0905c) {
        super(i6, interfaceC0905c);
        this.f16261h = i7;
    }

    @Override // l4.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        Q3.f fVar = (Q3.f) obj;
        InterfaceC0905c interfaceC0905c = (InterfaceC0905c) obj3;
        switch (this.f16261h) {
            case 0:
                C2031a c2031a = new C2031a(3, 0, interfaceC0905c);
                c2031a.f16263j = fVar;
                c2031a.f16264k = obj2;
                return c2031a.r(X3.y.a);
            default:
                C2031a c2031a2 = new C2031a(3, 1, interfaceC0905c);
                c2031a2.f16263j = fVar;
                c2031a2.f16264k = obj2;
                return c2031a2.r(X3.y.a);
        }
    }

    @Override // d4.a
    public final Object r(Object obj) {
        J3.d c2041k;
        int i6 = this.f16261h;
        X3.y yVar = X3.y.a;
        EnumC0927a enumC0927a = EnumC0927a.f11114c;
        switch (i6) {
            case 0:
                int i7 = this.f16262i;
                if (i7 != 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    X3.a.e(obj);
                    return yVar;
                }
                X3.a.e(obj);
                Q3.f fVar = this.f16263j;
                Object obj2 = this.f16264k;
                l4.f fVar2 = (l4.f) ((E3.d) fVar.f6466c).f1309f.e(AbstractC2033c.a);
                if (fVar2 == null) {
                    return yVar;
                }
                AbstractC1276k.d(obj2, "null cannot be cast to non-null type io.ktor.http.content.OutgoingContent");
                C1824a c1824a = new C1824a((J3.d) obj2, ((E3.d) fVar.f6466c).f1308e, fVar2);
                this.f16263j = null;
                this.f16262i = 1;
                return fVar.e(this, c1824a) == enumC0927a ? enumC0927a : yVar;
            default:
                int i8 = this.f16262i;
                if (i8 != 0) {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    X3.a.e(obj);
                    return yVar;
                }
                X3.a.e(obj);
                Q3.f fVar3 = this.f16263j;
                Object obj3 = this.f16264k;
                Object obj4 = fVar3.f6466c;
                I3.n nVar = ((E3.d) obj4).f1306c;
                List list = I3.r.a;
                if (nVar.j("Accept") == null) {
                    ((E3.d) obj4).f1306c.e("Accept", "*/*");
                }
                C0241e M5 = h5.e.M((I3.t) obj4);
                if (obj3 instanceof String) {
                    String str = (String) obj3;
                    if (M5 == null) {
                        M5 = AbstractC0240d.a;
                    }
                    c2041k = new J3.e(str, M5);
                } else if (obj3 instanceof byte[]) {
                    c2041k = new C2040j(M5, obj3);
                } else if (obj3 instanceof io.ktor.utils.io.y) {
                    c2041k = new C2041k(fVar3, M5, obj3);
                } else if (obj3 instanceof J3.d) {
                    c2041k = (J3.d) obj3;
                } else {
                    E3.d dVar = (E3.d) obj4;
                    AbstractC1276k.f(dVar, "context");
                    AbstractC1276k.f(obj3, "body");
                    c2041k = obj3 instanceof InputStream ? new C2041k(dVar, M5, obj3) : null;
                }
                if ((c2041k != null ? c2041k.b() : null) == null) {
                    return yVar;
                }
                E3.d dVar2 = (E3.d) obj4;
                dVar2.f1306c.n(HttpConnection.CONTENT_TYPE);
                AbstractC2043m.a.c("Transformed with default transformers request body for " + dVar2.a + " from " + AbstractC1289x.a(obj3.getClass()));
                this.f16263j = null;
                this.f16262i = 1;
                return fVar3.e(this, c2041k) == enumC0927a ? enumC0927a : yVar;
        }
    }
}
