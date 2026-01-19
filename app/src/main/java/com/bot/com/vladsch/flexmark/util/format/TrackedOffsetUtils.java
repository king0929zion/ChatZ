package com.vladsch.flexmark.util.format;

/* loaded from: classes.dex */
public class TrackedOffsetUtils {
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void resolveTrackedOffsets(com.vladsch.flexmark.util.sequence.BasedSequence r17, com.vladsch.flexmark.util.sequence.LineAppendable r18, java.util.List<com.vladsch.flexmark.util.format.TrackedOffset> r19, int r20, boolean r21) {
        /*
            boolean r0 = r19.isEmpty()
            if (r0 != 0) goto Lf2
            r0 = r17
            r1 = r19
            com.vladsch.flexmark.util.format.TrackedOffsetList r1 = com.vladsch.flexmark.util.format.TrackedOffsetList.create(r0, r1)
            int r2 = r1.size()
            com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder r3 = r18.getBuilder()
            boolean r4 = r3 instanceof com.vladsch.flexmark.util.sequence.builder.SequenceBuilder
            if (r4 == 0) goto L21
            com.vladsch.flexmark.util.sequence.builder.SequenceBuilder r3 = (com.vladsch.flexmark.util.sequence.builder.SequenceBuilder) r3
            com.vladsch.flexmark.util.sequence.BasedSequence r0 = r3.getBaseSequence()
            goto L25
        L21:
            com.vladsch.flexmark.util.sequence.BasedSequence r0 = r0.getBaseSequence()
        L25:
            int r3 = r18.getLineCount()
            r4 = 0
            r5 = r18
            r6 = r20
            java.lang.Iterable r3 = r5.getLinesInfo(r6, r4, r3)
            java.util.Iterator r3 = r3.iterator()
            r5 = r4
        L37:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto Lf2
            java.lang.Object r6 = r3.next()
            com.vladsch.flexmark.util.sequence.LineInfo r6 = (com.vladsch.flexmark.util.sequence.LineInfo) r6
            com.vladsch.flexmark.util.sequence.BasedSequence r7 = r6.getLine()
            int r8 = r7.getStartOffset()
            int r9 = r7.getEndOffset()
            com.vladsch.flexmark.util.format.TrackedOffsetList r8 = r1.getTrackedOffsets(r8, r9)
            boolean r9 = r8.isEmpty()
            if (r9 != 0) goto Leb
            java.util.Iterator r8 = r8.iterator()
        L5d:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto Leb
            java.lang.Object r9 = r8.next()
            com.vladsch.flexmark.util.format.TrackedOffset r9 = (com.vladsch.flexmark.util.format.TrackedOffset) r9
            com.vladsch.flexmark.util.sequence.builder.tree.BasedOffsetTracker r10 = com.vladsch.flexmark.util.sequence.builder.tree.BasedOffsetTracker.create(r7)
            boolean r11 = r9.isResolved()
            if (r11 != 0) goto L5d
            int r11 = r9.getOffset()
            com.vladsch.flexmark.util.misc.CharPredicate r12 = com.vladsch.flexmark.util.misc.CharPredicate.WHITESPACE
            boolean r13 = r0.isCharAt(r11, r12)
            r14 = 1
            if (r13 == 0) goto L93
            int r15 = r11 + (-1)
            boolean r16 = r0.isCharAt(r15, r12)
            if (r16 != 0) goto L93
            com.vladsch.flexmark.util.sequence.builder.tree.OffsetInfo r10 = r10.getOffsetInfo(r15, r4)
            int r10 = r10.endIndex
            int r10 = r10 + r5
            r9.setIndex(r10)
            goto Lb2
        L93:
            if (r13 != 0) goto La8
            int r13 = r11 + 1
            boolean r12 = r0.isCharAt(r13, r12)
            if (r12 == 0) goto La8
            com.vladsch.flexmark.util.sequence.builder.tree.OffsetInfo r10 = r10.getOffsetInfo(r11, r4)
            int r10 = r10.startIndex
            int r10 = r10 + r5
            r9.setIndex(r10)
            goto Lb2
        La8:
            com.vladsch.flexmark.util.sequence.builder.tree.OffsetInfo r10 = r10.getOffsetInfo(r11, r14)
            int r10 = r10.endIndex
            int r10 = r10 + r5
            r9.setIndex(r10)
        Lb2:
            if (r21 == 0) goto Le7
            java.io.PrintStream r10 = java.lang.System.out
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            int r9 = r9.getIndex()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
            int r13 = r6.index
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            com.vladsch.flexmark.util.sequence.builder.SequenceBuilder r15 = r7.getBuilder()
            com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder r15 = r15.append(r7)
            com.vladsch.flexmark.util.sequence.builder.SequenceBuilder r15 = (com.vladsch.flexmark.util.sequence.builder.SequenceBuilder) r15
            java.lang.String r14 = r15.toStringWithRanges(r14)
            java.lang.Object[] r9 = new java.lang.Object[]{r11, r9, r12, r13, r14}
            java.lang.String r11 = "Resolved %d to %d, start: %d, in line[%d]: '%s'"
            java.lang.String r9 = java.lang.String.format(r11, r9)
            r10.println(r9)
        Le7:
            int r2 = r2 + (-1)
            goto L5d
        Leb:
            int r6 = r7.length()
            int r5 = r5 + r6
            if (r2 > 0) goto L37
        Lf2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vladsch.flexmark.util.format.TrackedOffsetUtils.resolveTrackedOffsets(com.vladsch.flexmark.util.sequence.BasedSequence, com.vladsch.flexmark.util.sequence.LineAppendable, java.util.List, int, boolean):void");
    }
}
