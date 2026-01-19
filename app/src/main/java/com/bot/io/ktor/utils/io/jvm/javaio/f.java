package io.ktor.utils.io.jvm.javaio;

/* loaded from: classes.dex */
public final class f extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public g f12203g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f12204h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g f12205i;

    /* renamed from: j, reason: collision with root package name */
    public int f12206j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, d4.c cVar) {
        super(cVar);
        this.f12205i = gVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f12204h = obj;
        this.f12206j |= Integer.MIN_VALUE;
        return this.f12205i.a(this);
    }
}
