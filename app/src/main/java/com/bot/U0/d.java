package U0;

import U.L;
import Y3.k;
import Y4.l;
import com.vladsch.flexmark.parser.PegdownExtensions;
import j1.AbstractC1135a;
import java.lang.Character;
import java.text.BreakIterator;
import java.util.Locale;
import m4.AbstractC1276k;
import y1.j;

/* loaded from: classes.dex */
public final class d {
    public final /* synthetic */ int a = 1;

    /* renamed from: b, reason: collision with root package name */
    public int f8600b;

    /* renamed from: c, reason: collision with root package name */
    public int f8601c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f8602d;

    /* renamed from: e, reason: collision with root package name */
    public Object f8603e;

    public /* synthetic */ d() {
    }

    public void a(int i6) {
        int i7 = this.f8600b;
        int i8 = this.f8601c;
        boolean z5 = false;
        if (i6 <= i8 && i7 <= i6) {
            z5 = true;
        }
        if (z5) {
            return;
        }
        StringBuilder j3 = AbstractC1135a.j(i6, "Invalid offset: ", i7, ". Valid range is [", " , ");
        j3.append(i8);
        j3.append(']');
        Y0.a.a(j3.toString());
    }

    public int b() {
        L l3 = (L) this.f8603e;
        if (l3 == null) {
            return ((String) this.f8602d).length();
        }
        return (l3.f8546b - l3.b()) + (((String) this.f8602d).length() - (this.f8601c - this.f8600b));
    }

