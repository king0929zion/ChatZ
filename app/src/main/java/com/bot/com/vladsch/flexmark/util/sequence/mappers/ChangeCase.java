package com.vladsch.flexmark.util.sequence.mappers;

/* loaded from: classes.dex */
public class ChangeCase {
    public static final CharMapper toUpperCase = new ToUpperCase();
    public static final CharMapper toLowerCase = new ToLowerCase();

    /* loaded from: classes.dex */
    public static class ToLowerCase implements CharMapper {
        @Override // com.vladsch.flexmark.util.sequence.mappers.CharMapper
        public char map(char c6) {
            return Character.isUpperCase(c6) ? Character.toLowerCase(c6) : c6;
        }
    }

    /* loaded from: classes.dex */
    public static class ToUpperCase implements CharMapper {
        @Override // com.vladsch.flexmark.util.sequence.mappers.CharMapper
        public char map(char c6) {
            return Character.isLowerCase(c6) ? Character.toUpperCase(c6) : c6;
        }
    }
}
