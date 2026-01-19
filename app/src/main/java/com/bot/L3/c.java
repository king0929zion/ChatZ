package L3;

import io.ktor.utils.io.y;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class c extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public i f3101g;

    /* renamed from: h, reason: collision with root package name */
    public Charset f3102h;

    /* renamed from: i, reason: collision with root package name */
    public Object f3103i;

    /* renamed from: j, reason: collision with root package name */
    public y f3104j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f3105k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f3106l;

    /* renamed from: m, reason: collision with root package name */
    public int f3107m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(i iVar, d4.c cVar) {
        super(cVar);
        this.f3106l = iVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f3105k = obj;
        this.f3107m |= Integer.MIN_VALUE;
        return this.f3106l.a(null, null, null, this);
    }
}
