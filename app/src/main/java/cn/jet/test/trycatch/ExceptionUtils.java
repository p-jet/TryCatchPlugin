package cn.jet.test.trycatch;

import android.util.Log;

public class ExceptionUtils {
    public static void uploadCatchedException(Exception exception) {
        if (exception == null) {
            return;
        }
        //demo里没有接入异常上报平台，仅仅打了log来测试是否捕获成功
        Log.w("ExceptionUtilsTAG", "uploadCatchedException", exception);
    }
}
