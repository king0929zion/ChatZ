package L3;

import A4.C0010k;
import A4.InterfaceC0007h;
import A4.InterfaceC0008i;
import B4.m;
import I3.C0241e;
import X3.y;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class f implements InterfaceC0007h {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0010k f3114c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0241e f3115e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Charset f3116f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ R3.a f3117g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f3118h;

    public f(C0010k c0010k, C0241e c0241e, Charset charset, R3.a aVar, Object obj) {
        this.f3114c = c0010k;
        this.f3115e = c0241e;
        this.f3116f = charset;
        this.f3117g = aVar;
        this.f3118h = obj;
    }

    @Override // A4.InterfaceC0007h
    public final Object b(InterfaceC0008i interfaceC0008i, InterfaceC0905c interfaceC0905c) {
        Object b5 = this.f3114c.b(new m(interfaceC0008i, this.f3115e, this.f3116f, this.f3117g, this.f3118h), interfaceC0905c);
        return b5 == EnumC0927a.f11114c ? b5 : y.a;
    }
}
