package com.vladsch.flexmark.parser;

import com.vladsch.flexmark.ast.Text;
import com.vladsch.flexmark.ast.util.Parsing;
import com.vladsch.flexmark.util.ast.Document;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.sequence.BasedSequence;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public interface LightInlineParser {
    void appendNode(Node node);

    Text appendSeparateText(BasedSequence basedSequence);

    void appendText(BasedSequence basedSequence);

    void appendText(BasedSequence basedSequence, int i6, int i7);

    boolean flushTextNode();

    Node getBlock();

    ArrayList<BasedSequence> getCurrentText();

    Document getDocument();

    int getIndex();

    BasedSequence getInput();

    InlineParserOptions getOptions();

    Parsing getParsing();

    BasedSequence match(Pattern pattern);

    BasedSequence[] matchWithGroups(Pattern pattern);

    Matcher matcher(Pattern pattern);

    void moveNodes(Node node, Node node2);

    boolean nonIndentSp();

    char peek();

    char peek(int i6);

    void setBlock(Node node);

    void setDocument(Document document);

    void setIndex(int i6);

    void setInput(BasedSequence basedSequence);

    boolean sp();

    boolean spnl();

    boolean spnlUrl();

    BasedSequence toEOL();
}
