package com.vladsch.flexmark.formatter;

import D.f1;
import com.vladsch.flexmark.html.HtmlRenderer;
import com.vladsch.flexmark.util.ast.Document;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.ast.NodeRepository;
import com.vladsch.flexmark.util.ast.ReferenceNode;
import com.vladsch.flexmark.util.ast.ReferencingNode;
import com.vladsch.flexmark.util.data.DataHolder;
import com.vladsch.flexmark.util.data.DataKey;
import com.vladsch.flexmark.util.data.DataSet;
import com.vladsch.flexmark.util.format.options.ElementPlacement;
import com.vladsch.flexmark.util.format.options.ElementPlacementSort;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class NodeRepositoryFormatter<R extends NodeRepository<B>, B extends Node & ReferenceNode<R, B, N>, N extends Node & ReferencingNode<R, B>> implements PhasedNodeFormatter {
    public static final HashSet<FormattingPhase> FORMATTING_PHASES = new HashSet<>(Arrays.asList(FormattingPhase.COLLECT, FormattingPhase.DOCUMENT_TOP, FormattingPhase.DOCUMENT_BOTTOM));
    protected final B lastReference;
    protected final Comparator<B> myComparator;
    private final DataKey<Map<String, String>> myReferenceMapKey;
    private final DataKey<Map<String, String>> myReferenceUniqificationMapKey;
    protected boolean recheckUndefinedReferences;
    protected final List<B> referenceList;
    protected final R referenceRepository;
    private Map<String, String> referenceTranslationMap;
    protected Map<String, String> referenceUniqificationMap;
    protected boolean repositoryNodesDone;
    protected final HashSet<Node> unusedReferences;

    /* renamed from: com.vladsch.flexmark.formatter.NodeRepositoryFormatter$1 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$vladsch$flexmark$formatter$FormattingPhase;
        static final /* synthetic */ int[] $SwitchMap$com$vladsch$flexmark$formatter$RenderPurpose;
        static final /* synthetic */ int[] $SwitchMap$com$vladsch$flexmark$util$format$options$ElementPlacement;
        static final /* synthetic */ int[] $SwitchMap$com$vladsch$flexmark$util$format$options$ElementPlacementSort;

        static {
            int[] iArr = new int[ElementPlacement.values().length];
            $SwitchMap$com$vladsch$flexmark$util$format$options$ElementPlacement = iArr;
            try {
                iArr[ElementPlacement.AS_IS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$vladsch$flexmark$util$format$options$ElementPlacement[ElementPlacement.GROUP_WITH_FIRST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$vladsch$flexmark$util$format$options$ElementPlacement[ElementPlacement.GROUP_WITH_LAST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[ElementPlacementSort.values().length];
            $SwitchMap$com$vladsch$flexmark$util$format$options$ElementPlacementSort = iArr2;
            try {
                iArr2[ElementPlacementSort.AS_IS.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$vladsch$flexmark$util$format$options$ElementPlacementSort[ElementPlacementSort.SORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$vladsch$flexmark$util$format$options$ElementPlacementSort[ElementPlacementSort.SORT_UNUSED_LAST.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$vladsch$flexmark$util$format$options$ElementPlacementSort[ElementPlacementSort.SORT_DELETE_UNUSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$vladsch$flexmark$util$format$options$ElementPlacementSort[ElementPlacementSort.DELETE_UNUSED.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr3 = new int[FormattingPhase.values().length];
            $SwitchMap$com$vladsch$flexmark$formatter$FormattingPhase = iArr3;
            try {
                iArr3[FormattingPhase.COLLECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$vladsch$flexmark$formatter$FormattingPhase[FormattingPhase.DOCUMENT_TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$vladsch$flexmark$formatter$FormattingPhase[FormattingPhase.DOCUMENT_BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            int[] iArr4 = new int[RenderPurpose.values().length];
            $SwitchMap$com$vladsch$flexmark$formatter$RenderPurpose = iArr4;
            try {
                iArr4[RenderPurpose.TRANSLATION_SPANS.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$vladsch$flexmark$formatter$RenderPurpose[RenderPurpose.TRANSLATED_SPANS.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$vladsch$flexmark$formatter$RenderPurpose[RenderPurpose.TRANSLATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$vladsch$flexmark$formatter$RenderPurpose[RenderPurpose.FORMAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    public NodeRepositoryFormatter(DataHolder dataHolder, DataKey<Map<String, String>> dataKey, DataKey<Map<String, String>> dataKey2) {
        this.myReferenceMapKey = dataKey;
        this.myReferenceUniqificationMapKey = dataKey2;
        R repository = getRepository(dataHolder);
        this.referenceRepository = repository;
        List<B> values = repository.values();
        this.referenceList = values;
        this.lastReference = values.isEmpty() ? null : values.get(values.size() - 1);
        this.unusedReferences = new HashSet<>();
        this.recheckUndefinedReferences = HtmlRenderer.RECHECK_UNDEFINED_REFERENCES.get(dataHolder).booleanValue();
        this.repositoryNodesDone = false;
        this.myComparator = (Comparator<B>) new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void formatReferences(NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
        ArrayList arrayList = new ArrayList(this.referenceList);
        ElementPlacementSort referenceSort = getReferenceSort();
        int i6 = AnonymousClass1.$SwitchMap$com$vladsch$flexmark$util$format$options$ElementPlacementSort[referenceSort.ordinal()];
        int i7 = 0;
        if (i6 != 1) {
            if (i6 == 2) {
                arrayList.sort(getReferenceComparator());
            } else {
                if (i6 != 3 && i6 != 4 && i6 != 5) {
                    throw new IllegalStateException("Unexpected value: " + referenceSort);
                }
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList.size();
                int i8 = 0;
                while (i8 < size) {
                    Object obj = arrayList.get(i8);
                    i8++;
                    Node node = (Node) obj;
                    if (!this.unusedReferences.contains(node)) {
                        arrayList2.add(node);
                    } else if (!referenceSort.isDeleteUnused()) {
                        arrayList3.add(node);
                    }
                }
                if (referenceSort.isSort()) {
                    arrayList2.sort(getReferenceComparator());
                    if (!referenceSort.isDeleteUnused()) {
                        arrayList3.sort(getReferenceComparator());
                    }
                }
                arrayList.clear();
                arrayList.addAll(arrayList2);
                if (!referenceSort.isDeleteUnused()) {
                    arrayList.addAll(arrayList3);
                }
            }
        }
        markdownWriter.blankLine();
        int size2 = arrayList.size();
        while (i7 < size2) {
            Object obj2 = arrayList.get(i7);
            i7++;
            renderReferenceBlockUnique((Node) obj2, nodeFormatterContext, markdownWriter);
        }
        markdownWriter.blankLine();
        this.repositoryNodesDone = true;
    }

    public static /* synthetic */ int lambda$new$2(Object obj, Object obj2) {
        return ((Comparable) obj).compareTo(obj2);
    }

    public /* synthetic */ CharSequence lambda$renderReferenceBlockUnique$0(String str) {
        Map<String, String> map = this.referenceUniqificationMap;
        return map != null ? map.getOrDefault(str, str) : str;
    }

    public /* synthetic */ void lambda$uniquifyIds$3(NodeRepository nodeRepository, TranslationContext translationContext, Document document, int i6) {
        NodeRepository.transferReferences(nodeRepository, getRepository(document), true, this.myReferenceUniqificationMapKey.get(translationContext.getTranslationStore()));
    }

    private void renderReferenceBlockUnique(B b5, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
        if (nodeFormatterContext.getRenderPurpose() == RenderPurpose.TRANSLATED) {
            nodeFormatterContext.postProcessNonTranslating(new i(this, 0), new j(this, b5, nodeFormatterContext, markdownWriter, 0));
        } else {
            lambda$renderReferenceBlockUnique$1(b5, nodeFormatterContext, markdownWriter);
        }
    }

    @Override // com.vladsch.flexmark.formatter.PhasedNodeFormatter
    public Set<FormattingPhase> getFormattingPhases() {
        return FORMATTING_PHASES;
    }

    public Comparator<B> getReferenceComparator() {
        return this.myComparator;
    }

    public abstract ElementPlacement getReferencePlacement();

    public abstract ElementPlacementSort getReferenceSort();

    public abstract R getRepository(DataHolder dataHolder);

    public ElementPlacement getTranslationReferencePlacement(NodeFormatterContext nodeFormatterContext) {
        return nodeFormatterContext.isTransformingText() ? ElementPlacement.AS_IS : getReferencePlacement();
    }

    public boolean makeReferencesUnique() {
        return true;
    }

    public String modifyTransformedReference(String str, NodeFormatterContext nodeFormatterContext) {
        return str;
    }

    @Override // com.vladsch.flexmark.formatter.PhasedNodeFormatter
    public void renderDocument(NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter, Document document, FormattingPhase formattingPhase) {
        Node node;
        if (nodeFormatterContext.isTransformingText() && this.myReferenceMapKey != null) {
            if (nodeFormatterContext.getRenderPurpose() == RenderPurpose.TRANSLATION_SPANS) {
                nodeFormatterContext.getTranslationStore().set((DataKey<DataKey<Map<String, String>>>) this.myReferenceMapKey, (DataKey<Map<String, String>>) new HashMap());
            }
            this.referenceTranslationMap = this.myReferenceMapKey.get(nodeFormatterContext.getTranslationStore());
        }
        int i6 = AnonymousClass1.$SwitchMap$com$vladsch$flexmark$formatter$FormattingPhase[formattingPhase.ordinal()];
        if (i6 != 1) {
            if (i6 == 2) {
                if (getTranslationReferencePlacement(nodeFormatterContext) == ElementPlacement.DOCUMENT_TOP) {
                    formatReferences(nodeFormatterContext, markdownWriter);
                    return;
                }
                return;
            } else {
                if (i6 == 3 && getTranslationReferencePlacement(nodeFormatterContext) == ElementPlacement.DOCUMENT_BOTTOM) {
                    formatReferences(nodeFormatterContext, markdownWriter);
                    return;
                }
                return;
            }
        }
        this.referenceUniqificationMap = null;
        if (nodeFormatterContext.isTransformingText() && this.myReferenceUniqificationMapKey != null && makeReferencesUnique()) {
            if (nodeFormatterContext.getRenderPurpose() == RenderPurpose.TRANSLATION_SPANS && nodeFormatterContext.getMergeContext() != null) {
                uniquifyIds(nodeFormatterContext, markdownWriter, document);
            }
            this.referenceUniqificationMap = this.myReferenceUniqificationMapKey.get(nodeFormatterContext.getTranslationStore());
        }
        if (getTranslationReferencePlacement(nodeFormatterContext).isChange() && getReferenceSort().isUnused()) {
            this.unusedReferences.addAll(this.referenceList);
            Set<Class<?>> nodeClasses = getNodeClasses();
            if (nodeClasses != null) {
                for (Node node2 : nodeFormatterContext.nodesOfType(nodeClasses)) {
                    B b5 = this.lastReference;
                    Object referencingNode = b5 == null ? null : ((ReferenceNode) b5).getReferencingNode(node2);
                    if (referencingNode != null && (node = (Node) ((ReferencingNode) referencingNode).getReferenceNode((ReferencingNode) this.referenceRepository)) != null) {
                        this.unusedReferences.remove(node);
                    }
                }
            }
        }
    }

    public void renderReference(B b5, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
        if (this.repositoryNodesDone) {
            return;
        }
        int i6 = AnonymousClass1.$SwitchMap$com$vladsch$flexmark$util$format$options$ElementPlacement[getTranslationReferencePlacement(nodeFormatterContext).ordinal()];
        if (i6 == 1) {
            renderReferenceBlockUnique(b5, nodeFormatterContext, markdownWriter);
            if (b5.getNext() == null || b5.getNext().getClass() != b5.getClass()) {
                markdownWriter.blankLine();
                return;
            }
            return;
        }
        if (i6 == 2) {
            formatReferences(nodeFormatterContext, markdownWriter);
        } else if (i6 == 3 && b5 == this.lastReference) {
            formatReferences(nodeFormatterContext, markdownWriter);
        }
    }

    /* renamed from: renderReferenceBlock */
    public abstract void lambda$renderReferenceBlockUnique$1(B b5, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter);

    public String transformReferenceId(String str, NodeFormatterContext nodeFormatterContext) {
        String charSequence;
        Map<String, String> map;
        if (!nodeFormatterContext.isTransformingText()) {
            return str;
        }
        int i6 = AnonymousClass1.$SwitchMap$com$vladsch$flexmark$formatter$RenderPurpose[nodeFormatterContext.getRenderPurpose().ordinal()];
        if (i6 != 1 && i6 != 2) {
            if (i6 != 3) {
                return str;
            }
            String charSequence2 = nodeFormatterContext.transformNonTranslating(null, modifyTransformedReference(str, nodeFormatterContext), null, null).toString();
            return (nodeFormatterContext.isPostProcessingNonTranslating() || (map = this.referenceUniqificationMap) == null || !map.containsKey(charSequence2)) ? charSequence2 : this.referenceUniqificationMap.get(charSequence2);
        }
        Map<String, String> map2 = this.referenceTranslationMap;
        if (map2 == null) {
            charSequence = nodeFormatterContext.transformNonTranslating(null, str, null, null).toString();
        } else if (map2.containsKey(str)) {
            charSequence = this.referenceTranslationMap.get(str);
        } else {
            String charSequence3 = nodeFormatterContext.transformNonTranslating(null, str, null, null).toString();
            this.referenceTranslationMap.put(str, charSequence3);
            charSequence = charSequence3;
        }
        return modifyTransformedReference(charSequence, nodeFormatterContext);
    }

    public void uniquifyIds(NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter, Document document) {
        R repository = getRepository(new DataSet());
        HashMap hashMap = new HashMap();
        nodeFormatterContext.getMergeContext().forEachPrecedingDocument(document, new f1(this, repository));
        Iterator it = getRepository(document).entrySet().iterator();
        while (it.hasNext()) {
            String str = (String) ((Map.Entry) it.next()).getKey();
            int i6 = 0;
            String str2 = str;
            while (repository.containsKey(str2)) {
                i6++;
                str2 = String.format("%s%d", str, Integer.valueOf(i6));
            }
            if (i6 > 0) {
                hashMap.put(str, str2);
            }
        }
        if (hashMap.isEmpty()) {
            return;
        }
        nodeFormatterContext.getTranslationStore().set((DataKey<DataKey<Map<String, String>>>) this.myReferenceUniqificationMapKey, (DataKey<Map<String, String>>) hashMap);
    }
}
