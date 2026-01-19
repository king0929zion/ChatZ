package com.vladsch.flexmark.util.sequence;

import com.vladsch.flexmark.util.sequence.builder.IBasedSegmentBuilder;

/* loaded from: classes.dex */
public interface BasedUtils {

    /* renamed from: com.vladsch.flexmark.util.sequence.BasedUtils$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ boolean $assertionsDisabled = false;
    }

    static BasedSequence asBased(CharSequence charSequence) {
        return BasedSequence.of(charSequence);
    }

    static void generateSegments(IBasedSegmentBuilder<?> iBasedSegmentBuilder, BasedSequence basedSequence) {
        boolean z5;
        int length = basedSequence.length();
        int i6 = 0;
        int i7 = -1;
        int i8 = -1;
        boolean z6 = false;
        StringBuilder sb = null;
        while (true) {
            z5 = true;
            if (i6 >= length) {
                break;
            }
            int indexOffset = basedSequence.getIndexOffset(i6);
            if (indexOffset >= 0) {
                if (i7 != -1) {
                    int i9 = i8 + 1;
                    if (indexOffset > i9) {
                        iBasedSegmentBuilder.append(i7, i9);
                    }
                    i8 = indexOffset;
                } else if (sb != null) {
                    if (!z6) {
                        iBasedSegmentBuilder.appendAnchor(basedSequence.getStartOffset());
                        z6 = true;
                    }
                    iBasedSegmentBuilder.append(sb.toString());
                    sb = null;
                }
                i7 = indexOffset;
                i8 = indexOffset;
            } else {
                if (i7 != -1) {
                    iBasedSegmentBuilder.append(i7, i8 + 1);
                    i7 = -1;
                    i8 = -1;
                    z6 = true;
                }
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append(basedSequence.charAt(i6));
            }
            i6++;
        }
        if (i7 != -1) {
            iBasedSegmentBuilder.append(i7, i8 + 1);
            z6 = true;
        }
        if (sb != null) {
            if (z6) {
                z5 = z6;
            } else {
                iBasedSegmentBuilder.appendAnchor(basedSequence.getStartOffset());
            }
            iBasedSegmentBuilder.append(sb.toString());
            iBasedSegmentBuilder.appendAnchor(basedSequence.getEndOffset());
            z6 = z5;
        }
        if (z6) {
            return;
        }
        if (!AnonymousClass1.$assertionsDisabled && basedSequence.length() != 0) {
            throw new AssertionError();
        }
        iBasedSegmentBuilder.appendAnchor(basedSequence.getStartOffset());
    }
}
