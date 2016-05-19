package tech.classloader;

/**
 * Created by tangjie on 16/5/18.
 */
public class Tree {

        public static void main(String[] args) {
            ClassLoader loader = Tree.class.getClassLoader();
            while (loader != null) {
                System.out.println(loader.toString());
                loader = loader.getParent();
            }
        }

}
