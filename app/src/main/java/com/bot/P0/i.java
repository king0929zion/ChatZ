package P0;

/* loaded from: classes.dex */
public final class i {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.a == ((i) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i6 = this.a;
        return i6 == 0 ? "Button" : i6 == 1 ? "Checkbox" : i6 == 2 ? "Switch" : i6 == 3 ? "RadioButton" : i6 == 4 ? "Tab" : i6 == 5 ? "Image" : i6 == 6 ? "DropdownList" : i6 == 7 ? "Picker" : i6 == 8 ? "Carousel" : "Unknown";
    }
}
