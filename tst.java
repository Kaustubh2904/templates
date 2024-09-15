import java.util.*;

public class tst {
    public static void main(String[] args) {
        int[]arr = {9,11,46, 2,52,3};
        int n = arr.length;
        //selection_sort(arr, n);
        //bubbleSort(arr, n);
        insertionSort(arr, n);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        //System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    static void  selection_sort(int []arr, int n){
        for(int i = 0; i < n-1; i++){
            int min = i;
            for(int j = i+1; j < n; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    static void bubbleSort(int []arr , int n ){
        for(int i = n-1; i>=0; i--){
            for(int j=0; j<= i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    static void insertionSort(int []arr, int n){
        for(int i= 0; i<=n-1; i++){
            int j = i;
            while(j>0 && arr[j-1] > arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
}
