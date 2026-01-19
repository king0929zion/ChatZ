package m4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: m4.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1275j {
    public static final Object[] a = new Object[0];

    public static final Object[] a(Collection collection) {
        AbstractC1276k.f(collection, "collection");
        int size = collection.size();
        Object[] objArr = a;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArr2 = new Object[size];
        int i6 = 0;
        while (true) {
            int i7 = i6 + 1;
            objArr2[i6] = it.next();
            if (i7 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i8 = ((i7 * 3) + 1) >>> 1;
                if (i8 <= i7) {
                    i8 = 2147483645;
                    if (i7 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i8);
                AbstractC1276k.e(objArr2, "copyOf(...)");
            } else if (!it.hasNext()) {
                Object[] copyOf = Arrays.copyOf(objArr2, i7);
                AbstractC1276k.e(copyOf, "copyOf(...)");
                return copyOf;
            }
            i6 = i7;
        }
    }

    public static final Object[] b(Collection collection, Object[] objArr) {
        Object[] objArr2;
        AbstractC1276k.f(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i6 = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArr2 = objArr;
                } else {
                    Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    AbstractC1276k.d(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    objArr2 = (Object[]) newInstance;
                }
                while (true) {
                    int i7 = i6 + 1;
                    objArr2[i6] = it.next();
                    if (i7 >= objArr2.length) {
                        if (!it.hasNext()) {
                            return objArr2;
                        }
                        int i8 = ((i7 * 3) + 1) >>> 1;
                        if (i8 <= i7) {
                            i8 = 2147483645;
                            if (i7 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr2 = Arrays.copyOf(objArr2, i8);
                        AbstractC1276k.e(objArr2, "copyOf(...)");
                    } else if (!it.hasNext()) {
                        if (objArr2 == objArr) {
                            objArr[i7] = null;
                            return objArr;
                        }
                        Object[] copyOf = Arrays.copyOf(objArr2, i7);
                        AbstractC1276k.e(copyOf, "copyOf(...)");
                        return copyOf;
                    }
                    i6 = i7;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }
}
