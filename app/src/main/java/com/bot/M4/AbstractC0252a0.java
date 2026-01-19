package M4;

import i4.AbstractC1117a;
import j1.AbstractC1135a;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m4.AbstractC1276k;
import m4.C1270e;
import s4.InterfaceC1672b;

/* renamed from: M4.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0252a0 {
    public static final SerialDescriptor[] a = new SerialDescriptor[0];

    /* renamed from: b, reason: collision with root package name */
    public static final KSerializer[] f3444b = new KSerializer[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Object f3445c = new Object();

    public static final F a(String str, KSerializer kSerializer) {
        return new F(str, new G(kSerializer));
    }

    public static final Set b(SerialDescriptor serialDescriptor) {
        AbstractC1276k.f(serialDescriptor, "<this>");
        if (serialDescriptor instanceof InterfaceC0264k) {
            return ((InterfaceC0264k) serialDescriptor).b();
        }
        HashSet hashSet = new HashSet(serialDescriptor.f());
        int f6 = serialDescriptor.f();
        for (int i6 = 0; i6 < f6; i6++) {
            hashSet.add(serialDescriptor.g(i6));
        }
        return hashSet;
    }

    public static final SerialDescriptor[] c(List list) {
        SerialDescriptor[] serialDescriptorArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (serialDescriptorArr = (SerialDescriptor[]) list.toArray(new SerialDescriptor[0])) == null) ? a : serialDescriptorArr;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:58|(1:(2:60|(1:63)(1:62))(2:111|112))|(5:106|107|108|(8:80|81|(1:(3:83|(1:101)(1:(1:89)(2:86|87))|88)(2:102|(1:104)))|90|(1:100)(1:94)|95|(1:97)|99)|(1:79)(4:70|(1:78)|76|77))|65|(1:67)|80|81|(2:(0)(0)|88)|90|(1:92)|100|95|(0)|99|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0112, code lost:
    
        if (r12 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x00c8, code lost:
    
        if (r11 == false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x018f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0124 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0178 A[Catch: NoSuchFieldException -> 0x01a7, TryCatch #0 {NoSuchFieldException -> 0x01a7, blocks: (B:81:0x016b, B:83:0x0178, B:92:0x0194, B:94:0x019a, B:95:0x01a0, B:97:0x01a4, B:88:0x018c), top: B:80:0x016b }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a4 A[Catch: NoSuchFieldException -> 0x01a7, TRY_LEAVE, TryCatch #0 {NoSuchFieldException -> 0x01a7, blocks: (B:81:0x016b, B:83:0x0178, B:92:0x0194, B:94:0x019a, B:95:0x01a0, B:97:0x01a4, B:88:0x018c), top: B:80:0x016b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlinx.serialization.KSerializer d(s4.InterfaceC1672b r16, kotlinx.serialization.KSerializer... r17) {
        /*
            Method dump skipped, instructions count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M4.AbstractC0252a0.d(s4.b, kotlinx.serialization.KSerializer[]):kotlinx.serialization.KSerializer");
    }

    public static final int e(SerialDescriptor serialDescriptor, SerialDescriptor[] serialDescriptorArr) {
        AbstractC1276k.f(serialDescriptorArr, "typeParams");
        int hashCode = (serialDescriptor.a().hashCode() * 31) + Arrays.hashCode(serialDescriptorArr);
        int f6 = serialDescriptor.f();
        int i6 = 1;
        while (true) {
            int i7 = 0;
            if (!(f6 > 0)) {
                break;
            }
            int i8 = f6 - 1;
            int i9 = i6 * 31;
            String a6 = serialDescriptor.j(serialDescriptor.f() - f6).a();
            if (a6 != null) {
                i7 = a6.hashCode();
            }
            i6 = i9 + i7;
            f6 = i8;
        }
        int f7 = serialDescriptor.f();
        int i10 = 1;
        while (true) {
            if (!(f7 > 0)) {
                return (((hashCode * 31) + i6) * 31) + i10;
            }
            int i11 = f7 - 1;
            int i12 = i10 * 31;
            Y4.l e6 = serialDescriptor.j(serialDescriptor.f() - f7).e();
            i10 = i12 + (e6 != null ? e6.hashCode() : 0);
            f7 = i11;
        }
    }

    public static final KSerializer f(Object obj, KSerializer... kSerializerArr) {
        Class[] clsArr;
        try {
            if (kSerializerArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = kSerializerArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i6 = 0; i6 < length; i6++) {
                    clsArr2[i6] = KSerializer.class;
                }
                clsArr = clsArr2;
            }
            Object invoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(kSerializerArr, kSerializerArr.length));
            if (invoke instanceof KSerializer) {
                return (KSerializer) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e6) {
            Throwable cause = e6.getCause();
            if (cause == null) {
                throw e6;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e6.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    public static final boolean g(InterfaceC1672b interfaceC1672b) {
        AbstractC1276k.f(interfaceC1672b, "<this>");
        return AbstractC1117a.o(interfaceC1672b).isInterface();
    }

    public static final InterfaceC1672b h(s4.f fVar) {
        InterfaceC1672b c6 = fVar.c();
        if (c6 instanceof InterfaceC1672b) {
            return c6;
        }
        throw new IllegalArgumentException("Only KClass supported as classifier, got " + c6);
    }

    public static final void i(InterfaceC1672b interfaceC1672b) {
        AbstractC1276k.f(interfaceC1672b, "<this>");
        String c6 = ((C1270e) interfaceC1672b).c();
        if (c6 == null) {
            c6 = "<local class name not available>";
        }
        throw new IllegalArgumentException(AbstractC1135a.s("Serializer for class '", c6, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n"));
    }

    public static final void j(int i6, int i7, SerialDescriptor serialDescriptor) {
        AbstractC1276k.f(serialDescriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i8 = (~i6) & i7;
        for (int i9 = 0; i9 < 32; i9++) {
            if ((i8 & 1) != 0) {
                arrayList.add(serialDescriptor.g(i9));
            }
            i8 >>>= 1;
        }
        String a6 = serialDescriptor.a();
        AbstractC1276k.f(a6, "serialName");
        throw new I4.a(arrayList, arrayList.size() == 1 ? "Field '" + ((String) arrayList.get(0)) + "' is required for type with serial name '" + a6 + "', but it was missing" : "Fields " + arrayList + " are required for type with serial name '" + a6 + "', but they were missing", null);
    }

    public static final void k(String str, InterfaceC1672b interfaceC1672b) {
        String sb;
        AbstractC1276k.f(interfaceC1672b, "baseClass");
        StringBuilder sb2 = new StringBuilder("in the polymorphic scope of '");
        C1270e c1270e = (C1270e) interfaceC1672b;
        sb2.append(c1270e.c());
        sb2.append('\'');
        String sb3 = sb2.toString();
        if (str == null) {
            sb = B3.e.g('.', "Class discriminator was missing and no default serializers were registered ", sb3);
        } else {
            StringBuilder u5 = B3.e.u("Serializer for subclass '", str, "' is not found ", sb3, ".\nCheck if class with serial name '");
            B3.e.z(u5, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            u5.append(c1270e.c());
            u5.append("' has to be sealed and '@Serializable'.");
            sb = u5.toString();
        }
        throw new IllegalArgumentException(sb);
    }
}
