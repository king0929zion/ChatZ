package H4;

import C4.s;
import b4.InterfaceC0910h;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes.dex */
public final class k extends s {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f2067h;

    public k(long j3, k kVar, int i6) {
        super(j3, kVar, i6);
        this.f2067h = new AtomicReferenceArray(j.f2066f);
    }

    @Override // C4.s
    public final int g() {
        return j.f2066f;
    }

    @Override // C4.s
    public final void h(int i6, InterfaceC0910h interfaceC0910h) {
        this.f2067h.set(i6, j.f2065e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f715f + ", hashCode=" + hashCode() + ']';
    }
}
