package X1;

/* loaded from: classes.dex */
public interface c extends AutoCloseable {
    String M(int i6);

    boolean Z();

    void a(long j3, int i6);

    void b(double d6, int i6);

    void e(int i6);

    int getColumnCount();

    String getColumnName(int i6);

    double getDouble(int i6);

    long getLong(int i6);

    boolean isNull(int i6);

    void reset();

    void z(int i6, String str);
}
