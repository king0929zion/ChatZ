package com.bot.core.model;

import D.C0080m;
import I4.d;
import X3.a;
import X3.f;
import X3.g;
import Y3.v;
import j1.AbstractC1135a;
import java.util.List;
import kotlinx.serialization.KSerializer;
import m4.AbstractC1276k;

@d
/* loaded from: classes.dex */
public final class ReasoningConfig {
    public static final Companion Companion = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final f[] f11240d;
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final List f11241b;

    /* renamed from: c, reason: collision with root package name */
    public final List f11242c;

    /* loaded from: classes.dex */
    public static final class Companion {
        public final KSerializer serializer() {
            return ReasoningConfig$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.bot.core.model.ReasoningConfig$Companion] */
    static {
        C0080m c0080m = new C0080m(13);
        g gVar = g.f9390c;
        f11240d = new f[]{null, a.c(gVar, c0080m), a.c(gVar, new C0080m(14))};
    }

    public /* synthetic */ ReasoningConfig(int i6, int i7, List list, List list2) {
        this.a = (i6 & 1) == 0 ? 1 : i7;
        int i8 = i6 & 2;
        v vVar = v.f9812c;
        if (i8 == 0) {
            this.f11241b = vVar;
        } else {
            this.f11241b = list;
        }
        if ((i6 & 4) == 0) {
            this.f11242c = vVar;
        } else {
            this.f11242c = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReasoningConfig)) {
            return false;
        }
        ReasoningConfig reasoningConfig = (ReasoningConfig) obj;
        return this.a == reasoningConfig.a && AbstractC1276k.b(this.f11241b, reasoningConfig.f11241b) && AbstractC1276k.b(this.f11242c, reasoningConfig.f11242c);
    }

    public final int hashCode() {
        return this.f11242c.hashCode() + AbstractC1135a.e(this.f11241b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "ReasoningConfig(version=" + this.a + ", defaults=" + this.f11241b + ", models=" + this.f11242c + ")";
    }

    public ReasoningConfig() {
        this.a = 1;
        v vVar = v.f9812c;
        this.f11241b = vVar;
        this.f11242c = vVar;
    }
}
