package tech;

/**
 * Created by tangjie on 16/9/25.
 */
public  class DD {
    static void MinHeapFixdown(int a[], int i, int n)
    {
        int j, temp;

        temp = a[i];
        j = 2 * i + 1;
        while (j < n)
        {
            if (j + 1 < n && a[j + 1] < a[j]) //在左右孩子中找最小的
                j++;

            if (a[j] >= temp)
                break;

            a[i] = a[j];     //把较小的子结点往上移动,替换它的父结点
            i = j;
            j = 2 * i + 1;
        }
        a[i] = temp;
    }


    static void MakeMinHeap(int a[], int n)
    {
        for (int i = n / 2 - 1; i >= 0; i--)
            MinHeapFixdown(a, i, n);
    }

    public static void main(String[] args) {
      int arr[]={20,18,22,16,30,19};
        MakeMinHeap(arr,6);
        for(int i=0;i<6;i++){
            System.out.print(arr[i]+",");
        }
    }
}
