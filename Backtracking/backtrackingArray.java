public class backtrackingArray {

    // Function to change array elements recursively
    public static void changeArr(int arr[], int i, int val) {
        // Base case
        if (i == arr.length) {
            printArr(arr);
            return;
        }

        // Recursive step
        arr[i] = val;
        changeArr(arr, i + 1, val + 1);

        // Backtracking step
        arr[i] = arr[i] - 2;
    }

    // Function to print the array
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        int arr[] = new int[5];
        changeArr(arr, 0, 1);
        printArr(arr);
    }
}
// time complexity: o(n)
// space complexity: o(n)
