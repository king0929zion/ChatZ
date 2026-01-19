package y1;

import H0.C0158m;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import androidx.lifecycle.N;
import com.vladsch.flexmark.util.format.TableCell;
import i4.AbstractC1120d;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import k.C1160g;
import z1.C2017b;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f15973j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static volatile j f15974k;
    public final ReentrantReadWriteLock a;

    /* renamed from: b, reason: collision with root package name */
    public final C1160g f15975b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f15976c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f15977d;

    /* renamed from: e, reason: collision with root package name */
    public final f f15978e;

    /* renamed from: f, reason: collision with root package name */
    public final i f15979f;

    /* renamed from: g, reason: collision with root package name */
    public final N f15980g;

    /* renamed from: h, reason: collision with root package name */
    public final int f15981h;

    /* renamed from: i, reason: collision with root package name */
    public final C1990d f15982i;

    public j(s sVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.f15976c = 3;
        i iVar = (i) sVar.f3795b;
        this.f15979f = iVar;
        int i6 = sVar.a;
        this.f15981h = i6;
        this.f15982i = (C1990d) sVar.f3796c;
        this.f15977d = new Handler(Looper.getMainLooper());
        this.f15975b = new C1160g(0);
        this.f15980g = new N(25);
        f fVar = new f(this);
        this.f15978e = fVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i6 == 0) {
            try {
                this.f15976c = 0;
            } catch (Throwable th) {
                this.a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (c() == 0) {
            try {
                iVar.a(new e(fVar));
            } catch (Throwable th2) {
                f(th2);
            }
        }
    }

    public static j a() {
        j jVar;
        synchronized (f15973j) {
            try {
                jVar = f15974k;
                if (!(jVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return jVar;
    }

    public static boolean d() {
        return f15974k != null;
    }

    public final int b(int i6, CharSequence charSequence) {
        if (!(c() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        AbstractC1120d.f(charSequence, "charSequence cannot be null");
        C0158m c0158m = this.f15978e.f15969b;
        c0158m.getClass();
        if (i6 < 0 || i6 >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            v[] vVarArr = (v[]) spanned.getSpans(i6, i6 + 1, v.class);
            if (vVarArr.length > 0) {
                return spanned.getSpanStart(vVarArr[0]);
            }
        }
        return ((p) c0158m.n(charSequence, Math.max(0, i6 - 16), Math.min(charSequence.length(), i6 + 16), TableCell.NOT_TRACKED, true, new p(i6))).f15987e;
    }

    public final int c() {
        this.a.readLock().lock();
        try {
            return this.f15976c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final void e() {
        if (!(this.f15981h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (c() == 1) {
            return;
        }
        this.a.writeLock().lock();
        try {
            if (this.f15976c == 0) {
                return;
            }
            this.f15976c = 0;
            this.a.writeLock().unlock();
            f fVar = this.f15978e;
            j jVar = fVar.a;
            try {
                jVar.f15979f.a(new e(fVar));
            } catch (Throwable th) {
                jVar.f(th);
            }
        } finally {
            this.a.writeLock().unlock();
        }
    }

    public final void f(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.f15976c = 2;
            arrayList.addAll(this.f15975b);
            this.f15975b.clear();
            this.a.writeLock().unlock();
            this.f15977d.post(new h(arrayList, this.f15976c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    public final void g(EditorInfo editorInfo) {
        if (c() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        f fVar = this.f15978e;
        fVar.getClass();
        Bundle bundle = editorInfo.extras;
        C2017b c2017b = (C2017b) fVar.f15970c.f391c;
        int a = c2017b.a(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", a != 0 ? ((ByteBuffer) c2017b.f10524g).getInt(a + c2017b.f10521c) : 0);
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
