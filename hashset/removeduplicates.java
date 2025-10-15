import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class removeduplicates{
    public static Set<Integer> duplicateelement(int[] nums){
        Set<Integer>set = new HashSet<>();
        for (int num : nums) {
            set.add(num); 
        }
        return set;
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
        Set<Integer> result = duplicateelement(nums);
        System.out.println("After Removing Duplicates :"+result);
    }
}