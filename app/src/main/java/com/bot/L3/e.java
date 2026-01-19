package L3;

import A4.InterfaceC0008i;
import B4.m;
import b4.InterfaceC0905c;

/* loaded from: classes.dex */
public final class e extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f3110g;

    /* renamed from: h, reason: collision with root package name */
    public int f3111h;

    /* renamed from: i, reason: collision with root package name */
    public InterfaceC0008i f3112i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m f3113j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(m mVar, InterfaceC0905c interfaceC0905c) {
        super(interfaceC0905c);
        this.f3113j = mVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f3110g = obj;
        this.f3111h |= Integer.MIN_VALUE;
        return this.f3113j.a(null, this);
    }
}
