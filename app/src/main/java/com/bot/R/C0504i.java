package R;

import b4.InterfaceC0905c;

/* renamed from: R.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0504i extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public Object f6787g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f6788h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0505j f6789i;

    /* renamed from: j, reason: collision with root package name */
    public int f6790j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0504i(C0505j c0505j, InterfaceC0905c interfaceC0905c) {
        super(interfaceC0905c);
        this.f6789i = c0505j;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f6788h = obj;
        this.f6790j |= Integer.MIN_VALUE;
        return this.f6789i.a(null, this);
    }
}
