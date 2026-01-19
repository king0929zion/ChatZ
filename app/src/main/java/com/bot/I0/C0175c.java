package I0;

import java.text.BreakIterator;
import m4.AbstractC1276k;

/* renamed from: I0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0175c extends AbstractC0173b {

    /* renamed from: f, reason: collision with root package name */
    public static C0175c f2281f;

    /* renamed from: g, reason: collision with root package name */
    public static C0175c f2282g;

    /* renamed from: h, reason: collision with root package name */
    public static C0175c f2283h;

    /* renamed from: i, reason: collision with root package name */
    public static final d1.j f2284i = d1.j.f11391e;

    /* renamed from: j, reason: collision with root package name */
    public static final d1.j f2285j = d1.j.f11390c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2286d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2287e;

    @Override // I0.AbstractC0173b
    public final int[] a(int i6) {
        int i7;
        switch (this.f2286d) {
            case 0:
                int length = c().length();
                if (length <= 0 || i6 >= length) {
                    return null;
                }
                if (i6 < 0) {
                    i6 = 0;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.f2287e;
                    if (breakIterator == null) {
                        AbstractC1276k.k("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i6)) {
                        BreakIterator breakIterator2 = (BreakIterator) this.f2287e;
                        if (breakIterator2 == null) {
                            AbstractC1276k.k("impl");
                            throw null;
                        }
                        int following = breakIterator2.following(i6);
                        if (following == -1) {
                            return null;
                        }
                        return b(i6, following);
                    }
                    BreakIterator breakIterator3 = (BreakIterator) this.f2287e;
                    if (breakIterator3 == null) {
                        AbstractC1276k.k("impl");
                        throw null;
                    }
                    i6 = breakIterator3.following(i6);
                } while (i6 != -1);
                return null;
            case 1:
                if (c().length() <= 0 || i6 >= c().length()) {
                    return null;
                }
                if (i6 < 0) {
                    i6 = 0;
                }
                while (!i(i6) && (!i(i6) || (i6 != 0 && i(i6 - 1)))) {
                    BreakIterator breakIterator4 = (BreakIterator) this.f2287e;
                    if (breakIterator4 == null) {
                        AbstractC1276k.k("impl");
                        throw null;
                    }
                    i6 = breakIterator4.following(i6);
                    if (i6 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = (BreakIterator) this.f2287e;
                if (breakIterator5 == null) {
                    AbstractC1276k.k("impl");
                    throw null;
                }
                int following2 = breakIterator5.following(i6);
                if (following2 == -1 || !h(following2)) {
                    return null;
                }
                return b(i6, following2);
            default:
                if (c().length() <= 0 || i6 >= c().length()) {
                    return null;
                }
                d1.j jVar = f2284i;
                if (i6 < 0) {
                    S0.L l3 = (S0.L) this.f2287e;
                    if (l3 == null) {
                        AbstractC1276k.k("layoutResult");
                        throw null;
                    }
                    i7 = l3.f7599b.d(0);
                } else {
                    S0.L l5 = (S0.L) this.f2287e;
                    if (l5 == null) {
                        AbstractC1276k.k("layoutResult");
                        throw null;
                    }
                    int d6 = l5.f7599b.d(i6);
                    i7 = f(d6, jVar) == i6 ? d6 : d6 + 1;
                }
                S0.L l6 = (S0.L) this.f2287e;
                if (l6 == null) {
                    AbstractC1276k.k("layoutResult");
                    throw null;
                }
                if (i7 >= l6.f7599b.f7652f) {
                    return null;
                }
                return b(f(i7, jVar), f(i7, f2285j) + 1);
        }
    }

    @Override // I0.AbstractC0173b
    public final int[] e(int i6) {
        int i7;
        switch (this.f2286d) {
            case 0:
                int length = c().length();
                if (length <= 0 || i6 <= 0) {
                    return null;
                }
                if (i6 > length) {
                    i6 = length;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.f2287e;
                    if (breakIterator == null) {
                        AbstractC1276k.k("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i6)) {
                        BreakIterator breakIterator2 = (BreakIterator) this.f2287e;
                        if (breakIterator2 == null) {
                            AbstractC1276k.k("impl");
                            throw null;
                        }
                        int preceding = breakIterator2.preceding(i6);
                        if (preceding == -1) {
                            return null;
                        }
                        return b(preceding, i6);
                    }
                    BreakIterator breakIterator3 = (BreakIterator) this.f2287e;
                    if (breakIterator3 == null) {
                        AbstractC1276k.k("impl");
                        throw null;
                    }
                    i6 = breakIterator3.preceding(i6);
                } while (i6 != -1);
                return null;
            case 1:
                int length2 = c().length();
                if (length2 <= 0 || i6 <= 0) {
                    return null;
                }
                if (i6 > length2) {
                    i6 = length2;
                }
                while (i6 > 0 && !i(i6 - 1) && !h(i6)) {
                    BreakIterator breakIterator4 = (BreakIterator) this.f2287e;
                    if (breakIterator4 == null) {
                        AbstractC1276k.k("impl");
                        throw null;
                    }
                    i6 = breakIterator4.preceding(i6);
                    if (i6 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = (BreakIterator) this.f2287e;
                if (breakIterator5 == null) {
                    AbstractC1276k.k("impl");
                    throw null;
                }
                int preceding2 = breakIterator5.preceding(i6);
                if (preceding2 == -1 || !i(preceding2)) {
                    return null;
                }
                if (preceding2 == 0 || !i(preceding2 - 1)) {
                    return b(preceding2, i6);
                }
                return null;
            default:
                if (c().length() <= 0 || i6 <= 0) {
                    return null;
                }
                int length3 = c().length();
                d1.j jVar = f2285j;
                if (i6 > length3) {
                    S0.L l3 = (S0.L) this.f2287e;
                    if (l3 == null) {
                        AbstractC1276k.k("layoutResult");
                        throw null;
                    }
                    i7 = l3.f7599b.d(c().length());
                } else {
                    S0.L l5 = (S0.L) this.f2287e;
                    if (l5 == null) {
                        AbstractC1276k.k("layoutResult");
                        throw null;
                    }
                    int d6 = l5.f7599b.d(i6);
                    i7 = f(d6, jVar) + 1 == i6 ? d6 : d6 - 1;
                }
                if (i7 < 0) {
                    return null;
                }
                return b(f(i7, f2284i), f(i7, jVar) + 1);
        }
    }

    public int f(int i6, d1.j jVar) {
        S0.L l3 = (S0.L) this.f2287e;
        if (l3 == null) {
            AbstractC1276k.k("layoutResult");
            throw null;
        }
        int i7 = l3.i(i6);
        S0.L l5 = (S0.L) this.f2287e;
        if (l5 == null) {
            AbstractC1276k.k("layoutResult");
            throw null;
        }
        if (jVar != l5.j(i7)) {
            S0.L l6 = (S0.L) this.f2287e;
            if (l6 != null) {
                return l6.i(i6);
            }
            AbstractC1276k.k("layoutResult");
            throw null;
        }
        if (((S0.L) this.f2287e) != null) {
            return r6.f7599b.c(i6, false) - 1;
        }
        AbstractC1276k.k("layoutResult");
        throw null;
    }

    public void g(String str) {
        switch (this.f2286d) {
            case 0:
                this.f2279b = str;
                BreakIterator breakIterator = (BreakIterator) this.f2287e;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    AbstractC1276k.k("impl");
                    throw null;
                }
            default:
                this.f2279b = str;
                BreakIterator breakIterator2 = (BreakIterator) this.f2287e;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    AbstractC1276k.k("impl");
                    throw null;
                }
        }
    }

    public boolean h(int i6) {
        if (i6 <= 0 || !i(i6 - 1)) {
            return false;
        }
        return i6 == c().length() || !i(i6);
    }

    public boolean i(int i6) {
        if (i6 < 0 || i6 >= c().length()) {
            return false;
        }
        return Character.isLetterOrDigit(c().codePointAt(i6));
    }
}
