package O4;

import kotlinx.serialization.descriptors.SerialDescriptor;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class q extends a {

    /* renamed from: f, reason: collision with root package name */
    public final kotlinx.serialization.json.a f4346f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4347g;

    /* renamed from: h, reason: collision with root package name */
    public int f4348h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(N4.c cVar, kotlinx.serialization.json.a aVar) {
        super(cVar, null);
        AbstractC1276k.f(cVar, "json");
        AbstractC1276k.f(aVar, "value");
        this.f4346f = aVar;
        this.f4347g = aVar.f12632c.size();
        this.f4348h = -1;
    }

    @Override // O4.a
    public final kotlinx.serialization.json.b E(String str) {
        AbstractC1276k.f(str, "tag");
        return (kotlinx.serialization.json.b) this.f4346f.f12632c.get(Integer.parseInt(str));
    }

    @Override // O4.a
    public final String Q(SerialDescriptor serialDescriptor, int i6) {
        AbstractC1276k.f(serialDescriptor, "descriptor");
        return String.valueOf(i6);
    }

    @Override // O4.a
    public final kotlinx.serialization.json.b S() {
        return this.f4346f;
    }

    @Override // L4.a
    public final int s(SerialDescriptor serialDescriptor) {
        AbstractC1276k.f(serialDescriptor, "descriptor");
        int i6 = this.f4348h;
        if (i6 >= this.f4347g - 1) {
            return -1;
        }
        int i7 = i6 + 1;
        this.f4348h = i7;
        return i7;
    }
}
