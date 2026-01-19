package com.vladsch.flexmark.html;

import com.vladsch.flexmark.html.renderer.AttributablePart;
import com.vladsch.flexmark.html.renderer.LinkResolverContext;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.html.Attributes;
import com.vladsch.flexmark.util.html.MutableAttributes;
import com.vladsch.flexmark.util.sequence.BasedSequence;

/* loaded from: classes.dex */
public class EmbeddedAttributeProvider implements AttributeProvider {
    public static final IndependentAttributeProviderFactory Factory = new IndependentAttributeProviderFactory() { // from class: com.vladsch.flexmark.html.EmbeddedAttributeProvider.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.vladsch.flexmark.html.AttributeProviderFactory, java.util.function.Function
        public AttributeProvider apply(LinkResolverContext linkResolverContext) {
            return new EmbeddedAttributeProvider();
        }
    };

    /* loaded from: classes.dex */
    public static class EmbeddedNodeAttributes extends Node {
        final Attributes attributes;

        public EmbeddedNodeAttributes(Node node, Attributes attributes) {
            super(node.getChars().subSequence(0, 0));
            this.attributes = attributes;
        }

        @Override // com.vladsch.flexmark.util.ast.Node
        public void astExtraChars(StringBuilder sb) {
        }

        @Override // com.vladsch.flexmark.util.ast.Node
        public void astString(StringBuilder sb, boolean z5) {
            sb.append(EmbeddedNodeAttributes.class.getSimpleName());
            sb.append("[");
            sb.append(getStartOffset());
            sb.append(", ");
            sb.append(getEndOffset());
            sb.append("]");
            sb.append(", attributes: ");
            sb.append(this.attributes.toString());
            if (z5) {
                getAstExtra(sb);
            }
        }

        @Override // com.vladsch.flexmark.util.ast.Node
        public BasedSequence[] getSegments() {
            return Node.EMPTY_SEGMENTS;
        }
    }

    @Override // com.vladsch.flexmark.html.AttributeProvider
    public void setAttributes(Node node, AttributablePart attributablePart, MutableAttributes mutableAttributes) {
        if (attributablePart == AttributablePart.NODE) {
            Node childOfType = node.getChildOfType(EmbeddedNodeAttributes.class);
            if (childOfType instanceof EmbeddedNodeAttributes) {
                mutableAttributes.addValues(((EmbeddedNodeAttributes) childOfType).attributes);
            }
        }
    }
}
