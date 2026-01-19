package x4;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: x4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1921e {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15690b = AtomicIntegerFieldUpdater.newUpdater(C1921e.class, "notCompletedCount$volatile");
    public final InterfaceC1891D[] a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public C1921e(InterfaceC1891D[] interfaceC1891DArr) {
        this.a = interfaceC1891DArr;
        this.notCompletedCount$volatile = interfaceC1891DArr.length;
    }
}
