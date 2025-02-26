public class BinarySearch {
    //returns the index of the target (if it exists in data)
    private static int binarySearch(int[] data, int target, int low, int high) {
        if (low > high) {
            return -1;
        }

        //1. calculate mid value
        int mid = (low + high) / 2; //index

        //2. handle 3 cases: equal to, lesser than, greater than
        int midValue = data[mid];

        if (midValue == target) {
            return mid;
        } else if (midValue < target) { //search to the right
            return binarySearch(data, target, mid+1, high);
        } else { // midValue > target -> search to the left
            return binarySearch(data, target, low,  mid-1);
        }
        //3. did we handle the case where target isn't in data?
    }

    public static int binarySearch(int[] data, int target) {
        return binarySearch(data, target, 0, data.length);
    }
}
