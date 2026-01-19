package n;

/* loaded from: classes.dex */
public interface s0 {
    default boolean a(Enum r22, Enum r32) {
        return r22.equals(b()) && r32.equals(c());
    }

    Object b();

    Object c();
}
