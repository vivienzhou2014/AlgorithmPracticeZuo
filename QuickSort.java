package Sort;

public class QuickSort {
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
        sort(arr, 0, arr.length-1);
    }

    private static void sort(int[] arr, int l, int r) {
        if(l<r){
        swap(arr, l + (int) Math.random() * (r - l + 1), r);
        int p[] = partition(arr, l , r);
        sort(arr, l, p[0]-1);
        sort(arr, p[1]+1, r);
        }
    }

    private static int[] partition(int[] arr, int l, int r) {
        int p1 = l -1;
        int p2 = r;
        while(l < p2){
            if(arr[l] < arr[r]){
                swap(arr, l, ++p1);
                l++;
            }else if(arr[l] > arr[r]){
                swap(arr, l, --p2);
            }else {
                l++;
            }
        }
        swap(arr, r, p2);
        return new int[] {p1 + 1, p2};
    }

    public static void swap(int[] array, int a, int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
