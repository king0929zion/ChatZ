package com.vladsch.flexmark.util.misc;

import java.lang.reflect.Array;
import java.util.BitSet;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public class ArrayUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    @SafeVarargs
    public static <T> T[] append(Class<T> cls, T[] tArr, T... tArr2) {
        if (tArr2.length <= 0) {
            return tArr;
        }
        T[] tArr3 = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, tArr.length + tArr2.length));
        System.arraycopy(tArr, 0, tArr3, 0, tArr.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    public static <T> boolean contained(T t5, T[] tArr) {
        return indexOf(t5, tArr) != -1;
    }

    public static <T> T firstOf(T[] tArr, Predicate<? super T> predicate) {
        return (T) firstOf(tArr, 0, tArr.length, predicate);
    }

    public static <T> int indexOf(T t5, T[] tArr) {
        return indexOf(t5, tArr, 0, tArr.length);
    }

    public static <T> int lastIndexOf(T t5, T[] tArr) {
        return lastIndexOf(t5, tArr, 0, tArr.length);
    }

    public static <T> T lastOf(T[] tArr, Predicate<? super T> predicate) {
        return (T) lastOf(tArr, 0, tArr.length, predicate);
    }

    public static int[] toArray(BitSet bitSet) {
        int cardinality = bitSet.cardinality();
        int[] iArr = new int[cardinality];
        int length = bitSet.length();
        while (length >= 0) {
            length = bitSet.previousSetBit(length - 1);
            if (length < 0) {
                break;
            }
            cardinality--;
            iArr[cardinality] = length;
        }
        return iArr;
    }

    public static boolean contained(int i6, int[] iArr) {
        for (int i7 : iArr) {
            if (i7 == i6) {
                return true;
            }
        }
        return false;
    }

    public static <T> T firstOf(T[] tArr, int i6, Predicate<? super T> predicate) {
        return (T) firstOf(tArr, i6, tArr.length, predicate);
    }

    public static <T> int indexOf(T t5, T[] tArr, int i6) {
        return indexOf(t5, tArr, i6, tArr.length);
    }

    public static <T> int lastIndexOf(T t5, T[] tArr, int i6) {
        return lastIndexOf(t5, tArr, 0, i6);
    }

    public static <T> T lastOf(T[] tArr, int i6, Predicate<? super T> predicate) {
        return (T) lastOf(tArr, 0, i6, predicate);
    }

    public static <T> T firstOf(T[] tArr, int i6, int i7, Predicate<? super T> predicate) {
        int indexOf = indexOf(tArr, i6, i7, predicate);
        if (indexOf == -1) {
            return null;
        }
        return tArr[indexOf];
    }

    public static <T> int indexOf(T t5, T[] tArr, int i6, int i7) {
        return indexOf(tArr, i6, i7, new a(t5, 0));
    }

    public static <T> int lastIndexOf(T t5, T[] tArr, int i6, int i7) {
        return lastIndexOf(tArr, i6, i7, new a(t5, 1));
    }

    public static <T> T lastOf(T[] tArr, int i6, int i7, Predicate<? super T> predicate) {
        int lastIndexOf = lastIndexOf(tArr, i6, i7, predicate);
        if (lastIndexOf == -1) {
            return null;
        }
        return tArr[lastIndexOf];
    }

    public static <T> int indexOf(T[] tArr, Predicate<? super T> predicate) {
        return indexOf(tArr, 0, tArr.length, predicate);
    }

    public static <T> int lastIndexOf(T[] tArr, Predicate<? super T> predicate) {
        return lastIndexOf(tArr, 0, tArr.length, predicate);
    }

    public static <T> int indexOf(T[] tArr, int i6, Predicate<? super T> predicate) {
        return indexOf(tArr, i6, tArr.length, predicate);
    }

    public static <T> int lastIndexOf(T[] tArr, int i6, Predicate<? super T> predicate) {
        return lastIndexOf(tArr, 0, i6, predicate);
    }

    public static <T> int indexOf(T[] tArr, int i6, int i7, Predicate<? super T> predicate) {
        int length = tArr.length;
        if (i7 <= 0) {
            return -1;
        }
        if (i6 < 0) {
            i6 = 0;
        }
        if (i7 > length) {
            i7 = length;
        }
        if (i6 >= i7) {
            return -1;
        }
        while (i6 < i7) {
            if (predicate.test(tArr[i6])) {
                return i6;
            }
            i6++;
        }
        return -1;
    }

    public static <T> int lastIndexOf(T[] tArr, int i6, int i7, Predicate<? super T> predicate) {
        int length = tArr.length;
        if (i7 < 0) {
            return -1;
        }
        if (i6 < 0) {
            i6 = 0;
        }
        if (i7 >= length) {
            i7 = length - 1;
        }
        if (i6 >= i7) {
            return -1;
        }
        while (i7 >= i6) {
            if (predicate.test(tArr[i7])) {
                return i7;
            }
            i7--;
        }
        return -1;
    }
}
