package Y2;

/* renamed from: Y2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0713b extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public String f9705g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f9706h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0720i f9707i;

    /* renamed from: j, reason: collision with root package name */
    public int f9708j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0713b(C0720i c0720i, d4.c cVar) {
        super(cVar);
        this.f9707i = c0720i;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f9706h = obj;
        this.f9708j |= Integer.MIN_VALUE;
        return this.f9707i.h(null, this);
    }
}
