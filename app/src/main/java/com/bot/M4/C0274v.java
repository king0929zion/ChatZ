package M4;

import kotlinx.serialization.descriptors.SerialDescriptor;
import m4.AbstractC1276k;

/* renamed from: M4.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0274v {

    /* renamed from: e, reason: collision with root package name */
    public static final long[] f3494e = new long[0];
    public final SerialDescriptor a;

    /* renamed from: b, reason: collision with root package name */
    public final O4.j f3495b;

    /* renamed from: c, reason: collision with root package name */
    public long f3496c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f3497d;

    public C0274v(SerialDescriptor serialDescriptor, O4.j jVar) {
        AbstractC1276k.f(serialDescriptor, "descriptor");
        this.a = serialDescriptor;
        this.f3495b = jVar;
        int f6 = serialDescriptor.f();
        if (f6 <= 64) {
            this.f3496c = f6 != 64 ? (-1) << f6 : 0L;
            this.f3497d = f3494e;
            return;
        }
        this.f3496c = 0L;
        int i6 = (f6 - 1) >>> 6;
        long[] jArr = new long[i6];
        if ((f6 & 63) != 0) {
            jArr[i6 - 1] = (-1) << f6;
        }
        this.f3497d = jArr;
    }
}
