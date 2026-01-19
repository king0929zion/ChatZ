package com.vladsch.flexmark.util.misc;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Enum;
import java.lang.reflect.Field;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class BitFieldSet<E extends Enum<E>> extends AbstractSet<E> implements Cloneable, Serializable {
    static final Enum<?>[] ZERO_LENGTH_ENUM_ARRAY = new Enum[0];
    private static final long serialVersionUID = 3411599620347842686L;
    final long[] bitMasks;
    final Class<E> elementType;
    long elements = 0;
    final int totalBits;
    final E[] universe;

    /* loaded from: classes.dex */
    public class EnumBitFieldIterator<E extends Enum<E>> implements Iterator<E> {
        int lastReturnedIndex = -1;
        int nextIndex = -1;

        public EnumBitFieldIterator() {
            findNext();
        }

        public void findNext() {
            int i6;
            BitFieldSet bitFieldSet;
            do {
                i6 = this.nextIndex + 1;
                this.nextIndex = i6;
                bitFieldSet = BitFieldSet.this;
                if (i6 >= bitFieldSet.universe.length) {
                    return;
                }
            } while ((bitFieldSet.bitMasks[i6] & bitFieldSet.elements) == 0);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.nextIndex < BitFieldSet.this.universe.length;
        }

        @Override // java.util.Iterator
        public void remove() {
            int i6 = this.lastReturnedIndex;
            if (i6 == -1) {
                throw new IllegalStateException();
            }
            BitFieldSet bitFieldSet = BitFieldSet.this;
            bitFieldSet.elements &= ~bitFieldSet.bitMasks[i6];
            this.lastReturnedIndex = -1;
        }

        @Override // java.util.Iterator
        public E next() {
            int i6 = this.nextIndex;
            if (i6 < BitFieldSet.this.universe.length) {
                this.lastReturnedIndex = i6;
                findNext();
                return BitFieldSet.this.universe[this.lastReturnedIndex];
            }
            throw new NoSuchElementException();
        }
    }

    /* loaded from: classes.dex */
    public class EnumBitSetIterator<E extends Enum<E>> implements Iterator<E> {
        long lastReturned = 0;
        long unseen;

        public EnumBitSetIterator() {
            this.unseen = BitFieldSet.this.elements;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.unseen != 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            long j3 = this.lastReturned;
            if (j3 == 0) {
                throw new IllegalStateException();
            }
            BitFieldSet bitFieldSet = BitFieldSet.this;
            bitFieldSet.elements = (~j3) & bitFieldSet.elements;
            this.lastReturned = 0L;
        }

        @Override // java.util.Iterator
        public E next() {
            long j3 = this.unseen;
            if (j3 != 0) {
                long j4 = (-j3) & j3;
                this.lastReturned = j4;
                this.unseen = j3 - j4;
                return BitFieldSet.this.universe[Long.numberOfTrailingZeros(j4)];
            }
            throw new NoSuchElementException();
        }
    }

    /* loaded from: classes.dex */
    public static class SerializationProxy<E extends Enum<E>> implements Serializable {
        private static final long serialVersionUID = 362491234563181265L;
        private final long bits;
        private final Class<E> elementType;

        public SerializationProxy(BitFieldSet<E> bitFieldSet) {
            this.elementType = bitFieldSet.elementType;
            this.bits = bitFieldSet.elements;
        }

        private Object readResolve() {
            BitFieldSet noneOf = BitFieldSet.noneOf(this.elementType);
            noneOf.orMask(this.bits);
            return noneOf;
        }
    }

    /* loaded from: classes.dex */
    public static class UniverseLoader {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        static final ConcurrentHashMap<Class, Enum[]> enumUniverseMap = new ConcurrentHashMap<>();
        static final ConcurrentHashMap<Class, long[]> enumBitMasksMap = new ConcurrentHashMap<>();

        public static Enum[] getUniverseSlow(Class cls) {
            Enum<?>[] enumArr;
            Enum[] enumArr2 = enumUniverseMap.get(cls);
            if (enumArr2 != null) {
                return enumArr2;
            }
            Field[] fields = cls.getFields();
            int i6 = 0;
            for (Field field : fields) {
                if (field.getType().isEnum()) {
                    i6++;
                }
            }
            if (i6 > 0) {
                enumArr = new Enum[i6];
                int i7 = 0;
                for (Field field2 : fields) {
                    if (field2.getType().isEnum()) {
                        enumArr[i7] = Enum.valueOf(field2.getType(), field2.getName());
                        i7++;
                    }
                }
            } else {
                enumArr = BitFieldSet.ZERO_LENGTH_ENUM_ARRAY;
            }
            enumUniverseMap.put(cls, enumArr);
            return enumArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BitFieldSet(Class<E> cls, Enum<?>[] enumArr, long[] jArr) {
        this.elementType = cls;
        this.universe = enumArr;
        this.bitMasks = jArr;
        this.totalBits = getTotalBits(jArr);
    }

    public static boolean all(long j3, long j4) {
        return (j3 & j4) == j4;
    }

    public static <E extends Enum<E>> BitFieldSet<E> allOf(Class<E> cls) {
        BitFieldSet<E> noneOf = noneOf(cls);
        noneOf.addAll();
        return noneOf;
    }

    public static long andNotMask(long j3, long j4) {
        return j3 & (~j4);
    }

    public static boolean any(long j3, long j4) {
        return (j3 & j4) != 0;
    }

    public static <E extends Enum<E>> BitFieldSet<E> complementOf(BitFieldSet<E> bitFieldSet) {
        BitFieldSet<E> copyOf = copyOf((BitFieldSet) bitFieldSet);
        copyOf.complement();
        return copyOf;
    }

    public static <E extends Enum<E>> BitFieldSet<E> copyOf(BitFieldSet<E> bitFieldSet) {
        return bitFieldSet.m12clone();
    }

    public static <E extends Enum<E>> long getBitField(long j3, E e6) {
        return getUnsignedBitField(j3, e6, 64, "long");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E extends Enum<E>> long[] getBitMasks(Class<E> cls) {
        long[] jArr;
        long[] jArr2 = UniverseLoader.enumBitMasksMap.get(cls);
        if (jArr2 != null) {
            return jArr2;
        }
        Enum[] universeSlow = UniverseLoader.getUniverseSlow(cls);
        int i6 = 0;
        if (BitField.class.isAssignableFrom(cls)) {
            jArr = new long[universeSlow.length];
            int length = universeSlow.length;
            int i7 = 0;
            while (i6 < length) {
                D2.e eVar = universeSlow[i6];
                int bits = ((BitField) eVar).getBits();
                if (bits <= 0) {
                    throw new IllegalArgumentException(String.format("Enum bit field %s.%s bits must be >= 1, got: %d", cls.getSimpleName(), eVar.name(), Integer.valueOf(bits)));
                }
                int i8 = i7 + bits;
                if (i8 > 64) {
                    throw new IllegalArgumentException(String.format("Enum bit field %s.%s bits exceed available 64 bits by %d", cls.getSimpleName(), eVar.name(), Integer.valueOf(i8 - 64)));
                }
                jArr[eVar.ordinal()] = nextBitMask(i7, bits);
                i6++;
                i7 = i8;
            }
        } else {
            if (universeSlow.length > 64) {
                throw new IllegalArgumentException("Enums with more than 64 values are not supported");
            }
            jArr = new long[universeSlow.length];
            int length2 = universeSlow.length;
            while (i6 < length2) {
                D2.e eVar2 = universeSlow[i6];
                jArr[eVar2.ordinal()] = 1 << eVar2.ordinal();
                i6++;
            }
        }
        UniverseLoader.enumBitMasksMap.put(cls, jArr);
        return jArr;
    }

    public static <E extends Enum<E>> long getSignedBitField(long j3, E e6, int i6, String str) {
        Class<E> declaringClass = e6.getDeclaringClass();
        long j4 = getBitMasks(declaringClass)[e6.ordinal()];
        int bitCount = Long.bitCount(j4);
        if (bitCount <= i6) {
            return (j3 << Long.numberOfLeadingZeros(j4)) >> (64 - bitCount);
        }
        throw new IllegalArgumentException(String.format("Enum field %s.%s uses %d, which is more than %d available in %s", declaringClass.getSimpleName(), e6.name(), Integer.valueOf(bitCount), Integer.valueOf(i6), str));
    }

    public static int getTotalBits(long[] jArr) {
        if (jArr.length == 0) {
            return 0;
        }
        return 64 - Long.numberOfLeadingZeros(jArr[jArr.length - 1]);
    }

    public static <E extends Enum<E>> E[] getUniverse(Class<E> cls) {
        return (E[]) UniverseLoader.getUniverseSlow(cls);
    }

    public static <E extends Enum<E>> long getUnsignedBitField(long j3, E e6, int i6, String str) {
        Class<E> declaringClass = e6.getDeclaringClass();
        long j4 = getBitMasks(declaringClass)[e6.ordinal()];
        int bitCount = Long.bitCount(j4);
        if (bitCount <= i6) {
            return (j3 & j4) >>> Long.numberOfTrailingZeros(j4);
        }
        throw new IllegalArgumentException(String.format("Enum field %s.%s uses %d, which is more than %d available in %s", declaringClass.getSimpleName(), e6.name(), Integer.valueOf(bitCount), Integer.valueOf(i6), str));
    }

    public static <E extends Enum<E>> int intMask(E e6) {
        long[] bitMasks = getBitMasks(e6.getDeclaringClass());
        int totalBits = getTotalBits(bitMasks);
        if (totalBits <= 32) {
            return (int) bitMasks[e6.ordinal()];
        }
        throw new IllegalArgumentException(String.format("Enum fields use %d, which is more than 32 available in int", Integer.valueOf(totalBits)));
    }

    public static <E extends Enum<E>> long longMask(E e6) {
        return getBitMasks(e6.getDeclaringClass())[e6.ordinal()];
    }

    public static long nextBitMask(int i6, int i7) {
        return ((-1) >>> (-i7)) << i6;
    }

    public static boolean none(long j3, long j4) {
        return (j3 & j4) == 0;
    }

    public static <E extends Enum<E>> BitFieldSet<E> noneOf(Class<E> cls) {
        if (cls.isEnum()) {
            return new BitFieldSet<>(cls, getUniverse(cls), getBitMasks(cls));
        }
        throw new ClassCastException(cls + " not an enum");
    }

    public static <T extends Enum<T>> BitFieldSet<T> of(Class<T> cls, long j3) {
        BitFieldSet<T> noneOf = noneOf(cls);
        noneOf.orMask(j3);
        return noneOf;
    }

    public static long orMask(long j3, long j4) {
        return j3 | j4;
    }

    public static <E extends Enum<E>> BitFieldSet<E> range(E e6, E e7) {
        if (e6.compareTo(e7) <= 0) {
            BitFieldSet<E> noneOf = noneOf(e6.getDeclaringClass());
            noneOf.addRange(e6, e7);
            return noneOf;
        }
        throw new IllegalArgumentException(e6 + " > " + e7);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Proxy required");
    }

    public void addAll() {
        int i6 = this.totalBits;
        if (i6 != 0) {
            this.elements = (-1) >>> (-i6);
        }
    }

    public void addRange(E e6, E e7) {
        this.elements = ((-1) >>> ((e6.ordinal() - e7.ordinal()) - 1)) << e6.ordinal();
    }

    public long allBitsMask() {
        return (-1) >>> (-this.totalBits);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.elements = 0L;
    }

    public void complement() {
        int i6 = this.totalBits;
        if (i6 != 0) {
            this.elements = (~this.elements) & ((-1) >>> (-i6));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        Class<?> cls = obj.getClass();
        return (cls == this.elementType || cls.getSuperclass() == this.elementType) && (this.elements & this.bitMasks[((Enum) obj).ordinal()]) != 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        if (!(collection instanceof BitFieldSet)) {
            return super.containsAll(collection);
        }
        BitFieldSet bitFieldSet = (BitFieldSet) collection;
        return bitFieldSet.elementType != this.elementType ? bitFieldSet.isEmpty() : (bitFieldSet.elements & (~this.elements)) == 0;
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (!(obj instanceof BitFieldSet)) {
            return super.equals(obj);
        }
        BitFieldSet bitFieldSet = (BitFieldSet) obj;
        return bitFieldSet.elementType != this.elementType ? this.elements == 0 && bitFieldSet.elements == 0 : bitFieldSet.elements == this.elements;
    }

    public long get(E e6) {
        long j3 = this.bitMasks[e6.ordinal()];
        return (this.elements & j3) >>> Long.numberOfTrailingZeros(j3);
    }

    public byte getByte(E e6) {
        return (byte) getSigned(e6, 8, "byte");
    }

    public int getInt(E e6) {
        return (int) getSigned(e6, 32, "int");
    }

    public long getLong(E e6) {
        return getSigned(e6, 64, "long");
    }

    public short getShort(E e6) {
        return (short) getSigned(e6, 16, "short");
    }

    public long getSigned(E e6, int i6, String str) {
        return getSignedBitField(this.elements, e6, i6, str);
    }

    public byte getUByte(E e6) {
        return (byte) getSigned(e6, 8, "byte");
    }

    public int getUInt(E e6) {
        return (int) getSigned(e6, 32, "int");
    }

    public short getUShort(E e6) {
        return (short) getSigned(e6, 16, "short");
    }

    public long getUnsigned(E e6, int i6, String str) {
        return getUnsignedBitField(this.elements, e6, i6, str);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.elements == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return this.bitMasks.length == this.totalBits ? new EnumBitSetIterator() : new EnumBitFieldIterator();
    }

    public long mask(E e6) {
        return this.bitMasks[e6.ordinal()];
    }

    public boolean remove(E e6, E e7) {
        return andNotMask(mask(e6, e7));
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        if (!(collection instanceof BitFieldSet)) {
            return super.removeAll(collection);
        }
        BitFieldSet bitFieldSet = (BitFieldSet) collection;
        if (bitFieldSet.elementType != this.elementType) {
            return false;
        }
        long j3 = this.elements;
        long j4 = (~bitFieldSet.elements) & j3;
        this.elements = j4;
        return j4 != j3;
    }

    @Deprecated
    public boolean replaceAll(long j3) {
        return setAll(j3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        if (!(collection instanceof BitFieldSet)) {
            return super.retainAll(collection);
        }
        BitFieldSet bitFieldSet = (BitFieldSet) collection;
        if (bitFieldSet.elementType != this.elementType) {
            boolean z5 = this.elements != 0;
            this.elements = 0L;
            return z5;
        }
        long j3 = this.elements;
        long j4 = bitFieldSet.elements & j3;
        this.elements = j4;
        return j4 != j3;
    }

    public boolean setAll(long j3) {
        long j4 = (~((-1) >>> (-this.totalBits))) & j3;
        if (j4 != 0) {
            throw new IllegalArgumentException(String.format("mask %d(0b%s) value contains elements outside the universe 0b%s", Long.valueOf(j3), Long.toBinaryString(j3), Long.toBinaryString(j4)));
        }
        long j5 = this.elements;
        this.elements = j3;
        return j5 != j3;
    }

    public void setBitField(E e6, long j3) {
        setSigned(e6, j3);
    }

    public boolean setSigned(E e6, long j3) {
        long j4 = this.elements;
        long signed = setSigned(this.elementType, this.bitMasks, j4, e6, j3);
        this.elements = signed;
        return j4 != signed;
    }

    public boolean setUnsigned(E e6, long j3) {
        long j4 = this.elements;
        long unsigned = setUnsigned(this.elementType, this.bitMasks, j4, e6, j3);
        this.elements = unsigned;
        return j4 != unsigned;
    }

    public void setUnsignedField(E e6, long j3) {
        setUnsigned(e6, j3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.totalBits;
    }

    public byte toByte() {
        if (this.totalBits <= 8) {
            return (byte) this.elements;
        }
        throw new IllegalArgumentException(String.format("Enum fields use %d bits, which is more than 8 bits available in a byte", Integer.valueOf(this.totalBits)));
    }

    public int toInt() {
        if (this.totalBits <= 32) {
            return (int) this.elements;
        }
        throw new IllegalArgumentException(String.format("Enum fields use %d bits, which is more than 32 bits available in an int", Integer.valueOf(this.totalBits)));
    }

    public long toLong() {
        return this.elements;
    }

    public short toShort() {
        if (this.totalBits <= 16) {
            return (short) this.elements;
        }
        throw new IllegalArgumentException(String.format("Enum fields use %d bits, which is more than 16 bits available in a short", Integer.valueOf(this.totalBits)));
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        if (this.elements == 0) {
            return this.elementType.getSimpleName().concat(": { }");
        }
        DelimitedBuilder delimitedBuilder = new DelimitedBuilder(", ");
        delimitedBuilder.append(this.elementType.getSimpleName()).append(": { ");
        for (E e6 : this.universe) {
            if (any(mask((BitFieldSet<E>) e6))) {
                delimitedBuilder.append(e6.name());
                if ((e6 instanceof BitField) && ((BitField) e6).getBits() > 1) {
                    delimitedBuilder.append("(").append(getLong(e6)).append(")");
                }
                delimitedBuilder.mark();
            }
        }
        delimitedBuilder.unmark().append(" }");
        return delimitedBuilder.toString();
    }

    public final void typeCheck(E e6) {
        Class<?> cls = e6.getClass();
        if (cls == this.elementType || cls.getSuperclass() == this.elementType) {
            return;
        }
        throw new ClassCastException(cls + " != " + this.elementType);
    }

    public Object writeReplace() {
        return new SerializationProxy(this);
    }

    public static <E extends Enum<E>> BitFieldSet<E> copyOf(Collection<E> collection) {
        if (collection instanceof BitFieldSet) {
            return ((BitFieldSet) collection).m12clone();
        }
        if (!collection.isEmpty()) {
            Iterator<E> it = collection.iterator();
            BitFieldSet<E> of = of((Enum) it.next());
            while (it.hasNext()) {
                of.add((BitFieldSet<E>) it.next());
            }
            return of;
        }
        throw new IllegalArgumentException("Collection is empty");
    }

    public static <E extends Enum<E>> int getBitField(int i6, E e6) {
        return (int) getUnsignedBitField(i6, e6, 32, "int");
    }

    public boolean add(E e6, E e7) {
        return orMask(mask(e6, e7));
    }

    public boolean all(long j3) {
        long j4 = (~((-1) >>> (-this.totalBits))) & j3;
        if (j4 == 0) {
            return (this.elements & j3) == j3;
        }
        throw new IllegalArgumentException(String.format("mask %d(0b%s) value contains elements outside the universe 0b%s", Long.valueOf(j3), Long.toBinaryString(j3), Long.toBinaryString(j4)));
    }

    public boolean andNotMask(long j3) {
        long j4 = this.elements;
        long j5 = (~j3) & j4;
        this.elements = j5;
        return j4 != j5;
    }

    public boolean any(long j3) {
        return (j3 & this.elements) != 0;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public BitFieldSet<E> m12clone() {
        try {
            return (BitFieldSet) super.clone();
        } catch (CloneNotSupportedException e6) {
            throw new AssertionError(e6);
        }
    }

    public long mask(E e6, E e7) {
        return this.bitMasks[e6.ordinal()] | this.bitMasks[e7.ordinal()];
    }

    public boolean none(long j3) {
        return (j3 & this.elements) == 0;
    }

    public boolean orMask(long j3) {
        long j4 = (~((-1) >>> (-this.totalBits))) & j3;
        if (j4 == 0) {
            long j5 = this.elements;
            long j6 = j3 | j5;
            this.elements = j6;
            return j5 != j6;
        }
        throw new IllegalArgumentException(String.format("bitMask %d value contains elements outside the universe %s", Long.valueOf(j3), Long.toBinaryString(j4)));
    }

    public boolean remove(E e6, E e7, E e8) {
        return andNotMask(mask(e6, e7, e8));
    }

    public void setBitField(E e6, int i6) {
        setSigned(e6, i6);
    }

    public void setUnsignedField(E e6, int i6) {
        setUnsigned(e6, i6);
    }

    public static <E extends Enum<E>> short getBitField(short s5, E e6) {
        return (short) getUnsignedBitField(s5, e6, 16, "short");
    }

    public static <E extends Enum<E>> BitFieldSet<E> of(E e6) {
        BitFieldSet<E> noneOf = noneOf(e6.getDeclaringClass());
        noneOf.add((BitFieldSet<E>) e6);
        return noneOf;
    }

    public static <E extends Enum<E>> long setSigned(long j3, E e6, long j4) {
        Class<E> declaringClass = e6.getDeclaringClass();
        return setSigned(declaringClass, getBitMasks(declaringClass), j3, e6, j4);
    }

    public static <E extends Enum<E>> long setUnsigned(long j3, E e6, long j4) {
        Class<E> declaringClass = e6.getDeclaringClass();
        return setUnsigned(declaringClass, getBitMasks(declaringClass), j3, e6, j4);
    }

    public boolean add(E e6, E e7, E e8) {
        return orMask(mask(e6, e7, e8));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        if (!(collection instanceof BitFieldSet)) {
            return super.addAll(collection);
        }
        BitFieldSet bitFieldSet = (BitFieldSet) collection;
        if (bitFieldSet.elementType != this.elementType) {
            if (bitFieldSet.isEmpty()) {
                return false;
            }
            throw new ClassCastException(bitFieldSet.elementType + " != " + this.elementType);
        }
        long j3 = this.elements;
        long j4 = bitFieldSet.elements | j3;
        this.elements = j4;
        return j4 != j3;
    }

    public boolean any(E e6) {
        return any(mask((BitFieldSet<E>) e6));
    }

    public long mask(E e6, E e7, E e8) {
        return this.bitMasks[e6.ordinal()] | this.bitMasks[e7.ordinal()] | this.bitMasks[e8.ordinal()];
    }

    public boolean none(E e6) {
        return none(mask((BitFieldSet<E>) e6));
    }

    public boolean remove(E e6, E e7, E e8, E e9) {
        return andNotMask(mask(e6, e7, e8, e9));
    }

    public void setBitField(E e6, short s5) {
        setSigned(e6, s5);
    }

    public void setUnsignedField(E e6, short s5) {
        setUnsigned(e6, s5);
    }

    public static <E extends Enum<E>> byte getBitField(byte b5, E e6) {
        return (byte) getUnsignedBitField(b5, e6, 8, "byte");
    }

    public boolean add(E e6, E e7, E e8, E e9) {
        return orMask(mask(e6, e7, e8, e9));
    }

    public boolean any(E e6, E e7) {
        return any(mask(e6, e7));
    }

    public long mask(E e6, E e7, E e8, E e9) {
        return this.bitMasks[e6.ordinal()] | this.bitMasks[e7.ordinal()] | this.bitMasks[e8.ordinal()] | this.bitMasks[e9.ordinal()];
    }

    public boolean none(E e6, E e7) {
        return none(mask(e6, e7));
    }

    public boolean remove(E e6, E e7, E e8, E e9, E e10) {
        return andNotMask(mask(e6, e7, e8, e9, e10));
    }

    public void setBitField(E e6, byte b5) {
        setSigned(e6, b5);
    }

    public void setUnsignedField(E e6, byte b5) {
        setUnsigned(e6, b5);
    }

    public static <E extends Enum<E>> BitFieldSet<E> of(E e6, E e7) {
        BitFieldSet<E> noneOf = noneOf(e6.getDeclaringClass());
        noneOf.add((BitFieldSet<E>) e6);
        noneOf.add((BitFieldSet<E>) e7);
        return noneOf;
    }

    public static <E extends Enum<E>> long setBitField(long j3, E e6, int i6) {
        return setUnsigned(j3, e6, i6);
    }

    public boolean add(E e6, E e7, E e8, E e9, E e10) {
        return orMask(mask(e6, e7, e8, e9, e10));
    }

    public boolean all(E e6) {
        return all(mask((BitFieldSet<E>) e6));
    }

    public boolean any(E e6, E e7, E e8) {
        return any(mask(e6, e7, e8));
    }

    public long mask(E e6, E e7, E e8, E e9, E e10) {
        return this.bitMasks[e6.ordinal()] | this.bitMasks[e7.ordinal()] | this.bitMasks[e8.ordinal()] | this.bitMasks[e9.ordinal()] | this.bitMasks[e10.ordinal()];
    }

    public boolean none(E e6, E e7, E e8) {
        return none(mask(e6, e7, e8));
    }

    @SafeVarargs
    public final boolean remove(E... eArr) {
        return andNotMask(mask(eArr));
    }

    public static <E extends Enum<E>> int setBitField(int i6, E e6, int i7) {
        return (int) setUnsigned(i6, e6, i7);
    }

    public static <E extends Enum<E>> long setSigned(Class<E> cls, long[] jArr, long j3, E e6, long j4) {
        long j5 = jArr[e6.ordinal()];
        int bitCount = Long.bitCount(j5);
        long j6 = 1 << (bitCount - 1);
        if (bitCount < 64) {
            long j7 = -j6;
            if (j4 < j7 || j4 > j6 - 1) {
                throw new IllegalArgumentException(String.format("Enum field %s.%s is %d bit%s, value range is [%d, %d], cannot be set to %d", cls.getSimpleName(), e6.name(), Integer.valueOf(bitCount), bitCount > 1 ? "s" : FlexmarkHtmlConverter.DEFAULT_NODE, Long.valueOf(j7), Long.valueOf(j6 - 1), Long.valueOf(j4)));
            }
        }
        return (j5 & ((j4 << Long.numberOfTrailingZeros(j5)) ^ j3)) ^ j3;
    }

    public static <E extends Enum<E>> long setUnsigned(Class<E> cls, long[] jArr, long j3, E e6, long j4) {
        long j5 = jArr[e6.ordinal()];
        int bitCount = Long.bitCount(j5);
        long j6 = 1 << bitCount;
        if (bitCount < 64 && (j4 < 0 || j4 >= j6)) {
            throw new IllegalArgumentException(String.format("Enum field %s.%s is %d bit%s, value range is [0, %d), cannot be set to %d", cls.getSimpleName(), e6.name(), Integer.valueOf(bitCount), bitCount > 1 ? "s" : FlexmarkHtmlConverter.DEFAULT_NODE, Long.valueOf(j6 - 1), Long.valueOf(j4)));
        }
        return (j5 & ((j4 << Long.numberOfTrailingZeros(j5)) ^ j3)) ^ j3;
    }

    @SafeVarargs
    public final boolean add(E... eArr) {
        return orMask(mask(eArr));
    }

    public boolean all(E e6, E e7) {
        return all(mask(e6, e7));
    }

    public boolean any(E e6, E e7, E e8, E e9) {
        return any(mask(e6, e7, e8, e9));
    }

    @SafeVarargs
    public final long mask(E... eArr) {
        long j3 = 0;
        for (E e6 : eArr) {
            j3 |= this.bitMasks[e6.ordinal()];
        }
        return j3;
    }

    public boolean none(E e6, E e7, E e8, E e9) {
        return none(mask(e6, e7, e8, e9));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (obj == null) {
            return false;
        }
        Class<?> cls = obj.getClass();
        if (cls != this.elementType && cls.getSuperclass() != this.elementType) {
            return false;
        }
        long j3 = this.elements;
        long j4 = (~this.bitMasks[((Enum) obj).ordinal()]) & j3;
        this.elements = j4;
        return j4 != j3;
    }

    public static <E extends Enum<E>> short setBitField(short s5, E e6, short s6) {
        return (short) setUnsigned(s5, e6, s6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e6) {
        typeCheck(e6);
        long j3 = this.elements;
        long j4 = j3 | this.bitMasks[e6.ordinal()];
        this.elements = j4;
        return j4 != j3;
    }

    public boolean all(E e6, E e7, E e8) {
        return all(mask(e6, e7, e8));
    }

    public boolean any(E e6, E e7, E e8, E e9, E e10) {
        return any(mask(e6, e7, e8, e9, e10));
    }

    public boolean none(E e6, E e7, E e8, E e9, E e10) {
        return none(mask(e6, e7, e8, e9, e10));
    }

    public static <E extends Enum<E>> BitFieldSet<E> of(E e6, E e7, E e8) {
        BitFieldSet<E> noneOf = noneOf(e6.getDeclaringClass());
        noneOf.add((BitFieldSet<E>) e6);
        noneOf.add((BitFieldSet<E>) e7);
        noneOf.add((BitFieldSet<E>) e8);
        return noneOf;
    }

    public static <E extends Enum<E>> byte setBitField(byte b5, E e6, byte b6) {
        return (byte) setUnsigned(b5, e6, b6);
    }

    public boolean all(E e6, E e7, E e8, E e9) {
        return all(mask(e6, e7, e8, e9));
    }

    @SafeVarargs
    public final boolean any(E... eArr) {
        return any(mask(eArr));
    }

    @SafeVarargs
    public final boolean none(E... eArr) {
        return none(mask(eArr));
    }

    public boolean all(E e6, E e7, E e8, E e9, E e10) {
        return all(mask(e6, e7, e8, e9, e10));
    }

    @SafeVarargs
    public final boolean all(E... eArr) {
        return all(mask(eArr));
    }

    public static <E extends Enum<E>> BitFieldSet<E> of(E e6, E e7, E e8, E e9) {
        BitFieldSet<E> noneOf = noneOf(e6.getDeclaringClass());
        noneOf.add((BitFieldSet<E>) e6);
        noneOf.add((BitFieldSet<E>) e7);
        noneOf.add((BitFieldSet<E>) e8);
        noneOf.add((BitFieldSet<E>) e9);
        return noneOf;
    }

    public static <E extends Enum<E>> BitFieldSet<E> of(E e6, E e7, E e8, E e9, E e10) {
        BitFieldSet<E> noneOf = noneOf(e6.getDeclaringClass());
        noneOf.add((BitFieldSet<E>) e6);
        noneOf.add((BitFieldSet<E>) e7);
        noneOf.add((BitFieldSet<E>) e8);
        noneOf.add((BitFieldSet<E>) e9);
        noneOf.add((BitFieldSet<E>) e10);
        return noneOf;
    }

    @SafeVarargs
    public static <E extends Enum<E>> BitFieldSet<E> of(E e6, E... eArr) {
        BitFieldSet<E> noneOf = noneOf(e6.getDeclaringClass());
        noneOf.add((BitFieldSet<E>) e6);
        for (E e7 : eArr) {
            noneOf.add((BitFieldSet<E>) e7);
        }
        return noneOf;
    }

    public static <E extends Enum<E>> BitFieldSet<E> of(Class<E> cls, E[] eArr) {
        BitFieldSet<E> noneOf = noneOf(cls);
        for (E e6 : eArr) {
            noneOf.add((BitFieldSet<E>) e6);
        }
        return noneOf;
    }
}
