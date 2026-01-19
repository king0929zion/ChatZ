package x;

import p.x0;

/* loaded from: classes.dex */
public final class q extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public x0 f15537g;

    /* renamed from: h, reason: collision with root package name */
    public d4.i f15538h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f15539i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s f15540j;

    /* renamed from: k, reason: collision with root package name */
    public int f15541k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(s sVar, d4.c cVar) {
        super(cVar);
        this.f15540j = sVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f15539i = obj;
        this.f15541k |= Integer.MIN_VALUE;
        return this.f15540j.a(null, null, this);
    }
}
