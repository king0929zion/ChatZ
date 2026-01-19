package D;

import e1.C0959a;
import f0.C0990m;
import java.util.ArrayList;
import java.util.List;

/* renamed from: D.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0076k implements F0.V {

    /* renamed from: b, reason: collision with root package name */
    public static final C0076k f1049b = new C0076k(0);

    /* renamed from: c, reason: collision with root package name */
    public static final C0076k f1050c = new C0076k(1);

    /* renamed from: d, reason: collision with root package name */
    public static final C0990m f1051d = new C0990m(26);
    public final /* synthetic */ int a;

    public /* synthetic */ C0076k(int i6) {
        this.a = i6;
    }

    @Override // F0.V
    public final F0.W e(F0.X x5, List list, long j3) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i6 = 0; i6 < size; i6++) {
                    arrayList.add(((F0.U) list.get(i6)).w(j3));
                }
                return x5.D(C0959a.h(j3), C0959a.g(j3), Y3.w.f9813c, new C0074j(0, arrayList));
            default:
                return x5.D(C0959a.h(j3), C0959a.g(j3), Y3.w.f9813c, f1051d);
        }
    }
}
