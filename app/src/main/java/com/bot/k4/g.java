package K4;

import D.C0056a;
import M4.AbstractC0252a0;
import M4.InterfaceC0264k;
import X3.n;
import Y3.B;
import Y3.C;
import Y3.m;
import Y3.v;
import Y3.y;
import Y3.z;
import com.vladsch.flexmark.util.html.Attribute;
import i4.AbstractC1117a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class g implements SerialDescriptor, InterfaceC0264k {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final Y4.l f2959b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2960c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f2961d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f2962e;

    /* renamed from: f, reason: collision with root package name */
    public final SerialDescriptor[] f2963f;

    /* renamed from: g, reason: collision with root package name */
    public final List[] f2964g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f2965h;

    /* renamed from: i, reason: collision with root package name */
    public final Map f2966i;

    /* renamed from: j, reason: collision with root package name */
    public final SerialDescriptor[] f2967j;

    /* renamed from: k, reason: collision with root package name */
    public final n f2968k;

    public g(String str, Y4.l lVar, int i6, List list, a aVar) {
        AbstractC1276k.f(str, "serialName");
        this.a = str;
        this.f2959b = lVar;
        this.f2960c = i6;
        ArrayList arrayList = aVar.f2941b;
        AbstractC1276k.f(arrayList, "<this>");
        HashSet hashSet = new HashSet(C.H(Y3.n.Z(arrayList, 12)));
        m.I0(arrayList, hashSet);
        this.f2961d = hashSet;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.f2962e = strArr;
        this.f2963f = AbstractC0252a0.c(aVar.f2943d);
        this.f2964g = (List[]) aVar.f2944e.toArray(new List[0]);
        ArrayList arrayList2 = aVar.f2945f;
        AbstractC1276k.f(arrayList2, "<this>");
        boolean[] zArr = new boolean[arrayList2.size()];
        Iterator it = arrayList2.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            zArr[i7] = ((Boolean) it.next()).booleanValue();
            i7++;
        }
        this.f2965h = zArr;
        AbstractC1276k.f(strArr, "<this>");
        i iVar = new i(new Y3.l(strArr, 0), 1);
        ArrayList arrayList3 = new ArrayList(Y3.n.Z(iVar, 10));
        Iterator it2 = iVar.iterator();
        while (true) {
            z zVar = (z) it2;
            if (!zVar.f9817e.hasNext()) {
                this.f2966i = B.c0(arrayList3);
                this.f2967j = AbstractC0252a0.c(list);
                this.f2968k = X3.a.d(new A.b(this, 14));
                return;
            }
            y yVar = (y) zVar.next();
            arrayList3.add(new X3.i(yVar.f9815b, Integer.valueOf(yVar.a)));
        }
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a() {
        return this.a;
    }

    @Override // M4.InterfaceC0264k
    public final Set b() {
        return this.f2961d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean c() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d(String str) {
        AbstractC1276k.f(str, Attribute.NAME_ATTR);
        Integer num = (Integer) this.f2966i.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final Y4.l e() {
        return this.f2959b;
    }

    public final boolean equals(Object obj) {
        int i6;
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (AbstractC1276k.b(this.a, serialDescriptor.a()) && Arrays.equals(this.f2967j, ((g) obj).f2967j)) {
                int f6 = serialDescriptor.f();
                int i7 = this.f2960c;
                if (i7 == f6) {
                    for (i6 = 0; i6 < i7; i6++) {
                        SerialDescriptor[] serialDescriptorArr = this.f2963f;
                        i6 = (AbstractC1276k.b(serialDescriptorArr[i6].a(), serialDescriptor.j(i6).a()) && AbstractC1276k.b(serialDescriptorArr[i6].e(), serialDescriptor.j(i6).e())) ? i6 + 1 : 0;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int f() {
        return this.f2960c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String g(int i6) {
        return this.f2962e[i6];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return v.f9812c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean h() {
        return false;
    }

    public final int hashCode() {
        return ((Number) this.f2968k.getValue()).intValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List i(int i6) {
        return this.f2964g[i6];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor j(int i6) {
        return this.f2963f[i6];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean k(int i6) {
        return this.f2965h[i6];
    }

    public final String toString() {
        return m.v0(AbstractC1117a.z(0, this.f2960c), ", ", B3.e.r(new StringBuilder(), this.a, '('), ")", new C0056a(this, 10), 24);
    }
}
