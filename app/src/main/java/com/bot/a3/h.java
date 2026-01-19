package A3;

import I3.C0241e;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class h extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public E3.d f130g;

    /* renamed from: h, reason: collision with root package name */
    public Object f131h;

    /* renamed from: i, reason: collision with root package name */
    public C0241e f132i;

    /* renamed from: j, reason: collision with root package name */
    public List f133j;

    /* renamed from: k, reason: collision with root package name */
    public Iterator f134k;

    /* renamed from: l, reason: collision with root package name */
    public b f135l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f136m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ k f137n;

    /* renamed from: o, reason: collision with root package name */
    public int f138o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, d4.c cVar) {
        super(cVar);
        this.f137n = kVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f136m = obj;
        this.f138o |= Integer.MIN_VALUE;
        return this.f137n.a(null, null, this);
    }
}
