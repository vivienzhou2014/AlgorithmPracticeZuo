package Sort;

public class MergeSort {
    public static void main(String[] args) {
        int[] ar = {12,34,234,654,234,11,2,0,5};
        sort(ar);
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }
    public static void sort(int[] arr){
        if(arr == null || arr.length < 2){
            return;
        }
        /*int l = 0;
        int r = arr.length - 1;
        sort(arr, l, r);*/
        sort(arr, 0, arr.length - 1);
    }

    public static void sort(int[] arr, int l, int r){
        if(l == r){
            return;
        }
        int m = (l + r) / 2;
        //int m = l + ((r - l) >> 1);
        sort(arr, l, m);
        sort(arr, m+1, r);
        merge(arr, l, m, r);
    }

    private static void merge(int[] arr, int l, int m, int r) {
        int help[] = new int[r - l + 1];
        int p1 = l;
        int p2 = m + 1;
        int i = 0;
        while(p1 <= m && p2 <= r){
            help[i++] = arr[p1] <= arr[p2] ? arr[p1++] : arr[p2++];
        }
        while(p1 <= m ){
            help[i++] = arr[p1++];
        }
        while(p2 <= r){
            help[i++] = arr[p2++];
        }
        for (int j = 0; j < help.length; j++) {
            arr[l +j] = help[j];
        }

    }
}
