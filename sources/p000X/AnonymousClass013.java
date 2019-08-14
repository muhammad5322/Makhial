package p000X;

import android.util.Log;
import com.facebook.stacktracer.LeanStackTracer;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.List;

/* renamed from: X.013 reason: invalid class name */
public final class AnonymousClass013 implements UncaughtExceptionHandler {

    /* renamed from: B */
    private final UncaughtExceptionHandler f159B = Thread.getDefaultUncaughtExceptionHandler();

    public final void uncaughtException(Thread thread, Throwable th) {
        if (!(th instanceof AnonymousClass01Q)) {
            List list = null;
            try {
                Object rawStackTrace = LeanStackTracer.getRawStackTrace(th);
                if (rawStackTrace != null) {
                    list = LeanStackTracer.parseRawStackTrace(th, rawStackTrace);
                }
            } catch (Throwable th2) {
                Log.w("EarlyErrorReporting", "Exception thrown during raw stack trace handling", th2);
            }
            if (list != null) {
                th = new AnonymousClass01Q(th, list);
            }
        }
        this.f159B.uncaughtException(thread, th);
    }
}
