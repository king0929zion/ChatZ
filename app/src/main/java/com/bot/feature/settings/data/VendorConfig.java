package com.bot.feature.settings.data;

import B3.e;
import I4.d;
import M4.AbstractC0252a0;
import O.A;
import X3.a;
import X3.f;
import X3.g;
import com.vladsch.flexmark.util.html.Attribute;
import java.util.List;
import kotlinx.serialization.KSerializer;
import m4.AbstractC1276k;

@d
/* loaded from: classes.dex */
public final class VendorConfig {
    public static final Companion Companion = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final f[] f11270d = {null, null, a.c(g.f9390c, new A(25))};
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11271b;

    /* renamed from: c, reason: collision with root package name */
    public final List f11272c;

    /* loaded from: classes.dex */
    public static final class Companion {
        public final KSerializer serializer() {
            return VendorConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ VendorConfig(int i6, String str, String str2, List list) {
        if (7 != (i6 & 7)) {
            AbstractC0252a0.j(i6, 7, VendorConfig$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.f11271b = str2;
        this.f11272c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VendorConfig)) {
            return false;
        }
        VendorConfig vendorConfig = (VendorConfig) obj;
        return AbstractC1276k.b(this.a, vendorConfig.a) && AbstractC1276k.b(this.f11271b, vendorConfig.f11271b) && AbstractC1276k.b(this.f11272c, vendorConfig.f11272c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.f11271b;
        return this.f11272c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder u5 = e.u("VendorConfig(id=", this.a, ", displayName=", this.f11271b, ", models=");
        u5.append(this.f11272c);
        u5.append(")");
        return u5.toString();
    }

    public VendorConfig(String str, String str2, List list) {
        AbstractC1276k.f(str, Attribute.ID_ATTR);
        AbstractC1276k.f(list, "models");
        this.a = str;
        this.f11271b = str2;
        this.f11272c = list;
    }
}
