public class Recursion{
    // print GCD of two numbers using iteration {GCD means HCF}
    // x =6 , y =24 and out put = 6
    static int iGCD(int x, int y){
        while(x%y != 0){
            int rem = x % y;
            x  = y;
            y = rem;
        }
        return y;
    }
    // print ArrayRecursion ex-{5,7,9,3,4}
    static void printArray(int[] arr , int idx){
        if( idx == arr.length){
            return;
        }
        System.out.print(arr[idx]+" ");
        printArray(arr, idx + 1);
    }
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        // int x = sc.nextInt();
        // int y = sc.nextInt();
        // System.out.println(iGCD(x,y));
        int[] arr = {5,7,9,3,4};
        printArray(arr, 0);

    }
}
