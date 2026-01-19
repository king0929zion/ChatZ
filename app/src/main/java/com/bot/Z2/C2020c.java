package z2;

import com.bot.core.database.dao.LLMProviderDao_Impl;
import com.bot.core.database.dao.LLMSettingDao_Impl;

/* renamed from: z2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2020c implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f16226c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f16227e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f16228f;

    public /* synthetic */ C2020c(long j3, String str, int i6) {
        this.f16226c = i6;
        this.f16227e = j3;
        this.f16228f = str;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f16226c) {
            case 0:
                return LLMProviderDao_Impl.d(this.f16227e, this.f16228f, (X1.a) obj);
            default:
                return LLMSettingDao_Impl.a(this.f16227e, this.f16228f, (X1.a) obj);
        }
    }
}
