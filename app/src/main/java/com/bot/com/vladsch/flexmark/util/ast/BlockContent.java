package com.vladsch.flexmark.util.ast;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.util.sequence.BasedSequence;
import com.vladsch.flexmark.util.sequence.SegmentedSequence;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class BlockContent {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final ArrayList<Integer> lineIndents;
    private final ArrayList<BasedSequence> lines;

    public BlockContent() {
        this.lines = new ArrayList<>();
        this.lineIndents = new ArrayList<>();
    }

    public void add(BasedSequence basedSequence, int i6) {
        this.lines.add(basedSequence);
        this.lineIndents.add(Integer.valueOf(i6));
    }

    public void addAll(List<BasedSequence> list, List<Integer> list2) {
        this.lines.addAll(list);
        this.lineIndents.addAll(list2);
    }

    public BasedSequence getContents() {
        return this.lines.size() == 0 ? BasedSequence.NULL : getContents(0, this.lines.size());
    }

    public int getEndOffset() {
        if (this.lines.size() <= 0) {
            return -1;
        }
        return this.lines.get(r0.size() - 1).getEndOffset();
    }

    public BasedSequence getLine(int i6) {
        return this.lines.get(i6);
    }

    public int getLineCount() {
        return this.lines.size();
    }

    public int getLineIndent() {
        if (this.lines.size() > 0) {
            return this.lineIndents.get(0).intValue();
        }
        return 0;
    }

    public List<Integer> getLineIndents() {
        return this.lineIndents;
    }

    public List<BasedSequence> getLines() {
        return this.lines;
    }

    public int getSourceLength() {
        if (this.lines.size() <= 0) {
            return -1;
        }
        return this.lines.get(r0.size() - 1).getEndOffset() - this.lines.get(0).getStartOffset();
    }

    public BasedSequence getSpanningChars() {
        if (this.lines.size() <= 0) {
            return BasedSequence.NULL;
        }
        return this.lines.get(0).baseSubSequence(this.lines.get(0).getStartOffset(), this.lines.get(r2.size() - 1).getEndOffset());
    }

    public int getStartOffset() {
        if (this.lines.size() > 0) {
            return this.lines.get(0).getStartOffset();
        }
        return -1;
    }

    public String getString() {
        if (this.lines.size() == 0) {
            return FlexmarkHtmlConverter.DEFAULT_NODE;
        }
        StringBuilder sb = new StringBuilder();
        ArrayList<BasedSequence> arrayList = this.lines;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            BasedSequence basedSequence = arrayList.get(i6);
            i6++;
            sb.append((CharSequence) basedSequence.trimEOL());
            sb.append('\n');
        }
        return sb.toString();
    }

    public boolean hasSingleLine() {
        return this.lines.size() == 1;
    }

    public BlockContent subContents(int i6, int i7) {
        return new BlockContent(this, i6, i7);
    }

    public BasedSequence getContents(int i6, int i7) {
        if (this.lines.size() == 0) {
            return BasedSequence.NULL;
        }
        if (i6 < 0) {
            throw new IndexOutOfBoundsException("startLine must be at least 0");
        }
        if (i7 < 0) {
            throw new IndexOutOfBoundsException("endLine must be at least 0");
        }
        if (i7 >= i6) {
            if (i7 <= this.lines.size()) {
                return SegmentedSequence.create(this.lines.get(0), this.lines.subList(i6, i7));
            }
            throw new IndexOutOfBoundsException("endLine must not be greater than line cardinality");
        }
        throw new IndexOutOfBoundsException("endLine must not be less than startLine");
    }

    public BlockContent(BlockContent blockContent, int i6, int i7) {
        ArrayList<BasedSequence> arrayList = new ArrayList<>();
        this.lines = arrayList;
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        this.lineIndents = arrayList2;
        if (blockContent.lines.size() <= 0 || i6 >= i7) {
            return;
        }
        arrayList.addAll(blockContent.lines.subList(i6, i7));
        arrayList2.addAll(blockContent.lineIndents.subList(i6, i7));
    }
}
