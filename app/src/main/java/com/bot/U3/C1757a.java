package u3;

import m4.AbstractC1276k;

/* renamed from: u3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1757a extends IllegalStateException {

    /* renamed from: c, reason: collision with root package name */
    public final String f15153c;

    public C1757a(C1759c c1759c) {
        AbstractC1276k.f(c1759c, "call");
        this.f15153c = "Response already received: " + c1759c;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f15153c;
    }
}
