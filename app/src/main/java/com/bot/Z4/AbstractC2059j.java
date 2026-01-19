package z4;

import x4.InterfaceC1927j;

/* renamed from: z4.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2059j {
    public static final p a = new p(-1, null, null, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final int f16353b = C4.a.j(32, 12, "kotlinx.coroutines.bufferedChannel.segmentSize");

    /* renamed from: c, reason: collision with root package name */
    public static final int f16354c = C4.a.j(10000, 12, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations");

    /* renamed from: d, reason: collision with root package name */
    public static final C4.u f16355d = new C4.u("BUFFERED", 0);

    /* renamed from: e, reason: collision with root package name */
    public static final C4.u f16356e = new C4.u("SHOULD_BUFFER", 0);

    /* renamed from: f, reason: collision with root package name */
    public static final C4.u f16357f = new C4.u("S_RESUMING_BY_RCV", 0);

    /* renamed from: g, reason: collision with root package name */
    public static final C4.u f16358g = new C4.u("RESUMING_BY_EB", 0);

    /* renamed from: h, reason: collision with root package name */
    public static final C4.u f16359h = new C4.u("POISONED", 0);

    /* renamed from: i, reason: collision with root package name */
    public static final C4.u f16360i = new C4.u("DONE_RCV", 0);

    /* renamed from: j, reason: collision with root package name */
    public static final C4.u f16361j = new C4.u("INTERRUPTED_SEND", 0);

    /* renamed from: k, reason: collision with root package name */
    public static final C4.u f16362k = new C4.u("INTERRUPTED_RCV", 0);

    /* renamed from: l, reason: collision with root package name */
    public static final C4.u f16363l = new C4.u("CHANNEL_CLOSED", 0);

    /* renamed from: m, reason: collision with root package name */
    public static final C4.u f16364m = new C4.u("SUSPEND", 0);

    /* renamed from: n, reason: collision with root package name */
    public static final C4.u f16365n = new C4.u("SUSPEND_NO_WAITER", 0);

    /* renamed from: o, reason: collision with root package name */
    public static final C4.u f16366o = new C4.u("FAILED", 0);

    /* renamed from: p, reason: collision with root package name */
    public static final C4.u f16367p = new C4.u("NO_RECEIVE_RESULT", 0);

    /* renamed from: q, reason: collision with root package name */
    public static final C4.u f16368q = new C4.u("CLOSE_HANDLER_CLOSED", 0);

    /* renamed from: r, reason: collision with root package name */
    public static final C4.u f16369r = new C4.u("CLOSE_HANDLER_INVOKED", 0);

    /* renamed from: s, reason: collision with root package name */
    public static final C4.u f16370s = new C4.u("NO_CLOSE_CAUSE", 0);

    public static final boolean a(InterfaceC1927j interfaceC1927j, Object obj, l4.f fVar) {
        C4.u l3 = interfaceC1927j.l(obj, fVar);
        if (l3 == null) {
            return false;
        }
        interfaceC1927j.z(l3);
        return true;
    }
}
