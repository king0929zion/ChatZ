package com.bot.core.model;

import B3.e;
import I4.d;
import M4.AbstractC0252a0;
import M4.C0256c0;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import j1.AbstractC1135a;
import kotlinx.serialization.KSerializer;
import m4.AbstractC1276k;

@d
/* loaded from: classes.dex */
public final class ApiResponse<T> {
    public static final Companion Companion = new Object();

    /* renamed from: f, reason: collision with root package name */
    public static final C0256c0 f11147f;
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11148b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f11149c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11150d;

    /* renamed from: e, reason: collision with root package name */
    public final String f11151e;

    /* loaded from: classes.dex */
    public static final class Companion {
        public final <T> KSerializer serializer(KSerializer kSerializer) {
            AbstractC1276k.f(kSerializer, "typeSerial0");
            return new ApiResponse$$serializer(kSerializer);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.bot.core.model.ApiResponse$Companion, java.lang.Object] */
    static {
        C0256c0 c0256c0 = new C0256c0("com.bot.core.model.ApiResponse", null, 5);
        c0256c0.l("success", false);
        c0256c0.l("message", false);
        c0256c0.l("data", true);
        c0256c0.l(FlexmarkHtmlConverter.CODE_NODE, true);
        c0256c0.l("timestamp", true);
        f11147f = c0256c0;
    }

    public /* synthetic */ ApiResponse(int i6, boolean z5, String str, Object obj, int i7, String str2) {
        if (3 != (i6 & 3)) {
            AbstractC0252a0.j(i6, 3, f11147f);
            throw null;
        }
        this.a = z5;
        this.f11148b = str;
        if ((i6 & 4) == 0) {
            this.f11149c = null;
        } else {
            this.f11149c = obj;
        }
        if ((i6 & 8) == 0) {
            this.f11150d = 200;
        } else {
            this.f11150d = i7;
        }
        if ((i6 & 16) == 0) {
            this.f11151e = null;
        } else {
            this.f11151e = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiResponse)) {
            return false;
        }
        ApiResponse apiResponse = (ApiResponse) obj;
        return this.a == apiResponse.a && AbstractC1276k.b(this.f11148b, apiResponse.f11148b) && AbstractC1276k.b(this.f11149c, apiResponse.f11149c) && this.f11150d == apiResponse.f11150d && AbstractC1276k.b(this.f11151e, apiResponse.f11151e);
    }

    public final int hashCode() {
        int e6 = e.e(Boolean.hashCode(this.a) * 31, 31, this.f11148b);
        Object obj = this.f11149c;
        int b5 = AbstractC1135a.b(this.f11150d, (e6 + (obj == null ? 0 : obj.hashCode())) * 31, 31);
        String str = this.f11151e;
        return b5 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ApiResponse(success=");
        sb.append(this.a);
        sb.append(", message=");
        sb.append(this.f11148b);
        sb.append(", data=");
        sb.append(this.f11149c);
        sb.append(", code=");
        sb.append(this.f11150d);
        sb.append(", timestamp=");
        return e.s(sb, this.f11151e, ")");
    }

    public ApiResponse(boolean z5, String str, Object obj, int i6) {
        this.a = z5;
        this.f11148b = str;
        this.f11149c = obj;
        this.f11150d = i6;
        this.f11151e = null;
    }
}
