package com.vladsch.flexmark.ext.emoji.internal;

import com.vladsch.flexmark.ext.emoji.Emoji;
import com.vladsch.flexmark.formatter.MarkdownWriter;
import com.vladsch.flexmark.formatter.NodeFormatter;
import com.vladsch.flexmark.formatter.NodeFormatterContext;
import com.vladsch.flexmark.formatter.NodeFormatterFactory;
import com.vladsch.flexmark.formatter.NodeFormattingHandler;
import com.vladsch.flexmark.util.data.DataHolder;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class EmojiNodeFormatter implements NodeFormatter {

    /* loaded from: classes.dex */
    public static class Factory implements NodeFormatterFactory {
        @Override // com.vladsch.flexmark.formatter.NodeFormatterFactory
        public NodeFormatter create(DataHolder dataHolder) {
            return new EmojiNodeFormatter(dataHolder);
        }
    }

    public EmojiNodeFormatter(DataHolder dataHolder) {
    }

    @Override // com.vladsch.flexmark.formatter.NodeFormatter
    public Set<Class<?>> getNodeClasses() {
        return null;
    }

    @Override // com.vladsch.flexmark.formatter.NodeFormatter
    public Set<NodeFormattingHandler<?>> getNodeFormattingHandlers() {
        HashSet hashSet = new HashSet();
        hashSet.add(new NodeFormattingHandler(Emoji.class, new com.vladsch.flexmark.ext.wikilink.internal.a(this, 2)));
        return hashSet;
    }

    public void render(Emoji emoji, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
        markdownWriter.append((CharSequence) emoji.getOpeningMarker());
        markdownWriter.appendNonTranslating(emoji.getText());
        markdownWriter.append((CharSequence) emoji.getClosingMarker());
    }
}
