package P1;

import A4.C0024z;
import A4.InterfaceC0008i;
import b4.InterfaceC0905c;

/* loaded from: classes.dex */
public final class i extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f4582g;

    /* renamed from: h, reason: collision with root package name */
    public int f4583h;

    /* renamed from: i, reason: collision with root package name */
    public InterfaceC0008i f4584i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0024z f4585j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(C0024z c0024z, InterfaceC0905c interfaceC0905c) {
        super(interfaceC0905c);
        this.f4585j = c0024z;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f4582g = obj;
        this.f4583h |= Integer.MIN_VALUE;
        return this.f4585j.a(null, this);
    }
}
