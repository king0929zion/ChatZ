package com.tencent.mmkv;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import java.lang.reflect.Method;
import java.util.List;

/* loaded from: classes.dex */
class MMKVProcessUtil {
    private static String currentProcessName = "";

    public static String getCurrentProcessName(Context context) {
        if (!TextUtils.isEmpty(currentProcessName)) {
            return currentProcessName;
        }
        String currentProcessNameByApplication = getCurrentProcessNameByApplication();
        currentProcessName = currentProcessNameByApplication;
        if (!TextUtils.isEmpty(currentProcessNameByApplication)) {
            return currentProcessName;
        }
        String currentProcessNameByActivityThread = getCurrentProcessNameByActivityThread();
        currentProcessName = currentProcessNameByActivityThread;
        if (!TextUtils.isEmpty(currentProcessNameByActivityThread)) {
            return currentProcessName;
        }
        String currentProcessNameByActivityManager = getCurrentProcessNameByActivityManager(context);
        currentProcessName = currentProcessNameByActivityManager;
        return currentProcessNameByActivityManager;
    }

    private static String getCurrentProcessNameByActivityManager(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        int myPid = Process.myPid();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return FlexmarkHtmlConverter.DEFAULT_NODE;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == myPid) {
                return runningAppProcessInfo.processName;
            }
        }
        return FlexmarkHtmlConverter.DEFAULT_NODE;
    }

    private static String getCurrentProcessNameByActivityThread() {
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentProcessName", null);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, null);
            return invoke instanceof String ? (String) invoke : FlexmarkHtmlConverter.DEFAULT_NODE;
        } catch (Throwable th) {
            th.printStackTrace();
            return FlexmarkHtmlConverter.DEFAULT_NODE;
        }
    }

    private static String getCurrentProcessNameByApplication() {
        String processName;
        if (Build.VERSION.SDK_INT < 28) {
            return FlexmarkHtmlConverter.DEFAULT_NODE;
        }
        processName = Application.getProcessName();
        return processName;
    }
}
