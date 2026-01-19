package c;

import T.B;
import T.C0626q;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b.InterfaceC0854C;
import com.tencent.mmkv.R;
import io.ktor.utils.io.u;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public abstract class k {
    public static final B a = new B(C0916d.f11070h);

    public static InterfaceC0854C a(C0626q c0626q) {
        InterfaceC0854C interfaceC0854C = (InterfaceC0854C) c0626q.j(a);
        Object obj = null;
        if (interfaceC0854C == null) {
            c0626q.b0(544166745);
            View view = (View) c0626q.j(AndroidCompositionLocals_androidKt.f10784f);
            AbstractC1276k.f(view, "<this>");
            while (true) {
                if (view == null) {
                    interfaceC0854C = null;
                    break;
                }
                Object tag = view.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                InterfaceC0854C interfaceC0854C2 = tag instanceof InterfaceC0854C ? (InterfaceC0854C) tag : null;
                if (interfaceC0854C2 != null) {
                    interfaceC0854C = interfaceC0854C2;
                    break;
                }
                Object j3 = u.j(view);
                view = j3 instanceof View ? (View) j3 : null;
            }
            c0626q.p(false);
        } else {
            c0626q.b0(544164296);
            c0626q.p(false);
        }
        if (interfaceC0854C != null) {
            c0626q.b0(544164377);
            c0626q.p(false);
            return interfaceC0854C;
        }
        c0626q.b0(544168748);
        Context context = (Context) c0626q.j(AndroidCompositionLocals_androidKt.f10780b);
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                break;
            }
            if (context instanceof InterfaceC0854C) {
                obj = context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        InterfaceC0854C interfaceC0854C3 = (InterfaceC0854C) obj;
        c0626q.p(false);
        return interfaceC0854C3;
    }
}
