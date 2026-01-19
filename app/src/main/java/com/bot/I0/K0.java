package I0;

import android.view.MotionEvent;
import com.vladsch.flexmark.util.format.TableCell;

/* loaded from: classes.dex */
public final class K0 {
    public static final K0 a = new Object();

    public final boolean a(MotionEvent motionEvent, int i6) {
        float rawX;
        float rawY;
        rawX = motionEvent.getRawX(i6);
        if ((Float.floatToRawIntBits(rawX) & TableCell.NOT_TRACKED) >= 2139095040) {
            return false;
        }
        rawY = motionEvent.getRawY(i6);
        return (Float.floatToRawIntBits(rawY) & TableCell.NOT_TRACKED) < 2139095040;
    }
}
