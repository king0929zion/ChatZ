package com.vladsch.flexmark.util.ast;

import com.vladsch.flexmark.util.data.DataHolder;
import com.vladsch.flexmark.util.data.DataKey;
import com.vladsch.flexmark.util.data.DataKeyBase;
import com.vladsch.flexmark.util.data.DataSet;
import com.vladsch.flexmark.util.data.DataValueFactory;
import com.vladsch.flexmark.util.data.MutableDataHolder;
import com.vladsch.flexmark.util.data.MutableDataSet;
import com.vladsch.flexmark.util.data.MutableDataSetter;
import com.vladsch.flexmark.util.data.NullableDataKey;
import com.vladsch.flexmark.util.misc.Utils;
import com.vladsch.flexmark.util.sequence.BasedSequence;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class Document extends Block implements MutableDataHolder {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final Document NULL = new Document(null, BasedSequence.NULL);
    private final MutableDataSet dataSet;

    public Document(DataHolder dataHolder, BasedSequence basedSequence) {
        super(basedSequence);
        this.dataSet = new MutableDataSet(dataHolder);
    }

    public static DataHolder aggregateActions(DataHolder dataHolder, DataHolder dataHolder2) {
        return DataSet.aggregateActions(dataHolder, dataHolder2);
    }

    public static MutableDataSet merge(DataHolder... dataHolderArr) {
        return MutableDataSet.merge(dataHolderArr);
    }

    public DataHolder aggregate() {
        return this.dataSet.aggregate();
    }

    @Override // com.vladsch.flexmark.util.data.MutableDataHolder
    public MutableDataHolder clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.vladsch.flexmark.util.data.DataHolder
    public boolean contains(DataKeyBase<?> dataKeyBase) {
        return this.dataSet.contains(dataKeyBase);
    }

    @Override // com.vladsch.flexmark.util.data.DataHolder
    public Map<? extends DataKeyBase<?>, Object> getAll() {
        return this.dataSet.getAll();
    }

    @Override // com.vladsch.flexmark.util.data.DataHolder
    public Collection<? extends DataKeyBase<?>> getKeys() {
        return this.dataSet.getKeys();
    }

    @Override // com.vladsch.flexmark.util.ast.ContentNode, com.vladsch.flexmark.util.ast.Content
    public int getLineCount() {
        List<BasedSequence> list = this.lineSegments;
        if (list != BasedSequence.EMPTY_LIST) {
            return list.size();
        }
        char lastChar = getChars().lastChar();
        return getLineNumber(getChars().length()) + ((lastChar == '\n' || lastChar == '\r') ? 0 : 1);
    }

    public int getLineNumber(int i6) {
        List<BasedSequence> list = this.lineSegments;
        int i7 = 0;
        if (list != BasedSequence.EMPTY_LIST) {
            int size = list.size();
            while (i7 < size) {
                if (i6 < this.lineSegments.get(i7).getEndOffset()) {
                    return i7;
                }
                i7++;
            }
            return size;
        }
        BasedSequence baseSubSequence = getChars().baseSubSequence(0, Utils.maxLimit(i6 + 1, getChars().length()));
        if (baseSubSequence.isEmpty()) {
            return 0;
        }
        int endOfLineAnyEOL = baseSubSequence.endOfLineAnyEOL(0);
        int length = baseSubSequence.length();
        while (endOfLineAnyEOL < length) {
            int eolStartLength = baseSubSequence.eolStartLength(endOfLineAnyEOL) + endOfLineAnyEOL;
            if (i6 >= eolStartLength) {
                i7++;
            }
            endOfLineAnyEOL = baseSubSequence.endOfLineAnyEOL(eolStartLength);
        }
        return i7;
    }

    @Override // com.vladsch.flexmark.util.data.MutableDataHolder, com.vladsch.flexmark.util.data.DataHolder
    public Object getOrCompute(DataKeyBase<?> dataKeyBase, DataValueFactory<?> dataValueFactory) {
        return this.dataSet.getOrCompute(dataKeyBase, dataValueFactory);
    }

    @Override // com.vladsch.flexmark.util.ast.Node
    public BasedSequence[] getSegments() {
        return Node.EMPTY_SEGMENTS;
    }

    @Override // com.vladsch.flexmark.util.data.MutableDataHolder
    public /* bridge */ /* synthetic */ MutableDataHolder remove(DataKeyBase dataKeyBase) {
        return remove((DataKeyBase<?>) dataKeyBase);
    }

    @Override // com.vladsch.flexmark.util.data.MutableDataHolder
    public <T> MutableDataHolder set(DataKey<T> dataKey, T t5) {
        return this.dataSet.set((DataKey<DataKey<T>>) dataKey, (DataKey<T>) t5);
    }

    @Override // com.vladsch.flexmark.util.data.MutableDataHolder, com.vladsch.flexmark.util.data.DataHolder, com.vladsch.flexmark.util.data.MutableDataSetter
    public MutableDataHolder setIn(MutableDataHolder mutableDataHolder) {
        return this.dataSet.setIn(mutableDataHolder);
    }

    public static DataHolder aggregate(DataHolder dataHolder, DataHolder dataHolder2) {
        return DataSet.aggregate(dataHolder, dataHolder2);
    }

    @Override // com.vladsch.flexmark.util.data.MutableDataHolder
    public MutableDataSet remove(DataKeyBase<?> dataKeyBase) {
        return this.dataSet.remove(dataKeyBase);
    }

    @Override // com.vladsch.flexmark.util.data.MutableDataHolder
    public <T> MutableDataHolder set(NullableDataKey<T> nullableDataKey, T t5) {
        return this.dataSet.set((NullableDataKey<NullableDataKey<T>>) nullableDataKey, (NullableDataKey<T>) t5);
    }

    @Override // com.vladsch.flexmark.util.data.MutableDataHolder
    public MutableDataSet setAll(DataHolder dataHolder) {
        return this.dataSet.setAll(dataHolder);
    }

    @Override // com.vladsch.flexmark.util.data.MutableDataHolder
    public MutableDataSet setFrom(MutableDataSetter mutableDataSetter) {
        return this.dataSet.setFrom(mutableDataSetter);
    }

    @Override // com.vladsch.flexmark.util.data.DataHolder
    public MutableDataSet toDataSet() {
        return this.dataSet.toDataSet();
    }

    @Override // com.vladsch.flexmark.util.data.DataHolder
    public DataSet toImmutable() {
        return this.dataSet.toImmutable();
    }

    @Override // com.vladsch.flexmark.util.data.DataHolder
    public MutableDataSet toMutable() {
        return this.dataSet.toMutable();
    }
}
