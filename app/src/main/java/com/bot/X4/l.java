package X4;

import d5.C0949i;
import java.io.IOException;

/* loaded from: classes.dex */
public final class l extends T4.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f9453e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f9454f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0949i f9455g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f9456h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, o oVar, int i6, C0949i c0949i, int i7, boolean z5) {
        super(str, true);
        this.f9453e = oVar;
        this.f9454f = i6;
        this.f9455g = c0949i;
        this.f9456h = i7;
    }

    @Override // T4.a
    public final long a() {
        try {
            z zVar = this.f9453e.f9476n;
            C0949i c0949i = this.f9455g;
            int i6 = this.f9456h;
            zVar.getClass();
            c0949i.skip(i6);
            this.f9453e.f9488z.q(this.f9454f, 9);
            synchronized (this.f9453e) {
                this.f9453e.f9465B.remove(Integer.valueOf(this.f9454f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
