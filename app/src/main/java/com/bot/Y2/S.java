package Y2;

import com.bot.core.database.entity.LLMSettingEntity;

/* loaded from: classes.dex */
public final class S extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public LLMSettingEntity f9673g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f9674h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ W f9675i;

    /* renamed from: j, reason: collision with root package name */
    public int f9676j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(W w5, d4.c cVar) {
        super(cVar);
        this.f9675i = w5;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f9674h = obj;
        this.f9676j |= Integer.MIN_VALUE;
        return this.f9675i.g(null, this);
    }
}
