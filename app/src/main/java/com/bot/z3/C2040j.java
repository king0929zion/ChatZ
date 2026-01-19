package z3;

import I3.AbstractC0239c;
import I3.C0241e;

/* renamed from: z3.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2040j extends J3.b {
    public final C0241e a;

    /* renamed from: b, reason: collision with root package name */
    public final long f16277b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16278c;

    public C2040j(C0241e c0241e, Object obj) {
        this.f16278c = obj;
        if (c0241e == null) {
            C0241e c0241e2 = AbstractC0239c.a;
            c0241e = AbstractC0239c.f2740b;
        }
        this.a = c0241e;
        this.f16277b = ((byte[]) obj).length;
    }

    @Override // J3.d
    public final Long a() {
        return Long.valueOf(this.f16277b);
    }

    @Override // J3.d
    public final C0241e b() {
        return this.a;
    }

    @Override // J3.b
    public final byte[] e() {
        return (byte[]) this.f16278c;
    }
}
