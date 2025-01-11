public class ArraysBasic {
    public static int BinarySearch(int arr[], int key) {
        int si = 0;
        int ei = arr.length - 1;
        int mid = si + (ei - si) / 2;

        while (si <= ei) {
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] > key) {
                ei = mid - 1;
            } else {
                si = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 8, 54, 3 };
        int value = BinarySearch(arr, 8);
        System.out.println("element found at index " + value);

    }

}
