public class Linear {
    public static void LinearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index " + i);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 7, 2, 6 };
        LinearSearch(arr, 5);
    }
}
