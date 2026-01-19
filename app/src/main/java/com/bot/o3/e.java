package o3;

import androidx.lifecycle.N;
import androidx.lifecycle.U;
import androidx.lifecycle.W;
import b.m;
import f0.C0987j;
import i4.AbstractC1120d;
import s3.C1670b;
import x2.C1867c;

/* loaded from: classes.dex */
public final class e implements W {

    /* renamed from: d, reason: collision with root package name */
    public static final N f13512d = new N(17);
    public final C1670b a;

    /* renamed from: b, reason: collision with root package name */
    public final W f13513b;

    /* renamed from: c, reason: collision with root package name */
    public final F1.d f13514c;

    public e(C1670b c1670b, W w5, C0987j c0987j) {
        this.a = c1670b;
        this.f13513b = w5;
        this.f13514c = new F1.d(c0987j, 1);
    }

    public static e d(m mVar, W w5) {
        C1867c c1867c = (C1867c) ((c) AbstractC1120d.o(mVar, c.class));
        return new e(c1867c.a(), w5, new C0987j(c1867c.a, c1867c.f15569b));
    }

    @Override // androidx.lifecycle.W
    public final U a(Class cls) {
        if (this.a.containsKey(cls)) {
            throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
        }
        return this.f13513b.a(cls);
    }

    @Override // androidx.lifecycle.W
    public final U b(Class cls, F1.f fVar) {
        return this.a.containsKey(cls) ? this.f13514c.b(cls, fVar) : this.f13513b.b(cls, fVar);
    }
}
