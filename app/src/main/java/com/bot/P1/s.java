package P1;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class s extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public Object f4624g;

    /* renamed from: h, reason: collision with root package name */
    public Serializable f4625h;

    /* renamed from: i, reason: collision with root package name */
    public int f4626i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f4627j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ u f4628k;

    /* renamed from: l, reason: collision with root package name */
    public int f4629l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(u uVar, d4.c cVar) {
        super(cVar);
        this.f4628k = uVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f4627j = obj;
        this.f4629l |= Integer.MIN_VALUE;
        return this.f4628k.g(null, null, this);
    }
}
