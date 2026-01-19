package N1;

import android.content.Context;
import com.bot.core.database.data.AppDatabase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import m4.AbstractC1276k;
import m4.AbstractC1289x;
import m4.C1270e;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: b, reason: collision with root package name */
    public final Context f3767b;

    /* renamed from: f, reason: collision with root package name */
    public M1.e f3771f;

    /* renamed from: g, reason: collision with root package name */
    public M1.e f3772g;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3780o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3781p;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f3769d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f3770e = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final u f3773h = u.f3783c;

    /* renamed from: i, reason: collision with root package name */
    public final long f3774i = -1;

    /* renamed from: j, reason: collision with root package name */
    public final F1.e f3775j = new F1.e(1);

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashSet f3776k = new LinkedHashSet();

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashSet f3777l = new LinkedHashSet();

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f3778m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public boolean f3779n = true;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f3782q = true;
    public final C1270e a = AbstractC1289x.a(AppDatabase.class);

    /* renamed from: c, reason: collision with root package name */
    public final String f3768c = "bothub.db";

    public s(Context context) {
        this.f3767b = context;
    }

    public final void a(B2.a... aVarArr) {
        AbstractC1276k.f(aVarArr, "migrations");
        for (B2.a aVar : aVarArr) {
            Integer valueOf = Integer.valueOf(aVar.a);
            LinkedHashSet linkedHashSet = this.f3777l;
            linkedHashSet.add(valueOf);
            linkedHashSet.add(Integer.valueOf(aVar.f498b));
        }
        B2.a[] aVarArr2 = (B2.a[]) Arrays.copyOf(aVarArr, aVarArr.length);
        F1.e eVar = this.f3775j;
        eVar.getClass();
        AbstractC1276k.f(aVarArr2, "migrations");
        for (B2.a aVar2 : aVarArr2) {
            eVar.b(aVar2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final N1.v b() {
        /*
            Method dump skipped, instructions count: 1063
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N1.s.b():N1.v");
    }
}
