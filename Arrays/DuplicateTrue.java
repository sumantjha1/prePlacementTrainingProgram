package Arrays;

public class DuplicateTrue {

    /*
     * <
     *  **Q6.** Given an integer array nums, return true if any value appears at
     * least twice in the array, and return false if every element is distinct.
     ** 
     * Example 1:**
     * Input: nums = [1,2,3,1]
     * 
     * Output: true
     * 
     * 
     */

    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
            boolean f = false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    f= true;
                    break;
                }
            }
        }
        System.out.println(f);
    }

}
