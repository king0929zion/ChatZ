package com.vladsch.flexmark.util.format;

import com.vladsch.flexmark.util.misc.CharPredicate;

/* loaded from: classes.dex */
public interface CharWidthProvider {
    public static final CharWidthProvider NULL = new CharWidthProvider() { // from class: com.vladsch.flexmark.util.format.CharWidthProvider.1
        @Override // com.vladsch.flexmark.util.format.CharWidthProvider
        public int getCharWidth(char c6) {
            return 1;
        }

        @Override // com.vladsch.flexmark.util.format.CharWidthProvider
        public int getSpaceWidth() {
            return 1;
        }
    };

    int getCharWidth(char c6);

    int getSpaceWidth();

    default int getStringWidth(CharSequence charSequence) {
        return getStringWidth(charSequence, CharPredicate.NONE);
    }

    default int getStringWidth(CharSequence charSequence, CharPredicate charPredicate) {
        int length = charSequence.length();
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7++) {
            char charAt = charSequence.charAt(i7);
            if (!charPredicate.test(charAt)) {
                i6 = getCharWidth(charAt) + i6;
            }
        }
        return i6;
    }
}
