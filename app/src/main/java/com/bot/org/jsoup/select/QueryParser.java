package org.jsoup.select;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.parser.PegdownExtensions;
import com.vladsch.flexmark.parser.core.BlockQuoteParser;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.internal.StringUtil;
import org.jsoup.parser.TokenQueue;
import org.jsoup.select.CombiningEvaluator;
import org.jsoup.select.Evaluator;
import org.jsoup.select.Selector;
import org.jsoup.select.StructuralEvaluator;
import v.AbstractC1787b;

/* loaded from: classes.dex */
public class QueryParser {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final List<Evaluator> evals = new ArrayList();
    private final String query;
    private final TokenQueue tq;
    private static final char[] Combinators = {',', BlockQuoteParser.MARKER_CHAR, '+', '~', SequenceUtils.SPC};
    private static final String[] AttributeEvals = {"=", "!=", "^=", "$=", "*=", "~="};
    private static final Pattern NTH_AB = Pattern.compile("(([+-])?(\\d+)?)n(\\s*([+-])?\\s*\\d+)?", 2);
    private static final Pattern NTH_B = Pattern.compile("([+-])?(\\d+)");

    private QueryParser(String str) {
        Validate.notEmpty(str);
        String trim = str.trim();
        this.query = trim;
        this.tq = new TokenQueue(trim);
    }

    private Evaluator byAttribute() {
        TokenQueue tokenQueue = new TokenQueue(this.tq.chompBalanced('[', ']'));
        String consumeToAny = tokenQueue.consumeToAny(AttributeEvals);
        Validate.notEmpty(consumeToAny);
        tokenQueue.consumeWhitespace();
        if (tokenQueue.isEmpty()) {
            return consumeToAny.startsWith("^") ? new Evaluator.AttributeStarting(consumeToAny.substring(1)) : consumeToAny.equals("*") ? new Evaluator.AttributeStarting(FlexmarkHtmlConverter.DEFAULT_NODE) : new Evaluator.Attribute(consumeToAny);
        }
        if (tokenQueue.matchChomp("=")) {
            return new Evaluator.AttributeWithValue(consumeToAny, tokenQueue.remainder());
        }
        if (tokenQueue.matchChomp("!=")) {
            return new Evaluator.AttributeWithValueNot(consumeToAny, tokenQueue.remainder());
        }
        if (tokenQueue.matchChomp("^=")) {
            return new Evaluator.AttributeWithValueStarting(consumeToAny, tokenQueue.remainder());
        }
        if (tokenQueue.matchChomp("$=")) {
            return new Evaluator.AttributeWithValueEnding(consumeToAny, tokenQueue.remainder());
        }
        if (tokenQueue.matchChomp("*=")) {
            return new Evaluator.AttributeWithValueContaining(consumeToAny, tokenQueue.remainder());
        }
        if (tokenQueue.matchChomp("~=")) {
            return new Evaluator.AttributeWithValueMatching(consumeToAny, Pattern.compile(tokenQueue.remainder()));
        }
        throw new Selector.SelectorParseException("Could not parse attribute query '%s': unexpected token at '%s'", this.query, tokenQueue.remainder());
    }

    private Evaluator byClass() {
        String consumeCssIdentifier = this.tq.consumeCssIdentifier();
        Validate.notEmpty(consumeCssIdentifier);
        return new Evaluator.Class(consumeCssIdentifier.trim());
    }

    private Evaluator byId() {
        String consumeCssIdentifier = this.tq.consumeCssIdentifier();
        Validate.notEmpty(consumeCssIdentifier);
        return new Evaluator.Id(consumeCssIdentifier);
    }

    private Evaluator byTag() {
        String normalize = Normalizer.normalize(this.tq.consumeElementSelector());
        Validate.notEmpty(normalize);
        if (normalize.startsWith("*|")) {
            return new CombiningEvaluator.Or(new Evaluator.Tag(normalize.substring(2)), new Evaluator.TagEndsWith(normalize.replace("*|", ":")));
        }
        if (normalize.contains("|")) {
            normalize = normalize.replace("|", ":");
        }
        return new Evaluator.Tag(normalize);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void combinator(char r10) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.select.QueryParser.combinator(char):void");
    }

