import java.util.*;

public class Patterns {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows : ");
         int n = sc.nextInt();  //n is for rows
        System.out.println("Enter the no of columns : ");
         int m = sc.nextInt();  //m is for columns
        //Solid Rectangle
        // for(int i =1;i<=n;i++)
        // {
        //     for(int j =1;j<=m;j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        
        //Hollow Rectangle
        // for(int i =1;i<=n;i++)
        // {
        //     for(int j = 1;j<=m;j++)
        //     {
        //         if(i==1 || j==1 || i==n || j==m)
        //         {
        //             System.out.print("* ");

        //         }
        //         else
        //         {
        //             System.out.print("  ");

        //         }


        //     }
        //     System.out.println();
        // }
        //Half Pyramid
        // for(int i = 1;i<=n;i++)
        // {
        //     for(int j=1;j<=i;j++)
        //     {
        //         System.out.print("*");
            
        //     }
        //     System.out.println();
        // }
        //Ulta Pyramid 
        // for(int i =n;i>=1;i--)
        // {
        //     for(int j =1;j<=i;j++)
        //     {
        //         System.out.print("*");
            
        //     }
        //     System.out.println();
        // }
        //180 Degree Rotated Half Pyramid
        // for(int i =1;i<=n;i++)
        // {
        //     for(int j = 1;j<=n-i;j++)
        //     {
        //         System.out.print(" ");
        //     }
        //     for(int j = 1;j<=i;j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();

        // }
        //1121231234 pattern 
        // for(int i =1 ; i<=n;i++)
        // {
        //     for(int j=1 ; j<=i;j++)
        //     {
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }
        //Inverted Half Pyramid(1234123121)
        // for(int i = 1;i<=n;i++)
        // {
        //     for(int j = 1;j<=n-i+1;j++)
        //     {
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }
        //Floyd's Triangle
        // int no = 1;
        // for(int i = 1;i<=n;i++)
        // {
        //     for(int j=1;j<=i;j++)
        //     {
        //         System.out.print(no+" ");
        //         no++;
        //     }
        //     System.out.println();
        // }
        //0-1 Triangle
        // for(int i = 1;i<=n;i++)
        // {
        //     for(int j = 1;j<=i;j++)
        //     {
        //         if((i+j)%2==0)
        //         {
        //             System.out.print("1 ");
        //         }
        //         else
        //         {
        //             System.out.print("0 ");
        //         }
        //     }
        //     System.out.println();
        // }
        
    }
}

