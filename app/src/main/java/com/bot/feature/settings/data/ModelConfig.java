package com.bot.feature.settings.data;

import B3.e;
import I4.d;
import M4.AbstractC0252a0;
import com.vladsch.flexmark.util.html.Attribute;
import kotlinx.serialization.KSerializer;
import m4.AbstractC1276k;

@d
/* loaded from: classes.dex */
public final class ModelConfig {
    public static final Companion Companion = new Object();
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11264b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11265c;

    /* loaded from: classes.dex */
    public static final class Companion {
        public final KSerializer serializer() {
            return ModelConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ModelConfig(String str, int i6, String str2, String str3) {
        if (3 != (i6 & 3)) {
            AbstractC0252a0.j(i6, 3, ModelConfig$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.f11264b = str2;
        if ((i6 & 4) == 0) {
            this.f11265c = null;
        } else {
            this.f11265c = str3;
        }
    }

    public final String a() {
        return this.f11264b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModelConfig)) {
            return false;
        }
        ModelConfig modelConfig = (ModelConfig) obj;
        return AbstractC1276k.b(this.a, modelConfig.a) && AbstractC1276k.b(this.f11264b, modelConfig.f11264b) && AbstractC1276k.b(this.f11265c, modelConfig.f11265c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.f11264b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f11265c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return e.s(e.u("ModelConfig(id=", this.a, ", displayName=", this.f11264b, ", ownedBy="), this.f11265c, ")");
    }

    public ModelConfig(String str, String str2, String str3) {
        AbstractC1276k.f(str, Attribute.ID_ATTR);
        this.a = str;
        this.f11264b = str2;
        this.f11265c = str3;
    }
}
