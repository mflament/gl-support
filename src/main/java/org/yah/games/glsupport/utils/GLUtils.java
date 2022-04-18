package org.yah.games.glsupport.utils;

public final class GLUtils {
    private GLUtils() {
    }

    public static int check(int object, String name) {
        if (object == 0) throw new IllegalStateException(name);
        return object;
    }

}
