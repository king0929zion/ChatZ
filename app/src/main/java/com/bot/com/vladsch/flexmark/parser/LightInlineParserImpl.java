package com.vladsch.flexmark.parser;

import com.vladsch.flexmark.ast.Text;
import com.vladsch.flexmark.ast.util.Parsing;
import com.vladsch.flexmark.util.ast.Document;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.data.DataHolder;
import com.vladsch.flexmark.util.sequence.BasedSequence;
import com.vladsch.flexmark.util.sequence.SegmentedSequence;
import java.util.ArrayList;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class LightInlineParserImpl implements LightInlineParser {
    protected Node block;
    protected ArrayList<BasedSequence> currentText;
    protected Document document;
    protected int index;
    protected BasedSequence input;
    protected final Parsing myParsing;
    protected final InlineParserOptions options;

    public LightInlineParserImpl(DataHolder dataHolder) {
        this.options = new InlineParserOptions(dataHolder);
        this.myParsing = new Parsing(dataHolder);
    }

    @Override // com.vladsch.flexmark.parser.LightInlineParser
    public void appendNode(Node node) {
        flushTextNode();
        this.block.appendChild(node);
    }

    @Override // com.vladsch.flexmark.parser.LightInlineParser
    public Text appendSeparateText(BasedSequence basedSequence) {
        Text text = new Text(basedSequence);
        appendNode(text);
        return text;
    }

    @Override // com.vladsch.flexmark.parser.LightInlineParser
    public void appendText(BasedSequence basedSequence) {
        getCurrentText().add(basedSequence);
    }

    @Override // com.vladsch.flexmark.parser.LightInlineParser
    public boolean flushTextNode() {
        if (this.currentText == null) {
            return false;
        }
        this.block.appendChild(new Text(SegmentedSequence.create(this.input, this.currentText)));
        this.currentText = null;
        return true;
    }

    @Override // com.vladsch.flexmark.parser.LightInlineParser
    public Node getBlock() {
        return this.block;
    }

    @Override // com.vladsch.flexmark.parser.LightInlineParser
    public ArrayList<BasedSequence> getCurrentText() {
        if (this.currentText == null) {
            this.currentText = new ArrayList<>();
        }
        return this.currentText;
    }

    @Override // com.vladsch.flexmark.parser.LightInlineParser
    public Document getDocument() {
        return this.document;
    }

    @Override // com.vladsch.flexmark.parser.LightInlineParser
    public int getIndex() {
        return this.index;
    }

    @Override // com.vladsch.flexmark.parser.LightInlineParser
    public BasedSequence getInput() {
        return this.input;
    }

    @Override // com.vladsch.flexmark.parser.LightInlineParser
    public InlineParserOptions getOptions() {
        return this.options;
    }

    @Override // com.vladsch.flexmark.parser.LightInlineParser
    public Parsing getParsing() {
        return this.myParsing;
    }

    @Override // com.vladsch.flexmark.parser.LightInlineParser
    public BasedSequence match(Pattern pattern) {
        if (this.index >= this.input.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.input);
        matcher.region(this.index, this.input.length());
        if (!matcher.find()) {
            return null;
        }
        this.index = matcher.end();
        MatchResult matchResult = matcher.toMatchResult();
        return this.input.subSequence(matchResult.start(), matchResult.end());
    }

    @Override // com.vladsch.flexmark.parser.LightInlineParser
    public BasedSequence[] matchWithGroups(Pattern pattern) {
        if (this.index >= this.input.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.input);
        matcher.region(this.index, this.input.length());
        if (!matcher.find()) {
            return null;
        }
        this.index = matcher.end();
        MatchResult matchResult = matcher.toMatchResult();
        int groupCount = matcher.groupCount() + 1;
        BasedSequence[] basedSequenceArr = new BasedSequence[groupCount];
        basedSequenceArr[0] = this.input.subSequence(matchResult.start(), matchResult.end());
        for (int i6 = 1; i6 < groupCount; i6++) {
            if (matcher.group(i6) != null) {
                basedSequenceArr[i6] = this.input.subSequence(matchResult.start(i6), matchResult.end(i6));
            } else {
                basedSequenceArr[i6] = null;
            }
        }
        return basedSequenceArr;
    }

    @Override // com.vladsch.flexmark.parser.LightInlineParser
    public Matcher matcher(Pattern pattern) {
        if (this.index >= this.input.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.input);
        matcher.region(this.index, this.input.length());
        if (!matcher.find()) {
            return null;
        }
        this.index = matcher.end();
        return matcher;
    }

    @Override // com.vladsch.flexmark.parser.LightInlineParser
    public void moveNodes(Node node, Node node2) {
        if (node != node2) {
            Node next = node.getNext();
            while (next != null) {
                Node next2 = next.getNext();
                next.unlink();
                node.appendChild(next);
                if (next == node2) {
                    break;
                } else {
                    next = next2;
                }
            }
        }
        node.setCharsFromContent();
    }

    @Override // com.vladsch.flexmark.parser.LightInlineParser
    public boolean nonIndentSp() {
        match(this.myParsing.SPNI);
        return true;
    }

    @Override // com.vladsch.flexmark.parser.LightInlineParser
    public char peek() {
        if (this.index < this.input.length()) {
            return this.input.charAt(this.index);
        }
        return (char) 0;
    }

    @Override // com.vladsch.flexmark.parser.LightInlineParser
    public void setBlock(Node node) {
        this.block = node;
    }

    @Override // com.vladsch.flexmark.parser.LightInlineParser
    public void setDocument(Document document) {
        this.document = document;
    }

    @Override // com.vladsch.flexmark.parser.LightInlineParser
    public void setIndex(int i6) {
        this.index = i6;
    }

    @Override // com.vladsch.flexmark.parser.LightInlineParser
    public void setInput(BasedSequence basedSequence) {
        this.input = basedSequence;
    }

    @Override // com.vladsch.flexmark.parser.LightInlineParser
    public boolean sp() {
        match(this.myParsing.SP);
        return true;
    }

    @Override // com.vladsch.flexmark.parser.LightInlineParser
    public boolean spnl() {
        match(this.myParsing.SPNL);
        return true;
    }

    @Override // com.vladsch.flexmark.parser.LightInlineParser
    public boolean spnlUrl() {
        return match(this.myParsing.SPNL_URL) != null;
    }

    @Override // com.vladsch.flexmark.parser.LightInlineParser
    public BasedSequence toEOL() {
        return match(this.myParsing.REST_OF_LINE);
    }

    @Override // com.vladsch.flexmark.parser.LightInlineParser
    public void appendText(BasedSequence basedSequence, int i6, int i7) {
        getCurrentText().add(basedSequence.subSequence(i6, i7));
    }

    @Override // com.vladsch.flexmark.parser.LightInlineParser
    public char peek(int i6) {
        if (this.index + i6 < this.input.length()) {
            return this.input.charAt(this.index + i6);
        }
        return (char) 0;
    }
}