    public boolean c(int i6) {
        CharSequence charSequence = this.f8602d;
        int i7 = this.f8600b + 1;
        if (i6 > this.f8601c || i7 > i6) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointBefore(charSequence, i6))) {
            int i8 = i6 - 1;
            if (!Character.isSurrogate(charSequence.charAt(i8))) {
                if (!j.d()) {
                    return false;
                }
                j a = j.a();
                if (a.c() != 1 || a.b(i8, charSequence) == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean d(int i6) {
        int i7 = this.f8600b + 1;
        if (i6 > this.f8601c || i7 > i6) {
            return false;
        }
        return l.G(Character.codePointBefore(this.f8602d, i6));
    }

    public boolean e(int i6) {
        a(i6);
        if (!((BreakIterator) this.f8603e).isBoundary(i6)) {
            return false;
        }
        if (g(i6) && g(i6 - 1) && g(i6 + 1)) {
            return false;
        }
        return i6 <= 0 || i6 >= this.f8602d.length() - 1 || !(f(i6) || f(i6 + 1));
    }

    public boolean f(int i6) {
        CharSequence charSequence = this.f8602d;
        int i7 = i6 - 1;
        Character.UnicodeBlock of = Character.UnicodeBlock.of(charSequence.charAt(i7));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (AbstractC1276k.b(of, unicodeBlock) && AbstractC1276k.b(Character.UnicodeBlock.of(charSequence.charAt(i6)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return AbstractC1276k.b(Character.UnicodeBlock.of(charSequence.charAt(i6)), unicodeBlock) && AbstractC1276k.b(Character.UnicodeBlock.of(charSequence.charAt(i7)), Character.UnicodeBlock.KATAKANA);
    }

    public boolean g(int i6) {
        CharSequence charSequence = this.f8602d;
        int i7 = this.f8600b;
        if (i6 >= this.f8601c || i7 > i6) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointAt(charSequence, i6)) && !Character.isSurrogate(charSequence.charAt(i6))) {
            if (!j.d()) {
                return false;
            }
            j a = j.a();
            if (a.c() != 1 || a.b(i6, charSequence) == -1) {
                return false;
            }
        }
        return true;
    }

    public boolean h(int i6) {
        int i7 = this.f8600b;
        if (i6 >= this.f8601c || i7 > i6) {
            return false;
        }
        return l.G(Character.codePointAt(this.f8602d, i6));
    }

    public int i(int i6) {
        a(i6);
        int following = ((BreakIterator) this.f8603e).following(i6);
        return (g(following + (-1)) && g(following) && !f(following)) ? i(following) : following;
    }

    public int j(int i6) {
        a(i6);
        int preceding = ((BreakIterator) this.f8603e).preceding(i6);
        return (g(preceding) && c(preceding) && !f(preceding)) ? j(preceding) : preceding;
    }

    public void k(int i6, int i7, String str) {
        if (i6 > i7) {
            Y0.a.a("start index must be less than or equal to end index: " + i6 + " > " + i7);
        }
        if (i6 < 0) {
            Y0.a.a("start must be non-negative, but was " + i6);
        }
        L l3 = (L) this.f8603e;
        if (l3 == null) {
            int max = Math.max(255, str.length() + PegdownExtensions.FENCED_CODE_BLOCKS);
            char[] cArr = new char[max];
            int min = Math.min(i6, 64);
            int min2 = Math.min(((String) this.f8602d).length() - i7, 64);
            String str2 = (String) this.f8602d;
            int i8 = i6 - min;
            AbstractC1276k.d(str2, "null cannot be cast to non-null type java.lang.String");
            str2.getChars(i8, i6, cArr, 0);
            String str3 = (String) this.f8602d;
            int i9 = max - min2;
            int i10 = min2 + i7;
            AbstractC1276k.d(str3, "null cannot be cast to non-null type java.lang.String");
            str3.getChars(i7, i10, cArr, i9);
            str.getChars(0, str.length(), cArr, min);
            int length = str.length() + min;
            L l5 = new L(1);
            l5.f8546b = max;
            l5.f8549e = cArr;
            l5.f8547c = length;
            l5.f8548d = i9;
            this.f8603e = l5;
            this.f8600b = i8;
            this.f8601c = i10;
            return;
        }
        int i11 = this.f8600b;
        int i12 = i6 - i11;
        int i13 = i7 - i11;
        if (i12 < 0 || i13 > l3.f8546b - l3.b()) {
            this.f8602d = toString();
            this.f8603e = null;
            this.f8600b = -1;
            this.f8601c = -1;
            k(i6, i7, str);
            return;
        }
        int length2 = str.length() - (i13 - i12);
        if (length2 > l3.b()) {
            int b5 = length2 - l3.b();
            int i14 = l3.f8546b;
            do {
                i14 *= 2;
            } while (i14 - l3.f8546b < b5);
            char[] cArr2 = new char[i14];
            k.g0((char[]) l3.f8549e, cArr2, 0, 0, l3.f8547c);
            int i15 = l3.f8546b;
            int i16 = l3.f8548d;
            int i17 = i15 - i16;
            int i18 = i14 - i17;
            k.g0((char[]) l3.f8549e, cArr2, i18, i16, i17 + i16);
            l3.f8549e = cArr2;
            l3.f8546b = i14;
            l3.f8548d = i18;
        }
        int i19 = l3.f8547c;
        if (i12 < i19 && i13 <= i19) {
            int i20 = i19 - i13;
            char[] cArr3 = (char[]) l3.f8549e;
            k.g0(cArr3, cArr3, l3.f8548d - i20, i13, i19);
            l3.f8547c = i12;
            l3.f8548d -= i20;
        } else if (i12 >= i19 || i13 < i19) {
            int b6 = l3.b() + i12;
            int b7 = l3.b() + i13;
            int i21 = l3.f8548d;
            char[] cArr4 = (char[]) l3.f8549e;
            k.g0(cArr4, cArr4, l3.f8547c, i21, b6);
            l3.f8547c += b6 - i21;
            l3.f8548d = b7;
        } else {
            l3.f8548d = l3.b() + i13;
            l3.f8547c = i12;
        }
        str.getChars(0, str.length(), (char[]) l3.f8549e, l3.f8547c);
        l3.f8547c = str.length() + l3.f8547c;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                L l3 = (L) this.f8603e;
                if (l3 == null) {
                    return (String) this.f8602d;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(this.f8602d, 0, this.f8600b);
                sb.append((char[]) l3.f8549e, 0, l3.f8547c);
                char[] cArr = (char[]) l3.f8549e;
                int i6 = l3.f8548d;
                sb.append(cArr, i6, l3.f8546b - i6);
                String str = (String) this.f8602d;
                sb.append((CharSequence) str, this.f8601c, str.length());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public d(CharSequence charSequence, int i6, Locale locale) {
        this.f8602d = charSequence;
        if (charSequence.length() < 0) {
            Y0.a.a("input start index is outside the CharSequence");
        }
        if (i6 < 0 || i6 > charSequence.length()) {
            Y0.a.a("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.f8603e = wordInstance;
        this.f8600b = Math.max(0, -50);
        this.f8601c = Math.min(charSequence.length(), i6 + 50);
        wordInstance.setText(new T0.b(i6, charSequence));
    }
}
