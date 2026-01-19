package C4;

import Y3.C;

/* loaded from: classes.dex */
public abstract class t {
    public static final /* synthetic */ int a = 0;

    static {
        Object b5;
        Object b6;
        Exception exc = new Exception();
        String simpleName = C.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            b5 = d4.a.class.getCanonicalName();
        } catch (Throwable th) {
            b5 = X3.a.b(th);
        }
        if (X3.l.a(b5) != null) {
            b5 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            b6 = t.class.getCanonicalName();
        } catch (Throwable th2) {
            b6 = X3.a.b(th2);
        }
        if (X3.l.a(b6) != null) {
            b6 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
