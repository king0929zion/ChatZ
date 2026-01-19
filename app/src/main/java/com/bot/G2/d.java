package G2;

import A4.Q;
import A4.W;
import A4.g0;
import android.app.LocaleManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import androidx.lifecycle.N;
import com.tencent.mmkv.MMKV;
import java.util.Locale;
import m4.AbstractC1276k;
import org.jsoup.nodes.DocumentType;

/* loaded from: classes.dex */
public final class d {
    public static final c Companion = new Object();
    public final Context a;

    /* renamed from: b, reason: collision with root package name */
    public final MMKV f1653b;

    /* renamed from: c, reason: collision with root package name */
    public final g0 f1654c;

    /* renamed from: d, reason: collision with root package name */
    public final Q f1655d;

    /* renamed from: e, reason: collision with root package name */
    public final g0 f1656e;

    /* renamed from: f, reason: collision with root package name */
    public final Q f1657f;

    public d(Context context, MMKV mmkv) {
        e eVar;
        AbstractC1276k.f(mmkv, "mmkv");
        this.a = context;
        this.f1653b = mmkv;
        String str = DocumentType.SYSTEM_KEY;
        String decodeString = mmkv.decodeString("theme_mode", DocumentType.SYSTEM_KEY);
        try {
            eVar = e.valueOf(decodeString != null ? decodeString : str);
        } catch (Exception unused) {
            eVar = e.f1658c;
        }
        g0 b5 = W.b(eVar);
        this.f1654c = b5;
        this.f1655d = new Q(b5);
        MMKV mmkv2 = this.f1653b;
        a aVar = a.f1647f;
        String decodeString2 = mmkv2.decodeString("language", aVar.f1651c);
        i5.a.a.getClass();
        N.k(new Object[0]);
        a aVar2 = a.f1648g;
        if (!AbstractC1276k.b(decodeString2, aVar2.f1651c)) {
            aVar2 = a.f1649h;
            if (!AbstractC1276k.b(decodeString2, aVar2.f1651c)) {
                AbstractC1276k.b(decodeString2, aVar.f1651c);
                g0 b6 = W.b(aVar);
                this.f1656e = b6;
                this.f1657f = new Q(b6);
            }
        }
        aVar = aVar2;
        g0 b62 = W.b(aVar);
        this.f1656e = b62;
        this.f1657f = new Q(b62);
    }

    public final void a(Locale locale) {
        Locale.setDefault(locale);
        if (Build.VERSION.SDK_INT < 33) {
            b(locale);
            return;
        }
        try {
            LocaleManager b5 = b.b(this.a.getSystemService(b.o()));
            if (b5 != null) {
                b5.setApplicationLocales(new LocaleList(locale));
            }
        } catch (Exception unused) {
            i5.a.a.getClass();
            N.z(new Object[0]);
            b(locale);
        }
    }

    public final void b(Locale locale) {
        Context context = this.a;
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(locale);
        context.getResources().updateConfiguration(configuration, context.getResources().getDisplayMetrics());
    }

    public final void c() {
        Locale locale = Resources.getSystem().getConfiguration().getLocales().get(0);
        AbstractC1276k.c(locale);
        Locale.setDefault(locale);
        if (Build.VERSION.SDK_INT < 33) {
            b(locale);
            return;
        }
        try {
            LocaleManager b5 = b.b(this.a.getSystemService(b.o()));
            if (b5 != null) {
                b5.setApplicationLocales(LocaleList.getEmptyLocaleList());
            }
        } catch (Exception unused) {
            i5.a.a.getClass();
            N.z(new Object[0]);
            b(locale);
        }
    }
}
