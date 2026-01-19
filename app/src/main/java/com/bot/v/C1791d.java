package v;

import e1.InterfaceC0961c;

/* renamed from: v.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1791d implements InterfaceC1793e, InterfaceC1797g {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final float f15292b;

    public C1791d(int i6) {
        this.a = i6;
        switch (i6) {
            case 1:
                this.f15292b = 0;
                return;
            case 2:
                this.f15292b = 0;
                return;
            case 3:
                this.f15292b = 0;
                return;
            default:
                this.f15292b = 0;
                return;
        }
    }

    @Override // v.InterfaceC1793e, v.InterfaceC1797g
    public final float a() {
        switch (this.a) {
            case 0:
                return this.f15292b;
            case 1:
                return this.f15292b;
            case 2:
                return this.f15292b;
            default:
                return this.f15292b;
        }
    }

    @Override // v.InterfaceC1797g
    public final void b(InterfaceC0961c interfaceC0961c, int i6, int[] iArr, int[] iArr2) {
        switch (this.a) {
            case 0:
                AbstractC1799h.a(i6, iArr, iArr2, false);
                return;
            case 1:
                AbstractC1799h.d(i6, iArr, iArr2, false);
                return;
            case 2:
                AbstractC1799h.e(i6, iArr, iArr2, false);
                return;
            default:
                AbstractC1799h.f(i6, iArr, iArr2, false);
                return;
        }
    }

    @Override // v.InterfaceC1793e
    public final void c(InterfaceC0961c interfaceC0961c, int i6, int[] iArr, e1.m mVar, int[] iArr2) {
        switch (this.a) {
            case 0:
                if (mVar == e1.m.f11576c) {
                    AbstractC1799h.a(i6, iArr, iArr2, false);
                    return;
                } else {
                    AbstractC1799h.a(i6, iArr, iArr2, true);
                    return;
                }
            case 1:
                if (mVar == e1.m.f11576c) {
                    AbstractC1799h.d(i6, iArr, iArr2, false);
                    return;
                } else {
                    AbstractC1799h.d(i6, iArr, iArr2, true);
                    return;
                }
            case 2:
                if (mVar == e1.m.f11576c) {
                    AbstractC1799h.e(i6, iArr, iArr2, false);
                    return;
                } else {
                    AbstractC1799h.e(i6, iArr, iArr2, true);
                    return;
                }
            default:
                if (mVar == e1.m.f11576c) {
                    AbstractC1799h.f(i6, iArr, iArr2, false);
                    return;
                } else {
                    AbstractC1799h.f(i6, iArr, iArr2, true);
                    return;
                }
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "Arrangement#Center";
            case 1:
                return "Arrangement#SpaceAround";
            case 2:
                return "Arrangement#SpaceBetween";
            default:
                return "Arrangement#SpaceEvenly";
        }
    }
}
