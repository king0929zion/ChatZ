package r0;

import android.view.RenderNode;

/* loaded from: classes.dex */
public abstract class k {
    public static int a(RenderNode renderNode) {
        return renderNode.getAmbientShadowColor();
    }

    public static int b(RenderNode renderNode) {
        return renderNode.getSpotShadowColor();
    }

    public static void c(RenderNode renderNode, int i6) {
        renderNode.setAmbientShadowColor(i6);
    }

    public static void d(RenderNode renderNode, int i6) {
        renderNode.setSpotShadowColor(i6);
    }
}
