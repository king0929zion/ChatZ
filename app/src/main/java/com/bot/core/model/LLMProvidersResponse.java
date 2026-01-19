package com.bot.core.model;

import D.C0080m;
import I4.d;
import M4.AbstractC0252a0;
import X3.a;
import X3.f;
import X3.g;
import java.util.List;
import kotlinx.serialization.KSerializer;
import m4.AbstractC1276k;

@d
/* loaded from: classes.dex */
public final class LLMProvidersResponse {
    public static final Companion Companion = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final f[] f11196b = {a.c(g.f9390c, new C0080m(7))};
    public final List a;

    /* loaded from: classes.dex */
    public static final class Companion {
        public final KSerializer serializer() {
            return LLMProvidersResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LLMProvidersResponse(List list, int i6) {
        if (1 == (i6 & 1)) {
            this.a = list;
        } else {
            AbstractC0252a0.j(i6, 1, LLMProvidersResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LLMProvidersResponse) && AbstractC1276k.b(this.a, ((LLMProvidersResponse) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LLMProvidersResponse(providers=" + this.a + ")";
    }
}
