package com.vladsch.flexmark.util.ast;

import com.vladsch.flexmark.util.misc.BitFieldSet;
import com.vladsch.flexmark.util.misc.CharPredicate;
import com.vladsch.flexmark.util.sequence.BasedSequence;
import com.vladsch.flexmark.util.sequence.Range;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import com.vladsch.flexmark.util.sequence.builder.BasedSegmentBuilder;
import com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder;
import com.vladsch.flexmark.util.sequence.builder.SegmentOptimizer;
import com.vladsch.flexmark.util.sequence.builder.SequenceBuilder;
import java.util.Iterator;

/* loaded from: classes.dex */
public class SpaceInsertingSequenceBuilder implements ISequenceBuilder<SpaceInsertingSequenceBuilder, BasedSequence> {
    boolean addSpaces;
    final boolean addSpacesBetweenNodes;
    Node lastNode;
    boolean needEol;
    final SequenceBuilder out;

    private SpaceInsertingSequenceBuilder(SequenceBuilder sequenceBuilder, boolean z5) {
        this.out = sequenceBuilder;
        this.addSpacesBetweenNodes = z5;
    }

    public static SpaceInsertingSequenceBuilder emptyBuilder(BasedSequence basedSequence) {
        return new SpaceInsertingSequenceBuilder(SequenceBuilder.emptyBuilder(basedSequence), false);
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder
    public /* bridge */ /* synthetic */ SpaceInsertingSequenceBuilder addAll(Iterable iterable) {
        return addAll((Iterable<? extends CharSequence>) iterable);
    }

    public SpaceInsertingSequenceBuilder addByLength(int i6, int i7) {
        return append(i6, i7 + i6);
    }

    public SpaceInsertingSequenceBuilder addByOffsets(int i6, int i7) {
        return append(i6, i7);
    }

    public SpaceInsertingSequenceBuilder addRange(Range range) {
        return append(range.getStart(), range.getEnd());
    }

    public void appendEol() {
        append('\n');
        this.needEol = false;
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder
    public char charAt(int i6) {
        return this.out.charAt(i6);
    }

    public BasedSequence getBaseSequence() {
        return this.out.getBaseSequence();
    }

    public Node getLastNode() {
        return this.lastNode;
    }

    public SequenceBuilder getOut() {
        return this.out;
    }

    public BasedSegmentBuilder getSegmentBuilder() {
        return this.out.getSegmentBuilder();
    }

    public boolean isNeedEol() {
        return this.needEol;
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder
    public int length() {
        return this.out.length();
    }

    public boolean needEol() {
        boolean test;
        if (this.needEol) {
            return true;
        }
        for (int size = this.out.getSegmentBuilder().size(); size >= 0; size--) {
            Object part = this.out.getSegmentBuilder().getPart(size);
            if (part instanceof Range) {
                Range range = (Range) part;
                if (range.isNotNull()) {
                    BasedSequence subSequence = getBaseSequence().subSequence(range.getStart(), range.getEnd());
                    if (subSequence.length() > 0) {
                        test = CharPredicate.EOL.test(subSequence.charAt(subSequence.length() - 1));
                        return !test;
                    }
                } else {
                    continue;
                }
            } else {
                if (!(part instanceof CharSequence)) {
                    throw new IllegalStateException("Invalid part type ".concat(part.getClass().getSimpleName()));
                }
                CharSequence charSequence = (CharSequence) part;
                if (charSequence.length() > 0) {
                    test = CharPredicate.EOL.test(charSequence.charAt(charSequence.length() - 1));
                    return !test;
                }
            }
        }
        return false;
    }

    public boolean needSpace() {
        boolean test;
        for (int size = this.out.getSegmentBuilder().size(); size >= 0; size--) {
            Object part = this.out.getSegmentBuilder().getPart(size);
            if (part instanceof Range) {
                Range range = (Range) part;
                if (range.isNotNull()) {
                    BasedSequence subSequence = getBaseSequence().subSequence(range.getStart(), range.getEnd());
                    if (subSequence.length() > 0) {
                        test = CharPredicate.WHITESPACE.test(subSequence.charAt(subSequence.length() - 1));
                        return !test;
                    }
                } else {
                    continue;
                }
            } else {
                if (!(part instanceof CharSequence)) {
                    throw new IllegalStateException("Invalid part type ".concat(part.getClass().getSimpleName()));
                }
                CharSequence charSequence = (CharSequence) part;
                if (charSequence.length() > 0) {
                    test = CharPredicate.WHITESPACE.test(charSequence.charAt(charSequence.length() - 1));
                    return !test;
                }
            }
        }
        return false;
    }

    public void setLastNode(Node node) {
        if (node instanceof Document) {
            return;
        }
        Node node2 = this.lastNode;
        if (node2 != null && node2.getEndOffset() < node.getStartOffset()) {
            BasedSequence subSequence = getBaseSequence().subSequence(this.lastNode.getEndOffset(), node.getStartOffset());
            this.needEol = subSequence.trim(CharPredicate.SPACE_TAB).length() > 0 && subSequence.trim(CharPredicate.WHITESPACE).isEmpty();
        }
        this.addSpaces = this.addSpacesBetweenNodes;
        this.lastNode = node;
    }

    public void setNeedEol(boolean z5) {
        this.needEol = z5;
    }

    public String toString() {
        return this.out.toString();
    }

    public String toStringNoAddedSpaces() {
        return this.out.toStringNoAddedSpaces();
    }

    public String toStringWithRanges() {
        return this.out.toStringWithRanges();
    }

    public static SpaceInsertingSequenceBuilder emptyBuilder(BasedSequence basedSequence, SegmentOptimizer segmentOptimizer) {
        return new SpaceInsertingSequenceBuilder(SequenceBuilder.emptyBuilder(basedSequence, segmentOptimizer), false);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder
    public SpaceInsertingSequenceBuilder add(CharSequence charSequence) {
        return append(charSequence);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder
    public SpaceInsertingSequenceBuilder addAll(Iterable<? extends CharSequence> iterable) {
        return append(iterable);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder
    public SpaceInsertingSequenceBuilder getBuilder() {
        return new SpaceInsertingSequenceBuilder(this.out.getBuilder(), this.addSpacesBetweenNodes);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder
    public BasedSequence getSingleBasedSequence() {
        return this.out.getSingleBasedSequence();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder
    public BasedSequence toSequence() {
        return this.out.toSequence();
    }

    public static SpaceInsertingSequenceBuilder emptyBuilder(BasedSequence basedSequence, int i6) {
        return new SpaceInsertingSequenceBuilder(SequenceBuilder.emptyBuilder(basedSequence, i6), BitFieldSet.any(i6, TextContainer.F_ADD_SPACES_BETWEEN_NODES));
    }

    public static SpaceInsertingSequenceBuilder emptyBuilder(BasedSequence basedSequence, int i6, SegmentOptimizer segmentOptimizer) {
        return new SpaceInsertingSequenceBuilder(SequenceBuilder.emptyBuilder(basedSequence, i6, segmentOptimizer), BitFieldSet.any(i6, TextContainer.F_ADD_SPACES_BETWEEN_NODES));
    }

    public static SpaceInsertingSequenceBuilder emptyBuilder(SequenceBuilder sequenceBuilder) {
        return new SpaceInsertingSequenceBuilder(sequenceBuilder, false);
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder
    public /* bridge */ /* synthetic */ SpaceInsertingSequenceBuilder append(Iterable iterable) {
        return append((Iterable<? extends CharSequence>) iterable);
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder, java.lang.Appendable
    public SpaceInsertingSequenceBuilder append(CharSequence charSequence, int i6, int i7) {
        if (this.addSpaces && charSequence != null && i6 < i7 && !CharPredicate.WHITESPACE.test(charSequence.charAt(i6)) && needSpace()) {
            this.out.append(SequenceUtils.SPC);
            this.addSpaces = false;
        }
        this.out.append(charSequence, i6, i7);
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder, java.lang.Appendable
    public SpaceInsertingSequenceBuilder append(char c6) {
        if (this.addSpaces && !CharPredicate.WHITESPACE.test(c6) && needSpace()) {
            this.out.append(SequenceUtils.SPC);
            this.addSpaces = false;
        }
        this.out.append(c6);
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder
    public SpaceInsertingSequenceBuilder append(char c6, int i6) {
        if (this.addSpaces && !CharPredicate.WHITESPACE.test(c6) && needSpace()) {
            this.out.append(SequenceUtils.SPC);
            this.addSpaces = false;
        }
        this.out.append(c6, i6);
        return this;
    }

    public SpaceInsertingSequenceBuilder append(int i6, int i7) {
        if (this.addSpaces && i6 < i7 && !CharPredicate.WHITESPACE.test(this.out.getBaseSequence().charAt(i6)) && needSpace()) {
            this.out.append(SequenceUtils.SPC);
            this.addSpaces = false;
        }
        this.out.append(i6, i7);
        return this;
    }

    public SpaceInsertingSequenceBuilder append(Range range) {
        return append(range.getStart(), range.getEnd());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder
    public SpaceInsertingSequenceBuilder append(Iterable<? extends CharSequence> iterable) {
        Iterator<? extends CharSequence> it = iterable.iterator();
        while (it.hasNext()) {
            append(it.next());
        }
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder, java.lang.Appendable
    public SpaceInsertingSequenceBuilder append(CharSequence charSequence) {
        return charSequence == null ? this : append(charSequence, 0, charSequence.length());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder
    public SpaceInsertingSequenceBuilder append(CharSequence charSequence, int i6) {
        return charSequence == null ? this : append(charSequence, i6, charSequence.length());
    }
}
