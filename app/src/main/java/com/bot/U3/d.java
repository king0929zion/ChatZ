package U3;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class d extends h {

    /* renamed from: k, reason: collision with root package name */
    public static final d f8675k = new d(V3.b.f8804l, 0, V3.b.f8803k);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(V3.b bVar, long j3, W3.e eVar) {
        super(bVar, j3, eVar);
        AbstractC1276k.f(bVar, "head");
        AbstractC1276k.f(eVar, "pool");
        if (this.f8685j) {
            return;
        }
        this.f8685j = true;
    }

    public final d E() {
        V3.b j3 = j();
        V3.b g3 = j3.g();
        V3.b h3 = j3.h();
        if (h3 != null) {
            V3.b bVar = g3;
            while (true) {
                V3.b g6 = h3.g();
                bVar.l(g6);
                h3 = h3.h();
                if (h3 == null) {
                    break;
                }
                bVar = g6;
            }
        }
        return new d(g3, p(), this.f8679c);
    }

    public final String toString() {
        return "ByteReadPacket[" + hashCode() + ']';
    }
}
