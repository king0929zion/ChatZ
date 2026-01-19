package X4;

import java.io.IOException;

/* loaded from: classes.dex */
public final class n extends T4.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f9460e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f9461f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f9462g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, o oVar, int i6, long j3) {
        super(str, true);
        this.f9460e = oVar;
        this.f9461f = i6;
        this.f9462g = j3;
    }

    @Override // T4.a
    public final long a() {
        o oVar = this.f9460e;
        try {
            oVar.f9488z.r(this.f9462g, this.f9461f);
            return -1L;
        } catch (IOException e6) {
            oVar.c(2, 2, e6);
            return -1L;
        }
    }
}
