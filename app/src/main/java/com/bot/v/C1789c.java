package v;

import e1.InterfaceC0961c;

/* renamed from: v.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1789c implements InterfaceC1797g {
    public final /* synthetic */ int a = 1;

    @Override // v.InterfaceC1797g
    public final void b(InterfaceC0961c interfaceC0961c, int i6, int[] iArr, int[] iArr2) {
        switch (this.a) {
            case 0:
                AbstractC1799h.c(i6, iArr, iArr2, false);
                return;
            default:
                AbstractC1799h.b(iArr, iArr2, false);
                return;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "Arrangement#Bottom";
            default:
                return "Arrangement#Top";
        }
    }
}
