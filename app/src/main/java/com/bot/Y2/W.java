package Y2;

import com.bot.core.database.dao.LLMSettingDao;
import com.bot.core.database.entity.LLMSettingEntity;
import com.bot.core.model.LLMSetting;

/* loaded from: classes.dex */
public final class W extends H2.g {
    private static final N Companion = new Object();
    public final LLMSettingDao a;

    public W(LLMSettingDao lLMSettingDao) {
        this.a = lLMSettingDao;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00db, code lost:
    
        if (r2.setActive(r1, r3) == r7) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c8, code lost:
    
        if (r1 == r7) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ba, code lost:
    
        if (r1 == r7) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a5, code lost:
    
        if (r1 == r7) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0071, code lost:
    
        if (r1 == r7) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0062, code lost:
    
        if (r1 == r7) goto L54;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0026. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(Y2.W r27, d4.c r28) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.W.f(Y2.W, d4.c):java.lang.Object");
    }

    public static LLMSettingEntity h(LLMSetting lLMSetting) {
        String str = lLMSetting.a;
        if (str == null) {
            str = "default";
        }
        return new LLMSettingEntity(str, lLMSetting.f11197b, lLMSetting.f11198c, lLMSetting.f11199d, lLMSetting.f11200e, lLMSetting.f11201f, lLMSetting.f11202g, lLMSetting.f11203h, lLMSetting.f11204i, lLMSetting.f11205j, lLMSetting.f11206k, lLMSetting.f11207l, lLMSetting.f11208m, lLMSetting.f11209n);
    }

    public static LLMSetting i(LLMSettingEntity lLMSettingEntity) {
        return new LLMSetting(lLMSettingEntity.getId(), lLMSettingEntity.getName(), lLMSettingEntity.getDefaultModel(), lLMSettingEntity.getPrompt(), lLMSettingEntity.getTemperature(), lLMSettingEntity.getTopP(), lLMSettingEntity.getMaxOutputTokens(), lLMSettingEntity.getReasoningBudgetTokens(), lLMSettingEntity.getCustomHeadersJson(), lLMSettingEntity.getCustomBodyJson(), lLMSettingEntity.getAvatarUri(), lLMSettingEntity.getCreatedAt(), lLMSettingEntity.getSortOrder(), lLMSettingEntity.isActive());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(com.bot.core.database.entity.LLMSettingEntity r25, d4.c r26) {
        /*
            r24 = this;
            r0 = r24
            r1 = r26
            boolean r2 = r1 instanceof Y2.S
            if (r2 == 0) goto L17
            r2 = r1
            Y2.S r2 = (Y2.S) r2
            int r3 = r2.f9676j
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f9676j = r3
            goto L1c
        L17:
            Y2.S r2 = new Y2.S
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f9674h
            int r3 = r2.f9676j
            r4 = 1
            if (r3 == 0) goto L33
            if (r3 != r4) goto L2b
            com.bot.core.database.entity.LLMSettingEntity r2 = r2.f9673g
            X3.a.e(r1)
            return r2
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L33:
            X3.a.e(r1)
            java.lang.String r1 = r25.getName()
            boolean r1 = u4.AbstractC1776n.Q(r1)
            if (r1 == 0) goto L6d
            r22 = 16381(0x3ffd, float:2.2955E-41)
            r23 = 0
            r6 = 0
            java.lang.String r7 = "Bot"
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r19 = 0
            r21 = 0
            r5 = r25
            com.bot.core.database.entity.LLMSettingEntity r1 = com.bot.core.database.entity.LLMSettingEntity.copy$default(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r19, r21, r22, r23)
            r2.f9673g = r1
            r2.f9676j = r4
            com.bot.core.database.dao.LLMSettingDao r3 = r0.a
            java.lang.Object r2 = r3.upsert(r1, r2)
            c4.a r3 = c4.EnumC0927a.f11114c
            if (r2 != r3) goto L6c
            return r3
        L6c:
            return r1
        L6d:
            return r25
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.W.g(com.bot.core.database.entity.LLMSettingEntity, d4.c):java.lang.Object");
    }
}
