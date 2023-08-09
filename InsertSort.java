package Sort;

public class InsertSort {
    public static void main(String[] args) {
        int[] ar = {12,34,234,654,234,11,2,0,5};
        sort(ar);
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }
    public static void sort(int[] arr){
        if(arr == null || arr.length <2){
            return;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
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
