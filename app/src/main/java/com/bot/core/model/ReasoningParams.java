package com.bot.core.model;

import B3.e;
import I4.d;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.c;
import m4.AbstractC1276k;

@d
/* loaded from: classes.dex */
public final class ReasoningParams {
    public static final Companion Companion = new Object();
    public final c a;

    /* renamed from: b, reason: collision with root package name */
    public final c f11243b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11244c;

    /* loaded from: classes.dex */
    public static final class Companion {
        public final KSerializer serializer() {
            return ReasoningParams$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ReasoningParams(int i6, c cVar, c cVar2, String str) {
        if ((i6 & 1) == 0) {
            this.a = null;
        } else {
            this.a = cVar;
        }
        if ((i6 & 2) == 0) {
            this.f11243b = null;
        } else {
            this.f11243b = cVar2;
        }
        if ((i6 & 4) == 0) {
            this.f11244c = null;
        } else {
            this.f11244c = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReasoningParams)) {
            return false;
        }
        ReasoningParams reasoningParams = (ReasoningParams) obj;
        return AbstractC1276k.b(this.a, reasoningParams.a) && AbstractC1276k.b(this.f11243b, reasoningParams.f11243b) && AbstractC1276k.b(this.f11244c, reasoningParams.f11244c);
    }

    public final int hashCode() {
        c cVar = this.a;
        int hashCode = (cVar == null ? 0 : cVar.f12633c.hashCode()) * 31;
        c cVar2 = this.f11243b;
        int hashCode2 = (hashCode + (cVar2 == null ? 0 : cVar2.f12633c.hashCode())) * 31;
        String str = this.f11244c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReasoningParams(enabledBody=");
        sb.append(this.a);
        sb.append(", disabledBody=");
        sb.append(this.f11243b);
        sb.append(", budgetKey=");
        return e.s(sb, this.f11244c, ")");
    }
}
