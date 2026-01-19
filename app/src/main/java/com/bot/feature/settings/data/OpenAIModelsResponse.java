package com.bot.feature.settings.data;

import I4.d;
import O.A;
import X3.a;
import X3.f;
import X3.g;
import Y3.v;
import java.util.List;
import kotlinx.serialization.KSerializer;
import m4.AbstractC1276k;

@d
/* loaded from: classes.dex */
public final class OpenAIModelsResponse {
    public static final Companion Companion = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final f[] f11269b = {a.c(g.f9390c, new A(24))};
    public final List a;

    /* loaded from: classes.dex */
    public static final class Companion {
        public final KSerializer serializer() {
            return OpenAIModelsResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OpenAIModelsResponse(List list, int i6) {
        if ((i6 & 1) == 0) {
            this.a = v.f9812c;
        } else {
            this.a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OpenAIModelsResponse) && AbstractC1276k.b(this.a, ((OpenAIModelsResponse) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpenAIModelsResponse(data=" + this.a + ")";
    }
}
