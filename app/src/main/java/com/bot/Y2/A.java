package Y2;

import com.bot.core.model.LLMProvider;
import java.util.List;

/* loaded from: classes.dex */
public final class A extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public LLMProvider f9578g;

    /* renamed from: h, reason: collision with root package name */
    public List f9579h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f9580i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ L f9581j;

    /* renamed from: k, reason: collision with root package name */
    public int f9582k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(L l3, d4.c cVar) {
        super(cVar);
        this.f9581j = l3;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f9580i = obj;
        this.f9582k |= Integer.MIN_VALUE;
        return L.f(this.f9581j, null, null, this);
    }
}
