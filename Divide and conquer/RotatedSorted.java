public class RotatedSorted {
    public static int searchRotated(int arr[], int target, int si, int ei) {
        if(si>ei){
            return -1;
        }
        int mid = si + (ei - si) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        // mid on line one
        if (arr[si] <= arr[mid]) {
            // case a left
            if (arr[si] <= target && target <= arr[mid]) {
                return searchRotated(arr, target, si, mid - 1);
            }
            // case b right
            else {
                return searchRotated(arr, target, mid + 1, ei);
            }

        }
        // mid on line two
        else {
            // case c right
            if (arr[mid] <= target && target <= arr[ei]) {
                return searchRotated(arr, target, si, mid - 1);
            }
            // case d left
            else {
                return searchRotated(arr, target, mid + 1, ei);

            }

        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        int tarIdx = searchRotated(arr, target, 0, arr.length);
        System.out.println(tarIdx);
    }

}
