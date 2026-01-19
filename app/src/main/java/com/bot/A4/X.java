package A4;

import B4.AbstractC0049b;
import B4.AbstractC0051d;
import b4.InterfaceC0905c;
import x4.C1928k;

/* loaded from: classes.dex */
public final class X extends AbstractC0051d {
    public long a;

    /* renamed from: b, reason: collision with root package name */
    public C1928k f223b;

    @Override // B4.AbstractC0051d
    public final boolean a(AbstractC0049b abstractC0049b) {
        V v5 = (V) abstractC0049b;
        if (this.a >= 0) {
            return false;
        }
        long j3 = v5.f217l;
        if (j3 < v5.f218m) {
            v5.f218m = j3;
        }
        this.a = j3;
        return true;
    }

    @Override // B4.AbstractC0051d
    public final InterfaceC0905c[] b(AbstractC0049b abstractC0049b) {
        long j3 = this.a;
        this.a = -1L;
        this.f223b = null;
        return ((V) abstractC0049b).v(j3);
    }
}
