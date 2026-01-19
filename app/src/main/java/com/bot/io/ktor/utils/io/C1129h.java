package io.ktor.utils.io;

/* renamed from: io.ktor.utils.io.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1129h extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public t f12155g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f12156h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ t f12157i;

    /* renamed from: j, reason: collision with root package name */
    public int f12158j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1129h(t tVar, d4.c cVar) {
        super(cVar);
        this.f12157i = tVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f12156h = obj;
        this.f12158j |= Integer.MIN_VALUE;
        return this.f12157i.D(0, this);
    }
}
