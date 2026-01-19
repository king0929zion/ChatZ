package Y;

import T.AbstractC0619m0;
import a0.C0791a;
import a0.C0792b;
import i4.AbstractC1117a;
import java.util.Arrays;
import m4.AbstractC1276k;
import o4.AbstractC1410a;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: e, reason: collision with root package name */
    public static final n f9569e = new n(0, 0, new Object[0], null);
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public int f9570b;

    /* renamed from: c, reason: collision with root package name */
    public final C0792b f9571c;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f9572d;

    public n(int i6, int i7, Object[] objArr, C0792b c0792b) {
        this.a = i6;
        this.f9570b = i7;
        this.f9571c = c0792b;
        this.f9572d = objArr;
    }

    public static n j(int i6, Object obj, Object obj2, int i7, Object obj3, Object obj4, int i8, C0792b c0792b) {
        if (i8 > 30) {
            return new n(0, 0, new Object[]{obj, obj2, obj3, obj4}, c0792b);
        }
        int x5 = AbstractC1410a.x(i6, i8);
        int x6 = AbstractC1410a.x(i7, i8);
        if (x5 != x6) {
            return new n((1 << x5) | (1 << x6), 0, x5 < x6 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, c0792b);
        }
        return new n(0, 1 << x5, new Object[]{j(i6, obj, obj2, i7, obj3, obj4, i8 + 5, c0792b)}, c0792b);
    }

    public final Object[] a(int i6, int i7, int i8, Object obj, Object obj2, int i9, C0792b c0792b) {
        Object obj3 = this.f9572d[i6];
        n j3 = j(obj3 != null ? obj3.hashCode() : 0, obj3, x(i6), i8, obj, obj2, i9 + 5, c0792b);
        int t5 = t(i7);
        int i10 = t5 + 1;
        Object[] objArr = this.f9572d;
        Object[] objArr2 = new Object[objArr.length - 1];
        Y3.k.l0(objArr, objArr2, 0, i6, 6);
        Y3.k.j0(objArr, objArr2, i6, i6 + 2, i10);
        objArr2[t5 - 1] = j3;
        Y3.k.j0(objArr, objArr2, t5, i10, objArr.length);
        return objArr2;
    }

    public final int b() {
        if (this.f9570b == 0) {
            return this.f9572d.length / 2;
        }
        int bitCount = Integer.bitCount(this.a);
        int length = this.f9572d.length;
        for (int i6 = bitCount * 2; i6 < length; i6++) {
            bitCount += s(i6).b();
        }
        return bitCount;
    }

    public final boolean c(Object obj) {
        r4.e u5 = AbstractC1117a.u(AbstractC1117a.z(0, this.f9572d.length), 2);
        int i6 = u5.f14679c;
        int i7 = u5.f14680e;
        int i8 = u5.f14681f;
        if ((i8 > 0 && i6 <= i7) || (i8 < 0 && i7 <= i6)) {
            while (!AbstractC1276k.b(obj, this.f9572d[i6])) {
                if (i6 != i7) {
                    i6 += i8;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i6, int i7, Object obj) {
        int x5 = 1 << AbstractC1410a.x(i6, i7);
        if (h(x5)) {
            return AbstractC1276k.b(obj, this.f9572d[f(x5)]);
        }
        if (!i(x5)) {
            return false;
        }
        n s5 = s(t(x5));
        return i7 == 30 ? s5.c(obj) : s5.d(i6, i7 + 5, obj);
    }

    public final boolean e(n nVar) {
        if (this == nVar) {
            return true;
        }
        if (this.f9570b == nVar.f9570b && this.a == nVar.a) {
            int length = this.f9572d.length;
            for (int i6 = 0; i6 < length; i6++) {
                if (this.f9572d[i6] == nVar.f9572d[i6]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(int i6) {
        return Integer.bitCount((i6 - 1) & this.a) * 2;
    }

    public final Object g(int i6, int i7, Object obj) {
        int x5 = 1 << AbstractC1410a.x(i6, i7);
        if (h(x5)) {
            int f6 = f(x5);
            if (AbstractC1276k.b(obj, this.f9572d[f6])) {
                return x(f6);
            }
            return null;
        }
        if (!i(x5)) {
            return null;
        }
        n s5 = s(t(x5));
        if (i7 != 30) {
            return s5.g(i6, i7 + 5, obj);
        }
        r4.e u5 = AbstractC1117a.u(AbstractC1117a.z(0, s5.f9572d.length), 2);
        int i8 = u5.f14679c;
        int i9 = u5.f14680e;
        int i10 = u5.f14681f;
        if ((i10 <= 0 || i8 > i9) && (i10 >= 0 || i9 > i8)) {
            return null;
        }
        while (!AbstractC1276k.b(obj, s5.f9572d[i8])) {
            if (i8 == i9) {
                return null;
            }
            i8 += i10;
        }
        return s5.x(i8);
    }

    public final boolean h(int i6) {
        return (i6 & this.a) != 0;
    }

    public final boolean i(int i6) {
        return (i6 & this.f9570b) != 0;
    }

    public final n k(int i6, e eVar) {
        eVar.b(eVar.f9554i - 1);
        eVar.f9552g = x(i6);
        Object[] objArr = this.f9572d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f9571c != eVar.f9550e) {
            return new n(0, 0, AbstractC1410a.d(objArr, i6), eVar.f9550e);
        }
        this.f9572d = AbstractC1410a.d(objArr, i6);
        return this;
    }

    public final n l(int i6, Object obj, Object obj2, int i7, e eVar) {
        e eVar2;
        n l3;
        int x5 = 1 << AbstractC1410a.x(i6, i7);
        boolean h3 = h(x5);
        C0792b c0792b = this.f9571c;
        if (h3) {
            int f6 = f(x5);
            if (!AbstractC1276k.b(obj, this.f9572d[f6])) {
                eVar.b(eVar.f9554i + 1);
                C0792b c0792b2 = eVar.f9550e;
                if (c0792b != c0792b2) {
                    return new n(this.a ^ x5, this.f9570b | x5, a(f6, x5, i6, obj, obj2, i7, c0792b2), c0792b2);
                }
                this.f9572d = a(f6, x5, i6, obj, obj2, i7, c0792b2);
                this.a ^= x5;
                this.f9570b |= x5;
                return this;
            }
            eVar.f9552g = x(f6);
            if (x(f6) == obj2) {
                return this;
            }
            if (c0792b == eVar.f9550e) {
                this.f9572d[f6 + 1] = obj2;
                return this;
            }
            eVar.f9553h++;
            Object[] objArr = this.f9572d;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            AbstractC1276k.e(copyOf, "copyOf(...)");
            copyOf[f6 + 1] = obj2;
            return new n(this.a, this.f9570b, copyOf, eVar.f9550e);
        }
        if (!i(x5)) {
            eVar.b(eVar.f9554i + 1);
            C0792b c0792b3 = eVar.f9550e;
            int f7 = f(x5);
            if (c0792b != c0792b3) {
                return new n(this.a | x5, this.f9570b, AbstractC1410a.c(this.f9572d, f7, obj, obj2), c0792b3);
            }
            this.f9572d = AbstractC1410a.c(this.f9572d, f7, obj, obj2);
            this.a |= x5;
            return this;
        }
        int t5 = t(x5);
        n s5 = s(t5);
        if (i7 == 30) {
            r4.e u5 = AbstractC1117a.u(AbstractC1117a.z(0, s5.f9572d.length), 2);
            int i8 = u5.f14679c;
            int i9 = u5.f14680e;
            int i10 = u5.f14681f;
            if ((i10 > 0 && i8 <= i9) || (i10 < 0 && i9 <= i8)) {
                while (!AbstractC1276k.b(obj, s5.f9572d[i8])) {
                    if (i8 != i9) {
                        i8 += i10;
                    }
                }
                eVar.f9552g = s5.x(i8);
                if (s5.f9571c == eVar.f9550e) {
                    s5.f9572d[i8 + 1] = obj2;
                    l3 = s5;
                } else {
                    eVar.f9553h++;
                    Object[] objArr2 = s5.f9572d;
                    Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                    AbstractC1276k.e(copyOf2, "copyOf(...)");
                    copyOf2[i8 + 1] = obj2;
                    l3 = new n(0, 0, copyOf2, eVar.f9550e);
                }
                eVar2 = eVar;
            }
            eVar.b(eVar.f9554i + 1);
            l3 = new n(0, 0, AbstractC1410a.c(s5.f9572d, 0, obj, obj2), eVar.f9550e);
            eVar2 = eVar;
        } else {
            eVar2 = eVar;
            l3 = s5.l(i6, obj, obj2, i7 + 5, eVar2);
        }
        return s5 == l3 ? this : r(t5, l3, eVar2.f9550e);
    }

    public final n m(n nVar, int i6, C0791a c0791a, e eVar) {
        Object[] objArr;
        n j3;
        if (this == nVar) {
            c0791a.a += b();
            return this;
        }
        int i7 = 0;
        if (i6 > 30) {
            C0792b c0792b = eVar.f9550e;
            int i8 = nVar.f9570b;
            Object[] objArr2 = this.f9572d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + nVar.f9572d.length);
            AbstractC1276k.e(copyOf, "copyOf(...)");
            int length = this.f9572d.length;
            r4.e u5 = AbstractC1117a.u(AbstractC1117a.z(0, nVar.f9572d.length), 2);
            int i9 = u5.f14679c;
            int i10 = u5.f14680e;
            int i11 = u5.f14681f;
            if ((i11 > 0 && i9 <= i10) || (i11 < 0 && i10 <= i9)) {
                while (true) {
                    if (c(nVar.f9572d[i9])) {
                        c0791a.a++;
                    } else {
                        Object[] objArr3 = nVar.f9572d;
                        copyOf[length] = objArr3[i9];
                        copyOf[length + 1] = objArr3[i9 + 1];
                        length += 2;
                    }
                    if (i9 == i10) {
                        break;
                    }
                    i9 += i11;
                }
            }
            if (length != this.f9572d.length) {
                if (length == nVar.f9572d.length) {
                    return nVar;
                }
                if (length == copyOf.length) {
                    return new n(0, 0, copyOf, c0792b);
                }
                Object[] copyOf2 = Arrays.copyOf(copyOf, length);
                AbstractC1276k.e(copyOf2, "copyOf(...)");
                return new n(0, 0, copyOf2, c0792b);
            }
        } else {
            int i12 = this.f9570b | nVar.f9570b;
            int i13 = this.a;
            int i14 = nVar.a;
            int i15 = (i13 ^ i14) & (~i12);
            int i16 = i13 & i14;
            int i17 = i15;
            while (i16 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i16);
                if (AbstractC1276k.b(this.f9572d[f(lowestOneBit)], nVar.f9572d[nVar.f(lowestOneBit)])) {
                    i17 |= lowestOneBit;
                } else {
                    i12 |= lowestOneBit;
                }
                i16 ^= lowestOneBit;
            }
            if ((i12 & i17) != 0) {
                AbstractC0619m0.b("Check failed.");
            }
            n nVar2 = (AbstractC1276k.b(this.f9571c, eVar.f9550e) && this.a == i17 && this.f9570b == i12) ? this : new n(i17, i12, new Object[Integer.bitCount(i12) + (Integer.bitCount(i17) * 2)], null);
            int i18 = i12;
            int i19 = 0;
            while (i18 != 0) {
                int lowestOneBit2 = Integer.lowestOneBit(i18);
                Object[] objArr4 = nVar2.f9572d;
                int length2 = (objArr4.length - 1) - i19;
                if (i(lowestOneBit2)) {
                    j3 = s(t(lowestOneBit2));
                    if (nVar.i(lowestOneBit2)) {
                        j3 = j3.m(nVar.s(nVar.t(lowestOneBit2)), i6 + 5, c0791a, eVar);
                        objArr = objArr4;
                    } else if (nVar.h(lowestOneBit2)) {
                        int f6 = nVar.f(lowestOneBit2);
                        Object obj = nVar.f9572d[f6];
                        Object x5 = nVar.x(f6);
                        int i20 = eVar.f9554i;
                        objArr = objArr4;
                        j3 = j3.l(obj != null ? obj.hashCode() : i7, obj, x5, i6 + 5, eVar);
                        if (eVar.f9554i == i20) {
                            c0791a.a++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (nVar.i(lowestOneBit2)) {
                        n s5 = nVar.s(nVar.t(lowestOneBit2));
                        if (h(lowestOneBit2)) {
                            int f7 = f(lowestOneBit2);
                            Object obj2 = this.f9572d[f7];
                            int i21 = i6 + 5;
                            if (s5.d(obj2 != null ? obj2.hashCode() : 0, i21, obj2)) {
                                c0791a.a++;
                            } else {
                                j3 = s5.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(f7), i21, eVar);
                            }
                        }
                        j3 = s5;
                    } else {
                        int f8 = f(lowestOneBit2);
                        Object obj3 = this.f9572d[f8];
                        Object x6 = x(f8);
                        int f9 = nVar.f(lowestOneBit2);
                        Object obj4 = nVar.f9572d[f9];
                        j3 = j(obj3 != null ? obj3.hashCode() : 0, obj3, x6, obj4 != null ? obj4.hashCode() : 0, obj4, nVar.x(f9), i6 + 5, eVar.f9550e);
                    }
                }
                objArr[length2] = j3;
                i19++;
                i18 ^= lowestOneBit2;
                i7 = 0;
            }
            int i22 = 0;
            while (i17 != 0) {
                int lowestOneBit3 = Integer.lowestOneBit(i17);
                int i23 = i22 * 2;
                if (nVar.h(lowestOneBit3)) {
                    int f10 = nVar.f(lowestOneBit3);
                    Object[] objArr5 = nVar2.f9572d;
                    objArr5[i23] = nVar.f9572d[f10];
                    objArr5[i23 + 1] = nVar.x(f10);
                    if (h(lowestOneBit3)) {
                        c0791a.a++;
                    }
                } else {
                    int f11 = f(lowestOneBit3);
                    Object[] objArr6 = nVar2.f9572d;
                    objArr6[i23] = this.f9572d[f11];
                    objArr6[i23 + 1] = x(f11);
                }
                i22++;
                i17 ^= lowestOneBit3;
            }
            if (!e(nVar2)) {
                return nVar.e(nVar2) ? nVar : nVar2;
            }
        }
        return this;
    }

    public final n n(int i6, Object obj, int i7, e eVar) {
        n n3;
        int x5 = 1 << AbstractC1410a.x(i6, i7);
        if (h(x5)) {
            int f6 = f(x5);
            if (AbstractC1276k.b(obj, this.f9572d[f6])) {
                return p(f6, x5, eVar);
            }
        } else if (i(x5)) {
            int t5 = t(x5);
            n s5 = s(t5);
            if (i7 == 30) {
                r4.e u5 = AbstractC1117a.u(AbstractC1117a.z(0, s5.f9572d.length), 2);
                int i8 = u5.f14679c;
                int i9 = u5.f14680e;
                int i10 = u5.f14681f;
                if ((i10 > 0 && i8 <= i9) || (i10 < 0 && i9 <= i8)) {
                    while (!AbstractC1276k.b(obj, s5.f9572d[i8])) {
                        if (i8 != i9) {
                            i8 += i10;
                        }
                    }
                    n3 = s5.k(i8, eVar);
                }
                n3 = s5;
                break;
            }
            n3 = s5.n(i6, obj, i7 + 5, eVar);
            return q(s5, n3, t5, x5, eVar.f9550e);
        }
        return this;
    }

    public final n o(int i6, Object obj, Object obj2, int i7, e eVar) {
        n nVar;
        n o5;
        int x5 = 1 << AbstractC1410a.x(i6, i7);
        if (h(x5)) {
            int f6 = f(x5);
            if (AbstractC1276k.b(obj, this.f9572d[f6]) && AbstractC1276k.b(obj2, x(f6))) {
                return p(f6, x5, eVar);
            }
        } else if (i(x5)) {
            int t5 = t(x5);
            n s5 = s(t5);
            if (i7 == 30) {
                r4.e u5 = AbstractC1117a.u(AbstractC1117a.z(0, s5.f9572d.length), 2);
                int i8 = u5.f14679c;
                int i9 = u5.f14680e;
                int i10 = u5.f14681f;
                if ((i10 > 0 && i8 <= i9) || (i10 < 0 && i9 <= i8)) {
                    while (true) {
                        if (!AbstractC1276k.b(obj, s5.f9572d[i8]) || !AbstractC1276k.b(obj2, s5.x(i8))) {
                            if (i8 == i9) {
                                break;
                            }
                            i8 += i10;
                        } else {
                            o5 = s5.k(i8, eVar);
                            break;
                        }
                    }
                    nVar = s5;
                }
                o5 = s5;
                nVar = s5;
            } else {
                nVar = s5;
                o5 = nVar.o(i6, obj, obj2, i7 + 5, eVar);
            }
            return q(nVar, o5, t5, x5, eVar.f9550e);
        }
        return this;
    }

    public final n p(int i6, int i7, e eVar) {
        eVar.b(eVar.f9554i - 1);
        eVar.f9552g = x(i6);
        Object[] objArr = this.f9572d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f9571c != eVar.f9550e) {
            return new n(i7 ^ this.a, this.f9570b, AbstractC1410a.d(objArr, i6), eVar.f9550e);
        }
        this.f9572d = AbstractC1410a.d(objArr, i6);
        this.a ^= i7;
        return this;
    }

    public final n q(n nVar, n nVar2, int i6, int i7, C0792b c0792b) {
        C0792b c0792b2 = this.f9571c;
        if (nVar2 != null) {
            return (c0792b2 == c0792b || nVar != nVar2) ? r(i6, nVar2, c0792b) : this;
        }
        Object[] objArr = this.f9572d;
        if (objArr.length == 1) {
            return null;
        }
        if (c0792b2 != c0792b) {
            return new n(this.a, i7 ^ this.f9570b, AbstractC1410a.e(objArr, i6), c0792b);
        }
        this.f9572d = AbstractC1410a.e(objArr, i6);
        this.f9570b ^= i7;
        return this;
    }

    public final n r(int i6, n nVar, C0792b c0792b) {
        Object[] objArr = this.f9572d;
        if (objArr.length == 1 && nVar.f9572d.length == 2 && nVar.f9570b == 0) {
            nVar.a = this.f9570b;
            return nVar;
        }
        if (this.f9571c == c0792b) {
            objArr[i6] = nVar;
            return this;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC1276k.e(copyOf, "copyOf(...)");
        copyOf[i6] = nVar;
        return new n(this.a, this.f9570b, copyOf, c0792b);
    }

    public final n s(int i6) {
        Object obj = this.f9572d[i6];
        AbstractC1276k.d(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (n) obj;
    }

    public final int t(int i6) {
        return (this.f9572d.length - 1) - Integer.bitCount((i6 - 1) & this.f9570b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d1, code lost:
    
        if (r14 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00dd, code lost:
    
        r14.f649c = w(r12, r4, (Y.n) r14.f649c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e7, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00da, code lost:
    
        if (r14 == null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final C0.c u(int r12, int r13, java.lang.Object r14, java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.n.u(int, int, java.lang.Object, java.lang.Object):C0.c");
    }

    public final n v(int i6, int i7, Object obj) {
        n v5;
        int x5 = 1 << AbstractC1410a.x(i6, i7);
        if (h(x5)) {
            int f6 = f(x5);
            if (AbstractC1276k.b(obj, this.f9572d[f6])) {
                Object[] objArr = this.f9572d;
                if (objArr.length != 2) {
                    return new n(this.a ^ x5, this.f9570b, AbstractC1410a.d(objArr, f6), null);
                }
                return null;
            }
            return this;
        }
        if (i(x5)) {
            int t5 = t(x5);
            n s5 = s(t5);
            if (i7 == 30) {
                r4.e u5 = AbstractC1117a.u(AbstractC1117a.z(0, s5.f9572d.length), 2);
                int i8 = u5.f14679c;
                int i9 = u5.f14680e;
                int i10 = u5.f14681f;
                if ((i10 > 0 && i8 <= i9) || (i10 < 0 && i9 <= i8)) {
                    while (!AbstractC1276k.b(obj, s5.f9572d[i8])) {
                        if (i8 != i9) {
                            i8 += i10;
                        }
                    }
                    Object[] objArr2 = s5.f9572d;
                    v5 = objArr2.length == 2 ? null : new n(0, 0, AbstractC1410a.d(objArr2, i8), null);
                }
                v5 = s5;
                break;
            }
            v5 = s5.v(i6, i7 + 5, obj);
            if (v5 == null) {
                Object[] objArr3 = this.f9572d;
                if (objArr3.length != 1) {
                    return new n(this.a, x5 ^ this.f9570b, AbstractC1410a.e(objArr3, t5), null);
                }
                return null;
            }
            if (s5 != v5) {
                return w(t5, x5, v5);
            }
        }
        return this;
    }

    public final n w(int i6, int i7, n nVar) {
        Object[] objArr = nVar.f9572d;
        if (objArr.length != 2 || nVar.f9570b != 0) {
            Object[] objArr2 = this.f9572d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
            AbstractC1276k.e(copyOf, "copyOf(...)");
            copyOf[i6] = nVar;
            return new n(this.a, this.f9570b, copyOf, null);
        }
        if (this.f9572d.length == 1) {
            nVar.a = this.f9570b;
            return nVar;
        }
        int f6 = f(i7);
        Object[] objArr3 = this.f9572d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        AbstractC1276k.e(copyOf2, "copyOf(...)");
        Y3.k.j0(copyOf2, copyOf2, i6 + 2, i6 + 1, objArr3.length);
        Y3.k.j0(copyOf2, copyOf2, f6 + 2, f6, i6);
        copyOf2[f6] = obj;
        copyOf2[f6 + 1] = obj2;
        return new n(this.a ^ i7, i7 ^ this.f9570b, copyOf2, null);
    }

    public final Object x(int i6) {
        return this.f9572d[i6 + 1];
    }
}
