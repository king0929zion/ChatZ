package org.jsoup.parser;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class ParseErrorList extends ArrayList<ParseError> {
    private static final int INITIAL_CAPACITY = 16;
    private final int initialCapacity;
    private final int maxSize;

    public ParseErrorList(int i6, int i7) {
        super(i6);
        this.initialCapacity = i6;
        this.maxSize = i7;
    }

    public static ParseErrorList noTracking() {
        return new ParseErrorList(0, 0);
    }

    public static ParseErrorList tracking(int i6) {
        return new ParseErrorList(16, i6);
    }

    public boolean canAddError() {
        return size() < this.maxSize;
    }

    @Override // java.util.ArrayList
    public Object clone() {
        return super.clone();
    }

    public int getMaxSize() {
        return this.maxSize;
    }

    public ParseErrorList(ParseErrorList parseErrorList) {
        this(parseErrorList.initialCapacity, parseErrorList.maxSize);
    }
}
