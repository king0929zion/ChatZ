package com.vladsch.flexmark.util.options;

import F0.F;
import java.text.MessageFormat;

/* loaded from: classes.dex */
public interface MessageProvider {
    public static final MessageProvider DEFAULT = new F(9);

    static /* synthetic */ String d(String str, String str2, Object[] objArr) {
        return lambda$static$0(str, str2, objArr);
    }

    static /* synthetic */ String lambda$static$0(String str, String str2, Object[] objArr) {
        return (objArr.length <= 0 || str2.indexOf(123) < 0) ? str2 : MessageFormat.format(str2, objArr);
    }

    String message(String str, String str2, Object... objArr);
}
