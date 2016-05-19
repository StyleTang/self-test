package tech.classloader;


import tech.classloader.loder.FileSystemClassLoader;

import java.lang.reflect.Method;

/**
 * Created by tangjie on 16/5/18.
 */
public class Loder {

     static class Sample {
        private Sample instance;

        public void setSample(Object instance) {
            this.instance = (Sample) instance;
        }
    }

    public static void testClassIdentity() {
        String classDataRootPath = "C:\\workspace\\Classloader\\classData";
        FileSystemClassLoader fscl1 = new FileSystemClassLoader(classDataRootPath);
        FileSystemClassLoader fscl2 = new FileSystemClassLoader(classDataRootPath);
        String className = "com.example.Sample";
        try {
            Class<?> class1 = fscl1.loadClass(className);
            Object obj1 = class1.newInstance();
            Class<?> class2 = fscl2.loadClass(className);
            Object obj2 = class2.newInstance();
            Method setSampleMethod = class1.getMethod("setSample", java.lang.Object.class);
            setSampleMethod.invoke(obj1, obj2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        testClassIdentity();
    }
}
