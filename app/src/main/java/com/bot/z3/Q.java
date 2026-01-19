package z3;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public class Q extends IllegalStateException {

    /* renamed from: c, reason: collision with root package name */
    public final transient F3.c f16259c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(F3.c cVar, String str) {
        super("Bad response: " + cVar + ". Text: \"" + str + '\"');
        AbstractC1276k.f(cVar, "response");
        AbstractC1276k.f(str, "cachedResponseText");
        this.f16259c = cVar;
    }
}