    private Evaluator consumeEvaluator() {
        if (this.tq.matchChomp("#")) {
            return byId();
        }
        if (this.tq.matchChomp(".")) {
            return byClass();
        }
        if (this.tq.matchesWord() || this.tq.matches("*|")) {
            return byTag();
        }
        if (this.tq.matches("[")) {
            return byAttribute();
        }
        if (this.tq.matchChomp("*")) {
            return new Evaluator.AllElements();
        }
        if (this.tq.matchChomp(":")) {
            return parsePseudoSelector();
        }
        throw new Selector.SelectorParseException("Could not parse query '%s': unexpected token at '%s'", this.query, this.tq.remainder());
    }

    private int consumeIndex() {
        String trim = consumeParens().trim();
        Validate.isTrue(StringUtil.isNumeric(trim), "Index must be numeric");
        return Integer.parseInt(trim);
    }

    private String consumeParens() {
        return this.tq.chompBalanced('(', ')');
    }

    private String consumeSubQuery() {
        StringBuilder borrowBuilder = StringUtil.borrowBuilder();
        boolean z5 = false;
        while (!this.tq.isEmpty()) {
            if (!this.tq.matchesAny(Combinators)) {
                if (this.tq.matches("(")) {
                    borrowBuilder.append("(");
                    borrowBuilder.append(this.tq.chompBalanced('(', ')'));
                    borrowBuilder.append(")");
                } else if (this.tq.matches("[")) {
                    borrowBuilder.append("[");
                    borrowBuilder.append(this.tq.chompBalanced('[', ']'));
                    borrowBuilder.append("]");
                } else {
                    borrowBuilder.append(this.tq.consume());
                }
                z5 = true;
            } else {
                if (z5) {
                    break;
                }
                borrowBuilder.append(this.tq.consume());
            }
        }
        return StringUtil.releaseBuilder(borrowBuilder);
    }

    private Evaluator contains(boolean z5) {
        String str = z5 ? ":containsOwn" : ":contains";
        String unescape = TokenQueue.unescape(consumeParens());
        Validate.notEmpty(unescape, str.concat("(text) query must not be empty"));
        return z5 ? new Evaluator.ContainsOwnText(unescape) : new Evaluator.ContainsText(unescape);
    }

    private Evaluator containsData() {
        String unescape = TokenQueue.unescape(consumeParens());
        Validate.notEmpty(unescape, ":containsData(text) query must not be empty");
        return new Evaluator.ContainsData(unescape);
    }

    private Evaluator containsWholeText(boolean z5) {
        String str = z5 ? ":containsWholeOwnText" : ":containsWholeText";
        String unescape = TokenQueue.unescape(consumeParens());
        Validate.notEmpty(unescape, str.concat("(text) query must not be empty"));
        return z5 ? new Evaluator.ContainsWholeOwnText(unescape) : new Evaluator.ContainsWholeText(unescape);
    }

    private Evaluator cssNthChild(boolean z5, boolean z6) {
        String normalize = Normalizer.normalize(consumeParens());
        Matcher matcher = NTH_AB.matcher(normalize);
        Matcher matcher2 = NTH_B.matcher(normalize);
        int i6 = 2;
        int i7 = 1;
        if (!"odd".equals(normalize)) {
            if ("even".equals(normalize)) {
                i7 = 0;
            } else if (matcher.matches()) {
                int parseInt = matcher.group(3) != null ? Integer.parseInt(matcher.group(1).replaceFirst("^\\+", FlexmarkHtmlConverter.DEFAULT_NODE)) : 1;
                i7 = matcher.group(4) != null ? Integer.parseInt(matcher.group(4).replaceFirst("^\\+", FlexmarkHtmlConverter.DEFAULT_NODE)) : 0;
                i6 = parseInt;
            } else {
                if (!matcher2.matches()) {
                    throw new Selector.SelectorParseException("Could not parse nth-index '%s': unexpected format", normalize);
                }
                i7 = Integer.parseInt(matcher2.group().replaceFirst("^\\+", FlexmarkHtmlConverter.DEFAULT_NODE));
                i6 = 0;
            }
        }
        return z6 ? z5 ? new Evaluator.IsNthLastOfType(i6, i7) : new Evaluator.IsNthOfType(i6, i7) : z5 ? new Evaluator.IsNthLastChild(i6, i7) : new Evaluator.IsNthChild(i6, i7);
    }

