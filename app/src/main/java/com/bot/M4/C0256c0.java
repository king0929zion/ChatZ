package M4;

import D.C0056a;
import com.vladsch.flexmark.util.html.Attribute;
import i4.AbstractC1117a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;

/* renamed from: M4.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0256c0 implements SerialDescriptor, InterfaceC0264k {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final C f3451b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3452c;

    /* renamed from: d, reason: collision with root package name */
    public int f3453d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f3454e;

    /* renamed from: f, reason: collision with root package name */
    public final List[] f3455f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f3456g;

    /* renamed from: h, reason: collision with root package name */
    public Object f3457h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f3458i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f3459j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f3460k;

    public C0256c0(String str, C c6, int i6) {
        this.a = str;
        this.f3451b = c6;
        this.f3452c = i6;
        String[] strArr = new String[i6];
        for (int i7 = 0; i7 < i6; i7++) {
            strArr[i7] = "[UNINITIALIZED]";
        }
        this.f3454e = strArr;
        int i8 = this.f3452c;
        this.f3455f = new List[i8];
        this.f3456g = new boolean[i8];
        this.f3457h = Y3.w.f9813c;
        final int i9 = 0;
        InterfaceC1193a interfaceC1193a = new InterfaceC1193a(this) { // from class: M4.b0

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ C0256c0 f3448e;

            {
                this.f3448e = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, X3.f] */
            @Override // l4.InterfaceC1193a
            public final Object b() {
                KSerializer[] childSerializers;
                ArrayList arrayList;
                KSerializer[] typeParametersSerializers;
                switch (i9) {
                    case 0:
                        C c7 = this.f3448e.f3451b;
                        return (c7 == null || (childSerializers = c7.childSerializers()) == null) ? AbstractC0252a0.f3444b : childSerializers;
                    case 1:
                        C c8 = this.f3448e.f3451b;
                        if (c8 == null || (typeParametersSerializers = c8.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(typeParametersSerializers.length);
                            for (KSerializer kSerializer : typeParametersSerializers) {
                                arrayList.add(kSerializer.getDescriptor());
                            }
                        }
                        return AbstractC0252a0.c(arrayList);
                    default:
                        C0256c0 c0256c0 = this.f3448e;
                        return Integer.valueOf(AbstractC0252a0.e(c0256c0, (SerialDescriptor[]) c0256c0.f3459j.getValue()));
                }
            }
        };
        X3.g gVar = X3.g.f9390c;
        this.f3458i = X3.a.c(gVar, interfaceC1193a);
        final int i10 = 1;
        this.f3459j = X3.a.c(gVar, new InterfaceC1193a(this) { // from class: M4.b0

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ C0256c0 f3448e;

            {
                this.f3448e = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, X3.f] */
            @Override // l4.InterfaceC1193a
            public final Object b() {
                KSerializer[] childSerializers;
                ArrayList arrayList;
                KSerializer[] typeParametersSerializers;
                switch (i10) {
                    case 0:
                        C c7 = this.f3448e.f3451b;
                        return (c7 == null || (childSerializers = c7.childSerializers()) == null) ? AbstractC0252a0.f3444b : childSerializers;
                    case 1:
                        C c8 = this.f3448e.f3451b;
                        if (c8 == null || (typeParametersSerializers = c8.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(typeParametersSerializers.length);
                            for (KSerializer kSerializer : typeParametersSerializers) {
                                arrayList.add(kSerializer.getDescriptor());
                            }
                        }
                        return AbstractC0252a0.c(arrayList);
                    default:
                        C0256c0 c0256c0 = this.f3448e;
                        return Integer.valueOf(AbstractC0252a0.e(c0256c0, (SerialDescriptor[]) c0256c0.f3459j.getValue()));
                }
            }
        });
        final int i11 = 2;
        this.f3460k = X3.a.c(gVar, new InterfaceC1193a(this) { // from class: M4.b0

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ C0256c0 f3448e;

            {
                this.f3448e = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, X3.f] */
            @Override // l4.InterfaceC1193a
            public final Object b() {
                KSerializer[] childSerializers;
                ArrayList arrayList;
                KSerializer[] typeParametersSerializers;
                switch (i11) {
                    case 0:
                        C c7 = this.f3448e.f3451b;
                        return (c7 == null || (childSerializers = c7.childSerializers()) == null) ? AbstractC0252a0.f3444b : childSerializers;
                    case 1:
                        C c8 = this.f3448e.f3451b;
                        if (c8 == null || (typeParametersSerializers = c8.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(typeParametersSerializers.length);
                            for (KSerializer kSerializer : typeParametersSerializers) {
                                arrayList.add(kSerializer.getDescriptor());
                            }
                        }
                        return AbstractC0252a0.c(arrayList);
                    default:
                        C0256c0 c0256c0 = this.f3448e;
                        return Integer.valueOf(AbstractC0252a0.e(c0256c0, (SerialDescriptor[]) c0256c0.f3459j.getValue()));
                }
            }
        });
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    @Override // M4.InterfaceC0264k
    public final Set b() {
        return this.f3457h.keySet();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean c() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map, java.lang.Object] */
    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d(String str) {
        AbstractC1276k.f(str, Attribute.NAME_ATTR);
        Integer num = (Integer) this.f3457h.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public Y4.l e() {
        return K4.k.f2976e;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, X3.f] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, X3.f] */
    public boolean equals(Object obj) {
        int i6;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0256c0) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (this.a.equals(serialDescriptor.a()) && Arrays.equals((SerialDescriptor[]) this.f3459j.getValue(), (SerialDescriptor[]) ((C0256c0) obj).f3459j.getValue())) {
                int f6 = serialDescriptor.f();
                int i7 = this.f3452c;
                if (i7 == f6) {
                    for (i6 = 0; i6 < i7; i6++) {
                        i6 = (AbstractC1276k.b(j(i6).a(), serialDescriptor.j(i6).a()) && AbstractC1276k.b(j(i6).e(), serialDescriptor.j(i6).e())) ? i6 + 1 : 0;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int f() {
        return this.f3452c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String g(int i6) {
        return this.f3454e[i6];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return Y3.v.f9812c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean h() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X3.f] */
    public int hashCode() {
        return ((Number) this.f3460k.getValue()).intValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List i(int i6) {
        List list = this.f3455f[i6];
        return list == null ? Y3.v.f9812c : list;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X3.f] */
    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor j(int i6) {
        return ((KSerializer[]) this.f3458i.getValue())[i6].getDescriptor();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean k(int i6) {
        return this.f3456g[i6];
    }

    public final void l(String str, boolean z5) {
        AbstractC1276k.f(str, Attribute.NAME_ATTR);
        int i6 = this.f3453d + 1;
        this.f3453d = i6;
        String[] strArr = this.f3454e;
        strArr[i6] = str;
        this.f3456g[i6] = z5;
        this.f3455f[i6] = null;
        if (i6 == this.f3452c - 1) {
            HashMap hashMap = new HashMap();
            int length = strArr.length;
            for (int i7 = 0; i7 < length; i7++) {
                hashMap.put(strArr[i7], Integer.valueOf(i7));
            }
            this.f3457h = hashMap;
        }
    }

    public String toString() {
        return Y3.m.v0(AbstractC1117a.z(0, this.f3452c), ", ", this.a.concat("("), ")", new C0056a(this, 15), 24);
    }
}
