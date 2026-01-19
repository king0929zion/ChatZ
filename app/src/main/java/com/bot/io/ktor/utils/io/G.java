package io.ktor.utils.io;

import m4.AbstractC1276k;
import m4.AbstractC1277l;

/* loaded from: classes.dex */
public final class G extends AbstractC1277l implements l4.c {

    /* renamed from: f, reason: collision with root package name */
    public static final G f12099f;

    /* renamed from: g, reason: collision with root package name */
    public static final G f12100g;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f12101e;

    static {
        int i6 = 1;
        f12099f = new G(i6, 0);
        f12100g = new G(i6, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ G(int i6, int i7) {
        super(i6);
        this.f12101e = i7;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f12101e) {
            case 0:
                AbstractC1276k.f((Throwable) obj, "it");
                return null;
            default:
                AbstractC1276k.f((Throwable) obj, "it");
                return null;
        }
    }
}
