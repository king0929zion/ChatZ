package I3;

import com.vladsch.flexmark.util.html.Attribute;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public class I implements z {
    public boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2733b;

    public I(z zVar) {
        AbstractC1276k.f(zVar, "encodedParametersBuilder");
        this.f2733b = zVar;
        this.a = zVar.b();
    }

    @Override // N3.r
    public Set a() {
        return ((N3.t) Y3.C.l((z) this.f2733b)).a();
    }

    @Override // N3.r
    public boolean b() {
        return this.a;
    }

    @Override // N3.r
    public void c(String str, List list) {
        AbstractC1276k.f(str, Attribute.NAME_ATTR);
        AbstractC1276k.f(list, "values");
        z zVar = (z) this.f2733b;
        String f6 = AbstractC0238b.f(str, false);
        ArrayList arrayList = new ArrayList(Y3.n.Z(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            AbstractC1276k.f(str2, "<this>");
            arrayList.add(AbstractC0238b.f(str2, true));
        }
        zVar.c(f6, arrayList);
    }

    @Override // N3.r
    public void clear() {
        ((z) this.f2733b).clear();
    }

    @Override // N3.r
    public boolean contains(String str) {
        AbstractC1276k.f(str, Attribute.NAME_ATTR);
        return ((z) this.f2733b).contains(AbstractC0238b.f(str, false));
    }

    @Override // N3.r
    public List d(String str) {
        AbstractC1276k.f(str, Attribute.NAME_ATTR);
        List d6 = ((z) this.f2733b).d(AbstractC0238b.f(str, false));
        if (d6 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(Y3.n.Z(d6, 10));
        Iterator it = d6.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC0238b.e(0, 0, 11, (String) it.next()));
        }
        return arrayList;
    }

    public void e() {
        this.a = false;
    }

    public void f(byte b5) {
        ((C0.c) this.f2733b).k(String.valueOf(b5));
    }

    public void g(char c6) {
        C0.c cVar = (C0.c) this.f2733b;
        cVar.f(cVar.f648b, 1);
        char[] cArr = (char[]) cVar.f649c;
        int i6 = cVar.f648b;
        cVar.f648b = i6 + 1;
        cArr[i6] = c6;
    }

    public void h(int i6) {
        ((C0.c) this.f2733b).k(String.valueOf(i6));
    }

    public void i(long j3) {
        ((C0.c) this.f2733b).k(String.valueOf(j3));
    }

    @Override // N3.r
    public boolean isEmpty() {
        return ((z) this.f2733b).isEmpty();
    }

    public void j(String str) {
        AbstractC1276k.f(str, "v");
        ((C0.c) this.f2733b).k(str);
    }

    public void k(short s5) {
        ((C0.c) this.f2733b).k(String.valueOf(s5));
    }

    public void l(String str) {
        int i6;
        AbstractC1276k.f(str, "value");
        C0.c cVar = (C0.c) this.f2733b;
        cVar.f(cVar.f648b, str.length() + 2);
        char[] cArr = (char[]) cVar.f649c;
        int i7 = cVar.f648b;
        int i8 = i7 + 1;
        cArr[i7] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i8);
        int i9 = length + i8;
        int i10 = i8;
        while (i10 < i9) {
            char c6 = cArr[i10];
            byte[] bArr = O4.y.f4380b;
            if (c6 < bArr.length && bArr[c6] != 0) {
                int length2 = str.length();
                for (int i11 = i10 - i8; i11 < length2; i11++) {
                    cVar.f(i10, 2);
                    char charAt = str.charAt(i11);
                    byte[] bArr2 = O4.y.f4380b;
                    if (charAt < bArr2.length) {
                        byte b5 = bArr2[charAt];
                        if (b5 == 0) {
                            i6 = i10 + 1;
                            ((char[]) cVar.f649c)[i10] = charAt;
                        } else {
                            if (b5 == 1) {
                                String str2 = O4.y.a[charAt];
                                AbstractC1276k.c(str2);
                                cVar.f(i10, str2.length());
                                str2.getChars(0, str2.length(), (char[]) cVar.f649c, i10);
                                int length3 = str2.length() + i10;
                                cVar.f648b = length3;
                                i10 = length3;
                            } else {
                                char[] cArr2 = (char[]) cVar.f649c;
                                cArr2[i10] = '\\';
                                cArr2[i10 + 1] = (char) b5;
                                i10 += 2;
                                cVar.f648b = i10;
                            }
                        }
                    } else {
                        i6 = i10 + 1;
                        ((char[]) cVar.f649c)[i10] = charAt;
                    }
                    i10 = i6;
                }
                cVar.f(i10, 1);
                ((char[]) cVar.f649c)[i10] = '\"';
                cVar.f648b = i10 + 1;
                return;
            }
            i10++;
        }
        cArr[i9] = '\"';
        cVar.f648b = i9 + 1;
    }

    public void m() {
    }

    public void n() {
    }

    @Override // N3.r
    public Set names() {
        Set names = ((z) this.f2733b).names();
        ArrayList arrayList = new ArrayList(Y3.n.Z(names, 10));
        Iterator it = names.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC0238b.e(0, 0, 15, (String) it.next()));
        }
        return Y3.m.N0(arrayList);
    }

    public I(C0.c cVar) {
        this.f2733b = cVar;
        this.a = true;
    }

    public I(String str, boolean z5) {
        this.a = z5;
        this.f2733b = str;
    }
}
