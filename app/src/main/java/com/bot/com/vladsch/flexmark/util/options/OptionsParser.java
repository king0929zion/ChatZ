package com.vladsch.flexmark.util.options;

import com.vladsch.flexmark.util.misc.CharPredicate;
import com.vladsch.flexmark.util.misc.DelimitedBuilder;
import com.vladsch.flexmark.util.misc.Pair;
import com.vladsch.flexmark.util.sequence.BasedSequence;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class OptionsParser<T> implements OptionParser<T> {
    public static final String KEY_OPTION_0_DOES_NOT_MATCH = "options.parser.option.unknown";
    public static final String KEY_OPTION_0_IS_AMBIGUOUS = "options.parser.option.ambiguous";
    public static final String OPTION_0_DOES_NOT_MATCH = "Option {0} does not match any of: ";
    public static final String OPTION_0_IS_AMBIGUOUS = "Option {0} matches: ";
    private final String optionDelimiter;
    private final String optionName;
    private final String optionValueDelimiter;
    private final OptionParser<T>[] parseableOptions;

    public OptionsParser(String str, OptionParser<T>[] optionParserArr, char c6, char c7) {
        this.optionName = str;
        this.parseableOptions = optionParserArr;
        this.optionDelimiter = Character.toString(c6);
        this.optionValueDelimiter = Character.toString(c7);
    }

    public void appendOptionNames(DelimitedBuilder delimitedBuilder) {
        for (OptionParser<T> optionParser : this.parseableOptions) {
            delimitedBuilder.append(optionParser.getOptionName()).mark();
        }
    }

    @Override // com.vladsch.flexmark.util.options.OptionParser
    public String getOptionName() {
        return this.optionName;
    }

    @Override // com.vladsch.flexmark.util.options.OptionParser
    public String getOptionText(T t5, T t6) {
        DelimitedBuilder delimitedBuilder = new DelimitedBuilder(String.valueOf(this.optionDelimiter));
        for (OptionParser<T> optionParser : this.parseableOptions) {
            String trim = optionParser.getOptionText(t5, t6).trim();
            if (!trim.isEmpty()) {
                delimitedBuilder.append(trim).mark();
            }
        }
        return delimitedBuilder.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [com.vladsch.flexmark.util.options.OptionParser] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2, types: [com.vladsch.flexmark.util.misc.DelimitedBuilder] */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    @Override // com.vladsch.flexmark.util.options.OptionParser
    public Pair<T, List<ParsedOption<T>>> parseOption(BasedSequence basedSequence, T t5, MessageProvider messageProvider) {
        BasedSequence basedSequence2;
        OptionParser<T> optionParser;
        DelimitedBuilder delimitedBuilder;
        OptionsParser<T> optionsParser = this;
        int i6 = 0;
        CharPredicate charPredicate = null;
        BasedSequence[] split = basedSequence.split(optionsParser.optionDelimiter, 0, 6, (CharPredicate) null);
        MessageProvider messageProvider2 = messageProvider == null ? MessageProvider.DEFAULT : messageProvider;
        ArrayList arrayList = new ArrayList(split.length);
        int length = split.length;
        T t6 = t5;
        int i7 = 0;
        while (i7 < length) {
            BasedSequence basedSequence3 = split[i7];
            BasedSequence[] split2 = basedSequence3.split(optionsParser.optionValueDelimiter, 2, 4, charPredicate);
            if (split2.length != 0) {
                BasedSequence basedSequence4 = split2[i6];
                BasedSequence subSequence = split2.length > 1 ? split2[1] : basedSequence4.subSequence(basedSequence4.length(), basedSequence4.length());
                OptionParser<T>[] optionParserArr = optionsParser.parseableOptions;
                int length2 = optionParserArr.length;
                int i8 = i6;
                CharPredicate charPredicate2 = charPredicate;
                ?? r16 = charPredicate2;
                ?? r15 = charPredicate2;
                while (true) {
                    if (i8 >= length2) {
                        basedSequence2 = basedSequence3;
                        optionParser = r15;
                        break;
                    }
                    OptionParser<T> optionParser2 = optionParserArr[i8];
                    basedSequence2 = basedSequence3;
                    if (optionParser2.getOptionName().equals(basedSequence4.toString())) {
                        optionParser = optionParser2;
                        r16 = null;
                        break;
                    }
                    if (optionParser2.getOptionName().startsWith(basedSequence4.toString())) {
                        if (r15 == 0) {
                            r15 = optionParser2;
                        } else {
                            if (r16 == null) {
                                delimitedBuilder = new DelimitedBuilder(", ");
                                delimitedBuilder.append(messageProvider2.message(KEY_OPTION_0_IS_AMBIGUOUS, OPTION_0_IS_AMBIGUOUS, basedSequence4));
                                delimitedBuilder.append(r15.getOptionName()).mark();
                            } else {
                                delimitedBuilder = r16;
                            }
                            delimitedBuilder.append(optionParser2.getOptionName()).mark();
                            r16 = delimitedBuilder;
                        }
                    }
                    i8++;
                    basedSequence3 = basedSequence2;
                    r15 = r15;
                }
                if (optionParser == null) {
                    optionsParser = this;
                    DelimitedBuilder delimitedBuilder2 = new DelimitedBuilder(", ");
                    delimitedBuilder2.append(messageProvider2.message(KEY_OPTION_0_DOES_NOT_MATCH, OPTION_0_DOES_NOT_MATCH, basedSequence4));
                    optionsParser.appendOptionNames(delimitedBuilder2);
                    ParsedOptionStatus parsedOptionStatus = ParsedOptionStatus.ERROR;
                    arrayList.add(new ParsedOption(basedSequence2, optionsParser, parsedOptionStatus, new ParserMessage(basedSequence4, parsedOptionStatus, delimitedBuilder2.toString())));
                } else if (r16 == null) {
                    Pair<T, List<ParsedOption<T>>> parseOption = optionParser.parseOption(subSequence, t6, messageProvider2);
                    T first = parseOption.getFirst();
                    optionsParser = this;
                    arrayList.add(new ParsedOption(basedSequence2, optionsParser, ParsedOptionStatus.VALID, null, parseOption.getSecond()));
                    t6 = first;
                } else {
                    optionsParser = this;
                    ParsedOptionStatus parsedOptionStatus2 = ParsedOptionStatus.ERROR;
                    arrayList.add(new ParsedOption(basedSequence2, optionsParser, parsedOptionStatus2, new ParserMessage(basedSequence4, parsedOptionStatus2, r16.toString())));
                }
            }
            i7++;
            i6 = 0;
            charPredicate = null;
        }
        return new Pair<>(t6, arrayList);
    }
}
