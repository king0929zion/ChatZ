package g0;

import Y3.E;
import Y4.l;
import java.util.ArrayList;
import java.util.List;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class f extends RuntimeException {

    /* renamed from: c, reason: collision with root package name */
    public final C1013a f11771c;

    public f(C1013a c1013a) {
        this.f11771c = c1013a;
        if (c1013a.a()) {
            return;
        }
        ArrayList p5 = s4.j.p(c1013a);
        int size = p5.size();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[size];
        for (int i6 = 0; i6 < size; i6++) {
            stackTraceElementArr[i6] = new StackTraceElement("$$compose", "m$" + ((C1014b) p5.get(i6)).a, "SourceFile", 1);
        }
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        C1013a c1013a = this.f11771c;
        if (!c1013a.a()) {
            return "Composition stack when thrown:";
        }
        StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
        int i6 = 0;
        if (c1013a.a()) {
            Z3.b w5 = l.w();
            List list = c1013a.a;
            AbstractC1276k.f(list, "<this>");
            E e6 = new E(list);
            int a = e6.a();
            for (int i7 = 0; i7 < a; i7++) {
                ((C1014b) e6.get(i7)).getClass();
            }
            Z3.b p5 = l.p(w5);
            AbstractC1276k.f(p5, "<this>");
            E e7 = new E(p5);
            int a6 = e7.a();
            while (i6 < a6) {
                String str = (String) e7.get(i6);
                sb.append("\tat ");
                sb.append(str);
                sb.append('\n');
                i6++;
            }
        } else {
            ArrayList p6 = s4.j.p(c1013a);
            int size = p6.size();
            while (i6 < size) {
                C1014b c1014b = (C1014b) p6.get(i6);
                sb.append("\tat $$compose.m$");
                sb.append(c1014b.a);
                sb.append("(SourceFile:1)\n");
                i6++;
            }
        }
        String sb2 = sb.toString();
        AbstractC1276k.e(sb2, "toString(...)");
        return sb2;
    }
}
