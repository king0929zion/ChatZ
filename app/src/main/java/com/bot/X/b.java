package X;

import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f9048c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Collection f9049e;

    public /* synthetic */ b(int i6, Collection collection) {
        this.f9048c = i6;
        this.f9049e = collection;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        boolean contains;
        switch (this.f9048c) {
            case 0:
                contains = this.f9049e.contains(obj);
                break;
            case 1:
                contains = this.f9049e.contains(obj);
                break;
            default:
                contains = ((List) obj).retainAll(this.f9049e);
                break;
        }
        return Boolean.valueOf(contains);
    }
}
