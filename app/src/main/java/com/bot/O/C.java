package O;

import T.AbstractC0623o0;
import T.C0616l;
import T.C0626q;
import T.e1;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.textclassifier.TextClassification;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b4.InterfaceC0910h;
import java.util.List;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public abstract class C {
    public static final e1 a = new AbstractC0623o0(new A(0));

    /* renamed from: b, reason: collision with root package name */
    public static final B f3918b = new B(0);

    public static final void a(F.a aVar, Context context, boolean z5, CharSequence charSequence, S0.O o5, C0341z c0341z, l4.c cVar) {
        List actions;
        List actions2;
        if (Build.VERSION.SDK_INT < 28 || charSequence == null || o5 == null || c0341z == null || !(c0341z instanceof C0341z)) {
            cVar.f(aVar);
            if (charSequence == null || o5 == null) {
                return;
            }
            E.b.a(aVar, context, z5, charSequence, o5.a);
            return;
        }
        long j3 = o5.a;
        Object obj = c0341z.f4262h;
        H4.c cVar2 = c0341z.f4259e;
        TextClassification textClassification = null;
        if (cVar2.g()) {
            D0 d02 = (D0) c0341z.f4261g.getValue();
            TextClassification textClassification2 = (d02 != null && S0.O.b(j3, d02.f3928b) && AbstractC1276k.b(charSequence, d02.a)) ? d02.f3929c : null;
            cVar2.c(null);
            textClassification = textClassification2;
        }
        if (textClassification == null) {
            cVar.f(aVar);
        } else {
            actions = textClassification.getActions();
            if (!actions.isEmpty()) {
                aVar.a.a(new G.h(obj, textClassification, 0));
            } else if ((textClassification.getIcon() != null || !TextUtils.isEmpty(textClassification.getLabel())) && (textClassification.getIntent() != null || textClassification.getOnClickListener() != null)) {
                aVar.a.a(new G.h(obj, textClassification, -1));
            }
            cVar.f(aVar);
            actions2 = textClassification.getActions();
            int size = actions2.size();
            for (int i6 = 0; i6 < size; i6++) {
                if (i6 > 0) {
                    aVar.a.a(new G.h(obj, textClassification, i6));
                }
            }
        }
        E.b.a(aVar, context, z5, charSequence, o5.a);
    }

    public static final C0341z b(E e6, Z0.b bVar, C0626q c0626q, int i6) {
        c0626q.b0(430530635);
        if (Build.VERSION.SDK_INT < 28) {
            c0626q.p(false);
            return null;
        }
        Context context = (Context) c0626q.j(AndroidCompositionLocals_androidKt.f10780b);
        InterfaceC0910h interfaceC0910h = (InterfaceC0910h) c0626q.j(a);
        boolean f6 = ((((i6 & 112) ^ 48) > 32 && c0626q.f(bVar)) || (i6 & 48) == 32) | c0626q.f(interfaceC0910h) | c0626q.f(context);
        Object P5 = c0626q.P();
        if (f6 || P5 == C0616l.a) {
            f3918b.getClass();
            P5 = new C0341z(interfaceC0910h, context, e6, bVar);
            c0626q.m0(P5);
        }
        C0341z c0341z = (C0341z) P5;
        c0626q.p(false);
        return c0341z;
    }
}
