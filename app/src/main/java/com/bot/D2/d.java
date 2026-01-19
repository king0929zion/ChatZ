package D2;

/* loaded from: classes.dex */
public final class d {
    public static e a(String str) {
        e eVar;
        e[] values = e.values();
        int length = values.length;
        int i6 = 0;
        while (true) {
            if (i6 >= length) {
                eVar = null;
                break;
            }
            eVar = values[i6];
            if (eVar.f1281c.equals(str)) {
                break;
            }
            i6++;
        }
        return eVar == null ? e.BING : eVar;
    }
}
