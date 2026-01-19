package T3;

import java.nio.charset.MalformedInputException;

/* loaded from: classes.dex */
public class b extends MalformedInputException {

    /* renamed from: c, reason: collision with root package name */
    public final String f8516c;

    public b(String str) {
        super(0);
        this.f8516c = str;
    }

    @Override // java.nio.charset.MalformedInputException, java.lang.Throwable
    public final String getMessage() {
        return this.f8516c;
    }
}
