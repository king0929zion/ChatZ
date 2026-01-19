package F0;

import java.io.Serializable;
import m4.AbstractC1276k;

/* renamed from: F0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0128p {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final C0127o f1502b;

    /* renamed from: c, reason: collision with root package name */
    public final C0127o f1503c;

    /* renamed from: d, reason: collision with root package name */
    public final C0127o f1504d;

    /* renamed from: e, reason: collision with root package name */
    public final C0127o f1505e;

    /* renamed from: f, reason: collision with root package name */
    public final Serializable f1506f;

    public C0128p(String str) {
        this.a = 1;
        this.f1506f = str;
        this.f1502b = new C0127o(1, null);
        this.f1503c = new C0127o(0, null);
        this.f1504d = new C0127o(1, null);
        this.f1505e = new C0127o(0, null);
    }

    public final C0127o a() {
        switch (this.a) {
            case 0:
                return this.f1505e;
            default:
                return this.f1505e;
        }
    }

    public final C0127o b() {
        switch (this.a) {
            case 0:
                return this.f1502b;
            default:
                return this.f1502b;
        }
    }

    public final C0127o c() {
        switch (this.a) {
            case 0:
                return this.f1504d;
            default:
                return this.f1504d;
        }
    }

    public final C0127o d() {
        switch (this.a) {
            case 0:
                return this.f1503c;
            default:
                return this.f1503c;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                C0128p[] c0128pArr = (C0128p[]) this.f1506f;
                AbstractC1276k.f(c0128pArr, "<this>");
                StringBuilder sb = new StringBuilder();
                Y3.k.w0(c0128pArr, sb, ", ", "innermostOf(", ")", "...", null);
                return sb.toString();
            default:
                String str = (String) this.f1506f;
                return str != null ? B3.e.g(')', "RectRulers(", str) : super.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0128p(C0128p[] c0128pArr) {
        this.a = 0;
        this.f1506f = c0128pArr;
        int length = c0128pArr.length;
        C0127o[] c0127oArr = new C0127o[length];
        for (int i6 = 0; i6 < length; i6++) {
            c0127oArr[i6] = ((C0128p[]) this.f1506f)[i6].b();
        }
        this.f1502b = new C0127o(1, new A0(c0127oArr, 0));
        int length2 = ((C0128p[]) this.f1506f).length;
        C0127o[] c0127oArr2 = new C0127o[length2];
        for (int i7 = 0; i7 < length2; i7++) {
            c0127oArr2[i7] = ((C0128p[]) this.f1506f)[i7].d();
        }
        this.f1503c = new C0127o(0, new C0126n(c0127oArr2, 0));
        int length3 = ((C0128p[]) this.f1506f).length;
        C0127o[] c0127oArr3 = new C0127o[length3];
        for (int i8 = 0; i8 < length3; i8++) {
            c0127oArr3[i8] = ((C0128p[]) this.f1506f)[i8].c();
        }
        this.f1504d = new C0127o(1, new A0(c0127oArr3, 1));
        int length4 = ((C0128p[]) this.f1506f).length;
        C0127o[] c0127oArr4 = new C0127o[length4];
        for (int i9 = 0; i9 < length4; i9++) {
            c0127oArr4[i9] = ((C0128p[]) this.f1506f)[i9].a();
        }
        this.f1505e = new C0127o(0, new C0126n(c0127oArr4, 1));
    }
}
