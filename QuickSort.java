import java.util.*;
public class QuickSort {
    public static void main(String[] args) {
     System.out.println("******Thankyou coming for Quick Sort*******");
     System.out.println("It is used tp select the pivot elemnts to select the sort ");
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the array size : ");
      int size = sc.nextInt();
      int[] arr = new int[size];
      System.out.println("Enter the"+size+"elements : ");
      for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
      }
        Quick(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void Quick(int[] nums, int low, int high) {
        if (low >= high) {            
            return;                                 
        }
        int start = low;                             
        int end = high;                               
        int mid = start + (end - start) / 2;          
        int pivot = nums[mid];                       

        while (start <= end) {                        
            while (nums[start] < pivot) {            
                start++;
            }
            while (nums[end] > pivot) {
                end--;
            }
            if (start <= end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
        Quick(nums, low, end);
        Quick(nums, start, high);
    }
}
