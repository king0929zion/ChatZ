package com.vladsch.flexmark.util.sequence.mappers;

import com.vladsch.flexmark.util.data.DataHolder;
import com.vladsch.flexmark.util.misc.CharPredicate;
import com.vladsch.flexmark.util.sequence.BasedSequence;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public class SpecialLeadInCharsHandler implements SpecialLeadInHandler {
    final CharPredicate predicate;

    public SpecialLeadInCharsHandler(CharPredicate charPredicate) {
        this.predicate = charPredicate;
    }

    public static SpecialLeadInCharsHandler create(char c6) {
        return new SpecialLeadInCharsHandler(CharPredicate.anyOf(c6));
    }

    @Override // com.vladsch.flexmark.util.sequence.mappers.SpecialLeadInHandler
    public boolean escape(BasedSequence basedSequence, DataHolder dataHolder, Consumer<CharSequence> consumer) {
        if (basedSequence.length() != 1 || !this.predicate.test(basedSequence.charAt(0))) {
            return false;
        }
        consumer.accept("\\");
        consumer.accept(basedSequence);
        return true;
    }

    @Override // com.vladsch.flexmark.util.sequence.mappers.SpecialLeadInHandler
    public boolean unEscape(BasedSequence basedSequence, DataHolder dataHolder, Consumer<CharSequence> consumer) {
        if (basedSequence.length() != 2 || basedSequence.charAt(0) != '\\' || !this.predicate.test(basedSequence.charAt(1))) {
            return false;
        }
        consumer.accept(basedSequence.subSequence(1));
        return true;
    }

    public static SpecialLeadInCharsHandler create(CharSequence charSequence) {
        return new SpecialLeadInCharsHandler(CharPredicate.anyOf(charSequence));
    }
}
