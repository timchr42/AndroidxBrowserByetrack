package androidx.browser.byetrack;

import android.content.Context;
import android.os.Bundle;

import org.jspecify.annotations.NonNull;

import de.cispa.byetrack.ByetrackClient;

public final class Client {

    public static Bundle getTokenCookieNames(@NonNull Context context, @NonNull String host) {
        return ByetrackClient.getTokenCookieNames(context, host);
    }

    public static String getTokenCookieValue(@NonNull Context context, @NonNull String tokenStr) {
        return ByetrackClient.getTokenCookieValue(context, tokenStr);
    }

    public static void writeTokenCookieValue(@NonNull Context context, @NonNull String tokenStr, @NonNull String value) {
        ByetrackClient.writeTokenCookieValue(context, tokenStr, value);
    }
}
