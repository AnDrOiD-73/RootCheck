package ru.columbiec.rootcheck.util;

import java.io.File;

public class RootCheck {

    /**
     * @return true if the device is rooted
     */
    public static boolean isRooted() {
        if (android.os.Build.TAGS.contains("test-keys")) {
            return true;
        }

        String[] places = {"/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/system/app/Superuser.apk"};
        for (String place : places) {
            if (new File(place).exists()) {
                return true;
            }
        }

        return false;
    }
}
