package R2;

import Q.A0;
import Q.f3;
import T.C0626q;
import com.tencent.mmkv.R;

/* loaded from: classes.dex */
public final /* synthetic */ class C implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6870c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f6871e;

    public /* synthetic */ C(long j3, int i6) {
        this.f6870c = i6;
        this.f6871e = j3;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        switch (this.f6870c) {
            case 0:
                C0626q c0626q = (C0626q) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                    A0.a(Y3.C.L(R.drawable.arrow_back, 0, c0626q), h5.e.j0(R.string.chat_search_back, c0626q), null, this.f6871e, c0626q, 8, 4);
                } else {
                    c0626q.V();
                }
                return X3.y.a;
            case 1:
                C0626q c0626q2 = (C0626q) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c0626q2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                    A0.a(Y3.C.L(R.drawable.close, 0, c0626q2), h5.e.j0(R.string.chat_search_clear, c0626q2), null, this.f6871e, c0626q2, 8, 4);
                } else {
                    c0626q2.V();
                }
                return X3.y.a;
            default:
                C0626q c0626q3 = (C0626q) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (c0626q3.S(intValue3 & 1, (intValue3 & 3) != 2)) {
                    f3.b(h5.e.j0(R.string.input_search, c0626q3), null, this.f6871e, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q3, 0, 0, 262138);
                } else {
                    c0626q3.V();
                }
                return X3.y.a;
        }
    }
}
