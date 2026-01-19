package M4;

import i4.AbstractC1117a;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m4.AbstractC1276k;
import s4.InterfaceC1672b;

/* loaded from: classes.dex */
public final class i0 extends AbstractC0270q {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1672b f3470b;

    /* renamed from: c, reason: collision with root package name */
    public final C0253b f3471c;

    public i0(InterfaceC1672b interfaceC1672b, KSerializer kSerializer) {
        super(kSerializer);
        this.f3470b = interfaceC1672b;
        SerialDescriptor descriptor = kSerializer.getDescriptor();
        AbstractC1276k.f(descriptor, "elementDesc");
        this.f3471c = new C0253b(descriptor, 0);
    }

    @Override // M4.AbstractC0251a
    public final Object a() {
        return new ArrayList();
    }

    @Override // M4.AbstractC0251a
    public final int b(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        AbstractC1276k.f(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // M4.AbstractC0251a
    public final Iterator c(Object obj) {
        Object[] objArr = (Object[]) obj;
        AbstractC1276k.f(objArr, "<this>");
        return AbstractC1276k.i(objArr);
    }

    @Override // M4.AbstractC0251a
    public final int d(Object obj) {
        Object[] objArr = (Object[]) obj;
        AbstractC1276k.f(objArr, "<this>");
        return objArr.length;
    }

    @Override // M4.AbstractC0251a
    public final Object g(Object obj) {
        AbstractC1276k.f(null, "<this>");
        Y3.k.a0(null);
        throw null;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.f3471c;
    }

    @Override // M4.AbstractC0251a
    public final Object h(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        AbstractC1276k.f(arrayList, "<this>");
        InterfaceC1672b interfaceC1672b = this.f3470b;
        AbstractC1276k.f(interfaceC1672b, "eClass");
        Object newInstance = Array.newInstance((Class<?>) AbstractC1117a.o(interfaceC1672b), arrayList.size());
        AbstractC1276k.d(newInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        Object[] array = arrayList.toArray((Object[]) newInstance);
        AbstractC1276k.e(array, "toArray(...)");
        return array;
    }

    @Override // M4.AbstractC0270q
    public final void i(int i6, Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        AbstractC1276k.f(arrayList, "<this>");
        arrayList.add(i6, obj2);
    }
}
