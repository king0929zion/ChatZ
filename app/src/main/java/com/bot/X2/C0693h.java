package X2;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import j1.AbstractC1135a;
import m4.AbstractC1276k;

/* renamed from: X2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0693h {
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9293b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f9294c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9295d;

    /* renamed from: e, reason: collision with root package name */
    public final S f9296e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f9297f;

    /* renamed from: g, reason: collision with root package name */
    public final R2.A f9298g;

    /* renamed from: h, reason: collision with root package name */
    public final String f9299h;

    /* renamed from: i, reason: collision with root package name */
    public final long f9300i;

    public C0693h(boolean z5, boolean z6, boolean z7, String str, S s5, boolean z8, R2.A a, String str2, long j3) {
        AbstractC1276k.f(str, "currentChatId");
        AbstractC1276k.f(s5, "messagesLoadState");
        AbstractC1276k.f(a, "drawerMode");
        this.a = z5;
        this.f9293b = z6;
        this.f9294c = z7;
        this.f9295d = str;
        this.f9296e = s5;
        this.f9297f = z8;
        this.f9298g = a;
        this.f9299h = str2;
        this.f9300i = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0693h)) {
            return false;
        }
        C0693h c0693h = (C0693h) obj;
        return this.a == c0693h.a && this.f9293b == c0693h.f9293b && this.f9294c == c0693h.f9294c && AbstractC1276k.b(this.f9295d, c0693h.f9295d) && AbstractC1276k.b(this.f9296e, c0693h.f9296e) && this.f9297f == c0693h.f9297f && this.f9298g == c0693h.f9298g && AbstractC1276k.b(this.f9299h, c0693h.f9299h) && this.f9300i == c0693h.f9300i;
    }

    public final int hashCode() {
        int hashCode = (this.f9298g.hashCode() + AbstractC1135a.d((this.f9296e.hashCode() + B3.e.e(AbstractC1135a.d(AbstractC1135a.d(Boolean.hashCode(this.a) * 31, 31, this.f9293b), 31, this.f9294c), 31, this.f9295d)) * 31, 31, this.f9297f)) * 31;
        String str = this.f9299h;
        return Long.hashCode(this.f9300i) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "ChatScreenState(isLoading=" + this.a + ", isSending=" + this.f9293b + ", isBackgroundRunning=" + this.f9294c + ", currentChatId=" + this.f9295d + ", messagesLoadState=" + this.f9296e + ", isDrawerOpen=" + this.f9297f + ", drawerMode=" + this.f9298g + ", errorMessage=" + this.f9299h + ", lastMessageCompletedAt=" + this.f9300i + ")";
    }

    public /* synthetic */ C0693h(boolean z5, boolean z6, boolean z7, String str, S s5, int i6) {
        this((i6 & 1) != 0 ? false : z5, (i6 & 2) != 0 ? false : z6, (i6 & 4) != 0 ? false : z7, (i6 & 8) != 0 ? FlexmarkHtmlConverter.DEFAULT_NODE : str, (i6 & 16) != 0 ? P.a : s5, false, R2.A.f6854c, null, 0L);
    }
}
