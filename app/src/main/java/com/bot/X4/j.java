package X4;

import j1.AbstractC1135a;
import java.io.IOException;

/* loaded from: classes.dex */
public final class j extends T4.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f9446e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f9447f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9448g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f9449h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(String str, o oVar, int i6, int i7, int i8) {
        super(str, true);
        this.f9446e = i8;
        this.f9447f = oVar;
        this.f9448g = i6;
        this.f9449h = i7;
    }

    @Override // T4.a
    public final long a() {
        switch (this.f9446e) {
            case 0:
                o oVar = this.f9447f;
                try {
                    oVar.f9488z.p(this.f9448g, this.f9449h, true);
                    return -1L;
                } catch (IOException e6) {
                    oVar.c(2, 2, e6);
                    return -1L;
                }
            case 1:
                z zVar = this.f9447f.f9476n;
                int i6 = this.f9449h;
                zVar.getClass();
                AbstractC1135a.o(i6, "errorCode");
                synchronized (this.f9447f) {
                    this.f9447f.f9465B.remove(Integer.valueOf(this.f9448g));
                }
                return -1L;
            default:
                o oVar2 = this.f9447f;
                try {
                    int i7 = this.f9448g;
                    int i8 = this.f9449h;
                    AbstractC1135a.o(i8, "statusCode");
                    oVar2.f9488z.q(i7, i8);
                    return -1L;
                } catch (IOException e7) {
                    oVar2.c(2, 2, e7);
                    return -1L;
                }
        }
    }
}
