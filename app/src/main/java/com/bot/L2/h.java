package L2;

import com.vladsch.flexmark.parser.PegdownExtensions;
import com.vladsch.flexmark.util.html.Attribute;
import j1.AbstractC1135a;
import java.util.Map;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class h {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3085b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f3086c;

    /* renamed from: d, reason: collision with root package name */
    public final i f3087d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3088e;

    /* renamed from: f, reason: collision with root package name */
    public final String f3089f;

    /* renamed from: g, reason: collision with root package name */
    public final long f3090g;

    /* renamed from: h, reason: collision with root package name */
    public final Long f3091h;

    public h(String str, String str2, Map map, i iVar, String str3, String str4, long j3, Long l3) {
        AbstractC1276k.f(str, Attribute.ID_ATTR);
        AbstractC1276k.f(str2, Attribute.NAME_ATTR);
        this.a = str;
        this.f3085b = str2;
        this.f3086c = map;
        this.f3087d = iVar;
        this.f3088e = str3;
        this.f3089f = str4;
        this.f3090g = j3;
        this.f3091h = l3;
    }

    public static h a(h hVar, i iVar, String str, String str2, Long l3, int i6) {
        String str3 = hVar.a;
        String str4 = hVar.f3085b;
        Map map = hVar.f3086c;
        if ((i6 & 16) != 0) {
            str = hVar.f3088e;
        }
        String str5 = str;
        if ((i6 & 32) != 0) {
            str2 = hVar.f3089f;
        }
        String str6 = str2;
        long j3 = hVar.f3090g;
        if ((i6 & PegdownExtensions.FENCED_CODE_BLOCKS) != 0) {
            l3 = hVar.f3091h;
        }
        hVar.getClass();
        AbstractC1276k.f(str3, Attribute.ID_ATTR);
        AbstractC1276k.f(str4, Attribute.NAME_ATTR);
        AbstractC1276k.f(map, "arguments");
        return new h(str3, str4, map, iVar, str5, str6, j3, l3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return AbstractC1276k.b(this.a, hVar.a) && AbstractC1276k.b(this.f3085b, hVar.f3085b) && AbstractC1276k.b(this.f3086c, hVar.f3086c) && this.f3087d == hVar.f3087d && AbstractC1276k.b(this.f3088e, hVar.f3088e) && AbstractC1276k.b(this.f3089f, hVar.f3089f) && this.f3090g == hVar.f3090g && AbstractC1276k.b(this.f3091h, hVar.f3091h);
    }

    public final int hashCode() {
        int hashCode = (this.f3087d.hashCode() + ((this.f3086c.hashCode() + B3.e.e(this.a.hashCode() * 31, 31, this.f3085b)) * 31)) * 31;
        String str = this.f3088e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f3089f;
        int c6 = AbstractC1135a.c((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f3090g);
        Long l3 = this.f3091h;
        return c6 + (l3 != null ? l3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder u5 = B3.e.u("ToolCall(id=", this.a, ", name=", this.f3085b, ", arguments=");
        u5.append(this.f3086c);
        u5.append(", status=");
        u5.append(this.f3087d);
        u5.append(", result=");
        B3.e.z(u5, this.f3088e, ", error=", this.f3089f, ", startTime=");
        u5.append(this.f3090g);
        u5.append(", endTime=");
        u5.append(this.f3091h);
        u5.append(")");
        return u5.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ h(java.lang.String r12, java.lang.String r13, java.util.Map r14, L2.i r15, java.lang.String r16, java.lang.String r17, int r18) {
        /*
            r11 = this;
            r0 = r18 & 1
            if (r0 == 0) goto L11
            java.util.UUID r12 = java.util.UUID.randomUUID()
            java.lang.String r12 = r12.toString()
            java.lang.String r0 = "toString(...)"
            m4.AbstractC1276k.e(r12, r0)
        L11:
            r2 = r12
            r12 = r18 & 16
            r0 = 0
            if (r12 == 0) goto L19
            r6 = r0
            goto L1b
        L19:
            r6 = r16
        L1b:
            r12 = r18 & 32
            if (r12 == 0) goto L21
            r7 = r0
            goto L23
        L21:
            r7 = r17
        L23:
            long r8 = java.lang.System.currentTimeMillis()
            r10 = 0
            r1 = r11
            r3 = r13
            r4 = r14
            r5 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: L2.h.<init>(java.lang.String, java.lang.String, java.util.Map, L2.i, java.lang.String, java.lang.String, int):void");
    }
}
