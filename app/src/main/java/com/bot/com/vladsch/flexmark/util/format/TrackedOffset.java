package com.vladsch.flexmark.util.format;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.util.misc.BitFieldSet;
import com.vladsch.flexmark.util.sequence.SequenceUtils;

/* loaded from: classes.dex */
public final class TrackedOffset implements Comparable<TrackedOffset> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final int flags;
    private int index;
    private boolean isSpliced;
    private final int offset;
    private final TrackedOffset original;
    private int spacesAfter;
    private int spacesBefore;
    private static final int F_AFTER_SPACE_EDIT = BitFieldSet.intMask(Flags.AFTER_SPACE_EDIT);
    private static final int F_AFTER_INSERT = BitFieldSet.intMask(Flags.AFTER_INSERT);
    private static final int F_AFTER_DELETE = BitFieldSet.intMask(Flags.AFTER_DELETE);

    /* loaded from: classes.dex */
    public enum Flags {
        AFTER_SPACE_EDIT,
        AFTER_INSERT,
        AFTER_DELETE
    }

    private TrackedOffset(int i6, boolean z5, boolean z6, boolean z7) {
        this.original = null;
        this.offset = i6;
        int i7 = z5 ? F_AFTER_SPACE_EDIT : 0;
        i7 = z6 ? i7 | F_AFTER_INSERT : i7;
        this.flags = z7 ? i7 | F_AFTER_DELETE : i7;
        this.index = -1;
        this.spacesBefore = -1;
        this.spacesAfter = -1;
    }

    public static TrackedOffset track(TrackedOffset trackedOffset) {
        return new TrackedOffset(trackedOffset);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (TrackedOffset.class == obj.getClass() || (obj instanceof Integer))) {
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue() == this.offset;
            }
            if (this.offset == ((TrackedOffset) obj).offset) {
                return true;
            }
        }
        return false;
    }

    public int getIndex() {
        int i6 = this.index;
        return i6 == -1 ? this.offset : i6;
    }

    public int getOffset() {
        return this.offset;
    }

    public int getSpacesAfter() {
        return this.spacesAfter;
    }

    public int getSpacesBefore() {
        return this.spacesBefore;
    }

    public int hashCode() {
        return this.offset;
    }

    public boolean isAfterDelete() {
        return BitFieldSet.any(this.flags, F_AFTER_DELETE);
    }

    public boolean isAfterInsert() {
        return BitFieldSet.any(this.flags, F_AFTER_INSERT);
    }

    public boolean isAfterSpaceEdit() {
        return BitFieldSet.any(this.flags, F_AFTER_SPACE_EDIT);
    }

    public boolean isResolved() {
        return this.index != -1;
    }

    public boolean isSpliced() {
        return this.isSpliced;
    }

    public TrackedOffset plusOffsetDelta(int i6) {
        return new TrackedOffset(this, this.offset + i6);
    }

    public void setIndex(int i6) {
        TrackedOffset trackedOffset = this.original;
        if (trackedOffset != null) {
            trackedOffset.index = i6;
        }
        this.index = i6;
    }

    public void setSpacesAfter(int i6) {
        this.spacesAfter = i6;
    }

    public void setSpacesBefore(int i6) {
        this.spacesBefore = i6;
    }

    public void setSpliced(boolean z5) {
        this.isSpliced = z5;
    }

    public String toString() {
        String str;
        String str2;
        int i6 = this.offset;
        boolean isSpliced = isSpliced();
        String str3 = FlexmarkHtmlConverter.DEFAULT_NODE;
        String str4 = isSpliced ? " ><" : FlexmarkHtmlConverter.DEFAULT_NODE;
        int i7 = this.spacesBefore;
        if (i7 >= 0 || this.spacesAfter >= 0) {
            String num = i7 >= 0 ? Integer.toString(i7) : "?";
            int i8 = this.spacesAfter;
            str = SequenceUtils.SPACE + num + "|" + (i8 >= 0 ? Integer.toString(i8) : "?");
        } else {
            str = FlexmarkHtmlConverter.DEFAULT_NODE;
        }
        if (BitFieldSet.any(this.flags, F_AFTER_SPACE_EDIT | F_AFTER_INSERT | F_AFTER_DELETE)) {
            str2 = SequenceUtils.SPACE + (isAfterSpaceEdit() ? "s" : FlexmarkHtmlConverter.DEFAULT_NODE) + (isAfterInsert() ? FlexmarkHtmlConverter.I_NODE : FlexmarkHtmlConverter.DEFAULT_NODE) + (isAfterDelete() ? "d" : FlexmarkHtmlConverter.DEFAULT_NODE);
        } else {
            str2 = FlexmarkHtmlConverter.DEFAULT_NODE;
        }
        if (isResolved()) {
            str3 = B3.e.h(this.index, " -> ");
        }
        StringBuilder sb = new StringBuilder("{");
        sb.append(i6);
        sb.append(str4);
        sb.append(str);
        sb.append(str2);
        return B3.e.s(sb, str3, "}");
    }

    public TrackedOffset withOffset(int i6) {
        return new TrackedOffset(this, i6);
    }

    public static TrackedOffset track(int i6) {
        return track(i6, false, false, false);
    }

    @Override // java.lang.Comparable
    public int compareTo(TrackedOffset trackedOffset) {
        return Integer.compare(this.offset, trackedOffset.offset);
    }

    public static TrackedOffset track(int i6, Character ch, boolean z5) {
        boolean z6 = false;
        boolean z7 = ch != null && ch.charValue() == ' ';
        if (ch != null && !z5) {
            z6 = true;
        }
        return track(i6, z7, z6, z5);
    }

    public int compareTo(Integer num) {
        return Integer.compare(this.offset, num.intValue());
    }

    public static TrackedOffset track(int i6, boolean z5, boolean z6, boolean z7) {
        return new TrackedOffset(i6, z5, z6, z7);
    }

    public int compareTo(int i6) {
        return Integer.compare(this.offset, i6);
    }

    private TrackedOffset(TrackedOffset trackedOffset) {
        this.original = trackedOffset.original;
        this.offset = trackedOffset.offset;
        this.flags = trackedOffset.flags;
        this.index = -1;
        this.spacesBefore = trackedOffset.spacesBefore;
        this.spacesAfter = trackedOffset.spacesAfter;
    }

    private TrackedOffset(TrackedOffset trackedOffset, int i6) {
        this.original = trackedOffset;
        this.offset = i6;
        this.flags = trackedOffset.flags;
        this.index = -1;
        this.spacesBefore = trackedOffset.spacesBefore;
        this.spacesAfter = trackedOffset.spacesAfter;
    }
}
