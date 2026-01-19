package com.bot.feature.settings.data;

import B3.e;
import I4.d;
import M4.AbstractC0252a0;
import kotlinx.serialization.KSerializer;
import m4.AbstractC1276k;

@d
/* loaded from: classes.dex */
public final class OpenAIModelInfo {
    public static final Companion Companion = new Object();
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11268b;

    /* loaded from: classes.dex */
    public static final class Companion {
        public final KSerializer serializer() {
            return OpenAIModelInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OpenAIModelInfo(String str, int i6, String str2) {
        if (1 != (i6 & 1)) {
            AbstractC0252a0.j(i6, 1, OpenAIModelInfo$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i6 & 2) == 0) {
            this.f11268b = null;
        } else {
            this.f11268b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenAIModelInfo)) {
            return false;
        }
        OpenAIModelInfo openAIModelInfo = (OpenAIModelInfo) obj;
        return AbstractC1276k.b(this.a, openAIModelInfo.a) && AbstractC1276k.b(this.f11268b, openAIModelInfo.f11268b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.f11268b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return e.o("OpenAIModelInfo(id=", this.a, ", ownedBy=", this.f11268b, ")");
    }
}
