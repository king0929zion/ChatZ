package F0;

import java.util.Map;

/* renamed from: F0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0133v implements X, r {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f1535c;

    /* renamed from: e, reason: collision with root package name */
    public final e1.m f1536e;

    public C0133v(r rVar, e1.m mVar) {
        this.f1535c = rVar;
        this.f1536e = mVar;
    }

    @Override // e1.InterfaceC0961c
    public final float A(long j3) {
        return this.f1535c.A(j3);
    }

    @Override // F0.X
    public final W E(int i6, int i7, Map map, l4.c cVar, l4.c cVar2) {
        if (i6 < 0) {
            i6 = 0;
        }
        if (i7 < 0) {
            i7 = 0;
        }
        if ((i6 & (-16777216)) != 0 || ((-16777216) & i7) != 0) {
            E0.a.b("Size(" + i6 + " x " + i7 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new C0132u(i6, i7, map, cVar);
    }

    @Override // e1.InterfaceC0961c
    public final long O(float f6) {
        return this.f1535c.O(f6);
    }

    @Override // e1.InterfaceC0961c
    public final float T(int i6) {
        return this.f1535c.T(i6);
    }

    @Override // e1.InterfaceC0961c
    public final float V(float f6) {
        return this.f1535c.V(f6);
    }

    @Override // e1.InterfaceC0961c
    public final float a() {
        return this.f1535c.a();
    }

    @Override // e1.InterfaceC0961c
    public final float b0() {
        return this.f1535c.b0();
    }

    @Override // F0.r
    public final boolean d0() {
        return this.f1535c.d0();
    }

    @Override // e1.InterfaceC0961c
    public final float e0(float f6) {
        return this.f1535c.e0(f6);
    }

    @Override // F0.r
    public final e1.m getLayoutDirection() {
        return this.f1536e;
    }

    @Override // e1.InterfaceC0961c
    public final int l0(float f6) {
        return this.f1535c.l0(f6);
    }

    @Override // e1.InterfaceC0961c
    public final long r0(long j3) {
        return this.f1535c.r0(j3);
    }

    @Override // e1.InterfaceC0961c
    public final long s(float f6) {
        return this.f1535c.s(f6);
    }

    @Override // e1.InterfaceC0961c
    public final long t(long j3) {
        return this.f1535c.t(j3);
    }

    @Override // e1.InterfaceC0961c
    public final float u0(long j3) {
        return this.f1535c.u0(j3);
    }
}
