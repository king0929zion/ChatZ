package x4;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: x4.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1936s {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15726b = AtomicIntegerFieldUpdater.newUpdater(C1936s.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;
    public final Throwable a;

    public C1936s(Throwable th, boolean z5) {
        this.a = th;
        this._handled$volatile = z5 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.a + ']';
    }
}
