package com.vladsch.flexmark.util.options;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.util.misc.Pair;
import com.vladsch.flexmark.util.sequence.BasedSequence;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class BooleanOptionParser<T> implements OptionParser<T> {
    public static final String KEY_OPTION_0_PARAMETERS_1_IGNORED = "options.parser.boolean-option.ignored";
    public static final String OPTION_0_PARAMETERS_1_IGNORED = "Option {0} does not have any parameters. {1} was ignored";
    private final String optionName;

    public BooleanOptionParser(String str) {
        this.optionName = str;
    }

    @Override // com.vladsch.flexmark.util.options.OptionParser
    public String getOptionName() {
        return this.optionName;
    }

    @Override // com.vladsch.flexmark.util.options.OptionParser
    public String getOptionText(T t5, T t6) {
        return isOptionSet(t5) ? (t6 == null || !isOptionSet(t6)) ? this.optionName : FlexmarkHtmlConverter.DEFAULT_NODE : FlexmarkHtmlConverter.DEFAULT_NODE;
    }

    public abstract boolean isOptionSet(T t5);

    @Override // com.vladsch.flexmark.util.options.OptionParser
    public Pair<T, List<ParsedOption<T>>> parseOption(BasedSequence basedSequence, T t5, MessageProvider messageProvider) {
        if (basedSequence.isEmpty()) {
            return new Pair<>(setOptions(t5), Collections.singletonList(new ParsedOption(basedSequence, this, ParsedOptionStatus.VALID)));
        }
        if (messageProvider == null) {
            messageProvider = MessageProvider.DEFAULT;
        }
        String message = messageProvider.message(KEY_OPTION_0_PARAMETERS_1_IGNORED, OPTION_0_PARAMETERS_1_IGNORED, this.optionName, basedSequence);
        T options = setOptions(t5);
        ParsedOptionStatus parsedOptionStatus = ParsedOptionStatus.IGNORED;
        return new Pair<>(options, Collections.singletonList(new ParsedOption(basedSequence, this, parsedOptionStatus, (List<ParserMessage>) Collections.singletonList(new ParserMessage(basedSequence, parsedOptionStatus, message)))));
    }

    public abstract T setOptions(T t5);
}
