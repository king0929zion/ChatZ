package y3;

import java.io.IOException;
import java.net.SocketTimeoutException;
import m4.AbstractC1276k;

/* renamed from: y3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1994b extends SocketTimeoutException {

    /* renamed from: c, reason: collision with root package name */
    public final IOException f16017c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1994b(String str, IOException iOException) {
        super(str);
        AbstractC1276k.f(str, "message");
        this.f16017c = iOException;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f16017c;
    }
}
