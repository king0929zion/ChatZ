package h1;

import H0.C0158m;
import I0.AbstractC0171a;
import android.view.View;

/* loaded from: classes.dex */
public final class x extends i {

    /* renamed from: D, reason: collision with root package name */
    public final View f11903D;

    /* renamed from: E, reason: collision with root package name */
    public final A0.e f11904E;

    /* renamed from: F, reason: collision with root package name */
    public e0.e f11905F;

    /* renamed from: G, reason: collision with root package name */
    public l4.c f11906G;

    /* renamed from: H, reason: collision with root package name */
    public l4.c f11907H;

    /* renamed from: I, reason: collision with root package name */
    public l4.c f11908I;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public x(android.content.Context r8, l4.c r9, T.C0622o r10, e0.f r11, int r12, H0.r0 r13) {
        /*
            r7 = this;
            java.lang.Object r9 = r9.f(r8)
            r5 = r9
            android.view.View r5 = (android.view.View) r5
            A0.e r4 = new A0.e
            r4.<init>()
            r0 = r7
            r1 = r8
            r2 = r10
            r3 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0.f11903D = r5
            r0.f11904E = r4
            r8 = 0
            r7.setClipChildren(r8)
            java.lang.String r8 = java.lang.String.valueOf(r3)
            r9 = 0
            if (r11 == 0) goto L28
            java.lang.Object r10 = r11.d(r8)
            goto L29
        L28:
            r10 = r9
        L29:
            boolean r12 = r10 instanceof android.util.SparseArray
            if (r12 == 0) goto L30
            r9 = r10
            android.util.SparseArray r9 = (android.util.SparseArray) r9
        L30:
            if (r9 == 0) goto L35
            r5.restoreHierarchyState(r9)
        L35:
            if (r11 == 0) goto L44
            h1.h r9 = new h1.h
            r10 = 2
            r9.<init>(r7, r10)
            e0.e r8 = r11.e(r8, r9)
            r7.setSavableRegistryEntry(r8)
        L44:
            h1.b r8 = h1.C1048b.f11832i
            r0.f11906G = r8
            r0.f11907H = r8
            r0.f11908I = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.x.<init>(android.content.Context, l4.c, T.o, e0.f, int, H0.r0):void");
    }

    public static final void h(x xVar) {
        xVar.setSavableRegistryEntry(null);
    }

    private final void setSavableRegistryEntry(e0.e eVar) {
        e0.e eVar2 = this.f11905F;
        if (eVar2 != null) {
            ((C0158m) eVar2).t();
        }
        this.f11905F = eVar;
    }

    public final A0.e getDispatcher() {
        return this.f11904E;
    }

    public final l4.c getReleaseBlock() {
        return this.f11908I;
    }

    public final l4.c getResetBlock() {
        return this.f11907H;
    }

    public /* bridge */ /* synthetic */ AbstractC0171a getSubCompositionView() {
        return null;
    }

    public final l4.c getUpdateBlock() {
        return this.f11906G;
    }

    public View getViewRoot() {
        return this;
    }

    public final void setReleaseBlock(l4.c cVar) {
        this.f11908I = cVar;
        setRelease(new h(this, 3));
    }

    public final void setResetBlock(l4.c cVar) {
        this.f11907H = cVar;
        setReset(new h(this, 4));
    }

    public final void setUpdateBlock(l4.c cVar) {
        this.f11906G = cVar;
        setUpdate(new h(this, 5));
    }
}