    private Evaluator has() {
        String consumeParens = consumeParens();
        Validate.notEmpty(consumeParens, ":has(selector) sub-select must not be empty");
        return new StructuralEvaluator.Has(parse(consumeParens));
    }

    private Evaluator is() {
        String consumeParens = consumeParens();
        Validate.notEmpty(consumeParens, ":is(selector) sub-select must not be empty");
        return new StructuralEvaluator.Is(parse(consumeParens));
    }

    private Evaluator matches(boolean z5) {
        String str = z5 ? ":matchesOwn" : ":matches";
        String consumeParens = consumeParens();
        Validate.notEmpty(consumeParens, str.concat("(regex) query must not be empty"));
        return z5 ? new Evaluator.MatchesOwn(Pattern.compile(consumeParens)) : new Evaluator.Matches(Pattern.compile(consumeParens));
    }

    private Evaluator matchesWholeText(boolean z5) {
        String str = z5 ? ":matchesWholeOwnText" : ":matchesWholeText";
        String consumeParens = consumeParens();
        Validate.notEmpty(consumeParens, str.concat("(regex) query must not be empty"));
        return z5 ? new Evaluator.MatchesWholeOwnText(Pattern.compile(consumeParens)) : new Evaluator.MatchesWholeText(Pattern.compile(consumeParens));
    }

    private Evaluator not() {
        String consumeParens = consumeParens();
        Validate.notEmpty(consumeParens, ":not(selector) subselect must not be empty");
        return new StructuralEvaluator.Not(parse(consumeParens));
    }

    public static Evaluator parse(String str) {
        try {
            return new QueryParser(str).parse();
        } catch (IllegalArgumentException e6) {
            throw new Selector.SelectorParseException(e6.getMessage());
        }
    }

