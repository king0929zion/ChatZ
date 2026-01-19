package O4;

import Y3.B;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class r extends p {

    /* renamed from: j, reason: collision with root package name */
    public final kotlinx.serialization.json.c f4349j;

    /* renamed from: k, reason: collision with root package name */
    public final List f4350k;

    /* renamed from: l, reason: collision with root package name */
    public final int f4351l;

    /* renamed from: m, reason: collision with root package name */
    public int f4352m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(N4.c cVar, kotlinx.serialization.json.c cVar2) {
        super(cVar, cVar2, (String) null, 12);
        AbstractC1276k.f(cVar, "json");
        AbstractC1276k.f(cVar2, "value");
        this.f4349j = cVar2;
        List J0 = Y3.m.J0(cVar2.f12633c.keySet());
        this.f4350k = J0;
        this.f4351l = J0.size() * 2;
        this.f4352m = -1;
    }

    @Override // O4.p, O4.a
    public final kotlinx.serialization.json.b E(String str) {
        AbstractC1276k.f(str, "tag");
        return this.f4352m % 2 == 0 ? N4.j.a(str) : (kotlinx.serialization.json.b) B.Y(str, this.f4349j);
    }

    @Override // O4.p, O4.a
    public final String Q(SerialDescriptor serialDescriptor, int i6) {
        AbstractC1276k.f(serialDescriptor, "descriptor");
        return (String) this.f4350k.get(i6 / 2);
    }

    @Override // O4.p, O4.a
    public final kotlinx.serialization.json.b S() {
        return this.f4349j;
    }

    @Override // O4.p
    /* renamed from: X */
    public final kotlinx.serialization.json.c S() {
        return this.f4349j;
    }

    @Override // O4.p, O4.a, L4.a
    public final void h(SerialDescriptor serialDescriptor) {
        AbstractC1276k.f(serialDescriptor, "descriptor");
    }

    @Override // O4.p, L4.a
    public final int s(SerialDescriptor serialDescriptor) {
        AbstractC1276k.f(serialDescriptor, "descriptor");
        int i6 = this.f4352m;
        if (i6 >= this.f4351l - 1) {
            return -1;
        }
        int i7 = i6 + 1;
        this.f4352m = i7;
        return i7;
    }
}
