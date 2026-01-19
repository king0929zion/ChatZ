package com.vladsch.flexmark.ext.emoji.internal;

import com.vladsch.flexmark.ext.emoji.Emoji;
import com.vladsch.flexmark.html.HtmlWriter;
import com.vladsch.flexmark.html.renderer.NodeRenderer;
import com.vladsch.flexmark.html.renderer.NodeRendererContext;
import com.vladsch.flexmark.html.renderer.NodeRendererFactory;
import com.vladsch.flexmark.html.renderer.NodeRenderingHandler;
import com.vladsch.flexmark.util.data.DataHolder;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class EmojiJiraRenderer implements NodeRenderer {
    public static final HashMap<String, String> shortCutMap;

    /* loaded from: classes.dex */
    public static class Factory implements NodeRendererFactory {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.vladsch.flexmark.html.renderer.NodeRendererFactory, java.util.function.Function
        public NodeRenderer apply(DataHolder dataHolder) {
            return new EmojiJiraRenderer(dataHolder);
        }
    }

    static {
        HashMap<String, String> hashMap = new HashMap<>();
        shortCutMap = hashMap;
        hashMap.put("smile", ":)");
        hashMap.put("frowning", ":(");
        hashMap.put("stuck_out_tongue", ":P");
        hashMap.put("grinning", ":D");
        hashMap.put("wink", ";)");
        hashMap.put("thumbsup", "(y)");
        hashMap.put("thumbsdown", "(n)");
        hashMap.put("information_source", "(i)");
        hashMap.put("white_check_mark", "(/)");
        hashMap.put("x", "(x)");
        hashMap.put("warning", "(!)");
        hashMap.put("heavy_plus_sign", "(+)");
        hashMap.put("heavy_minus_sign", "(-)");
        hashMap.put("question", "(?)");
        hashMap.put("bulb", "(on)");
        hashMap.put("star", "(*)");
        hashMap.put("triangular_flag_on_post", "(flag)");
        hashMap.put("crossed_flags", "(flagoff)");
    }

    public EmojiJiraRenderer(DataHolder dataHolder) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void render(Emoji emoji, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        String str = shortCutMap.get(emoji.getText().toString());
        if (str != null) {
            htmlWriter.raw((CharSequence) str);
            return;
        }
        htmlWriter.text(":");
        nodeRendererContext.renderChildren(emoji);
        htmlWriter.text(":");
    }

    @Override // com.vladsch.flexmark.html.renderer.NodeRenderer
    public Set<NodeRenderingHandler<?>> getNodeRenderingHandlers() {
        HashSet hashSet = new HashSet();
        hashSet.add(new NodeRenderingHandler(Emoji.class, new a(this, 0)));
        return hashSet;
    }
}
