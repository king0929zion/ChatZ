package m4;

import s4.InterfaceC1671a;

/* renamed from: m4.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1278m extends AbstractC1279n implements s4.d, s4.e {
    public C1278m(Class cls, String str, String str2, int i6) {
        super(C1267b.f12956c, cls, str, str2, i6);
    }

    @Override // m4.AbstractC1268c
    public final InterfaceC1671a a() {
        AbstractC1289x.a.getClass();
        return this;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        return get(obj);
    }

    @Override // s4.d
    public Object get(Object obj) {
        h();
        throw null;
    }

    public final void h() {
        if (this.f12967j) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        InterfaceC1671a g3 = g();
        if (g3 == this) {
            throw new Error("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        ((C1278m) ((s4.e) g3)).h();
    }
}
