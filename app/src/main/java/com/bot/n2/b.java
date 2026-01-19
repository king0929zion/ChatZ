package N2;

import X3.l;
import c4.EnumC0927a;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class b extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public h f3807g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f3808h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h f3809i;

    /* renamed from: j, reason: collision with root package name */
    public int f3810j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(h hVar, d4.c cVar) {
        super(cVar);
        this.f3809i = hVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f3808h = obj;
        this.f3810j |= Integer.MIN_VALUE;
        Serializable b5 = this.f3809i.b(null, null, null, null, this);
        return b5 == EnumC0927a.f11114c ? b5 : new l(b5);
    }
}
