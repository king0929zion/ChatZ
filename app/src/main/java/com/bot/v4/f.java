package V4;

import B0.B;
import Q4.p;
import Q4.q;
import Q4.v;
import Q4.y;
import U4.i;
import java.util.ArrayList;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class f {
    public final i a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f8810b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8811c;

    /* renamed from: d, reason: collision with root package name */
    public final B f8812d;

    /* renamed from: e, reason: collision with root package name */
    public final v f8813e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8814f;

    /* renamed from: g, reason: collision with root package name */
    public final int f8815g;

    /* renamed from: h, reason: collision with root package name */
    public final int f8816h;

    /* renamed from: i, reason: collision with root package name */
    public int f8817i;

    public f(i iVar, ArrayList arrayList, int i6, B b5, v vVar, int i7, int i8, int i9) {
        AbstractC1276k.f(vVar, "request");
        this.a = iVar;
        this.f8810b = arrayList;
        this.f8811c = i6;
        this.f8812d = b5;
        this.f8813e = vVar;
        this.f8814f = i7;
        this.f8815g = i8;
        this.f8816h = i9;
    }

    public static f a(f fVar, int i6, B b5, v vVar, int i7) {
        if ((i7 & 1) != 0) {
            i6 = fVar.f8811c;
        }
        int i8 = i6;
        if ((i7 & 2) != 0) {
            b5 = fVar.f8812d;
        }
        B b6 = b5;
        if ((i7 & 4) != 0) {
            vVar = fVar.f8813e;
        }
        v vVar2 = vVar;
        int i9 = fVar.f8814f;
        int i10 = fVar.f8815g;
        int i11 = fVar.f8816h;
        AbstractC1276k.f(vVar2, "request");
        return new f(fVar.a, fVar.f8810b, i8, b6, vVar2, i9, i10, i11);
    }

    public final y b(v vVar) {
        AbstractC1276k.f(vVar, "request");
        ArrayList arrayList = this.f8810b;
        int size = arrayList.size();
        int i6 = this.f8811c;
        if (i6 >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.f8817i++;
        B b5 = this.f8812d;
        if (b5 != null) {
            if (!((U4.e) b5.f379c).b((p) vVar.f6637c)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i6 - 1) + " must retain the same host and port").toString());
            }
            if (this.f8817i != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i6 - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i7 = i6 + 1;
        f a = a(this, i7, null, vVar, 58);
        q qVar = (q) arrayList.get(i6);
        y a6 = qVar.a(a);
        if (a6 == null) {
            throw new NullPointerException("interceptor " + qVar + " returned null");
        }
        if (b5 != null && i7 < arrayList.size() && a.f8817i != 1) {
            throw new IllegalStateException(("network interceptor " + qVar + " must call proceed() exactly once").toString());
        }
        if (a6.f6663j != null) {
            return a6;
        }
        throw new IllegalStateException(("interceptor " + qVar + " returned a response with no body").toString());
    }
}
