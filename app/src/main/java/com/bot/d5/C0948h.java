package d5;

import java.io.Closeable;
import l2.C1187b;

/* renamed from: d5.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0948h implements Closeable {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11479c = 0;

    /* renamed from: e, reason: collision with root package name */
    public Closeable f11480e;

    public C0948h(C1187b c1187b) {
        this.f11480e = c1187b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f11479c) {
            case 0:
                if (((C0949i) this.f11480e) == null) {
                    throw new IllegalStateException("not attached to a buffer");
                }
                this.f11480e = null;
                return;
            default:
                ((C1187b) this.f11480e).close();
                return;
        }
    }

    public C0948h() {
    }
}
