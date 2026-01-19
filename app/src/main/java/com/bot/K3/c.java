package K3;

import A4.C0010k;
import A4.InterfaceC0007h;
import A4.InterfaceC0008i;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import io.ktor.utils.io.y;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class c implements InterfaceC0007h {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2930c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0010k f2931e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Charset f2932f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ R3.a f2933g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ y f2934h;

    public /* synthetic */ c(C0010k c0010k, Charset charset, R3.a aVar, y yVar, int i6) {
        this.f2930c = i6;
        this.f2931e = c0010k;
        this.f2932f = charset;
        this.f2933g = aVar;
        this.f2934h = yVar;
    }

    @Override // A4.InterfaceC0007h
    public final Object b(InterfaceC0008i interfaceC0008i, InterfaceC0905c interfaceC0905c) {
        switch (this.f2930c) {
            case 0:
                Object b5 = this.f2931e.b(new b(interfaceC0008i, this.f2932f, this.f2933g, this.f2934h, 0), interfaceC0905c);
                return b5 == EnumC0927a.f11114c ? b5 : X3.y.a;
            default:
                Object b6 = this.f2931e.b(new b(interfaceC0008i, this.f2932f, this.f2933g, this.f2934h, 1), interfaceC0905c);
                return b6 == EnumC0927a.f11114c ? b6 : X3.y.a;
        }
    }
}
