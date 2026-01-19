package io.ktor.utils.io;

/* loaded from: classes.dex */
public final class j extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public StringBuilder f12189g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f12190h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ t f12191i;

    /* renamed from: j, reason: collision with root package name */
    public int f12192j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(t tVar, d4.c cVar) {
        super(cVar);
        this.f12191i = tVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f12190h = obj;
        this.f12192j |= Integer.MIN_VALUE;
        return t.F(this.f12191i, 0, this);
    }
}
