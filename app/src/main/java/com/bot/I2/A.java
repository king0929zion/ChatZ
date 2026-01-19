package I2;

import A4.Q;
import A4.W;
import A4.g0;
import android.content.Context;
import androidx.lifecycle.N;
import com.bot.core.model.ReasoningConfig;
import com.bot.core.model.ReasoningRule;
import com.tencent.mmkv.MMKV;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import i4.AbstractC1121e;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import m4.AbstractC1276k;
import u4.AbstractC1763a;
import u4.AbstractC1776n;

/* loaded from: classes.dex */
public final class A {
    private static final y Companion = new Object();
    public final F2.i a;

    /* renamed from: b, reason: collision with root package name */
    public final MMKV f2606b;

    /* renamed from: c, reason: collision with root package name */
    public final N4.m f2607c;

    /* renamed from: d, reason: collision with root package name */
    public final g0 f2608d;

    /* renamed from: e, reason: collision with root package name */
    public final Q f2609e;

    public A(Context context, F2.i iVar, MMKV mmkv) {
        Object b5;
        ReasoningConfig b6;
        AbstractC1276k.f(iVar, "apiService");
        AbstractC1276k.f(mmkv, "mmkv");
        this.a = iVar;
        this.f2606b = mmkv;
        this.f2607c = Y4.d.e(new x(0));
        try {
            InputStream open = context.getAssets().open("reasoning_config.json");
            AbstractC1276k.e(open, "open(...)");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open, AbstractC1763a.a), 8192);
            try {
                b5 = AbstractC1121e.m(bufferedReader);
                bufferedReader.close();
            } finally {
            }
        } catch (Throwable th) {
            b5 = X3.a.b(th);
        }
        if (X3.l.a(b5) != null) {
            i5.a.a.getClass();
            N.z(new Object[0]);
            b5 = null;
        }
        String str = (String) b5;
        if (str == null) {
            b6 = new ReasoningConfig();
        } else {
            b6 = b(str);
            if (b6 == null) {
                b6 = new ReasoningConfig();
            }
        }
        g0 b7 = W.b(b6);
        this.f2608d = b7;
        this.f2609e = new Q(b7);
        String decodeString = this.f2606b.decodeString("reasoning_config_json");
        decodeString = decodeString == null ? FlexmarkHtmlConverter.DEFAULT_NODE : decodeString;
        ReasoningConfig b8 = AbstractC1776n.Q(decodeString) ? null : b(decodeString);
        if (b8 != null) {
            b7.l(null, b8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0084, code lost:
    
        if (u4.u.w(r6, ".".concat(r7), false) != false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(com.bot.core.model.ReasoningRule r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            java.lang.String r0 = r5.f11246b
            r1 = 0
            if (r0 == 0) goto Le
            java.lang.CharSequence r0 = u4.AbstractC1776n.l0(r0)
            java.lang.String r0 = r0.toString()
            goto Lf
        Le:
            r0 = r1
        Lf:
            java.lang.String r2 = ""
            if (r0 != 0) goto L14
            r0 = r2
        L14:
            int r3 = r0.length()
            r4 = 0
            if (r3 <= 0) goto L23
            boolean r9 = r0.equalsIgnoreCase(r9)
            if (r9 != 0) goto L23
            goto Led
        L23:
            java.lang.String r9 = r5.f11247c
            if (r9 == 0) goto L30
            java.lang.CharSequence r9 = u4.AbstractC1776n.l0(r9)
            java.lang.String r9 = r9.toString()
            goto L31
        L30:
            r9 = r1
        L31:
            if (r9 != 0) goto L34
            r9 = r2
        L34:
            int r0 = r9.length()
            if (r0 <= 0) goto L42
            boolean r7 = r9.equalsIgnoreCase(r7)
            if (r7 != 0) goto L42
            goto Led
        L42:
            java.lang.String r7 = r5.a
            if (r7 == 0) goto L4f
            java.lang.CharSequence r7 = u4.AbstractC1776n.l0(r7)
            java.lang.String r7 = r7.toString()
            goto L50
        L4f:
            r7 = r1
        L50:
            if (r7 != 0) goto L53
            r7 = r2
        L53:
            int r9 = r7.length()
            if (r9 <= 0) goto L86
            java.util.Locale r9 = java.util.Locale.ROOT
            java.lang.String r6 = r6.toLowerCase(r9)
            java.lang.String r0 = "toLowerCase(...)"
            m4.AbstractC1276k.e(r6, r0)
            java.lang.String r7 = r7.toLowerCase(r9)
            m4.AbstractC1276k.e(r7, r0)
            java.lang.String r9 = "*"
            boolean r9 = r7.equals(r9)
            if (r9 == 0) goto L74
            goto L86
        L74:
            boolean r9 = r6.equals(r7)
            if (r9 != 0) goto L86
            java.lang.String r9 = "."
            java.lang.String r7 = r9.concat(r7)
            boolean r6 = u4.u.w(r6, r7, r4)
            if (r6 == 0) goto Led
        L86:
            java.lang.String r6 = r5.f11248d
            if (r6 == 0) goto L93
            java.lang.CharSequence r6 = u4.AbstractC1776n.l0(r6)
            java.lang.String r6 = r6.toString()
            goto L94
        L93:
            r6 = r1
        L94:
            if (r6 != 0) goto L97
            r6 = r2
        L97:
            int r7 = r6.length()
            if (r7 <= 0) goto La4
            boolean r6 = r6.equalsIgnoreCase(r8)
            if (r6 != 0) goto La4
            goto Led
        La4:
            java.lang.String r5 = r5.f11249e
            if (r5 == 0) goto Lb0
            java.lang.CharSequence r5 = u4.AbstractC1776n.l0(r5)
            java.lang.String r1 = r5.toString()
        Lb0:
            if (r1 != 0) goto Lb3
            goto Lb4
        Lb3:
            r2 = r1
        Lb4:
            int r5 = r2.length()
            if (r5 <= 0) goto Lee
            r5 = 66
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r2, r5)     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r6 = "compile(...)"
            m4.AbstractC1276k.e(r5, r6)     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r6 = "input"
            m4.AbstractC1276k.f(r8, r6)     // Catch: java.lang.Throwable -> Ld7
            java.util.regex.Matcher r5 = r5.matcher(r8)     // Catch: java.lang.Throwable -> Ld7
            boolean r5 = r5.find()     // Catch: java.lang.Throwable -> Ld7
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> Ld7
            goto Ldc
        Ld7:
            r5 = move-exception
            X3.k r5 = X3.a.b(r5)
        Ldc:
            java.lang.Throwable r6 = X3.l.a(r5)
            if (r6 != 0) goto Le3
            goto Le5
        Le3:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
        Le5:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto Lee
        Led:
            return r4
        Lee:
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: I2.A.a(com.bot.core.model.ReasoningRule, java.lang.String, java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    public static boolean e(String str) {
        AbstractC1276k.f(str, "modelId");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        AbstractC1276k.e(lowerCase, "toLowerCase(...)");
        return ((!u4.u.D(lowerCase, "o", false) && !AbstractC1776n.G(lowerCase, "o1", false) && !AbstractC1776n.G(lowerCase, "o3", false)) || AbstractC1776n.G(lowerCase, "o1-mini", false) || AbstractC1776n.G(lowerCase, "o1-preview", false)) ? false : true;
    }

    public final ReasoningConfig b(String str) {
        Object b5;
        try {
            b5 = (ReasoningConfig) this.f2607c.a(str, ReasoningConfig.Companion.serializer());
        } catch (Throwable th) {
            b5 = X3.a.b(th);
        }
        if (X3.l.a(b5) != null) {
            i5.a.a.getClass();
            N.z(new Object[0]);
            b5 = null;
        }
        return (ReasoningConfig) b5;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(d4.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof I2.z
            if (r0 == 0) goto L13
            r0 = r5
            I2.z r0 = (I2.z) r0
            int r1 = r0.f2703i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2703i = r1
            goto L18
        L13:
            I2.z r0 = new I2.z
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f2701g
            int r1 = r0.f2703i
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            X3.a.e(r5)
            goto L3d
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2d:
            X3.a.e(r5)
            r0.f2703i = r2
            F2.i r5 = r4.a
            java.lang.Object r5 = r5.e(r0)
            c4.a r0 = c4.EnumC0927a.f11114c
            if (r5 != r0) goto L3d
            return r0
        L3d:
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L44
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L44:
            com.bot.core.model.ReasoningConfig r0 = r4.b(r5)
            if (r0 != 0) goto L4d
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L4d:
            A4.g0 r1 = r4.f2608d
            r1.getClass()
            r2 = 0
            r1.l(r2, r0)
            com.tencent.mmkv.MMKV r0 = r4.f2606b
            java.lang.String r1 = "reasoning_config_json"
            r0.encode(r1, r5)
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: I2.A.c(d4.c):java.lang.Object");
    }

    public final ReasoningRule d(String str, String str2, String str3, String str4) {
        Object b5;
        String lowerCase;
        Object obj;
        AbstractC1276k.f(str, "modelId");
        AbstractC1276k.f(str3, "apiSchema");
        Object obj2 = null;
        String obj3 = str2 != null ? AbstractC1776n.l0(str2).toString() : null;
        String str5 = FlexmarkHtmlConverter.DEFAULT_NODE;
        if (obj3 == null) {
            obj3 = FlexmarkHtmlConverter.DEFAULT_NODE;
        }
        if (AbstractC1776n.Q(obj3)) {
            lowerCase = FlexmarkHtmlConverter.DEFAULT_NODE;
        } else {
            try {
                b5 = new URI(u4.u.D(obj3, "http", false) ? obj3 : "https://".concat(obj3)).getHost();
                if (b5 == null) {
                    b5 = FlexmarkHtmlConverter.DEFAULT_NODE;
                }
            } catch (Throwable th) {
                b5 = X3.a.b(th);
            }
            if (X3.l.a(b5) != null) {
                String f02 = AbstractC1776n.f0(obj3, "://");
                int O5 = AbstractC1776n.O(f02, "/", 0, false, 6);
                if (O5 != -1) {
                    f02 = f02.substring(0, O5);
                    AbstractC1276k.e(f02, "substring(...)");
                }
                b5 = AbstractC1776n.l0(f02).toString();
            }
            lowerCase = ((String) b5).toLowerCase(Locale.ROOT);
            AbstractC1276k.e(lowerCase, "toLowerCase(...)");
        }
        String obj4 = AbstractC1776n.l0(str3).toString();
        if (AbstractC1776n.Q(obj4)) {
            obj4 = "openai";
        }
        String obj5 = str4 != null ? AbstractC1776n.l0(str4).toString() : null;
        if (obj5 != null) {
            str5 = obj5;
        }
        ReasoningConfig reasoningConfig = (ReasoningConfig) this.f2608d.getValue();
        List list = reasoningConfig.f11242c;
        List list2 = reasoningConfig.f11241b;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (a((ReasoningRule) obj, lowerCase, obj4, str, str5)) {
                break;
            }
        }
        ReasoningRule reasoningRule = (ReasoningRule) obj;
        if (reasoningRule != null) {
            return reasoningRule;
        }
        Iterator it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (a((ReasoningRule) next, lowerCase, obj4, str, str5)) {
                obj2 = next;
                break;
            }
        }
        ReasoningRule reasoningRule2 = (ReasoningRule) obj2;
        if (reasoningRule2 != null) {
            return reasoningRule2;
        }
        if (!reasoningConfig.f11242c.isEmpty() || !list2.isEmpty()) {
            return new ReasoningRule(D2.b.f1267e);
        }
        int hashCode = obj4.hashCode();
        if (hashCode != -2131439764) {
            if (hashCode != -1240244679) {
                if (hashCode == -1010579470 && obj4.equals("openai")) {
                    return new ReasoningRule(D2.b.f1269g);
                }
            } else if (obj4.equals("google")) {
                return new ReasoningRule(D2.b.f1271i);
            }
        } else if (obj4.equals("anthropic")) {
            return new ReasoningRule(D2.b.f1270h);
        }
        return new ReasoningRule(D2.b.f1267e);
    }
}
