package Y4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class i implements InvocationHandler {
    public final ArrayList a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9831b;

    /* renamed from: c, reason: collision with root package name */
    public String f9832c;

    public i(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        AbstractC1276k.f(obj, "proxy");
        AbstractC1276k.f(method, "method");
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (AbstractC1276k.b(name, "supports") && AbstractC1276k.b(Boolean.TYPE, returnType)) {
            return Boolean.TRUE;
        }
        if (AbstractC1276k.b(name, "unsupported") && AbstractC1276k.b(Void.TYPE, returnType)) {
            this.f9831b = true;
            return null;
        }
        boolean b5 = AbstractC1276k.b(name, "protocols");
        ArrayList arrayList = this.a;
        if (b5 && objArr.length == 0) {
            return arrayList;
        }
        if ((AbstractC1276k.b(name, "selectProtocol") || AbstractC1276k.b(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                AbstractC1276k.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
                List list = (List) obj2;
                int size = list.size();
                if (size >= 0) {
                    int i6 = 0;
                    while (true) {
                        Object obj3 = list.get(i6);
                        AbstractC1276k.d(obj3, "null cannot be cast to non-null type kotlin.String");
                        String str = (String) obj3;
                        if (!arrayList.contains(str)) {
                            if (i6 == size) {
                                break;
                            }
                            i6++;
                        } else {
                            this.f9832c = str;
                            return str;
                        }
                    }
                }
                String str2 = (String) arrayList.get(0);
                this.f9832c = str2;
                return str2;
            }
        }
        if ((!AbstractC1276k.b(name, "protocolSelected") && !AbstractC1276k.b(name, "selected")) || objArr.length != 1) {
            return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
        }
        Object obj4 = objArr[0];
        AbstractC1276k.d(obj4, "null cannot be cast to non-null type kotlin.String");
        this.f9832c = (String) obj4;
        return null;
    }
}
