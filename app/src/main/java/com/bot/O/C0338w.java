package O;

import android.content.Context;
import android.view.textclassifier.TextClassificationContext;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import b4.InterfaceC0905c;
import x4.InterfaceC1942y;

/* renamed from: O.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0338w extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0341z f4235h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0338w(C0341z c0341z, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f4235h = c0341z;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0338w) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C0338w(this.f4235h, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        String str;
        TextClassificationContext build;
        TextClassifier createTextClassificationSession;
        X3.a.e(obj);
        C0341z c0341z = this.f4235h;
        Context context = c0341z.f4256b;
        E e6 = c0341z.f4257c;
        TextClassificationManager textClassificationManager = (TextClassificationManager) context.getSystemService(TextClassificationManager.class);
        int ordinal = e6.ordinal();
        if (ordinal == 0) {
            str = "edittext";
        } else {
            if (ordinal != 1) {
                throw new RuntimeException();
            }
            str = "textview";
        }
        I.u.D();
        build = I.u.i(context.getPackageName(), str).build();
        createTextClassificationSession = textClassificationManager.createTextClassificationSession(build);
        c0341z.f4260f = createTextClassificationSession;
        return createTextClassificationSession;
    }
}
