package Y2;

import com.bot.core.database.dao.LLMProviderDao;
import com.bot.core.database.entity.LLMProviderEntity;
import java.util.List;

/* renamed from: Y2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0720i extends H2.g {
    public final LLMProviderDao a;

    public C0720i(LLMProviderDao lLMProviderDao) {
        this.a = lLMProviderDao;
    }

    public static List f() {
        return Y4.l.I(new LLMProviderEntity("qwen", "qwen", "Qwen", "https://dashscope.aliyuncs.com/compatible-mode/v1", "openai", null, null, null, null, true, true, null, null, 0L, 4576, null), new LLMProviderEntity("doubao", "doubao", "Doubao", "https://ark.cn-beijing.volces.com/api/v3", "openai", null, null, null, null, true, true, null, null, 1L, 4576, null), new LLMProviderEntity("openai", "openai", "OpenAI", "https://api.openai.com/v1", "openai", null, null, null, null, true, true, null, null, 2L, 4576, null), new LLMProviderEntity("anthropic", "anthropic", "Anthropic", "https://api.anthropic.com/v1", "anthropic", null, null, null, null, true, true, null, null, 3L, 4576, null), new LLMProviderEntity("google", "google", "Google", "https://generativelanguage.googleapis.com/v1beta", "google", null, "ai_studio", null, null, true, true, null, null, 4L, 4512, null), new LLMProviderEntity("ollama", "ollama", "Ollama", "http://localhost:11434/v1", "openai", null, null, null, null, true, true, null, null, 5L, 4576, null), new LLMProviderEntity("xiaomimimo", "xiaomimimo", "XiaoMiMiMo", "https://api.xiaomimimo.com/v1", "openai", null, null, null, null, true, true, null, null, 6L, 4576, null), new LLMProviderEntity("deepseek", "deepseek", "DeepSeek", "https://api.deepseek.com/v1", "openai", null, null, null, null, true, true, null, null, 7L, 4576, null), new LLMProviderEntity("yi", "yi", "Yi", "https://api.01.ai/v1", "openai", null, null, null, null, true, true, null, null, 8L, 4576, null), new LLMProviderEntity("groq", "groq", "Groq", "https://api.groq.com/openai/v1", "openai", null, null, null, null, true, true, null, null, 9L, 4576, null), new LLMProviderEntity("openrouter", "openrouter", "OpenRouter", "https://openrouter.ai/api/v1", "openai", null, null, null, null, true, true, null, null, 10L, 4576, null), new LLMProviderEntity("siliconflow", "siliconflow", "SiliconFlow", "https://api.siliconflow.cn/v1", "openai", null, null, null, null, true, true, null, null, 11L, 4576, null), new LLMProviderEntity("zhipu", "zhipu", "Zhipu", "https://open.bigmodel.cn/api/paas/v4", "openai", null, null, null, null, true, true, null, null, 12L, 4576, null), new LLMProviderEntity("grok", "grok", "Grok", "https://api.x.ai/v1", "openai", null, null, null, null, true, true, null, null, 13L, 4576, null), new LLMProviderEntity("minimax", "minimax", "MiniMax", "https://api.minimax.com/anthropic", "anthropic", null, null, null, null, true, true, null, null, 14L, 4576, null));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 com.bot.core.model.LLMProvider, still in use, count: 3, list:
          (r0v0 com.bot.core.model.LLMProvider) from 0x0040: MOVE (r16v0 com.bot.core.model.LLMProvider) = (r0v0 com.bot.core.model.LLMProvider)
          (r0v0 com.bot.core.model.LLMProvider) from 0x0066: MOVE (r16v4 com.bot.core.model.LLMProvider) = (r0v0 com.bot.core.model.LLMProvider)
          (r0v0 com.bot.core.model.LLMProvider) from 0x004a: MOVE (r16v6 com.bot.core.model.LLMProvider) = (r0v0 com.bot.core.model.LLMProvider)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:56)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    public static com.bot.core.model.LLMProvider j(com.bot.core.database.entity.LLMProviderEntity r19) {
        /*
            com.bot.core.model.LLMProvider r0 = new com.bot.core.model.LLMProvider
            java.lang.String r1 = r19.getId()
            java.lang.String r2 = r19.getProviderType()
            java.lang.String r3 = r19.getName()
            java.lang.String r4 = r19.getBaseUrl()
            java.lang.String r5 = r19.getApiSchema()
            java.lang.String r6 = r19.getOpenAiApiMode()
            java.lang.String r7 = r19.getGoogleApiMode()
            java.lang.String r8 = r19.getGoogleProjectId()
            java.lang.String r9 = r19.getGoogleLocation()
            boolean r10 = r19.isBuiltin()
            boolean r11 = r19.isEnabled()
            java.lang.String r12 = r19.getApiKey()
            java.lang.String r13 = r19.getEnabledModelIds()
            Y3.v r14 = Y3.v.f9812c
            if (r13 == 0) goto L40
            boolean r15 = u4.AbstractC1776n.Q(r13)
            if (r15 == 0) goto L45
        L40:
            r16 = r0
            r17 = r1
            goto L60
        L45:
            N4.b r15 = N4.c.f3882d     // Catch: java.lang.Exception -> L66
            r15.getClass()     // Catch: java.lang.Exception -> L66
            r16 = r0
            M4.c r0 = new M4.c     // Catch: java.lang.Exception -> L63
            r17 = r1
            M4.n0 r1 = M4.n0.a     // Catch: java.lang.Exception -> L60
            r18 = r2
            r2 = 0
            r0.<init>(r1, r2)     // Catch: java.lang.Exception -> L69
            java.lang.Object r0 = r15.a(r13, r0)     // Catch: java.lang.Exception -> L69
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Exception -> L69
            r13 = r0
            goto L6a
        L60:
            r18 = r2
            goto L69
        L63:
            r17 = r1
            goto L60
        L66:
            r16 = r0
            goto L63
        L69:
            r13 = r14
        L6a:
            long r14 = r19.getSortOrder()
            r0 = r16
            r1 = r17
            r2 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.C0720i.j(com.bot.core.database.entity.LLMProviderEntity):com.bot.core.model.LLMProvider");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x004a, code lost:
    
        if (r10 == r7) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(d4.c r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof Y2.C0712a
            if (r0 == 0) goto L13
            r0 = r10
            Y2.a r0 = (Y2.C0712a) r0
            int r1 = r0.f9704i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9704i = r1
            goto L18
        L13:
            Y2.a r0 = new Y2.a
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.f9702g
            int r1 = r0.f9704i
            r2 = 3
            r3 = 2
            r4 = 1
            X3.y r5 = X3.y.a
            com.bot.core.database.dao.LLMProviderDao r6 = r9.a
            c4.a r7 = c4.EnumC0927a.f11114c
            if (r1 == 0) goto L41
            if (r1 == r4) goto L3d
            if (r1 == r3) goto L39
            if (r1 != r2) goto L31
            X3.a.e(r10)
            return r5
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L39:
            X3.a.e(r10)
            return r5
        L3d:
            X3.a.e(r10)
            goto L4e
        L41:
            X3.a.e(r10)
            r0.f9704i = r4
            java.lang.Object r10 = r6.getAll(r0)
            if (r10 != r7) goto L4e
            goto Lc0
        L4e:
            java.util.List r10 = (java.util.List) r10
            boolean r1 = r10.isEmpty()
            if (r1 == 0) goto L63
            java.util.List r10 = f()
            r0.f9704i = r3
            java.lang.Object r10 = r6.upsertAll(r10, r0)
            if (r10 != r7) goto Lc1
            goto Lc0
        L63:
            java.util.ArrayList r1 = new java.util.ArrayList
            r3 = 10
            int r3 = Y3.n.Z(r10, r3)
            r1.<init>(r3)
            java.util.Iterator r10 = r10.iterator()
        L72:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L86
            java.lang.Object r3 = r10.next()
            com.bot.core.database.entity.LLMProviderEntity r3 = (com.bot.core.database.entity.LLMProviderEntity) r3
            java.lang.String r3 = r3.getId()
            r1.add(r3)
            goto L72
        L86:
            java.util.Set r10 = Y3.m.N0(r1)
            java.util.List r1 = f()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
        L97:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto Lb2
            java.lang.Object r4 = r1.next()
            r8 = r4
            com.bot.core.database.entity.LLMProviderEntity r8 = (com.bot.core.database.entity.LLMProviderEntity) r8
            java.lang.String r8 = r8.getId()
            boolean r8 = r10.contains(r8)
            if (r8 != 0) goto L97
            r3.add(r4)
            goto L97
        Lb2:
            boolean r10 = r3.isEmpty()
            if (r10 != 0) goto Lc1
            r0.f9704i = r2
            java.lang.Object r10 = r6.upsertAll(r3, r0)
            if (r10 != r7) goto Lc1
        Lc0:
            return r7
        Lc1:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.C0720i.g(d4.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        if (r8 != r5) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0044, code lost:
    
        if (g(r0) == r5) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.String r7, d4.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof Y2.C0713b
            if (r0 == 0) goto L13
            r0 = r8
            Y2.b r0 = (Y2.C0713b) r0
            int r1 = r0.f9708j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9708j = r1
            goto L18
        L13:
            Y2.b r0 = new Y2.b
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f9706h
            int r1 = r0.f9708j
            r2 = 0
            r3 = 2
            r4 = 1
            c4.a r5 = c4.EnumC0927a.f11114c
            if (r1 == 0) goto L39
            if (r1 == r4) goto L33
            if (r1 != r3) goto L2b
            X3.a.e(r8)
            goto L54
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            java.lang.String r7 = r0.f9705g
            X3.a.e(r8)
            goto L47
        L39:
            X3.a.e(r8)
            r0.f9705g = r7
            r0.f9708j = r4
            java.lang.Object r8 = r6.g(r0)
            if (r8 != r5) goto L47
            goto L53
        L47:
            r0.f9705g = r2
            r0.f9708j = r3
            com.bot.core.database.dao.LLMProviderDao r8 = r6.a
            java.lang.Object r8 = r8.getById(r7, r0)
            if (r8 != r5) goto L54
        L53:
            return r5
        L54:
            com.bot.core.database.entity.LLMProviderEntity r8 = (com.bot.core.database.entity.LLMProviderEntity) r8
            if (r8 == 0) goto L5d
            com.bot.core.model.LLMProvider r7 = j(r8)
            return r7
        L5d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.C0720i.h(java.lang.String, d4.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        if (r6 != r4) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003f, code lost:
    
        if (g(r0) == r4) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable i(d4.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof Y2.C0714c
            if (r0 == 0) goto L13
            r0 = r6
            Y2.c r0 = (Y2.C0714c) r0
            int r1 = r0.f9711i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9711i = r1
            goto L18
        L13:
            Y2.c r0 = new Y2.c
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f9709g
            int r1 = r0.f9711i
            r2 = 2
            r3 = 1
            c4.a r4 = c4.EnumC0927a.f11114c
            if (r1 == 0) goto L36
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2a
            X3.a.e(r6)
            goto L4d
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            X3.a.e(r6)
            goto L42
        L36:
            X3.a.e(r6)
            r0.f9711i = r3
            java.lang.Object r6 = r5.g(r0)
            if (r6 != r4) goto L42
            goto L4c
        L42:
            r0.f9711i = r2
            com.bot.core.database.dao.LLMProviderDao r6 = r5.a
            java.lang.Object r6 = r6.getAll(r0)
            if (r6 != r4) goto L4d
        L4c:
            return r4
        L4d:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = Y3.n.Z(r6, r1)
            r0.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
        L5e:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L72
            java.lang.Object r1 = r6.next()
            com.bot.core.database.entity.LLMProviderEntity r1 = (com.bot.core.database.entity.LLMProviderEntity) r1
            com.bot.core.model.LLMProvider r1 = j(r1)
            r0.add(r1)
            goto L5e
        L72:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.C0720i.i(d4.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.util.ArrayList r6, d4.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof Y2.C0719h
            if (r0 == 0) goto L13
            r0 = r7
            Y2.h r0 = (Y2.C0719h) r0
            int r1 = r0.f9728j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9728j = r1
            goto L18
        L13:
            Y2.h r0 = new Y2.h
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f9726h
            int r1 = r0.f9728j
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            java.util.Iterator r6 = r0.f9725g
            X3.a.e(r7)
            goto L36
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            X3.a.e(r7)
            java.util.Iterator r6 = r6.iterator()
        L36:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L5d
            java.lang.Object r7 = r6.next()
            X3.i r7 = (X3.i) r7
            java.lang.Object r1 = r7.f9393c
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r7 = r7.f9394e
            java.lang.Number r7 = (java.lang.Number) r7
            long r3 = r7.longValue()
            r0.f9725g = r6
            r0.f9728j = r2
            com.bot.core.database.dao.LLMProviderDao r7 = r5.a
            java.lang.Object r7 = r7.updateSortOrder(r1, r3, r0)
            c4.a r1 = c4.EnumC0927a.f11114c
            if (r7 != r1) goto L36
            return r1
        L5d:
            X3.y r6 = X3.y.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.C0720i.k(java.util.ArrayList, d4.c):java.lang.Object");
    }
}
