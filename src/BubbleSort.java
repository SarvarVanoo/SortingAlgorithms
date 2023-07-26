public class BubbleSort {

    public static int[] sort(int[] arr)
    {
        for(int i=0; i<arr.length - 1; i++)
        {
            int temp;
            boolean flag = false;
            for(int j=0; j< arr.length- i -1; j++)
            {
               if(arr[j]>arr[j+1]) {
                   temp= arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
                   flag = true;
               }
            }

            if(flag == false)
            {
                break;
            }
        }
        return arr;
    }

    public static void main(String[] args)
    {
        int[] arr = {36, 28, 100, 1, 2, 10};

        BubbleSort obj = new BubbleSort();

        arr = obj.sort(arr);

        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
