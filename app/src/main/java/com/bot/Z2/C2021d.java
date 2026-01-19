package z2;

import com.bot.core.database.dao.LLMProviderDao_Impl;

/* renamed from: z2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2021d implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f16229c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f16230e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f16231f;

    public /* synthetic */ C2021d(String str, int i6, String str2) {
        this.f16229c = i6;
        this.f16230e = str;
        this.f16231f = str2;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f16229c) {
            case 0:
                return LLMProviderDao_Impl.g(this.f16230e, this.f16231f, (X1.a) obj);
            default:
                return LLMProviderDao_Impl.k(this.f16230e, this.f16231f, (X1.a) obj);
        }
    }
}
