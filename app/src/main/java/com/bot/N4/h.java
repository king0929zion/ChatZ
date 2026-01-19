package N4;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class h {
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3898b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3899c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3900d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3901e;

    /* renamed from: f, reason: collision with root package name */
    public final String f3902f;

    /* renamed from: g, reason: collision with root package name */
    public final String f3903g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f3904h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f3905i;

    /* renamed from: j, reason: collision with root package name */
    public final a f3906j;

    public h(boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, String str, String str2, boolean z10, boolean z11, a aVar) {
        AbstractC1276k.f(str, "prettyPrintIndent");
        AbstractC1276k.f(str2, "classDiscriminator");
        AbstractC1276k.f(aVar, "classDiscriminatorMode");
        this.a = z5;
        this.f3898b = z6;
        this.f3899c = z7;
        this.f3900d = z8;
        this.f3901e = z9;
        this.f3902f = str;
        this.f3903g = str2;
        this.f3904h = z10;
        this.f3905i = z11;
        this.f3906j = aVar;
    }

    public final String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.a + ", ignoreUnknownKeys=" + this.f3898b + ", isLenient=" + this.f3899c + ", allowStructuredMapKeys=" + this.f3900d + ", prettyPrint=false, explicitNulls=" + this.f3901e + ", prettyPrintIndent='" + this.f3902f + "', coerceInputValues=false, useArrayPolymorphism=false, classDiscriminator='" + this.f3903g + "', allowSpecialFloatingPointValues=" + this.f3904h + ", useAlternativeNames=" + this.f3905i + ", namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=" + this.f3906j + ')';
    }
}
