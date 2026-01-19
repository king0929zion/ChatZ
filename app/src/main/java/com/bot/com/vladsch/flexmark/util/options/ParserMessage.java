package com.vladsch.flexmark.util.options;

import com.vladsch.flexmark.util.sequence.BasedSequence;

/* loaded from: classes.dex */
public class ParserMessage {
    protected final String message;
    protected final BasedSequence source;
    protected final ParsedOptionStatus status;

    public ParserMessage(BasedSequence basedSequence, ParsedOptionStatus parsedOptionStatus, String str) {
        this.source = basedSequence;
        this.status = parsedOptionStatus;
        this.message = str;
    }

    public String getMessage() {
        return this.message;
    }

    public BasedSequence getSource() {
        return this.source;
    }

    public ParsedOptionStatus getStatus() {
        return this.status;
    }
}
