package y3;

import java.io.IOException;
import java.net.ConnectException;
import m4.AbstractC1276k;

/* renamed from: y3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1993a extends ConnectException {

    /* renamed from: c, reason: collision with root package name */
    public final IOException f16016c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1993a(String str, IOException iOException) {
        super(str);
        AbstractC1276k.f(str, "message");
        this.f16016c = iOException;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f16016c;
    }
}
