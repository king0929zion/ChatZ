package O4;

import I3.I;

/* loaded from: classes.dex */
public final class g extends I {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4336c;

    public g(C0.c cVar, boolean z5) {
        super(cVar);
        this.f4336c = z5;
    }

    @Override // I3.I
    public final void f(byte b5) {
        if (this.f4336c) {
            l(String.valueOf(b5 & 255));
        } else {
            j(String.valueOf(b5 & 255));
        }
    }

    @Override // I3.I
    public final void h(int i6) {
        boolean z5 = this.f4336c;
        String unsignedString = Integer.toUnsignedString(i6);
        if (z5) {
            l(unsignedString);
        } else {
            j(unsignedString);
        }
    }

    @Override // I3.I
    public final void i(long j3) {
        boolean z5 = this.f4336c;
        String unsignedString = Long.toUnsignedString(j3);
        if (z5) {
            l(unsignedString);
        } else {
            j(unsignedString);
        }
    }

    @Override // I3.I
    public final void k(short s5) {
        if (this.f4336c) {
            l(String.valueOf(s5 & 65535));
        } else {
            j(String.valueOf(s5 & 65535));
        }
    }
}
