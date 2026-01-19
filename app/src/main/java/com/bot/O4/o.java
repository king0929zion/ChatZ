package O4;

import kotlinx.serialization.descriptors.SerialDescriptor;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class o extends a {

    /* renamed from: f, reason: collision with root package name */
    public final kotlinx.serialization.json.b f4341f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(N4.c cVar, kotlinx.serialization.json.b bVar, String str) {
        super(cVar, str);
        AbstractC1276k.f(cVar, "json");
        AbstractC1276k.f(bVar, "value");
        this.f4341f = bVar;
        this.a.add("primitive");
    }

    @Override // O4.a
    public final kotlinx.serialization.json.b E(String str) {
        AbstractC1276k.f(str, "tag");
        if (str == "primitive") {
            return this.f4341f;
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag");
    }

    @Override // O4.a
    public final kotlinx.serialization.json.b S() {
        return this.f4341f;
    }

    @Override // L4.a
    public final int s(SerialDescriptor serialDescriptor) {
        AbstractC1276k.f(serialDescriptor, "descriptor");
        return 0;
    }
}
