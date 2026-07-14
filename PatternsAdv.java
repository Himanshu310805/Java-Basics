import java.util.*;


public class PatternsAdv {
   public static void main(String args[]) {
       //int n = 5;

    //Butterfly Pattern
    //    //upper part
    //    for(int i=1; i<=n; i++) {
    //        for(int j=1; j<=i; j++) {
    //            System.out.print("*");
    //        }


    //        int spaces = 2 * (n-i);
    //        for(int j=1; j<=spaces; j++) {
    //            System.out.print(" ");
    //        }


    //        for(int j=1; j<=i; j++) {
    //            System.out.print("*");
    //        }
    //        System.out.println();
    //    }


    //    //lower part
    //    for(int i=n; i>=1; i--) {
    //        for(int j=1; j<=i; j++) {
    //            System.out.print("*");
    //        }


    //        int spaces = 2 * (n-i);
    //        for(int j=1; j<=spaces; j++) {
    //            System.out.print(" ");
    //        }


    //        for(int j=1; j<=i; j++) {
    //            System.out.print("*");
    //        }
    //        System.out.println();
    //    }
    // Solid Rhombus
    // for(int i=1;i<=n;i++)
    // {
    //     //spaces
    //     for(int j =1;j<=n-i;j++)
    //     {
    //         System.out.print(" ");

    //     }
    //     //stars
    //     for(int j =1;j<=n;j++)
    //     {
    //         System.out.print("*");  
    //     }
    //     System.out.println();
    // }
    //Number Pyramid
    // for(int i =1;i<=n;i++)
    // {
    //     //spaces
    //     for(int j =1;j<=n-i;j++)
    //     {
    //         System.out.print(" ");

    //     }
    //     //nos
    //     for(int j =1;j<=i;j++)
    //     {
    //         System.out.print(i+" ");

    //     }
    //     System.out.println();
    // }
    //Palindromic Pattern
    

    //    for(int i=1; i<=n; i++) {
    //        //spaces
    //        for(int j=1; j<=n-i; j++) {
    //            System.out.print(" ");
    //        }


    //        //first part
    //        for(int j=i; j>=1; j--) {
    //            System.out.print(j);
    //        }


    //        //second part
    //        for(int j=2; j<=i; j++) {
    //            System.out.print(j);
    //        }
    //        System.out.println();
    //    }
    
     //Diamond Pattern
         int n =4;
         //upper half
         for(int i =1;i<=n;i++)
         {
            //spaces
            for(int j =1;j<=n-i;j++)
            {
                System.out.print(" ");

            }
            //stars
            for(int j =1;j<=(2*i)-1;j++)
            {
                System.out.print("*");
                
            }
            System.out.println();
         }
          //lower half
         for(int i =n;i>=1;i--)
         {
            //spaces
            for(int j =1;j<=n-i;j++)
            {
                System.out.print(" ");

            }
            //stars
            for(int j =1;j<=(2*i)-1;j++)
            {
                System.out.print("*");
                
            }
            System.out.println();
         }
   }   
}
