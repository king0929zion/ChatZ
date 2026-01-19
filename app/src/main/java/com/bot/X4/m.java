package X4;

import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public final class m extends T4.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f9457e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f9458f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9459g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, o oVar, int i6, List list) {
        super(str, true);
        this.f9458f = oVar;
        this.f9459g = i6;
    }

    @Override // T4.a
    public final long a() {
        switch (this.f9457e) {
            case 0:
                this.f9458f.f9476n.getClass();
                try {
                    this.f9458f.f9488z.q(this.f9459g, 9);
                    synchronized (this.f9458f) {
                        this.f9458f.f9465B.remove(Integer.valueOf(this.f9459g));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            default:
                this.f9458f.f9476n.getClass();
                try {
                    this.f9458f.f9488z.q(this.f9459g, 9);
                    synchronized (this.f9458f) {
                        this.f9458f.f9465B.remove(Integer.valueOf(this.f9459g));
                    }
                    return -1L;
                } catch (IOException unused2) {
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, o oVar, int i6, List list, boolean z5) {
        super(str, true);
        this.f9458f = oVar;
        this.f9459g = i6;
    }
}
