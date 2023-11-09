public class BinarySearch {
    public static void main(String[] args) {
        int[]arr={1,2,5,7,23,26};
        System.out.println(binarySearch(arr,26));
    }
    private static int binarySearch(int[] arr,int target){
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if(arr[mid] == target) return mid;

            if (arr[mid] < target)
                low = mid + 1;

            else
                high = mid - 1;

        }
        return -1;
    }
}
