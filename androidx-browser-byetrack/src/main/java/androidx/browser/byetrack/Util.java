package androidx.browser.byetrack;

import android.content.Context;
import android.content.SharedPreferences;

import de.cispa.byetrack.DebugHelp;

public final class Util {

    public static String displayFinalTokens(Context context) {
        return DebugHelp.displayFinalTokens(context);
    }


    public static String displayWildcardTokens(Context context) {
        return DebugHelp.displayWildcardTokens(context);
    }

    public static void clearTokenStorage(SharedPreferences prefs) {
        DebugHelp.clearTokenStorage(prefs);
    }

}
