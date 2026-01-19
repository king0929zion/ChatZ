package y;

import N1.C0290l;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class Z {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f15826b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0 f15827c;

    public Z(b0 b0Var, int i6) {
        this.f15827c = b0Var;
        this.a = i6;
    }

    public final void a(int i6) {
        b0 b0Var = this.f15827c;
        C0290l c0290l = b0Var.f15838c;
        if (c0290l == null) {
            return;
        }
        this.f15826b.add(new q0(c0290l, i6, b0Var.f15837b, null));
    }
}
