package a4;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import java.util.Comparator;
import m4.AbstractC1276k;

/* renamed from: a4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0826a implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final C0826a f10778b = new C0826a(0);

    /* renamed from: c, reason: collision with root package name */
    public static final C0826a f10779c = new C0826a(1);
    public final /* synthetic */ int a;

    public /* synthetic */ C0826a(int i6) {
        this.a = i6;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                AbstractC1276k.f(comparable, FlexmarkHtmlConverter.A_NODE);
                AbstractC1276k.f(comparable2, FlexmarkHtmlConverter.B_NODE);
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                AbstractC1276k.f(comparable3, FlexmarkHtmlConverter.A_NODE);
                AbstractC1276k.f(comparable4, FlexmarkHtmlConverter.B_NODE);
                return comparable4.compareTo(comparable3);
        }
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.a) {
            case 0:
                return f10779c;
            default:
                return f10778b;
        }
    }
}
