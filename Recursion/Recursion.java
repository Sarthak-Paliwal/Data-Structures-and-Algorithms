public class Recursion {
    // Numbers in decreasing order
    public static void decreasingNum(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        decreasingNum(n - 1);
    }

    public static void increasingNum(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }
        increasingNum(n - 1);
        System.out.println(n);

    }

    public static int printFact(int n) {
        if (n == 1) {
            return 1;

        }
        int fact = n * printFact(n - 1);
        return fact;
    }

    public static int printSum(int n) {
        if (n == 1) {
            return 1;

        }
        int sum = n + printSum(n - 1);
        return sum;
    }

    public static int printFibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fnm1 = printFibonacci(n - 1);
        int fnm2 = printFibonacci(n - 2);
        int fn = fnm1 + fnm2;
        return fn;

    }

    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            System.out.println("Element not found");
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    public static int firstOccur(int arr[], int x, int i) {
        if (i == arr.length) {
            System.out.println("Element not found");
            return -1;
        }
        if (arr[i] == x) {
            return i;
        }
        return firstOccur(arr, x, i + 1);

    }

    public static int lastOccur(int arr[], int x, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccur(arr, x, i + 1);
        if (isFound != -1) {
            return isFound;
        }
        if (arr[i] == x) {
            return i;
        }
        return isFound;
    }

    public static int powerOfx(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * powerOfx(x, n - 1);
    }

    public static int Optimizepower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n % 2 != 0) {
            return Optimizepower(x, n / 2) * Optimizepower(x, n / 2) * x;
        }

        return Optimizepower(x, n / 2) * Optimizepower(x, n / 2);
    }

    public static int placeTile(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        // If 1 vertical tile is placed than we need to place the tile for length of n-1
        int vertical = placeTile(n - 1);
        // If 1 horizontal tile is placed than there must be another tile which will be
        // placed horizontal then we need to
        // find the ways to find tile in n-2 length
        int horizontal = placeTile(n - 2);
        // the total of horizonal ways and vertical length is our required answer
        return vertical + horizontal;
    }

    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            removeDuplicates(str, idx + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newStr.append(currChar), map);
        }
    }

    public static int pairFriends(int n) {
        // Base case
        if (n == 1 || n == 2) {
            return n;
        }
        // Two choice either to remain single or pair up
        int single = pairFriends(n - 1);// if single then we need to think about remaining n-1 people
        int pair = n - 1 * pairFriends(n - 2);// if pairs then we need to think about remaining n-1 people
        int totalWays = single + pair;
        return totalWays;
    }

    public static void binaryString(int n, int lastPlace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        binaryString(n - 1, 0, str + "0");
        if (lastPlace == 0) {
            binaryString(n - 1, 1, str + "1");
        }

    }

    public static void main(String[] args) {
        // decreasingNum(7);
        // increasingNum(8);
        // System.out.println(printFact(4));
        // System.out.println(printSum(3));
        System.err.println(printFibonacci(8));
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        // System.out.println(isSorted(arr, 0));
        // System.out.println(firstOccur(arr, 8, 0));
        // System.out.println(powerOfx(5, 3));
        // ;
        // System.out.println(Optimizepower(4, 3));
        // System.out.println(placeTile(5));
        // String str = "Saarrthhaak";
        // removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
        // System.out.println(pairFriends(3));
        // binaryString(3, 0, "");
    }

}
