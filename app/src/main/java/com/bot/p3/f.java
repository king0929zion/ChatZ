package p3;

import com.bot.BotApplication;
import f0.C0987j;
import x2.C1871g;

/* loaded from: classes.dex */
public final class f implements r3.b {

    /* renamed from: c, reason: collision with root package name */
    public volatile C1871g f13914c;

    /* renamed from: e, reason: collision with root package name */
    public final Object f13915e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public final C0987j f13916f;

    public f(C0987j c0987j) {
        this.f13916f = c0987j;
    }

    @Override // r3.b
    public final Object b() {
        if (this.f13914c == null) {
            synchronized (this.f13915e) {
                try {
                    if (this.f13914c == null) {
                        this.f13914c = new C1871g(new L1.e((BotApplication) this.f13916f.f11690e, false));
                    }
                } finally {
                }
            }
        }
        return this.f13914c;
    }
}
