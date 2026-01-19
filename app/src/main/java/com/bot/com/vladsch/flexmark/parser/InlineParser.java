package com.vladsch.flexmark.parser;

import com.vladsch.flexmark.ast.Text;
import com.vladsch.flexmark.parser.block.CharacterNodeFactory;
import com.vladsch.flexmark.parser.core.delimiter.Bracket;
import com.vladsch.flexmark.parser.core.delimiter.Delimiter;
import com.vladsch.flexmark.util.ast.Document;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.sequence.BasedSequence;
import java.util.BitSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public interface InlineParser extends LightInlineParser {
    void finalizeDocument(Document document);

    Bracket getLastBracket();

    Delimiter getLastDelimiter();

    void initializeDocument(Document document);

    void mergeIfNeeded(Text text, Text text2);

    void mergeTextNodes(Node node, Node node2);

    void parse(BasedSequence basedSequence, Node node);

    boolean parseAutolink();

    List<Node> parseCustom(BasedSequence basedSequence, Node node, BitSet bitSet, Map<Character, CharacterNodeFactory> map);

    boolean parseEntity();

    boolean parseHtmlInline();

    BasedSequence parseLinkDestination();

    int parseLinkLabel();

    BasedSequence parseLinkTitle();

    boolean parseNewline();

    void processDelimiters(Delimiter delimiter);

    void removeDelimiter(Delimiter delimiter);

    void removeDelimiterAndNode(Delimiter delimiter);

    void removeDelimiterKeepNode(Delimiter delimiter);

    void removeDelimitersBetween(Delimiter delimiter, Delimiter delimiter2);

    @Override // com.vladsch.flexmark.parser.LightInlineParser
    BasedSequence toEOL();
}