    private Evaluator parsePseudoSelector() {
        String consumeCssIdentifier = this.tq.consumeCssIdentifier();
        consumeCssIdentifier.getClass();
        char c6 = 65535;
        switch (consumeCssIdentifier.hashCode()) {
            case -2141736343:
                if (consumeCssIdentifier.equals("containsData")) {
                    c6 = 0;
                    break;
                }
                break;
            case -2136991809:
                if (consumeCssIdentifier.equals("first-child")) {
                    c6 = 1;
                    break;
                }
                break;
            case -1939921007:
                if (consumeCssIdentifier.equals("matchesWholeText")) {
                    c6 = 2;
                    break;
                }
                break;
            case -1754914063:
                if (consumeCssIdentifier.equals("nth-child")) {
                    c6 = 3;
                    break;
                }
                break;
            case -1629748624:
                if (consumeCssIdentifier.equals("nth-last-child")) {
                    c6 = 4;
                    break;
                }
                break;
            case -947996741:
                if (consumeCssIdentifier.equals("only-child")) {
                    c6 = 5;
                    break;
                }
                break;
            case -897532411:
                if (consumeCssIdentifier.equals("nth-of-type")) {
                    c6 = 6;
                    break;
                }
                break;
            case -872629820:
                if (consumeCssIdentifier.equals("nth-last-of-type")) {
                    c6 = 7;
                    break;
                }
                break;
            case -567445985:
                if (consumeCssIdentifier.equals("contains")) {
                    c6 = '\b';
                    break;
                }
                break;
            case -55413797:
                if (consumeCssIdentifier.equals("containsWholeOwnText")) {
                    c6 = '\t';
                    break;
                }
                break;
            case 3244:
                if (consumeCssIdentifier.equals("eq")) {
                    c6 = '\n';
                    break;
                }
                break;
            case 3309:
                if (consumeCssIdentifier.equals("gt")) {
                    c6 = 11;
                    break;
                }
                break;
            case 3370:
                if (consumeCssIdentifier.equals("is")) {
                    c6 = '\f';
                    break;
                }
                break;
            case 3464:
                if (consumeCssIdentifier.equals("lt")) {
                    c6 = '\r';
                    break;
                }
                break;
            case 103066:
                if (consumeCssIdentifier.equals("has")) {
                    c6 = 14;
                    break;
                }
                break;
            case 109267:
                if (consumeCssIdentifier.equals("not")) {
                    c6 = 15;
                    break;
                }
                break;
            case 3506402:
                if (consumeCssIdentifier.equals("root")) {
                    c6 = 16;
                    break;
                }
                break;
            case 96634189:
                if (consumeCssIdentifier.equals("empty")) {
                    c6 = 17;
                    break;
                }
                break;
            case 208017639:
                if (consumeCssIdentifier.equals("containsOwn")) {
                    c6 = 18;
                    break;
                }
                break;
            case 614017170:
                if (consumeCssIdentifier.equals("matchText")) {
                    c6 = 19;
                    break;
                }
                break;
            case 835834661:
                if (consumeCssIdentifier.equals("last-child")) {
                    c6 = 20;
                    break;
                }
                break;
            case 840862003:
                if (consumeCssIdentifier.equals("matches")) {
                    c6 = 21;
                    break;
                }
                break;
            case 1255901423:
                if (consumeCssIdentifier.equals("matchesWholeOwnText")) {
                    c6 = 22;
                    break;
                }
                break;
            case 1292941139:
                if (consumeCssIdentifier.equals("first-of-type")) {
                    c6 = 23;
                    break;
                }
                break;
            case 1455900751:
                if (consumeCssIdentifier.equals("only-of-type")) {
                    c6 = 24;
                    break;
                }
                break;
            case 1870740819:
                if (consumeCssIdentifier.equals("matchesOwn")) {
                    c6 = 25;
                    break;
                }
                break;
            case 2014184485:
                if (consumeCssIdentifier.equals("containsWholeText")) {
                    c6 = 26;
                    break;
                }
                break;
            case 2025926969:
                if (consumeCssIdentifier.equals("last-of-type")) {
                    c6 = 27;
                    break;
                }
                break;
        }
        switch (c6) {
            case 0:
                return containsData();
            case 1:
                return new Evaluator.IsFirstChild();
            case 2:
                return matchesWholeText(false);
            case 3:
                return cssNthChild(false, false);
            case 4:
                return cssNthChild(true, false);
            case AbstractC1787b.f15290g /* 5 */:
                return new Evaluator.IsOnlyChild();
            case 6:
                return cssNthChild(false, true);
            case 7:
                return cssNthChild(true, true);
            case '\b':
                return contains(false);
            case AbstractC1787b.f15287d /* 9 */:
                return containsWholeText(true);
            case AbstractC1787b.f15289f /* 10 */:
                return new Evaluator.IndexEquals(consumeIndex());
            case 11:
                return new Evaluator.IndexGreaterThan(consumeIndex());
            case '\f':
                return is();
            case '\r':
                return new Evaluator.IndexLessThan(consumeIndex());
            case 14:
                return has();
            case 15:
                return not();
            case PegdownExtensions.AUTOLINKS /* 16 */:
                return new Evaluator.IsRoot();
            case 17:
                return new Evaluator.IsEmpty();
            case 18:
                return contains(true);
            case 19:
                return new Evaluator.MatchText();
            case 20:
                return new Evaluator.IsLastChild();
            case 21:
                return matches(false);
            case 22:
                return matchesWholeText(true);
            case 23:
                return new Evaluator.IsFirstOfType();
            case 24:
                return new Evaluator.IsOnlyOfType();
            case 25:
                return matches(true);
            case 26:
                return containsWholeText(false);
            case 27:
                return new Evaluator.IsLastOfType();
            default:
                throw new Selector.SelectorParseException("Could not parse query '%s': unexpected token at '%s'", this.query, this.tq.remainder());
        }
    }

    public String toString() {
        return this.query;
    }

    public Evaluator parse() {
        this.tq.consumeWhitespace();
        if (this.tq.matchesAny(Combinators)) {
            this.evals.add(new StructuralEvaluator.Root());
            combinator(this.tq.consume());
        } else {
            this.evals.add(consumeEvaluator());
        }
        while (!this.tq.isEmpty()) {
            boolean consumeWhitespace = this.tq.consumeWhitespace();
            if (this.tq.matchesAny(Combinators)) {
                combinator(this.tq.consume());
            } else if (consumeWhitespace) {
                combinator(SequenceUtils.SPC);
            } else {
                this.evals.add(consumeEvaluator());
            }
        }
        if (this.evals.size() == 1) {
            return this.evals.get(0);
        }
        return new CombiningEvaluator.And(this.evals);
    }
}
