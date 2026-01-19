package com.vladsch.flexmark.util.sequence;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import java.util.Collection;
import java.util.function.BiConsumer;
import java.util.function.Function;

/* loaded from: classes.dex */
public class PlaceholderReplacer {
    public static <T> void replaceAll(Collection<T> collection, Function<String, String> function, char c6, char c7, Function<T, String> function2, BiConsumer<T, String> biConsumer) {
        if (collection.isEmpty()) {
            return;
        }
        StringBuilder sb = null;
        for (T t5 : collection) {
            String apply = function2.apply(t5);
            int length = apply.length();
            int i6 = 0;
            StringBuilder sb2 = null;
            while (true) {
                if (i6 >= length) {
                    break;
                }
                if (sb == null) {
                    int indexOf = apply.indexOf(c6, i6);
                    if (indexOf != -1) {
                        sb = new StringBuilder();
                        if (i6 < indexOf) {
                            if (sb2 == null) {
                                sb2 = new StringBuilder();
                            }
                            sb2.append(apply.substring(i6, indexOf));
                        }
                        i6 = indexOf + 1;
                        if (i6 >= length && sb2 == null) {
                            biConsumer.accept(t5, FlexmarkHtmlConverter.DEFAULT_NODE);
                        }
                    } else if (i6 > 0) {
                        if (sb2 != null) {
                            sb2.append(apply.substring(i6));
                        } else {
                            biConsumer.accept(t5, apply.substring(i6));
                        }
                    }
                } else {
                    int indexOf2 = apply.indexOf(c7, i6);
                    if (indexOf2 == -1) {
                        sb.append(apply.substring(i6));
                        if (sb2 == null) {
                            biConsumer.accept(t5, FlexmarkHtmlConverter.DEFAULT_NODE);
                        }
                        i6 = length;
                    } else {
                        sb.append(apply.substring(i6, indexOf2));
                        int i7 = indexOf2 + 1;
                        String sb3 = sb.toString();
                        String apply2 = function.apply(sb3);
                        if (apply2 == null) {
                            apply2 = c6 + sb3 + c7;
                        }
                        if (sb2 == null) {
                            sb2 = new StringBuilder();
                        }
                        sb2.append(apply2);
                        sb = null;
                        i6 = i7;
                    }
                }
            }
            if (sb2 != null) {
                biConsumer.accept(t5, sb2.toString());
            }
        }
    }
}
