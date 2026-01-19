package E0;

import b0.AbstractC0874g;
import java.util.concurrent.CancellationException;
import u.AbstractC1735c;

/* loaded from: classes.dex */
public abstract class b extends CancellationException {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1290c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, int i6) {
        super(str);
        this.f1290c = i6;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.f1290c) {
            case 0:
                setStackTrace(c.a);
                return this;
            case 1:
                setStackTrace(AbstractC0874g.f10983b);
                return this;
            default:
                setStackTrace(AbstractC1735c.a);
                return this;
        }
    }
}
