package com.bot.feature.settings.data;

import I4.d;
import M4.AbstractC0252a0;
import O.A;
import X3.a;
import X3.f;
import X3.g;
import java.util.List;
import kotlinx.serialization.KSerializer;
import m4.AbstractC1276k;

@d
/* loaded from: classes.dex */
public final class ModelIdsResponse {
    public static final Companion Companion = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final f[] f11266b = {a.c(g.f9390c, new A(22))};
    public final List a;

    /* loaded from: classes.dex */
    public static final class Companion {
        public final KSerializer serializer() {
            return ModelIdsResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ModelIdsResponse(List list, int i6) {
        if (1 == (i6 & 1)) {
            this.a = list;
        } else {
            AbstractC0252a0.j(i6, 1, ModelIdsResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ModelIdsResponse) && AbstractC1276k.b(this.a, ((ModelIdsResponse) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ModelIdsResponse(modelIds=" + this.a + ")";
    }
}
