package org.vinsert.dakota628;

import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

public class vInsertDynamicUpdater {

    /**
     * @param args
     */
    public static void main(String[] args) throws Exception {
        URL[] urls = {new URL("https://dl-web.dropbox.com/spa/pecs7ozn4736lt0/vinsertupdater/public/classes.jar")};
        URLClassLoader cl = new URLClassLoader(urls);
        Class<?> c = cl.loadClass("org.vinsert.dakota628.vInsertUpdater");
        Method m = c.getMethod("main", String[].class);
        m.invoke(null, (Object) args);
        cl.close();
    }

}