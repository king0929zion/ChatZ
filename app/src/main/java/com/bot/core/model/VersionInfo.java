package com.bot.core.model;

import B3.e;
import I4.d;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import kotlinx.serialization.KSerializer;
import m4.AbstractC1276k;

@d
/* loaded from: classes.dex */
public final class VersionInfo {
    public static final Companion Companion = new Object();
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11260b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11261c;

    /* loaded from: classes.dex */
    public static final class Companion {
        public final KSerializer serializer() {
            return VersionInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ VersionInfo(String str, int i6, String str2, String str3) {
        if ((i6 & 1) == 0) {
            this.a = FlexmarkHtmlConverter.DEFAULT_NODE;
        } else {
            this.a = str;
        }
        if ((i6 & 2) == 0) {
            this.f11260b = FlexmarkHtmlConverter.DEFAULT_NODE;
        } else {
            this.f11260b = str2;
        }
        if ((i6 & 4) == 0) {
            this.f11261c = FlexmarkHtmlConverter.DEFAULT_NODE;
        } else {
            this.f11261c = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VersionInfo)) {
            return false;
        }
        VersionInfo versionInfo = (VersionInfo) obj;
        return AbstractC1276k.b(this.a, versionInfo.a) && AbstractC1276k.b(this.f11260b, versionInfo.f11260b) && AbstractC1276k.b(this.f11261c, versionInfo.f11261c);
    }

    public final int hashCode() {
        return this.f11261c.hashCode() + e.e(this.a.hashCode() * 31, 31, this.f11260b);
    }

    public final String toString() {
        return e.s(e.u("VersionInfo(version=", this.a, ", apk=", this.f11260b, ", notes="), this.f11261c, ")");
    }
}
