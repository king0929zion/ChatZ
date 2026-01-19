package I2;

import A4.C0005f;
import b4.InterfaceC0905c;

/* loaded from: classes.dex */
public final class t extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f2679g;

    /* renamed from: h, reason: collision with root package name */
    public int f2680h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0005f f2681i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(C0005f c0005f, InterfaceC0905c interfaceC0905c) {
        super(interfaceC0905c);
        this.f2681i = c0005f;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f2679g = obj;
        this.f2680h |= Integer.MIN_VALUE;
        return this.f2681i.a(null, this);
    }
}
