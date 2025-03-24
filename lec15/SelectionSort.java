public class SelectionSort {

    public static void printArr(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void selectionSort(int[] arr)  throws Exception {
        for (int i=0; i<arr.length; i++) {
            System.out.println("iter: " + i);
            printArr(arr);
            //find the min element in the unsorted portion
            int min = Integer.MAX_VALUE;
            int minIndex = -1;
            for (int j=i; j<arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            if( minIndex < 0 ) throw new Exception();
            //swap min with the first element in unsorted
            swap(arr, i, minIndex);
        }
    }

    public static void main(String[] args) throws Exception {
        int[] arr = {64, 25, 12, 22, 11};
        selectionSort(arr);
        printArr(arr);
    }

}
