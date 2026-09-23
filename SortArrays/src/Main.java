import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] nums1 = {12, 11, 13, 5, 6, 7};
        insertionSortIncrease(nums1, nums1.length);
        System.out.println("Sorted Increase Array: " + Arrays.toString(nums1));
        insertionSortDecrease(nums1, nums1.length);
        System.out.println("Sorted Decrease Array: " + Arrays.toString(nums1));
    }
    //Insertion Sort
    public static void insertionSortIncrease(int[] nums, int n) {
        for(int i = 1; i < n; i++) {
            int key = nums[i]; // 11
            int j = i - 1; // 0
            while(j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }
    }
    public static void insertionSortDecrease(int[] nums, int n) {
        for(int i = 1; i < n; i++) {
            int key = nums[i]; // 11
            int j = i - 1; // 0
            while(j >= 0 && nums[j] < key) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }
    }
    //Selection Sort
    public static void selectionSortIncrease(int[] nums, int n) {
        for (int i = 0; i < n; i++) {
            int i_min = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[i_min]) {
                    i_min = j;
                }
            }
            swap(nums,i,i_min);
        }
    }
    public static void selectionSortDecrease(int[] nums, int n) {
        for (int i = 0; i < n; i++) {
            int i_max = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] > nums[i_max]) {
                    i_max = j;
                }
            }
            swap(nums,i,i_max);
        }
    }
    //Bubble Sort
    public static void bubbleSortIncrease(int[] nums, int n) {
        for(int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n -1; j++) {
                if(nums[j] > nums[j+1]) {
                    swap(nums,j,j+1);
                }
            }
        }
    }
    public static void bubbleSortDecrease(int[] nums, int n) {
        for(int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n -1; j++) {
                if(nums[j] < nums[j+1]) {
                    swap(nums,j,j+1);
                }
            }
        }
    }
    public static void swap(int []nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
