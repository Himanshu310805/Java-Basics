import java.util.*;
public class Arrays{
    public static void main(String args[])
    {
        //declaration of array
        // int [] marks = new int[3];
        // //elements filling in array
        // marks[0] = 100;
        // marks[1] = 90;
        // marks[2] = 80;
        //printing array elements
        
        //System.out.println("Marks of student 1: " + marks);
        //the above statement will print the address of array not the elements of array
        //1st way to print array elements
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);   
        // System.out.println(marks[2]);
        
        //2nd way to print array elements
        // for(int i=0; i<marks.length; i++)
        // {
        //     System.out.println(marks[i]);
        // }   
        // 2nd method to declare and initialize array
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int  no [] = new int[size];
        //filling array elements
        for(int i =0;i<size;i++)
        {
            System.out.print("Enter the element at index " + i + ": ");
            no[i] = sc.nextInt();
        }
        //printing array elements
        for(int i =0;i<size;i++)
        {
            System.out.println("Element at index " + i + ": " + no[i]);
        }

        //Linear Search in array
        System.out.print("Enter the element to search: ");
        int x = sc.nextInt();
        int i;
        for(i = 0;i<size;i++)
        {
            if(no[i]==x)
            {
                System.out.println("Element found at index: " +i);
               break; 
            }
           
           
        }
         if(i==size)
            {
                System.out.println("Element not found");
            }
    }

}