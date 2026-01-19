package B3;

import X3.y;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import java.nio.charset.Charset;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class l extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public Charset f528h;

    /* renamed from: i, reason: collision with root package name */
    public int f529i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ io.ktor.utils.io.t f530j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Charset f531k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ StringBuilder f532l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(io.ktor.utils.io.t tVar, Charset charset, StringBuilder sb, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f530j = tVar;
        this.f531k = charset;
        this.f532l = sb;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((l) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new l(this.f530j, this.f531k, this.f532l, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        String str;
        Charset charset;
        int i6 = this.f529i;
        try {
            if (i6 == 0) {
                X3.a.e(obj);
                io.ktor.utils.io.t tVar = this.f530j;
                charset = this.f531k;
                this.f528h = charset;
                this.f529i = 1;
                obj = tVar.A(Long.MAX_VALUE, this);
                EnumC0927a enumC0927a = EnumC0927a.f11114c;
                if (obj == enumC0927a) {
                    return enumC0927a;
                }
            } else {
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                charset = this.f528h;
                X3.a.e(obj);
            }
            str = Y4.d.S((U3.h) obj, charset);
        } catch (Throwable unused) {
            str = null;
        }
        if (str == null) {
            str = "[request body omitted]";
        }
        StringBuilder sb = this.f532l;
        sb.append("BODY START");
        sb.append('\n');
        sb.append(str);
        sb.append('\n');
        sb.append("BODY END");
        return y.a;
    }
}
