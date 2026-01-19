package I0;

import A4.C0010k;
import T.AbstractC0633u;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import com.tencent.mmkv.R;
import i4.AbstractC1120d;
import java.util.LinkedHashMap;
import x4.AbstractC1888A;
import x4.AbstractC1898K;
import z4.C2057h;

/* loaded from: classes.dex */
public abstract class m1 {
    public static final LinkedHashMap a = new LinkedHashMap();

    public static final A4.e0 a(Context context) {
        A4.e0 e0Var;
        LinkedHashMap linkedHashMap = a;
        synchronized (linkedHashMap) {
            try {
                Object obj = linkedHashMap.get(context);
                if (obj == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    C2057h a6 = AbstractC1120d.a(-1, 6, null);
                    C0010k c0010k = new C0010k(new k1(contentResolver, uriFor, new l1(a6, AbstractC1120d.i(Looper.getMainLooper())), a6, context, null));
                    x4.t0 e6 = AbstractC1888A.e();
                    E4.e eVar = AbstractC1898K.a;
                    obj = A4.W.m(c0010k, new C4.c(Y4.d.P(e6, C4.o.a)), A4.Z.a(3), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    linkedHashMap.put(context, obj);
                }
                e0Var = (A4.e0) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return e0Var;
    }

    public static final AbstractC0633u b(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof AbstractC0633u) {
            return (AbstractC0633u) tag;
        }
        return null;
    }
}
