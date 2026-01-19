package H2;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class a extends Exception {

    /* renamed from: c, reason: collision with root package name */
    public final int f2024c;

    /* renamed from: e, reason: collision with root package name */
    public final String f2025e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i6, String str) {
        super(str);
        AbstractC1276k.f(str, "message");
        this.f2024c = i6;
        this.f2025e = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f2025e;
    }
}
