package O;

import T.C0607g0;
import android.content.Context;
import android.os.LocaleList;
import android.view.textclassifier.TextClassifier;
import b4.InterfaceC0910h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import x4.AbstractC1888A;

/* renamed from: O.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0341z {
    public final InterfaceC0910h a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f4256b;

    /* renamed from: c, reason: collision with root package name */
    public final E f4257c;

    /* renamed from: d, reason: collision with root package name */
    public final Z0.b f4258d;

    /* renamed from: f, reason: collision with root package name */
    public TextClassifier f4260f;

    /* renamed from: e, reason: collision with root package name */
    public final H4.c f4259e = new H4.c();

    /* renamed from: g, reason: collision with root package name */
    public final C0607g0 f4261g = T.r.A(null);

    /* renamed from: h, reason: collision with root package name */
    public final Object f4262h = new Object();

    public C0341z(InterfaceC0910h interfaceC0910h, Context context, E e6, Z0.b bVar) {
        this.a = interfaceC0910h;
        this.f4256b = context;
        this.f4257c = e6;
        this.f4258d = bVar;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b A[Catch: all -> 0x00e8, TryCatch #1 {all -> 0x00e8, blocks: (B:24:0x0073, B:26:0x007b, B:28:0x0087), top: B:23:0x0073 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(O.C0341z r16, java.lang.CharSequence r17, long r18, android.view.textclassifier.TextClassifier r20, d4.c r21) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O.C0341z.a(O.z, java.lang.CharSequence, long, android.view.textclassifier.TextClassifier, d4.c):java.lang.Object");
    }

    public final LocaleList b() {
        Z0.b bVar = this.f4258d;
        if (bVar == null) {
            return new LocaleList(((Z0.a) Z0.c.a.h().f9855c.get(0)).a);
        }
        ArrayList arrayList = new ArrayList(Y3.n.Z(bVar, 10));
        Iterator it = bVar.f9855c.iterator();
        while (it.hasNext()) {
            arrayList.add(((Z0.a) it.next()).a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }

    public final Object c(CharSequence charSequence, long j3, d4.i iVar) {
        if (charSequence.length() == 0 || S0.O.c(j3)) {
            return X3.y.a;
        }
        return AbstractC1888A.H(this.a, new C0339x(this, new C0335u(j3, this, null, charSequence), null), iVar);
    }
}
