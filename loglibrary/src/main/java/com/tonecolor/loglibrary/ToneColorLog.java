package com.tonecolor.loglibrary;

import android.content.Context;
import android.util.Log;

/**
 * Created by clius on 2017-07-26.
 */

public class ToneColorLog {

    private static final String TAG = ToneColorLog.class.getSimpleName();

    private Context context;

    public ToneColorLog(Context context) {
        this.context = context;
    }

    public void allLog(String msg) {
        Log.e(TAG, " : " + msg);
        Log.d(TAG, " : " + msg);
        Log.i(TAG, " : " + msg);
        Log.v(TAG, " : " + msg);
        Log.w(TAG, " : " + msg);
    }
}
