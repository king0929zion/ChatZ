package V2;

import j1.AbstractC1135a;
import java.util.List;
import m4.AbstractC1276k;
import u4.AbstractC1776n;

/* loaded from: classes.dex */
public final class a {
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        if (r4 == null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(java.util.List r8) {
        /*
            java.lang.String r0 = "files"
            m4.AbstractC1276k.f(r8, r0)
            boolean r0 = r8.isEmpty()
            java.lang.String r1 = ""
            if (r0 == 0) goto Le
            return r1
        Le:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r8 = r8.iterator()
        L17:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L90
            java.lang.Object r0 = r8.next()
            com.bot.core.model.MessageAttachment r0 = (com.bot.core.model.MessageAttachment) r0
            java.util.Map r3 = r0.f11226e
            r4 = 0
            if (r3 == 0) goto L31
            java.lang.String r5 = "text"
            java.lang.Object r3 = r3.get(r5)
            kotlinx.serialization.json.b r3 = (kotlinx.serialization.json.b) r3
            goto L32
        L31:
            r3 = r4
        L32:
            boolean r5 = r3 instanceof kotlinx.serialization.json.d
            if (r5 == 0) goto L39
            kotlinx.serialization.json.d r3 = (kotlinx.serialization.json.d) r3
            goto L3a
        L39:
            r3 = r4
        L3a:
            if (r3 == 0) goto L4b
            java.lang.String r3 = r3.a()
            if (r3 == 0) goto L4b
            java.lang.CharSequence r3 = u4.AbstractC1776n.l0(r3)
            java.lang.String r3 = r3.toString()
            goto L4c
        L4b:
            r3 = r4
        L4c:
            if (r3 != 0) goto L4f
            r3 = r1
        L4f:
            boolean r5 = u4.AbstractC1776n.Q(r3)
            if (r5 == 0) goto L56
            goto L8a
        L56:
            java.lang.String r5 = r0.f11224c
            if (r5 == 0) goto L63
            boolean r6 = u4.AbstractC1776n.Q(r5)
            if (r6 != 0) goto L61
            r4 = r5
        L61:
            if (r4 != 0) goto L74
        L63:
            java.lang.String r0 = r0.f11223b
            r4 = 47
            java.lang.String r0 = u4.AbstractC1776n.g0(r4, r0, r0)
            boolean r4 = u4.AbstractC1776n.Q(r0)
            if (r4 == 0) goto L73
            java.lang.String r0 = "文件"
        L73:
            r4 = r0
        L74:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r5 = "文件名："
            r0.<init>(r5)
            r0.append(r4)
            java.lang.String r4 = "\n内容：\n"
            r0.append(r4)
            r0.append(r3)
            java.lang.String r4 = r0.toString()
        L8a:
            if (r4 == 0) goto L17
            r2.add(r4)
            goto L17
        L90:
            r6 = 0
            r7 = 62
            java.lang.String r3 = "\n\n"
            r4 = 0
            r5 = 0
            java.lang.String r8 = Y3.m.v0(r2, r3, r4, r5, r6, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: V2.a.a(java.util.List):java.lang.String");
    }

    public static String b(String str, List list) {
        AbstractC1276k.f(str, "content");
        AbstractC1276k.f(list, "files");
        String a = a(list);
        return AbstractC1776n.Q(str) ? a : AbstractC1776n.Q(a) ? str : AbstractC1135a.g(str, "\n\n", a);
    }
}
