package com.sagar.securestore;

public class KeyHandler {
    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    private String youtubeKey, firebaseKey, fabricKey;

    public KeyHandler() {
        youtubeKey = youtubeKey();
        firebaseKey = firebaseKey();
        fabricKey = fabricKey();
    }

    public String getYoutubeKey() {
        return youtubeKey;
    }

    public String getFirebaseKey() {
        return firebaseKey;
    }

    public String getFabricKey() {
        return fabricKey;
    }

//Native calls from C++ to Java
    public native String fabricKey();

    public native String youtubeKey();

    public native String firebaseKey();
}
