package Y;

import java.util.Map;
import m4.AbstractC1276k;
import n4.InterfaceC1372a;

/* loaded from: classes.dex */
public class a implements Map.Entry, InterfaceC1372a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f9538c;

    /* renamed from: e, reason: collision with root package name */
    public final Object f9539e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f9540f;

    public /* synthetic */ a(int i6, Object obj, Object obj2) {
        this.f9538c = i6;
        this.f9539e = obj;
        this.f9540f = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        switch (this.f9538c) {
            case 0:
                Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
                return entry != null && AbstractC1276k.b(entry.getKey(), this.f9539e) && AbstractC1276k.b(entry.getValue(), getValue());
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.f9538c) {
            case 0:
                return this.f9539e;
            default:
                return this.f9539e;
        }
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        switch (this.f9538c) {
            case 0:
                return this.f9540f;
            default:
                return this.f9540f;
        }
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        switch (this.f9538c) {
            case 0:
                Object obj = this.f9539e;
                int hashCode = obj != null ? obj.hashCode() : 0;
                Object value = getValue();
                return (value != null ? value.hashCode() : 0) ^ hashCode;
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        switch (this.f9538c) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public String toString() {
        switch (this.f9538c) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append(this.f9539e);
                sb.append('=');
                sb.append(getValue());
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
