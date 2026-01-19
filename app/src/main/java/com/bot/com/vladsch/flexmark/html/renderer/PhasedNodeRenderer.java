package com.vladsch.flexmark.html.renderer;

import com.vladsch.flexmark.html.HtmlWriter;
import com.vladsch.flexmark.util.ast.Document;
import java.util.Set;

/* loaded from: classes.dex */
public interface PhasedNodeRenderer extends NodeRenderer {
    Set<RenderingPhase> getRenderingPhases();

    void renderDocument(NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter, Document document, RenderingPhase renderingPhase);
}
