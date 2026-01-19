package U;

import H0.C0166v;
import T.AbstractC0629s;
import T.C0626q;
import java.util.ArrayList;
import o4.AbstractC1410a;

/* renamed from: U.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0671b {
    public final C0626q a;

    /* renamed from: b, reason: collision with root package name */
    public C0670a f8557b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8558c;

    /* renamed from: f, reason: collision with root package name */
    public int f8561f;

    /* renamed from: g, reason: collision with root package name */
    public int f8562g;

    /* renamed from: l, reason: collision with root package name */
    public int f8567l;

    /* renamed from: d, reason: collision with root package name */
    public final C0166v f8559d = new C0166v();

    /* renamed from: e, reason: collision with root package name */
    public boolean f8560e = true;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f8563h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public int f8564i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f8565j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f8566k = -1;

    public C0671b(C0626q c0626q, C0670a c0670a) {
        this.a = c0626q;
        this.f8557b = c0670a;
    }

    public final void a() {
        c();
        ArrayList arrayList = this.f8563h;
        if (arrayList.isEmpty()) {
            this.f8562g++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public final void b() {
        int i6 = this.f8562g;
        if (i6 > 0) {
            M m3 = this.f8557b.f8556c;
            m3.W(H.f8543c);
            m3.f8552e[m3.f8553f - m3.f8550c[m3.f8551d - 1].a] = i6;
            this.f8562g = 0;
        }
        ArrayList arrayList = this.f8563h;
        if (arrayList.isEmpty()) {
            return;
        }
        C0670a c0670a = this.f8557b;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i7 = 0; i7 < size; i7++) {
            objArr[i7] = arrayList.get(i7);
        }
        c0670a.getClass();
        if (size != 0) {
            M m5 = c0670a.f8556c;
            m5.W(C0680k.f8577c);
            AbstractC1410a.Q(m5, 0, objArr);
        }
        arrayList.clear();
    }

    public final void c() {
        int i6 = this.f8567l;
        if (i6 > 0) {
            int i7 = this.f8564i;
            if (i7 >= 0) {
                b();
                M m3 = this.f8557b.f8556c;
                m3.W(z.f8596c);
                int i8 = m3.f8553f - m3.f8550c[m3.f8551d - 1].a;
                int[] iArr = m3.f8552e;
                iArr[i8] = i7;
                iArr[i8 + 1] = i6;
                this.f8564i = -1;
            } else {
                int i9 = this.f8566k;
                int i10 = this.f8565j;
                b();
                M m5 = this.f8557b.f8556c;
                m5.W(v.f8592c);
                int i11 = m5.f8553f - m5.f8550c[m5.f8551d - 1].a;
                int[] iArr2 = m5.f8552e;
                iArr2[i11 + 1] = i9;
                iArr2[i11] = i10;
                iArr2[i11 + 2] = i6;
                this.f8565j = -1;
                this.f8566k = -1;
            }
            this.f8567l = 0;
        }
    }

    public final void d(boolean z5) {
        C0626q c0626q = this.a;
        int i6 = z5 ? c0626q.f8151G.f7960i : c0626q.f8151G.f7958g;
        int i7 = i6 - this.f8561f;
        if (i7 < 0) {
            AbstractC0629s.a("Tried to seek backward");
        }
        if (i7 > 0) {
            M m3 = this.f8557b.f8556c;
            m3.W(C0673d.f8570c);
            m3.f8552e[m3.f8553f - m3.f8550c[m3.f8551d - 1].a] = i7;
            this.f8561f = i6;
        }
    }

    public final void e(int i6, int i7) {
        if (i7 > 0) {
            if (!(i6 >= 0)) {
                AbstractC0629s.a("Invalid remove index " + i6);
            }
            if (this.f8564i == i6) {
                this.f8567l += i7;
                return;
            }
            c();
            this.f8564i = i6;
            this.f8567l = i7;
        }
    }
}
