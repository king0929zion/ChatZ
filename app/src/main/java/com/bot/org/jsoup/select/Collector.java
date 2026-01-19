package org.jsoup.select;

import java.util.stream.Collectors;
import org.jsoup.nodes.Element;

/* loaded from: classes.dex */
public class Collector {
    private Collector() {
    }

    public static Elements collect(Evaluator evaluator, Element element) {
        evaluator.reset();
        return (Elements) element.stream().filter(evaluator.asPredicate(element)).collect(Collectors.toCollection(new c(1)));
    }

    public static Element findFirst(Evaluator evaluator, Element element) {
        evaluator.reset();
        return element.stream().filter(evaluator.asPredicate(element)).findFirst().orElse(null);
    }
}
