package com.vladsch.flexmark.ext.emoji;

import com.vladsch.flexmark.ext.gfm.strikethrough.Strikethrough;
import com.vladsch.flexmark.ext.gfm.strikethrough.StrikethroughVisitor;
import com.vladsch.flexmark.ext.gfm.strikethrough.Subscript;
import com.vladsch.flexmark.ext.gfm.strikethrough.SubscriptVisitor;
import com.vladsch.flexmark.ext.ins.Ins;
import com.vladsch.flexmark.ext.ins.InsVisitor;
import com.vladsch.flexmark.ext.superscript.Superscript;
import com.vladsch.flexmark.ext.superscript.SuperscriptVisitor;
import com.vladsch.flexmark.ext.wikilink.WikiImage;
import com.vladsch.flexmark.ext.wikilink.WikiImageVisitor;
import com.vladsch.flexmark.ext.wikilink.WikiLink;
import com.vladsch.flexmark.ext.wikilink.WikiLinkVisitor;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.ast.Visitor;
import java.util.function.Consumer;
import v.AbstractC1787b;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Visitor {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11283b;

    public /* synthetic */ a(Object obj, int i6) {
        this.a = i6;
        this.f11283b = obj;
    }

    @Override // com.vladsch.flexmark.util.ast.Visitor
    public final void visit(Node node) {
        switch (this.a) {
            case 0:
                ((EmojiVisitor) this.f11283b).visit((Emoji) node);
                return;
            case 1:
                ((StrikethroughVisitor) this.f11283b).visit((Strikethrough) node);
                return;
            case 2:
                ((SubscriptVisitor) this.f11283b).visit((Subscript) node);
                return;
            case 3:
                ((InsVisitor) this.f11283b).visit((Ins) node);
                return;
            case 4:
                ((SuperscriptVisitor) this.f11283b).visit((Superscript) node);
                return;
            case AbstractC1787b.f15290g /* 5 */:
                ((WikiImageVisitor) this.f11283b).visit((WikiImage) node);
                return;
            case 6:
                ((WikiLinkVisitor) this.f11283b).visit((WikiLink) node);
                return;
            default:
                ((Consumer) this.f11283b).accept(node);
                return;
        }
    }
}
