package yenquybeauty.ezspa;

import android.app.Application;
import android.content.Context;

import yenquybeauty.ezspa.incoming.Foreground;

public class APP extends Application {

    private static Context context;

    public void onCreate() {
        super.onCreate();
        APP.context = getApplicationContext();
        Foreground.Companion.inject(this);
    }

    public static Context getAppContext() {
        return APP.context;
    }
}
