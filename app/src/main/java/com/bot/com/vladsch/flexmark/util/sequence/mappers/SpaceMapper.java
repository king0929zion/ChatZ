package com.vladsch.flexmark.util.sequence.mappers;

import com.vladsch.flexmark.util.misc.CharPredicate;
import com.vladsch.flexmark.util.sequence.SequenceUtils;

/* loaded from: classes.dex */
public class SpaceMapper {
    public static final CharMapper toNonBreakSpace = new ToNonBreakSpace();
    public static final CharMapper fromNonBreakSpace = new FromNonBreakSpace();

    /* loaded from: classes.dex */
    public static class FromNonBreakSpace implements CharMapper {
        @Override // com.vladsch.flexmark.util.sequence.mappers.CharMapper
        public char map(char c6) {
            return c6 == 160 ? SequenceUtils.SPC : c6;
        }
    }

    /* loaded from: classes.dex */
    public static class FromPredicate implements CharMapper {
        final CharPredicate myPredicate;

        public FromPredicate(CharPredicate charPredicate) {
            this.myPredicate = charPredicate;
        }

        @Override // com.vladsch.flexmark.util.sequence.mappers.CharMapper
        public char map(char c6) {
            return this.myPredicate.test(c6) ? SequenceUtils.SPC : c6;
        }
    }

    /* loaded from: classes.dex */
    public static class ToNonBreakSpace implements CharMapper {
        @Override // com.vladsch.flexmark.util.sequence.mappers.CharMapper
        public char map(char c6) {
            return c6 == ' ' ? SequenceUtils.NBSP : c6;
        }
    }

    public static boolean areEquivalent(char c6, char c7) {
        if (c6 == c7) {
            return true;
        }
        if (c6 == ' ' && c7 == 160) {
            return true;
        }
        return c7 == ' ' && c6 == 160;
    }

    public static CharMapper toSpaces(CharPredicate charPredicate) {
        return new FromPredicate(charPredicate);
    }
}
