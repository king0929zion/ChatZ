package com.vladsch.flexmark.util.options;

/* loaded from: classes.dex */
public enum ParsedOptionStatus {
    VALID(0),
    IGNORED(1),
    WEAK_WARNING(2),
    WARNING(3),
    ERROR(4);

    private final int level;

    ParsedOptionStatus(int i6) {
        this.level = i6;
    }

    public ParsedOptionStatus escalate(ParsedOptionStatus parsedOptionStatus) {
        return this.level < parsedOptionStatus.level ? parsedOptionStatus : this;
    }
}
