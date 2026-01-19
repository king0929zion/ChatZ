package kotlinx.serialization.json;

import N4.q;
import kotlinx.serialization.KSerializer;

@I4.d(with = q.class)
/* loaded from: classes.dex */
public final class JsonNull extends d {
    public static final JsonNull INSTANCE = new Object();

    @Override // kotlinx.serialization.json.d
    public final String a() {
        return "null";
    }

    @Override // kotlinx.serialization.json.d
    public final boolean b() {
        return false;
    }

    public final KSerializer serializer() {
        return q.a;
    }
}
