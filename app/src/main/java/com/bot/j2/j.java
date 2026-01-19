package j2;

import Y2.C0716e;
import b4.InterfaceC0905c;

/* loaded from: classes.dex */
public final class j extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f12372g;

    /* renamed from: h, reason: collision with root package name */
    public int f12373h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0716e f12374i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(C0716e c0716e, InterfaceC0905c interfaceC0905c) {
        super(interfaceC0905c);
        this.f12374i = c0716e;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f12372g = obj;
        this.f12373h |= Integer.MIN_VALUE;
        return this.f12374i.a(null, this);
    }
}
