import java.util.Scanner;

public class SelectionSort {

    public void sort(int[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            int min_index = i;
            for(int j=i+1; j<arr.length; j++)
            {

                if(arr[j]<arr[min_index]) {
                    min_index = j;
                }
            }

            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }

        System.out.println("Sorted Array using Selection Sort: ");

        for(int i =0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Selection Sort");
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = scan.nextInt();

        System.out.println("Enter the elements: ");

        int[] arr = new int[n];

        for(int i=0; i<n; i++)
        {
            arr[i] = scan.nextInt();
        }

        SelectionSort obj = new SelectionSort();

        obj.sort(arr);
    }
}
