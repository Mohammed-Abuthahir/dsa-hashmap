/* Given an array arr[] of integers, where most numbers occur an odd number of times, except for a few elements that appear an even number of times. Find and return the elements with even occurrences in the array.
If no such element exists, return -1.
Note: Elements should be returned in order of occurrence. */
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class Evenoccuringelement{
    public static int[] evenoccuring(int[] nums){
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        int count = 0;
        int[] arr = new int[nums.length];
        int i = 0;
        for(int key : map.keySet()){
            if(map.get(key)%2==0){
                arr[i++] = key;
                count++;
            }
        }
        if(count == 0){
            return new int[]{-1};
        }
        return Arrays.copyOf(arr,i);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        int[] result = evenoccuring(nums);
        System.out.println("Result :"+Arrays.toString(result));
    }
}