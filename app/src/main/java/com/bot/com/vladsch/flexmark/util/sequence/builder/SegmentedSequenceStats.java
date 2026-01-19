package com.vladsch.flexmark.util.sequence.builder;

import H0.C;
import com.vladsch.flexmark.ast.util.g;
import com.vladsch.flexmark.parser.PegdownExtensions;
import com.vladsch.flexmark.util.misc.MinMaxAvgLong;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public class SegmentedSequenceStats {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final ArrayList<Integer> AGGR_STEPS;
    static final int MAX_BUCKETS;
    private ArrayList<StatsEntry> aggregatedStats;
    private final HashMap<StatsEntry, StatsEntry> stats = new HashMap<>();

    /* loaded from: classes.dex */
    public static class StatsEntry implements Comparable<StatsEntry> {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        int count;
        int segments;
        final MinMaxAvgLong segStats = new MinMaxAvgLong();
        final MinMaxAvgLong length = new MinMaxAvgLong();
        final MinMaxAvgLong overhead = new MinMaxAvgLong();

        public StatsEntry(int i6) {
            this.segments = i6;
        }

        public void add(int i6, int i7, int i8) {
            this.count++;
            this.segStats.add(i6);
            this.length.add(i7);
            this.overhead.add(i8);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.segments == ((StatsEntry) obj).segments;
        }

        public int hashCode() {
            return this.segments;
        }

        @Override // java.lang.Comparable
        public int compareTo(StatsEntry statsEntry) {
            int compare = Integer.compare(this.segments, statsEntry.segments);
            return compare != 0 ? compare : Integer.compare(this.count, statsEntry.count);
        }

        public void add(StatsEntry statsEntry) {
            this.count += statsEntry.count;
            this.segStats.add(statsEntry.segStats);
            this.length.add(statsEntry.length);
            this.overhead.add(statsEntry.overhead);
        }
    }

    static {
        ArrayList<Integer> arrayList = new ArrayList<>();
        AGGR_STEPS = arrayList;
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(8);
        arrayList.add(15);
        arrayList.add(16);
        arrayList.add(Integer.valueOf(PegdownExtensions.WIKILINKS));
        for (int i6 = 65536; i6 < 1048576; i6 += PegdownExtensions.SUPPRESS_HTML_BLOCKS) {
            AGGR_STEPS.add(Integer.valueOf(i6));
        }
        MAX_BUCKETS = AGGR_STEPS.size();
    }

    private SegmentedSequenceStats() {
    }

    public static SegmentedSequenceStats getInstance() {
        return new SegmentedSequenceStats();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ StatsEntry lambda$addStats$0(StatsEntry statsEntry) {
        return statsEntry;
    }

    public void addStats(int i6, int i7, int i8) {
        this.stats.computeIfAbsent(new StatsEntry(i6), new g(11)).add(i6, i7, i8);
    }

    public void clear() {
        this.stats.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
    
        if (r3.segments < r1) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
    
        if (r2 <= 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        r2 = r2 - 1;
        r1 = com.vladsch.flexmark.util.sequence.builder.SegmentedSequenceStats.AGGR_STEPS.get(r2).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        if (r3.segments < r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        r5 = r7.aggregatedStats.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        if (r5 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        r5 = new com.vladsch.flexmark.util.sequence.builder.SegmentedSequenceStats.StatsEntry(r1);
        r7.aggregatedStats.set(r2, r5);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<com.vladsch.flexmark.util.sequence.builder.SegmentedSequenceStats.StatsEntry> getAggregatedStats() {
        /*
            r7 = this;
            java.util.ArrayList<com.vladsch.flexmark.util.sequence.builder.SegmentedSequenceStats$StatsEntry> r0 = r7.aggregatedStats
            if (r0 != 0) goto L76
            java.util.List r0 = r7.getStats()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = com.vladsch.flexmark.util.sequence.builder.SegmentedSequenceStats.MAX_BUCKETS
            r1.<init>(r2)
            r7.aggregatedStats = r1
            int r2 = r2 + (-1)
            java.util.ArrayList<java.lang.Integer> r1 = com.vladsch.flexmark.util.sequence.builder.SegmentedSequenceStats.AGGR_STEPS
            java.lang.Object r1 = r1.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r3 = r0.size()
            r4 = 0
        L24:
            int r5 = com.vladsch.flexmark.util.sequence.builder.SegmentedSequenceStats.MAX_BUCKETS
            if (r4 >= r5) goto L31
            java.util.ArrayList<com.vladsch.flexmark.util.sequence.builder.SegmentedSequenceStats$StatsEntry> r5 = r7.aggregatedStats
            r6 = 0
            r5.add(r6)
            int r4 = r4 + 1
            goto L24
        L31:
            int r4 = r3 + (-1)
            if (r3 <= 0) goto L6c
            java.lang.Object r3 = r0.get(r4)
            com.vladsch.flexmark.util.sequence.builder.SegmentedSequenceStats$StatsEntry r3 = (com.vladsch.flexmark.util.sequence.builder.SegmentedSequenceStats.StatsEntry) r3
            int r5 = r3.segments
            if (r5 >= r1) goto L53
        L3f:
            if (r2 <= 0) goto L53
            int r2 = r2 + (-1)
            java.util.ArrayList<java.lang.Integer> r1 = com.vladsch.flexmark.util.sequence.builder.SegmentedSequenceStats.AGGR_STEPS
            java.lang.Object r1 = r1.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r5 = r3.segments
            if (r5 < r1) goto L3f
        L53:
            java.util.ArrayList<com.vladsch.flexmark.util.sequence.builder.SegmentedSequenceStats$StatsEntry> r5 = r7.aggregatedStats
            java.lang.Object r5 = r5.get(r2)
            com.vladsch.flexmark.util.sequence.builder.SegmentedSequenceStats$StatsEntry r5 = (com.vladsch.flexmark.util.sequence.builder.SegmentedSequenceStats.StatsEntry) r5
            if (r5 != 0) goto L67
            com.vladsch.flexmark.util.sequence.builder.SegmentedSequenceStats$StatsEntry r5 = new com.vladsch.flexmark.util.sequence.builder.SegmentedSequenceStats$StatsEntry
            r5.<init>(r1)
            java.util.ArrayList<com.vladsch.flexmark.util.sequence.builder.SegmentedSequenceStats$StatsEntry> r6 = r7.aggregatedStats
            r6.set(r2, r5)
        L67:
            r5.add(r3)
            r3 = r4
            goto L31
        L6c:
            java.util.ArrayList<com.vladsch.flexmark.util.sequence.builder.SegmentedSequenceStats$StatsEntry> r0 = r7.aggregatedStats
            com.vladsch.flexmark.util.sequence.builder.b r1 = new com.vladsch.flexmark.util.sequence.builder.b
            r1.<init>()
            r0.removeIf(r1)
        L76:
            java.util.ArrayList<com.vladsch.flexmark.util.sequence.builder.SegmentedSequenceStats$StatsEntry> r0 = r7.aggregatedStats
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vladsch.flexmark.util.sequence.builder.SegmentedSequenceStats.getAggregatedStats():java.util.List");
    }

    public String getAggregatedStatsText() {
        return getStatsText(getAggregatedStats());
    }

    public int getCount(int i6) {
        StatsEntry statsEntry = new StatsEntry(i6);
        if (this.stats.containsKey(statsEntry)) {
            return this.stats.get(statsEntry).count;
        }
        return 0;
    }

    public List<StatsEntry> getStats() {
        ArrayList arrayList = new ArrayList(this.stats.keySet());
        arrayList.sort(new C(4));
        return arrayList;
    }

    public String getStatsText(List<StatsEntry> list) {
        Long l3;
        Integer num;
        int i6;
        double total;
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        sb.append(String.format("%10s,%10s,%10s,%10s,%10s,%10s,%10s,%10s,%10s,%10s,%10s,%10s,%10s,%8s", "count", "min-seg", "avg-seg", "max-seg", "min-len", "avg-len", "max-len", "min-ovr", "avg-ovr", "max-ovr", "tot-len", "tot-chr", "tot-ovr", "ovr %"));
        sb.append(SequenceUtils.EOL);
        while (true) {
            int i7 = size - 1;
            if (size > 0) {
                StatsEntry statsEntry = list.get(i7);
                Integer valueOf = Integer.valueOf(statsEntry.count);
                Long valueOf2 = Long.valueOf(statsEntry.count == 1 ? statsEntry.segments : statsEntry.segStats.getMin());
                int i8 = statsEntry.count;
                Long valueOf3 = Long.valueOf(i8 == 1 ? statsEntry.segments : statsEntry.segStats.getAvg(i8));
                Long valueOf4 = Long.valueOf(statsEntry.count == 1 ? statsEntry.segments : statsEntry.segStats.getMax());
                Long valueOf5 = Long.valueOf(statsEntry.length.getMin());
                Long valueOf6 = Long.valueOf(statsEntry.length.getAvg(statsEntry.count));
                Long valueOf7 = Long.valueOf(statsEntry.length.getMax());
                Long valueOf8 = Long.valueOf(statsEntry.overhead.getMin());
                Long valueOf9 = Long.valueOf(statsEntry.overhead.getAvg(statsEntry.count));
                Long valueOf10 = Long.valueOf(statsEntry.overhead.getMax());
                Long valueOf11 = Long.valueOf(statsEntry.length.getTotal());
                Long valueOf12 = Long.valueOf(statsEntry.length.getTotal() * 2);
                Long valueOf13 = Long.valueOf(statsEntry.overhead.getTotal());
                if (statsEntry.length.getTotal() == 0) {
                    i6 = i7;
                    total = 0.0d;
                    l3 = valueOf2;
                    num = valueOf;
                } else {
                    l3 = valueOf2;
                    num = valueOf;
                    i6 = i7;
                    total = ((statsEntry.overhead.getTotal() * 100.0d) / statsEntry.length.getTotal()) / 2.0d;
                }
                sb.append(String.format("%10d,%10d,%10d,%10d,%10d,%10d,%10d,%10d,%10d,%10d,%10d,%10d,%10d,%8.3f", num, l3, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, valueOf13, Double.valueOf(total)));
                sb.append(SequenceUtils.EOL);
                size = i6;
            } else {
                return sb.toString();
            }
        }
    }

    public String getStatsText() {
        return getStatsText(getStats());
    }
}
