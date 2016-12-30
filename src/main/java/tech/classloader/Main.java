package tech.classloader;

class Main {

    public static int isOK(int num) {
        int filterList[] = { 2, 3, 5 };
        if (num <= 0) {
            return 0;
        }
        for (int filter : filterList) {
            while (num % filter == 0) {
                num = num / filter;
            }
        }
        return num == 1 ? 1 : 0;
    }
}