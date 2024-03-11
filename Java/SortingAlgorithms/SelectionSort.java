import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            int min=i ;
            
            for(int j=i+1;j<arr.length;j++)
            {
                if (arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;


        }
    }

    public static void main(String[] args) {
        int[] arr={1,4,2,5};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
}
