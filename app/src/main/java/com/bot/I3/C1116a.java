package i3;

import com.vladsch.flexmark.util.builder.BuilderBase;
import com.vladsch.flexmark.util.misc.Extension;
import java.util.Collection;
import java.util.function.Predicate;
import org.jsoup.nodes.Node;

/* renamed from: i3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1116a implements Predicate {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12083b;

    public /* synthetic */ C1116a(Object obj, int i6) {
        this.a = i6;
        this.f12083b = obj;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return BuilderBase.b((Collection) this.f12083b, (Extension) obj);
            default:
                return ((Class) this.f12083b).isInstance((Node) obj);
        }
    }
}
