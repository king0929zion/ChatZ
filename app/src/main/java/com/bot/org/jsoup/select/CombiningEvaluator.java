package org.jsoup.select;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Element;

/* loaded from: classes.dex */
public abstract class CombiningEvaluator extends Evaluator {
    private static final Comparator<Evaluator> costComparator = new Object();
    int cost;
    final ArrayList<Evaluator> evaluators;
    int num;
    final ArrayList<Evaluator> sortedEvaluators;

    /* loaded from: classes.dex */
    public static final class And extends CombiningEvaluator {
        public And(Collection<Evaluator> collection) {
            super(collection);
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: matches */
        public boolean lambda$asPredicate$0(Element element, Element element2) {
            for (int i6 = 0; i6 < this.num; i6++) {
                if (!this.sortedEvaluators.get(i6).lambda$asPredicate$0(element, element2)) {
                    return false;
                }
            }
            return true;
        }

        public String toString() {
            return StringUtil.join(this.evaluators, FlexmarkHtmlConverter.DEFAULT_NODE);
        }

        public And(Evaluator... evaluatorArr) {
            this(Arrays.asList(evaluatorArr));
        }
    }

    public CombiningEvaluator() {
        this.num = 0;
        this.cost = 0;
        this.evaluators = new ArrayList<>();
        this.sortedEvaluators = new ArrayList<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$static$0(Evaluator evaluator, Evaluator evaluator2) {
        return evaluator.cost() - evaluator2.cost();
    }

    @Override // org.jsoup.select.Evaluator
    public int cost() {
        return this.cost;
    }

    public void replaceRightMostEvaluator(Evaluator evaluator) {
        this.evaluators.set(this.num - 1, evaluator);
        updateEvaluators();
    }

    @Override // org.jsoup.select.Evaluator
    public void reset() {
        ArrayList<Evaluator> arrayList = this.evaluators;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Evaluator evaluator = arrayList.get(i6);
            i6++;
            evaluator.reset();
        }
        super.reset();
    }

    public Evaluator rightMostEvaluator() {
        int i6 = this.num;
        if (i6 > 0) {
            return this.evaluators.get(i6 - 1);
        }
        return null;
    }

    public void updateEvaluators() {
        this.num = this.evaluators.size();
        int i6 = 0;
        this.cost = 0;
        ArrayList<Evaluator> arrayList = this.evaluators;
        int size = arrayList.size();
        while (i6 < size) {
            Evaluator evaluator = arrayList.get(i6);
            i6++;
            this.cost = evaluator.cost() + this.cost;
        }
        this.sortedEvaluators.clear();
        this.sortedEvaluators.addAll(this.evaluators);
        Collections.sort(this.sortedEvaluators, costComparator);
    }

    /* loaded from: classes.dex */
    public static final class Or extends CombiningEvaluator {
        public Or(Collection<Evaluator> collection) {
            if (this.num > 1) {
                this.evaluators.add(new And(collection));
            } else {
                this.evaluators.addAll(collection);
            }
            updateEvaluators();
        }

        public void add(Evaluator evaluator) {
            this.evaluators.add(evaluator);
            updateEvaluators();
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: matches */
        public boolean lambda$asPredicate$0(Element element, Element element2) {
            for (int i6 = 0; i6 < this.num; i6++) {
                if (this.sortedEvaluators.get(i6).lambda$asPredicate$0(element, element2)) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return StringUtil.join(this.evaluators, ", ");
        }

        public Or(Evaluator... evaluatorArr) {
            this(Arrays.asList(evaluatorArr));
        }

        public Or() {
        }
    }

    public CombiningEvaluator(Collection<Evaluator> collection) {
        this();
        this.evaluators.addAll(collection);
        updateEvaluators();
    }
}
