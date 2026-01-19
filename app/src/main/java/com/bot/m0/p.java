package m0;

import m4.AbstractC1277l;
import m4.C1288w;

/* loaded from: classes.dex */
public final class p extends AbstractC1277l implements l4.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1288w f12897e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f12898f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(C1288w c1288w, int i6) {
        super(1);
        this.f12897e = c1288w;
        this.f12898f = i6;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        Boolean valueOf = Boolean.valueOf(((C) obj).T0(this.f12898f));
        this.f12897e.f12973c = valueOf;
        return valueOf;
    }
}
