package com.vladsch.flexmark.util.misc;

import F0.F;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class TemplateUtil {
    public static final Resolver NULL_RESOLVER = new F(8);

    /* loaded from: classes.dex */
    public interface Resolver {
        String resolve(String[] strArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$static$0(String[] strArr) {
        return null;
    }

    public static String resolveRefs(CharSequence charSequence, Pattern pattern, Resolver resolver) {
        if (charSequence == null) {
            return FlexmarkHtmlConverter.DEFAULT_NODE;
        }
        Matcher matcher = pattern.matcher(charSequence);
        if (!matcher.find()) {
            return charSequence.toString();
        }
        StringBuffer stringBuffer = new StringBuffer();
        do {
            int groupCount = matcher.groupCount() + 1;
            String[] strArr = new String[groupCount];
            for (int i6 = 0; i6 < groupCount; i6++) {
                strArr[i6] = matcher.group(i6);
            }
            String resolve = resolver.resolve(strArr);
            matcher.appendReplacement(stringBuffer, resolve == null ? FlexmarkHtmlConverter.DEFAULT_NODE : resolve.replace("\\", "\\\\").replace("$", "\\$"));
        } while (matcher.find());
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* loaded from: classes.dex */
    public static class MappedResolver implements Resolver {
        protected final Map<String, String> resolved;

        public MappedResolver(Map<String, String> map) {
            this.resolved = map;
        }

        public Map<String, String> getMMap() {
            return this.resolved;
        }

        @Override // com.vladsch.flexmark.util.misc.TemplateUtil.Resolver
        public String resolve(String[] strArr) {
            if (strArr.length > 2) {
                return null;
            }
            return this.resolved.get(strArr[1]);
        }

        public MappedResolver set(String str, String str2) {
            this.resolved.put(str, str2);
            return this;
        }

        public MappedResolver() {
            this(new HashMap());
        }
    }
}
