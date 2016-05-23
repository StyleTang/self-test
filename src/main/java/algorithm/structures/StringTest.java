package algorithm.structures;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tangjie on 16/5/22.
 */
public class StringTest {

    /**
     * @param args
     */

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub

        String aa = new String(new char[100000]);
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < 10000000; i++) {
            //虽然截取的字符串占据空间很小，但是由于aa巨大的数组空间被共享，没有释放，所以内存溢出
//                      list.add(aa.substring(two, 3));
//            System.out.println(i  );
            list.add(aa.substring(2, 3));//加一层构造方法后，构造方法内部进行了数组的拷贝，原有的巨大数组空间被回收，不会内存溢出
        }
    }

}
