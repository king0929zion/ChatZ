package B0;

import h0.InterfaceC1039p;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class I implements InterfaceC1039p {
    public J a;

    /* renamed from: b, reason: collision with root package name */
    public M f395b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f396c;

    /* renamed from: d, reason: collision with root package name */
    public final H f397d;

    /* JADX WARN: Type inference failed for: r0v0, types: [B0.H, java.lang.Object] */
    public I() {
        ?? obj = new Object();
        obj.f394g = this;
        obj.f392e = E.f382c;
        this.f397d = obj;
    }

    public final l4.c e() {
        J j3 = this.a;
        if (j3 != null) {
            return j3;
        }
        AbstractC1276k.k("onTouchEvent");
        throw null;
    }
}
