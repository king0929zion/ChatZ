package b0;

import T.B0;
import T.C0;
import java.util.Set;

/* renamed from: b0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0876i implements B0 {

    /* renamed from: c, reason: collision with root package name */
    public final Set f10985c;

    /* renamed from: e, reason: collision with root package name */
    public final V.e f10986e = new V.e(new C0[16]);

    public C0876i(Set set) {
        this.f10985c = set;
    }

    @Override // T.B0
    public final void a() {
    }

    @Override // T.B0
    public final void b() {
    }

    @Override // T.B0
    public final void e() {
        V.e eVar = this.f10986e;
        Object[] objArr = eVar.f8759c;
        int i6 = eVar.f8761f;
        for (int i7 = 0; i7 < i6; i7++) {
            B0 b02 = ((C0) objArr[i7]).a;
            this.f10985c.remove(b02);
            b02.e();
        }
    }
}
