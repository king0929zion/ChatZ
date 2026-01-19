package a3;

import com.bot.core.model.LLMProvider;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.parser.PegdownExtensions;
import m4.AbstractC1276k;

/* renamed from: a3.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0810H {

    /* renamed from: i, reason: collision with root package name */
    public static final int f10622i;
    public final LLMProvider a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10623b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10624c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10625d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10626e;

    /* renamed from: f, reason: collision with root package name */
    public final String f10627f;

    /* renamed from: g, reason: collision with root package name */
    public final String f10628g;

    /* renamed from: h, reason: collision with root package name */
    public final String f10629h;

    static {
        LLMProvider.Companion companion = LLMProvider.Companion;
        f10622i = 8;
    }

    public C0810H(LLMProvider lLMProvider, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        AbstractC1276k.f(lLMProvider, "provider");
        AbstractC1276k.f(str, "apiKeyInput");
        AbstractC1276k.f(str2, "baseUrlInput");
        AbstractC1276k.f(str3, "apiSchemaInput");
        AbstractC1276k.f(str4, "openAiApiModeInput");
        AbstractC1276k.f(str5, "googleApiModeInput");
        AbstractC1276k.f(str6, "googleProjectIdInput");
        AbstractC1276k.f(str7, "googleLocationInput");
        this.a = lLMProvider;
        this.f10623b = str;
        this.f10624c = str2;
        this.f10625d = str3;
        this.f10626e = str4;
        this.f10627f = str5;
        this.f10628g = str6;
        this.f10629h = str7;
    }

    public static C0810H a(LLMProvider lLMProvider, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        AbstractC1276k.f(lLMProvider, "provider");
        AbstractC1276k.f(str, "apiKeyInput");
        AbstractC1276k.f(str2, "baseUrlInput");
        AbstractC1276k.f(str3, "apiSchemaInput");
        AbstractC1276k.f(str4, "openAiApiModeInput");
        AbstractC1276k.f(str5, "googleApiModeInput");
        AbstractC1276k.f(str6, "googleProjectIdInput");
        AbstractC1276k.f(str7, "googleLocationInput");
        return new C0810H(lLMProvider, str, str2, str3, str4, str5, str6, str7);
    }

    public static /* synthetic */ C0810H b(C0810H c0810h, LLMProvider lLMProvider, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i6) {
        if ((i6 & 1) != 0) {
            lLMProvider = c0810h.a;
        }
        if ((i6 & 2) != 0) {
            str = c0810h.f10623b;
        }
        if ((i6 & 4) != 0) {
            str2 = c0810h.f10624c;
        }
        if ((i6 & 8) != 0) {
            str3 = c0810h.f10625d;
        }
        if ((i6 & 16) != 0) {
            str4 = c0810h.f10626e;
        }
        if ((i6 & 32) != 0) {
            str5 = c0810h.f10627f;
        }
        if ((i6 & 64) != 0) {
            str6 = c0810h.f10628g;
        }
        if ((i6 & PegdownExtensions.FENCED_CODE_BLOCKS) != 0) {
            str7 = c0810h.f10629h;
        }
        String str8 = str7;
        c0810h.getClass();
        String str9 = str6;
        String str10 = str5;
        String str11 = str4;
        String str12 = str3;
        String str13 = str2;
        return a(lLMProvider, str, str13, str12, str11, str10, str9, str8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0810H)) {
            return false;
        }
        C0810H c0810h = (C0810H) obj;
        return AbstractC1276k.b(this.a, c0810h.a) && AbstractC1276k.b(this.f10623b, c0810h.f10623b) && AbstractC1276k.b(this.f10624c, c0810h.f10624c) && AbstractC1276k.b(this.f10625d, c0810h.f10625d) && AbstractC1276k.b(this.f10626e, c0810h.f10626e) && AbstractC1276k.b(this.f10627f, c0810h.f10627f) && AbstractC1276k.b(this.f10628g, c0810h.f10628g) && AbstractC1276k.b(this.f10629h, c0810h.f10629h);
    }

    public final int hashCode() {
        return this.f10629h.hashCode() + B3.e.e(B3.e.e(B3.e.e(B3.e.e(B3.e.e(B3.e.e(this.a.hashCode() * 31, 31, this.f10623b), 31, this.f10624c), 31, this.f10625d), 31, this.f10626e), 31, this.f10627f), 31, this.f10628g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProviderUiState(provider=");
        sb.append(this.a);
        sb.append(", apiKeyInput=");
        sb.append(this.f10623b);
        sb.append(", baseUrlInput=");
        B3.e.z(sb, this.f10624c, ", apiSchemaInput=", this.f10625d, ", openAiApiModeInput=");
        B3.e.z(sb, this.f10626e, ", googleApiModeInput=", this.f10627f, ", googleProjectIdInput=");
        sb.append(this.f10628g);
        sb.append(", googleLocationInput=");
        sb.append(this.f10629h);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ C0810H(LLMProvider lLMProvider, String str, String str2) {
        this(lLMProvider, str, str2, "openai", "chat_completions", "ai_studio", FlexmarkHtmlConverter.DEFAULT_NODE, FlexmarkHtmlConverter.DEFAULT_NODE);
    }
}
