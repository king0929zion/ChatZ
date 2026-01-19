package U;

import T.C0594a;
import T.InterfaceC0598c;
import T.M0;
import b0.C0879l;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import m4.AbstractC1289x;

/* loaded from: classes.dex */
public abstract class J {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8545b;

    public J(int i6, int i7) {
        this.a = i6;
        this.f8545b = i7;
    }

    public abstract void a(L l3, InterfaceC0598c interfaceC0598c, M0 m02, C0879l c0879l, K k3);

    public C0594a b(L l3) {
        return null;
    }

    public final String toString() {
        String c6 = AbstractC1289x.a(getClass()).c();
        return c6 == null ? FlexmarkHtmlConverter.DEFAULT_NODE : c6;
    }

    public /* synthetic */ J(int i6, int i7, int i8) {
        this((i8 & 1) != 0 ? 0 : i6, (i8 & 2) != 0 ? 0 : i7);
    }
}
