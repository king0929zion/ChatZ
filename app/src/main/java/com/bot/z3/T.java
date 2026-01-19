package z3;

import com.vladsch.flexmark.util.sequence.SequenceUtils;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class T extends Q {

    /* renamed from: e, reason: collision with root package name */
    public final String f16260e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(F3.c cVar, String str) {
        super(cVar, str);
        AbstractC1276k.f(cVar, "response");
        AbstractC1276k.f(str, "cachedResponseText");
        this.f16260e = "Server error(" + cVar.b().d().getMethod().a + SequenceUtils.SPC + cVar.b().d().getUrl() + ": " + cVar.g() + ". Text: \"" + str + '\"';
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f16260e;
    }
}
