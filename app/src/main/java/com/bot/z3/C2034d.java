package z3;

import com.vladsch.flexmark.util.sequence.SequenceUtils;
import m4.AbstractC1276k;

/* renamed from: z3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2034d extends Q {

    /* renamed from: e, reason: collision with root package name */
    public final String f16267e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2034d(F3.c cVar, String str) {
        super(cVar, str);
        AbstractC1276k.f(cVar, "response");
        AbstractC1276k.f(str, "cachedResponseText");
        this.f16267e = "Client request(" + cVar.b().d().getMethod().a + SequenceUtils.SPC + cVar.b().d().getUrl() + ") invalid: " + cVar.g() + ". Text: \"" + str + '\"';
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f16267e;
    }
}
