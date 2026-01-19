package T0;

import java.text.CharacterIterator;

/* loaded from: classes.dex */
public final class b implements CharacterIterator {

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f8299c;

    /* renamed from: e, reason: collision with root package name */
    public final int f8300e;

    /* renamed from: f, reason: collision with root package name */
    public int f8301f = 0;

    public b(int i6, CharSequence charSequence) {
        this.f8299c = charSequence;
        this.f8300e = i6;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i6 = this.f8301f;
        if (i6 == this.f8300e) {
            return (char) 65535;
        }
        return this.f8299c.charAt(i6);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.f8301f = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.f8300e;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.f8301f;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i6 = this.f8300e;
        if (i6 == 0) {
            this.f8301f = i6;
            return (char) 65535;
        }
        int i7 = i6 - 1;
        this.f8301f = i7;
        return this.f8299c.charAt(i7);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i6 = this.f8301f + 1;
        this.f8301f = i6;
        int i7 = this.f8300e;
        if (i6 < i7) {
            return this.f8299c.charAt(i6);
        }
        this.f8301f = i7;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i6 = this.f8301f;
        if (i6 <= 0) {
            return (char) 65535;
        }
        int i7 = i6 - 1;
        this.f8301f = i7;
        return this.f8299c.charAt(i7);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i6) {
        if (i6 > this.f8300e || i6 < 0) {
            throw new IllegalArgumentException("invalid position");
        }
        this.f8301f = i6;
        return current();
    }
}
