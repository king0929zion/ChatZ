package p;

import B0.AbstractC0047x;
import B0.C0040p;
import B0.EnumC0041q;
import H0.AbstractC0157l;
import I0.AbstractC0204q0;
import I0.X0;
import android.view.KeyEvent;
import r.f2;

/* renamed from: p.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1420J extends r {

    /* renamed from: P, reason: collision with root package name */
    public B0.y f13592P;

    @Override // p.r, H0.w0
    public final void L() {
        super.L();
        if (this.f13592P != null) {
            this.f13592P = null;
            T0(false);
        }
    }

    @Override // p.r
    public final B0.X Q0() {
        return null;
    }

    @Override // p.r
    public final boolean Y0(KeyEvent keyEvent) {
        return false;
    }

    @Override // p.r
    public final void Z0(KeyEvent keyEvent) {
        this.f13787z.b();
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.util.List, java.lang.Object] */
    @Override // p.r, H0.w0
    public final void w(C0040p c0040p, EnumC0041q enumC0041q, long j3) {
        super.w(c0040p, enumC0041q, j3);
        if (enumC0041q != EnumC0041q.f476e) {
            if (enumC0041q != EnumC0041q.f477f || this.f13592P == null) {
                return;
            }
            ?? r12 = c0040p.a;
            int size = r12.size();
            for (int i6 = 0; i6 < size; i6++) {
                B0.y yVar = (B0.y) r12.get(i6);
                if (yVar.b() && !yVar.equals(this.f13592P)) {
                    this.f13592P = null;
                    T0(false);
                    return;
                }
            }
            return;
        }
        B0.y yVar2 = this.f13592P;
        if (yVar2 == null) {
            if (f2.f(c0040p, true, false)) {
                B0.y yVar3 = (B0.y) c0040p.a.get(0);
                yVar3.a();
                this.f13592P = yVar3;
                if (this.f13786y) {
                    V0(yVar3.f483c, false);
                    return;
                }
                return;
            }
            return;
        }
        ?? r122 = c0040p.a;
        int size2 = r122.size();
        for (int i7 = 0; i7 < size2; i7++) {
            if (!AbstractC0047x.c((B0.y) r122.get(i7))) {
                long r02 = AbstractC0157l.v(this).f1714C.r0(((X0) AbstractC0157l.h(this, AbstractC0204q0.f2369s)).d());
                float max = Math.max(S.l.f7374V, Float.intBitsToFloat((int) (r02 >> 32)) - ((int) (j3 >> 32))) / 2.0f;
                float max2 = Math.max(S.l.f7374V, Float.intBitsToFloat((int) (r02 & 4294967295L)) - ((int) (j3 & 4294967295L))) / 2.0f;
                long floatToRawIntBits = (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max2) & 4294967295L);
                int size3 = r122.size();
                for (int i8 = 0; i8 < size3; i8++) {
                    B0.y yVar4 = (B0.y) r122.get(i8);
                    if (yVar4.b() || AbstractC0047x.f(yVar4, j3, floatToRawIntBits)) {
                        this.f13592P = null;
                        T0(false);
                        return;
                    }
                }
                return;
            }
        }
        ((B0.y) r122.get(0)).a();
        if (this.f13786y) {
            U0(yVar2.f483c, false);
            this.f13787z.b();
        }
        this.f13592P = null;
    }
}
