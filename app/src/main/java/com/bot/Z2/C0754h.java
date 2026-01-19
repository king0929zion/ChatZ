package Z2;

import com.bot.core.model.LLMSetting;
import l4.InterfaceC1193a;
import x4.AbstractC1888A;
import x4.InterfaceC1942y;

/* renamed from: Z2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0754h implements InterfaceC1193a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1193a f10213c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ LLMSetting f10214e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1942y f10215f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a3.w f10216g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l4.c f10217h;

    public C0754h(InterfaceC1193a interfaceC1193a, LLMSetting lLMSetting, InterfaceC1942y interfaceC1942y, a3.w wVar, l4.c cVar) {
        this.f10213c = interfaceC1193a;
        this.f10214e = lLMSetting;
        this.f10215f = interfaceC1942y;
        this.f10216g = wVar;
        this.f10217h = cVar;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        this.f10213c.b();
        String str = this.f10214e.a;
        if (str != null) {
            AbstractC1888A.y(this.f10215f, null, new C0752g(this.f10216g, str, this.f10217h, null), 3);
        }
        return X3.y.a;
    }
}
