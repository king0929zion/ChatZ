package com.vladsch.flexmark.util.sequence.mappers;

import com.vladsch.flexmark.util.sequence.SequenceUtils;

/* loaded from: classes.dex */
public class NullEncoder {
    public static final CharMapper encodeNull = new EncodeNull();
    public static final CharMapper decodeNull = new DecodeNull();

    /* loaded from: classes.dex */
    public static class DecodeNull implements CharMapper {
        @Override // com.vladsch.flexmark.util.sequence.mappers.CharMapper
        public char map(char c6) {
            if (c6 == 65533) {
                return (char) 0;
            }
            return c6;
        }
    }

    /* loaded from: classes.dex */
    public static class EncodeNull implements CharMapper {
        @Override // com.vladsch.flexmark.util.sequence.mappers.CharMapper
        public char map(char c6) {
            return c6 == 0 ? SequenceUtils.ENC_NUL : c6;
        }
    }
}
