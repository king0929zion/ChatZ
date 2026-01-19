package M2;

import com.vladsch.flexmark.parser.PegdownExtensions;
import j1.AbstractC1135a;
import java.util.List;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class A {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3269b;

    /* renamed from: c, reason: collision with root package name */
    public final List f3270c;

    /* renamed from: d, reason: collision with root package name */
    public final List f3271d;

    /* renamed from: e, reason: collision with root package name */
    public final L2.e f3272e;

    /* renamed from: f, reason: collision with root package name */
    public final L2.f f3273f;

    /* renamed from: g, reason: collision with root package name */
    public final Long f3274g;

    /* renamed from: h, reason: collision with root package name */
    public final Long f3275h;

    /* renamed from: i, reason: collision with root package name */
    public final String f3276i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ A(java.lang.String r12, int r13) {
        /*
            r11 = this;
            r0 = r13 & 1
            java.lang.String r3 = ""
            if (r0 == 0) goto L8
            r2 = r3
            goto L9
        L8:
            r2 = r12
        L9:
            r12 = r13 & 16
            if (r12 == 0) goto L11
            L2.e r12 = L2.e.f3073c
        Lf:
            r6 = r12
            goto L14
        L11:
            L2.e r12 = L2.e.f3074e
            goto Lf
        L14:
            L2.f r7 = L2.f.f3081c
            Y3.v r4 = Y3.v.f9812c
            r8 = 0
            r9 = 0
            r10 = 0
            r5 = r4
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: M2.A.<init>(java.lang.String, int):void");
    }

    public static A a(A a, String str, String str2, List list, List list2, L2.e eVar, L2.f fVar, Long l3, Long l5, String str3, int i6) {
        if ((i6 & 1) != 0) {
            str = a.a;
        }
        String str4 = str;
        if ((i6 & 2) != 0) {
            str2 = a.f3269b;
        }
        String str5 = str2;
        if ((i6 & 4) != 0) {
            list = a.f3270c;
        }
        List list3 = list;
        if ((i6 & 8) != 0) {
            list2 = a.f3271d;
        }
        List list4 = list2;
        if ((i6 & 16) != 0) {
            eVar = a.f3272e;
        }
        L2.e eVar2 = eVar;
        L2.f fVar2 = (i6 & 32) != 0 ? a.f3273f : fVar;
        Long l6 = (i6 & 64) != 0 ? a.f3274g : l3;
        Long l7 = (i6 & PegdownExtensions.FENCED_CODE_BLOCKS) != 0 ? a.f3275h : l5;
        String str6 = (i6 & PegdownExtensions.WIKILINKS) != 0 ? a.f3276i : str3;
        a.getClass();
        AbstractC1276k.f(str4, "messageId");
        AbstractC1276k.f(str5, "content");
        AbstractC1276k.f(list3, "reasoningSegments");
        AbstractC1276k.f(list4, "toolCalls");
        AbstractC1276k.f(eVar2, "status");
        AbstractC1276k.f(fVar2, "reasoningPhase");
        return new A(str4, str5, list3, list4, eVar2, fVar2, l6, l7, str6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a = (A) obj;
        return AbstractC1276k.b(this.a, a.a) && AbstractC1276k.b(this.f3269b, a.f3269b) && AbstractC1276k.b(this.f3270c, a.f3270c) && AbstractC1276k.b(this.f3271d, a.f3271d) && this.f3272e == a.f3272e && this.f3273f == a.f3273f && AbstractC1276k.b(this.f3274g, a.f3274g) && AbstractC1276k.b(this.f3275h, a.f3275h) && AbstractC1276k.b(this.f3276i, a.f3276i);
    }

    public final int hashCode() {
        int hashCode = (this.f3273f.hashCode() + ((this.f3272e.hashCode() + AbstractC1135a.e(this.f3271d, AbstractC1135a.e(this.f3270c, B3.e.e(this.a.hashCode() * 31, 31, this.f3269b), 31), 31)) * 31)) * 31;
        Long l3 = this.f3274g;
        int hashCode2 = (hashCode + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l5 = this.f3275h;
        int hashCode3 = (hashCode2 + (l5 == null ? 0 : l5.hashCode())) * 31;
        String str = this.f3276i;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder u5 = B3.e.u("StreamingState(messageId=", this.a, ", content=", this.f3269b, ", reasoningSegments=");
        u5.append(this.f3270c);
        u5.append(", toolCalls=");
        u5.append(this.f3271d);
        u5.append(", status=");
        u5.append(this.f3272e);
        u5.append(", reasoningPhase=");
        u5.append(this.f3273f);
        u5.append(", reasoningStartAtMs=");
        u5.append(this.f3274g);
        u5.append(", reasoningDurationMs=");
        u5.append(this.f3275h);
        u5.append(", errorMessage=");
        return B3.e.s(u5, this.f3276i, ")");
    }

    public A(String str, String str2, List list, List list2, L2.e eVar, L2.f fVar, Long l3, Long l5, String str3) {
        AbstractC1276k.f(str, "messageId");
        AbstractC1276k.f(eVar, "status");
        this.a = str;
        this.f3269b = str2;
        this.f3270c = list;
        this.f3271d = list2;
        this.f3272e = eVar;
        this.f3273f = fVar;
        this.f3274g = l3;
        this.f3275h = l5;
        this.f3276i = str3;
    }
}
