package P0;

import com.vladsch.flexmark.parser.PegdownExtensions;
import i0.C1065d;
import i0.C1067f;
import i0.InterfaceC1075n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import m4.AbstractC1277l;
import o0.L;
import v.AbstractC1787b;

/* loaded from: classes.dex */
public final class k extends AbstractC1277l implements l4.e {

    /* renamed from: f, reason: collision with root package name */
    public static final k f4442f;

    /* renamed from: g, reason: collision with root package name */
    public static final k f4443g;

    /* renamed from: h, reason: collision with root package name */
    public static final k f4444h;

    /* renamed from: i, reason: collision with root package name */
    public static final k f4445i;

    /* renamed from: j, reason: collision with root package name */
    public static final k f4446j;

    /* renamed from: k, reason: collision with root package name */
    public static final k f4447k;

    /* renamed from: l, reason: collision with root package name */
    public static final k f4448l;

    /* renamed from: m, reason: collision with root package name */
    public static final k f4449m;

    /* renamed from: n, reason: collision with root package name */
    public static final k f4450n;

    /* renamed from: o, reason: collision with root package name */
    public static final k f4451o;

    /* renamed from: p, reason: collision with root package name */
    public static final k f4452p;

    /* renamed from: q, reason: collision with root package name */
    public static final k f4453q;

    /* renamed from: r, reason: collision with root package name */
    public static final k f4454r;

    /* renamed from: s, reason: collision with root package name */
    public static final k f4455s;

    /* renamed from: t, reason: collision with root package name */
    public static final k f4456t;

    /* renamed from: u, reason: collision with root package name */
    public static final k f4457u;

    /* renamed from: v, reason: collision with root package name */
    public static final k f4458v;

    /* renamed from: w, reason: collision with root package name */
    public static final k f4459w;

    /* renamed from: x, reason: collision with root package name */
    public static final k f4460x;

    /* renamed from: y, reason: collision with root package name */
    public static final k f4461y;

    /* renamed from: z, reason: collision with root package name */
    public static final k f4462z;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4463e;

    static {
        int i6 = 2;
        f4442f = new k(i6, 0);
        f4443g = new k(i6, 1);
        f4444h = new k(i6, 2);
        f4445i = new k(i6, 3);
        f4446j = new k(i6, 4);
        f4447k = new k(i6, 5);
        f4448l = new k(i6, 6);
        f4449m = new k(i6, 7);
        f4450n = new k(i6, 8);
        f4451o = new k(i6, 9);
        f4452p = new k(i6, 10);
        f4453q = new k(i6, 11);
        f4454r = new k(i6, 12);
        f4455s = new k(i6, 13);
        f4456t = new k(i6, 14);
        f4457u = new k(i6, 15);
        f4458v = new k(i6, 16);
        f4459w = new k(i6, 17);
        f4460x = new k(i6, 18);
        f4461y = new k(i6, 19);
        f4462z = new k(i6, 20);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i6, int i7) {
        super(i6);
        this.f4463e = i7;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        String str;
        X3.e eVar;
        switch (this.f4463e) {
            case 0:
                Collection collection = (List) obj;
                List list = (List) obj2;
                if (collection == null) {
                    collection = Y3.v.f9812c;
                }
                return Y3.m.z0(collection, list);
            case 1:
                return (C1065d) obj;
            case 2:
                List list2 = (List) obj;
                List list3 = (List) obj2;
                if (list2 == null) {
                    return list3;
                }
                ArrayList K0 = Y3.m.K0(list2);
                K0.addAll(list3);
                return K0;
            case 3:
                return (InterfaceC1075n) obj;
            case 4:
                return (C1067f) obj;
            case AbstractC1787b.f15290g /* 5 */:
                return (X3.y) obj;
            case 6:
                return (X3.y) obj;
            case 7:
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case 8:
                throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
            case AbstractC1787b.f15287d /* 9 */:
                return (X3.y) obj;
            case AbstractC1787b.f15289f /* 10 */:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 11:
                i iVar = (i) obj;
                int i6 = ((i) obj2).a;
                return iVar;
            case 12:
                return (L) obj;
            case 13:
                return (String) obj;
            case 14:
                List list4 = (List) obj;
                List list5 = (List) obj2;
                if (list4 == null) {
                    return list5;
                }
                ArrayList K02 = Y3.m.K0(list4);
                K02.addAll(list5);
                return K02;
            case 15:
                Float f6 = (Float) obj;
                ((Number) obj2).floatValue();
                return f6;
            case PegdownExtensions.AUTOLINKS /* 16 */:
                return (String) obj;
            case 17:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).booleanValue();
                return bool;
            case 18:
                a aVar = (a) obj;
                a aVar2 = (a) obj2;
                if (aVar == null || (str = aVar.a) == null) {
                    str = aVar2.a;
                }
                if (aVar == null || (eVar = aVar.f4430b) == null) {
                    eVar = aVar2.f4430b;
                }
                return new a(str, eVar);
            case 19:
                return obj == null ? obj2 : obj;
            default:
                p pVar = (p) obj2;
                Object valueOf = Float.valueOf(S.l.f7374V);
                m mVar = ((p) obj).f4499d;
                w wVar = t.f4541t;
                Object g3 = mVar.f4492c.g(wVar);
                if (g3 == null) {
                    g3 = valueOf;
                }
                float floatValue = ((Number) g3).floatValue();
                Object g6 = pVar.f4499d.f4492c.g(wVar);
                if (g6 != null) {
                    valueOf = g6;
                }
                return Integer.valueOf(Float.compare(floatValue, ((Number) valueOf).floatValue()));
        }
    }
}
