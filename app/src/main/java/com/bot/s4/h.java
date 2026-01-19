package s4;

import Y3.k;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class h implements ParameterizedType, Type {

    /* renamed from: c, reason: collision with root package name */
    public final Class f14818c;

    /* renamed from: e, reason: collision with root package name */
    public final Type f14819e;

    /* renamed from: f, reason: collision with root package name */
    public final Type[] f14820f;

    public h(Class cls, Type type, ArrayList arrayList) {
        this.f14818c = cls;
        this.f14819e = type;
        this.f14820f = (Type[]) arrayList.toArray(new Type[0]);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ParameterizedType)) {
            return false;
        }
        ParameterizedType parameterizedType = (ParameterizedType) obj;
        return AbstractC1276k.b(this.f14818c, parameterizedType.getRawType()) && AbstractC1276k.b(this.f14819e, parameterizedType.getOwnerType()) && Arrays.equals(this.f14820f, parameterizedType.getActualTypeArguments());
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return this.f14820f;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f14819e;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f14818c;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        StringBuilder sb = new StringBuilder();
        Class cls = this.f14818c;
        Type type = this.f14819e;
        if (type != null) {
            sb.append(j.e(type));
            sb.append("$");
            sb.append(cls.getSimpleName());
        } else {
            sb.append(j.e(cls));
        }
        Type[] typeArr = this.f14820f;
        if (typeArr.length != 0) {
            k.w0(typeArr, sb, ", ", "<", ">", "...", g.f14817l);
        }
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.f14818c.hashCode();
        Type type = this.f14819e;
        return (hashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(this.f14820f);
    }

    public final String toString() {
        return getTypeName();
    }
}
