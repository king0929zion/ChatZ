package D;

import java.util.concurrent.atomic.AtomicLong;
import l4.InterfaceC1193a;

/* renamed from: D.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0097v implements InterfaceC1193a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1179c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ O.z0 f1180e;

    public /* synthetic */ C0097v(O.z0 z0Var, int i6) {
        this.f1179c = i6;
        this.f1180e = z0Var;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        switch (this.f1179c) {
            case 0:
                AtomicLong atomicLong = this.f1180e.f4266d;
                long andIncrement = atomicLong.getAndIncrement();
                while (andIncrement == 0) {
                    andIncrement = atomicLong.getAndIncrement();
                }
                return Long.valueOf(andIncrement);
            default:
                AtomicLong atomicLong2 = this.f1180e.f4266d;
                long andIncrement2 = atomicLong2.getAndIncrement();
                while (andIncrement2 == 0) {
                    andIncrement2 = atomicLong2.getAndIncrement();
                }
                return Long.valueOf(andIncrement2);
        }
    }
}
