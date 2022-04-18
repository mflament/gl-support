package org.yah.games.glsupport.tools;

import java.util.List;
import java.util.Objects;

class GLClasses {
    final List<Class<?>> glClasses;
    final Class<?> glesClass;

    public GLClasses(List<Class<?>> glClasses, Class<?> glesClass) {
        this.glClasses = Objects.requireNonNull(glClasses, "glClasses is null");
        this.glesClass = Objects.requireNonNull(glesClass, "glesClass is null");
    }
}
