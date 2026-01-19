package com.bot.core.model;

import I4.d;
import M4.AbstractC0252a0;
import M4.C0256c0;
import j1.AbstractC1135a;
import java.util.List;
import kotlinx.serialization.KSerializer;
import m4.AbstractC1276k;

@d
/* loaded from: classes.dex */
public final class PaginatedData<T> {
    public static final Companion Companion = new Object();

    /* renamed from: f, reason: collision with root package name */
    public static final C0256c0 f11235f;
    public final List a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11236b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11237c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11238d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11239e;

    /* loaded from: classes.dex */
    public static final class Companion {
        public final <T> KSerializer serializer(KSerializer kSerializer) {
            AbstractC1276k.f(kSerializer, "typeSerial0");
            return new PaginatedData$$serializer(kSerializer);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.bot.core.model.PaginatedData$Companion, java.lang.Object] */
    static {
        C0256c0 c0256c0 = new C0256c0("com.bot.core.model.PaginatedData", null, 5);
        c0256c0.l("items", false);
        c0256c0.l("total", false);
        c0256c0.l("page", false);
        c0256c0.l("page_size", false);
        c0256c0.l("total_pages", false);
        f11235f = c0256c0;
    }

    public /* synthetic */ PaginatedData(int i6, List list, int i7, int i8, int i9, int i10) {
        if (31 != (i6 & 31)) {
            AbstractC0252a0.j(i6, 31, f11235f);
            throw null;
        }
        this.a = list;
        this.f11236b = i7;
        this.f11237c = i8;
        this.f11238d = i9;
        this.f11239e = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaginatedData)) {
            return false;
        }
        PaginatedData paginatedData = (PaginatedData) obj;
        return AbstractC1276k.b(this.a, paginatedData.a) && this.f11236b == paginatedData.f11236b && this.f11237c == paginatedData.f11237c && this.f11238d == paginatedData.f11238d && this.f11239e == paginatedData.f11239e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f11239e) + AbstractC1135a.b(this.f11238d, AbstractC1135a.b(this.f11237c, AbstractC1135a.b(this.f11236b, this.a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaginatedData(items=");
        sb.append(this.a);
        sb.append(", total=");
        sb.append(this.f11236b);
        sb.append(", page=");
        sb.append(this.f11237c);
        sb.append(", pageSize=");
        sb.append(this.f11238d);
        sb.append(", totalPages=");
        return AbstractC1135a.i(sb, this.f11239e, ")");
    }
}
