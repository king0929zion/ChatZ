package M4;

import i4.AbstractC1120d;
import j1.AbstractC1135a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m4.AbstractC1276k;
import v4.C1825a;
import v4.EnumC1827c;

/* renamed from: M4.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0273u implements KSerializer {
    public static final C0273u a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final g0 f3492b = new g0("kotlin.time.Duration", K4.e.f2958m);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        int i6 = C1825a.f15384g;
        String m3 = decoder.m();
        AbstractC1276k.f(m3, "value");
        try {
            return new C1825a(AbstractC1120d.d(m3));
        } catch (IllegalArgumentException e6) {
            throw new IllegalArgumentException(AbstractC1135a.s("Invalid ISO duration string format: '", m3, "'."), e6);
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f3492b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        long j3 = ((C1825a) obj).f15385c;
        int i6 = C1825a.f15384g;
        StringBuilder sb = new StringBuilder();
        if (j3 < 0) {
            sb.append('-');
        }
        sb.append("PT");
        long g3 = j3 < 0 ? C1825a.g(j3) : j3;
        long f6 = C1825a.f(g3, EnumC1827c.HOURS);
        boolean z5 = false;
        int f7 = C1825a.d(g3) ? 0 : (int) (C1825a.f(g3, EnumC1827c.MINUTES) % 60);
        int f8 = C1825a.d(g3) ? 0 : (int) (C1825a.f(g3, EnumC1827c.SECONDS) % 60);
        int c6 = C1825a.c(g3);
        if (C1825a.d(j3)) {
            f6 = 9999999999999L;
        }
        boolean z6 = f6 != 0;
        boolean z7 = (f8 == 0 && c6 == 0) ? false : true;
        if (f7 != 0 || (z7 && z6)) {
            z5 = true;
        }
        if (z6) {
            sb.append(f6);
            sb.append('H');
        }
        if (z5) {
            sb.append(f7);
            sb.append('M');
        }
        if (z7 || (!z6 && !z5)) {
            C1825a.b(sb, f8, c6, 9, "S", true);
        }
        encoder.o(sb.toString());
    }
}
