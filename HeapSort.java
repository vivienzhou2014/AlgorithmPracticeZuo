package Sort;

public class HeapSort {
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
/*        for (int i = 0; i < arr.length; i++) {
            heapInsert(arr, i);
        }*/
        for (int i = arr.length - 1; i >= 0 ; i--) {
            heapify(arr, i ,arr.length);
        }
        int size = arr.length;
        swap(arr,0, --size);
        while(size > 0){
            heapify(arr, 0, size);
            size--;
            swap(arr, 0, size);
        }
    }

    private static void heapify(int[] arr, int i, int length) {
        int left = i * 2 + 1;
        while(left < length){
            int max = arr[left +1] > arr[left] && left + 1 < length ? left+1 :left;
            max = arr[max] > arr[i] ? max : i;
            if(i == max){
                break;
            }
            swap(arr, max, i);
            i = max;
            left = i * 2 + 1;
        }
    }

    private static void heapInsert(int[] arr, int i) {
        while(arr[i] > arr[(i - 1) / 2]){
            swap(arr, i, (i-1)/2);
        }
        i = (i - 1) / 2;
    }


    public static void swap(int[] array, int a, int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
