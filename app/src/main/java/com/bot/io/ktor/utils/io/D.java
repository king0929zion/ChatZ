package io.ktor.utils.io;

import java.util.concurrent.CancellationException;
import o.AbstractC1378a;

/* loaded from: classes.dex */
public final class D extends CancellationException {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f12091c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D(String str, int i6) {
        super(str);
        this.f12091c = i6;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        switch (this.f12091c) {
            case 1:
                setStackTrace(AbstractC1378a.a);
                return this;
            default:
                return super.fillInStackTrace();
        }
    }
}
