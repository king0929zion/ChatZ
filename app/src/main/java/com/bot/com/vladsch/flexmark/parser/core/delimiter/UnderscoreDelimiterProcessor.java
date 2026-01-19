package com.vladsch.flexmark.parser.core.delimiter;

/* loaded from: classes.dex */
public class UnderscoreDelimiterProcessor extends EmphasisDelimiterProcessor {
    public UnderscoreDelimiterProcessor(boolean z5) {
        super('_', z5);
    }

    @Override // com.vladsch.flexmark.parser.core.delimiter.EmphasisDelimiterProcessor, com.vladsch.flexmark.parser.delimiter.DelimiterProcessor
    public boolean canBeCloser(String str, String str2, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        if (z6) {
            return !z5 || z8;
        }
        return false;
    }

    @Override // com.vladsch.flexmark.parser.core.delimiter.EmphasisDelimiterProcessor, com.vladsch.flexmark.parser.delimiter.DelimiterProcessor
    public boolean canBeOpener(String str, String str2, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        if (z5) {
            return !z6 || z7;
        }
        return false;
    }
}
