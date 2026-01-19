package M4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m4.AbstractC1276k;

/* renamed from: M4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0255c extends AbstractC0270q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3449b;

    /* renamed from: c, reason: collision with root package name */
    public final L f3450c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0255c(KSerializer kSerializer, int i6) {
        super(kSerializer);
        this.f3449b = i6;
        switch (i6) {
            case 1:
                AbstractC1276k.f(kSerializer, "eSerializer");
                super(kSerializer);
                SerialDescriptor descriptor = kSerializer.getDescriptor();
                AbstractC1276k.f(descriptor, "elementDesc");
                this.f3450c = new C0253b(descriptor, 2);
                return;
            case 2:
                AbstractC1276k.f(kSerializer, "eSerializer");
                super(kSerializer);
                SerialDescriptor descriptor2 = kSerializer.getDescriptor();
                AbstractC1276k.f(descriptor2, "elementDesc");
                this.f3450c = new C0253b(descriptor2, 3);
                return;
            default:
                AbstractC1276k.f(kSerializer, "element");
                SerialDescriptor descriptor3 = kSerializer.getDescriptor();
                AbstractC1276k.f(descriptor3, "elementDesc");
                this.f3450c = new C0253b(descriptor3, 1);
                return;
        }
    }

    @Override // M4.AbstractC0251a
    public final Object a() {
        switch (this.f3449b) {
            case 0:
                return new ArrayList();
            case 1:
                return new HashSet();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // M4.AbstractC0251a
    public final int b(Object obj) {
        switch (this.f3449b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                AbstractC1276k.f(arrayList, "<this>");
                return arrayList.size();
            case 1:
                HashSet hashSet = (HashSet) obj;
                AbstractC1276k.f(hashSet, "<this>");
                return hashSet.size();
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                AbstractC1276k.f(linkedHashSet, "<this>");
                return linkedHashSet.size();
        }
    }

    @Override // M4.AbstractC0251a
    public final Iterator c(Object obj) {
        Collection collection = (Collection) obj;
        AbstractC1276k.f(collection, "<this>");
        return collection.iterator();
    }

    @Override // M4.AbstractC0251a
    public final int d(Object obj) {
        Collection collection = (Collection) obj;
        AbstractC1276k.f(collection, "<this>");
        return collection.size();
    }

    @Override // M4.AbstractC0251a
    public final Object g(Object obj) {
        switch (this.f3449b) {
            case 0:
                AbstractC1276k.f(null, "<this>");
                return new ArrayList((Collection) null);
            case 1:
                AbstractC1276k.f(null, "<this>");
                return new HashSet((Collection) null);
            default:
                AbstractC1276k.f(null, "<this>");
                return new LinkedHashSet((Collection) null);
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        switch (this.f3449b) {
            case 0:
                return (C0253b) this.f3450c;
            case 1:
                return (C0253b) this.f3450c;
            default:
                return (C0253b) this.f3450c;
        }
    }

    @Override // M4.AbstractC0251a
    public final Object h(Object obj) {
        switch (this.f3449b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                AbstractC1276k.f(arrayList, "<this>");
                return arrayList;
            case 1:
                HashSet hashSet = (HashSet) obj;
                AbstractC1276k.f(hashSet, "<this>");
                return hashSet;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                AbstractC1276k.f(linkedHashSet, "<this>");
                return linkedHashSet;
        }
    }

    @Override // M4.AbstractC0270q
    public final void i(int i6, Object obj, Object obj2) {
        switch (this.f3449b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                AbstractC1276k.f(arrayList, "<this>");
                arrayList.add(i6, obj2);
                return;
            case 1:
                HashSet hashSet = (HashSet) obj;
                AbstractC1276k.f(hashSet, "<this>");
                hashSet.add(obj2);
                return;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                AbstractC1276k.f(linkedHashSet, "<this>");
                linkedHashSet.add(obj2);
                return;
        }
    }
}
