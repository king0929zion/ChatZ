package U;

import T.InterfaceC0598c;
import T.M0;
import b0.C0875h;
import b0.C0879l;
import java.util.List;

/* renamed from: U.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0676g extends J {

    /* renamed from: c, reason: collision with root package name */
    public static final C0676g f8573c = new J(0, 2, 1);

    @Override // U.J
    public final void a(L l3, InterfaceC0598c interfaceC0598c, M0 m02, C0879l c0879l, K k3) {
        int i6 = ((C0875h) l3.d(0)).a;
        List list = (List) l3.d(1);
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            Object obj = list.get(i7);
            int i8 = i6 + i7;
            interfaceC0598c.c(i8, obj);
            interfaceC0598c.m(i8, obj);
        }
    }
}
