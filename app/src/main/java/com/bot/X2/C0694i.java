package X2;

import j1.AbstractC1135a;
import java.util.List;
import m4.AbstractC1276k;

/* renamed from: X2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0694i {
    public final List a;

    /* renamed from: b, reason: collision with root package name */
    public final List f9301b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9302c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f9303d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f9304e;

    public C0694i(List list, List list2, String str, boolean z5, boolean z6) {
        AbstractC1276k.f(list, "imageStates");
        AbstractC1276k.f(list2, "fileStates");
        this.a = list;
        this.f9301b = list2;
        this.f9302c = str;
        this.f9303d = z5;
        this.f9304e = z6;
    }

    public static C0694i a(C0694i c0694i, List list, List list2, String str, boolean z5, boolean z6, int i6) {
        if ((i6 & 1) != 0) {
            list = c0694i.a;
        }
        List list3 = list;
        if ((i6 & 2) != 0) {
            list2 = c0694i.f9301b;
        }
        List list4 = list2;
        c0694i.getClass();
        if ((i6 & 8) != 0) {
            str = c0694i.f9302c;
        }
        String str2 = str;
        if ((i6 & 16) != 0) {
            z5 = c0694i.f9303d;
        }
        boolean z7 = z5;
        if ((i6 & 32) != 0) {
            z6 = c0694i.f9304e;
        }
        c0694i.getClass();
        AbstractC1276k.f(list3, "imageStates");
        AbstractC1276k.f(list4, "fileStates");
        AbstractC1276k.f(str2, "message");
        return new C0694i(list3, list4, str2, z7, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0694i)) {
            return false;
        }
        C0694i c0694i = (C0694i) obj;
        return AbstractC1276k.b(this.a, c0694i.a) && AbstractC1276k.b(this.f9301b, c0694i.f9301b) && AbstractC1276k.b(this.f9302c, c0694i.f9302c) && this.f9303d == c0694i.f9303d && this.f9304e == c0694i.f9304e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f9304e) + AbstractC1135a.d(B3.e.e(AbstractC1135a.e(this.f9301b, this.a.hashCode() * 31, 961), 31, this.f9302c), 31, this.f9303d);
    }

    public final String toString() {
        return "ChatUiState(imageStates=" + this.a + ", fileStates=" + this.f9301b + ", selectedOption=null, message=" + this.f9302c + ", isReasoningEnabled=" + this.f9303d + ", isWebSearchEnabled=" + this.f9304e + ")";
    }
}
