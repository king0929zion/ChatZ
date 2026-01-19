package H0;

import h0.AbstractC1040q;
import h0.InterfaceC1039p;
import m4.AbstractC1276k;

/* renamed from: H0.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0145d0 {
    public AbstractC1040q a;

    /* renamed from: b, reason: collision with root package name */
    public int f1902b;

    /* renamed from: c, reason: collision with root package name */
    public V.e f1903c;

    /* renamed from: d, reason: collision with root package name */
    public V.e f1904d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1905e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0149f0 f1906f;

    public C0145d0(C0149f0 c0149f0, AbstractC1040q abstractC1040q, int i6, V.e eVar, V.e eVar2, boolean z5) {
        this.f1906f = c0149f0;
        this.a = abstractC1040q;
        this.f1902b = i6;
        this.f1903c = eVar;
        this.f1904d = eVar2;
        this.f1905e = z5;
    }

    public final boolean a(int i6, int i7) {
        V.e eVar = this.f1903c;
        int i8 = this.f1902b;
        InterfaceC1039p interfaceC1039p = (InterfaceC1039p) eVar.f8759c[i6 + i8];
        InterfaceC1039p interfaceC1039p2 = (InterfaceC1039p) this.f1904d.f8759c[i8 + i7];
        return AbstractC1276k.b(interfaceC1039p, interfaceC1039p2) || interfaceC1039p.getClass() == interfaceC1039p2.getClass();
    }
}
