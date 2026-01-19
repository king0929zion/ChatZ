package com.vladsch.flexmark.ast.util;

import com.vladsch.flexmark.ast.LinkRefDerived;
import com.vladsch.flexmark.parser.internal.InlineParserImpl;
import com.vladsch.flexmark.parser.internal.PostProcessorManager;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.ast.NodeClassifierVisitor;
import com.vladsch.flexmark.util.builder.BuilderBase;
import com.vladsch.flexmark.util.data.DataKeyBase;
import com.vladsch.flexmark.util.dependency.Dependent;
import com.vladsch.flexmark.util.dependency.DependentItemMap;
import com.vladsch.flexmark.util.format.TrackedOffset;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import com.vladsch.flexmark.util.sequence.builder.SegmentedSequenceStats;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import v.AbstractC1787b;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements Function {
    public final /* synthetic */ int a;

    public /* synthetic */ g(int i6) {
        this.a = i6;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        SegmentedSequenceStats.StatsEntry lambda$addStats$0;
        switch (this.a) {
            case 0:
                return Parsing.c((String) obj);
            case 1:
                return ((DataKeyBase) obj).getName();
            case 2:
                return InlineParserImpl.a((Character) obj);
            case 3:
                return InlineParserImpl.b((LinkRefDerived) obj);
            case 4:
                return InlineParserImpl.c((LinkRefDerived) obj);
            case AbstractC1787b.f15290g /* 5 */:
                return PostProcessorManager.prioritizePostProcessors((DependentItemMap) obj);
            case 6:
                return NodeClassifierVisitor.a((BitSet) obj);
            case 7:
                return ((Node) obj).getClass();
            case 8:
                return ((Dependent) obj).getClass();
            case AbstractC1787b.f15287d /* 9 */:
                return Integer.valueOf(((TrackedOffset) obj).getOffset());
            case AbstractC1787b.f15289f /* 10 */:
                return SequenceUtils.toVisibleWhitespaceString((CharSequence) obj);
            case 11:
                lambda$addStats$0 = SegmentedSequenceStats.lambda$addStats$0((SegmentedSequenceStats.StatsEntry) obj);
                return lambda$addStats$0;
            case 12:
                return BuilderBase.a((Class) obj);
            default:
                return Collections.unmodifiableList((List) obj);
        }
    }
}
