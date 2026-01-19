package Z2;

import T.C0615k0;
import java.util.ArrayList;
import l4.InterfaceC1193a;

/* renamed from: Z2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0758j implements InterfaceC1193a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10235c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f10236e;

    public /* synthetic */ C0758j(Object obj, int i6) {
        this.f10235c = i6;
        this.f10236e = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l4.InterfaceC1193a
    public final Object b() {
        int i6 = this.f10235c;
        X3.y yVar = X3.y.a;
        Object obj = this.f10236e;
        switch (i6) {
            case 0:
                B b5 = (B) obj;
                b5.a(S.l.f7374V);
                b5.f9893f.setValue(null);
                if (b5.f9895h) {
                    b5.f9891d.b();
                }
                b5.f9895h = false;
                return yVar;
            case 1:
                B b6 = (B) obj;
                b6.a(S.l.f7374V);
                b6.f9893f.setValue(null);
                if (b6.f9895h) {
                    b6.f9891d.b();
                }
                b6.f9895h = false;
                return yVar;
            default:
                ArrayList arrayList = ((C0615k0) obj).a;
                k.M m3 = new k.M(arrayList.size());
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    T.Q q3 = (T.Q) arrayList.get(i7);
                    Object obj2 = q3.f8020b;
                    int i8 = q3.a;
                    Object p5 = obj2 != null ? new T.P(Integer.valueOf(i8), q3.f8020b) : Integer.valueOf(i8);
                    int f6 = m3.f(p5);
                    boolean z5 = f6 < 0;
                    Object obj3 = z5 ? null : m3.f12486c[f6];
                    if (obj3 != null) {
                        if (obj3 instanceof k.I) {
                            k.I i9 = (k.I) obj3;
                            i9.a(q3);
                            q3 = i9;
                        } else {
                            Object[] objArr = k.T.a;
                            k.I i10 = new k.I(2);
                            i10.a(obj3);
                            i10.a(q3);
                            q3 = i10;
                        }
                    }
                    if (z5) {
                        int i11 = ~f6;
                        m3.f12485b[i11] = p5;
                        m3.f12486c[i11] = q3;
                    } else {
                        m3.f12486c[f6] = q3;
                    }
                }
                return new V.a(m3);
        }
    }
}
