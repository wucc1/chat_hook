package android.support.v4.net;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v4.view.MotionEventCompat;

class ConnectivityManagerCompatHoneycombMR2 {
    ConnectivityManagerCompatHoneycombMR2() {
    }

    public static boolean isActiveNetworkMetered(ConnectivityManager cm) {
        NetworkInfo info = cm.getActiveNetworkInfo();
        if (info == null) {
            return true;
        }
        switch (info.getType()) {
            case 1:
            case MotionEventCompat.ACTION_HOVER_MOVE /*7*/:
            case MotionEventCompat.ACTION_HOVER_ENTER /*9*/:
                return false;
            default:
                return true;
        }
    }
}
