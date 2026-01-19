package c;

import X3.y;
import l4.InterfaceC1193a;
import m4.AbstractC1277l;

/* renamed from: c.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0917e extends AbstractC1277l implements InterfaceC1193a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f11072e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f11073f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0917e(h hVar, boolean z5) {
        super(0);
        this.f11072e = hVar;
        this.f11073f = z5;
    }

        @Override // l4.InterfaceC1193a
    public final Object b() {
        boolean z5 = this.f11073f;
        h hVar = this.f11072e;
        hVar.a = z5;
        Object r02 = hVar.f10957c;
        if (r02 != 0) {
            r02.b();
        }
        return y.a;
    }
}
