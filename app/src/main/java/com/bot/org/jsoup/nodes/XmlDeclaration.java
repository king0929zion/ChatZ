package org.jsoup.nodes;

import com.vladsch.flexmark.util.sequence.SequenceUtils;
import java.io.IOException;
import java.util.Iterator;
import org.jsoup.SerializationException;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;

/* loaded from: classes.dex */
public class XmlDeclaration extends LeafNode {
    private final boolean isProcessingInstruction;

    public XmlDeclaration(String str, boolean z5) {
        Validate.notNull(str);
        this.value = str;
        this.isProcessingInstruction = z5;
    }

    public String getWholeDeclaration() {
        StringBuilder borrowBuilder = StringUtil.borrowBuilder();
        try {
            getWholeDeclaration(borrowBuilder, new Document.OutputSettings());
            return StringUtil.releaseBuilder(borrowBuilder).trim();
        } catch (IOException e6) {
            throw new SerializationException(e6);
        }
    }

    public String name() {
        return coreValue();
    }

    @Override // org.jsoup.nodes.Node
    public String nodeName() {
        return "#declaration";
    }

    @Override // org.jsoup.nodes.Node
    public void outerHtmlHead(Appendable appendable, int i6, Document.OutputSettings outputSettings) {
        appendable.append("<").append(this.isProcessingInstruction ? "!" : "?").append(coreValue());
        getWholeDeclaration(appendable, outputSettings);
        appendable.append(this.isProcessingInstruction ? "!" : "?").append(">");
    }

    @Override // org.jsoup.nodes.Node
    public void outerHtmlTail(Appendable appendable, int i6, Document.OutputSettings outputSettings) {
    }

    @Override // org.jsoup.nodes.Node
    public String toString() {
        return outerHtml();
    }

    @Override // org.jsoup.nodes.Node
    public XmlDeclaration clone() {
        return (XmlDeclaration) super.clone();
    }

    private void getWholeDeclaration(Appendable appendable, Document.OutputSettings outputSettings) {
        Appendable appendable2;
        Document.OutputSettings outputSettings2;
        Iterator<Attribute> it = attributes().iterator();
        while (it.hasNext()) {
            Attribute next = it.next();
            String key = next.getKey();
            String value = next.getValue();
            if (!key.equals(nodeName())) {
                appendable.append(SequenceUtils.SPC);
                appendable.append(key);
                if (!value.isEmpty()) {
                    appendable.append("=\"");
                    appendable2 = appendable;
                    outputSettings2 = outputSettings;
                    Entities.escape(appendable2, value, outputSettings2, true, false, false, false);
                    appendable2.append('\"');
                    appendable = appendable2;
                    outputSettings = outputSettings2;
                }
            }
            appendable2 = appendable;
            outputSettings2 = outputSettings;
            appendable = appendable2;
            outputSettings = outputSettings2;
        }
    }
}
