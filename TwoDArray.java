import java.util.*;
public class TwoDArray 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];
        // Filling the 2D array with user input
        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the element to search in the 2D array: ");
        int x = sc.nextInt();
        // Searching for the element in the 2D array
        // System.out.println("The 2D array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == x) {
                    System.out.println("Element found at position: (" + i + ", " + j + ")");
                    return;
                }
                // System.out.print(arr[i][j] + " ");
            }
            // System.out.println();
        }
        System.out.println("Element not found in the 2D array.");
    }
}
