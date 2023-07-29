import java.util.Scanner;

public class InsertionSort {

    public void sort(int[] arr)
    {
        for(int i=1; i<arr.length; i++)
        {
            int key = arr[i];
            int j = i -1;

            while(j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = key;
        }

        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insertion Sort");
        System.out.println("Enter the number of elements: ");
        int n = scan.nextInt();
        System.out.println("Insert the elements");

        int[] arr = new int[n];

        for(int i =0; i<n; i++)
        {
            arr[i] = scan.nextInt();
        }

        InsertionSort obj = new InsertionSort();

        System.out.println("Sorted Array: ");
        obj.sort(arr);
    }
}
