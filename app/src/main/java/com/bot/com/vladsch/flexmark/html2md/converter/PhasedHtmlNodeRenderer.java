package com.vladsch.flexmark.html2md.converter;

import com.vladsch.flexmark.util.sequence.LineAppendable;
import java.util.Set;
import org.jsoup.nodes.Document;

/* loaded from: classes.dex */
public interface PhasedHtmlNodeRenderer extends HtmlNodeRenderer {
    Set<HtmlConverterPhase> getHtmlConverterPhases();

    void renderDocument(HtmlNodeConverterContext htmlNodeConverterContext, LineAppendable lineAppendable, Document document, HtmlConverterPhase htmlConverterPhase);
}
