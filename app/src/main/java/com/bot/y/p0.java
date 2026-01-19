package y;

import java.util.List;
import u.AbstractC1734b;

/* loaded from: classes.dex */
public final class p0 {
    public final List a;

    /* renamed from: b, reason: collision with root package name */
    public final List[] f15909b;

    /* renamed from: c, reason: collision with root package name */
    public int f15910c;

    /* renamed from: d, reason: collision with root package name */
    public int f15911d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f15912e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q0 f15913f;

    public p0(q0 q0Var, List list) {
        this.f15913f = q0Var;
        this.a = list;
        this.f15909b = new List[list.size()];
        if (list.isEmpty()) {
            AbstractC1734b.a("NestedPrefetchController shouldn't be created with no states");
        }
    }
}
