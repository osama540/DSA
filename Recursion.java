public class Recursion {
    //print n to 1   
    public static void printDec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    //print 1 to n
    public static void printInc(int n){
        if(n == 1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }
    // print factorial of a number N
    public static int fact(int n){
        if(n == 0){
            return 1;

        }
        int fnm1 = fact(n-1);
        int fn = n*fact(n-1);
        return fn;
    }
    // print Nth fibonacci number 
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fn = fnm1 + fnm2;
        return fn;
        
    }
    //check if a give array is sorted or not
    public static boolean isSorted(int arr[], int i){
        if(i == arr.length-1){
            return true;

        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    //public static 
    public static void main(String args[]){
        int arr []= {1,2,3,4,5,6};
        System.out.println(isSorted(arr, 0));
    }
}
