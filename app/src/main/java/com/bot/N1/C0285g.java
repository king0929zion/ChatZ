package N1;

import com.bot.core.database.data.AppDatabase_Impl;
import l4.InterfaceC1193a;

/* renamed from: N1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0285g implements InterfaceC1193a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3742c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0286h f3743e;

    public /* synthetic */ C0285g(C0286h c0286h, int i6) {
        this.f3742c = i6;
        this.f3743e = c0286h;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        switch (this.f3742c) {
            case 0:
                this.f3743e.getClass();
                break;
            case 1:
                this.f3743e.getClass();
                break;
            default:
                AppDatabase_Impl appDatabase_Impl = this.f3743e.a;
                return Boolean.valueOf(!appDatabase_Impl.g() || appDatabase_Impl.h());
        }
        return X3.y.a;
    }
}
