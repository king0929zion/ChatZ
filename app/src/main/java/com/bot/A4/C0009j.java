package A4;

import b4.InterfaceC0905c;
import java.util.Iterator;

/* renamed from: A4.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0009j extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f265g;

    /* renamed from: h, reason: collision with root package name */
    public int f266h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0010k f267i;

    /* renamed from: j, reason: collision with root package name */
    public InterfaceC0008i f268j;

    /* renamed from: k, reason: collision with root package name */
    public Iterator f269k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0009j(C0010k c0010k, InterfaceC0905c interfaceC0905c) {
        super(interfaceC0905c);
        this.f267i = c0010k;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f265g = obj;
        this.f266h |= Integer.MIN_VALUE;
        return this.f267i.b(null, this);
    }
}
