package w2;

import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import l2.C1192g;

/* renamed from: w2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1840j {
    public static final C1840j a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static C1192g f15411b;

    public static void a(String str, int i6, String str2, Throwable th) {
        if (str2 != null) {
            Log.println(i6, str, str2);
        }
        if (th != null) {
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            Log.println(i6, str, stringWriter.toString());
        }
    }
}
