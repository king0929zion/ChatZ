package com.vladsch.flexmark.util.format;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class RomanNumeral {
    private final int num;
    private static final int[] numbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] letters = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    public static final Pattern ROMAN_NUMERAL = Pattern.compile("M{0,3}(?:CM|DC{0,3}|CD|C{1,3})?(?:XC|LX{0,3}|XL|X{1,3})?(?:IX|VI{0,3}|IV|I{1,3})?");
    public static final Pattern LOWERCASE_ROMAN_NUMERAL = Pattern.compile("m{0,3}(?:cm|dc{0,3}|cd|c{1,3})?(?:xc|lx{0,3}|xl|x{1,3})?(?:ix|vi{0,3}|iv|i{1,3})?");
    public static final Pattern LIMITED_ROMAN_NUMERAL = Pattern.compile("(?:X{1,3})?(?:IX|VI{0,3}|IV|I{1,3})?");
    public static final Pattern LIMITED_LOWERCASE_ROMAN_NUMERAL = Pattern.compile("(?:x{1,3})?(?:ix|vi{0,3}|iv|i{1,3})?");

    public RomanNumeral(int i6) {
        if (i6 < 1) {
            throw new NumberFormatException("Value of RomanNumeral must be positive.");
        }
        if (i6 <= 3999) {
            this.num = i6;
            return;
        }
        throw new NumberFormatException("Value of RomanNumeral must be 3999 or less.");
    }

    private int letterToNumber(char c6) {
        if (c6 == 'C') {
            return 100;
        }
        if (c6 == 'D') {
            return 500;
        }
        if (c6 == 'I') {
            return 1;
        }
        if (c6 == 'V') {
            return 5;
        }
        if (c6 == 'X') {
            return 10;
        }
        if (c6 != 'L') {
            return c6 != 'M' ? -1 : 1000;
        }
        return 50;
    }

    public int toInt() {
        return this.num;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i6 = this.num;
        for (int i7 = 0; i7 < numbers.length; i7++) {
            while (true) {
                int[] iArr = numbers;
                if (i6 >= iArr[i7]) {
                    sb.append(letters[i7]);
                    i6 -= iArr[i7];
                }
            }
        }
        return sb.toString();
    }

    public RomanNumeral(String str) {
        int letterToNumber;
        if (str.length() != 0) {
            String upperCase = str.toUpperCase();
            int i6 = 0;
            int i7 = 0;
            while (i6 < upperCase.length()) {
                char charAt = upperCase.charAt(i6);
                int letterToNumber2 = letterToNumber(charAt);
                if (letterToNumber2 >= 0) {
                    int i8 = i6 + 1;
                    if (i8 != upperCase.length() && (letterToNumber = letterToNumber(upperCase.charAt(i8))) > letterToNumber2) {
                        i6 += 2;
                        i7 = (letterToNumber - letterToNumber2) + i7;
                    } else {
                        i7 += letterToNumber2;
                        i6 = i8;
                    }
                } else {
                    throw new NumberFormatException("Illegal character \"" + charAt + "\" in roman numeral.");
                }
            }
            if (i7 <= 3999) {
                this.num = i7;
                return;
            }
            throw new NumberFormatException("Roman numeral must have value 3999 or less.");
        }
        throw new NumberFormatException("An empty string does not define a Roman numeral.");
    }
}
