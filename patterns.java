

public class patterns {
    public static void hollow_rectangle(int totRows, int totCols){
        for(int i=1; i<=totRows; i++){
            for(int j=1; j<=totCols; j++){
                if(i==1 || i==totRows || j==1 || j==totCols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        
    }
public static void inverted_rotated_half_pyramid(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-1; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
 } 
 public static void inverted_half_pyramid_withNumbers(int n){
    for(int i=1; i<=n; i++){
        for(int j=1; j<=n-i+1; j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }
 }  
 public static void zero_on_triangle(int n){
    for(int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
            if((i+j)%2==0){
                System.out.print("1");
            }else{
                System.out.print("0");
            }
        }
        System.out.println();
    }
 } 
 public static void butterfly(int n){
    // 1st half
    for(int i=1; i<=n; i++){
        // stars- i
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        // spaces- 2*(n-i)
        for(int j=1; j<=2*(n-i); j++){
            System.out.print(" ");
        }
        // stars-i
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
    //2nd half
    for(int i=n; i>=1; i--){
         // stars- i
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        // spaces- 2*(n-i)
        for(int j=1; j<=2*(n-i); j++){
            System.out.print(" ");
        }
        // stars-i
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
               
    }
 } 
 public static void diamondPattern(int n){
    //1st half
    for(int i=1; i<=n; i++){
        //spaces
        for(int j=1; j<=n-i; j++){
            System.out.print(" ");
        }
        //stars
        for(int j=1; j<=2*i-1; j++){
            System.out.print("*");
        }
        System.out.println();
    }
    //2nd half
    for(int i=n; i>=1; i--){
        //spaces
        for(int j=1; j<=n-i; j++){
            System.out.print(" ");
        }
        //stars
        for(int j=1; j<=2*i-1; j++){
            System.out.print("*");
        }
        System.out.println();

    }
 }  
    public static void main(String args[]){
        //hollow_rectangle(4, 5);
        // inverted_rotated_half_pyramid(4);
        //inverted_half_pyramid_withNumbers(5);
        //zero_on_triangle(5);
        //butterfly(9);
        diamondPattern(9);
        

    }
    
}
