package tech.classloader;

/**
 * Created by tangjie on 16/9/25.
 */
public class repeat {
    /**
     * 找到最多含有n个不同字符的子串的最长长度
     *
     * @param s 字符串
     * @param n 不同字符数
     * @return 整型
     */
    public static int lengthOfLongestSubstring(String s, int n)  {
        // 请在此添加代码
        char[] sc = s.toCharArray();
        int max=0;

        for (int i = 0; i < sc.length; i++) {
            int num=0;
            int now=0;
            int j=i;
            while(j<sc.length-1&&now<=n){
                int m =j;
                for(; i <m&&m<sc.length; m++){
                    if(sc[m+1]!=sc[i]){
                        now++;
                        continue;
                    }
                }
                j++;
                num++;
            }
            if(num>max)max=num;
        }

        return max;


    }

    // 若有需要，请在此添加辅助变量、方法


    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("ababacdsfsdf",3));;
    }
}
