package Sort;

public class BubbleSort {
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
        for (int e = arr.length-1; e > 0 ; e--) {
            for (int i = 0; i < e; i++) {
                if(arr[i] > arr[i+1]){
                    swap(arr, i, i+1);
                }
            }
        }
    }

    public static void swap(int[] array, int a, int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
