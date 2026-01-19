package Y3;

import f0.AbstractC0983f;
import f0.AbstractC0997t;
import y.Z;

/* loaded from: classes.dex */
public final /* synthetic */ class s implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f9808c = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f9809e;

    public /* synthetic */ s(int i6) {
        this.f9809e = i6;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f9808c) {
            case 0:
                ((Integer) obj).intValue();
                throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + this.f9809e + '.');
            default:
                Z z5 = (Z) obj;
                AbstractC0983f e6 = AbstractC0997t.e();
                AbstractC0997t.k(e6, AbstractC0997t.h(e6), e6 != null ? e6.e() : null);
                int i6 = z5.a;
                if (i6 == -1) {
                    i6 = 2;
                }
                for (int i7 = 0; i7 < i6; i7++) {
                    z5.a(this.f9809e + i7);
                }
                return X3.y.a;
        }
    }
}
