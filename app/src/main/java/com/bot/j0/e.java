package j0;

import j1.AbstractC1135a;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class e {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final long f12338b;

    /* renamed from: c, reason: collision with root package name */
    public final f f12339c;

    /* renamed from: d, reason: collision with root package name */
    public final A3.c f12340d;

    public e(int i6, long j3, f fVar, A3.c cVar) {
        this.a = i6;
        this.f12338b = j3;
        this.f12339c = fVar;
        this.f12340d = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a == eVar.a && this.f12338b == eVar.f12338b && this.f12339c == eVar.f12339c && AbstractC1276k.b(this.f12340d, eVar.f12340d);
    }

    public final int hashCode() {
        int hashCode = (this.f12339c.hashCode() + AbstractC1135a.c(Integer.hashCode(this.a) * 31, 31, this.f12338b)) * 31;
        A3.c cVar = this.f12340d;
        return hashCode + (cVar == null ? 0 : cVar.hashCode());
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.a + ", timestamp=" + this.f12338b + ", type=" + this.f12339c + ", structureCompat=" + this.f12340d + ')';
    }
}
