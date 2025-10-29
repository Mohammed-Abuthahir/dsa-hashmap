// Given an array nums of positive integers of size N. Find all distinct digits present in nums.
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class Distinctdigitarray{
    public static int[] digits(int[] nums){
        int[] newArray = new int[nums.length+10];
        HashSet<Integer>set = new HashSet<>();
        int rem = 0;
        for(int i = 0;i<nums.length;i++){
            while(nums[i]>0){
                rem = nums[i]%10;
                set.add(rem);
                nums[i] = nums[i]/10;
            }
        }
        int i = 0;
        for(int num : set){
            newArray[i] = num;
            i++;
        }
        return Arrays.copyOf(newArray,i);
        
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
        int[] result = digits(nums);
        System.out.println(Arrays.toString(result));
    }
}