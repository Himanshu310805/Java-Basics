import java.util.*;
   //Basic Structure of Function
public class Functions{
    // public static void printMyName(String name)
    // {
    //     System.out.println(name);
    // }
    // public static void main(String asrgs[])
    // {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter your name: ");
    //     String name = sc.next();
    //     printMyName("My name is " +name);
    // }
    
    //add of two nos using function
    public static int calSum(int a , int b)
    {
        int sum = a+b;
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first no: ");
        int a = sc.nextInt();
        System.out.print("Enter second no: ");
        int b = sc.nextInt();
        int sum =calSum(a,b);
        System.out.println("The sum of two nos is: " + sum);
    }
}