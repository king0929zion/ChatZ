package org.jsoup.internal;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import java.util.Locale;

/* loaded from: classes.dex */
public final class Normalizer {
    public static String lowerCase(String str) {
        return str != null ? str.toLowerCase(Locale.ENGLISH) : FlexmarkHtmlConverter.DEFAULT_NODE;
    }

    public static String normalize(String str) {
        return lowerCase(str).trim();
    }

    public static String normalize(String str, boolean z5) {
        return z5 ? lowerCase(str) : normalize(str);
    }
}
